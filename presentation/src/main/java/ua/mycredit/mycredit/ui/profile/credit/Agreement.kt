package ua.mycredit.mycredit.ui.profile.credit

import android.annotation.SuppressLint
import android.app.Activity
import android.databinding.ObservableField
import android.os.Bundle
import com.orhanobut.hawk.Hawk
import org.jetbrains.anko.alert
import org.jetbrains.anko.cancelButton
import org.jetbrains.anko.okButton
import org.jetbrains.anko.webView
import org.joda.time.DateTime
import ru.terrakok.cicerone.Navigator
import ru.terrakok.cicerone.commands.Command
import ua.mycredit.core.AgreementType
import ua.mycredit.core.interactors.AcceptAgreementUseCase
import ua.mycredit.core.interactors.CPAUseCase
import ua.mycredit.core.interactors.GetAgreementUseCase
import ua.mycredit.mycredit.BuildConfig
import ua.mycredit.mycredit.R
import ua.mycredit.mycredit.Screens
import ua.mycredit.mycredit.databinding.FragmentAgreementBinding
import ua.mycredit.mycredit.internal.analytics.CustomAnalyticEvent
import ua.mycredit.mycredit.ui.bases.BaseActivity
import ua.mycredit.mycredit.ui.bases.BaseViewModel
import ua.mycredit.mycredit.ui.bases.ViewModelFragment
import ua.mycredit.mycredit.ui.bases.action.SetupToolbarAction
import ua.mycredit.mycredit.ui.logEvent
import ua.mycredit.mycredit.ui.notNullGet
import ua.mycredit.mycredit.ui.screenKey
import java.io.File
import javax.inject.Inject

class AgreementActivity : BaseActivity() {

    override val layoutId = R.layout.activity_agreement
    override val navigator: Navigator = NavigatorImpl()

    private val agreementType
        get() = intent.extras.getSerializable(EXTRA_AGREEMENT_TYPE) as AgreementType

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        SetupToolbarAction(R.string.agreement).perform(this)
        savedInstanceState
                ?: findFragment<AgreementFragment>()
                        .viewModel
                        .getAgreement(agreementType)
    }


    private inner class NavigatorImpl : BaseNavigator() {

        override fun applyCommand(command: Command) {
            when (command.screenKey()) {
                Screens.ACCEPT_AGREEMENT -> {
                    alert(R.string.message_agreement_accepting) {
                        okButton {
                            sendAnalyticEvent()
                            jsScriptPixelDo()
                            findFragment<AgreementFragment>().viewModel.sendCPA()
                            findFragment<AgreementFragment>().viewModel.acceptAgreement()
                        }
                        cancelButton {}
                    }.show()
                }
                else -> super.applyCommand(command)
            }
        }
    }


    fun sendAnalyticEvent(){

        when {
            !BuildConfig.DEBUG -> {
                logEvent(CustomAnalyticEvent.CLICK_OK_ACCEPT_AGREEMENT) {
                    putString("agreement_type", agreementType.javaClass.simpleName)
                }
                when (findFragment<AgreementFragment>().viewModel.getCountClosedLoanFromTheList()) {
                    0 -> logEvent(CustomAnalyticEvent.CLICK_OK_ACCEPT_AGREEMENT_FIRST)
                    else -> logEvent(CustomAnalyticEvent.CLICK_OK_ACCEPT_AGREEMENT_REPEATED)
                }
            }
        }
    }

    companion object {
        val EXTRA_AGREEMENT_TYPE = "${Activity::class.java.canonicalName}\$EXTRA_AGREEMENT_TYPE"
    }

    @SuppressLint("SetJavaScriptEnabled")
    fun jsScriptPixelDo(){
        webView().loadUrl(getString(R.string.get_web_html_file))
        webView().settings.javaScriptEnabled = true
    }
}


class AgreementFragment : ViewModelFragment<AgreementViewModel, FragmentAgreementBinding>() {
    override val layoutId = R.layout.fragment_agreement
    override val viewModelClass = AgreementViewModel::class.java
}


class AgreementViewModel @Inject constructor(
        private val getAgreement: GetAgreementUseCase,
        private val acceptAgreement: AcceptAgreementUseCase,
        private val cpaUseCase: CPAUseCase
) : BaseViewModel() {

    val file = ObservableField<File>()
    val agreementType = ObservableField<AgreementType>()

    fun getAgreement(agreementType: AgreementType) {
        this.agreementType.set(agreementType)
        getAgreement.execute(agreementType, AgreementObserver())
    }

    fun showAcceptingDialog() {
        router.navigateTo(Screens.ACCEPT_AGREEMENT)
    }

    fun acceptAgreement() {
        acceptAgreement.execute(
                agreementType.notNullGet(),
                AcceptAgreementObserver()
        )
    }

    private inner class AgreementObserver : BaseSingleObserver<File>() {

        override fun onSuccess(t: File) {
            super.onSuccess(t)
            file.set(t)
        }

        override fun onHandleError(e: Throwable): Boolean {
            router.exitWithMessage(messagesMapper.transform(R.string.error_download_agreement))
            return true
        }
    }


    fun sendCPA() {
        val uri = Hawk.get<String>("uriCPA")
        if(uri!= null){
            profile
            val promo: String = if(storage.promoCode != "") { "1" }else { "0" }
            cpaUseCase.execute(CPAUseCase.Params(uri, agreementType.get()!!.creditId, promo, "0"), DeviceContactObserver())
            Hawk.put("uriCPA", null)
        }
    }

    private inner class DeviceContactObserver : NoResponseFromServerCompletableObserver()


    private inner class AcceptAgreementObserver : BaseCompletableObserver(
            R.string.agreement_was_successfully_signed,
            true) {

        override fun onComplete() {
            super.onComplete()
            storage.agreementTime = DateTime.now()
            events.notifyListeners { it.onAgreementAccepted() }
        }
    }
}
