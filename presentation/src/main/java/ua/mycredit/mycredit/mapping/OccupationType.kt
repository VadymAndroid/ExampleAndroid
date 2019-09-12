package ua.mycredit.mycredit.mapping

import ua.mycredit.core.OccupationType
import ua.mycredit.mycredit.R
import ua.mycredit.mycredit.ui.authentication.registration.ocupation.*
import ua.mycredit.mycredit.ui.bases.BaseFragment

val OccupationType.instantiate: () -> BaseFragment
    get() = when (this) {
        OccupationType.WORKING -> ::EmployedFragment
        OccupationType.BUSINESSMAN -> ::BusinessmanFragment
        OccupationType.NOT_WORKING -> ::UnemployedFragment
        OccupationType.STUDENT -> ::StudentFragment
        OccupationType.PENSIONER -> ::PensionerFragment
        OccupationType.INVALID -> ::InvalidFragment
        OccupationType.HOUSEWIFE -> ::HousewifeFragment
        OccupationType.DECREE -> ::DecreeFragment
        OccupationType.TEMPORARILY_NOT_WORKING -> ::TemporarilyUnemployedFragment
    }
val OccupationType.titleRes: Int
    get() =
        when (this) {
            OccupationType.WORKING -> R.string.occupation_type_working
            OccupationType.BUSINESSMAN -> R.string.occupation_type_businessman
            OccupationType.NOT_WORKING -> R.string.occupation_type_not_working
            OccupationType.STUDENT -> R.string.occupation_type_student
            OccupationType.PENSIONER -> R.string.occupation_type_pensioner
            OccupationType.INVALID -> R.string.occupation_type_invalid
            OccupationType.HOUSEWIFE -> R.string.occupation_type_housewife
            OccupationType.DECREE -> R.string.occupation_type_decree
            OccupationType.TEMPORARILY_NOT_WORKING -> R.string.occupation_type_temporarily_not_working
        }
