package ua.mycredit.mycredit.ui.custom

import android.content.Context
import android.graphics.Paint
import android.graphics.Path
import android.graphics.RectF
import android.support.annotation.ColorRes
import android.view.View
import ua.mycredit.mycredit.ui.getColorBy
import ua.mycredit.mycredit.ui.getOptionalText
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin
import kotlin.properties.Delegates

inline fun <T> View.invalidable(initialValue: T, crossinline preCalculation: (T) -> Unit = {}) =
        Delegates.observable(initialValue) { _, _, new ->
            preCalculation(new)
            invalidate()
        }

fun View.getOptionalText(id: Int, vararg arguments: Any) = context.getOptionalText(id, *arguments)

fun View.fillColorPaint(@ColorRes colorId: Int) = context.fillColorPaint(colorId)

fun Context.fillColorPaint(@ColorRes colorId: Int) =
        Paint().apply {
            isAntiAlias = true
            style = Paint.Style.FILL
            color = getColorBy(colorId)
        }

fun View.strokeColorPaint(@ColorRes colorId: Int) =
        Paint().apply {
            isAntiAlias = true
            style = Paint.Style.STROKE
            color = context.getColorBy(colorId)
        }

fun antiAliasPaint() = Paint().apply { isAntiAlias = true }

fun vectorDx(radius: Float, angle: Float) = radius * cos(angle / 180.0 * PI).toFloat()

fun vectorDy(radius: Float, angle: Float) = radius * sin(angle / 180.0 * PI).toFloat()


fun vectorToX(fromX: Float, radius: Float, angle: Float) = fromX + vectorDx(radius, angle)
fun vectorToY(fromY: Float, radius: Float, angle: Float) = fromY + vectorDy(radius, angle)

val RectF.radius get() = (right - left) / 2


fun Path.relineTo(startX: Float, startY: Float, endX: Float, endY: Float) {
    reset()
    moveTo(startX, startY)
    lineTo(endX, endY)
}

fun Path.toCircleChord(circleRect: RectF, startAngle: Float, sweepAngle: Float) = apply {
    with(circleRect) {
        val startX = vectorToX(centerX(), radius, startAngle)
        val startY = vectorToY(centerY(), radius, startAngle)

        val endX = vectorToX(centerX(), radius, startAngle + sweepAngle)
        val endY = vectorToY(centerY(), radius, startAngle + sweepAngle)

        relineTo(startX, startY, endX, endY)
    }
}
