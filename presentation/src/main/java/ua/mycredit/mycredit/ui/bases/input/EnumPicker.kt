package ua.mycredit.mycredit.ui.bases.input

import android.app.Dialog
import android.databinding.Observable
import android.databinding.ObservableField
import android.databinding.ObservableInt
import android.os.Bundle
import android.support.annotation.ArrayRes
import android.support.v4.app.DialogFragment
import android.support.v7.app.AlertDialog
import android.view.LayoutInflater
import org.jetbrains.anko.support.v4.ctx
import ua.mycredit.mycredit.databinding.IncomeFieldsBinding
import ua.mycredit.mycredit.ui.bindViewModel

sealed class PickerDialogViewModel : DialogViewModel() {

    val pickedIndex = ObservableInt(-1)

    @get:ArrayRes
    abstract val titlesRes: Int
}


abstract class EnumPickerDialogViewModel<E : Enum<E>> : PickerDialogViewModel() {

    abstract val variants: Array<out E>

    val picked = ObservableField<E>()

    init {
        picked.addOnPropertyChangedCallback(OnPickedItemChangedCallback())
    }

    override fun onValidate() = pickedIndex.get() > -1

    fun notifyPicked(position: Int) {
        picked.set(variants[position])
    }

    private inner class OnPickedItemChangedCallback : Observable.OnPropertyChangedCallback() {

        override fun onPropertyChanged(sender: Observable?, propertyId: Int) {
            pickedIndex.set(picked.get()?.ordinal ?: -1)
            error.set(false)
        }
    }
}


class EnumPickerDialogFragment : DialogFragment() {

    lateinit var picker: EnumPickerDialogViewModel<*>

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog =
            IncomeFieldsBinding.inflate(LayoutInflater.from(ctx))
                    .bindViewModel(picker)
                    .let {
                        AlertDialog.Builder(ctx)
                                .setTitle(picker.titleRes)
                                .create()
                    }
}
