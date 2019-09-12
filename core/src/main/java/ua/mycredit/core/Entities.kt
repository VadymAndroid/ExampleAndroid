package ua.mycredit.core

import org.joda.time.DateTime
import org.joda.time.Days
import org.joda.time.LocalDate
import ua.mycredit.core.IncomeMainSource.*
import java.io.Serializable
import kotlin.math.max

enum class ProgressPercentage { INITIAL, TWENTY, FORTY, SIXTY, EIGHTY, NINETY_NINE }

data class Profile constructor(

        // Contacts
        val phone: String = "",
        val email: String = "",

        // Personal
        val name: String = "",
        val surname: String = "",
        val patronymic: String = "",
        val birthDayIso: String? = null,
        val facebookUrl: String = "",

        val maritalStatus: MaritalStatus? = null,
        val education: Education? = null,

        // Passport
        val tin: String = "",
        val passport: Passport = Passport(),

        //Address
        val addressActual: Address = Address(),
        val addressRegister: Address? = null,

        val occupationType: OccupationType? = null,
        val incomeSource: IncomeMainSource? = null,
        val monthlyIncome: Int = 0,

        val company: Company? = null,
        val phoneOptions: PhoneOptions? = null,
        val activityKind: ActivityKind? = null,
        val position: Position? = null,

        val disability: GroupDisability? = null,

        val dismissalReason: ReasonDismissal = ReasonDismissal.Unknown,

        val studentParams: StudentParams? = null,

        val familyExpense: FamilyExpense? = null,
        val paymentsAmountOnLoans: PaymentsAmountOnLoans? = null,
        val loanPurpose: LoanPurpose? = null,

        val synched: Boolean = false,
        val signUpFlow: Boolean = false,
        val dataProcessAllowed: Boolean = false
) {
    val liveInRegister get() = addressRegister == null
    val fullName get() = "$name $surname"

    val isPersonalInfoValid: Boolean
        get() = isContactValid && isPersonalValid && passport.isValid && isAddressValid

    val isAddressValid
        get() = addressActual.isValid.takeIf { addressRegister == null }
                ?: (addressActual.isValid && addressRegister!!.isValid)

    val isOccupationInfoValid: Boolean
        get() = isOccupationValid && isFinanceValid

    val birthDay get() = birthDayIso?.toLocalDate() // Must be computable: Hawk issues

    private val isContactValid: Boolean
        get() = maritalStatus != null && education != null

    private val isPersonalValid: Boolean
        get() = name.isNotEmpty() && surname.isNotEmpty() && patronymic.isNotEmpty() && !(birthDayIso.isNullOrEmpty()) && tin.isNotEmpty()

    private val isOccupationValid: Boolean
        get() = occupationType != null &&
                incomeSource != null &&
                ((monthlyIncome != 0).takeIf { incomeSource.withMonthlyIncome } ?: true)

    private val isFinanceValid: Boolean
        get() = familyExpense != null && paymentsAmountOnLoans != null && loanPurpose != null
}


data class Passport(
        val series: String = "",
        val number: String = "",
        val givenBy: String = "",
        val issuedIso: String? = null,
        val idCardRecord: String = "",
        val idCardDocNumber: String = "",
        val idCardExpiredIso: String? = null
) {

    val issued: LocalDate? get() = issuedIso?.toLocalDate()
    val idCardExpired: LocalDate? get() = idCardExpiredIso?.toLocalDate()

    val type get() = PassportType.NEW.takeIf { idCardRecord.isNotEmpty() } ?: PassportType.OLD
    val passport
        get() = "$series$number".takeIf { type == PassportType.OLD }
                ?: "$idCardRecord$idCardDocNumber"

    val isValid
        get() =
            when (type) {

                PassportType.OLD ->
                    series.isNotEmpty() &&
                            number.isNotEmpty() &&
                            givenBy.isNotEmpty() &&
                            issuedIso != null

                else -> idCardRecord.isNotEmpty() &&
                        idCardDocNumber.isNotEmpty() &&
                        givenBy.isNotEmpty() &&
                        issuedIso != null &&
                        idCardExpiredIso != null
            }
}

