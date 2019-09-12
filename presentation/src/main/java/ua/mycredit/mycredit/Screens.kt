package ua.mycredit.mycredit

import android.net.Uri
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

object Screens {

    const val ONBOARDING = "ONBOARDING"
    const val CALCULATOR = "CALCULATOR"
    const val SIGN_IN = "SIGN_IN"
    const val PLACE_AUTHCOMPLETE = "PLACE_AUTHCOMPLETE"

    const val ENUM_PICKER = "ENUM_PICKER"
    const val TEXT_PICKER = "TEXT_PICKER"
    const val PHONE_PICKER = "PHONE_PICKER"

    const val CALCULATOR_MAX_LOAN = "CALCULATOR_MAX_LOAN"
    const val CALCULATOR_MAX_DAYS = "CALCULATOR_MAX_DAYS"

    const val DEBUG_PROFILE_DETAILS = "DEBUG_PROFILE_DETAILS"

    const val PROGRESS = "PROGRESS"

    const val ALERT = "ALERT"
    const val DIAL = "DIAL"

    const val PROMO_CODE = "PROMO_CODE"
    const val PROMO_CODE_LOGIN_BEFORE = "PROMO_CODE_LOGIN_BEFORE"
    const val WRONG_PROMO_CODE = "WRONG_PROMO_CODE"
    const val FIRST_LOAN_PROMO_CODE = "FIRST_LOAN_PROMO_CODE"

    const val OCCUPATION_TYPE_PICKER = "OCCUPATION_TYPE_PICKER"
    const val OCCUPATION_TYPE = "OCCUPATION_TYPE"

    const val FACEBOOK = "FACEBOOK"

    const val CHOOSE_CREDIT_PRODUCT = "CHOOSE_CREDIT_PRODUCT"

    const val REPAY_LOAN = "REPAY_LOAN"
    const val PREFER_REPAY_AMOUNT_INPUT = "PREFER_REPAY_AMOUNT_INPUT"
    const val PROLONGATION_PREFERENCES = "PROLONGATION_PREFERENCES"
    const val PROLONGATION_PAY_INTERESTS = "PROLONGATION_PAY_INTERESTS"
    const val PROLONGATION_PREFERENCES_FINISH_DATE = "PROLONGATION_PREFERENCES_FINISH_DATE"

    const val AGREEMENT_PERMISSIONS_REQUEST = "AGREEMENT_PERMISSIONS_REQUEST"
    const val ACCEPT_AGREEMENT = "ACCEPT_AGREEMENT"
    const val AGREEMENT = "AGREEMENT"

    const val WEB_BANKING = "WEB_BANKING"
    const val MY_CREDIT_WEB = "MY_CREDIT_WEB"

    const val RESET_PASSWORD = "RESET_PASSWORD"
    const val RESET_PASSWORD_PHONE_INPUT = "RESET_PASSWORD_PHONE_INPUT"
    const val RESET_PASSWORD_NEW_PASSWORD = "RESET_PASSWORD_NEW_PASSWORD"

    const val ERROR_PERSONAL_DATA_UNEDITABLE = "ERROR_PERSONAL_DATA_UNEDITABLE"

    const val CREDIT_CONFIRMATION = "CREDIT_CONFIRMATION"

    @Parcelize
    data class WebBankingParams(
            val url: String,
            val finishMessage: Int,
            val nextScreenKey: String? = null
    ) : Parcelable

    object SignUp {
        const val SIGN_UP = "SIGN_UP"
        const val NUMBER = "${SIGN_UP}_NUMBER"
        const val SMS = "${SIGN_UP}_SMS"
        const val PASSWORD = "${SIGN_UP}_PASSWORD"
        const val CARD_FRONT = "${SIGN_UP}_CARD_FRONT"
        const val CARD_BACK = "${SIGN_UP}_CARD_BACK"

        object Passport {
            const val PERSONAL_INFORMATION = "${SIGN_UP}_PERSONAL_INFORMATION"
            const val PERSONAL_DATA = "${SIGN_UP}_PERSONAL_DATA"
            const val ADDRESS = "${SIGN_UP}_ADDRESS"
            const val BIRTH_DAY = "${SIGN_UP}_BIRTH_DAY"
            const val PASSPORT = "${SIGN_UP}_PASSPORT"
        }

        object Occupation {
            const val OCCUPATION = "OCCUPATION"

            const val EMPLOYMENT = "_${OCCUPATION}EMPLOYMENT"
            const val BUSINESSMAN = "${OCCUPATION}_BUSINESSMAN"
            const val PENSIONER = "${OCCUPATION}_PENSIONER"
            const val UNEMPLOYED = "${OCCUPATION}_UNEMPLOYED"
            const val STUDENT = "${OCCUPATION}_STUDENT"
            const val INVALID = "${OCCUPATION}_INVALID"
            const val HOUSEWIFE = "${OCCUPATION}_HOUSEWIFE"
            const val DECREE = "${OCCUPATION}_DECREE"
            const val TEMPORARILY_UNEMPLOYED = "${OCCUPATION}_TEMPORARILY_$UNEMPLOYED"
        }

        object Finance {
            const val FINANCE = "FINANCE"
        }
    }

    object Profile {
        const val PROFILE = "PROFILE"
        const val FAQ = "FAQ"
        const val FAQ_WEB = "FAQ_WEB"
        const val FAQ_WEB_PP = "FAQ_WEB_PP"
        const val FAQ_WEB_VIBER = "FAQ_WEB_VIBER"
        const val FAQ_WEB_TELEGRAM = "FAQ_WEB_TELEGRAM"
        const val FAQ_WEB_FACEBOOK = "FAQ_WEB_FACEBOOK"

        const val DETAILS_PERSONAL = "DETAILS_PERSONAL"
        const val DETAILS_OCCUPATION = "DETAILS_OCCUPATION"

        const val PICK_CREDIT_STATUS = "PICK_CREDIT_STATUS"

        object Cards {

            const val CARDS = "CARDS"

            const val DELETE_CARD_CONFIRMATION = "DELETE_CARD_CONFIRMATION"

            const val ADD_NEW_CARD = "ADD_NEW_CARD"

            const val NEW_CARD_FRONT = "NEW_CARD_FRONT"
            const val NEW_CARD_BACK = "NEW_CARD_BACK"


            const val BANK_SUPPORT_ALERT = "BANK_SUPPORT_ALERT"
        }

        object Contacts {

            const val CONTACTS = "CONTACTS"

            const val EDIT_PASSWORD = "EDIT_PASSWORD"
        }
    }

    const val ERROR = "ERROR"

    const val DATE_PICKER = "DATE_PICKER"

    class PhotosPickerParams(
            val max: Int,
            val min: Int,
            val minCountError: Int,
            val currentSelection: ArrayList<Uri>)

    const val TEST_IBOX = "TEST_IBOX"
    const val IBOX_WEB = "IBOX_WEB"
}
