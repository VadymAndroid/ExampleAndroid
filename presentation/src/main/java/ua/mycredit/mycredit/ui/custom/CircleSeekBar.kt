package ua.mycredit.mycredit.ui.custom

import android.annotation.TargetApi
import android.content.Context
import android.graphics.*
import android.graphics.drawable.Drawable
import android.os.Build
import android.os.Bundle
import android.os.Parcelable
import android.support.v4.content.ContextCompat
import android.support.v4.graphics.drawable.DrawableCompat
import android.text.TextUtils
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import org.jetbrains.anko.dip
import ua.mycredit.mycredit.R

class CircleSeekBar @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : View(context, attrs, defStyleAttr) {
    private lateinit var mWheelPaint: Paint
    private lateinit var mReachedPaint: Paint
    private lateinit var mReachedEdgePaint: Paint
    private lateinit var mPointerPaint: Paint
    private lateinit var startTextPaint: Paint
    private lateinit var endTextPaint: Paint
    private var mMaxProcess: Int = 0
    private var mMinProcessValue: Int = 0
    private var mMaxProcessValue: Int = 0
    private var mCurProcess: Int = 0
    private var mUnreachedRadius: Float = 0.toFloat()
    private var mReachedColor: Int = 0
    private var mReachedColorFrom: Int = 0
    private var mUnreachedColor: Int = 0
    private var pointerBitmap: Bitmap? = null
    private var mReachedWidth: Float = 0.toFloat()
    private var mUnreachedWidth: Float = 0.toFloat()
    private var isHasReachedCornerRound: Boolean = false
    private var mPointerColor: Int = 0
    private var mPointerRadius: Float = 0.toFloat()
    private var mCurAngle: Double = 0.toDouble()
    private var mWheelCurX: Float = 0.toFloat()
    private var mWheelCurY: Float = 0.toFloat()
    var isHasWheelShadow: Boolean = false
        private set
    var isHasPointerShadow: Boolean = false
        private set
    var wheelShadowRadius: Float = 0.toFloat()
        private set
    private var mPointerShadowRadius: Float = 0.toFloat()
    private var isHasCache: Boolean = false
    private var mCacheCanvas: Canvas? = null
    private var mCacheBitmap: Bitmap? = null
    private var isCanTouch: Boolean = false
    private var isScrollOneCircle: Boolean = false
    private var mDefShadowOffset: Float = 0.toFloat()

    private var mStartText: String? = null
    private var mStartTextColor: Int = 0
    private var mStartTextSize: Float = 0f
    private var mEndText: String? = null
    private var mEndTextColor: Int = 0
    private var mEndTextSize: Float = 0f

    private var gradient: LinearGradient? = null
    private var rectF: RectF? = null

    private var mOnChangedListener: OnSeekBarChangedListener? = null
    private var mOnChangingListener: OnSeekBarChangingListener? = null

    private val circleWidth: Float
        get() = Math.max(mUnreachedWidth, Math.max(mReachedWidth, mPointerRadius))

    private val selectedValue: Int
        get() = Math.round(mMaxProcess.toFloat() * (mCurAngle.toFloat() / 360.0f))

    var curProcess: Int
        get() = mCurProcess
        set(curProcess) {
            mCurProcess = if (curProcess > mMaxProcess) mMaxProcess else curProcess
            mCurProcess = if (curProcess < mMinProcessValue) mMinProcessValue else curProcess
            mCurProcess = if (curProcess > mMaxProcessValue && mMaxProcessValue != 0) mMaxProcessValue else curProcess

            refreshPosition()
            invalidate()
        }

    var maxProcess: Int
        get() = mMaxProcess
        set(maxProcess) {
            mMaxProcess = maxProcess
            refreshPosition()
            invalidate()
        }

    var maxProcessValue: Int
        get() = mMaxProcessValue
        set(maxProcessValue) {
            mMaxProcessValue = maxProcessValue
            refreshPosition()
            invalidate()
        }

    var minProcessValue: Int
        get() = mMinProcessValue
        set(minProcessValue) {
            mMinProcessValue = minProcessValue
            refreshPosition()
            invalidate()
        }

    var reachedColor: Int
        get() = mReachedColor
        set(reachedColor) {
            mReachedColor = reachedColor
            mReachedPaint.color = reachedColor
            mReachedEdgePaint.color = reachedColor
            invalidate()
        }

