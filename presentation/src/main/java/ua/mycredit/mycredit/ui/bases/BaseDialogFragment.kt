package ua.mycredit.mycredit.ui.bases

import android.app.Dialog
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.LayoutInflater
import dagger.android.support.DaggerAppCompatDialogFragment
import org.jetbrains.anko.support.v4.ctx
import ua.mycredit.mycredit.ui.bindViewModel

@Deprecated("Use BaseDialogFragment2 instead")
open class BaseDialogFragment : DaggerAppCompatDialogFragment() {

    protected open val cancelable get() = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        isCancelable = cancelable
    }
}

abstract class BaseBindingDialogFragment : BaseDialogFragment() {

    abstract val layoutId: Int

    protected lateinit var binding: ViewDataBinding

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog =
            DataBindingUtil.inflate<ViewDataBinding>(LayoutInflater.from(ctx), layoutId, null, false)
                    .also { binding = it }
                    .bindViewModel(this)
                    .let {
                        AlertDialog.Builder(ctx)
                                .setView(it)
                                .create()
                    }
                    .also(::onDialogCreated)

    protected open fun onDialogCreated(dialog: Dialog) {}
}
