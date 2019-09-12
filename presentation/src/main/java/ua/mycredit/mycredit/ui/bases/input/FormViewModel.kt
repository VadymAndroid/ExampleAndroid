package ua.mycredit.mycredit.ui.bases.input

import android.os.Parcel
import android.os.Parcelable
import android.support.v4.app.FragmentManager
import ua.mycredit.mycredit.R
import ua.mycredit.mycredit.Screens
import ua.mycredit.mycredit.ui.bases.BaseViewModel
import ua.mycredit.mycredit.ui.bases.ViewModelFragment
import javax.inject.Inject
import kotlin.reflect.KClass

abstract class FormViewModel : BaseViewModel() {

    abstract val fields: List<Validable>

    protected abstract fun onReadyToSend()

    @Inject
    fun initFields() {
        onInitFields()
    }

    protected open fun onInitFields() {}

    open fun isContentChanged() = false

    open fun persist() {}

    fun attemptToSend() {
        if (loadings.get() == 0) {
            if (validate()) {
                onReadyToSend()
            }
        } else {
            showSystemMessage(R.string.please_wait)
        }
    }

    fun validate(silently: Boolean = false) = fields.reversed()
            .asSequence()
            .lastOrNull { !it.validate() }
            ?.also {
                if (!silently) {
                    (it as? FieldViewModel)?.requestFocus()
                }
            } == null

    open inner class BaseInputDialogViewModel(
            override val titleRes: Int,
            override val dialogField: FieldViewModel,
            val screen: String = Screens.TEXT_PICKER
    ) : TextDialogViewModel() {

        override fun pick() {
            router.navigateTo(screen, FieldReference(fields.indexOf(this), this@FormViewModel.javaClass))
        }
    }

    abstract inner class BasePickerDialogViewModel<E : Enum<E>>(
            override val titlesRes: Int,
            override val titleRes: Int
    ) : EnumPickerDialogViewModel<E>() {

        override fun pick() {
            router.navigateTo(Screens.ENUM_PICKER, this)
        }
    }

    inline fun <reified E : Enum<E>> makeSimplePickerDialogViewModel(
            titlesRes: Int,
            titleRes: Int
    ) = SimplePickerDialogViewModel(titlesRes, titleRes, E::class)

    inner class SimplePickerDialogViewModel<E : Enum<E>>(
            override val titlesRes: Int,
            override val titleRes: Int,
            private val enumClass: KClass<E>
    ) : BasePickerDialogViewModel<E>(titlesRes, titleRes) {

        override val variants: Array<E> get() = enumClass.java.enumConstants
    }

    class FieldReference(
            private val index: Int,
            private val clazz: Class<FormViewModel>
    ) : Parcelable {

        @Suppress("UNCHECKED_CAST")
        constructor(parcel: Parcel) : this(
                parcel.readInt(),
                parcel.readSerializable() as Class<FormViewModel>)

        override fun writeToParcel(parcel: Parcel, flags: Int) {
            parcel.writeInt(index)
        }

        override fun describeContents() = 0

        fun dereference(supportFragmentManager: FragmentManager) =
                supportFragmentManager
                        .fragments
                        .filterIsInstance<ViewModelFragment<*, *>>()
                        .map(ViewModelFragment<*, *>::viewModel)
                        .filterIsInstance(clazz)
                        .first()
                        .fields[index]

        companion object CREATOR : Parcelable.Creator<FieldReference> {

            override fun createFromParcel(parcel: Parcel) = FieldReference(parcel)

            override fun newArray(size: Int): Array<FieldReference?> = arrayOfNulls(size)
        }
    }
}
