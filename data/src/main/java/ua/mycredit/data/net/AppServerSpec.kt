package ua.mycredit.data.net


import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.*
import ua.mycredit.core.Contacts
import ua.mycredit.data.models.*

interface AppServerSpec {

    // Customer
    @POST("$API/RegisterCustomer")
    fun register(@Body body: Register): Single<Response<ResponseContent<String>>>

    @POST("$API/LoginCustomer")
    fun login(@Body credentials: Credentials): Single<Response<ResponseContent<String>>>

    @POST("$APISession/UpdateCustomerActivity")
    fun sendPhoneOptions(@Body phone: RequestPhoneOption): Single<Response<Any>>

    @POST("$APISession/AddCustomerPhonebook")
    fun sendPhoneContacts(@Body contacts: ArrayList<Contacts>): Single<Response<Any>>

    @GET("$API/CheckPhone")
    fun checkPhone(@Query("phone") phone: String): Single<Response<CheckResp>>

    @POST("$API/SendPasswordResetRequest")
    fun sendPasswordResetRequest(@Body body: Phone): Single<Response<Any>>

    @POST("$API/ResetPassword")
    fun resetPassword(@Body body: ResetPassword): Single<Response<Any>>

    @POST("$API/SendSmsToValidateCustomer")
    fun requestSms(@Body body: RequestSms): Single<Response<Any>>

    @GET("$API/CheckSsn")
    fun checkTin(@Query("ssn") tin: String): Single<Response<CheckResp>>

    @GET("$API/CheckSmsToValidateCustomer")
    fun checkSms(
            @Query("phone") phone: String,
            @Query("cod") code: String
    ): Single<Response<CheckResp>>

    @POST("$API/UpdateCustomerDetails")
    fun updateProfile(@Body customerReq: Customer): Single<Response<Any>>

    @GET("$API/GetCustomerDetails")
    fun profile(): Single<ApiResponse<Customer>>

    @POST("$API/ChangeCustomerPassword")
    fun changeCustomerPassword(@Body request: ChangePassword): Single<Response<Any>>


    // Cards
    @GET("$API/GetAllCards")
    fun getAllCards(): Single<Response<CardsResponse>>

    @POST("$API/MakeCardMain")
    fun makeCardMain(@Body request: MakeCardMain): Single<Response<Any>>

    @POST("$API/SetCardDetails")
    fun setCardDetails(@Body request: SetCardDetails): Single<Response<SetCardDetailsResponse>>

    @DELETE("$API/DeleteCard")
    fun deleteCard(@Query("cardId") id: String): Single<Response<Any>>

    @GET("$API/GetCardVerificationResult")
    fun getCardVerificationResult(@Query("cardId") cardId: String): Single<Response<CardVerificationResultResponse>>


    // Credit
    @GET("$API/GetCustomerloans")
    fun history(): Single<Response<ResponseContent<List<CreditResponse>>>>

    @GET("$API/GetCustomerLastLoan")
    fun currentLoan(): Single<Response<ResponseContent<List<CreditResponse>>>>

    @GET("$API/ValidatePromoCode")
    fun validatePromoCode(@Query("promoCode") promoCode: String): Single<Response<ValidatePromo>>

    @GET("$API/GetCreditProducts")
    fun getCreditProducts(@Query("promoCode") promoCode: String): Single<Response<CreditProductsResponse>>

    @POST("$API/ApplyForLoan")
    fun applyForLoan(@Body applyForLoan: ApplyForLoan): Single<Response<SetLoanIdResponse>>

    @Streaming
    @GET("$API/GetLoanAgreement")
    fun getCreditAgreement(@Query("loanId") loanId: String,
                           @Query("returnFileType") templateFileType: Int): Single<Response<ResponseContent<String>>>

    @POST("$API/AcceptLoanAgreement")
    fun acceptLoanAgreement(@Body body: AcceptLoanAgreement): Single<Response<Any>>

    @GET("$API/GetRolloverLoanAgreement")
    fun getRolloverLoanAgreement(
            @Query("rolloverId") rolloverId: String,
            @Query("loanId") loanId: String
    ): Single<Response<ResponseContent<String>>>

    @GET("$API/GetPreviousRestructureLoanAgreement")
    fun getPreviousRestructureLoanAgreement(
            @Query("restructureId") restructureId: String,
            @Query("loanId") loanId: String,
            @Query("returnFileType") templateFileType: Int
    ): Single<Response<ResponseContent<String>>>

    @GET("$API/GetPossibleLoanRollovers")
    fun getPossibleLoanRollovers(
            @Query("loanId") loanId: String
    ): Single<Response<ResponseContent<List<Rollover>>>>

    @GET("$API/PreviousResultOnRestructure")
    fun previousResultOnRestructure(
            @Query("loanId") loanId: String
    ): Single<Response<ResponseContent<List<RestructuringsResponseItem>>>>

    @POST("$API/ApplyRollover")
    fun prolong(@Body body: ApplyRollover): Single<Response<ResponseContent<Any>>>


    @POST("$API/MakePaymentByCard")
    fun makePaymentByCard(@Body body: MakePaymentByCardRequest): Single<Response<ResponseContent<PaymentByCardResponse>>>

    @POST("$API/MakePaymentByCard")
    fun makePaymentAnOtherCard(
            @Body body: MakePaymentAnOtherCardRequest
    ): Single<Response<ResponseContent<PaymentAnOtherCardResponse>>>

    @GET("$API/IsLoanRolloverAvailable")
    fun isLoanRolloverAvailable(@Query("loanId") loanId: String): Single<Response<ResponseContent<RolloverAvailability>>>

    @GET("$API/IsLoanCanBeFrontRolloved")
    fun isLoanCanBeFrontRolloved(
            @Query("loanId") loanId: String,
            @Query("desiredPaymentDate") desiredPaymentDate: String
    ): Single<Response<ResponseContent<RolloverAvailability>>>

    @POST("$API/MakeRestructure")
    fun makeRestructure(@Body body: Restrucutre): Single<Response<ResponseContent<Any>>>

    @GET("$API/GetSumFordays")
    fun getSumFordays(
            @Query("loanId") loanId: String
    ): Single<Response<ResponseContent<SumFordays>>>

    @GET("$API/GetAllPayments")
    fun getAllPayments(
            @Query("loanId") loanId: String
    ): Single<Response<ResponseContent<List<Payment>>>>

    companion object {
        const val API = "Api"
        const val APISession = "SessionApi"
    }
}
