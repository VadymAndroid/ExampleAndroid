package ua.mycredit.mycredit.mapping

import android.content.Context
import ua.mycredit.core.*
import ua.mycredit.mycredit.R
import ua.mycredit.mycredit.ui.toAmountWithCurrency

class StatusActionButtonParams(
        val backgroundRes: Int = R.drawable.bg_button_gradient_primary_accent,
        val visibility: Boolean = true,
        val enabled: Boolean = true,
        val text: String
)

fun Status.statusActionButtonParams(context: Context) = when (this) {

    is WaitingForAgreement -> StatusActionButtonParams(
            text = context.getString(R.string.read_contract)
    )

    is Rejected -> StatusActionButtonParams(
            backgroundRes = R.drawable.bg_gradient_disabled,
            enabled = false,
            text = context.getString(R.string.choose_credit)
    )

    is Active -> StatusActionButtonParams(
            text = context.getString(R.string.repay_today_pattern, credit.boldAmountWithCurrency(context))
    )

    is PastDue -> StatusActionButtonParams(
            backgroundRes = R.drawable.bg_button_gradient_red,
            text = context.getString(R.string.repay_today_pattern, credit.boldAmountWithCurrency(context))
    )

    is Restructured -> StatusActionButtonParams(
            text = context.getString(R.string.repay_ahead_time_pattern, credit.boldAmountWithCurrency(context))
    )

    is NoCredits,
    is AgreementExpired,
    is NoContact,
    is RejectUnprocessedLoans,
    is Closed -> StatusActionButtonParams(
            text = context.getString(R.string.choose_credit)
    )

    is DisbursementFailed -> StatusActionButtonParams(
            text = context.getString(R.string.choose_credit)
    )

    else -> StatusActionButtonParams(
            visibility = false,
            text = context.getString(R.string.choose_credit)
    )
}

fun Credit.boldAmountWithCurrency(context: Context) = "<b>${context.toAmountWithCurrency(currentDebt)}</b>"

val Status.withDashes get() = this is Rejected || this is PastDue || this is Approved


@Suppress("unused")
val Status.progressStartText
    get() = 0

val Status.progressEndTextFormat
    get() =
        when (this) {
            is NoCredits -> R.string.prev_credit_amount_pattern.takeIf { lastAmount > 0 } ?: 0
            is Rejected -> R.string.days_left_pattern
            is Approved -> R.string.minutes_pattern
            is Active -> R.string.current_credit
            is AutoProcessing,
            is WaitingForApproval,
            is WaitingForAgreement -> R.string.chance_to_get_money
            else -> 0
        }.takeIf { progressStep.toFloat() / progressStepsTotal >= 0.25 }
                ?: 0

val Status.arcEndTextFormat get() = 0

val Status.progressColorsArrayId
    get() = when (this) {
        is NoCredits,
        is Active -> R.array.arc_normal_colors

        is Rejected,
        is WaitingForAgreement,
        is WaitingForApproval,
        is Approved,
        is DisbursementInProgress,
        is AutoProcessing,
        is PendingProlongation,
        is NoContact -> R.array.arc_yellow_colors

        is Sold,
        is PastDue -> R.array.arc_red_colors

        else -> R.array.arc_gray_colors
    }

val Status.outerBorderColorId
    get() = when (this) {
        is RejectUnprocessedLoans, is AgreementExpired -> R.color.red_9E566E
        is PastDue -> R.color.red_9E566E
        is DisbursementFailed, is Closed -> R.color.colorPrimary
        is Rejected, is NoContact -> R.color.yellow
        else -> R.color.arc_default_border_color
    }

val Status?.title
    get() =
        when (this) {

            is NoCredits,
            is RejectUnprocessedLoans -> R.string.your_available_amount

            is DisbursementInProgress,
            is WaitingForApproval,
            is WaitingForAgreement,
            is Approved,
            is DisbursementFailed,
            is AutoProcessing -> R.string.your_current_credit

            is Active -> R.string.sum_to_pay

            is PastDue -> R.string.duty_for_today
            is Sold -> R.string.credit_sold

            is Restructured -> R.string.restructured

            else -> 0
        }

