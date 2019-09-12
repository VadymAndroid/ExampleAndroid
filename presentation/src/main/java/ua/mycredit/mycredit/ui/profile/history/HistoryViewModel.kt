package ua.mycredit.mycredit.ui.profile.history

import android.view.View
import ua.mycredit.core.Credit
import ua.mycredit.core.interactors.LoadHistoryUseCase
import ua.mycredit.mycredit.R
import ua.mycredit.mycredit.ui.bases.LazyListViewModel
import ua.mycredit.mycredit.ui.bases.ListViewModel
import ua.mycredit.mycredit.ui.bases.action.WithRefresh
import ua.mycredit.mycredit.ui.bases.action.refresh
import javax.inject.Inject

class HistoryViewModel @Inject constructor(
        override val loadItems: LoadHistoryUseCase
) : LazyListViewModel<Credit>(), WithRefresh {

    override val emptyListText = R.string.you_do_not_have_credits

    override fun makeDiffCallback(newList: List<Credit>): BaseDiffUtilCallback =
            DiffUtilCallbackImpl(newList)

    override fun createRecyclerViewAdapter(): BaseAdapter = AdapterImpl()

    override fun onStatusUpdated() {
        refresh()
    }


    inner class LoanViewHolder(v: View) : ListViewModel.ItemViewHolder<Credit>(v)


    private inner class AdapterImpl : BaseAdapter() {

        override val itemLayoutId get() = R.layout.item_history
        override fun onCreateItemViewHolder(v: View) = LoanViewHolder(v)
    }


    private inner class DiffUtilCallbackImpl(newList: List<Credit>)
        : BaseDiffUtilCallback(newList) {

        override fun areItemsTheSame(item1: Credit, item2: Credit) = item1.id == item2.id

        override fun areContentsTheSame(oldItem: Credit, newItem: Credit) =
                oldItem.amount == newItem.amount &&
                        oldItem.creationDate == newItem.creationDate &&
                        oldItem.currentDebt == newItem.currentDebt &&
                        oldItem.status == newItem.status &&
                        oldItem.term == newItem.term
    }
}
