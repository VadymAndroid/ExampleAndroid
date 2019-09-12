package ua.mycredit.mycredit.ui.custom.progress

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout
import org.jetbrains.anko.forEachChildWithIndex
import ua.mycredit.mycredit.R

class PercentageProgress @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : LinearLayout(context, attrs, defStyleAttr) {

    private var mMax = DEF_MAX
    private var mProgress = 0
    private var mProgressValues: Array<CharSequence> = arrayOf()

    init {
        View.inflate(context, R.layout.sign_up_progress, this)
        initAttrs(attrs, defStyleAttr)
        initPadding()
        initViews()
    }

    private fun initAttrs(attrs: AttributeSet?, defStyleAttr: Int) {
        val a = context.obtainStyledAttributes(attrs, R.styleable.PercentageProgress, defStyleAttr, 0)

        mMax = a.getInt(R.styleable.PercentageProgress_max, DEF_MAX)
        mProgress = a.getInt(R.styleable.PercentageProgress_progress, 0)
        mProgressValues = a.getTextArray(R.styleable.PercentageProgress_progress_values)

        a.recycle()
    }

    private fun initPadding() {
        resources.getDimension(R.dimen.margin).toInt()
                .let { setPadding(it, 0, it, 0) }
    }

    private fun initViews() {
        (0 until mMax).forEach {
            PercentageProgressPart(context).let {
                it.layoutParams = LinearLayout.LayoutParams(0, LayoutParams.WRAP_CONTENT, 1f)
                addView(it)
            }
        }
        refresh()
    }

    private fun refresh() {
        forEachChildWithIndex { i, v ->
            if (v is PercentageProgressPart) {
                v.isEnabled = i <= mProgress
                when {
                    mProgress == i && i < mProgressValues.size -> mProgressValues[i]
                    else -> null
                }.let {
                    v.label = it
                }
            }
        }
    }

    var progress
        get() = mProgress
        set(value) {
            mProgress = when {
                value > mMax -> mMax
                value < 0 -> 0
                else -> value
            }
            refresh()
        }

    companion object {
        const val DEF_MAX = 10
    }
}
