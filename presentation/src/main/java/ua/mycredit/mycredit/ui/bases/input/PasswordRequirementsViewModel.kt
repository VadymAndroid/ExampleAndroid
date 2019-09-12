package ua.mycredit.mycredit.ui.bases.input

import android.databinding.ObservableInt

class PasswordRequirementsViewModel {

    val requirements = ObservableInt()

    fun onPasswordChanged(password: CharSequence) {
        enumValues<PasswordRequirement>()
                .filter { it.check(password) }
                .fold(0) { acc, checked -> acc or (1 shl checked.ordinal) }
                .let(requirements::set)
    }

    enum class PasswordRequirement(val check: CharSequence.() -> Boolean) {
        LENGTH({ length >= 6 }),
        LETTER_CASE({ find { it.isLowerCase() } != null && find { it.isUpperCase() } != null }),
        DIGITS({ find { it.isDigit() } != null });
    }
}