val Status?.controlsBackground
    get() =
        when (this) {
            is NoCredits,
            is DisbursementFailed,
            is Closed,
            is Active -> R.drawable.bg_credit_status_controls_green

            is Rejected,
            is WaitingForApproval,
            is WaitingForAgreement,
            is NoContact,
            is Approved,
            is DisbursementInProgress,
            is AutoProcessing,
            is PendingProlongation,
            is Restructured -> R.drawable.bg_credit_status_controls_yellow

            is RejectUnprocessedLoans,
            is PastDue,
            is AgreementExpired,
            is Sold -> R.drawable.bg_credit_status_controls_red

            null -> R.color.white
            else -> throw IllegalStateException("descriptionBackground is not provided for ${this.javaClass.simpleName}")
        }

val Status.textPrimaryColor
    get() =
        when (this) {
            is NoCredits,
            is Closed,
            is DisbursementFailed,
            is Active -> R.color.colorPrimary

            is Rejected,
            is WaitingForApproval,
            is WaitingForAgreement,
            is NoContact,
            is Approved,
            is Restructured,
            is AutoProcessing,
            is PendingProlongation,
            is DisbursementInProgress -> R.color.yellow

            is RejectUnprocessedLoans,
            is PastDue,
            is AgreementExpired,
            is Sold -> R.color.red_DB5C60
        }

val Status?.controlsColor
    get() =
        when (this) {
            is NoCredits,
            is DisbursementFailed,
            is Closed,
            is Active -> R.color.green

            is Rejected,
            is WaitingForApproval,
            is WaitingForAgreement,
            is NoContact,
            is Restructured,
            is AutoProcessing,
            is Approved,
            is PendingProlongation,
            is DisbursementInProgress -> R.color.yellow

            is RejectUnprocessedLoans,
            is PastDue,
            is AgreementExpired,
            is Sold -> R.color.red_DB5C60

            else -> R.color.black
        }


val Status?.badgeBackground
    get() =
        when (this) {
            is NoCredits,
            is DisbursementFailed,
            is Closed,
            is Active -> R.drawable.bg_gradient_round_accent

            is Rejected,
            is WaitingForApproval,
            is WaitingForAgreement,
            is NoContact,
            is Restructured,
            is AutoProcessing,
            is Approved,
            is PendingProlongation,
            is DisbursementInProgress -> R.drawable.bg_gradient_round_yellow

            is RejectUnprocessedLoans,
            is PastDue,
            is AgreementExpired,
            is Sold -> R.drawable.bg_gradient_round_red

            else -> R.color.black
        }

val Status?.icon
    get() = when (this) {
        is NoCredits,
        is Active,
        is Closed -> R.drawable.ic_credit_status_card_normal

        is DisbursementFailed -> R.drawable.ic_credit_status_card_fail_green

        is AutoProcessing,
        is WaitingForApproval,
        is Approved,
        is PendingProlongation,
        is DisbursementInProgress -> R.drawable.ic_credit_status_pending_yellow

        is RejectUnprocessedLoans -> R.drawable.ic_credit_status_card_fail_green // TODO: switch to red version

        is Rejected,
        is NoContact -> R.drawable.ic_credit_status_card_fail_green // TODO: switch to yellow version

        is WaitingForAgreement -> R.drawable.ic_credit_status_agreement

        is Restructured -> R.drawable.ic_credit_status_restructured

        is PastDue -> R.drawable.ic_credit_status_past_due

        is Sold -> R.drawable.ic_credit_status_sold


        is AgreementExpired ->
            R.drawable.ic_credit_status_pending_yellow // TODO: switch to red version

        null -> R.drawable.ic_card
    }

val Status.name
    get() =
        when (this) {
            is NoCredits -> R.string.credit_status_name_no_credits
            is AutoProcessing -> R.string.credit_status_name_auto_processing
            is WaitingForApproval -> R.string.credit_status_name_waiting_for_approval
            is WaitingForAgreement -> R.string.credit_status_name_waiting_for_agreement
            is Rejected -> R.string.credit_status_name_rejected
            is NoContact -> R.string.credit_status_name_no_contact
            is Approved -> R.string.credit_status_name_approved
            is DisbursementFailed -> R.string.credit_status_name_disbursement_failed
            is Active -> R.string.credit_status_name_active
            is PastDue -> R.string.credit_status_name_past_due
            is Sold -> R.string.credit_status_name_sold
            is Restructured -> R.string.restructured
            is AgreementExpired -> R.string.agreement_expired
            is Closed -> R.string.credit_status_name_closed
            is DisbursementInProgress -> R.string.credit_status_name_disbursement_in_progress
            is RejectUnprocessedLoans -> R.string.error
            is PendingProlongation -> R.string.credit_status_name_pending_prolongation
        }
