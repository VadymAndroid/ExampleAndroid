package ua.mycredit.mycredit.internal.impls

import android.support.annotation.CallSuper
import com.orhanobut.hawk.Hawk
import ua.mycredit.core.LocalStorage.ExpirableValue
import kotlin.reflect.KProperty

@Suppress("DEPRECATION")
inline fun <reified T> storageProperty(defaultValue: T? = null)
        : StorageProperty<T> {
    checkNotSealed<T>()
    return StorageProperty(defaultValue)
}


inline fun <reified T> checkNotSealed() {
    if (T::class.isSealed) {
        throw UnsupportedOperationException(
                "Sealed classes (${T::class.qualifiedName}) are not supported by Hawk"
        )
    }
}


open class StorageProperty<T> @Deprecated("use storageProperty() method") constructor(
        private val defaultValue: T? = null
) {

    open operator fun getValue(thisRef: Any, property: KProperty<*>): T =
            Hawk.get<T>(property.name, defaultValue)

    @CallSuper
    open operator fun setValue(thisRef: Any, property: KProperty<*>, value: T) {
        if (!Hawk.put(property.name, value)) {
            throw IllegalStateException()
        }
    }
}


class ExpirableProperty<T>(
        private val defaultValue: T,
        private val expiresAfterMillis: Long) {

    operator fun getValue(thisRef: Any, property: KProperty<*>): ExpirableValue<T> =
            when {

                Hawk.contains(property.name) ->
                    Hawk.get<T>(property.name, defaultValue) to property.isTimeExpired()

                else -> defaultValue to true

            }.run {
                ExpirableValue(value = first, expired = second)
            }


    operator fun setValue(thisRef: Any, property: KProperty<*>, value: ExpirableValue<T>) {
        Hawk.put(property.name, value.value)
        property.fixChangeTime()
    }

    private fun KProperty<*>.fixChangeTime() {
        Hawk.put(timeStampKey(), System.currentTimeMillis())
    }

    private fun KProperty<*>.isTimeExpired() =
            Hawk.get<Long>(timeStampKey(), 0)
                    .let { timeStamp ->
                        System.currentTimeMillis() - timeStamp >= expiresAfterMillis
                    }

    private fun KProperty<*>.timeStampKey() = "$name.timeStamp"
}
