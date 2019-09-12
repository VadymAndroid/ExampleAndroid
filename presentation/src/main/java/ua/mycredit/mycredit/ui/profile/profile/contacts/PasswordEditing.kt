package ua.mycredit.mycredit.ui.profile.profile.contacts

import android.os.Bundle
import android.text.InputType
import ua.mycredit.core.interactors.EditPasswordUseCase
import ua.mycredit.core.interactors.ResetPasswordUseCase
import ua.mycredit.mycredit.R
import ua.mycredit.mycredit.databinding.FragmentEditPasswordBinding
import ua.mycredit.mycredit.ui.bases.ViewModelFragment
import ua.mycredit.mycredit.ui.bases.input.*
import ua.mycredit.mycredit.ui.profile.profile.contacts.EditPasswordViewModel.Mode.ByOldPassword
import java.io.Serializable
import javax.inject.Inject


class EditPasswordFragment : ViewModelFragment<EditPasswordViewModel, FragmentEditPasswordBinding>() {

    override val layoutId get() = R.layout.fragment_edit_password
    override val toolbarTitle get() = R.string.edit_password
    override val scrollEnabled get() = true

    override val viewModelClass get() = EditPasswordViewModel::class.java

    override val exitConfirmationMessage = R.string.exit_confirmation

    private val mode
        get() =
            arguments?.getSerializable(ARG_MODE) as? EditPasswordViewModel.Mode
                    ?: ByOldPassword

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            viewModel.mode = mode
        }
    }


    companion object {
        const val ARG_MODE = "ARG_MODE"
    }
}

class EditPasswordViewModel @Inject constructor(
        private val editPassword: EditPasswordUseCase,
        private val resetPassword: ResetPasswordUseCase
) : FormViewModel() {

    val smsCode by lazy {
        FieldViewModel(
                hint = R.string.hint_sms_code,
                inputType = InputType.TYPE_CLASS_NUMBER,
                maxLength = 6,
                counterEnabled = true
        ).asFixedLengthField(6, R.string.error_wrong_sms_code, newPassword)
    }

    val currentPassword = password(R.string.hint_current_password)
    val newPassword = password(R.string.hint_new_password)
    val confirmNewPassword = confirmPassword(newPassword, ::attemptToSend)

    val passwordRequirements = PasswordRequirementsViewModel()

    var mode: Mode = ByOldPassword

    override val fields get() = mode.getFields(this)

    override fun onReadyToSend() {
        mode.processReadyToSent(this)
    }

    private inner class PasswordEditingObserver : BaseCompletableObserver(
            R.string.message_password_changed_successfully,
            true
    ) {
        override val progressMode = ProgressMode.DIALOG

        override fun onComplete() {
            super.onComplete()
            if (mode is Mode.ByPhone) {
                router.exit() // from phone for sms
            }
        }
    }


    sealed class Mode(
            val processReadyToSent: EditPasswordViewModel.() -> Unit,
            val getFields: EditPasswordViewModel.() -> List<FieldViewModel>
    ) : Serializable {

        object ByOldPassword : Mode(
                getFields = { listOf(currentPassword, newPassword, confirmNewPassword) },
                processReadyToSent = {
                    editPassword.execute(
                            EditPasswordUseCase.Params(currentPassword.value(), newPassword.value()),
                            PasswordEditingObserver()
                    )
                })

        class ByPhone(private val phone: String) : Mode(
                getFields = { listOf(smsCode, newPassword, confirmNewPassword) },
                processReadyToSent = {
                    resetPassword.execute(
                            ResetPasswordUseCase.Params(
                                    phone = phone,
                                    code = smsCode.value(),
                                    newPassword = newPassword.value()
                            ),
                            PasswordEditingObserver()
                    )
                }
        )
    }
}
