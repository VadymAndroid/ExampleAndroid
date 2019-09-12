package ua.mycredit.mycredit.ui.profile.profile.details

import android.arch.lifecycle.ViewModelProviders
import android.databinding.ObservableInt
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.view.PagerAdapter
import android.support.v4.view.ViewPager
import android.view.MenuItem
import android.view.ViewGroup
import eu.inloop.pager.UpdatableFragmentPagerAdapter
import org.jetbrains.anko.alert
import org.jetbrains.anko.cancelButton
import org.jetbrains.anko.okButton
import org.jetbrains.anko.support.v4.withArguments
import ru.terrakok.cicerone.Navigator
import ua.mycredit.core.OccupationType
import ua.mycredit.mycredit.R
import ua.mycredit.mycredit.databinding.ActivityDetailsBinding
import ua.mycredit.mycredit.mapping.instantiate
import ua.mycredit.mycredit.ui.authentication.registration.finance.FinanceFragment
import ua.mycredit.mycredit.ui.authentication.registration.passport.address.SignUpAddressFragment
import ua.mycredit.mycredit.ui.authentication.registration.passport.passport.PassportFragment
import ua.mycredit.mycredit.ui.authentication.registration.passport.personal.ExtraPersonalInfoFragment
import ua.mycredit.mycredit.ui.authentication.registration.passport.personal.PersonalDataFragment
import ua.mycredit.mycredit.ui.bases.BaseFragment
import ua.mycredit.mycredit.ui.bases.SelfBindingActivity
import ua.mycredit.mycredit.ui.bases.ViewModelFragment
import ua.mycredit.mycredit.ui.bases.input.FormViewModel
import ua.mycredit.mycredit.ui.profile.profile.details.DetailsActivity.Page.*

class DetailsActivity : SelfBindingActivity<ActivityDetailsBinding>() {

    override val layoutId = R.layout.activity_details
    override val navigator: Navigator = NavigatorImpl()

    val pagerAdapter: PagerAdapter get() = _pagerAdapter
    val onPageChangeListener: ViewPager.OnPageChangeListener = OnPageChangeListenerImpl()

    val mode get() = intent.extras.getSerializable(EXTRA_MODE) as Mode

    val currentPage = ObservableInt(0)

    private var preValidationMode = false
    private val _pagerAdapter by lazy { PagerAdapterImpl(mode) }
    private lateinit var model: DetailsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        preValidationMode = savedInstanceState == null

        with(binding) {
            toolbar.inflateMenu(R.menu.menu_details)
            tabs.setupWithViewPager(detailsViewPager)
        }

        model = ViewModelProviders.of(this, viewModelFactory).get(DetailsViewModel::class.java)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(KEY_CURRENT_PAGE, currentPage.get())
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        currentPage.set(savedInstanceState.getInt(KEY_CURRENT_PAGE))
    }

    override fun onAttachFragment(fragment: Fragment?) {
        if (preValidationMode) {
            formViewModel(fragment)?.validate(silently = true)
        }
    }

    override fun onBackPressed() {
        when {
            pageForms.none { it.isContentChanged() } && storage.profile.synched ->
                router.exit()

            else -> alert(R.string.warning_leave_profile_editing, R.string.warning) {
                cancelButton { it.dismiss() }
                okButton { router.exit() }
            }.show()
        }
    }

    override fun currentFragment(): Fragment? = _pagerAdapter.currentFragment

    fun onMenuItemClickListener(item: MenuItem): Boolean =
            when {
                item.itemId == R.id.save_details -> {

                    pageForms.indexOfFirst { !it.validate() }.let {
                        when (it) {
                            -1 -> {
                                storage.profile = storage.profile.copy(synched = false)
                                pageForms.forEach(FormViewModel::persist)
                                model.updateProfile()
                            }
                            else -> currentPage.set(it)
                        }
                    }

                    true
                }
                else -> false
            }

    private val pageForms get () = supportFragmentManager.fragments.mapNotNull { formViewModel(it) }

    private fun formViewModel(fragment: Fragment?) =
            ((fragment as? ViewModelFragment<*, *>)?.viewModel as? FormViewModel)

    companion object {
        const val KEY_CURRENT_PAGE = "KEY_CURRENT_PAGE"
        val EXTRA_MODE = "${DetailsActivity::class.java.canonicalName}\$EXTRA_MODE"
    }

    private inner class PagerAdapterImpl(val mode: Mode) : UpdatableFragmentPagerAdapter(supportFragmentManager) {

        var currentFragment: Fragment? = null

        var occupationType = storage.profile.occupationType ?: OccupationType.WORKING
            set(value) {
                field = value
                notifyDataSetChanged()
            }

        override fun getItem(position: Int) = mode.pages[position].createFragment(this)
                .withArguments(BaseFragment.ARG_SCROLL_ENABLED to true)

        override fun getCount() = mode.pages.size

        override fun getPageTitle(position: Int): CharSequence? =
                when (mode.tabs) {
                    0 -> null
                    else -> resources.getStringArray(mode.tabs)[position]
                }

        override fun getItemPosition(obj: Any) = PagerAdapter.POSITION_NONE

        override fun setPrimaryItem(container: ViewGroup, position: Int, obj: Any) {
            if (currentFragment != obj) {
                currentFragment = obj as Fragment
            }
            super.setPrimaryItem(container, position, obj)
        }
    }

    enum class Mode(val tabs: Int, val tabMode: Int, vararg val pages: Page) {
        PERSONAL(R.array.details_tabs_personal, TabLayout.MODE_SCROLLABLE, EXTRA_PERSONAL_INFORMATION, PERSONAL_DATA, PASSPORT, SIGN_UP_ADDRESS),
        OCCUPATION(R.array.details_tabs_occupation, TabLayout.MODE_FIXED, OCCUPATION_TYPE, FINANCE);

        val pagesCount get() = pages.size
    }

    private enum class Page(private val create: (() -> Fragment)?) {
        EXTRA_PERSONAL_INFORMATION(::ExtraPersonalInfoFragment),
        PERSONAL_DATA(::PersonalDataFragment),
        PASSPORT(::PassportFragment),
        SIGN_UP_ADDRESS(::SignUpAddressFragment),
        OCCUPATION_TYPE(::PersonalDataFragment) {
            override fun createFragment(adapter: PagerAdapterImpl) =
                    adapter.occupationType.instantiate()
        },
        FINANCE(::FinanceFragment);

        open fun createFragment(adapter: PagerAdapterImpl): Fragment = create!!()
    }

    private inner class OnPageChangeListenerImpl : ViewPager.SimpleOnPageChangeListener() {

        override fun onPageSelected(position: Int) {
            hideKeyboard()
        }
    }

    private inner class NavigatorImpl : BaseNavigator() {

        override fun onOccupationTypePicked(occupationType: OccupationType) {
            _pagerAdapter.occupationType = occupationType
        }
    }
}
