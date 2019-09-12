package ua.mycredit.mycredit.ui.bases

import android.app.Dialog
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.annotation.CallSuper
import android.support.v7.app.AlertDialog
import android.view.LayoutInflater
import android.view.View
import android.view.WindowManager
import dagger.android.support.DaggerAppCompatDialogFragment
import org.jetbrains.anko.support.v4.ctx
import ru.terrakok.cicerone.Router
import ua.mycredit.core.LocalStorage
import ua.mycredit.mycredit.AppEvents
import ua.mycredit.mycredit.R
import ua.mycredit.mycredit.ui.bases.input.FieldViewModel
import ua.mycredit.mycredit.ui.bindViewModel
import javax.inject.Inject

abstract class BaseDialogFragment2 : DaggerAppCompatDialogFragment() {

    protected abstract val layoutId: Int

    @Inject lateinit var router: Router
    @Inject lateinit var storage: LocalStorage
    @Inject lateinit var events: AppEvents

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog =
            AlertDialog.Builder(ctx)
                    .setView(LayoutInflater.from(ctx)
                            .inflate(layoutId, null)
                            .also(::onDialogViewCreated))
                    .create()
                    .also(::onDialogCreated)

    @CallSuper
    protected open fun onDialogViewCreated(view: View) {
    }

    protected open fun onDialogCreated(dialog: Dialog) {}
}

abstract class BaseBindingDialogFragment2 : BaseDialogFragment2() {

    protected abstract val viewModel: Any

    override fun onDialogViewCreated(view: View) {
        super.onDialogViewCreated(view)
        DataBindingUtil.bind<ViewDataBinding>(view)!!.bindViewModel(viewModel)
    }
}

abstract class SelfBindingDialogFragment2 : BaseBindingDialogFragment2() {
    final override val viewModel get() = this
}

abstract class SimpleInputTextDialogFragment : SelfBindingDialogFragment2() {

    override val layoutId get() = R.layout.dialog_fragment_simple_input_text

    abstract val titleId: Int
    abstract val field: FieldViewModel

    protected abstract fun onInputCompleted(value: String)

    override fun onDialogCreated(dialog: Dialog) {
        super.onDialogCreated(dialog)
        dialog.window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE)
    }

    fun tryToComplete() {
        if (field.validate()) {
            onInputCompleted(field.value())
            dismiss()
        }
    }
}
