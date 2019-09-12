package ua.mycredit.mycredit.ui.bases.input

import android.databinding.ObservableBoolean
import android.databinding.ObservableField
import android.databinding.ObservableInt
import android.support.annotation.CallSuper
import android.text.*
import android.view.Gravity
import android.view.inputmethod.EditorInfo
import io.reactivex.Observable
import ua.mycredit.mycredit.R
import ua.mycredit.mycredit.ui.*


data class FieldViewModel(
        val hint: Int = 0,
        val inputType: Int = InputType.TYPE_CLASS_TEXT,
        val maxLines: Int = 1,
        val minLines: Int = 1,
        val maxLength: Int = 200,
        val optional: Boolean = false,
        val requiredError: Int = R.string.error_field_required,
        val counterEnabled: Boolean = false,
        val gravity: Int = Gravity.TOP,
        val hintStatic: Boolean = false,
        val additionalFilters: Set<InputFilter> = emptySet(),
        var onFocused: (() -> Unit)? = null,
        var onFocusLost: (() -> Unit)? = null,
        var onClick: (() -> Unit)? = null,
        private val availableChars: String? = availableCharacters,
        private val conditions: Set<ConditionChecker> = setOf(),
        private val verificationErrorsMessages: Map<Int, Int> = emptyMap(),
        private val onImeActionDone: () -> Unit = {},
        private val onImeActionNext: () -> Unit = {}
) : Validable {

    val input = ObservableField<String>("")

    val error = ObservableInt()
    val hasFocus = ObservableBoolean()

    val state = ObservableField<State>(State.NORMAL.takeIf { onClick == null } ?: State.CLICKABLE)

    val requestFocus = ObservableField<RequestFocus>()
    val moveCursorToEnd = ObservableField<MoveCursorToEnd>()

    val filters = (
            additionalFilters +
                    setOf(availableChars?.let(::WrongCharsFilter), InputFilter.LengthFilter(maxLength))
            )
            .filterNotNull()
            .toTypedArray()

    val clickable = ObservableBoolean(onClick != null)
    val focusable = ObservableBoolean(onClick == null)
    val enabled = ObservableBoolean(true)

    init {
        observeInputChanges().subscribe { error.set(0) }
    }

    override fun validate(): Boolean {

        error.set(0)

        return if (value().trim().isEmpty()) {
            if (optional) {
                true
            } else {
                error.set(requiredError)
                false
            }
        } else {
            conditions.find { !it.check(value()) }
                    ?.error
                    ?.also(error::set) == null
        }
    }

    fun value() = input.notNullGet()

    fun setValue(text: String) {

        input.set(
                availableChars?.let { text.filter { ch -> availableChars.contains(ch) } } ?: text
        )

        moveCursorToEnd()
    }

    fun moveCursorToEnd() {
        moveCursorToEnd.set(MoveCursorToEnd)
    }

    fun requestFocus() {
        requestFocus.set(RequestFocus)
    }

    fun onFocused() {
        hasFocus.set(true)
        onFocused?.invoke()
    }

    fun onFocusLost() {
        hasFocus.set(false)
        onFocusLost?.invoke()
    }

    fun onClick() {
        onClick?.invoke()
    }

    fun tryShowVerificationError(code: Int) =
            when {
                verificationErrorsMessages.containsKey(code) -> {
                    error.set(verificationErrorsMessages[code]!!)
                    true
                }

                else -> false
            }


    @CallSuper
    fun clear() {
        error.set(0)
        input.set("")
    }

    fun clearIfNotValid() {
        if (!validate()) {
            clear()
        }
    }

    fun asFixedLengthField(length: Int,
                           error: Int,
                           next: FieldViewModel? = null) =
            copy(conditions = conditions + ConditionChecker(error) { this.length == length },
                    maxLength = length,
                    counterEnabled = length > 3)
                    .also {
                        if (next != null) {
                            it.observeInputChanges()
                                    .filter { it.second.length == length }
                                    .subscribe { next.requestFocus() }
                        }
                    }

    fun observeInputChanges(): Observable<Pair<String, String>> =
            input.asObservable(true)
                    .previousCurrentPairs()
                    .filter { it.first != it.second }

    fun onEditorAction(actionId: Int): Boolean {

        when (actionId) {
            EditorInfo.IME_ACTION_DONE -> onImeActionDone
            EditorInfo.IME_ACTION_NEXT -> onImeActionNext
            else -> null
        }?.invoke()

        return false
    }

    class ConditionChecker(
            val error: Int,
            val check: String.() -> Boolean
    )

    private class WrongCharsFilter(val chars: String) : InputFilter {

        override fun filter(source: CharSequence, start: Int, end: Int, dest: Spanned, dstart: Int, dend: Int): CharSequence? {
            var keepOriginal = true
            val sb = StringBuilder(end - start)
            for (i in start until end) {
                val c = source[i]
                if (chars.contains(c))
                    sb.append(c)
                else
                    keepOriginal = false
            }
            return if (keepOriginal)
                null
            else {
                (source as? Spanned)?.let {
                    SpannableString(sb).also {
                        TextUtils.copySpansFrom(source, start, sb.length, null, it, 0)
                    }
                } ?: sb
            }
        }
    }


    enum class State {
        DISABLED,
        CLICKABLE,
        NORMAL
    }


    companion object {

        fun fixedLengthChecker(error: Int, minLength: Int) =
                ConditionChecker(error) { length >= minLength }

    }
}
