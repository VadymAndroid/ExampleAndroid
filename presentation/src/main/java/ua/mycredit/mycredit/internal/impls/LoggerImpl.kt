package ua.mycredit.mycredit.internal.impls

import android.util.Log
import ua.mycredit.core.internal.Logger
import ua.mycredit.mycredit.BuildConfig
import javax.inject.Inject

class LoggerImpl @Inject constructor() : Logger {

    override fun e(any: Any, message: String, throwable: Throwable?) {
        if (BuildConfig.DEBUG) {
            var tag = makeTag(any)

            if (tag.length > 23) {
                tag = tag.substring(tag.length - 23, tag.length)
            }

            throwable?.let { Log.e(tag, message) } ?: Log.e(tag, message, throwable)
        }
    }

    private fun makeTag(any: Any) =
            any as? String ?: getNamePrototypeClass(any).simpleName

    private fun getNamePrototypeClass(any: Any) =
            (any as? Class<*> ?: any.javaClass).let(this::getDeclaredClass)

    private fun getDeclaredClass(clazz: Class<*>) =
            with(clazz) {
                takeUnless { it.isAnonymousClass } ?: superclass
            }
}
