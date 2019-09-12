package ua.mycredit.mycredit.ui.profile.repayloan

import android.databinding.ObservableField
import android.databinding.ObservableInt
import android.os.Bundle
import ua.mycredit.mycredit.R
import ua.mycredit.mycredit.databinding.FragmentBankBinding
import ua.mycredit.mycredit.ui.bases.BaseViewModel
import ua.mycredit.mycredit.ui.bases.ViewModelFragment
import javax.inject.Inject

class BankFragment : ViewModelFragment<BankFragmentViewModel, FragmentBankBinding>() {

    override val viewModelClass: Class<BankFragmentViewModel> = BankFragmentViewModel::class.java
    override val layoutId: Int = R.layout.fragment_bank
    override val scrollEnabled = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        savedInstanceState
                ?: viewModel.repaymentType.set(arguments?.getSerializable(ARG_LOAN_ACTION) as RepaymentType)
    }

    companion object {
        const val ARG_LOAN_ACTION = "ARG_LOAN_ACTION"
    }
}

class BankFragmentViewModel @Inject constructor() : BaseViewModel() {

    val repaymentType = ObservableField<RepaymentType>()
    val numberOfApply = ObservableInt(231231)
    val dateOfLoan = ObservableField("11.06.20000018")
}
