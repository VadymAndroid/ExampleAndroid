package ua.mycredit.core

import io.reactivex.Completable
import io.reactivex.Maybe
import io.reactivex.Single
import org.joda.time.DateTime
import org.joda.time.LocalDate
import java.io.File
import java.util.*

interface Logouter {
    val loggedIn: Boolean
    fun logout()
}

interface LocalStorage {

    var onboardingShown: Boolean
    var moneyNoteShown: Boolean
    var daysNoteShown: Boolean

    var profile: Profile

    var agreementTime: DateTime

    var creditPreferences: CreditPreferences
    var promoCode: String

    @get:Deprecated("Use ProductRepo instance to retrieve actual credit product")
    var creditProduct: ExpirableValue<Product?>

    var mailSubscription: Boolean
    var dataProcessAllowed: Boolean

    var cards: ExpirableValue<List<Card>>
    var selectedCard: Card?

    var history: ExpirableValue<List<Credit>>


    data class ExpirableValue<T>(
            val value: T,
            val expired: Boolean = true
    )
}


interface NetworkFacade {

    fun login(phone: String, password: String): Completable
    fun signUp(phone: String, password: String): Completable
    fun sendPhoneOptions(phoneOptions: PhoneOptions): Completable
    fun sendPhoneContacts(contacts: ArrayList<Contacts>): Completable

    fun requestResetPasswordSms(phone: String): Completable
    fun resetPassword(phone: String, code: String, newPassword: String): Completable

    fun checkPhoneRegistered(phone: String): Single<Boolean>
    fun requestSms(phone: String): Completable

    fun checkTINIsInBd(tin: String): Single<Boolean>
    fun verifySmsCode(phone: String, code: String): Single<Boolean>

    @Deprecated("Use ProfileRepo instead of this method")
    fun update(profile: Profile, dataProcessAllowed: Boolean, mailSubscription: Boolean): Completable

    fun history(): Single<List<Credit>>
    fun currentCredit(): Maybe<Credit>

    @Deprecated("Use ProfileRepo instead of this method")
    fun profile(): Single<Profile>

    fun editPassword(current: String, new: String): Completable

    fun getCards(): Single<List<Card>>
    fun markAsMain(card: Card): Completable
    fun addCard(card: Card): Single<Card>
    fun deleteCard(card: Card): Single<Card>
    fun getCardVerificationResult(card: Card): Single<CardVerificationType>

    fun validatePromoCode(promoCode: String): Single<Boolean>
    fun getCreditProducts(promoCode: String): Single<List<Product>>
    fun applyForLoan(amount: Float,
                     availableAmount: Float,
                     term: Int,
                     creditProductName: String,
                     promoCode: String): Single<String>

    fun creditAgreement(creditId: String): Single<File>
    fun acceptAgreement(creditId: String): Completable

    fun prolongationAgreement(prolongationId: String, creditId: String): Single<File>
    fun restructuringAgreement(restructuringId: String, creditId: String): Single<File>

    fun restructurings(credit: Credit): Single<List<Restructuring>>

    fun prolongationIfLoanRolloverAvailable(creditId: String): Maybe<Prolongation>
    fun isLoanCanBeFrontRolloved(creditId: String, rolloverDate: String): Single<Boolean>

    fun prolong(credit: Credit, date: LocalDate): Completable
    fun restructure(credit: Credit, restructuring: Restructuring): Completable

    fun getPaymentUrl(card: Card, amount: Double): Single<String>

    fun getPotentialDebts(status: PastDue): Single<PastDue>

    fun getLastPayment(creditId: String): Maybe<Payment>

    class InvalidCardIdentificationException : Exception()
    class CardInProgressException : Exception()

    class PaymentFailsException : Exception()

    fun sendCPAData(cpa: String, creditId: String, repeater: String, operation: String, promo: String): Completable
}
