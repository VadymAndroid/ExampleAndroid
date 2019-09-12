package ua.mycredit.mycredit.ui

import android.animation.ArgbEvaluator
import android.animation.ValueAnimator
import android.content.Context
import android.content.res.ColorStateList
import android.databinding.BindingAdapter
import android.databinding.BindingConversion
import android.databinding.InverseBindingAdapter
import android.databinding.InverseBindingListener
import android.graphics.Paint
import android.os.Build
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.TextInputLayout
import android.support.v4.view.ViewPager
import android.support.v4.widget.ImageViewCompat
import android.support.v4.widget.SwipeRefreshLayout
import android.text.*
import android.text.method.LinkMovementMethod
import android.text.style.BulletSpan
import android.text.style.ClickableSpan
import android.text.style.RelativeSizeSpan
import android.text.style.UnderlineSpan
import android.view.View
import android.view.animation.AnimationUtils
import android.view.animation.LinearInterpolator
import android.webkit.WebView
import android.widget.*
import br.com.sapereaude.maskedEditText.MaskedEditText
import com.aurelhubert.ahbottomnavigation.AHBottomNavigation
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationAdapter
import net.cachapa.expandablelayout.ExpandableLayout
import org.jetbrains.anko.*
import org.joda.time.DateTime
import org.joda.time.format.DateTimeFormat
import ua.mycredit.core.*
import ua.mycredit.mycredit.R
import ua.mycredit.mycredit.mapping.*
import ua.mycredit.mycredit.ui.custom.CircleSeekBar
import ua.mycredit.mycredit.ui.custom.credit.TitledSeekArc
import ua.mycredit.mycredit.ui.custom.getOptionalText
import ua.mycredit.mycredit.ui.profile.repayloan.RepaymentType
import java.io.File
import java.text.DecimalFormat
import java.util.*

interface OnPhoneClick {
    fun onClick(phone: String)
}


@BindingConversion
fun booleanToVisibility(visible: Boolean) = View.VISIBLE.takeIf { visible } ?: View.GONE

@BindingAdapter(value = ["requestFocus", "requestFocusAttrChanged"], requireAll = false)
fun View.setHasFocusAttrChangedListener(
        command: RequestFocus?,
        attrChange: InverseBindingListener?) {

    command?.let {
        clearFocus()
        requestFocus()
        attrChange?.onChange()
    }
}

@Suppress("unused")
@InverseBindingAdapter(attribute = "requestFocus", event = "requestFocusAttrChanged")
fun View.notifyFocusRequested(): RequestFocus? = null

@BindingAdapter(value = ["fadeOut", "fadeOutAttrChanged"], requireAll = false)
fun View.setFadeOut(
        command: FadeOut?,
        attrChange: InverseBindingListener?) {

    command?.let { _ ->

        (getTag(R.id.color_animation) as? ValueAnimator)?.cancel()

        ValueAnimator.ofInt(
                getColorBy(R.color.gray_B2B2B2),
                getColorBy(R.color.activity_background)
        ).apply {

            setEvaluator(ArgbEvaluator())
            interpolator = LinearInterpolator()
            duration = 600

            addUpdateListener {
                backgroundColor = it.animatedValue as Int
            }
        }.also {
            setTag(R.id.color_animation, it)
        }.start()

        attrChange?.onChange()
    }
}

@Suppress("unused")
@InverseBindingAdapter(attribute = "fadeOut", event = "fadeOutAttrChanged")
fun View.notifyFadeOutStarted(): FadeOut? = null

@BindingAdapter("tintRes")
fun ImageView.setTintResource(tintColorRes: Int) {
    ImageViewCompat.setImageTintList(this, ColorStateList.valueOf(context.getColorBy(tintColorRes)))
}

@BindingAdapter("hintId", "optional")
fun TextInputLayout.setHint(hintId: Int, optional: Boolean) {
    hint = makeHint(hintId, optional)
}

@BindingAdapter("hintId", "optional")
fun TextView.setHint(hintId: Int, optional: Boolean) {
    hint = makeHint(hintId, optional)
}

