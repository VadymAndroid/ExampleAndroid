package ua.mycredit.mycredit.ui.bases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H$J\u0006\u0010\u0014\u001a\u00020\u000eR\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lua/mycredit/mycredit/ui/bases/SimpleInputTextDialogFragment;", "Lua/mycredit/mycredit/ui/bases/SelfBindingDialogFragment2;", "()V", "field", "Lua/mycredit/mycredit/ui/bases/input/FieldViewModel;", "getField", "()Lua/mycredit/mycredit/ui/bases/input/FieldViewModel;", "layoutId", "", "getLayoutId", "()I", "titleId", "getTitleId", "onDialogCreated", "", "dialog", "Landroid/app/Dialog;", "onInputCompleted", "value", "", "tryToComplete", "presentation_fullRelease"})
public abstract class SimpleInputTextDialogFragment extends ua.mycredit.mycredit.ui.bases.SelfBindingDialogFragment2 {
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected int getLayoutId() {
        return 0;
    }
    
    public abstract int getTitleId();
    
    @org.jetbrains.annotations.NotNull()
    public abstract ua.mycredit.mycredit.ui.bases.input.FieldViewModel getField();
    
    protected abstract void onInputCompleted(@org.jetbrains.annotations.NotNull()
    java.lang.String value);
    
    @java.lang.Override()
    protected void onDialogCreated(@org.jetbrains.annotations.NotNull()
    android.app.Dialog dialog) {
    }
    
    public final void tryToComplete() {
    }
    
    public SimpleInputTextDialogFragment() {
        super();
    }
}