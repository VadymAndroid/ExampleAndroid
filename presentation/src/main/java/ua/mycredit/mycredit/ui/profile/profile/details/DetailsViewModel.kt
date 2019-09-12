package ua.mycredit.mycredit.ui.profile.profile.details

import ua.mycredit.core.interactors.UpdateProfileUseCase
import ua.mycredit.mycredit.R
import ua.mycredit.mycredit.ui.bases.BaseViewModel
import javax.inject.Inject

class DetailsViewModel @Inject constructor(
        private val updateProfile: UpdateProfileUseCase
) : BaseViewModel() {

    private var executed = false

    fun updateProfile() {
        if (!executed) {
            executed = true
            updateProfile.execute(UpdateProfileObserver())
        }
    }


    private inner class UpdateProfileObserver : BaseCompletableObserver(R.string.profile_was_successfully_updated) {

        override val exitAfterCompletion = true
        override val progressMode = ProgressMode.DIALOG

        override fun onComplete() {
            super.onComplete()

            executed = false

            events.notifyListeners { it.onProfileUpdated() }
        }

        override fun onError(e: Throwable) {
            super.onError(e)
            executed = false
        }
    }
}
