package ua.mycredit.mycredit.ui.profile

import android.os.Bundle
import org.jetbrains.anko.okButton
import org.jetbrains.anko.support.v4.alert
import org.jetbrains.anko.support.v4.withArguments
import ru.terrakok.cicerone.Navigator
import ua.mycredit.mycredit.R
import ua.mycredit.mycredit.Screens
import ua.mycredit.mycredit.ui.bases.BaseActivity
import ua.mycredit.mycredit.ui.bases.WebViewFragment

class WebBankingActivity : BaseActivity() {

    override val layoutId = R.layout.activity_fragment_container
    override val navigator: Navigator = NavigatorImpl()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (savedInstanceState == null) {
            router.replaceScreen(
                    Screens.MY_CREDIT_WEB,
                    intent.getParcelableExtra(EXTRA_PARAMS)
            )
        }
    }

    private inner class NavigatorImpl : BaseNavigator() {

        override fun createFragment(screenKey: String, data: Any?) =
                when (screenKey) {

                    Screens.MY_CREDIT_WEB ->
                        MyCreditWebViewFragment().withArguments(
                                MyCreditWebViewFragment.ARG_PARAMS to data
                        )

                    else -> super.createFragment(screenKey, data)
                }
    }

    companion object {
        val EXTRA_PARAMS = "${WebBankingActivity::class.java.name}.EXTRA_PARAMS"
    }
}


class MyCreditWebViewFragment : WebViewFragment() {

    override val url by lazy { params.url }

    private val params by lazy { arguments!!.getParcelable<Screens.WebBankingParams>(ARG_PARAMS) }

    override fun shouldOverrideUrlLoading(url: String) =
            when {
                url.startsWith("https://mycredit.ua/") -> {
                    alert(params.finishMessage) {
                        okButton { complete() }
                        onCancelled { complete() }
                    }.show()
                    true
                }

                else -> false
            }

    private fun complete() {
        params.nextScreenKey?.let { router.replaceScreen(it) } ?: router.exit()
        events.notifyListeners { it.onBankingCompleted() }
    }


    companion object {
        const val ARG_PARAMS = "ARG_PARAMS"
    }
}
