package ua.mycredit.data.net

import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST
import ua.mycredit.data.models.CPA

interface AppServerSpecCpa {
    @POST("/?mobile=1")
    fun sendCPA(@Body cpa: CPA): Single<Response<Any>>
}