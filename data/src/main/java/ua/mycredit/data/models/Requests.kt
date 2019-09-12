package ua.mycredit.data.models

import com.google.gson.annotations.SerializedName
import ua.mycredit.core.PhoneOptions


const val YES = 1
const val NO = 2

//TODO Known issue: New Passport(Card)
class Customer(
        @SerializedName("Phone") val phone: String?,
        @SerializedName("Email") val email: String,
        @SerializedName("Address") val address: AddressReq?,
        @SerializedName("SecondAddress") val secondAddress: AddressReq?,
        @SerializedName("CompanyName") val companyName: String?,
        @SerializedName("WorkPhone") val workPhone: String?,

        @SerializedName("MaritalStatus") val maritalStatus: Int, //MaritalStatus
        @SerializedName("Education") val education: Int, //Education

//        @SerializedName("PeriodResidence") val periodResidence: Int, //Accommodation

        @SerializedName("Occupation") val activityKind: Int, //ActivityKind,
        @SerializedName("Position") val position: Int, //Position?,
        @SerializedName("CostFamily") val costFamily: Int, //FamilyExpense,
        @SerializedName("SumPayLoans") val sumPayLoans: Int, //PaymentsAmountOnLoans,
        @SerializedName("PurposeLoan") val purposeLoan: Int, //LoanPurpose,
        @SerializedName("NameUniversity") val nameUniversity: String?,
        @SerializedName("SpecializationFaculty") val specializationFaculty: Int,
        @SerializedName("QualificationAfterGraduation") val qualificationAfterGraduation: Int, //QualificationAfterGraduation? = null,

        @SerializedName("GroupDisability") val groupDisability: Int, // GroupDisability?,
        @SerializedName("ReasonDismissal") val reasonDismissal: Int, //ReasonDismissal?,
        @SerializedName("BusynessType") val occupation: Int, //OccupationType,
        @SerializedName("MainSource") val mainSource: Int, //IncomeMainSource,
        @SerializedName("GrossMonthlyIncome") val grossMonthlyIncome: Int, //GrossMonthlyIncome,
        @SerializedName("PassportType") val passportType: Int, //PassportType,
        @SerializedName("Passport") val passport: String?,
        @SerializedName("PassportIssuedBy") val passportIssuedBy: String?,
        @SerializedName("PassportRegistration") val passportRegistration: String?,
        @SerializedName("PassportNumber") val passportNumber: String?,
        @SerializedName("PassportSeria") val passportSeria: String?,
        @SerializedName("PassportReestrNumber") val passportRecordNumber: String?,
        @SerializedName("PassportExpirationDate") val passportExpirationDate: String?,

        @SerializedName("SocialSecurityNumber") val tin: String?,

        @SerializedName("FacebookUrl") val facebookUrl: String?,
        @SerializedName("FirstName") val firstName: String?,
        @SerializedName("MiddleName") val middleName: String?,
        @SerializedName("LastName") val lastName: String?,
        @SerializedName("FullName") val fullName: String,
        @SerializedName("BirthDate") val birthDate: String?,
        //@SerializedName("Gender") val Gender = 0,
        @SerializedName("IsAgreedWithMailSubscription") val isAgreedWithMailSubscription: Boolean,
        @SerializedName("IsAgreedUseMyData") val isAgreedUseMyData: Boolean,
        @SerializedName("Docs") val docs: Array<String>,
        @SerializedName("AdditionalData") val additionalDataList: List<AdditionalData>?
)

class AdditionalData(@SerializedName("Key") val key: String?,
                     @SerializedName("Value") val value: String?) {

    companion object {
        const val STUDENT_KEY = "StudentId"
    }
}

class AddressReq(
        @SerializedName("Street") val street: String?,
        @SerializedName("Apartment") val apartment: String?,
        @SerializedName("City") val city: String?,
        @SerializedName("State") val state: String?,
        @SerializedName("House") val house: String?,
        @SerializedName("Building") val building: String?,
        @SerializedName("ResidentialMatchesRegistration") val residentialMatchesRegistration: Int
)

class ChangePassword(
        @SerializedName("currentPassword") val currentPassword: String,
        @SerializedName("newPassword") val newPassword: String
)

class MakeCardMain(
        @SerializedName("cardId") val cardId: String
)

class SetCardDetails(
        @SerializedName("Card") val card: String,
        @SerializedName("CardDateMonth") val cardDateMonth: String,
        @SerializedName("CardDateYear") val cardDateYear: String,
        @SerializedName("Cvv") val cvv: String
)

class ApplyForLoan(
        @SerializedName("Amount") val amount: Float,
        @SerializedName("AvailableAmount") val availableAmount: Float,
        @SerializedName("Term") val term: Int,
        @SerializedName("CreditProduct") val creditProduct: String,
        @SerializedName("PromoCode") val promoCode: String
)

class MakePaymentByCardRequest(
        @SerializedName("CardId") val CardId: Int,
        @SerializedName("Amount") val Amount: Double,
        @SerializedName("PaymentURL") val PaymentURL: String = "https://mycredit.ua"
)

class MakePaymentAnOtherCardRequest(
        @SerializedName("Amount") val amount: Double,
        @SerializedName("Card") val card: String,
        @SerializedName("CardDateMonth") val cardDateMonth: Int,
        @SerializedName("CardDateYear") val cardDateYear: Int,
        @SerializedName("Cvv") val cvv: Int,
        @SerializedName("BackUrl") val backUrl: String = "https://mycredit.ua"
)

class Credentials(
        @SerializedName("login") val login: String,
        @SerializedName("password") val password: String
)


class Phone(
        @SerializedName("phone") val phone: String
)

class ResetPassword(
        @SerializedName("phone") val phone: String,
        @SerializedName("code") val code: String,
        @SerializedName("newPassword") val newPassword: String
)

class Restrucutre(
        @SerializedName("loanId") val loanId: String,
        @SerializedName("restructureId") val restructureId: String
)


class ApplyRollover(
        @SerializedName("loanId") val loanId: String,
        @SerializedName("desiredPaymentDate") val desiredPaymentDate: String
)

class AcceptLoanAgreement(
        @SerializedName("loanId") val loanId: String
)

class RequestSms(
        @SerializedName("phone") val phone: String
)

class RequestPhoneOption(
        @SerializedName("PhoneOptions") val phoneOptions: PhoneOptions
)

class CPA(
        @SerializedName("cpa") val cpa: String,
        @SerializedName("creditId") val creditId: String,
        @SerializedName("repeater") val repeater: String,
        @SerializedName("operation") val operation: String,
        @SerializedName("isPromoCodeNotForCPA") val isPromoCodeNotForCPA : String
)

class Register(
        @SerializedName("login") val login: String,
        @SerializedName("password") val password: String
)
