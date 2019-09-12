package ua.mycredit.mycredit.ui.bases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0004J$\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0015J\b\u0010\u001d\u001a\u00020\u0014H\u0016R\u001c\u0010\u0005\u001a\u00028\u0000X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0012\u0010\u000b\u001a\u00020\fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0001\u0002\u001e\u001f\u00a8\u0006 "}, d2 = {"Lua/mycredit/mycredit/ui/bases/BaseBindingFragment;", "VDB", "Landroid/databinding/ViewDataBinding;", "Lua/mycredit/mycredit/ui/bases/BaseFragment;", "()V", "binding", "getBinding", "()Landroid/databinding/ViewDataBinding;", "setBinding", "(Landroid/databinding/ViewDataBinding;)V", "Landroid/databinding/ViewDataBinding;", "viewModel", "", "getViewModel", "()Ljava/lang/Object;", "withUi", "", "getWithUi", "()Z", "invalidateUi", "", "onCreateContentView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "Lua/mycredit/mycredit/ui/bases/ViewModelFragment;", "Lua/mycredit/mycredit/ui/bases/SelfBindingFragment;", "presentation_fullDebug"})
public abstract class BaseBindingFragment<VDB extends android.databinding.ViewDataBinding> extends ua.mycredit.mycredit.ui.bases.BaseFragment {
    @org.jetbrains.annotations.NotNull()
    protected VDB binding;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.Object getViewModel();
    
    @org.jetbrains.annotations.NotNull()
    protected final VDB getBinding() {
        return null;
    }
    
    protected final void setBinding(@org.jetbrains.annotations.NotNull()
    VDB p0) {
    }
    
    protected final boolean getWithUi() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.support.annotation.CallSuper()
    @java.lang.Override()
    protected android.view.View onCreateContentView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    protected final void invalidateUi() {
    }
    
    private BaseBindingFragment() {
        super();
    }
}