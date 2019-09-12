package ua.mycredit.mycredit.ui.bases.input

import android.os.Bundle
import android.text.InputType
import com.orhanobut.hawk.Hawk
import ua.mycredit.mycredit.R
import ua.mycredit.mycredit.ui.asObservable

abstract class BaseSmsCodeViewModel : FormViewModel() {

    final override val fields get() = listOf(code)
    val bundle = Bundle()
    val code = FieldViewModel(
            R.string.hint_sms_code,
            inputType = InputType.TYPE_CLASS_NUMBER,
            availableChars = digits,
            counterEnabled = true
    ).asFixedLengthField(6, R.string.error_wrong_sms_code)

    init {

        code.input.set("" + Hawk.get<String>("code"))

        code.input
                .asObservable()
                .filter { it.length == code.maxLength }
                .subscribe {
                    attemptToSend()
                    Hawk.put("code", "")
                }
    }
}
