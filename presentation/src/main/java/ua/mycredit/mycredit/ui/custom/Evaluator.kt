package ua.mycredit.mycredit.ui.custom

import android.animation.TypeEvaluator

interface EvaluatorListener {
    fun onEvaluate(evaluate: Int)
}

class CustomEvaluator(private val evaluatorListener: EvaluatorListener) : TypeEvaluator<Int> {

    override fun evaluate(fraction: Float, startValue: Int, endValue: Int): Int =
            (startValue + fraction * (endValue - startValue))
                    .toInt()
                    .also(evaluatorListener::onEvaluate)
}
