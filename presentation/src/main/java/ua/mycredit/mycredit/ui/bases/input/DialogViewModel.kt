package ua.mycredit.mycredit.ui.bases.input

import android.arch.lifecycle.ViewModelProvider
import android.databinding.ObservableBoolean
import android.databinding.ObservableField
import ua.mycredit.mycredit.R
import ua.mycredit.mycredit.ui.FadeOut
import ua.mycredit.mycredit.ui.baseActivity
import ua.mycredit.mycredit.ui.bases.BaseBindingDialogFragment
import javax.inject.Inject

abstract class DialogViewModel : Validable {

    open val hintRes = R.string.hint_select

    val error = ObservableBoolean(false)

    val fadeOut = ObservableField<FadeOut>()

    abstract val titleRes: Int

    abstract fun pick()
    abstract fun onValidate(): Boolean

    final override fun validate() =
            onValidate().also { valid ->
                if (!valid) {
                    error.set(true)
                    fadeOut.set(FadeOut)
                }
            }
}


abstract class BaseInputDialogFragment : BaseBindingDialogFragment() {

    @Inject lateinit var viewModelFactory: ViewModelProvider.Factory

    val fieldViewModel get() = fieldReference.dereference(baseActivity.supportFragmentManager) as DialogViewModel

    private val fieldReference get() = arguments!!.getParcelable<FormViewModel.FieldReference>(ARG_FIELD_REFERENCE)

    companion object {
        const val ARG_FIELD_REFERENCE = "ARG_FIELD_REFERENCE"
    }
}
