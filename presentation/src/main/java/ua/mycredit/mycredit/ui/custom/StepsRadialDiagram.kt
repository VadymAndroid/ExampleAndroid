package ua.mycredit.mycredit.ui.custom

import android.content.Context
import android.graphics.*
import android.support.annotation.CallSuper
import android.util.AttributeSet
import android.view.View
import ua.mycredit.mycredit.R
import ua.mycredit.mycredit.ui.getColorBy

open class StepsRadialDiagram @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyleAttr: Int = R.attr.seekArcStyle
) : View(context, attrs, defStyleAttr) {

    var arcSweep by invalidable(270f)

    var stepsCount by invalidable(10)
    var currentStep by invalidable(3)

    private val arcStart get() = 270 - arcSweep / 2

    private val backgroundFillPaint = Paint().apply {
        color = 0xFFF7FAFC.toInt()
        style = Paint.Style.FILL
        isAntiAlias = true
    }

    private val backgroundStrokePaint = Paint().apply {
        color = 0x80F0F0F0.toInt()
        style = Paint.Style.STROKE
        strokeWidth = 2f
        isAntiAlias = true
    }

    private val passedStepPaint = fillColorPaint(R.color.green)
    private val currentStepPaint = fillColorPaint(R.color.yellow)

    private val fullRect = RectF()

    protected val diagramRect = RectF()
    private var diagramRadius = 0f

    override fun onDraw(canvas: Canvas) {
        drawBackground(canvas)
        drawSegments(canvas)
    }

    private fun drawBackground(canvas: Canvas) {
        canvas.drawArc(diagramRect, arcStart, arcSweep, true, backgroundFillPaint)
        canvas.drawArc(diagramRect, arcStart, arcSweep, false, backgroundStrokePaint)
    }

    private fun drawSegments(canvas: Canvas) {
        var i = 0
        var angle = arcStart

        val delta = arcSweep / stepsCount

        do {

            when {
                i < currentStep -> canvas.drawArc(diagramRect, angle, delta, true, passedStepPaint)
                i == currentStep -> canvas.drawArc(fullRect, angle, delta, true, currentStepPaint)
            }

            val x = vectorToX(diagramRect.centerX(), diagramRadius, angle)
            val y = vectorToY(diagramRect.centerY(), diagramRadius, angle)

            canvas.drawLine(diagramRect.centerX(), diagramRect.centerY(), x, y, backgroundStrokePaint)

            if (i < stepsCount) {
                onDrawStep(i, angle, delta, canvas)
            }

            angle += delta
            i++

        } while (i < stepsCount)
    }

    protected open fun onDrawStep(step: Int, angle: Float, delta: Float, canvas: Canvas) {}

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {

        val height = getDefaultSize(suggestedMinimumHeight, heightMeasureSpec)
        val width = getDefaultSize(suggestedMinimumWidth, widthMeasureSpec)

        val min = Math.min(width, height)

        val fullRectDiameter = (min - paddingLeft - paddingRight).toFloat()

        val left = (width - fullRectDiameter) / 2
        val top = (height - fullRectDiameter) / 2

        val indent = 20f
        fullRect.set(left, top, left + fullRectDiameter, top + fullRectDiameter)

        diagramRect.set(fullRect)
        diagramRect.inset(indent, indent)
        diagramRadius = fullRectDiameter / 2 - indent

        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
    }

    @CallSuper
    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        currentStepPaint.shader = RadialGradient(
                fullRect.centerX(),
                fullRect.centerY(),
                fullRect.width() / 2,
                context.getColorBy(R.color.arc_gradient_yellow_secondary),
                context.getColorBy(R.color.arc_gradient_yellow_primary),
                Shader.TileMode.REPEAT
        )
    }
}
