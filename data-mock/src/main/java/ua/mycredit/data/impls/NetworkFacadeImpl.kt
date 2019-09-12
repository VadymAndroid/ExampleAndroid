package ua.mycredit.data.impls

import io.reactivex.Completable
import io.reactivex.Maybe
import io.reactivex.Observable
import io.reactivex.Single
import org.joda.time.LocalDate
import ua.mycredit.core.*
import java.io.File
import java.util.*
import java.util.concurrent.TimeUnit
import javax.inject.Inject
import javax.inject.Singleton
import kotlin.collections.ArrayList

@Singleton
class NetworkFacadeImpl @Inject constructor() : NetworkFacade {

    private val random = Random()

    private var cards = listOf(
            Card("5000********9876", "10", "19", "123", true, false, "1"),
            Card("4000********5234", "03", "21", "123", false, false, "2"),
            Card("5100********1234", "10", "21", "123", false, false, "3")
    )

    override fun profile(): Single<Profile> = Single.just(
            Profile("+380666666666", "oleg.petrov@gmail.com",
                    "Олег", "Петров", "Иванович",
                    "1990-08-05", "",
                    MaritalStatus.Married, Education.Graduate,
                    "1234567891",
                    Passport("ЕА", "123456", "Харьковским", LocalDate.now().toString(), "", ""),
                    Address("", "Харьковская", "Харьков", "Улица", "20"),
                    null,
                    OccupationType.NOT_WORKING,
                    IncomeMainSource.PENSION,
                    1500,
                    Company("ООО Петров", "380666666666")
                    , null,
                    ActivityKind.LAW,
                    Position.WORKER,
                    GroupDisability.NOT_INDICATED,
                    ReasonDismissal.LowSalary,
                    null,
                    FamilyExpense.MORE_FIVE,
                    PaymentsAmountOnLoans.MORE_TWO,
                    LoanPurpose.CAR_MAINTENANCE)
    )

    override fun history(): Single<List<Credit>> {
        val loan = Credit(
                id = "1",
                publicId = "100",
                status = 8,
                currentDebt = 1550.3,
                amount = 1004.0,
                outstandingBalance = 1000.0,
                term = 10,
                currentInterest = 215.0
        )

        return delayedSingle(listOf(loan), DEFAULT_DELAY)
    }

    override fun currentCredit(): Maybe<Credit> =
            history().map { it[0] }.toMaybe()

    override fun update(profile: Profile, dataProcessAllowed: Boolean, mailSubscription: Boolean): Completable =
            delayedCompletable()

    override fun sendPhoneOptions(phoneOptions: PhoneOptions): Completable =
        delayedCompletable()

    override fun signUp(phone: String, password: String): Completable =
            delayedCompletable()

    override fun login(phone: String, password: String): Completable =
            when (phone) {
                "+380666666666" -> delayedCompletable()
                else -> Completable.error(Exception("WrongNuException"))
            }

    override fun requestResetPasswordSms(phone: String): Completable =
            delayedCompletable()

    override fun resetPassword(phone: String, code: String, newPassword: String): Completable =
            delayedCompletable()

    override fun checkPhoneRegistered(phone: String): Single<Boolean> =
            delayedSingle(false)

    override fun requestSms(phone: String): Completable =
            delayedCompletable()

    override fun checkTINIsInBd(tin: String): Single<Boolean> =
            delayedSingle(false)

    override fun verifySmsCode(phone: String, code: String): Single<Boolean> =
            delayedSingle(true)

    override fun editPassword(current: String, new: String): Completable = delayedCompletable()

    override fun getCards(): Single<List<Card>> =
            delayedSingle(cards)

    override fun markAsMain(card: Card): Completable {
        cards = cards.toMutableList().apply {
            val pos = indexOf(card)

            set(0, get(0).copy(main = false))
            set(pos, get(pos).copy(main = true))

            Collections.swap(this, 0, pos)
        }

        return Completable.complete()
    }

