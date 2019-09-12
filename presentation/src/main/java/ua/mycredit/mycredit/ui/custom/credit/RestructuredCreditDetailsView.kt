package ua.mycredit.mycredit.ui.custom.credit

import android.content.Context
import android.graphics.*
import android.support.annotation.DimenRes
import android.util.AttributeSet
import org.joda.time.format.DateTimeFormat
import ua.mycredit.core.Restructured
import ua.mycredit.mycredit.R
import ua.mycredit.mycredit.ui.custom.*
import ua.mycredit.mycredit.ui.getColorBy
import kotlin.math.PI
import kotlin.math.sin

class RestructuredCreditDetailsView @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyleAttr: Int = R.attr.seekArcStyle
) : StepsRadialDiagram(context, attrs, defStyleAttr) {

    var restructured: Restructured? by invalidable(null, ::processCreditParamsChange)

    private val repaymentsRect = RectF()
    private val datesRect = RectF()

    private lateinit var behavior: Behavior

    private val checkedIconPaint = antiAliasPaint()

    private val amountOffset = context.resources.getDimension(R.dimen.restructured_repayments_offset)
    private val dateOffsetOffset = context.resources.getDimension(R.dimen.restructured_dates_offset)

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        repaymentsRect.set(diagramRect)
        repaymentsRect.inset(amountOffset, amountOffset)

        datesRect.set(repaymentsRect)
        datesRect.inset(dateOffsetOffset, dateOffsetOffset)
    }

    override fun onDrawStep(step: Int, angle: Float, delta: Float, canvas: Canvas) {
        behavior.drawRepaymentDetails(step, angle, delta, canvas)
    }

    private fun processCreditParamsChange(value: Restructured?) {
        if (value != null) {
            stepsCount = value.totalPartsCount
            currentStep = value.repaidPartsCount

            val tools = ToolsImpl(
                    context,
                    value,
                    repaymentsRect,
                    datesRect,
                    checkedIconPaint
            )

            behavior = when {
                stepsCount <= 5 -> Wide(tools)
                else -> Narrow(tools)
            }
        }
    }


    interface Tools {
        val context: Context
        val restructured: Restructured

        val repaymentsRect: RectF
        val datesRect: RectF

        val checkedIconPaint: Paint

        val uah: String
        val repaymentsStr: List<String>

        val greenColor: Int

        fun Tools.getDimension(@DimenRes id: Int) = context.resources.getDimension(id)
    }


    class ToolsImpl(
            override val context: Context,
            override val restructured: Restructured,
            override val repaymentsRect: RectF,
            override val datesRect: RectF,
            override val checkedIconPaint: Paint
    ) : Tools {

        override val uah: String = context.getString(R.string.uah)

        override val repaymentsStr =
                restructured.paymentsAmounts.map { String.format("%.2f", it) }

        override val greenColor = context.getColorBy(R.color.green)
    }


    private abstract class Behavior(tools: Tools) : Tools by tools {

        protected val repaymentsRadius get() = repaymentsRect.radius

        protected val path = Path()

        protected open val dateTextSize by lazy { getDimension(R.dimen.restructured_date_text_size) }
        protected open val checkedIconOffset get() = datesRect.radius * (0.35f + restructured.totalPartsCount * 0.04f)

        protected val textPaint = antiAliasPaint()

        private val okStrokeWidth by lazy { getDimension(R.dimen.restructured_icon_ok_stroke_width) }

        fun drawRepaymentDetails(
                step: Int,
                angle: Float,
                delta: Float,
                canvas: Canvas) {

            textPaint.color =
                    (0xFF000000.takeIf { step <= restructured.repaidPartsCount }
                            ?: 0xFFDEDEDE).toInt()

            drawRepaymentAmount(step, angle, delta, canvas)
            drawRepaymentDate(step, angle, delta, canvas)

            if (step < restructured.repaidPartsCount) {
                drawCheckedIcon(angle, delta, canvas)
            }
        }

        private fun drawCheckedIcon(startAngle: Float, sweepAngle: Float, canvas: Canvas) {
            with(repaymentsRect) {

                // background
                with(checkedIconPaint) {
                    style = Paint.Style.FILL
                    color = 0xffffffff.toInt()
                    strokeWidth = okStrokeWidth
                    strokeCap = Paint.Cap.ROUND
                }

                val centerX = vectorToX(centerX(), checkedIconOffset, startAngle + sweepAngle / 2)
                val centerY = vectorToY(centerY(), checkedIconOffset, startAngle + sweepAngle / 2)

                val backgroundRadius = checkedIconOffset * sin(sweepAngle / 180.0 * PI / 2).toFloat() * 7 / 12

                canvas.drawCircle(
                        centerX,
                        centerY,
                        backgroundRadius,
                        checkedIconPaint
                )

                // contour
                with(checkedIconPaint) {
                    style = Paint.Style.STROKE
                    color = 0xFFF0F0F0.toInt()
                }
                canvas.drawCircle(
                        centerX,
                        centerY,
                        backgroundRadius,
                        checkedIconPaint
                )

                //       //
                // ok \\//
                checkedIconPaint.color = greenColor

                val okCenterX = centerX - backgroundRadius / 5
                val okCenterY = centerY + backgroundRadius / 3

                canvas.drawLine(
                        okCenterX,
                        okCenterY,
                        vectorToX(okCenterX, backgroundRadius * 0.45f, 225f),
                        vectorToY(okCenterY, backgroundRadius * 0.45f, 225f),
                        checkedIconPaint
                )

                canvas.drawLine(
                        okCenterX,
                        okCenterY,
                        vectorToX(okCenterX, backgroundRadius, -45f),
                        vectorToY(okCenterY, backgroundRadius, -45f),
                        checkedIconPaint
                )
            }
        }

        protected abstract fun drawRepaymentAmount(
                step: Int,
                angle: Float,
                delta: Float,
                canvas: Canvas
        )

        private fun drawRepaymentDate(
                step: Int,
                angle: Float,
                delta: Float,
                canvas: Canvas
        ) {
            textPaint.apply {
                textAlign = Paint.Align.CENTER
                textSize = dateTextSize
            }

            restructured.let {
                canvas.drawTextOnPath(
                        it.dates[step].let(DateTimeFormat.forPattern("dd.MM")::print),
                        path.toCircleChord(datesRect, angle, delta),
                        0f,
                        0f,
                        textPaint
                )
            }
        }
    }


    private class Wide(tools: Tools) : Behavior(tools) {

        private val amountTextSize = getDimension(R.dimen.restructured_amount_text_size)
        private val uahTextSize = getDimension(R.dimen.restructured_uah_text_size)

        override fun drawRepaymentAmount(
                step: Int,
                angle: Float,
                delta: Float,
                canvas: Canvas
        ) {
            val numberSpace = repaymentsStr[step].length * 3 - 1
            val uahSpace = uah.length

            val denom = numberSpace + uahSpace + 2

            with(repaymentsRect) {
                val startX = vectorToX(centerX(), repaymentsRadius, angle + delta / denom)
                val startY = vectorToY(centerY(), repaymentsRadius, angle + delta / denom)

                val endX = vectorToX(centerX(), repaymentsRadius, angle + (denom - 1) * delta / denom)
                val endY = vectorToY(centerY(), repaymentsRadius, angle + (denom - 1) * delta / denom)

                val borderX = startX + (endX - startX) * numberSpace / denom
                val borderY = startY + (endY - startY) * numberSpace / denom

                path.relineTo(startX, startY, borderX, borderY)

                textPaint.textAlign = Paint.Align.RIGHT
                textPaint.textSize = amountTextSize

                canvas.drawTextOnPath(repaymentsStr[step], path, 0f, 0f, textPaint)

                path.relineTo(borderX, borderY, endX, endY)

                textPaint.textAlign = Paint.Align.LEFT
                textPaint.textSize = uahTextSize
                canvas.drawTextOnPath(uah, path, 8f, 0f, textPaint)
            }
        }
    }


    private class Narrow(tools: Tools) : Behavior(tools) {

        private val repaymentsOutputs = repaymentsStr.map { "$it\n$uah" }

        override val dateTextSize get() = getDimension(R.dimen.restructured_date_text_size) * 5 / restructured.totalPartsCount

        override fun drawRepaymentAmount(
                step: Int,
                angle: Float,
                delta: Float,
                canvas: Canvas
        ) {
            with(textPaint) {
                typeface = Typeface.DEFAULT_BOLD
                textAlign = Paint.Align.CENTER
                textSize = dateTextSize
            }

            canvas.drawTextOnPath(
                    repaymentsOutputs[step],
                    path.toCircleChord(repaymentsRect, angle, delta),
                    0f,
                    0f,
                    textPaint
            )

            textPaint.typeface = null
        }
    }
}