@BindingAdapter("hintStr", "optional")
fun TextView.setHintStr(hintStr: String?, optional: Boolean) {
    hint = when {
        TextUtils.isEmpty(hintStr) -> null
        else -> addStar(hintStr, optional)
    }
}

private fun View.makeHint(hintId: Int, optional: Boolean) =
        when (hintId) {
            0 -> null
            else -> resources.getString(hintId) // specific requirements addStar(resources.getString(hintId), optional)
        }


private fun addStar(hint: String?, optional: Boolean): String =
        hint + (" *".takeIf { !optional } ?: "")


@BindingAdapter("error")
fun TextInputLayout.setError(errorId: Int) {
    error = if (errorId == 0) {
        null
    } else {
        resources.getString(errorId)
    }
}

@BindingAdapter("inputType", "passwordToggleEnabled")
fun TextInputLayout.setInputType(inputType: Int, passwordToggleEnabled: Boolean) {
    editText!!.inputType = inputType
    isPasswordVisibilityToggleEnabled = passwordToggleEnabled
}

@BindingAdapter("textOrGone")
fun TextView.setTextOrGone(text: Int) {

    setTextOrGone("".takeIf { text == 0 } ?: resources.getString(text))
}

@BindingAdapter("textOrInvisible")
fun TextView.setTextOrInvisible(text: Int) {

    textOrInvisible("".takeIf { text == 0 } ?: resources.getString(text))
}

@BindingAdapter("textOrInvisible")
fun TextView.textOrInvisible(text: String?) {
    when {
        TextUtils.isEmpty(text) -> visibility = View.INVISIBLE
        else -> {
            visibility = View.VISIBLE
            this.text = text
        }
    }
}

@BindingAdapter("openCloseChatAnimation")
fun openCloseChatAnimation(button: FloatingActionButton, boolean: Boolean) {
    if (boolean) {
        button.startAnimation(AnimationUtils.loadAnimation(button.context, R.anim.rotate_forward))
    } else {
        button.startAnimation(AnimationUtils.loadAnimation(button.context, R.anim.rotate_backward))
    }
}

@BindingAdapter("showHideButtonChat")
fun showHideButtonChat(button: FloatingActionButton, boolean: Boolean) {
    if (boolean) {
        button.animation = AnimationUtils.loadAnimation(button.context, R.anim.chat_open)
        button.isClickable = true
    } else {
        button.animation = AnimationUtils.loadAnimation(button.context, R.anim.chat_close)
        button.isClickable = false
    }
}



@BindingAdapter("textOrGone")
fun TextView.setTextOrGone(text: String?) {
    when {
        TextUtils.isEmpty(text) -> visibility = View.GONE
        else -> {
            visibility = View.VISIBLE
            this.text = text
        }
    }
}

@BindingAdapter("textOrInvisible")
fun TextView.setTextOrInvisible(text: String?) {
    when {
        TextUtils.isEmpty(text) -> visibility = View.INVISIBLE
        else -> {
            visibility = View.VISIBLE
            this.text = text
        }
    }
}

@BindingAdapter("filters")
fun TextView.safeSetFilters(filters: Array<InputFilter>?) {
    this.filters = filters ?: emptyArray()
}

