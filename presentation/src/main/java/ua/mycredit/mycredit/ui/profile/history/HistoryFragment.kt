package ua.mycredit.mycredit.ui.profile.history

import ua.mycredit.mycredit.R
import ua.mycredit.mycredit.databinding.ListContentBinding
import ua.mycredit.mycredit.ui.bases.ViewModelFragment

class HistoryFragment : ViewModelFragment<HistoryViewModel, ListContentBinding>() {

    override val layoutId: Int get() = R.layout.list_content
    override val viewModelClass get() = HistoryViewModel::class.java
}
