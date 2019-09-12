package ua.mycredit.mycredit.ui.custom

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.RectF
import android.graphics.SweepGradient
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.View
import ua.mycredit.mycredit.R
import ua.mycredit.mycredit.ui.getColorBy

open class SeekArc @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = R.attr.seekArcStyle) : View(context, attrs, defStyleAttr) {
    // The initial rotational offset -90 means we start at 12 o'clock
    protected val mAngleOffset = -90

    /**
     * The Drawable for the seek arc thumbnail
     */
    private var mThumb: Drawable? = null

    /**
     * The Maximum value that this SeekArc can be set to
     */
    var progressStepsTotal by invalidable(100) { updateProgress(mProgress, false) }

    var progressStep
        get() = mProgress
        set(progress) = updateProgress(progress, false)

    /**
     * The Current value that the SeekArc is set to
     */
    private var mProgress = 0

    /**
     * The width of the progress line for this SeekArc
     */
    private var mProgressWidth = 4

    /**
     * The Width of the background arc for the SeekArc
     */
    private var mArcWidth = 24

    /**
     * The Angle to start drawing this Arc from
     */
    protected var mStartAngle = 0

    /**
     * The Angle through which to draw the arc (Max is 360)
     */
    protected var mSweepAngle = 360

    /**
     * The rotation of the SeekArc- 0 is twelve o'clock
     */
    protected var mRotation = 0

    /**
     * Give the SeekArc rounded edges
     */
    private var mRoundedEdges = false

    /**
     * Enable touch inside the SeekArc
     */
    private var mTouchInside = true

    /**
     * Will the progress increase clockwise or anti-clockwise
     */
    var isClockwise = true


    /**
     * is the control enabled/touchable
     */

    // Internal variables
    protected var mArcRadius = 0
    protected var mProgressSweep = 0f
    protected val mArcRect = RectF()
    private var mArcPaint: Paint
    protected var mProgressPaint: Paint
    private var mTranslateX: Int = 0
    private var mTranslateY: Int = 0
    private var mThumbXPos: Int = 0
    private var mThumbYPos: Int = 0
    private var mTouchAngle: Double = 0.toDouble()
    private var mTouchIgnoreRadius: Float = 0.toFloat()
    private var mOnSeekArcChangeListener: OnSeekArcChangeListener? = null

    var progressWidth: Int
        get() = mProgressWidth
        set(mProgressWidth) {
            this.mProgressWidth = mProgressWidth
            mProgressPaint.strokeWidth = mProgressWidth.toFloat()
        }

    var arcWidth: Int
        get() = mArcWidth
        set(mArcWidth) {
            this.mArcWidth = mArcWidth
            mArcPaint.strokeWidth = mArcWidth.toFloat()
        }

    var arcRotation: Int
        get() = mRotation
        set(mRotation) {
            this.mRotation = mRotation
            updateThumbPosition()
        }

    var startAngle: Int
        get() = mStartAngle
        set(mStartAngle) {
            this.mStartAngle = mStartAngle
            updateThumbPosition()
        }

    var sweepAngle: Int
        get() = mSweepAngle
        set(mSweepAngle) {
            this.mSweepAngle = mSweepAngle
            updateThumbPosition()
        }

    var arcColor: Int
        get() = mArcPaint.color
        set(color) {
            mArcPaint.color = color
            invalidate()
        }

    var progressColors by invalidable(defaultProgressColors(context)) { updateProgressShader() }

