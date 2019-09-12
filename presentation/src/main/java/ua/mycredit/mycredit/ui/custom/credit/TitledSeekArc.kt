package ua.mycredit.mycredit.ui.custom.credit

import android.content.Context
import android.graphics.*
import android.support.v4.content.ContextCompat
import android.util.AttributeSet
import android.view.MotionEvent
import ua.mycredit.mycredit.R
import ua.mycredit.mycredit.ui.custom.SeekArc
import ua.mycredit.mycredit.ui.custom.getOptionalText
import ua.mycredit.mycredit.ui.custom.invalidable
import ua.mycredit.mycredit.ui.getColorBy
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.max
import kotlin.math.sin

class TitledSeekArc @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyleAttr: Int = R.attr.seekArcStyle
) : SeekArc(context, attrs, defStyleAttr) {

    var progressBeginningText by invalidable("")
    var progressEndText by invalidable("")
    var arcEndText by invalidable("")

    var withDashes by invalidable(false)

    var outerBorderColor
        get() = outerBorderPaint.color
        set(value) {
            outerBorderPaint.color = value
            invalidate()
        }

    private val outerBorderArcRect = RectF()
    private val outerBorderPaint = Paint().apply {
        isAntiAlias = true
        style = Paint.Style.STROKE
        strokeWidth = 4f
    }

    private val dashesPaint = Paint().apply {
        isAntiAlias = true
        style = Paint.Style.STROKE
        strokeWidth = 2f
    }

    private val colorGray = ContextCompat.getColor(context, R.color.gray_8F8F8F)
    private val colorWhite = ContextCompat.getColor(context, R.color.white)

    private val path = Path()

    private val textOffset = 4f

    private val textPaint
        get() = Paint().apply {
            textSize = resources.getDimension(R.dimen.speedometer_text)
        }

    override fun onPostArcDraw(canvas: Canvas, arcStart: Float, arcSweep: Float) {

        drawDashesIfEnabled(
                arcSweep,
                arcStart,
                false,
                canvas
        )

        val endTextPaint = textPaint.apply {
            color = colorGray
            textAlign = Paint.Align.RIGHT
        }

        path.reset()
        path.addArc(mArcRect, arcStart, arcSweep - textOffset)
        canvas.drawTextOnPath(arcEndText, path, 0f, 12f, endTextPaint)
    }

    override fun onPostProgressDraw(canvas: Canvas, arcStart: Float, arcSweep: Float) {

        drawDashesIfEnabled(
                arcSweep,
                arcStart,
                true,
                canvas
        )

        val progressTextPaint = textPaint.apply {
            color = colorWhite
            textAlign = Paint.Align.LEFT
            typeface = Typeface.create(Typeface.DEFAULT, Typeface.BOLD)
        }

        path.reset()
        path.arcTo(mArcRect, arcStart + textOffset, max(mProgressSweep - 2 * textOffset, 0f))
        canvas.drawTextOnPath(progressBeginningText, path, 0f, 12f, progressTextPaint)

        progressTextPaint.textAlign = Paint.Align.RIGHT
        canvas.drawTextOnPath(progressEndText, path, 0f, 12f, progressTextPaint)

        canvas.drawArc(outerBorderArcRect, arcStart, arcSweep, false, outerBorderPaint)
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        outerBorderArcRect.set(mArcRect)

        val d = -progressWidth.toFloat() / 2 + outerBorderPaint.strokeWidth / 2
        outerBorderArcRect.inset(d, d)
    }

    override fun onTouchEvent(event: MotionEvent) = false

    private fun drawDashesIfEnabled(
            arcSweep: Float,
            arcStart: Float,
            progressDashesOnly: Boolean,
            canvas: Canvas) {

        if (withDashes && progressStepsTotal > 0) {

            dashesPaint.color = context.getColorBy(
                    R.color.arc_progress_dash.takeIf { progressDashesOnly } ?: R.color.arc_dash
            )

            val stepDelta = arcSweep / progressStepsTotal

            val startX = mArcRect.centerX()
            val startY = mArcRect.centerY()

            val startRadius = mArcRadius - progressWidth / 2
            val endRadius = mArcRadius + progressWidth / 2 - outerBorderPaint.strokeWidth / 2 - outerBorderPaint.strokeWidth % 2

            var angle = arcStart

            var i = 0
            val count = progressStep.takeIf { progressDashesOnly } ?: progressStepsTotal

            do {
                i++

                val angleRad = angle / 180 * PI.toFloat()
                angle += stepDelta


                val cos = cos(angleRad)
                val sin = sin(angleRad)

                canvas.drawLine(
                        startX + startRadius * cos,
                        startY + startRadius * sin,
                        startX + endRadius * cos,
                        startY + endRadius * sin,
                        dashesPaint
                )
            } while (i <= count)
        }
    }

    fun setProgressBeginningTextId(id: Int) {
        progressBeginningText = getOptionalText(id)
    }

    fun setProgressEndTextId(id: Int) {
        progressEndText = getOptionalText(id)
    }

    fun setArcEndTextId(id: Int) {
        arcEndText = getOptionalText(id)
    }

    fun setOuterBorderColorId(id: Int) {
        outerBorderColor = context.getColorBy(id)
    }
}
