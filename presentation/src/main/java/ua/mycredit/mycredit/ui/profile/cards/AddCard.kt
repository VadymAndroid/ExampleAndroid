package ua.mycredit.mycredit.ui.profile.cards

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.Observer
import android.content.Context
import android.databinding.ObservableBoolean
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentTransaction
import org.jetbrains.anko.alert
import org.jetbrains.anko.support.v4.act
import org.jetbrains.anko.support.v4.withArguments
import ru.terrakok.cicerone.Navigator
import ru.terrakok.cicerone.commands.Command
import ua.mycredit.core.*
import ua.mycredit.mycredit.R
import ua.mycredit.mycredit.Screens
import ua.mycredit.mycredit.databinding.ActivityAddCardBinding
import ua.mycredit.mycredit.databinding.FragmentCardFrontBinding
import ua.mycredit.mycredit.databinding.FragmentCardSmsConfirmationBinding
import ua.mycredit.mycredit.ui.authentication.registration.card.CardBackViewModel
import ua.mycredit.mycredit.ui.authentication.registration.card.CardFrontFragment
import ua.mycredit.mycredit.ui.bases.SelfBindingActivity
import ua.mycredit.mycredit.ui.bases.ViewModelFragment
import ua.mycredit.mycredit.ui.bases.action.SetupToolbarAction
import ua.mycredit.mycredit.ui.bases.input.BaseSmsCodeViewModel
import ua.mycredit.mycredit.ui.screenKey
import javax.inject.Inject

class AddCardActivity : SelfBindingActivity<ActivityAddCardBinding>(), NewCardBackFragment.Callback {

    override val layoutId get() = R.layout.activity_add_card
    override val navigator: Navigator = NavigatorImpl()

    val smsInputVisible = ObservableBoolean()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        savedInstanceState ?: router.replaceScreen(Screens.Profile.Cards.NEW_CARD_FRONT)
        SetupToolbarAction(R.string.new_card).perform(this)
    }

    override fun onSmsVerificationRequired() {
        smsInputVisible.set(true)
    }

    fun handleNextClick() {
        currentFragment().let {
            when (it) {
                is NewCardBackFragment -> it.validate()
                is NewCardFrontFragment -> it.validate()
            }
        }
    }

    private inner class NavigatorImpl : BaseNavigator() {

        override fun applyCommand(command: Command) {
            when (command.screenKey()) {

                Screens.Profile.Cards.BANK_SUPPORT_ALERT ->
                    alert(R.string.contact_support, R.string.no_bank_sms_question)
                            .replace()

                else -> super.applyCommand(command)
            }
        }

        override fun createFragment(screenKey: String, data: Any?): Fragment? =
                when (screenKey) {
                    Screens.Profile.Cards.NEW_CARD_FRONT -> NewCardFrontFragment()
                    Screens.Profile.Cards.NEW_CARD_BACK -> NewCardBackFragment()
                            .withArguments(NewCardBackFragment.ARG_CARD to data)
                    else -> super.createFragment(screenKey, data)
                }

        override fun setupFragmentTransactionAnimation(
                command: Command,
                currentFragment: Fragment?,
                nextFragment: Fragment?,
                fragmentTransaction: FragmentTransaction) {
            when {

                command.screenKey() in setOf(
                        Screens.Profile.Cards.NEW_CARD_FRONT,
                        Screens.Profile.Cards.NEW_CARD_BACK) ->
                    fragmentTransaction.setCustomAnimations(
                            R.animator.card_flip_right_in,
                            R.animator.card_flip_right_out,
                            R.animator.card_flip_left_in,
                            R.animator.card_flip_left_out)

                else -> super.setupFragmentTransactionAnimation(command, currentFragment, nextFragment, fragmentTransaction)
            }
        }
    }
}


class NewCardFrontFragment : CardFrontFragment() {

    override fun onValidated(card: Card) {
        router.navigateTo(Screens.Profile.Cards.NEW_CARD_BACK, card)
    }
}


class NewCardBackFragment : ViewModelFragment<NewCardBackViewModel, FragmentCardFrontBinding>() {

    override val layoutId get() = R.layout.fragment_card_back
    override val viewModelClass get() = NewCardBackViewModel::class.java

    val card get() = arguments!!.getSerializable(ARG_CARD) as Card

    private val callback get() = act as Callback

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        viewModel.card = card
        viewModel.smsVerificationRequired.observe(this, Observer { _ ->
            callback.onSmsVerificationRequired()
        })
    }

    fun validate() {
        viewModel.validate()
    }


    companion object {
        const val ARG_CARD = "ARG_CARD"
    }


    interface Callback {
        fun onSmsVerificationRequired()
    }
}

class NewCardBackViewModel @Inject constructor() : CardBackViewModel() {

    val smsVerificationRequired = MutableLiveData<Unit>()

    override fun onValidated() {
        verifyCard.execute(card.copy(cvv = cvv.get()), AddCardObserver())
    }

    private inner class AddCardObserver : BaseSingleObserver<CardVerificationType>() {

        override fun onSuccess(t: CardVerificationType) {
            super.onSuccess(t)
            when (t) {

                is ByUrl -> router.replaceScreen(
                        Screens.WEB_BANKING,
                        Screens.WebBankingParams(t.url, R.string.message_card_verification_redirect)
                )

                is BySms -> smsVerificationRequired.postValue(Unit)
                is Automatically -> {
                    router.finishChain()
                    router.showSystemMessage(messagesMapper.transform(R.string.message_card_added_successfully))
                    events.notifyListeners { it.onCardVerified() }
                }
            }

            events.notifyListeners { it.onCardAdded() }
        }
    }
}


class CardSmsConfirmationFragment : ViewModelFragment<CardSmsConfirmationViewModel, FragmentCardSmsConfirmationBinding>() {
    override val layoutId get() = R.layout.fragment_card_sms_confirmation
    override val viewModelClass get() = CardSmsConfirmationViewModel::class.java
}


class CardSmsConfirmationViewModel @Inject constructor() : BaseSmsCodeViewModel() {

    override fun onReadyToSend() {
        router.navigateTo(Screens.ERROR, "Sms validation is not implemented yet")
    }

    fun showContactSupportAlert() {
        router.navigateTo(Screens.Profile.Cards.BANK_SUPPORT_ALERT)
    }
}
