package ua.mycredit.mycredit.ui.bases

import android.databinding.ObservableBoolean
import android.databinding.ObservableField
import android.support.annotation.CallSuper
import android.support.v7.widget.RecyclerView
import android.view.View

abstract class BaseExpandableItemsAdapter<T, VH : BaseExpandableItemsAdapter<T, VH>.ItemViewHolder>
    : RecyclerView.Adapter<VH>() {

    protected abstract val items: List<T>
    private var expandedItemIndex: Int = -1

    final override fun getItemCount() = items.size

    @CallSuper
    override fun onBindViewHolder(holder: VH, position: Int) {
        with(holder) {
            item.set(items[position])
            expanded.set(position == expandedItemIndex)
        }
    }


    open inner class ItemViewHolder(v: View) : RecyclerView.ViewHolder(v) {

        var item = ObservableField<T>()

        val expanded = ObservableBoolean()

        fun expand() {
            expandedItemIndex = items.indexOf(item.get())
            notifyDataSetChanged()
        }
    }
}