    init {

        Log.d(TAG, "Initialising SeekArc")

        val density = resources.displayMetrics.density

        // Defaults, may need to link this into theme settings
        var arcColor = context.getColorBy(R.color.arc_default_color)
        //mThumb = context.getDrawableBy(R.drawable.abc_seekbar_thumb_material)
        // Convert progress width to pixels for current density
        mProgressWidth = (mProgressWidth * density).toInt()

        var progressColors = defaultProgressColors(context)

        if (attrs != null) {
            // Attribute initialization
            val a = context.obtainStyledAttributes(attrs, R.styleable.SeekArc, defStyleAttr, 0)

            mThumb = a.getDrawable(R.styleable.SeekArc_thumb)

            val thumbHalfHeight = getIntrinsicHeight()
            val thumbHalfWidth = getIntrinsicWidth()
            mThumb?.setBounds(-thumbHalfWidth, -thumbHalfHeight, thumbHalfWidth, thumbHalfHeight)

            progressStepsTotal = a.getInteger(R.styleable.SeekArc_arcMax, progressStepsTotal)
            mProgress = a.getInteger(R.styleable.SeekArc_arcProgress, mProgress)
            mProgressWidth = a.getDimension(R.styleable.SeekArc_progressWidth, mProgressWidth.toFloat()).toInt()
            mArcWidth = a.getDimension(R.styleable.SeekArc_arcWidth, mArcWidth.toFloat()).toInt()
            mStartAngle = a.getInt(R.styleable.SeekArc_startAngle, mStartAngle)
            mSweepAngle = a.getInt(R.styleable.SeekArc_sweepAngle, mSweepAngle)
            mRotation = a.getInt(R.styleable.SeekArc_rotation, mRotation)
            mRoundedEdges = a.getBoolean(R.styleable.SeekArc_roundEdges, mRoundedEdges)
            mTouchInside = a.getBoolean(R.styleable.SeekArc_touchInside, mTouchInside)
            isClockwise = a.getBoolean(R.styleable.SeekArc_clockwise, isClockwise)
            isEnabled = a.getBoolean(R.styleable.SeekArc_enabled, isEnabled)

            arcColor = a.getColor(R.styleable.SeekArc_arcColor, arcColor)

            progressColors = a.getResourceId(R.styleable.SeekArc_progressColorsArray, R.array.arc_normal_colors)
                    .let { resources.getIntArray(it) }



            a.recycle()
        }

        mProgress = if (mProgress > progressStepsTotal) progressStepsTotal else mProgress
        mProgress = if (mProgress < 0) 0 else mProgress

        mSweepAngle = if (mSweepAngle > 360) 360 else mSweepAngle
        mSweepAngle = if (mSweepAngle < 0) 0 else mSweepAngle

        mProgressSweep = mProgress.toFloat() / progressStepsTotal * mSweepAngle

        mStartAngle = if (mStartAngle > 360) 0 else mStartAngle
        mStartAngle = if (mStartAngle < 0) 0 else mStartAngle

        mArcPaint = Paint().apply {
            color = arcColor
            isAntiAlias = true
            style = Paint.Style.STROKE
            strokeWidth = mArcWidth.toFloat()
        }
        //mArcPaint.setAlpha(45)

        mProgressPaint = Paint().apply {
            isAntiAlias = true
            style = Paint.Style.STROKE
            strokeWidth = mProgressWidth.toFloat()
        }

        this.progressColors = progressColors

        if (mRoundedEdges) {
            mArcPaint.strokeCap = Paint.Cap.ROUND
            mProgressPaint.strokeCap = Paint.Cap.ROUND
        }
    }