    var unreachedColor: Int
        get() = mUnreachedColor
        set(unreachedColor) {
            mUnreachedColor = unreachedColor
            mWheelPaint.color = unreachedColor
            invalidate()
        }

    var reachedWidth: Float
        get() = mReachedWidth
        set(reachedWidth) {
            mReachedWidth = reachedWidth
            mReachedPaint.strokeWidth = reachedWidth
            mReachedEdgePaint.strokeWidth = reachedWidth
            invalidate()
        }

    var unreachedWidth: Float
        get() = mUnreachedWidth
        set(unreachedWidth) {
            mUnreachedWidth = unreachedWidth
            mWheelPaint.strokeWidth = unreachedWidth
            refreshUnreachedWidth()
            invalidate()
        }

    var pointerColor: Int
        get() = mPointerColor
        set(pointerColor) {
            mPointerColor = pointerColor
            mPointerPaint.color = pointerColor
        }

    var pointerRadius: Float
        get() = mPointerRadius
        set(pointerRadius) {
            mPointerRadius = pointerRadius
            mPointerPaint.strokeWidth = pointerRadius
            invalidate()
        }

    var pointerShadowRadius: Float
        get() = mPointerShadowRadius
        set(pointerShadowRadius) {
            mPointerShadowRadius = pointerShadowRadius
            if (mPointerShadowRadius == 0.0f) {
                isHasPointerShadow = false
                mPointerPaint.clearShadowLayer()
            } else {
                mPointerPaint.setShadowLayer(pointerShadowRadius, mDefShadowOffset, mDefShadowOffset, -12303292)
                setSoftwareLayer()
            }

            invalidate()
        }

    var endText: String?
        get() = mEndText
        set(endText) {
            mEndText = endText
            invalidate()
        }

    var startText: String?
        get() = mStartText
        set(startText) {
            mStartText = startText
            invalidate()
        }

    init {
        initAttrs(attrs, defStyleAttr)
        initPadding()
        initPaints()
    }

    private fun initPaints() {
        mDefShadowOffset = getDimen(R.dimen.def_shadow_offset)
        val shadowColor = ContextCompat.getColor(context, R.color.def_shadow)
        mWheelPaint = Paint(1).apply {
            color = mUnreachedColor
            style = Paint.Style.STROKE
            strokeWidth = mUnreachedWidth
            if (isHasWheelShadow) {
                setShadowLayer(wheelShadowRadius, mDefShadowOffset, mDefShadowOffset, shadowColor)
            }
        }

        mReachedPaint = Paint(1).apply {
            color = mReachedColor
            style = Paint.Style.STROKE
            strokeWidth = mReachedWidth
            if (isHasReachedCornerRound) {
                strokeCap = Paint.Cap.ROUND
            }
        }

        mPointerPaint = Paint(1).apply {
            color = mPointerColor
            style = Paint.Style.FILL
            if (isHasPointerShadow) {
                setShadowLayer(mPointerShadowRadius, mDefShadowOffset, mDefShadowOffset, shadowColor)
            }
        }

        mReachedEdgePaint = Paint(mReachedPaint).apply {
            style = Paint.Style.FILL
        }
    }

