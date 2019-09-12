package ua.mycredit.mycredit.ui.bases

import android.databinding.DataBindingUtil
import android.databinding.ObservableField
import android.databinding.ObservableInt
import android.databinding.ViewDataBinding
import android.support.v7.util.DiffUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.reactivex.observers.DisposableObserver
import ru.terrakok.cicerone.Router
import ua.mycredit.core.BaseUseCase
import ua.mycredit.core.UseCase
import ua.mycredit.mycredit.R
import ua.mycredit.mycredit.ui.bases.action.Refreshable
import ua.mycredit.mycredit.ui.bases.action.WithRefresh
import ua.mycredit.mycredit.ui.bindViewModel


abstract class ListViewModel<I> : BaseViewModel() {

    val recyclerViewAdapter: RecyclerView.Adapter<*> by lazy { createRecyclerViewAdapter() }

    val emptyMessage = ObservableInt()

    protected open val errorText = R.string.error_list_update
    protected open val emptyListText = R.string.empty_list

    open val nestedScrollingEnabled get() = true

    protected open val footerEnabled get() = false

    protected var list = emptyList<I>()
        set(value) {
            val diffResult = DiffUtil.calculateDiff(makeDiffCallback(value))
            field = value
            diffResult.dispatchUpdatesTo(recyclerViewAdapter)
        }

    protected abstract fun makeDiffCallback(newList: List<I>): BaseDiffUtilCallback
    protected abstract fun createRecyclerViewAdapter(): BaseAdapter

    open fun isListEmpty() = list.isEmpty()

    protected fun clear() {
        list = emptyList()
    }

    protected fun notifyListUpdated(new: List<I>) {
        list = new
        emptyMessage.set(emptyListText.takeIf { new.isEmpty() } ?: 0)
        onListUpdateTerminated()
    }

    protected fun notifyUpdateFailed() {

        if (list.isEmpty()) {
            emptyMessage.set(errorText)
        }

        onListUpdateTerminated()
    }

    protected open fun onListUpdateTerminated() {}

    fun syncEmptyMessage(e: Throwable? = null) {
        when {
            list.isEmpty() -> errorText.takeIf { e != null } ?: emptyListText
            else -> 0
        }.let(emptyMessage::set)
    }

    private val List<*>.sizeWithFooter get() = size + (1.takeIf { footerEnabled } ?: 0)


    open class BaseViewHolder<I>(v: View) : RecyclerView.ViewHolder(v) {
        lateinit var router: Router
    }


    abstract class ItemViewHolder<I>(v: View) : BaseViewHolder<I>(v) {
        val item = ObservableField<I>()

        open fun onBind(item: I) {}
    }


    private enum class ViewType {
        ITEM, FOOTER
    }

    abstract inner class BaseAdapter : RecyclerView.Adapter<BaseViewHolder<I>>() {

        protected abstract val itemLayoutId: Int

        abstract fun onCreateItemViewHolder(v: View): BaseViewHolder<I>

        override fun getItemCount() = list.sizeWithFooter

        override fun getItemViewType(position: Int) =
                when (position) {
                    list.size -> ViewType.FOOTER
                    else -> ViewType.ITEM
                }.ordinal

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<I> =
                when (viewType) {
                    ViewType.ITEM.ordinal -> {
                        val binding = DataBindingUtil.inflate<ViewDataBinding>(
                                LayoutInflater.from(parent.context),
                                itemLayoutId,
                                parent,
                                false)

                        onCreateItemViewHolder(binding.root).also { binding.bindViewModel(it) }
                    }

                    else -> onInflateFooter(LayoutInflater.from(parent.context), parent)
                            .let(::BaseViewHolder)
                }

        override fun onBindViewHolder(holder: BaseViewHolder<I>, position: Int) {
            if (holder.itemViewType == ViewType.ITEM.ordinal) {
                (holder as ItemViewHolder).let {
                    it.item.set(list[position])
                    it.router = router
                    it.onBind(list[position])
                }
            }
        }

        protected open fun onInflateFooter(inflater: LayoutInflater, parent: ViewGroup): View =
                LayoutInflater.from(parent.context)
                        .inflate(android.R.layout.simple_list_item_2, parent, false)
    }

    protected abstract inner class BaseDiffUtilCallback(
            private val newList: List<I>
    ) : DiffUtil.Callback() {

        final override fun getNewListSize() = newList.sizeWithFooter
        final override fun getOldListSize() = list.sizeWithFooter

        abstract fun areItemsTheSame(item1: I, item2: I): Boolean
        abstract fun areContentsTheSame(oldItem: I, newItem: I): Boolean

        override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int) =
                isContentItemComparison(oldItemPosition, newItemPosition)
                        && areItemsTheSame(list[oldItemPosition], newList[newItemPosition])
                        || isFooterComparison(oldItemPosition, newItemPosition)

        override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int) =
                isContentItemComparison(oldItemPosition, newItemPosition)
                        && areContentsTheSame(list[oldItemPosition], newList[newItemPosition])
                        || isFooterComparison(oldItemPosition, newItemPosition)

        private fun isContentItemComparison(oldItemPosition: Int, newItemPosition: Int) =
                oldItemPosition < list.size && newItemPosition < newList.size

        private fun isFooterComparison(oldItemPosition: Int, newItemPosition: Int) =
                oldItemPosition == list.size && newItemPosition == newList.size
    }
}

abstract class LazyListViewModel<I> : ListViewModel<I>(), WithRefresh {

    abstract val loadItems: UseCase.ParametrizedUseCase<BaseUseCase.ReloadCriteria, List<I>>

    final override val asRefreshable: Refreshable by lazy { BaseRefreshable() }


    protected inner class BaseRefreshable : LazyRefreshable<List<I>>() {

        override fun doExecute(
                criteria: BaseUseCase.ReloadCriteria,
                o: DisposableObserver<List<I>>
        ) {
            loadItems.execute(criteria, o)
        }

        override fun onValue(value: List<I>) {
            notifyListUpdated(value)
        }

        override fun onError(e: Throwable) {
            notifyRefreshTerminated()
        }
    }
}
