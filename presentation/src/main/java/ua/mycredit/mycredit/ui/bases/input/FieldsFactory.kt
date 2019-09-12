package ua.mycredit.mycredit.ui.bases.input

import android.annotation.SuppressLint
import android.support.annotation.StringRes
import android.text.InputType
import android.util.Patterns
import ua.mycredit.mycredit.R
import ua.mycredit.mycredit.ui.asObservable


@SuppressLint("CheckResult")
fun maskedPhone(@StringRes hint: Int = R.string.hint_your_phone_number,
                operators: Boolean = true,
                fixedLength: Boolean = true,
                next: FieldViewModel? = null,
                phone: String = "",
                onImeActionDone: () -> Unit = {}) =
        FieldViewModel(
                hint = hint,
                conditions = setOf(
                        FieldViewModel.ConditionChecker(R.string.error_incorrect_number) {
                            when {
                                fixedLength -> validate()
                                else -> true
                            }
                        }),
                onImeActionDone = onImeActionDone
        ).apply {
            input.asObservable()
                    .filter {
                        when {
                            operators -> !withOperatorsValid(it)
                            else -> !valid(it)
                        }
                    }
                    .subscribe {
                        if(showPhoneNumber(phone = input.get()!!)){
                            input.set(PHONE_PREFIX )
                        }else {
                            input.set(PHONE_PREFIX + phone)
                        }
                    }

            hasFocus.set(true)
            if (next != null) {
                observeInputChanges()
                        .filter { it.second.validate() }
                        .subscribe {
                            next.requestFocus()
                        }
            }
        }


private fun CharSequence.validate() = length == RAW_NUMBER_LENGTH && !contains('X')

/**
 *
 *  Note that this function is useful only for a MaskedEditText
 *  viewModel with following attribute values:
 *
 *  android:hint="XXXXXXXXXXXXXXX"
 *  app:mask="#######)###-##-##"
 *
 * */

private fun withOperatorsValid(phone: String)
        = phone.startsWith(PHONE_PREFIX) &&
        (phone == PHONE_PREFIX ||
                phone.substring(PHONE_PREFIX.length, PHONE_PREFIX.length + 2).contains('X') ||
                availablePrefixes.any {
                    phone.startsWith(it)
                })

private fun showPhoneNumber(phone: String): Boolean =
        phone.contains("+")

private fun valid(phone: String) = phone.startsWith(PHONE_PREFIX)

private const val PHONE_PREFIX = "+38(0"

private val operatorsCodes = listOf("50", "63", "66", "67", "68", "73", "93", "95", "96", "97", "98", "99")

private val availablePrefixes = operatorsCodes.map { "$PHONE_PREFIX$it" }

private const val RAW_NUMBER_LENGTH = 17


fun email() = FieldViewModel(
        R.string.hint_email,
        InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS,
        availableChars = null)
        .copy(conditions = setOf(FieldViewModel.ConditionChecker(R.string.error_incorrect_email) {
            Patterns.EMAIL_ADDRESS.matcher(this).matches()
        }))

fun password(hint: Int = R.string.hint_password) = FieldViewModel(
        hint,
        InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD,
        availableChars = null)
        .copy(conditions = setOf(FieldViewModel.ConditionChecker(R.string.error_invalid_password) {
            PasswordRequirementsViewModel.PasswordRequirement.values().all { it.check(this) }
        }))

fun confirmPassword(password: FieldViewModel, onImeActionDone: () -> Unit = {}) =
        FieldViewModel(
                R.string.hint_confirm_password,
                InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD,
                availableChars = null,
                onImeActionDone = onImeActionDone,
                conditions = setOf(FieldViewModel.ConditionChecker(R.string.error_passwords_do_not_match) { equals(password.input.get()) })
        )


const val cyrillicChars = "АаБбВвГгҐґДдЕеЄєЖжЗзИиІіЇїЙйКкЛлМмНнОоПпРрСсТтУуФфХхЦцЧчШшЩщЬьЮюЯяЫыЪъЭэ"
const val latinChars = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz"

const val cyrillicAndLatinChars = "$cyrillicChars$latinChars"

const val cyrillicNameChars = "$cyrillicChars'-"
const val latinNameChars = "$latinChars'- "

const val digits = "0123456789"
const val symbols = "_%-? "

const val availableCharacters = "$cyrillicNameChars$digits\";,. /"

const val allAvailableCharacters = "$availableCharacters$latinNameChars"