    private fun initAttrs(attrs: AttributeSet?, defStyle: Int) {
        val a = context.obtainStyledAttributes(attrs, R.styleable.CircleSeekBar, defStyle, 0)
        mMaxProcess = a.getInt(R.styleable.CircleSeekBar_wheel_max_process, 100)
        mMinProcessValue = a.getInt(R.styleable.CircleSeekBar_wheel_min_process_value, 0)
        mMaxProcessValue = a.getInt(R.styleable.CircleSeekBar_wheel_max_process_value, 0)
        mCurProcess = a.getInt(R.styleable.CircleSeekBar_wheel_cur_process, 0)

        if (mCurProcess > mMaxProcess) mCurProcess = mMaxProcess
        if (mCurProcess < mMinProcessValue) mCurProcess = mMinProcessValue
        if (mCurProcess > mMaxProcessValue && mMaxProcessValue != 0) mCurProcess = mMaxProcessValue

        mReachedColor = a.getColor(R.styleable.CircleSeekBar_wheel_reached_color, getColor(R.color.def_reached_color))
        mReachedColorFrom = a.getColor(R.styleable.CircleSeekBar_wheel_reached_color_from, mReachedColor)
        mUnreachedColor = a.getColor(R.styleable.CircleSeekBar_wheel_unreached_color, getColor(R.color.def_wheel_color))
        mUnreachedWidth = a.getDimension(R.styleable.CircleSeekBar_wheel_unreached_width, getDimen(R.dimen.def_wheel_width))
        isHasReachedCornerRound = a.getBoolean(R.styleable.CircleSeekBar_wheel_reached_has_corner_round, true)
        mReachedWidth = a.getDimension(R.styleable.CircleSeekBar_wheel_reached_width, mUnreachedWidth)
        val pointerBitmapId = a.getResourceId(R.styleable.CircleSeekBar_wheel_pointer_drawable, 0)
        if (pointerBitmapId != 0) {
            pointerBitmap = getBitmapFromVectorDrawable(context, pointerBitmapId)
        }
        mPointerColor = a.getColor(R.styleable.CircleSeekBar_wheel_pointer_color, getColor(R.color.def_pointer_color))
        mPointerRadius = a.getDimension(R.styleable.CircleSeekBar_wheel_pointer_radius, mReachedWidth / 2.0f)
        isHasWheelShadow = a.getBoolean(R.styleable.CircleSeekBar_wheel_has_wheel_shadow, false)
        if (isHasWheelShadow) {
            wheelShadowRadius = a.getDimension(R.styleable.CircleSeekBar_wheel_shadow_radius, getDimen(R.dimen.def_shadow_radius))
        }

        isHasPointerShadow = a.getBoolean(R.styleable.CircleSeekBar_wheel_has_pointer_shadow, false)
        if (isHasPointerShadow) {
            mPointerShadowRadius = a.getDimension(R.styleable.CircleSeekBar_wheel_pointer_shadow_radius, getDimen(R.dimen.def_shadow_radius))
        }

        mStartText = a.getString(R.styleable.CircleSeekBar_wheel_start_text)
        mStartTextColor = a.getColor(R.styleable.CircleSeekBar_wheel_start_text_color, 0)
        mStartTextSize = a.getDimension(R.styleable.CircleSeekBar_wheel_start_text_size, 0f)

        mEndText = a.getString(R.styleable.CircleSeekBar_wheel_end_text)
        mEndTextColor = a.getColor(R.styleable.CircleSeekBar_wheel_end_text_color, mStartTextColor)
        mEndTextSize = a.getDimension(R.styleable.CircleSeekBar_wheel_end_text_size, mStartTextSize)

        isHasCache = a.getBoolean(R.styleable.CircleSeekBar_wheel_has_cache, isHasWheelShadow)
        isCanTouch = a.getBoolean(R.styleable.CircleSeekBar_wheel_can_touch, true)
        isScrollOneCircle = a.getBoolean(R.styleable.CircleSeekBar_wheel_scroll_only_one_circle, false)
        if (isHasPointerShadow or isHasWheelShadow) {
            setSoftwareLayer()
        }

        startTextPaint = Paint(1).apply {
            color = mStartTextColor
            textSize = mStartTextSize
        }

        endTextPaint = Paint(1).apply {
            color = mEndTextColor
            textSize = mEndTextSize
        }

        a.recycle()
    }

    private fun initPadding() {
        val paddingLeft = paddingLeft
        val paddingTop = paddingTop
        val paddingRight = paddingRight
        val paddingBottom = paddingBottom
        var paddingStart = 0
        var paddingEnd = 0
        if (Build.VERSION.SDK_INT >= 17) {
            paddingStart = getPaddingStart()
            paddingEnd = getPaddingEnd()
        }

        val maxPadding = Math.max(paddingLeft, Math.max(paddingTop, Math.max(paddingRight, Math.max(paddingBottom, Math.max(paddingStart, paddingEnd)))))
        setPadding(maxPadding, maxPadding, maxPadding, maxPadding)
    }

    @TargetApi(23)
    private fun getColor(colorId: Int): Int = ContextCompat.getColor(context, colorId)

    private fun getDimen(dimenId: Int): Float = resources.getDimension(dimenId)

