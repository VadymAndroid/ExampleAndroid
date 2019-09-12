package ua.mycredit.core.internal

interface Logger {

    fun e(any: Any, message: String, throwable: Throwable? = null)

}