@BindingAdapter(
        value = [
            "plainText",
            "clickableText",
            "highlightColor",
            "highlightClick",
            "underline",
            "bold",
            "asHtml"
        ],
        requireAll = false
)
fun TextView.setClickableFragment(
        plainText: String,
        clickableText: String,
        highlightColor: Int,
        highlightClick: View.OnClickListener?,
        underline: Boolean = false,
        bold: Boolean = false,
        asHtml: Boolean = false) {

    val spannableString = SpannableString(
            String.format(plainText, clickableText).let { text ->
                text.takeUnless { asHtml } ?: Html.fromHtml(text)
            }
    )


    val span = object : ClickableSpan() {

        override fun onClick(widget: View) {
            highlightClick?.onClick(widget)
        }

        override fun updateDrawState(ds: TextPaint) {
            super.updateDrawState(ds)
            ds.isUnderlineText = underline
            ds.isFakeBoldText = bold
            ds.color = highlightColor
        }
    }

    val start = spannableString.indexOf(clickableText)
    spannableString.setSpan(span, start, start + clickableText.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

    movementMethod = LinkMovementMethod.getInstance()

    text = spannableString
}


@BindingAdapter(value = ["bulletText", "bulletColor"])
fun TextView.setColoredBulletText(textBullet: String, dotColor: Int) {
    val spannableString = SpannableString(textBullet)
    val gap = resources.getDimension(R.dimen.margin_half).toInt()
    spannableString.setSpan(BulletSpan(gap, dotColor),
            0, textBullet.length - 1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
}


@Suppress("unused")
@InverseBindingAdapter(attribute = "moveCursorToEnd", event = "moveCursorToEndAttrChanged")
fun EditText.notifyCursorMovedToNext(): MoveCursorToEnd? = null

@BindingAdapter(value = ["moveCursorToEnd", "moveCursorToEndAttrChanged"], requireAll = false)
fun EditText.doMoveCursorToNext(command: MoveCursorToEnd?, onChanged: InverseBindingListener?) {
    command?.apply {
        setSelection(text.length)
        onChanged?.onChange()
    }
}

@BindingAdapter("text", "titleIndex", "titlesRes")
fun TextView.setTitle(text: String?, titleIndex: Int, titlesRes: Int) {
    this.text = when (titlesRes) {
        0 -> text
        else -> "".takeIf { titleIndex == -1 }
                ?: context.resources.getStringArray(titlesRes)[titleIndex]
    }
}

@InverseBindingAdapter(attribute = "value", event = "valueAttrChanged")
fun CircleSeekBar.getValue() = curProcess

@BindingAdapter("value")
fun CircleSeekBar.doSetValue(value: Int) {
    if (value != curProcess) {
        curProcess = value
    }
}

@BindingAdapter(value = ["valueAttrChanged", "onValueChanged", "onValueChanging"], requireAll = false)
fun CircleSeekBar.setValueAttrChanged(attrChanged: InverseBindingListener?,
                                      onChangedListener: CircleSeekBar.OnSeekBarChangedListener?,
                                      onChangingListener: CircleSeekBar.OnSeekBarChangingListener?) {

    setOnSeekBarChangedListener(object : CircleSeekBar.OnSeekBarChangedListener {
        override fun onChanged(progress: Int) {
            onChangedListener?.onChanged(progress)
        }
    })

    setOnSeekBarChangingListener(object : CircleSeekBar.OnSeekBarChangingListener {
        override fun onChanging(progress: Int) {
            attrChanged?.onChange()
            onChangingListener?.onChanging(progress)
        }
    })
}

@BindingAdapter("money")
fun TextView.setMoney(money: Int) {

    val s = DecimalFormat("#,###,###")
            .format(money)
            .replace(',', ' ')
            .let { resources.getString(R.string.specific_uah, it) }

    text = SpannableString(s).apply {
        setSpan(RelativeSizeSpan(0.6f), s.length - 3, s.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
    }
}

@BindingAdapter("until")
fun TextView.setUntil(calendar: Calendar) {

    val monthUntil = resources.getStringArray(R.array.months_array_date)[calendar.get(Calendar.MONTH)]
    val dayUntil = calendar.get(Calendar.DAY_OF_MONTH)

    text = context.getString(ua.mycredit.mycredit.R.string.until_day_month, dayUntil, monthUntil)
}

@BindingAdapter("strikeText")
fun TextView.setStrikeText(strikeText: String) {
    text = strikeText
    paintFlags = Paint.STRIKE_THRU_TEXT_FLAG
}

@BindingAdapter("textColorResource")
fun TextView.setTextColorResource(colorId: Int) {
    textColorResource = R.color.black.takeIf { colorId == 0 } ?: colorId
}

@BindingAdapter("textColorHint")
fun MaskedEditText.setHintColor(hintColor: Int) {
    setHintTextColor(hintColor)
    text = text // Do not remove
}

@InverseBindingAdapter(attribute = "refreshing", event = "refreshingAttrChanged")
fun SwipeRefreshLayout.getRefreshing() = isRefreshing

@BindingAdapter("refreshingAttrChanged")
fun SwipeRefreshLayout.setRefreshingAttrChanged(attrChanged: InverseBindingListener?) {
    setOnRefreshListener { attrChanged?.onChange() }
}

@BindingAdapter("refreshing")
fun SwipeRefreshLayout.doSetRefreshing(refreshing: Boolean) {
    isRefreshing = refreshing
}

@BindingAdapter("colorSchemeColor")
fun SwipeRefreshLayout.setColorSchemeColor(color: Int) {
    setColorSchemeColors(color)
}

@InverseBindingAdapter(attribute = "currentItem", event = "currentItemAttrChanged")
fun ViewPager.getCurrentItemAlias() = currentItem

@BindingAdapter("currentItemAttrChanged")
fun ViewPager.setCurrentItemAttrChanged(attrChanged: InverseBindingListener?) {
    if (attrChanged != null) {

        object : ViewPager.SimpleOnPageChangeListener() {

            override fun onPageSelected(position: Int) {
                attrChanged.onChange()
            }
        }.let(::addOnPageChangeListener)
    } else {
        clearOnPageChangeListeners()
    }
}

@BindingAdapter("currentItem")
fun ViewPager.doSetCurrentItem(currentItem: Int) {
    setCurrentItem(currentItem, true)
}

@BindingAdapter("adapter")
fun AHBottomNavigation.setAdapter(adapter: AHBottomNavigationAdapter?) {
    adapter!!.setupWithBottomNavigation(this)
}

@Suppress("deprecation")
@BindingAdapter("htmlText")
fun TextView.setHtmlText(htmlText: String) {
    text = if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) {
        Html.fromHtml(htmlText)
    } else {
        Html.fromHtml(htmlText, Html.FROM_HTML_MODE_LEGACY)
    }
}


@BindingAdapter(value = ["checkedSafe", "checkedSafeAttrChanged"], requireAll = false)
fun CheckBox.setCheckedSafe(checked: Boolean, attrChange: InverseBindingListener?) {

    attrChange?.let {
        CompoundButton.OnCheckedChangeListener { _, isChecked ->
            if (checked != isChecked) {
                attrChange.onChange()
            }
        }
    }.let(::setOnCheckedChangeListener)

    if (isChecked != checked) {
        isChecked = checked
        jumpDrawablesToCurrentState()
    }
}

@InverseBindingAdapter(attribute = "checkedSafe", event = "checkedSafeAttrChanged")
fun CheckBox.getCheckedSafe() = isChecked

@InverseBindingAdapter(attribute = "expanded", event = "expandedAttrChanged")
fun ExpandableLayout.getExpanded() = isExpanded

@BindingAdapter("expandedAttrChanged")
fun ExpandableLayout.setExpandedAttrChanged(attrChanged: InverseBindingListener?) {
    setOnExpansionUpdateListener { _, _ -> attrChanged?.onChange() }
}

@BindingAdapter("expanded")
fun ExpandableLayout.doSetExpanded(expanded: Boolean) {
    isExpanded = expanded
}

@BindingAdapter("statusParams")
fun TitledSeekArc.setStatus(status: Status?) {
    status?.let {

        with(status) {

            setProgressBeginningTextId(progressStartText)

            progressEndText = getOptionalText(progressEndTextFormat, progressStep)
            arcEndText = getOptionalText(arcEndTextFormat, progressStepsTotal)

            setProgressColorsArrayId(progressColorsArrayId)
            setOuterBorderColorId(outerBorderColorId)
        }

        progressStepsTotal = status.progressStepsTotal
        progressStep = status.progressStep

        withDashes = status.withDashes
    }
}

@BindingAdapter("creditStatusName")
fun TextView.setCreditStatusName(status: Status?) {

    setTextOrGone(status?.name ?: 0)

    status?.apply {
        backgroundResource = controlsBackground
        textColorResource = textPrimaryColor
    }
}

@BindingAdapter("creditStatusTitle")
fun TextView.setTitle(status: Status?) {
    setTextOrInvisible(status.title)
    textColorResource = R.color.red_DB5C60.takeIf { status is Sold } ?: R.color.gray_8F8F8F
}

@BindingAdapter("creditAmountByStatus")
fun TextView.setArcCreditAmountValue(status: Status?) {
    when (status) {

        is Sold,
        null -> visibility = View.INVISIBLE

        else -> {
            val amountString = status.amount.toAmountString()
            val uah = context.getString(R.string.uah)

            val spannable = SpannableString("$amountString $uah")

            spannable.setSpan(RelativeSizeSpan(3f), 0, amountString.length, 0)

            text = spannable
            visibility = View.VISIBLE
        }
    }
}

@Suppress("WhenWithOnlyElse", "UNUSED_EXPRESSION", "UNREACHABLE_CODE")
@BindingAdapter("statusFooter")
fun TextView.setAdditionalParams(status: Status?) {

    visibility = View.VISIBLE

    when (status) {
        is PastDue -> {
            text = context.getString(
                    R.string.overdue_for_patttern,
                    resources.getQuantityString(
                            R.plurals.days,
                            status.progressStep,
                            status.progressStep
                    )
            )
            textColorResource = R.color.red_DB5C60
            setCompoundDrawables(null, null, null, null)
        }

        else -> {
            status?.credit
                    .takeIf { status !is Sold }
                    ?.finishDate
                    ?.let(DateTimeFormat.forPattern("d MMMMM")::print)
                    ?.let { context.getString(R.string.until, it) }
                    .let(::setTextOrInvisible)

            setCompoundDrawablesWithIntrinsicBounds(
                    getDrawableBy(R.drawable.gray_circle_4dp),
                    null,
                    getDrawableBy(R.drawable.gray_circle_4dp),
                    null
            )

            textColorResource = R.color.gray_8F8F8F
        }
    }
}

@BindingAdapter(
        value = ["dateTime", "dateTimeStyle"],
        requireAll = false
)
fun TextView.setDateTime(dateTime: DateTime?, style: String?) {
    text = dateTime?.printByStyle(style ?: "M-")
}

@BindingAdapter("loadByFile")
fun WebView.loadByFile(file: File?) {
    settings.builtInZoomControls = true
    settings.displayZoomControls = false
    file?.let {
        loadUrl("file:///" +file.absolutePath)
    }
}

@BindingAdapter("iconByStatus")
fun ImageView.setIcon(status: Status?) {
    imageResource = status.icon
    ImageViewCompat.setImageTintList(this, ColorStateList.valueOf(context.getColorBy(status.controlsColor)))
}

@BindingAdapter("underlineText")
fun TextView.setUnderlineText(sentence: String) {
    val spannableString = SpannableString(sentence)
    spannableString.setSpan(UnderlineSpan(), 0, sentence.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
    text = spannableString
}

@BindingAdapter("briefDescriptionOf", "profile")
fun TextView.setBriefDescription(status: Status?, profile: Profile?) {
    with(context) {

        when {

            status == null || profile == null -> null

            else -> when (status) {

                is NoCredits -> R.string.credit_status_brief_description_no_credits
                is AutoProcessing -> R.string.credit_status_brief_description_auto_processing
                is WaitingForApproval -> R.string.credit_status_brief_description_waiting_for_approval
                is WaitingForAgreement -> R.string.credit_status_brief_description_waiting_for_agreement
                is Rejected -> R.string.credit_status_brief_description_rejected
                is NoContact -> R.string.credit_status_brief_description_no_contact
                is RejectUnprocessedLoans -> R.string.credit_status_brief_description_reject_unprocessed_loans
                is Approved -> R.string.credit_status_brief_description_approved
                is DisbursementInProgress -> R.string.credit_status_brief_description_disbursement_in_progress
                is DisbursementFailed -> R.string.credit_status_brief_description_disbursement_failed
                is Active -> R.string.credit_status_brief_description_active
                is PastDue -> R.string.credit_status_brief_description_past_due
                is Sold -> R.string.credit_status_brief_description_sold
                is PendingProlongation -> R.string.credit_status_brief_description_pending_prolongation
                is Restructured -> R.string.credit_status_brief_description_restructured
                is AgreementExpired -> R.string.credit_status_brief_description_agreement_expired
                is Closed -> R.string.credit_status_brief_description_closed

            }.let(context::getString).let { description ->

                when (status) {

                    is Restructured -> arrayOf(
                            profileNameByStatus(status, profile),
                            resources.getQuantityString(R.plurals.payments, status.totalPartsCount, status.totalPartsCount)
                    )

                    else -> arrayOf(profileNameByStatus(status, profile))

                }.let { substitution ->

                    when {
                        description.contains("%s") -> String.format(description, *substitution)
                        else -> description
                    }
                }.let { result ->
                    when {
                        result.contains("<") -> setHtmlText(result)
                        else -> text = result
                    }
                }
            }
        }
    }
}

private fun Context.profileNameByStatus(status: Status, profile: Profile) =
        when {
            profile.name.isEmpty() -> getString(R.string.name_not_specified)
            status is PastDue || status is Sold -> "${profile.name} ${profile.patronymic}"
            else -> profile.name
        }

@BindingAdapter("answer", "onPhoneClick")
fun TextView.setFaq(question: String, onPhoneClick: OnPhoneClick?) {
    val supportPhone = getOptionalText(R.string.phone_support)

    when {

        question.contains(supportPhone) ->
            setClickableFragment(
                    question.replace(supportPhone, "%s"),
                    supportPhone,
                    context.getColorBy(R.color.black),
                    View.OnClickListener { onPhoneClick?.onClick(supportPhone) },
                    bold = true,
                    asHtml = true
            )

        else -> setHtmlText(question)
    }
}

@BindingAdapter("detailedDescription", "onPhoneClick")
fun TextView.setDetailedDescription(status: Status?, onPhoneClick: OnPhoneClick?) {
    when (status) {

        is NoCredits -> {
            text = getOptionalText(R.string.credit_status_detailed_description_no_credits, status.amount)
        }

        is AutoProcessing -> setText(R.string.credit_status_detailed_description_auto_processing)
        is WaitingForApproval -> setText(R.string.credit_status_detailed_description_waiting_for_approval)
        is WaitingForAgreement -> setText(R.string.credit_status_detailed_description_waiting_for_agreement)
        is Rejected -> text = getOptionalText(R.string.credit_status_detailed_description_rejected,
                status.unlockDate.printByStyle("L-")
        )
        is NoContact -> setText(R.string.credit_status_detailed_description_no_contact)
        is RejectUnprocessedLoans -> setText(R.string.credit_status_detailed_description_reject_unprocessed_loans)
        is Approved -> setTextWithPhone(R.string.credit_status_detailed_description_approved, onPhoneClick)
        is DisbursementInProgress -> setTextWithPhone(R.string.credit_status_detailed_description_disbursement_in_progress, onPhoneClick)


        is DisbursementFailed -> setTextWithPhone(R.string.credit_status_detailed_description_disbursement_failed, onPhoneClick)
        is Active -> setText(R.string.credit_status_detailed_description_active)
        is PastDue -> {
            text = getOptionalText(
                    R.string.credit_status_detailed_description_past_due,
                    context.resources.getQuantityString(R.plurals.days, status.daysToSale, status.daysToSale)
            )
        }
        is Sold -> setHtmlText(getOptionalText(R.string.credit_status_detailed_description_sold))
        is PendingProlongation -> setText(R.string.credit_status_detailed_description_pending_prolongation)
        is Restructured -> setText(R.string.credit_status_detailed_description_restructured)
        is AgreementExpired -> setText(R.string.credit_status_detailed_description_agreement_expired)
        is Closed -> setText(R.string.credit_status_detailed_description_closed)
    }
}

private fun TextView.setTextWithPhone(text: Int, onPhoneClick: OnPhoneClick?) {
    getOptionalText(R.string.phone_support).let { supportPhone ->
        setClickableFragment(
                getOptionalText(text),
                supportPhone,
                context.getColorBy(R.color.gray),
                View.OnClickListener { onPhoneClick?.onClick(supportPhone) },
                false,
                true
        )
    }
}


@BindingAdapter("statusActionButtonParams")
fun Button.setCreditStatusActionState(status: Status?) {

    if (status == null) {
        visibility = View.GONE
        return
    }

    val buttonParams = status.statusActionButtonParams(context)

    backgroundResource = buttonParams.backgroundRes
    setHtmlText(buttonParams.text)
    visibility = View.VISIBLE.takeIf { buttonParams.visibility } ?: View.GONE
    isEnabled = buttonParams.enabled
}

@BindingAdapter("amountWithCurrency")
fun TextView.setAmountWithCurrency(amount: Double) {
    text = context.toAmountWithCurrency(amount)
}

@BindingAdapter("contractAdditionTitle")
fun TextView.setCreditAdditionTitle(addition: ContractAddition?) {

    text = when (addition) {
        is Prolongation -> context.getString(R.string.prolong)
//            context.resources.getQuantityString(
//                    R.plurals.prolong_days,
//                    addition.days,
//                    addition.days
//            )

        is Restructuring -> context.resources.getQuantityString(
                R.plurals.break_payments,
                addition.schedule.size,
                addition.schedule.size
        )

        null -> ""
    }
}

@BindingAdapter("paymentPurpose", "repaymentType")
fun TextView.setPaymentPurpose(credit: Credit?, repaymentType: RepaymentType?) {
    text = when {

        credit != null && repaymentType != null -> credit.let {
            "${context.getString(repaymentType.title)} ${context.getString(
                    R.string.number_date_pattern,
                    credit.publicId,
                    credit.creationDate.printByStyle("S-")
            )}"
        }

        else -> ""
    }
}

@BindingAdapter("statusBadge")
fun TextView.nameByStatusCode(code: Int) {
    when (code) {
        AUTO_PROCESSING_0,
        AUTO_PROCESSING_1,
        AUTO_PROCESSING_2,
        AUTO_PROCESSING_3,
        AUTO_PROCESSING_21 -> R.string.credit_status_name_auto_processing
        WAITING_FOR_APPROVAL -> R.string.credit_status_name_waiting_for_approval
        APPROVED -> R.string.credit_status_name_approved
        REJECTED -> R.string.credit_status_name_rejected
        ACTIVE -> R.string.credit_status_name_active
        PAST_DUE -> R.string.credit_status_name_past_due
        CLOSED_REPAID,
        CLOSED_WRITTEN_OFF -> R.string.credit_status_name_closed
        PENDING_PROLONGATION -> R.string.credit_status_name_pending_prolongation
        RESTRUCTURED -> R.string.restructured
        DISBURSEMENT_FAILED,
        WRONG_CARD_DISBURSEMENT_FAILED -> R.string.credit_status_name_disbursement_failed
        DISBURSEMENT_IN_PROGRESS -> R.string.credit_status_name_disbursement_in_progress
        WAITING_FOR_AGREEMENT -> R.string.credit_status_name_waiting_for_agreement
        AGREEMENT_EXPIRED -> R.string.agreement_expired
        NO_CONTACT -> R.string.credit_status_name_no_contact
        SOLD -> R.string.credit_status_name_sold
        REJECT_UNPROCESSED_LOANS -> R.string.error
        else -> R.string.credit_status_name_waiting_for_approval
    }.let(::setText)


    when (code) {
        DISBURSEMENT_FAILED,
        WRONG_CARD_DISBURSEMENT_FAILED,
        CLOSED_REPAID,
        CLOSED_WRITTEN_OFF,
        ACTIVE -> R.drawable.bg_gradient_round_accent

        REJECTED,
        PAST_DUE, AGREEMENT_EXPIRED,
        SOLD -> R.drawable.bg_gradient_round_red

        else -> R.drawable.bg_gradient_round_yellow
    }.let {
        backgroundResource = it
    }
}

@BindingAdapter("prolongationParams")
fun Button.setupByProlongation(prolongation: Prolongation?) {
    prolongation?.let {
        backgroundResource = prolongation.state.buttonBackground
        textResource = prolongation.state.buttonText
    }
}