    private fun setSoftwareLayer() {
        setLayerType(LAYER_TYPE_SOFTWARE, null)
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val height = View.getDefaultSize(suggestedMinimumHeight, heightMeasureSpec)
        val width = View.getDefaultSize(suggestedMinimumWidth, widthMeasureSpec)
        val min = Math.min(width, height)
        setMeasuredDimension(min, min)
        refreshPosition()
        refreshUnreachedWidth()
    }

    override fun onDraw(canvas: Canvas) {
        val left = paddingLeft.toFloat() + mUnreachedWidth / 2.0f
        val top = paddingTop.toFloat() + mUnreachedWidth / 2.0f
        val right = (canvas.width - paddingRight).toFloat() - mUnreachedWidth / 2.0f
        val bottom = (canvas.height - paddingBottom).toFloat() - mUnreachedWidth / 2.0f
        val centerX = (left + right) / 2.0f
        val centerY = (top + bottom) / 2.0f
        val wheelRadius = ((canvas.width - paddingLeft - paddingRight) / 2).toFloat() - mUnreachedWidth / 2.0f
        if (isHasCache) {
            if (mCacheCanvas == null) {
                buildCache(centerX, centerY, wheelRadius)
            }

            canvas.drawBitmap(mCacheBitmap!!, 0.0f, 0.0f, null)
        } else {
            canvas.drawCircle(centerX, centerY, wheelRadius, mWheelPaint)
        }

        if (mReachedColorFrom != mReachedColor) {
            if (gradient == null) {
                gradient = LinearGradient(left, top, right, bottom, mReachedColor, mReachedColorFrom, Shader.TileMode.CLAMP)
            }
            mReachedPaint.shader = gradient
        }

        if (rectF == null) {
            rectF = RectF(left, top, right, bottom)
        }

        canvas.drawArc(rectF, -90.0f, mCurAngle.toFloat(), false, mReachedPaint)

        val margin = context.dip(TEXT_MARGIN)
        if (!TextUtils.isEmpty(mStartText)) {
            val y = reachedWidth.toInt() - getTextYOffset(reachedWidth.toInt(), mStartText!!, mStartTextSize)
            canvas.drawText(mStartText, centerX + margin, y, startTextPaint)
        }

        if (!TextUtils.isEmpty(mEndText)) {
            val y = reachedWidth.toInt() - getTextYOffset(reachedWidth.toInt(), mEndText!!, mEndTextSize)
            canvas.drawText(mEndText, centerX - textPaintWidth(endTextPaint, mEndText!!) - margin, y, endTextPaint)
        }

        if (pointerBitmap != null) {
            mWheelCurX -= pointerBitmap!!.width / 2
            mWheelCurY -= pointerBitmap!!.height / 2
            canvas.drawBitmap(pointerBitmap!!, mWheelCurX, mWheelCurY, null)
        } else {
            canvas.drawCircle(mWheelCurX, mWheelCurY, mPointerRadius, mPointerPaint)
        }
    }

    private fun buildCache(centerX: Float, centerY: Float, wheelRadius: Float) {
        mCacheBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
        mCacheCanvas = Canvas(mCacheBitmap!!)
        mCacheCanvas!!.drawCircle(centerX, centerY, wheelRadius, mWheelPaint)
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        val x = event.x
        val y = event.y

        when (event.action) {
            MotionEvent.ACTION_DOWN ->
                // Disallow ScrollView to intercept touch events.
                parent.requestDisallowInterceptTouchEvent(true)

            MotionEvent.ACTION_UP -> {
                mOnChangedListener?.onChanged(mCurProcess)
                // Allow ScrollView to intercept touch events.
                parent.requestDisallowInterceptTouchEvent(false)
            }
        }

        if (isCanTouch && (event.action == MotionEvent.ACTION_MOVE || isTouch(x, y))) {
            var cos = computeCos(x, y)
            val angle: Double
            angle = if (x < (width / 2).toFloat()) {
                180.0 + Math.acos(cos.toDouble()) * RADIAN
            } else {
                180.0 - Math.acos(cos.toDouble()) * RADIAN
            }

            if (isScrollOneCircle) {
                if (mCurAngle > 270.0 && angle < 90.0) {
                    mCurAngle = 360.0
                    cos = -1.0f
                } else if (mCurAngle < 90.0 && angle > 270.0) {
                    mCurAngle = 0.0
                    cos = -1.0f
                } else {
                    mCurAngle = angle
                }
            } else {
                mCurAngle = angle
            }

            if (mMinProcessValue != 0) {
                val minAngle = mMinProcessValue.toFloat() / mMaxProcess.toFloat() * 360.0
                if (mCurAngle < minAngle) {
                    mCurAngle = minAngle
                    cos = Math.cos(Math.toRadians(minAngle)).toFloat()
                    cos *= -1
                }
            }

            if (mMaxProcessValue != 0) {
                val maxAngle = mMaxProcessValue.toFloat() / mMaxProcess.toFloat() * 360.0
                if (mCurAngle > maxAngle) {
                    mCurAngle = maxAngle
                    cos = Math.cos(Math.toRadians(maxAngle)).toFloat()
                    cos *= -1
                }
            }

            mCurProcess = selectedValue
            refreshWheelCurPosition(cos.toDouble())
            if (event.action and MotionEvent.ACTION_CANCEL > 0) {
                mOnChangingListener?.onChanging(mCurProcess)
            }

            invalidate()
            return true
        } else {
            return super.onTouchEvent(event)
        }
    }

