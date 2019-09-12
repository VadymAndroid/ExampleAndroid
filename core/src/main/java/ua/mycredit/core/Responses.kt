package ua.mycredit.core

import com.google.gson.annotations.SerializedName

class LoginResp(@SerializedName("Data") val data: String?,
                @SerializedName("InfoMessage") val message: String)