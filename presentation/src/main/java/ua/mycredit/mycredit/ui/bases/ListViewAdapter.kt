package ua.mycredit.mycredit.ui.bases

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import ua.mycredit.mycredit.BR

open class ListViewAdapter<out VM>(
        val viewModels: List<VM>,
        private val itemLayout: Int
) : BaseAdapter() {

    final override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val binding =
                convertView
                        ?.let { DataBindingUtil.findBinding<ViewDataBinding>(it) }
                        ?: DataBindingUtil.inflate<ViewDataBinding>(
                                LayoutInflater.from(parent.context),
                                itemLayout,
                                parent,
                                false)

        with(binding) {
            setVariable(BR.viewModel, viewModels[position])
            executePendingBindings()
            return root
        }
    }

    final override fun getItem(position: Int) = viewModels[position]
    final override fun getItemId(position: Int) = position.toLong()
    final override fun getCount() = viewModels.size
}