    private fun isTouch(x: Float, y: Float): Boolean {
        val w = (width - paddingLeft * 4).toFloat()
        val radius = ((w + circleWidth) / 2.0f).toDouble()
        val innerRadius = ((w - circleWidth) / 2.0f).toDouble()
        val centerX = (width / 2).toDouble()
        val centerY = (height / 2).toDouble()
        val powPoint = Math.pow(centerX - x.toDouble(), 2.0) + Math.pow(centerY - y.toDouble(), 2.0)
        return (powPoint < radius * radius) && (powPoint > innerRadius * innerRadius)
    }

    private fun refreshUnreachedWidth() {
        mUnreachedRadius = ((measuredWidth - paddingLeft - paddingRight).toFloat() - mUnreachedWidth) / 2.0f
    }

    private fun refreshWheelCurPosition(cos: Double) {
        mWheelCurX = calcXLocationInWheel(mCurAngle, cos)
        mWheelCurY = calcYLocationInWheel(cos)
    }

    private fun refreshPosition() {
        mCurAngle = mCurProcess.toDouble() / mMaxProcess.toDouble() * 360.0
        val cos = -Math.cos(Math.toRadians(mCurAngle))
        refreshWheelCurPosition(cos)
    }

    private fun calcXLocationInWheel(angle: Double, cos: Double): Float {
        val measuredCenter = (measuredWidth / 2).toDouble()
        val sqrt = Math.sqrt(1.0 - cos * cos) * mUnreachedRadius.toDouble()
        return when {
            angle < 180.0 -> measuredCenter + sqrt
            else -> measuredCenter - sqrt
        }.toFloat()
    }

    private fun calcYLocationInWheel(cos: Double): Float =
            (measuredWidth / 2).toFloat() + mUnreachedRadius * cos.toFloat()

    private fun computeCos(x: Float, y: Float): Float {
        val width = x - (width / 2).toFloat()
        val height = y - (height / 2).toFloat()
        val slope = Math.sqrt((width * width + height * height).toDouble()).toFloat()
        return height / slope
    }

    override fun onSaveInstanceState(): Parcelable? =
            Bundle().apply {
                putParcelable("page", super.onSaveInstanceState())
                putInt("max_process", mMaxProcess)
                putInt("min_process_value", mMinProcessValue)
                putInt("cur_process", mCurProcess)
                putInt("reached_color", mReachedColor)
                putFloat("reached_width", mReachedWidth)
                putBoolean("reached_corner_round", isHasReachedCornerRound)
                putInt("unreached_color", mUnreachedColor)
                putFloat("unreached_width", mUnreachedWidth)
                putInt("pointer_color", mPointerColor)
                putFloat("pointer_radius", mPointerRadius)
                putBoolean("pointer_shadow", isHasPointerShadow)
                putFloat("pointer_shadow_radius", mPointerShadowRadius)
                putBoolean("wheel_shadow", isHasWheelShadow)
                putFloat("wheel_shadow_radius", mPointerShadowRadius)
                putBoolean("wheel_has_cache", isHasCache)
                putBoolean("wheel_can_touch", isCanTouch)
                putBoolean("wheel_scroll_only_one_circle", isScrollOneCircle)
            }


