package ua.mycredit.mycredit.ui.custom.progress;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001a\u0010\u0015\u001a\u00020\u00162\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u0016H\u0002R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000eR$\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00078F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001b"}, d2 = {"Lua/mycredit/mycredit/ui/custom/progress/PercentageProgress;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mMax", "mProgress", "mProgressValues", "", "", "[Ljava/lang/CharSequence;", "value", "progress", "getProgress", "()I", "setProgress", "(I)V", "initAttrs", "", "initPadding", "initViews", "refresh", "Companion", "presentation_fullDebug"})
public final class PercentageProgress extends android.widget.LinearLayout {
    private int mMax;
    private int mProgress;
    private java.lang.CharSequence[] mProgressValues;
    public static final int DEF_MAX = 10;
    public static final ua.mycredit.mycredit.ui.custom.progress.PercentageProgress.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final void initAttrs(android.util.AttributeSet attrs, int defStyleAttr) {
    }
    
    private final void initPadding() {
    }
    
    private final void initViews() {
    }
    
    private final void refresh() {
    }
    
    public final int getProgress() {
        return 0;
    }
    
    public final void setProgress(int value) {
    }
    
    public PercentageProgress(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public PercentageProgress(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public PercentageProgress(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lua/mycredit/mycredit/ui/custom/progress/PercentageProgress$Companion;", "", "()V", "DEF_MAX", "", "presentation_fullDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}