data class Address(
        val address: String = "",
        val region: String = "",
        val city: String = "",
        val street: String = "",
        val house: String = "",
        val housing: String = "",
        val apartment: String = ""
) {

    val isValid get() = city.isNotEmpty() && street.isNotEmpty() && house.isNotEmpty()
}

data class Company(
        val name: String = "",
        val phoneNumber: String = "")

data class StudentParams(
        val schoolName: String,
        val facultySpec: SpecializationFaculty?,
        val educationDegree: QualificationAfterGraduation?,
        val studentId: String
)

data class Credit constructor(
        val id: String,
        val publicId: String,
        val status: Int,
        val currentDebt: Double,
        val amount: Double,
        val outstandingBalance: Double,
        val term: Int,
        val amountOriginal: Double = 0.0,
        val termOriginal: Int = 10,
        val nextPaymentAmount: Double = 0.0,
        val nextPaymentDateIso: String? = null,
        val creationDateIso: String = DateTime.now().toString(),
        val disbursementDateIso: String? = null,
        val finishDateIso: String? = null,
        val closeDateIso: String? = null,
        val schedules: List<Schedule> = emptyList(),
        val schedulesRestructure: List<Schedule> = emptyList(),
        val pastDueDays: Int = 1,
        val currentInterest: Double = 0.0,
        val currentOverdueInterest: Double = 0.0
) : Serializable {

    val daysToFinish
        get() = Days.daysBetween(
                LocalDate.now(),
                finishDate ?: LocalDate.now()
        ).run { max(days, 0) }

    val prolongationAmount get() = currentInterest + currentOverdueInterest

    val creationDate: DateTime get() = creationDateIso.toDateTime()
    val disbursementDate: LocalDate? get() = disbursementDateIso?.toLocalDate()
    val finishDate: LocalDate? get() = finishDateIso?.toLocalDate()
    val closeDate: LocalDate? get() = closeDateIso?.toLocalDate()
}


sealed class ContractAddition : Serializable {

    abstract val id: String
    abstract val days: Int
    abstract val discount: Int

    override fun hashCode() = id.hashCode()

    override fun equals(other: Any?) =
            other is ContractAddition
                    && other.id == id
                    && other.javaClass == javaClass
}


data class Prolongation(
        override val days: Int = 0,
        override val id: String = "",
        override val discount: Int = 0,
        val lastDayIso: String = "",
        val state: State = State.INTEREST_PAYMENT_WAITING
) : ContractAddition() {

    val lastDay: LocalDate
        get() =
            lastDayIso.takeIf(String::isNotEmpty)
                    ?.toLocalDate()
                    ?: LocalDate.now().plusDays(days)

    enum class State {
        INTEREST_PAYMENT_WAITING,
        PAYMENT_IN_PROGRESS,
        DATE_SELECTABLE
    }
}


data class Restructuring(
        override val id: String,
        override val discount: Int,
        override val days: Int,
        val active: Boolean,
        val schedule: List<ScheduleItem>
) : ContractAddition() {

    data class ScheduleItem(
            val finishDate: LocalDate,
            val amount: Double
    )
}


data class Schedule constructor(
        val restructurePartAmount: Double,
        val closed: Boolean = false,
        val dueDateIso: String = LocalDate.now().toString(),
        val total: Int = 0,
        val interest: Int = 0,
        val principal: Int = 0,
        val fees: Int = 0
) : Serializable {

    val dueDate: LocalDate get() = dueDateIso.toLocalDate()
}


data class Card(
        val number: String,
        val mm: String,
        val yy: String,
        val cvv: String? = null,
        val verified: Boolean = false,
        val main: Boolean = false,
        val id: String = "",
        val paymentSystem: PaymentSystem? = null
) : Serializable {

    enum class PaymentSystem {
        VISA, MASTERCARD
    }
}

sealed class CardVerificationType

object BySms : CardVerificationType()
object Automatically : CardVerificationType()
data class ByUrl(val url: String) : CardVerificationType()

data class PhoneOptions(
        val Imei: String = "",
        val PhoneNumber: String= "",
        val Platform: Int = 0,
        val Operator: String= "",
        val VersionName: String= "",
        val IpAddress: String
)


