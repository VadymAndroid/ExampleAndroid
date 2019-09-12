package ua.mycredit.mycredit.ui.bases.input

import org.joda.time.LocalDate
import ru.terrakok.cicerone.Router
import ua.mycredit.mycredit.Screens
import ua.mycredit.mycredit.ui.bases.BaseViewModel
import ua.mycredit.mycredit.ui.printByStyle
import java.util.*

class DatePickerViewModel(
        hint: Int,
        val router: Router,
        val minDate: LocalDate,
        val maxDate: LocalDate = LocalDate.now()) {

    var pickedDate: LocalDate? = null

    val field = FieldViewModel(
            hint,
            onClick = { router.navigateTo(Screens.DATE_PICKER, this) }
    )

    fun init(date: LocalDate?) {
        field.input.set(date.printByStyle("L-"))
    }

    fun notifyDatePicked(calendar: Calendar) {
        pickedDate = LocalDate.fromCalendarFields(calendar).also(::init)
    }

    fun hasPickedValueNotEqualTo(dateIso: String?) =
            pickedDate != null && pickedDate?.toString() == dateIso

    fun getPickedDateIsoOr(dateIso: String?): String? =
            pickedDate?.toString() ?: dateIso
}


fun BaseViewModel.datePicker(
        hint: Int,
        minDate: LocalDate,
        maxDate: LocalDate = LocalDate.now()
) = DatePickerViewModel(
        hint,
        router,
        minDate,
        maxDate
)
