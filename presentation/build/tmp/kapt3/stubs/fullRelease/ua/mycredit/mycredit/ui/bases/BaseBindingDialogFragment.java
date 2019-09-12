package ua.mycredit.mycredit.ui.bases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eH\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\nX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0014"}, d2 = {"Lua/mycredit/mycredit/ui/bases/BaseBindingDialogFragment;", "Lua/mycredit/mycredit/ui/bases/BaseDialogFragment;", "()V", "binding", "Landroid/databinding/ViewDataBinding;", "getBinding", "()Landroid/databinding/ViewDataBinding;", "setBinding", "(Landroid/databinding/ViewDataBinding;)V", "layoutId", "", "getLayoutId", "()I", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onDialogCreated", "", "dialog", "presentation_fullRelease"})
public abstract class BaseBindingDialogFragment extends ua.mycredit.mycredit.ui.bases.BaseDialogFragment {
    @org.jetbrains.annotations.NotNull()
    protected android.databinding.ViewDataBinding binding;
    private java.util.HashMap _$_findViewCache;
    
    public abstract int getLayoutId();
    
    @org.jetbrains.annotations.NotNull()
    protected final android.databinding.ViewDataBinding getBinding() {
        return null;
    }
    
    protected final void setBinding(@org.jetbrains.annotations.NotNull()
    android.databinding.ViewDataBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    protected void onDialogCreated(@org.jetbrains.annotations.NotNull()
    android.app.Dialog dialog) {
    }
    
    public BaseBindingDialogFragment() {
        super();
    }
}