data class Contacts(
        var Name: String = "",
        var PhoneNumber: String = ""
)


enum class ActivityKind(val value: Int) {
    MILITARY_CONTRACT(19),
    CIVIL_SERVICE(20),
    IT(18),
    ART(21),
    MEDICINE(22),
    EDUCATION(23),
    PRODUCTION(24),
    LAW_ENFORCEMENT_AGENCIES(25),
    SERVICE(26),
    BUILDING(27),
    TRADING(28),
    TRANSPORT(29),
    FINANCE(15),
    LAW(7)
}

fun Int.getActivityKind(): ActivityKind? = ActivityKind.values().find { it.value == this }

enum class Position {
    DEPUTY,
    OTHER_DEPUTY,
    SPECIALIST,
    WORKER,
    SUPPORT,
    HEAD
}

enum class FamilyExpense {
    LESS_ONE,
    UP_TO_TWO_AND_HALF,
    UP_TO_FIVE,
    MORE_FIVE
}

enum class PaymentsAmountOnLoans {
    ZERO,
    UP_TO_ONE,
    UP_TO_TWO,
    MORE_TWO
}

enum class LoanPurpose(val value: Int) {
    REPAY_OTHER_LOAN(1),
    CAR_MAINTENANCE(3),
    TRAVEL_OR_LEISURE(4),
    ENTERTAINMENT_OR_FUN(5),
    JUST_DO_NOT_HAVE_ENOUGH_MONEY(6),
    FAMILY_OR_CHILDREN_EXPENSES(7),
    DO_NOT_WANT_TO_ANSWER(8),
    MEDICATION(10),
    HOUSING_RENOVATION(11),
    OTHER_VARIANT(9)
}

fun Int.getLoanPurpose(): LoanPurpose? = LoanPurpose.values().find { it.value == this }

class ParamsRequirements(
        private val occupationType: OccupationType,
        private val incomeSource: IncomeMainSource?
) {

    val withCompany get() = occupationType.withCompany || incomeSource?.withCompany ?: false
    val withActivity get() = occupationType.withActivity || incomeSource?.withActivity ?: false
    val withMonthlyIncome get() = incomeSource?.withMonthlyIncome ?: true

    companion object {

        @JvmStatic
        fun check(occupationType: OccupationType, incomeSource: IncomeMainSource?) =
                ParamsRequirements(occupationType, incomeSource)
    }
}

enum class IncomeMainSource(
        val value: Int,
        val withCompany: Boolean = false,
        val withActivity: Boolean = false,
        val withMonthlyIncome: Boolean = true) {
    SCHOLARSHIP(1),
    PENSION(2),
    SOCIAL_HELP(3),
    CHILD_BENEFIT(4),
    UNEMPLOYMENT_BENEFIT(5),
    HELP_FROM_RELATIVES(6),
    SALARY(8, withCompany = true, withActivity = true),
    NO_INCOME(9, withMonthlyIncome = false),
    INCOME_FROM_RENT_OR_DEPOSIT(11),
    INCOME_FROM_BUSINESS_ACTIVITIES(12)
}

fun Int.getIncomeMainSource(): IncomeMainSource? = IncomeMainSource.values().find { it.value == this }

