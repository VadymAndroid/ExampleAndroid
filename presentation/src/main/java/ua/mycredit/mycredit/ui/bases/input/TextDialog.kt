package ua.mycredit.mycredit.ui.bases.input

import android.app.Dialog
import android.databinding.ObservableField
import android.view.WindowManager.LayoutParams
import ua.mycredit.mycredit.R

abstract class TextDialogViewModel : DialogViewModel() {

    override val hintRes = R.string.hint_input

    val validatedInput = ObservableField<String>("")

    abstract val dialogField: FieldViewModel

    override fun onValidate() = dialogField.validate()

    fun init(text: String) {
        validatedInput.set(text)
        dialogField.setValue(text)
    }

    fun attemptToApplyDialogField() =
            when {
                dialogField.validate() -> {
                    validatedInput.set(dialogField.value())
                    error.set(false)
                    true
                }

                else -> false
            }

    fun getInput() = validatedInput.get()!!
}


open class TextInputDialogFragment : BaseInputDialogFragment() {

    override val layoutId get() = R.layout.dialog_fragment_text

    val dialogField get() = textDialogViewModel.dialogField

    private val textDialogViewModel get() = fieldViewModel as TextDialogViewModel

    override fun onDialogCreated(dialog: Dialog) {
        dialogField.moveCursorToEnd()
        dialog.window?.setSoftInputMode(LayoutParams.SOFT_INPUT_STATE_VISIBLE)
    }

    fun attemptToPersist() {
        if (textDialogViewModel.attemptToApplyDialogField()) {
            dismiss()
        }
    }
}


class PhoneInputDialogFragment : TextInputDialogFragment() {
    override val layoutId get() = R.layout.dialog_fragment_phone
}
