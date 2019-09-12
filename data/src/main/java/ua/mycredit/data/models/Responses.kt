package ua.mycredit.data.models

import com.google.gson.annotations.SerializedName

class ResponseContent<D>(
        @SerializedName("Data") val data: D?,
        @SerializedName("Error") val error: String?,
        @SerializedName("InfoMessage") val message: String
)

class CheckResp(@SerializedName("InfoMessage") val infoMessage: String,
                @SerializedName("Data") val data: String?,
                @SerializedName("IsIn") val isIn: Boolean)

class ApiResponse<out T>(@SerializedName("Data") val data: T?,
                         @SerializedName("InfoMessage") val message: String)

class CreditResponse(
        @SerializedName("Id") val id: String,
        @SerializedName("PublicId") val publicId: String,
        @SerializedName("Status") val status: Int,

        @SerializedName("CreationDate") val creationDate: String,
        @SerializedName("DisbursementDate") val disbursementDate: String?,
        @SerializedName("FinishDate") val finishDate: String?,
        @SerializedName("CloseDate") val closeDate: String?,

        @SerializedName("CurrentDebt") val currentDebt: Double,

        @SerializedName("Amount") val amount: Double,
        @SerializedName("Term") val term: Int,
        @SerializedName("OriginalAmount") val amountOriginal: Double,
        @SerializedName("OriginalTerm") val termOriginal: Int,

        @SerializedName("NextPaymentAmount") val nextPaymentAmount: Double?,
        @SerializedName("NextPaymentDate") val nextPaymentDate: String?,

        @SerializedName("Schedules") val schedules: List<ScheduleResponse>?,
        @SerializedName("RestructureSchedules") val schedulesRestructure: List<ScheduleResponse>?,

        @SerializedName("DaysPastDue") val pastDueDays: Int,
        @SerializedName("OutstandingBalance") val outstandingBalance: Double,

        @SerializedName("CurrentInterest") val currentInterest: Double,
        @SerializedName("CurrentOverdueInterest") val currentOverdueInterest: Double

)

class ScheduleResponse(
        @SerializedName("DueDate") val dueDate: String,
        @SerializedName("Status") val status: String,
        @SerializedName("RestructurePartAmount") val restructurePartAmount: Double,
        @SerializedName("Total") val total: Int,
        @SerializedName("Interest") val interest: Int,
        @SerializedName("Principal") val principal: Int,
        @SerializedName("Fees") val fees: Int
)

class CardsResponse(@SerializedName("Data") val data: List<Card>) {

    class Card(
            @SerializedName("CardId") val id: String,
            @SerializedName("Card") val card: String,
            @SerializedName("CardDate") val date: String,
            @SerializedName("Verified") val verified: Boolean,
            @SerializedName("IsMain") val main: Boolean,
            @SerializedName("CardType") val cardType: Int
    )
}

class SetCardDetailsResponse(@SerializedName("Data") val data: Data) {
    class Data(@SerializedName("CardId") val id: String)
}

class CreditProductsResponse(@SerializedName("Data") val data: List<Entry>) {

    class Entry(
            @SerializedName("Name") val name: String,
            @SerializedName("MinAmount") val minAmount: Double,
            @SerializedName("MaxAmount") val maxAmount: Double,
            @SerializedName("MinTerm") val minTerm: Int,
            @SerializedName("MaxTerm") val maxTerm: Int,
            @SerializedName("IsDefault") val default: Boolean,
            @SerializedName("InterestRate") val interestRate: Float,
            @SerializedName("IsForCPA") val IsForCPA: Boolean
    )
}

class CardVerificationResultResponse(@SerializedName("Data") val data: Data) {

    class Data(@SerializedName("verificationresult") val verificationResult: VerificationResult) {

        class VerificationResult(
                @SerializedName("ProtectedCardNumber") val protectedCardNumber: String,
                @SerializedName("CardIdentification") val cardIdentification: Int,
                @SerializedName("HasTokenInTranzzo") val hasTokenInTranzzo: Boolean,
                @SerializedName("IsCustomerVerifiedInTranzzo") val customerVerifiedInTranzzo: Boolean,
                @SerializedName("VerifiedURL") val verifiedURL: String?
        )
    }

    companion object {
        const val IS_3DS = 1
        const val NOT_3DS = 2
        const val IN_PROGRESS = 3
    }
}

class ValidatePromo( //Todo ("Replace with BaseResponse if provided")
        @SerializedName("Valid") val valid: Boolean
)

class PaymentByCardResponse(
        @SerializedName("Url") val url: String,
        @SerializedName("RepaymentId") val repaymentId: String,
        @SerializedName("IsSucceed") val succeed: Boolean,
        @SerializedName("RepaymentStatus") val repaymentStatus: Int
)

class PaymentAnOtherCardResponse(
        @SerializedName("CardType") val cardType: Int,
        @SerializedName("Url") val url: String,
        @SerializedName("RepaymentId") val repaymentId: String,
        @SerializedName("IsSucceed") val succeed: Boolean,
        @SerializedName("RepaymentStatus") val repaymentStatus: Int
)

class Rollover(
        @SerializedName("RolloverId") val id: String,
        @SerializedName("RolloverDays") val days: Int,
        @SerializedName("RolloverDiscount") val discount: Double,
        @SerializedName("RolloverFinishDate") val finishDate: String,
        @SerializedName("IsPossible") val possible: Boolean
)

class RestructuringsResponseItem(
        @SerializedName("RestructureId") val id: String,
        @SerializedName("EconomyAmount") val economyAmount: Double,
        @SerializedName("RestructureType") val type: Type,
        @SerializedName("RestructureResult") val schedule: List<PaymentScheduleItem>) {

    class Type(
            @SerializedName("StartsFromDaysPastDue") val days: Int,
            @SerializedName("IsActive") val active: Boolean
    )

    class PaymentScheduleItem(
            @SerializedName("FinishDateOfPeriod") val finishDateOfPeriod: String,
            @SerializedName("AmountOfPeriod") val amount: Double
    )
}


class RolloverAvailability(
        @SerializedName("isAvailable") val available: Boolean,
        @SerializedName("rolloverDays") val days: Int,
        @SerializedName("rolloverDate") val rolloverDate: String
)


class SumFordays(
        @SerializedName("sumToday") val sumToday: Double,
        @SerializedName("SumTomorrow") val sumTomorrow: Double,
        @SerializedName("SumInWeek") val sumInWeek: Double,
        @SerializedName("SumInTwoWeek") val sumInTwoWeek: Double
)


class Payment(
        @SerializedName("Loan_RepaymentId") val id: String,
        @SerializedName("StatusTxt") val statusTxt: String,
        @SerializedName("Status") val status: Int,
        @SerializedName("Amount") val amount: Double
)


class SetLoanIdResponse(@SerializedName("Data") val data: Data) {
    class Data(@SerializedName("loanId") val loanId: String)
}