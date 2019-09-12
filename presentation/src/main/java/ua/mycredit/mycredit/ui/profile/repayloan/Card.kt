package ua.mycredit.mycredit.ui.profile.repayloan

import android.app.Dialog
import android.databinding.ObservableDouble
import android.databinding.ObservableField
import android.os.Bundle
import android.os.Handler
import android.text.InputType
import ua.mycredit.core.Card
import ua.mycredit.core.interactors.GetPaymentUrlUseCase
import ua.mycredit.mycredit.R
import ua.mycredit.mycredit.Screens
import ua.mycredit.mycredit.databinding.FragmentRepayByCardBinding
import ua.mycredit.mycredit.ui.baseActivity
import ua.mycredit.mycredit.ui.bases.BaseViewModel
import ua.mycredit.mycredit.ui.bases.SimpleInputTextDialogFragment
import ua.mycredit.mycredit.ui.bases.ViewModelFragment
import ua.mycredit.mycredit.ui.bases.input.FieldViewModel
import javax.inject.Inject

class RepayByCardFragment : ViewModelFragment<RepayByCardViewModel, FragmentRepayByCardBinding>() {

    override val viewModelClass = RepayByCardViewModel::class.java
    override val layoutId: Int = R.layout.fragment_repay_by_card
    override val scrollEnabled = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (savedInstanceState == null) {
            viewModel.repaymentType = arguments?.getSerializable(ARG_LOAN_ACTION) as RepaymentType
        }
    }

    companion object {
        const val ARG_LOAN_ACTION = "ARG_LOAN_ACTION"
    }
}


class RepayByCardViewModel @Inject constructor(
        private val getPaymentUrl: GetPaymentUrlUseCase
) : BaseViewModel() {

    lateinit var repaymentType: RepaymentType


    val amount by lazy { ObservableDouble(repaymentType.amount) }

    val card = ObservableField<Card>()
    val credit by lazy { repaymentType.credit }

    @Inject
    fun initCard() {
        card.set(storage.selectedCard ?: storage.cards.value.find { it.main && it.verified })
    }

    override fun onCardSelected(card: Card) {
        this.card.set(card)
    }

    override fun onBankingCompleted() {
        Handler().post {
            // HACK! Cicerone issues
            router.exit()
        }
    }

    fun makePayment() {
        when (card.get()) {
            null -> goToCardsList()
            else ->
                getPaymentUrl.execute(
                        GetPaymentUrlUseCase.Params(card.get()!!, amount.get()),
                        GetPaymentUrlObserver()
                )
        }
    }

    fun changeAmount() {
        when (repaymentType) {
            is RepaymentType.RepayCredit -> Screens.PREFER_REPAY_AMOUNT_INPUT to null
            is RepaymentType.ProlongLoan -> Screens.ALERT to R.string.message_prolongation_amount_is_immutable
            is RepaymentType.RestructuringStep -> Screens.ALERT to R.string.message_restructuring_step_amount_is_immutable
        }.let {
            router.navigateTo(it.first, it.second)
        }
    }

    fun goToCardsList() {
        router.navigateTo(Screens.Profile.Cards.CARDS)
    }

    private inner class GetPaymentUrlObserver : BaseSingleObserver<String>() {

        override val progressMode = ProgressMode.DIALOG

        override fun onSuccess(t: String) {
            super.onSuccess(t)
            router.navigateTo(
                    Screens.WEB_BANKING,
                    Screens.WebBankingParams(t, R.string.message_payment_completed)
            )
        }
    }
}


class PreferRepayAmountInputDialogFragment : SimpleInputTextDialogFragment() {

    private val owner: RepayByCardViewModel
        get() =
            baseActivity.findFragment<RepayByCardFragment>().viewModel

    override val titleId = R.string.prefer_amount

    override val field = FieldViewModel(
            hint = R.string.amount,
            inputType = InputType.TYPE_CLASS_NUMBER or InputType.TYPE_NUMBER_FLAG_DECIMAL,
            conditions = setOf(
                    FieldViewModel.ConditionChecker(
                            R.string.error_wrong_amount,
                            Regex("^[1-9][0-9]*(.[0-9]{1,2})?$")::matches
                    ),
                    FieldViewModel.ConditionChecker(R.string.error_amount_exceeded) {
                        toString().toDouble() <= owner.repaymentType.amount
                    }
            )
    )

    override fun onDialogCreated(dialog: Dialog) {
        super.onDialogCreated(dialog)
        field.setValue(owner.amount.get().toString())
    }

    override fun onInputCompleted(value: String) {
        owner.amount.set(field.value().toDouble())
        dismiss()
    }
}