    override fun onRestoreInstanceState(state: Parcelable) {
        if (state is Bundle) {
            with(state) {
                super.onRestoreInstanceState(getParcelable("page"))
                mMaxProcess = getInt("max_process")
                mMinProcessValue = getInt("min_process_value")
                mCurProcess = getInt("cur_process")
                mReachedColor = getInt("reached_color")
                mReachedWidth = getFloat("reached_width")
                isHasReachedCornerRound = getBoolean("reached_corner_round")
                mUnreachedColor = getInt("unreached_color")
                mUnreachedWidth = getFloat("unreached_width")
                mPointerColor = getInt("pointer_color")
                mPointerRadius = getFloat("pointer_radius")
                isHasPointerShadow = getBoolean("pointer_shadow")
                mPointerShadowRadius = getFloat("pointer_shadow_radius")
                isHasWheelShadow = getBoolean("wheel_shadow")
                mPointerShadowRadius = getFloat("wheel_shadow_radius")
                isHasCache = getBoolean("wheel_has_cache")
                isCanTouch = getBoolean("wheel_can_touch")
                isScrollOneCircle = getBoolean("wheel_scroll_only_one_circle")
            }
            initPaints()
        } else {
            super.onRestoreInstanceState(state)
        }

        mOnChangedListener?.onChanged(mCurProcess)
    }

    fun isHasReachedCornerRound() = isHasReachedCornerRound

    fun setHasReachedCornerRound(hasReachedCornerRound: Boolean) {
        isHasReachedCornerRound = hasReachedCornerRound
        mReachedPaint.strokeCap = if (hasReachedCornerRound) Paint.Cap.ROUND else Paint.Cap.BUTT
        invalidate()
    }

    fun setWheelShadow(wheelShadow: Float) {
        wheelShadowRadius = wheelShadow
        if (wheelShadow == 0.0f) {
            isHasWheelShadow = false
            mWheelPaint.clearShadowLayer()
            mCacheCanvas = null
            mCacheBitmap!!.recycle()
            mCacheBitmap = null
        } else {
            mWheelPaint.setShadowLayer(wheelShadowRadius, mDefShadowOffset, mDefShadowOffset, -12303292)
            setSoftwareLayer()
        }

        invalidate()
    }

    fun setOnSeekBarChangedListener(listener: OnSeekBarChangedListener) {
        mOnChangedListener = listener
    }

    fun setOnSeekBarChangingListener(listener: OnSeekBarChangingListener) {
        mOnChangingListener = listener
    }

    interface OnSeekBarChangedListener {
        fun onChanged(progress: Int)
    }

    interface OnSeekBarChangingListener {
        fun onChanging(progress: Int)
    }

    private fun textPaintHeight(textPaint: Paint, text: String): Float =
            textRect(textPaint, text).height().toFloat()

    private fun textPaintWidth(textPaint: Paint, text: String): Float =
            textRect(textPaint, text).width().toFloat()

    private fun textRect(textPaint: Paint, mText: String): Rect {
        val bounds = Rect()
        textPaint.getTextBounds(mText, 0, mText.length, bounds)
        return bounds
    }

    private fun getTextYOffset(height: Int, text: String, fontSize: Float): Float {
        val p = Paint()
        p.textSize = fontSize
        val textHeight = textPaintHeight(p, text)
        return (height - textHeight) / 2f - fontSize / 2f
    }

    companion object {
        private const val RADIAN = 57.29577951308232
        private const val TEXT_MARGIN = 6

        fun getBitmapFromVectorDrawable(context: Context, drawableId: Int): Bitmap? {
            if (drawableId == 0) return null

            val drawable = ContextCompat.getDrawable(context, drawableId)
            return getBitmapFromDrawable(drawable)
        }

        private fun getBitmapFromDrawable(fromDrawable: Drawable?): Bitmap? {
            var drawable = fromDrawable ?: return null

            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
                drawable = DrawableCompat.wrap(drawable).mutate()
            }

            val bitmap = Bitmap.createBitmap(drawable.intrinsicWidth, drawable.intrinsicHeight, Bitmap.Config.ARGB_8888)
            val canvas = Canvas(bitmap)
            drawable.apply {
                setBounds(0, 0, canvas.width, canvas.height)
                draw(canvas)
            }

            return bitmap
        }
    }
}
