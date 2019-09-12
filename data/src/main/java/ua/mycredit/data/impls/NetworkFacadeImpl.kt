package ua.mycredit.data.impls

import android.content.Context
import com.google.gson.JsonSyntaxException
import io.reactivex.Completable
import io.reactivex.Maybe
import io.reactivex.Observable
import io.reactivex.Single
import org.joda.time.LocalDate
import ua.mycredit.core.*
import ua.mycredit.core.Payment
import ua.mycredit.data.*
import ua.mycredit.data.models.*
import ua.mycredit.data.net.AppServerSpec
import ua.mycredit.data.net.AppServerSpecCpa
import ua.mycredit.data.net.HeaderHolder
import java.io.File
import java.util.*
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NetworkFacadeImpl @Inject constructor(
        private val api: AppServerSpec,
        private val apiCPA: AppServerSpecCpa,
        private val context: Context
) : NetworkFacade {

    override fun profile(): Single<Profile> =
            api.profile()
                    .map { it.data }
                    .map(profileMapper)

    override fun history(): Single<List<Credit>> =
            api.history()
                    .safeUnwrap()
                    .map { it.data }
                    .map(historyMapper)
                    .onErrorResumeNext { e ->
                        when {
                            e.message == "Can't get last loan" -> Single.just(emptyList())
                            else -> Single.error<List<Credit>>(e)
                        }
                    }

    override fun currentCredit(): Maybe<Credit> =
            api.currentLoan()
                    .safeUnwrapContent()
                    .map(historyMapper)
                    .onErrorResumeNext { e ->
                        when {
                            e.message == "Can't get last loan" -> Single.just(emptyList())
                            else -> Single.error<List<Credit>>(e)
                        }
                    }
                    .flatMapMaybe { wrapperList ->
                        when {
                            wrapperList.isEmpty() -> Maybe.empty<Credit>()
                            else -> Maybe.just(wrapperList[0])
                        }
                    }

    override fun update(
            profile: Profile,
            dataProcessAllowed: Boolean,
            mailSubscription: Boolean
    ): Completable =
            updateProfileMapper(dataProcessAllowed, mailSubscription)
                    .invoke(profile)
                    .let(api::updateProfile)
                    .safeUnwrap()
                    .toCompletable()


    override fun signUp(phone: String, password: String): Completable =
            api.register(Register(phone, password))
                    .safeUnwrapContent()
                    .doOnSuccess { HeaderHolder.TOKEN.header = it!! }
                    .toCompletable()


    override fun login(phone: String, password: String): Completable =
            api.login(Credentials(phone, password))
                    .safeUnwrapContent()
                    .doOnSuccess { HeaderHolder.TOKEN.header = it!! }
                    .toCompletable()

    override fun sendPhoneOptions(phoneOptions: PhoneOptions): Completable =
            api.sendPhoneOptions(RequestPhoneOption(phoneOptions))
                    .safeUnwrap()
                    .toCompletable()

    override fun sendPhoneContacts(contacts: ArrayList<Contacts>): Completable =
            api.sendPhoneContacts(contacts)
                    .safeUnwrap()
                    .toCompletable()



    override fun requestResetPasswordSms(phone: String): Completable =
            api.sendPasswordResetRequest(Phone(phone))
                    .safeUnwrap()
                    .toCompletable()

    override fun resetPassword(phone: String, code: String, newPassword: String): Completable =
            api.resetPassword(ResetPassword(phone, code, newPassword))
                    .safeUnwrap()
                    .toCompletable()

    override fun checkPhoneRegistered(phone: String): Single<Boolean> =
            api.checkPhone(phone.toLocalPhone())
                    .safeUnwrap()
                    .map(checkMapper)

    override fun requestSms(phone: String): Completable =
            api.requestSms(RequestSms(phone.toLocalPhone()))
                    .safeUnwrap()
                    .toCompletable()

    override fun checkTINIsInBd(tin: String): Single<Boolean> =
            api.checkTin(tin)
                    .safeUnwrap()
                    .map(checkMapper)

    override fun verifySmsCode(phone: String, code: String): Single<Boolean> =
            api.checkSms(phone, code)
                    .safeUnwrap()
                    .map(checkMapper)

    override fun editPassword(current: String, new: String): Completable =
            api.changeCustomerPassword(ChangePassword(current, new))
                    .safeUnwrap()
                    .toCompletable()

    override fun getCards(): Single<List<Card>> =
            api.getAllCards()
                    .safeUnwrap()
                    .map(CardsResponse::data)
                    .map(cardMapper.asListMapper())

    override fun markAsMain(card: Card): Completable =
            api.makeCardMain(MakeCardMain(card.id))
                    .safeUnwrap()
                    .toCompletable()

    override fun addCard(card: Card) =
            with(card) {
                api.setCardDetails(SetCardDetails(number, mm, yy, cvv!!))
                        .safeUnwrap()
                        .map(SetCardDetailsResponse::data)
                        .map { card.copy(id = it.id) }
            }

    override fun deleteCard(card: Card): Single<Card> =
            api.deleteCard(card.id)
                    .safeUnwrap()
                    .map { card }

    override fun getCardVerificationResult(card: Card): Single<CardVerificationType> =
            api.getCardVerificationResult(card.id)
                    .safeUnwrap()
                    .map { it.data.verificationResult }
                    .flatMap {
                        when (it.cardIdentification) {

                            CardVerificationResultResponse.IS_3DS -> when {
                                it.verifiedURL.isNullOrEmpty() -> Automatically
                                else -> ByUrl(it.verifiedURL!!)
                            }.let { Single.just(it) }

                            CardVerificationResultResponse.NOT_3DS -> Single.just(BySms)
                            CardVerificationResultResponse.IN_PROGRESS -> Single.error(NetworkFacade.CardInProgressException())

                            else -> Single.error(NetworkFacade.InvalidCardIdentificationException())
                        }
                    }

    override fun validatePromoCode(promoCode: String): Single<Boolean> =
            api.validatePromoCode(promoCode)
                    .safeUnwrap()
                    .map { it.valid }


    override fun getCreditProducts(promoCode: String): Single<List<Product>> =
            api.getCreditProducts(promoCode)
                    .safeUnwrap()
                    .map(CreditProductsResponse::data)
                    .flatMapObservable { Observable.fromIterable(it) }
                    .map(creditProductMapper)
                    .map { it.copy(usePromo = promoCode.isNotEmpty()) }
                    .toList()

    override fun applyForLoan(amount: Float,
                              availableAmount: Float,
                              term: Int,
                              creditProductName: String,
                              promoCode: String): Single<String> =

        api.applyForLoan(ApplyForLoan(amount, availableAmount, term, creditProductName, promoCode))
                .safeUnwrap()
                .map(SetLoanIdResponse::data)
                .map { it.loanId }


    override fun creditAgreement(creditId: String): Single<File> =
            api.getCreditAgreement(creditId, 1)
                    .safeUnwrapContent()
                    .map { writeToDownloads(context.resources.getString(R.string.additional_agreement), it) }

    override fun acceptAgreement(creditId: String): Completable =
            api.acceptLoanAgreement(AcceptLoanAgreement(creditId))
                    .safeUnwrap()
                    .toCompletable()

    override fun prolongationAgreement(prolongationId: String, creditId: String): Single<File> =
            api.getRolloverLoanAgreement(prolongationId, creditId)
                    .safeUnwrapContent()
                    .map { writeToDownloads(context.resources.getString(R.string.additional_agreement), it) }

    override fun restructuringAgreement(restructuringId: String, creditId: String): Single<File> =
            api.getPreviousRestructureLoanAgreement(restructuringId, creditId, 1)
                    .safeUnwrapContent()
                    .map { writeToDownloads(context.resources.getString(R.string.additional_agreement), it) }


    override fun restructurings(credit: Credit): Single<List<Restructuring>> =
            api.previousResultOnRestructure(credit.id)
                    .safeUnwrapContent()
                    .map { it.map(restructuringMapper) }
                    .onErrorResumeNext { e ->
                        when (e) {
                            is JsonSyntaxException -> Single.just(emptyList())
                            else -> Single.error(e)
                        }
                    }

    override fun prolongationIfLoanRolloverAvailable(creditId: String): Maybe<Prolongation> =
            api.isLoanRolloverAvailable(creditId)
                    .safeUnwrapContent()
                    .flatMapMaybe {
                        when {
                            it.available -> Maybe.just(prolongationMapper(it))
                            else -> Maybe.empty()
                        }
                    }

    override fun isLoanCanBeFrontRolloved(creditId: String, rolloverDate: String): Single<Boolean> =
            api.isLoanCanBeFrontRolloved(creditId, rolloverDate)
                    .safeUnwrapContent()
                    .map { it.available }
                    .onErrorReturnItem(false)

    override fun prolong(credit: Credit, date: LocalDate): Completable =
            api.prolong(ApplyRollover(credit.id, "${date}T00:00:00"))
                    .safeUnwrapContent()
                    .toCompletable()

    override fun restructure(credit: Credit, restructuring: Restructuring): Completable =
            api.makeRestructure(Restrucutre(credit.id, restructuring.id))
                    .safeUnwrapContent()
                    .toCompletable()

    override fun getPaymentUrl(card: Card, amount: Double): Single<String> =
            api.makePaymentByCard(MakePaymentByCardRequest(card.id.toInt(), amount))
                    .safeUnwrapContent()
                    .flatMap {
                        when {
                            it.succeed -> Single.just(it.url)
                            else -> Single.error(NetworkFacade.PaymentFailsException())
                        }
                    }

    override fun getPotentialDebts(status: PastDue): Single<PastDue> =
            api.getSumFordays(status.credit.id)
                    .safeUnwrapContent()
                    .map { sumFordays ->
                        status.copy(
                                potentialDebts = PastDue.PotentialDebts(
                                        today = sumFordays.sumToday,
                                        tomorrow = sumFordays.sumTomorrow,
                                        inWeek = sumFordays.sumInWeek,
                                        inTwoWeek = sumFordays.sumInTwoWeek
                                )
                        )
                    }

    override fun getLastPayment(creditId: String): Maybe<Payment> =
            api.getAllPayments(creditId)
                    .safeUnwrapContent()
                    .onErrorReturnItem(emptyList())
                    .map(paymentMapper.asListMapper())
                    .flatMapMaybe { payments ->
                        when {
                            payments.isEmpty() -> Maybe.empty<Payment>()
                            else -> Maybe.just(payments.last())
                        }
                    }

    override fun sendCPAData(cpa: String, creditId: String, repeater: String, operation: String, promo: String): Completable =
            apiCPA.sendCPA(CPA(cpa, creditId, repeater, operation, promo))
                .safeUnwrap()
                .toCompletable()

}
