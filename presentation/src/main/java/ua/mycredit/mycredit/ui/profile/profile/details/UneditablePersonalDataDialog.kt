package ua.mycredit.mycredit.ui.profile.profile.details

import ua.mycredit.mycredit.R
import ua.mycredit.mycredit.Screens
import ua.mycredit.mycredit.ui.bases.SelfBindingDialogFragment2

class UneditablePersonalDataDialog : SelfBindingDialogFragment2() {

    override val layoutId = R.layout.dialog_uneditable_personal_data

    fun goToDial(phone: String) {
        router.navigateTo(Screens.DIAL, phone)
    }
}
