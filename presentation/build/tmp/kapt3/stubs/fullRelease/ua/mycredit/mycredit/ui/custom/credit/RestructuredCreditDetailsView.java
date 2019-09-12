package ua.mycredit.mycredit.ui.custom.credit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0005()*+,B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ(\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\"H\u0014J\u0018\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u0007H\u0014J\u0012\u0010&\u001a\u00020\u001d2\b\u0010\'\u001a\u0004\u0018\u00010\u0014H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R/\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u00148F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006-"}, d2 = {"Lua/mycredit/mycredit/ui/custom/credit/RestructuredCreditDetailsView;", "Lua/mycredit/mycredit/ui/custom/StepsRadialDiagram;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "amountOffset", "", "behavior", "Lua/mycredit/mycredit/ui/custom/credit/RestructuredCreditDetailsView$Behavior;", "checkedIconPaint", "Landroid/graphics/Paint;", "dateOffsetOffset", "datesRect", "Landroid/graphics/RectF;", "repaymentsRect", "<set-?>", "Lua/mycredit/core/Restructured;", "restructured", "getRestructured", "()Lua/mycredit/core/Restructured;", "setRestructured", "(Lua/mycredit/core/Restructured;)V", "restructured$delegate", "Lkotlin/properties/ReadWriteProperty;", "onDrawStep", "", "step", "angle", "delta", "canvas", "Landroid/graphics/Canvas;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "processCreditParamsChange", "value", "Behavior", "Narrow", "Tools", "ToolsImpl", "Wide", "presentation_fullRelease"})
public final class RestructuredCreditDetailsView extends ua.mycredit.mycredit.ui.custom.StepsRadialDiagram {
    @org.jetbrains.annotations.Nullable()
    private final kotlin.properties.ReadWriteProperty restructured$delegate = null;
    private final android.graphics.RectF repaymentsRect = null;
    private final android.graphics.RectF datesRect = null;
    private ua.mycredit.mycredit.ui.custom.credit.RestructuredCreditDetailsView.Behavior behavior;
    private final android.graphics.Paint checkedIconPaint = null;
    private final float amountOffset = 0.0F;
    private final float dateOffsetOffset = 0.0F;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final ua.mycredit.core.Restructured getRestructured() {
        return null;
    }
    
    public final void setRestructured(@org.jetbrains.annotations.Nullable()
    ua.mycredit.core.Restructured p0) {
    }
    
