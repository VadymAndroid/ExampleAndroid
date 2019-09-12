package ua.mycredit.mycredit.ui.profile

import android.Manifest
import android.annotation.SuppressLint
import android.arch.lifecycle.Observer
import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.databinding.ObservableBoolean
import android.databinding.ObservableField
import android.databinding.ObservableInt
import android.net.Uri
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.PagerAdapter
import android.view.ViewGroup
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationAdapter
import com.tbruyelle.rxpermissions2.RxPermissions
import org.jetbrains.anko.*
import org.joda.time.LocalDate
import ru.terrakok.cicerone.commands.Command
import ua.mycredit.core.*
import ua.mycredit.mycredit.BuildConfig
import ua.mycredit.mycredit.R
import ua.mycredit.mycredit.Screens
import ua.mycredit.mycredit.databinding.ActivityProfileBinding
import ua.mycredit.mycredit.internal.analytics.CustomAnalyticEvent
import ua.mycredit.mycredit.ui.bases.SelfBindingActivity
import ua.mycredit.mycredit.ui.calculator.CalculatorActivity
import ua.mycredit.mycredit.ui.logEvent
import ua.mycredit.mycredit.ui.profile.cards.CardsFragment
import ua.mycredit.mycredit.ui.profile.credit.AgreementActivity
import ua.mycredit.mycredit.ui.profile.credit.StatusFragment
import ua.mycredit.mycredit.ui.profile.credit.StatusViewModel.ScrollToCommand.Argument.MY_CARDS
import ua.mycredit.mycredit.ui.profile.credit.StatusViewModel.ScrollToCommand.Argument.PROFILE
import ua.mycredit.mycredit.ui.profile.history.HistoryFragment
import ua.mycredit.mycredit.ui.profile.profile.ProfileFragment
import ua.mycredit.mycredit.ui.profile.profile.ProlongationPreferencesActivity
import ua.mycredit.mycredit.ui.profile.profile.contacts.ContactsActivity
import ua.mycredit.mycredit.ui.profile.profile.details.DetailsActivity
import ua.mycredit.mycredit.ui.profile.profile.details.DetailsActivity.Companion.EXTRA_MODE
import ua.mycredit.mycredit.ui.profile.profile.details.DetailsActivity.Mode.OCCUPATION
import ua.mycredit.mycredit.ui.profile.profile.details.DetailsActivity.Mode.PERSONAL
import ua.mycredit.mycredit.ui.profile.profile.faq.FaqActivity
import ua.mycredit.mycredit.ui.profile.repayloan.RepayLoanActivity
import ua.mycredit.mycredit.ui.profile.repayloan.RepayLoanActivity.Companion.EXTRA_REPAYMENT_TYPE
import ua.mycredit.mycredit.ui.profile.repayloan.RepaymentType
import ua.mycredit.mycredit.ui.screenKey
import ua.mycredit.mycredit.ui.transitionData


class ProfileActivity : SelfBindingActivity<ActivityProfileBinding>() {

    override val layoutId = R.layout.activity_profile
    override val navigator: BaseNavigator = NavigatorImpl()

    override val executesPendingBinding get() = true

    val currentItem = ObservableInt()
    val toolbarTitle = ObservableField<CharSequence>()

    var chatHideOrOpen = ObservableBoolean(false)

    val pagerAdapter: PagerAdapter by lazy(::FragmentAdapterImpl)
    val navigationMenuAdapter by lazy { AHBottomNavigationAdapter(this, R.menu.menu_profile) }

    override fun onAttachFragment(fragment: Fragment) {
        super.onAttachFragment(fragment)
        (fragment as? StatusFragment)
                ?.viewModel
                ?.let { viewModel ->
                    viewModel
                            .scrollTo
                            .observe(this, Observer { command ->
                                when (command?.argument) {
                                    PROFILE -> PROFILE_PAGE
                                    MY_CARDS -> MY_CARDS_PAGE
                                    else -> null
                                }?.let {
                                    currentItem.set(it)
                                    binding.bottomNavigationView.setCurrentItem(it, false)
                                }
                            })
                }
    }

    fun onTabSelected(position: Int): Boolean {
        currentItem.set(position)
        setupToolbarTitle(position)
        return true
    }