    override fun onDraw(canvas: Canvas) {
        if (!isClockwise) {
            canvas.scale((-1).toFloat(), 1.toFloat(), mArcRect.centerX(), mArcRect.centerY())
        }

        // Draw the arcs
        val arcStart = (mStartAngle + mAngleOffset + mRotation).toFloat()
        val arcSweep = mSweepAngle.toFloat()

        canvas.drawArc(mArcRect, arcStart, arcSweep, false, mArcPaint)
        onPostArcDraw(canvas, arcStart, arcSweep)

        canvas.drawArc(mArcRect, arcStart, mProgressSweep, false, mProgressPaint)
        onPostProgressDraw(canvas, arcStart, arcSweep)

        if (isEnabled) {
            // Draw the thumb nail
//            canvas.translate(mTranslateX.toFloat() - mThumbXPos, mTranslateY.toFloat() - mThumbYPos)
//            mThumb?.draw(canvas)
        }
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {

        val height = getDefaultSize(suggestedMinimumHeight, heightMeasureSpec)
        val width = getDefaultSize(suggestedMinimumWidth, widthMeasureSpec)
        val min = Math.min(width, height)

        val arcDiameter = min - paddingLeft
        val top = (height / 2 - arcDiameter / 2).toFloat()
        val left = (width / 2 - arcDiameter / 2).toFloat()

        val arcStart = mProgressSweep.toInt() + mStartAngle + mRotation + 90

        mTranslateX = (width * 0.5f).toInt()
        mTranslateY = (height * 0.5f).toInt()

        mArcRadius = arcDiameter / 2

        val topIndent = 4f
        mArcRect.set(left, top + topIndent, left + arcDiameter, top + arcDiameter + topIndent)
        mThumbXPos = (mArcRadius * Math.cos(Math.toRadians(arcStart.toDouble()))).toInt()
        mThumbYPos = (mArcRadius * Math.sin(Math.toRadians(arcStart.toDouble()))).toInt()

        setTouchInSide(mTouchInside)
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        updateProgressShader(w, h)
    }

    protected fun updateProgressShader(w: Int = width, h: Int = height) {
        mProgressPaint.shader = SweepGradient(
                w.toFloat() / 2,
                h.toFloat() / 2,
                progressColors,
                null
        )
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        if (isEnabled) {
            this.parent.requestDisallowInterceptTouchEvent(true)

            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    onStartTrackingTouch()
                    updateOnTouch(event)
                }
                MotionEvent.ACTION_MOVE -> updateOnTouch(event)
                MotionEvent.ACTION_UP -> {
                    onStopTrackingTouch()
                    isPressed = false
                    this.parent.requestDisallowInterceptTouchEvent(false)
                }
                MotionEvent.ACTION_CANCEL -> {
                    onStopTrackingTouch()
                    isPressed = false
                    this.parent.requestDisallowInterceptTouchEvent(false)
                }
            }
            return true
        }
        return false
    }

    override fun drawableStateChanged() {
        super.drawableStateChanged()
        if (mThumb != null && mThumb?.isStateful == true) {
            val state = drawableState
            mThumb?.state = state
        }
        invalidate()
    }

    fun setProgressColorsArrayId(id: Int) {
        progressColors = resources.getIntArray(id)
    }

    protected open fun onPostArcDraw(canvas: Canvas, arcStart: Float, arcSweep: Float) {
    }

    protected open fun onPostProgressDraw(canvas: Canvas, arcStart: Float, arcSweep: Float) {
    }

    private fun onStartTrackingTouch() {
        mOnSeekArcChangeListener?.onStartTrackingTouch(this)
    }

    private fun onStopTrackingTouch() {
        mOnSeekArcChangeListener?.onStopTrackingTouch(this)
    }

    private fun updateOnTouch(event: MotionEvent) {
        val ignoreTouch = ignoreTouch(event.x, event.y)
        if (ignoreTouch) {
            return
        }
        isPressed = true
        mTouchAngle = getTouchDegrees(event.x, event.y)
        val progress = getProgressForAngle(mTouchAngle)
        onProgressRefresh(progress, true)
    }

    private fun ignoreTouch(xPos: Float, yPos: Float): Boolean {
        var ignore = false
        val x = xPos - mTranslateX
        val y = yPos - mTranslateY

        val touchRadius = Math.sqrt((x * x + y * y).toDouble()).toFloat()
        if (touchRadius < mTouchIgnoreRadius) {
            ignore = true
        }
        return ignore
    }

    private fun getTouchDegrees(xPos: Float, yPos: Float): Double {
        var x = xPos - mTranslateX
        val y = yPos - mTranslateY
        //invert the x-coord if we are rotating anti-clockwise
        x = if (isClockwise) x else -x
        // convert to arc Angle
        var angle = Math.toDegrees(Math.atan2(y.toDouble(), x.toDouble()) + Math.PI / 2 - Math.toRadians(mRotation.toDouble()))
        if (angle < 0) {
            angle += 360
        }
        angle -= mStartAngle.toDouble()
        return angle
    }

    private fun getProgressForAngle(angle: Double): Int {
        val touchProgress = Math.round(valuePerDegree() * angle).toInt()

        return when {
            touchProgress < 0 || touchProgress > progressStepsTotal -> INVALID_PROGRESS_VALUE
            else -> touchProgress
        }
    }

    private fun valuePerDegree() = progressStepsTotal.toFloat() / mSweepAngle

    private fun onProgressRefresh(progress: Int, fromUser: Boolean) {
        updateProgress(progress, fromUser)
    }

    private fun updateThumbPosition() {
        val thumbAngle = (mStartAngle.toFloat() + mProgressSweep + mRotation.toFloat() + 90f).toInt()
        mThumbXPos = (mArcRadius * Math.cos(Math.toRadians(thumbAngle.toDouble()))).toInt()
        mThumbYPos = (mArcRadius * Math.sin(Math.toRadians(thumbAngle.toDouble()))).toInt()
    }

    private fun updateProgress(newProgress: Int, fromUser: Boolean) {
        var progress = newProgress

        if (progress == INVALID_PROGRESS_VALUE) {
            return
        }

        progress = if (progress > progressStepsTotal) progressStepsTotal else progress
        progress = if (progress < 0) 0 else progress
        mProgress = progress

        mOnSeekArcChangeListener?.onProgressChanged(this, progress, fromUser)

        mProgressSweep = progress.toFloat() / progressStepsTotal * mSweepAngle

        updateThumbPosition()

        invalidate()
    }

    /**
     * Sets a listener to receive notifications of changes to the SeekArc's
     * progress level. Also provides notifications of when the user starts and
     * stops a touch gesture within the SeekArc.
     *
     * @param l
     * The seek bar notification listener
     *
     * @see SeekArc.OnSeekBarChangeListener
     */
    fun setOnSeekArcChangeListener(l: OnSeekArcChangeListener) {
        mOnSeekArcChangeListener = l
    }

    fun setRoundedEdges(isEnabled: Boolean) {
        mRoundedEdges = isEnabled
        when {
            mRoundedEdges -> Paint.Cap.ROUND
            else -> Paint.Cap.SQUARE
        }.let {
            mArcPaint.strokeCap = it
            mProgressPaint.strokeCap = it
        }
    }

    fun setTouchInSide(isEnabled: Boolean) {
        mTouchInside = isEnabled
        mTouchIgnoreRadius = if (mTouchInside) {
            mArcRadius.toFloat() / 4
        } else {
            // Don't use the exact radius makes interaction too tricky
            (mArcRadius - Math.min(getIntrinsicWidth(), getIntrinsicHeight())).toFloat()
        }
    }

    fun setArcColorId(id: Int) {
        arcColor = context.getColorBy(id)
    }

    private fun getIntrinsicHeight() = mThumb?.intrinsicHeight ?: 0 / 2

    private fun getIntrinsicWidth() = mThumb?.intrinsicWidth ?: 0 / 2

    private fun defaultProgressColors(context: Context): IntArray {
        return listOf(R.color.colorPrimary, R.color.colorPrimaryDark, R.color.colorPrimary)
                .map(context::getColorBy)
                .toIntArray()
    }

    interface OnSeekArcChangeListener {

        /**
         * Notification that the progress level has changed. Clients can use the
         * fromUser parameter to distinguish user-initiated changes from those
         * that occurred programmatically.
         *
         * @param seekArc
         * The SeekArc whose progress has changed
         * @param progress
         * The current progress level. This will be in the range
         * 0..progressStepsTotal where progressStepsTotal was set by
         * [ProgressArc.setMax]. (The default value for
         * progressStepsTotal is 100.)
         * @param fromUser
         * True if the progress change was initiated by the user.
         */
        fun onProgressChanged(seekArc: SeekArc, progress: Int, fromUser: Boolean)

        /**
         * Notification that the user has started a touch gesture. Clients may
         * want to use this to disable advancing the seekbar.
         *
         * @param seekArc
         * The SeekArc in which the touch gesture began
         */
        fun onStartTrackingTouch(seekArc: SeekArc)

        /**
         * Notification that the user has finished a touch gesture. Clients may
         * want to use this to re-enable advancing the seekarc.
         *
         * @param seekArc
         * The SeekArc in which the touch gesture began
         */
        fun onStopTrackingTouch(seekArc: SeekArc)
    }

    companion object {

        private val TAG = SeekArc::class.java.simpleName
        private const val INVALID_PROGRESS_VALUE = -1
    }
}
