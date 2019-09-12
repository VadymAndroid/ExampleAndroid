package ua.mycredit.mycredit.mapping

import ua.mycredit.core.Prolongation
import ua.mycredit.core.Prolongation.State.*
import ua.mycredit.mycredit.R

val Prolongation.State.buttonBackground
    get() =
        when (this) {
            PAYMENT_IN_PROGRESS -> R.drawable.bg_gradient_disabled
            else -> R.drawable.bg_button_gradient_primary
        }

val Prolongation.State.buttonText
    get() =
        when (this) {
            INTEREST_PAYMENT_WAITING -> R.string.prolong
            PAYMENT_IN_PROGRESS -> R.string.prolongation_payment_in_progress
            DATE_SELECTABLE -> R.string.select_prolongation_date
        }
