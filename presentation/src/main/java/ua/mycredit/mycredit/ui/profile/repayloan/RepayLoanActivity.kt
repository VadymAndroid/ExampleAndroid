package ua.mycredit.mycredit.ui.profile.repayloan

import android.content.Context
import android.databinding.ObservableField
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.PagerAdapter
import android.support.v4.view.ViewPager
import org.jetbrains.anko.browse
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.support.v4.withArguments
import org.jetbrains.anko.toast
import ru.terrakok.cicerone.Navigator
import ru.terrakok.cicerone.commands.Command
import ua.mycredit.core.Credit
import ua.mycredit.mycredit.R
import ua.mycredit.mycredit.Screens
import ua.mycredit.mycredit.databinding.ActivityRepayLoanBinding
import ua.mycredit.mycredit.ui.bases.SelfBindingActivity
import ua.mycredit.mycredit.ui.profile.CardsActivity
import ua.mycredit.mycredit.ui.screenKey
import java.io.Serializable

class RepayLoanActivity : SelfBindingActivity<ActivityRepayLoanBinding>() {

    override val layoutId get() = R.layout.activity_repay_loan
    override val navigator: Navigator = NavigatorImpl()

    override val executesPendingBinding = true

    var page = ObservableField(Page.CARD)
    val pagerAdapter: PagerAdapter = PagerAdapterImpl()
    val onPageChangeListener: ViewPager.OnPageChangeListener = OnPageChangeListenerImpl()

    val repaymentType get() = intent.getSerializableExtra(EXTRA_REPAYMENT_TYPE) as RepaymentType

    fun onTabClick(stateField: Page) {
        page.set(stateField)
    }

    override fun onBackPressed() {
        router.exit()
    }

    fun openPaymentScreen() {
        findFragment<RepayByCardFragment>().viewModel.makePayment()
    }


    private inner class NavigatorImpl : BaseNavigator() {

        override fun applyCommand(command: Command) {
            when (command.screenKey()) {
                Screens.IBOX_WEB -> {
                    if (!browse(getString(R.string.ibox_web_url))) {
                        toast(R.string.error_browser)
                    }
                }
                Screens.PREFER_REPAY_AMOUNT_INPUT -> PreferRepayAmountInputDialogFragment().show()
                else -> super.applyCommand(command)
            }
        }

        override fun createActivityIntent(context: Context, screenKey: String, data: Any?) =
                when (screenKey) {
                    Screens.Profile.Cards.CARDS -> intentFor<CardsActivity>()
                    else -> super.createActivityIntent(context, screenKey, data)
                }
    }


    private inner class PagerAdapterImpl : FragmentPagerAdapter(supportFragmentManager) {

        private val pages = enumValues<Page>()

        override fun getCount() = pages.size
        override fun getItem(position: Int) = pages[position].instantiateFragment(repaymentType)
    }


    private inner class OnPageChangeListenerImpl : ViewPager.SimpleOnPageChangeListener() {

        override fun onPageSelected(position: Int) {
            page.set(Page.values()[position])
        }
    }


    enum class Page(val instantiateFragment: (repaymentType: RepaymentType) -> Fragment) {
        CARD({ RepayByCardFragment().withArguments(RepayByCardFragment.ARG_LOAN_ACTION to it) }),
        BANK({ BankFragment().withArguments(BankFragment.ARG_LOAN_ACTION to it) }),
        TERMINAL({ TerminalsFragment() })
    }


    companion object {
        val EXTRA_REPAYMENT_TYPE = "${RepayLoanActivity::class.java.canonicalName}\$EXTRA_REPAYMENT_TYPE"
    }
}


sealed class RepaymentType(val title: Int) : Serializable {

    abstract val credit: Credit

    abstract val amount: Double

    class RepayCredit(override val credit: Credit) : RepaymentType(R.string.credit_repay) {
        override val amount get() = credit.currentDebt
    }

    class ProlongLoan(override val credit: Credit) : RepaymentType(R.string.extension_fee) {
        override val amount get() = credit.prolongationAmount
    }

    class RestructuringStep(override val credit: Credit)
        : RepaymentType(R.string.repay_restructuring) {

        override val amount get() = credit.nextPaymentAmount
    }
}
