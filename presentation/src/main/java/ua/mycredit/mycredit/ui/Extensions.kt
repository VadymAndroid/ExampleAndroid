@file:Suppress("UNUSED_VALUE")

package ua.mycredit.mycredit.ui

import android.Manifest
import android.annotation.SuppressLint
import android.app.Fragment
import android.content.Context
import android.content.res.Resources
import android.databinding.*
import android.databinding.Observable
import android.net.wifi.WifiManager
import android.os.Build
import android.os.Bundle
import android.support.annotation.ColorRes
import android.support.annotation.DrawableRes
import android.support.annotation.LayoutRes
import android.support.v4.app.Fragment
import android.support.v4.content.ContextCompat
import android.telephony.TelephonyManager
import android.text.format.Formatter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.facebook.FacebookSdk.getApplicationContext
import com.google.firebase.analytics.FirebaseAnalytics
import io.reactivex.ObservableEmitter
import io.reactivex.ObservableOnSubscribe
import org.jetbrains.anko.act
import org.jetbrains.anko.connectivityManager
import org.jetbrains.anko.selector
import org.jetbrains.anko.support.v4.act
import org.jetbrains.anko.support.v4.ctx
import org.joda.time.DateTime
import org.joda.time.LocalDate
import org.joda.time.format.DateTimeFormat
import org.json.JSONException
import org.json.JSONObject
import ru.terrakok.cicerone.commands.BackTo
import ru.terrakok.cicerone.commands.Command
import ru.terrakok.cicerone.commands.Forward
import ru.terrakok.cicerone.commands.Replace
import ua.mycredit.core.PhoneOptions
import ua.mycredit.mycredit.BR
import ua.mycredit.mycredit.BuildConfig
import ua.mycredit.mycredit.R
import ua.mycredit.mycredit.Screens
import ua.mycredit.mycredit.internal.analytics.CustomAnalyticEvent
import ua.mycredit.mycredit.ui.bases.BaseActivity
import ua.mycredit.mycredit.ui.bases.BaseViewModel
import ua.mycredit.mycredit.ui.bases.input.FieldViewModel
import ua.mycredit.mycredit.ui.bases.input.FormViewModel
import ua.mycredit.mycredit.ui.bases.input.Validable
import java.text.DecimalFormat
import java.util.*
import io.reactivex.Observable as RxObservable

fun ViewDataBinding.bindViewModel(viewModel: Any?): View =
        apply {
            setVariable(BR.viewModel, viewModel)
        }.root


fun <T> ObservableField<T>.asObservable(emitInitial: Boolean = false): RxObservable<T> =
        ObservableOnSubscribe<T> {

            addOnPropertyChangedCallback(OnPropertyChangedCallbackImpl(this, it))

        }.let { RxObservable.create<T>(it) }
                .run { takeUnless { emitInitial } ?: startWith(get()) }

private class OnPropertyChangedCallbackImpl<T>(
        private val field: ObservableField<T>,
        private val emitter: ObservableEmitter<T>
) : Observable.OnPropertyChangedCallback() {

    override fun onPropertyChanged(sender: Observable, propertyId: Int) {
        emitter.onNext(field.notNullGet())
    }
}

fun <T> ObservableField<T>.notNullGet(): T =
        get() ?: throw IllegalStateException("Field should be initialized before get.")

fun ObservableBoolean.asObservable(): RxObservable<Boolean> =
        ObservableOnSubscribe<Boolean> {
            addOnPropertyChangedCallback(OnBooleanPropertyChangedCallbackImpl(this, it))
        }.let {
            RxObservable.create(it)
        }

private class OnBooleanPropertyChangedCallbackImpl(
        private val field: ObservableBoolean,
        private val emitter: ObservableEmitter<Boolean>
) : Observable.OnPropertyChangedCallback() {

    override fun onPropertyChanged(p0: Observable?, p1: Int) {
        emitter.onNext(field.get())
    }
}

@SuppressLint("MissingPermission", "HardwareIds")
fun getDeviceOptions(): PhoneOptions{

    val wifiManager = getApplicationContext().getSystemService(Context.WIFI_SERVICE) as WifiManager
    val tm = getApplicationContext().getSystemService(Context.TELEPHONY_SERVICE)as TelephonyManager

    val imei = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        tm.imei
    } else {
        tm.deviceId
    }

    return PhoneOptions(
            "" + imei,
            "" + tm.line1Number,
            Build.VERSION.SDK_INT,
            tm.networkOperatorName,
            BuildConfig.VERSION_NAME,
            Formatter.formatIpAddress(wifiManager.connectionInfo.ipAddress))
}

fun phoneNumberValid(): String {

    var phoneValid = ""
    if (getApplicationContext().checkCallingOrSelfPermission(Manifest.permission.READ_PHONE_STATE) >= 0) {
        phoneValid = getDeviceOptions().PhoneNumber
        if (!phoneValid.isEmpty()) {
           phoneValid =  phoneValid.subSequence(4, getDeviceOptions().PhoneNumber.length).toString()
        }
    }
    return phoneValid
}