    override fun addCard(card: Card): Single<Card> {
        if (cards.none { it.number == card.number }) {
            cards += card
        }
        return delayedSingle(card)
    }

    override fun deleteCard(card: Card): Single<Card> =
            delayedSingle(card).also { cards -= card }

    override fun validatePromoCode(promoCode: String): Single<Boolean> = Single.just(true)

    override fun getCreditProducts(promoCode: String): Single<List<Product>> =
            when {

                promoCode.isEmpty() ->
                    listOf(Product("Students", (400..8000), (10..50), 0.02f),
                            Product("MaxiCredit", (100..1000), (1..30), 0.0053f, default = true))

                else -> listOf(
                        Product("SUUUP", (10000..100000), (1..30), 0.0053f, default = true)
                )

            }.let { delayedSingle(it) }

    override fun getCardVerificationResult(card: Card): Single<CardVerificationType> =
            delayedSingle<CardVerificationType>(ByUrl("https://mycredit.ua/"))
                    .apply {
                        cards -= card
                        cards += card.copy(verified = true)
                    }

    override fun creditAgreement(creditId: String): Single<File> {
        TODO("not implemented")
    }

    override fun acceptAgreement(creditId: String): Completable {
        TODO("not implemented")
    }

    override fun prolongationAgreement(prolongationId: String, creditId: String): Single<File> {
        TODO("not implemented")
    }

    override fun sendPhoneContacts(contacts: java.util.ArrayList<Contacts>): Completable {
        TODO("not implemented")
    }

    override fun sendCPAData(cpa: String, creditId: String, repeater: String, operation: String, promo: String): Completable {
        TODO("not implemented")
    }

    override fun prolong(credit: Credit, date: LocalDate): Completable = delayedCompletable()

    override fun applyForLoan(
            amount: Float,
            availableAmount: Float,
            term: Int,
            creditProductName: String,
            promoCode: String
    ): Single<String> {
        TODO("not implemented")
    }

    override fun restructurings(credit: Credit): Single<List<Restructuring>> =
            listOf(
                    Restructuring(
                            "1",
                            45,
                            14,
                            true,
                            listOf(Restructuring.ScheduleItem(LocalDate.now().minusWeeks(1), credit.amount / 2),
                                    Restructuring.ScheduleItem(LocalDate.now().minusWeeks(2), credit.amount / 2)))
            ).let {
                Single.just(it)
            }

    override fun prolongationIfLoanRolloverAvailable(creditId: String): Maybe<Prolongation> =
            Maybe.just(Prolongation(2, discount = 15))

    override fun isLoanCanBeFrontRolloved(creditId: String, rolloverDate: String): Single<Boolean> =
            delayedSingle(false)

    override fun getLastPayment(creditId: String): Maybe<Payment> =
            delayedCompletable()
                    .toMaybe()

    override fun restructure(credit: Credit, restructuring: Restructuring): Completable = delayedCompletable()

    override fun getPaymentUrl(card: Card, amount: Double): Single<String> = Single.just("https://mycredit.ua/ru/")

    override fun getPotentialDebts(status: PastDue): Single<PastDue> =
            delayedSingle(
                    status.copy(potentialDebts = PastDue.PotentialDebts(
                            103.0,
                            117.0,
                            141.0,
                            195.5))
            )

    override fun restructuringAgreement(restructuringId: String, creditId: String): Single<File> =
            Single.error(Exception())

    private fun <T> delayedSingle(t: T, delaySeconds: Long = DEFAULT_DELAY) =
            delayedCompletable(delaySeconds).toSingleDefault(t)

    private fun delayedCompletable(delaySeconds: Long = DEFAULT_DELAY) =
            Observable.interval(delaySeconds, TimeUnit.SECONDS)
                    .firstOrError()
                    .toCompletable()

    private fun randomDigit() = '0' + Random().nextInt(10)


    companion object {
        const val DEFAULT_DELAY = 1L
    }
}
