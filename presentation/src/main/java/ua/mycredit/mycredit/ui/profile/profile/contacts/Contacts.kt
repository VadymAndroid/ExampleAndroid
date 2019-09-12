package ua.mycredit.mycredit.ui.profile.profile.contacts

import android.databinding.ObservableField
import android.os.Bundle
import ru.terrakok.cicerone.Navigator
import ua.mycredit.mycredit.R
import ua.mycredit.mycredit.Screens
import ua.mycredit.mycredit.databinding.FragmentContactsBinding
import ua.mycredit.mycredit.ui.bases.BaseActivity
import ua.mycredit.mycredit.ui.bases.SelfBindingFragment
import ua.mycredit.mycredit.ui.bases.action.SetupToolbarAction
import javax.inject.Inject

class ContactsActivity : BaseActivity() {

    override val layoutId get() = R.layout.activity_contacts
    override val navigator: Navigator = NavigatorImpl()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        SetupToolbarAction().perform(this)
        savedInstanceState ?: router.replaceScreen(Screens.Profile.Contacts.CONTACTS)
    }

    private inner class NavigatorImpl : BaseNavigator() {

        override fun createFragment(screenKey: String, data: Any?) =
                when (screenKey) {
                    Screens.Profile.Contacts.CONTACTS -> ContactsFragment()
                    Screens.Profile.Contacts.EDIT_PASSWORD -> EditPasswordFragment()
                    else -> super.createFragment(screenKey, data)
                }
    }
}

class ContactsFragment : SelfBindingFragment<FragmentContactsBinding>() {

    override val layoutId get() = R.layout.fragment_contacts
    override val toolbarTitle get() = R.string.contact_data

    val phone = ObservableField("")
    val email = ObservableField("")

    @Inject
    fun reset() {
        phone.set(storage.profile.phone)
        email.set(storage.profile.email)
    }
}
