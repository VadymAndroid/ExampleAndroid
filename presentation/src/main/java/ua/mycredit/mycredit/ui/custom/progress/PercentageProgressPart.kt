package ua.mycredit.mycredit.ui.custom.progress

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import ua.mycredit.mycredit.R

class PercentageProgressPart @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : LinearLayout(context, attrs, defStyleAttr) {

    private lateinit var progress: ImageView
    private lateinit var pointer: TextView
    private var pointerText: CharSequence? = null
    private var withProgress = true

    init {
        View.inflate(context, R.layout.sign_up_progress_part, this)
        initAttrs(attrs, defStyleAttr)
        initViews()
    }

    private fun initViews() {
        progress = findViewById(R.id.progress)
        pointer = findViewById(R.id.pointer)
        pointer.text = pointerText
        if (!withProgress) {
            progress.visibility = View.GONE
        }
        isEnabled = false
    }

    private fun initAttrs(attrs: AttributeSet?, defStyleAttr: Int) {
        val a = context.obtainStyledAttributes(attrs, R.styleable.PercentageProgressPart, defStyleAttr, 0)

        pointerText = a.getString(R.styleable.PercentageProgressPart_pointer_text)
        withProgress = a.getBoolean(R.styleable.PercentageProgressPart_with_progress, true)

        a.recycle()
    }

    override fun setEnabled(enabled: Boolean) {
        super.setEnabled(enabled)
        progress.isEnabled = enabled
        pointer.isEnabled = enabled

        when (enabled) {
            true -> pointerText
            else -> null
        }.let { pointer.text = it }
    }

    var label
        get() = pointerText
        set(value) {
            pointerText = value
            pointer.text = pointerText
        }
}