    fun pickCreditStatus() {
        if (BuildConfig.DEBUG) {
            router.navigateTo(Screens.Profile.PICK_CREDIT_STATUS)
        }
    }

    private fun setupToolbarTitle(pos: Int) {
        toolbarTitle.set(navigationMenuAdapter.getMenuItem(pos).title)
    }

    fun pickMessageMyCreditTeam() {
        if(chatHideOrOpen.get()){
            chatHideOrOpen.set(false)
        } else {
            chatHideOrOpen.set(true)
        }
    }

    fun openViberChat(){
        router.navigateTo(Screens.Profile.FAQ_WEB_VIBER)
    }

    fun openTelegramChat(){
        router.navigateTo(Screens.Profile.FAQ_WEB_TELEGRAM)
    }

    fun openFacebookChat(){
        router.navigateTo(Screens.Profile.FAQ_WEB_FACEBOOK)
    }

    companion object {
        const val PROFILE_PAGE = 2
        const val MY_CARDS_PAGE = 3
    }

    private inner class FragmentAdapterImpl : FragmentPagerAdapter(supportFragmentManager) {

        private val fragments = arrayOf(StatusFragment(), HistoryFragment(), ProfileFragment(), CardsFragment())

        init {
            if (fragments[PROFILE_PAGE] !is ProfileFragment ||
                    fragments[MY_CARDS_PAGE] !is CardsFragment) {
                throw IllegalStateException()
            }
        }

        override fun getItem(position: Int): Fragment = fragments[position]

        override fun getCount() = fragments.size

        override fun setPrimaryItem(container: ViewGroup, position: Int, obj: Any) {
            super.setPrimaryItem(container, position, obj)
            setupToolbarTitle(position)
        }
    }


