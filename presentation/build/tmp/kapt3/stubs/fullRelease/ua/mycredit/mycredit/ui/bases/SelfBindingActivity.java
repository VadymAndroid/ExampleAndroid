package ua.mycredit.mycredit.ui.bases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014R\u001b\u0010\u0005\u001a\u00028\u00008DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000b8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0018"}, d2 = {"Lua/mycredit/mycredit/ui/bases/SelfBindingActivity;", "VDB", "Landroid/databinding/ViewDataBinding;", "Lua/mycredit/mycredit/ui/bases/BaseActivity;", "()V", "binding", "getBinding", "()Landroid/databinding/ViewDataBinding;", "binding$delegate", "Lkotlin/Lazy;", "executesPendingBinding", "", "getExecutesPendingBinding", "()Z", "viewModelFactory", "Landroid/arch/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroid/arch/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroid/arch/lifecycle/ViewModelProvider$Factory;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "presentation_fullRelease"})
public abstract class SelfBindingActivity<VDB extends android.databinding.ViewDataBinding> extends ua.mycredit.mycredit.ui.bases.BaseActivity {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public android.arch.lifecycle.ViewModelProvider.Factory viewModelFactory;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy binding$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final VDB getBinding() {
        return null;
    }
    
    protected boolean getExecutesPendingBinding() {
        return false;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public SelfBindingActivity() {
        super();
    }
}