package ua.mycredit.mycredit.ui.profile.profile

import android.databinding.ObservableBoolean
import ua.mycredit.core.Profile
import ua.mycredit.core.interactors.LoadProfileUseCase
import ua.mycredit.mycredit.R
import ua.mycredit.mycredit.Screens
import ua.mycredit.mycredit.databinding.FragmentProfileBinding
import ua.mycredit.mycredit.ui.bases.BaseViewModel
import ua.mycredit.mycredit.ui.bases.ViewModelFragment
import ua.mycredit.mycredit.ui.bases.action.Refreshable
import ua.mycredit.mycredit.ui.bases.action.WithRefresh
import javax.inject.Inject


class ProfileFragment : ViewModelFragment<ProfileViewModel, FragmentProfileBinding>() {
    override val layoutId: Int get() = R.layout.fragment_profile
    override val viewModelClass get() = ProfileViewModel::class.java
}


class ProfileViewModel @Inject constructor(
        private val loadProfile: LoadProfileUseCase
) : BaseViewModel(), WithRefresh {

    override val asRefreshable: Refreshable by lazy(::RefreshableImpl)

    val personalValid = ObservableBoolean(true)
    val occupationValid = ObservableBoolean(true)

    @Inject
    fun updateBadges() {
        personalValid.set(profile.isPersonalInfoValid)
        occupationValid.set(profile.isOccupationInfoValid)
    }

    override fun onProfileUpdated() {
        updateBadges()
    }

    fun onDetails(screenKey: String) {
        router.navigateTo(screenKey)
    }

    fun logout() {
        logouter.logout()
        router.navigateTo(Screens.CALCULATOR)
    }

    private inner class RefreshableImpl : Refreshable() {

        override fun onRefresh() {
            loadProfile.execute(ObserverImpl())
        }

        private inner class ObserverImpl : RefreshableSingleObserver<Profile>(asRefreshable) {

            override fun onSuccess(t: Profile) {
                super.onSuccess(t)
                events.notifyListeners { it.onProfileUpdated() }
            }
        }
    }
}