    private inner class NavigatorImpl : BaseNavigator() {

        @SuppressLint("StringFormatInvalid")
        override fun applyCommand(command: Command) {
            when (command.screenKey()) {

                Screens.Profile.FAQ_WEB -> if (!browse(getString(R.string.faq_web_url))) {
                    toast(R.string.error_browser)
                }

                Screens.Profile.FAQ_WEB_PP -> if (!browse(getString(R.string.faq_web_url_pp))) {
                    toast(R.string.error_browser)
                }

                Screens.Profile.FAQ_WEB_VIBER -> try {
                    startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.viber_link))))
                } catch (ex: ActivityNotFoundException) {
                    try {
                        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=com.viber.voip")))
                    } catch (ex: ActivityNotFoundException) {
                        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.viber.voip")))
                    }
                }

                Screens.Profile.FAQ_WEB_TELEGRAM -> if (!browse(getString(R.string.telegram_link))) {
                        toast(R.string.error_browser)
                    }

                Screens.Profile.FAQ_WEB_FACEBOOK -> if (!browse(getString(R.string.facebook_link))) {
                    toast(R.string.error_browser)
                }

                Screens.Profile.PICK_CREDIT_STATUS -> {

                    val restructuredCredit = Credit("1", "100", 12, 700.0, 4000.0, 4000.23, 14)
                    val activeCredit = Credit("1", "100", 7, 700.0, 4000.0, 4000.23, 14, finishDateIso = LocalDate.now().plusDays(31).toString())
                    val pastCredit = Credit("1", "100", 8, 700.0, 4000.0, 4000.23, 14)

                    val statuses = listOf(
                            NoCredits(1000, 1200.0, 1500, LocalDate.now().plusDays(31)),
                            AutoProcessing(activeCredit),
                            WaitingForApproval(activeCredit),
                            WaitingForAgreement(activeCredit),
                            Rejected(activeCredit, 3),
                            Rejected(activeCredit, 7),
                            Rejected(activeCredit, 17),
                            NoContact(activeCredit),
                            RejectUnprocessedLoans(activeCredit),
                            Approved(3, activeCredit),
                            DisbursementInProgress(activeCredit),
                            DisbursementFailed(activeCredit),
                            Active(activeCredit),
                            PastDue(pastCredit.copy(pastDueDays = 19)),
                            PastDue(pastCredit.copy(pastDueDays = 13)),
                            Sold(),
                            Closed(activeCredit),
                            AgreementExpired(activeCredit),
                            PendingProlongation(activeCredit),
                            Restructured(
                                    restructuredCredit.copy(
                                            schedulesRestructure = listOf(
                                                    Schedule(100.5),
                                                    Schedule(100.5),
                                                    Schedule(100.5),
                                                    Schedule(100.5)
                                            )
                                    )
                            ),
                            Restructured(
                                    restructuredCredit.copy(
                                            schedulesRestructure = listOf(
                                                    Schedule(1200.0, closed = true),
                                                    Schedule(1200.0, closed = true),
                                                    Schedule(1200.0, closed = true),
                                                    Schedule(1200.0)
                                            )
                                    )
                            ),
                            Restructured(
                                    restructuredCredit.copy(
                                            schedulesRestructure = listOf(
                                                    Schedule(98.35, closed = true),
                                                    Schedule(98.35, closed = true),
                                                    Schedule(98.35, closed = true),
                                                    Schedule(98.35),
                                                    Schedule(98.35),
                                                    Schedule(98.35)
                                            )
                                    )
                            ),
                            Restructured(
                                    restructuredCredit.copy(
                                            schedulesRestructure = listOf(
                                                    Schedule(880.95, closed = true),
                                                    Schedule(880.95, closed = true),
                                                    Schedule(880.91),
                                                    Schedule(880.95),
                                                    Schedule(880.95),
                                                    Schedule(880.95),
                                                    Schedule(880.95),
                                                    Schedule(880.95),
                                                    Schedule(880.95),
                                                    Schedule(880.95)
                                            )
                                    )
                            )
                    )

                    selector("Шаги жизненного цикла кредита",
                            statuses.map {
                                when (it) {
                                    is Restructured -> "Restructured(${it.repaidPartsCount}/${it.totalPartsCount} ${it.nextPaymentAmount})"
                                    is Rejected -> "Rejected ${it.progressStep}"
                                    is PastDue -> "PastDue ${it.progressStep}"
                                    else -> it.javaClass.simpleName
                                }
                            }) { _, idx ->
                        findFragment<StatusFragment>().viewModel.status.set(statuses[idx])
                    }
                }

                Screens.AGREEMENT_PERMISSIONS_REQUEST -> {

                    RxPermissions(this@ProfileActivity)
                            .request(Manifest.permission.WRITE_EXTERNAL_STORAGE)
                            .filter { it }
                            .subscribe { router.navigateTo(Screens.AGREEMENT, command.transitionData()) }
                }

                Screens.PROLONGATION_PAY_INTERESTS -> {
                    alert(getString(R.string.message_prolong_interests_repayment_required,
                            getString(R.string.select_prolongation_date)),
                            getString(R.string.prolongation_payment)
                    ) {

                        positiveButton(R.string.go_to_repay) {
                            logEvent(CustomAnalyticEvent.CLICK_GO_TO_PROLONG_LOAN)
                            router.navigateTo(
                                    Screens.REPAY_LOAN,
                                    RepaymentType.ProlongLoan(command.transitionData() as Credit)
                            )
                        }
                        cancelButton {}

                    }.replace()
                }

                else -> super.applyCommand(command)
            }
        }

        override fun createActivityIntent(context: Context, screenKey: String, data: Any?): Intent? =
                when (screenKey) {
                    Screens.CALCULATOR -> intentFor<CalculatorActivity>().clearTask().newTask()
                    Screens.Profile.Contacts.CONTACTS -> intentFor<ContactsActivity>()
                    Screens.Profile.DETAILS_PERSONAL -> intentFor<DetailsActivity>(EXTRA_MODE to PERSONAL)
                    Screens.Profile.DETAILS_OCCUPATION -> intentFor<DetailsActivity>(EXTRA_MODE to OCCUPATION)
                    Screens.Profile.FAQ -> intentFor<FaqActivity>()
                    Screens.REPAY_LOAN -> intentFor<RepayLoanActivity>(EXTRA_REPAYMENT_TYPE to data as RepaymentType)
                    Screens.AGREEMENT -> intentFor<AgreementActivity>(
                            AgreementActivity.EXTRA_AGREEMENT_TYPE to data as AgreementType
                    )

                    Screens.PROLONGATION_PREFERENCES ->
                        intentFor<ProlongationPreferencesActivity>(
                                ProlongationPreferencesActivity.EXTRA_PROLONGATION to data
                        )

                    else -> super.createActivityIntent(context, screenKey, data)
                }
    }
}