    @java.lang.Override()
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    @java.lang.Override()
    protected void onDrawStep(int step, float angle, float delta, @org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    private final void processCreditParamsChange(ua.mycredit.core.Restructured value) {
    }
    
    public RestructuredCreditDetailsView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0);
    }
    
    public RestructuredCreditDetailsView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    public RestructuredCreditDetailsView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null, null, 0);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010 \u001a\u00020!*\u00020\u00002\b\b\u0001\u0010\"\u001a\u00020\u000fH\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0012\u0010\u0019\u001a\u00020\u001aX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0012\u0010\u001d\u001a\u00020\u0016X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u00a8\u0006#"}, d2 = {"Lua/mycredit/mycredit/ui/custom/credit/RestructuredCreditDetailsView$Tools;", "", "checkedIconPaint", "Landroid/graphics/Paint;", "getCheckedIconPaint", "()Landroid/graphics/Paint;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "datesRect", "Landroid/graphics/RectF;", "getDatesRect", "()Landroid/graphics/RectF;", "greenColor", "", "getGreenColor", "()I", "repaymentsRect", "getRepaymentsRect", "repaymentsStr", "", "", "getRepaymentsStr", "()Ljava/util/List;", "restructured", "Lua/mycredit/core/Restructured;", "getRestructured", "()Lua/mycredit/core/Restructured;", "uah", "getUah", "()Ljava/lang/String;", "getDimension", "", "id", "presentation_fullRelease"})
    public static abstract interface Tools {
        
        @org.jetbrains.annotations.NotNull()
        public abstract android.content.Context getContext();
        
        @org.jetbrains.annotations.NotNull()
        public abstract ua.mycredit.core.Restructured getRestructured();
        
        @org.jetbrains.annotations.NotNull()
        public abstract android.graphics.RectF getRepaymentsRect();
        
        @org.jetbrains.annotations.NotNull()
        public abstract android.graphics.RectF getDatesRect();
        
        @org.jetbrains.annotations.NotNull()
        public abstract android.graphics.Paint getCheckedIconPaint();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.lang.String getUah();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.util.List<java.lang.String> getRepaymentsStr();
        
        public abstract int getGreenColor();
        
        public abstract float getDimension(@org.jetbrains.annotations.NotNull()
        ua.mycredit.mycredit.ui.custom.credit.RestructuredCreditDetailsView.Tools $receiver, @android.support.annotation.DimenRes()
        int id);
        
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 3)
        public static final class DefaultImpls {
            
            public static float getDimension(ua.mycredit.mycredit.ui.custom.credit.RestructuredCreditDetailsView.Tools $this, @org.jetbrains.annotations.NotNull()
            ua.mycredit.mycredit.ui.custom.credit.RestructuredCreditDetailsView.Tools $receiver, @android.support.annotation.DimenRes()
            int id) {
                return 0.0F;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\b\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u0019X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 \u00a8\u0006!"}, d2 = {"Lua/mycredit/mycredit/ui/custom/credit/RestructuredCreditDetailsView$ToolsImpl;", "Lua/mycredit/mycredit/ui/custom/credit/RestructuredCreditDetailsView$Tools;", "context", "Landroid/content/Context;", "restructured", "Lua/mycredit/core/Restructured;", "repaymentsRect", "Landroid/graphics/RectF;", "datesRect", "checkedIconPaint", "Landroid/graphics/Paint;", "(Landroid/content/Context;Lua/mycredit/core/Restructured;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Paint;)V", "getCheckedIconPaint", "()Landroid/graphics/Paint;", "getContext", "()Landroid/content/Context;", "getDatesRect", "()Landroid/graphics/RectF;", "greenColor", "", "getGreenColor", "()I", "getRepaymentsRect", "repaymentsStr", "", "", "getRepaymentsStr", "()Ljava/util/List;", "getRestructured", "()Lua/mycredit/core/Restructured;", "uah", "getUah", "()Ljava/lang/String;", "presentation_fullRelease"})
    public static final class ToolsImpl implements ua.mycredit.mycredit.ui.custom.credit.RestructuredCreditDetailsView.Tools {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String uah = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.String> repaymentsStr = null;
        private final int greenColor = 0;
        @org.jetbrains.annotations.NotNull()
        private final android.content.Context context = null;
        @org.jetbrains.annotations.NotNull()
        private final ua.mycredit.core.Restructured restructured = null;
        @org.jetbrains.annotations.NotNull()
        private final android.graphics.RectF repaymentsRect = null;
        @org.jetbrains.annotations.NotNull()
        private final android.graphics.RectF datesRect = null;
        @org.jetbrains.annotations.NotNull()
        private final android.graphics.Paint checkedIconPaint = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getUah() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.List<java.lang.String> getRepaymentsStr() {
            return null;
        }
        
        @java.lang.Override()
        public int getGreenColor() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.content.Context getContext() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public ua.mycredit.core.Restructured getRestructured() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.graphics.RectF getRepaymentsRect() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.graphics.RectF getDatesRect() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.graphics.Paint getCheckedIconPaint() {
            return null;
        }
        
        public ToolsImpl(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        ua.mycredit.core.Restructured restructured, @org.jetbrains.annotations.NotNull()
        android.graphics.RectF repaymentsRect, @org.jetbrains.annotations.NotNull()
        android.graphics.RectF datesRect, @org.jetbrains.annotations.NotNull()
        android.graphics.Paint checkedIconPaint) {
            super();
        }
        
        public float getDimension(@org.jetbrains.annotations.NotNull()
        ua.mycredit.mycredit.ui.custom.credit.RestructuredCreditDetailsView.Tools $receiver, @android.support.annotation.DimenRes()
        int id) {
            return 0.0F;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\"\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0002\u0010\u0003J \u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u00052\u0006\u00108\u001a\u00020\u00052\u0006\u00109\u001a\u00020:H\u0002J(\u0010;\u001a\u0002062\u0006\u0010<\u001a\u00020\u00192\u0006\u0010=\u001a\u00020\u00052\u0006\u0010>\u001a\u00020\u00052\u0006\u00109\u001a\u00020:H$J(\u0010?\u001a\u0002062\u0006\u0010<\u001a\u00020\u00192\u0006\u0010=\u001a\u00020\u00052\u0006\u0010>\u001a\u00020\u00052\u0006\u00109\u001a\u00020:H\u0002J&\u0010@\u001a\u0002062\u0006\u0010<\u001a\u00020\u00192\u0006\u0010=\u001a\u00020\u00052\u0006\u0010>\u001a\u00020\u00052\u0006\u00109\u001a\u00020:J\u0017\u0010A\u001a\u00020\u0005*\u00020\u00012\b\b\u0001\u0010B\u001a\u00020\u0019H\u0096\u0001R\u0014\u0010\u0004\u001a\u00020\u00058TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00058TX\u0094\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0011\u0010\u0007R\u0012\u0010\u0014\u001a\u00020\u0015X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0018\u001a\u00020\u0019X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001c\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001d\u0010\u0007R\u0014\u0010\u001f\u001a\u00020 X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00058DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b$\u0010\u0007R\u0012\u0010%\u001a\u00020\u0015X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b&\u0010\u0017R\u0018\u0010\'\u001a\b\u0012\u0004\u0012\u00020)0(X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b*\u0010+R\u0012\u0010,\u001a\u00020-X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\tX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u000bR\u0012\u00102\u001a\u00020)X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b3\u00104\u00a8\u0006C"}, d2 = {"Lua/mycredit/mycredit/ui/custom/credit/RestructuredCreditDetailsView$Behavior;", "Lua/mycredit/mycredit/ui/custom/credit/RestructuredCreditDetailsView$Tools;", "tools", "(Lua/mycredit/mycredit/ui/custom/credit/RestructuredCreditDetailsView$Tools;)V", "checkedIconOffset", "", "getCheckedIconOffset", "()F", "checkedIconPaint", "Landroid/graphics/Paint;", "getCheckedIconPaint", "()Landroid/graphics/Paint;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "dateTextSize", "getDateTextSize", "dateTextSize$delegate", "Lkotlin/Lazy;", "datesRect", "Landroid/graphics/RectF;", "getDatesRect", "()Landroid/graphics/RectF;", "greenColor", "", "getGreenColor", "()I", "okStrokeWidth", "getOkStrokeWidth", "okStrokeWidth$delegate", "path", "Landroid/graphics/Path;", "getPath", "()Landroid/graphics/Path;", "repaymentsRadius", "getRepaymentsRadius", "repaymentsRect", "getRepaymentsRect", "repaymentsStr", "", "", "getRepaymentsStr", "()Ljava/util/List;", "restructured", "Lua/mycredit/core/Restructured;", "getRestructured", "()Lua/mycredit/core/Restructured;", "textPaint", "getTextPaint", "uah", "getUah", "()Ljava/lang/String;", "drawCheckedIcon", "", "startAngle", "sweepAngle", "canvas", "Landroid/graphics/Canvas;", "drawRepaymentAmount", "step", "angle", "delta", "drawRepaymentDate", "drawRepaymentDetails", "getDimension", "id", "presentation_fullRelease"})
    static abstract class Behavior implements ua.mycredit.mycredit.ui.custom.credit.RestructuredCreditDetailsView.Tools {
        @org.jetbrains.annotations.NotNull()
        private final android.graphics.Path path = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy dateTextSize$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final android.graphics.Paint textPaint = null;
        private final kotlin.Lazy okStrokeWidth$delegate = null;
        
        protected final float getRepaymentsRadius() {
            return 0.0F;
        }
        
        @org.jetbrains.annotations.NotNull()
        protected final android.graphics.Path getPath() {
            return null;
        }
        
        protected float getDateTextSize() {
            return 0.0F;
        }
        
        protected float getCheckedIconOffset() {
            return 0.0F;
        }
        
        @org.jetbrains.annotations.NotNull()
        protected final android.graphics.Paint getTextPaint() {
            return null;
        }
        
        private final float getOkStrokeWidth() {
            return 0.0F;
        }
        
        public final void drawRepaymentDetails(int step, float angle, float delta, @org.jetbrains.annotations.NotNull()
        android.graphics.Canvas canvas) {
        }
        
        private final void drawCheckedIcon(float startAngle, float sweepAngle, android.graphics.Canvas canvas) {
        }
        
        protected abstract void drawRepaymentAmount(int step, float angle, float delta, @org.jetbrains.annotations.NotNull()
        android.graphics.Canvas canvas);
        
        private final void drawRepaymentDate(int step, float angle, float delta, android.graphics.Canvas canvas) {
        }
        
        public Behavior(@org.jetbrains.annotations.NotNull()
        ua.mycredit.mycredit.ui.custom.credit.RestructuredCreditDetailsView.Tools tools) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.graphics.Paint getCheckedIconPaint() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.content.Context getContext() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.graphics.RectF getDatesRect() {
            return null;
        }
        
        @java.lang.Override()
        public int getGreenColor() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.graphics.RectF getRepaymentsRect() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.List<java.lang.String> getRepaymentsStr() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public ua.mycredit.core.Restructured getRestructured() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getUah() {
            return null;
        }
        
        @java.lang.Override()
        public float getDimension(@org.jetbrains.annotations.NotNull()
        ua.mycredit.mycredit.ui.custom.credit.RestructuredCreditDetailsView.Tools $receiver, @android.support.annotation.DimenRes()
        int id) {
            return 0.0F;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J(\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lua/mycredit/mycredit/ui/custom/credit/RestructuredCreditDetailsView$Wide;", "Lua/mycredit/mycredit/ui/custom/credit/RestructuredCreditDetailsView$Behavior;", "tools", "Lua/mycredit/mycredit/ui/custom/credit/RestructuredCreditDetailsView$Tools;", "(Lua/mycredit/mycredit/ui/custom/credit/RestructuredCreditDetailsView$Tools;)V", "amountTextSize", "", "uahTextSize", "drawRepaymentAmount", "", "step", "", "angle", "delta", "canvas", "Landroid/graphics/Canvas;", "presentation_fullRelease"})
    static final class Wide extends ua.mycredit.mycredit.ui.custom.credit.RestructuredCreditDetailsView.Behavior {
        private final float amountTextSize = 0.0F;
        private final float uahTextSize = 0.0F;
        
        @java.lang.Override()
        protected void drawRepaymentAmount(int step, float angle, float delta, @org.jetbrains.annotations.NotNull()
        android.graphics.Canvas canvas) {
        }
        
        public Wide(@org.jetbrains.annotations.NotNull()
        ua.mycredit.mycredit.ui.custom.credit.RestructuredCreditDetailsView.Tools tools) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J(\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0014R\u0014\u0010\u0005\u001a\u00020\u00068TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lua/mycredit/mycredit/ui/custom/credit/RestructuredCreditDetailsView$Narrow;", "Lua/mycredit/mycredit/ui/custom/credit/RestructuredCreditDetailsView$Behavior;", "tools", "Lua/mycredit/mycredit/ui/custom/credit/RestructuredCreditDetailsView$Tools;", "(Lua/mycredit/mycredit/ui/custom/credit/RestructuredCreditDetailsView$Tools;)V", "dateTextSize", "", "getDateTextSize", "()F", "repaymentsOutputs", "", "", "drawRepaymentAmount", "", "step", "", "angle", "delta", "canvas", "Landroid/graphics/Canvas;", "presentation_fullRelease"})
    static final class Narrow extends ua.mycredit.mycredit.ui.custom.credit.RestructuredCreditDetailsView.Behavior {
        private final java.util.List<java.lang.String> repaymentsOutputs = null;
        
        @java.lang.Override()
        protected float getDateTextSize() {
            return 0.0F;
        }
        
        @java.lang.Override()
        protected void drawRepaymentAmount(int step, float angle, float delta, @org.jetbrains.annotations.NotNull()
        android.graphics.Canvas canvas) {
        }
        
        public Narrow(@org.jetbrains.annotations.NotNull()
        ua.mycredit.mycredit.ui.custom.credit.RestructuredCreditDetailsView.Tools tools) {
            super(null);
        }
    }
}