enum class OccupationType(vararg val incomeSources: IncomeMainSource) {
    WORKING(
            HELP_FROM_RELATIVES,
            SALARY,
            INCOME_FROM_RENT_OR_DEPOSIT
    ) {
        override val withCompany = true
        override val withActivity = true
    },
    BUSINESSMAN(
            HELP_FROM_RELATIVES,
            SALARY,
            INCOME_FROM_RENT_OR_DEPOSIT,
            INCOME_FROM_BUSINESS_ACTIVITIES
    ) {
        override val withActivity = true
    },
    NOT_WORKING(
            UNEMPLOYMENT_BENEFIT,
            HELP_FROM_RELATIVES,
            NO_INCOME,
            INCOME_FROM_RENT_OR_DEPOSIT
    ),
    STUDENT(
            SCHOLARSHIP,
            HELP_FROM_RELATIVES,
            SALARY,
            NO_INCOME,
            INCOME_FROM_RENT_OR_DEPOSIT
    ),
    PENSIONER(
            PENSION,
            HELP_FROM_RELATIVES,
            SALARY,
            NO_INCOME,
            INCOME_FROM_RENT_OR_DEPOSIT
    ),
    INVALID(
            PENSION,
            SOCIAL_HELP,
            HELP_FROM_RELATIVES,
            SALARY,
            NO_INCOME,
            INCOME_FROM_RENT_OR_DEPOSIT
    ),
    HOUSEWIFE(
            HELP_FROM_RELATIVES,
            NO_INCOME,
            INCOME_FROM_RENT_OR_DEPOSIT
    ),
    DECREE(
            CHILD_BENEFIT,
            HELP_FROM_RELATIVES,
            NO_INCOME,
            INCOME_FROM_RENT_OR_DEPOSIT
    ),
    TEMPORARILY_NOT_WORKING(
            SOCIAL_HELP,
            UNEMPLOYMENT_BENEFIT,
            HELP_FROM_RELATIVES,
            NO_INCOME,
            INCOME_FROM_RENT_OR_DEPOSIT
    );

    open val withCompany: Boolean get() = false
    open val withActivity: Boolean get() = false
}

enum class SpecializationFaculty {
    Unknown,
    Warfare,
    HumanitarianSciences,
    Medicine,
    FoodAndLightIndustry,
    Law,
    NaturalSciences,
    Building,
    TechnicalScience,
    ExactSciences,
    EconomyAndBusiness,
    Other
}

enum class QualificationAfterGraduation {
    JuniorSpecialist,
    Bachelor,
    Specialist,
    Master
}

enum class ReasonDismissal {
    Unknown,
    Reduction,
    LowSalary,
    WithoutSalary,
    DoNotLikeTheWork,
    NotSuitableWorkingConditions,
    FarReach,
    DismissedForBreachOfDiscipline
}

enum class GroupDisability {
    NOT_INDICATED, FIRST, SECOND, THIRD
}

enum class PassportType {
    Unknown,
    OLD,
    NEW
}


enum class MaritalStatus {
    Married,
    Single,
    Divorced,
    Widower,
    Civilmarriage
}

enum class Education {
    HalfBase,
    Secondary,
    HalfHigher,
    Higher,
    SecondHigherPhD,
    Graduate
}

data class CreditPreferences(
        val loan: Int = DEF_MONEY,
        val days: Int = DEF_DAYS
) {
    companion object {
        const val DEF_MONEY = 1000
        const val DEF_DAYS = 14
    }
}

data class Product(
        val name: String = "",
        val amount: IntRange = IntRange(MIN_LOAN_VAL, MAX_LOAN_VAL),
        val term: IntRange = IntRange(MIN_DAYS_VAL, MAX_DAYS_VAL),
        val rate: Float = FIRST_MONEY_DAY_RATE,
        val default: Boolean = false,
        val usePromo: Boolean = false,
        val promoCode: String = "",
        val isForCPA: Boolean = false
) {

    companion object {
        const val MIN_LOAN_VAL = 100
        const val MAX_LOAN_VAL = 4000
        const val MIN_DAYS_VAL = 1
        const val MAX_DAYS_VAL = 30
        const val FIRST_MONEY_DAY_RATE = 0.0001f
        const val USUAL_PERCENT = 0.016f
    }
}

sealed class Status(
        open val progressStep: Int = 0,
        open val progressStepsTotal: Int = 100,
        val action: CreditStatusAction = CreditStatusAction.PICK_UP_LOAN,
        open val credit: Credit? = null,
        val amount: Double = credit?.amount ?: 0.0
) {

    open val finishDate: LocalDate? get() = credit?.finishDate
}


val Status?.canProlong get() = this is Active || this is PastDue

class NoCredits(
        val lastAmount: Int,
        amount: Double,
        val nextAmount: Int = (amount * 1.5).toInt(),
        override val finishDate: LocalDate
) : Status(
        progressStep = lastAmount,
        progressStepsTotal = nextAmount,
        amount = amount
)