fun <T> RxObservable<T>.previousCurrentPairs(): RxObservable<Pair<T, T>> =
        flatMap { RxObservable.just(it, it) }
                .skip(1)
                .window(2)
                .flatMapSingle(RxObservable<T>::toList)
                .map { it[0] to it[1] }

fun Context.getColorBy(@ColorRes id: Int) = ContextCompat.getColor(this, id)

fun View.getColorBy(@ColorRes id: Int) = context.getColorBy(id)

fun Context.getDrawableBy(@DrawableRes id: Int) = ContextCompat.getDrawable(this, id)
fun View.getDrawableBy(@DrawableRes id: Int) = context.getDrawableBy(id)

val Context.internetConnected get() = connectivityManager.activeNetworkInfo?.isConnected == true

val Fragment.internetConnected get() = ctx.internetConnected

fun Int.toUiMoney(resources: Resources): String = DecimalFormat("#,###,###").format(this)
        .replace(',', ' ')
        .let { resources.getString(R.string.specific_uah, it) }

fun Collection<FieldViewModel>.clear() = forEach(FieldViewModel::clear)

fun Command.screenKey() =
        when (this) {
            is BackTo -> screenKey
            is Replace -> screenKey
            is Forward -> screenKey
            else -> null
        }

inline fun <reified T> Command.transitionData() =
        when (this) {
            is Replace -> transitionData
            is Forward -> transitionData
            else -> null
        } as T

fun JSONObject.getNotNullString(name: String): String =
        try {
            getString(name)
        } catch (e: JSONException) {
            ""
        }

fun Context.simpleSelector(titleRes: Int, titlesIds: Array<Int>, onTitleIdClick: (Int) -> Unit) {

    selector(titlesIds.toList(),
            getItemTitle = { it },
            onClick = onTitleIdClick,
            titleRes = titleRes)
}

fun <T> Context.selector(items: List<T>,
                         getItemTitle: (T) -> Int,
                         onClick: (T) -> Unit,
                         titleRes: Int = 0) {

    selector(if (titleRes == 0) null else getString(titleRes),
            items.map(getItemTitle).map(::getString)) { _, index ->
        onClick(items[index])
    }
}

inline fun <reified E : Enum<E>> Context.enumSelector(
        noinline getItemTitle: (E) -> Int,
        noinline onClick: (E) -> Unit,
        titleRes: Int = 0) =
        selector(enumValues<E>().toList(), getItemTitle, onClick, titleRes)

fun Context.color(id: Int): Int = ContextCompat.getColor(this, id)

val Fragment.baseActivity get() = act as BaseActivity

fun ViewGroup.inflate(@LayoutRes resource: Int, attachToRoot: Boolean = false): View =
        LayoutInflater.from(this.context).inflate(resource, this, attachToRoot)

val ViewGroup.layoutInflater get() = LayoutInflater.from(context)

fun Context.getOptionalText(id: Int, vararg arguments: Any): String = when {
    id == 0 -> ""
    arguments.isEmpty() -> resources.getString(id)
    else -> resources.getString(id, *arguments)
}


fun ObservableInt.dec() = set(get() - 1)

fun ObservableInt.inc() = set(get() + 1)

fun LocalDate?.printByStyle(style: String): String =
        "".takeIf { this == null } ?: DateTimeFormat
                .forPattern(DateTimeFormat.patternForStyle(style, Locale.getDefault()))
                .print(this)

fun DateTime.printByStyle(style: String): String =
        DateTimeFormat
                .forPattern(DateTimeFormat.patternForStyle(style, Locale.getDefault()))
                .print(this)

fun Double.toAmountString(): String {

    val wholeAmountString = DecimalFormat.getNumberInstance().format(toInt())
    val penniesAmountString = (this - toInt()).takeIf { it > 0 }
            ?.let { "%.2f".format(it).substring(1) }
            ?: ""

    return "$wholeAmountString$penniesAmountString"
}

fun Context.toAmountWithCurrency(amount: Double): String {
    return "${amount.toAmountString()} ${getString(R.string.uah)}"
}

fun FormViewModel.lockUneditableFields() {
    lockUneditableFields(fields.filterIsInstance<FieldViewModel>())
}

fun FormViewModel.lockUneditableFields(fields: List<Validable>) {
    if (!profile.signUpFlow) {
        fields.filterIsInstance<FieldViewModel>()
                .filter {
                    it.value().isNotEmpty()
                }.forEach {
                    it.clickable.set(true)
                    it.focusable.set(false)
                    it.onClick = ::goToPersonalUneditable
                }
    }
}

fun BaseViewModel.goToPersonalUneditable() {
    router.navigateTo(Screens.ERROR_PERSONAL_DATA_UNEDITABLE)
}


fun FirebaseAnalytics.logEvent(event: CustomAnalyticEvent, fillBundle: Bundle.() -> Unit = {}) {
    logEvent(event.name, Bundle().also(fillBundle))
}

fun Context.logEvent(event: CustomAnalyticEvent, fillBundle: Bundle.() -> Unit = {}) {
    FirebaseAnalytics.getInstance(this).logEvent(event, fillBundle)
}

fun Fragment.logEvent(event: CustomAnalyticEvent, fillBundle: Bundle.() -> Unit = {}) {
    ctx.logEvent(event, fillBundle)
}
