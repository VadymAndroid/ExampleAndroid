package ua.mycredit.mycredit.mapping

import ua.mycredit.core.ContractAddition
import ua.mycredit.core.Prolongation
import ua.mycredit.core.Restructuring
import ua.mycredit.mycredit.R

val ContractAddition?.actionButtonTitle
    get() =
        when (this) {
            is Prolongation -> R.string.prolong
            is Restructuring -> R.string.restructure
            null -> R.string.empty
        }