class AutoProcessing(credit: Credit) : Status(credit = credit, progressStep = 50)


class WaitingForApproval(credit: Credit) : Status(
        progressStep = 70,
        credit = credit
)


class WaitingForAgreement(credit: Credit) : Status(
        progressStep = 90,
        action = CreditStatusAction.READ_CONTRACT,
        credit = credit
)


class Rejected(
        credit: Credit,
        daysToUnlock: Int
) : Status(
        progressStep = daysToUnlock,
        progressStepsTotal = TOTAL_BAN_DAYS,
        credit = credit) {

    val unlockDate: LocalDate = LocalDate.now().plusDays(daysToUnlock)

    companion object {
        const val TOTAL_BAN_DAYS = 20
    }
}


class NoContact(credit: Credit) : Status(credit = credit)

class RejectUnprocessedLoans(credit: Credit) : Status(credit = credit)


class Approved(
        minutes: Int,
        credit: Credit
) : Status(
        progressStep = minutes,
        progressStepsTotal = max(10, minutes),
        credit = credit
)


class DisbursementInProgress(credit: Credit) : Status(100, credit = credit)


class DisbursementFailed(credit: Credit) : Status(credit = credit)


class Active(override val credit: Credit) : Status(
        progressStep = credit.amount.toInt(),
        progressStepsTotal = (credit.amount * 1.5).toInt(),
        action = CreditStatusAction.REPAY,
        amount = credit.outstandingBalance
)

data class PastDue constructor(
        override val credit: Credit,
        val potentialDebts: PotentialDebts = PotentialDebts()
) : Status(
        progressStep = credit.pastDueDays,
        progressStepsTotal = MAX_PAST_DUE,
        action = CreditStatusAction.REPAY,
        amount = credit.outstandingBalance
) {
    val daysToSale get() = max(progressStepsTotal - progressStep, 0)

    data class PotentialDebts(
            val today: Double = 0.0,
            val tomorrow: Double = 0.0,
            val inWeek: Double = 0.0,
            val inTwoWeek: Double = 0.0
    )

    companion object {
        const val MAX_PAST_DUE = 14
    }
}


class Sold(val creditorPhone: String? = null) : Status(1, 1)


class PendingProlongation(credit: Credit) : Status(progressStep = 100, credit = credit)


class Restructured constructor(
        override val credit: Credit
) : Status(action = CreditStatusAction.REPAY) {

    override val progressStep get() = repaidPartsCount
    override val progressStepsTotal get() = totalPartsCount

    private val repaidParts = credit.schedulesRestructure.takeWhile(Schedule::closed)

    val totalPartsCount = credit.schedulesRestructure.size
    val repaidPartsCount = repaidParts.size

    val paymentsAmounts = credit.schedulesRestructure.map { it.restructurePartAmount }
    val dates = (0 until totalPartsCount).map { credit.schedulesRestructure[it].dueDate }

    val totalRepaidAmount =
            repaidParts
                    .fold(0.0) { r, item -> r + item.restructurePartAmount }

    val nextPaymentDate: LocalDate get() = dates[repaidPartsCount]
    val nextPaymentAmount: Double = credit.schedulesRestructure[repaidPartsCount].restructurePartAmount
}


class AgreementExpired(credit: Credit) : Status(credit = credit)


class Closed(credit: Credit) : Status(credit = credit)


enum class CreditStatusAction { PICK_UP_LOAN, READ_CONTRACT, REPAY }


sealed class AgreementType : Serializable {

    abstract val creditId: String

    data class PendingCredit(override val creditId: String) : AgreementType()

    data class Prolongation(
            override val creditId: String,
            val prolongationId: String
    ) : AgreementType()

    data class RestructuringAgreement(
            override val creditId: String,
            val restructuringId: String
    ) : AgreementType()
}


class Payment(
        val amount: Double,
        val state: PaymentState
) {
    val failed get() = state == PaymentState.Fail
    val inProgress get() = state == PaymentState.InProgress
    val successful get() = state == PaymentState.Successful
}


enum class PaymentState {
    Successful, Fail, InProgress
}
