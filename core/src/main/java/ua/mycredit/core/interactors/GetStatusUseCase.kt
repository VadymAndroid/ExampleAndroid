package ua.mycredit.core.interactors

import io.reactivex.Observable
import io.reactivex.Single
import org.joda.time.DateTime
import org.joda.time.Days
import org.joda.time.LocalDate
import org.joda.time.Minutes
import ua.mycredit.core.*
import java.util.*
import java.util.concurrent.TimeUnit
import javax.inject.Inject


class GetStatusUseCase @Inject constructor(
        private val productRepo: ProductRepo
) : UseCase.SimpleUseCase<Status>() {

    override fun buildObservable(params: Nothing?): Observable<Status> =
            computeStatus()
                    .flatMapObservable(::statusUpdates)
                    .retry(10) { e -> e !is RuntimeException }

    private fun statusUpdates(it: Status) =
            computeStatus()
                    .delaySubscription(
                            15L.takeIf { appMetaData.debug } ?: TimeUnit.MINUTES.toSeconds(1),
                            TimeUnit.SECONDS
                    )
                    .repeat()
                    .toObservable()
                    .startWith(it)

    private fun computeStatus() =
            networkFacade.currentCredit()
                    .flatMapSingle { credit ->
                        computeMyCreditStatus(credit) ?: makeNoCreditsStatus(credit)
                    }
                    .onErrorResumeNext { e ->
                        when (e) {
                            is NoSuchElementException -> makeNoCreditsStatus(null)
                            else -> Single.error(e)
                        }
                    }

    private fun computeMyCreditStatus(credit: Credit?) = when (credit?.status) {
        AUTO_PROCESSING_0,
        AUTO_PROCESSING_1,
        AUTO_PROCESSING_2,
        AUTO_PROCESSING_3,
        AUTO_PROCESSING_21 -> AutoProcessing(credit)
        WAITING_FOR_APPROVAL -> WaitingForApproval(credit)
        APPROVED -> Approved(Minutes.minutesBetween(DateTime.now(), credit.creationDate).minutes, credit)
        REJECTED -> credit.makeCreditStatusIfTimeAllows(Rejected.TOTAL_BAN_DAYS) { Rejected(credit, Rejected.TOTAL_BAN_DAYS - it) }
        ACTIVE -> Active(credit)
        PAST_DUE -> PastDue(credit)
        CLOSED_REPAID,
        CLOSED_WRITTEN_OFF -> credit.makeCreditStatusIfTimeAllows(daysCount = 1) { Closed(credit) }
        PENDING_PROLONGATION -> PendingProlongation(credit)
        RESTRUCTURED -> Restructured(credit)
        DISBURSEMENT_FAILED,
        WRONG_CARD_DISBURSEMENT_FAILED -> DisbursementFailed(credit)
        DISBURSEMENT_IN_PROGRESS -> DisbursementInProgress(credit)
        WAITING_FOR_AGREEMENT -> WaitingForAgreement(credit = credit)
        AGREEMENT_EXPIRED -> credit.makeCreditStatusIfTimeAllows(5) { AgreementExpired(credit) }
        NO_CONTACT -> credit.makeCreditStatusIfTimeAllows(3) { NoContact(credit) }
        SOLD -> Sold()
        REJECT_UNPROCESSED_LOANS -> RejectUnprocessedLoans(credit)
        null -> null
        else -> WaitingForApproval(credit)
    }?.let {
        when (it) {
            is PastDue -> networkFacade.getPotentialDebts(it)
            else -> Single.just(it)
        }
    }

    private fun Credit.makeCreditStatusIfTimeAllows(daysCount: Int, make: (days: Int) -> Status): Status? {


        val (daysBetween, allowed) = when {

            appMetaData.debug -> 1 to (Minutes.minutesBetween(creationDate, DateTime.now()).minutes < 3)

            else -> {
                Days.daysBetween(
                        closeDate?.toDateTimeAtStartOfDay() ?: creationDate,
                        DateTime.now()
                ).days.let { daysBetween ->
                    daysBetween to (daysBetween < daysCount)
                }
            }
        }

        return when {
            allowed -> make(daysBetween)
            else -> null
        }
    }

    private fun makeNoCreditsStatus(previous: Credit?) =
            productRepo.get()
                    .retry { e -> e is ProductRepo.WrongPromoCodeException }
                    .map {
                        NoCredits(
                                lastAmount = previous?.amount?.toInt() ?: 0,
                                amount = it.amount.last.toDouble(),
                                finishDate = LocalDate.now().plusDays(it.term.last)
                        )
                    }
}
