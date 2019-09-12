package ua.mycredit.mycredit.ui.bases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b&\u0018\u0000 $*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\b\u0012\u0004\u0012\u0002H\u00030\u0005:\u0001$B\u0005\u00a2\u0006\u0002\u0010\u0006J\r\u0010\u0014\u001a\u00028\u0000H\u0002\u00a2\u0006\u0002\u0010\rJ\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J$\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0016\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#R\u0014\u0010\u0007\u001a\u00020\b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00028\u00008FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006%"}, d2 = {"Lua/mycredit/mycredit/ui/bases/ViewModelFragment;", "VM", "Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "VDB", "Landroid/databinding/ViewDataBinding;", "Lua/mycredit/mycredit/ui/bases/BaseBindingFragment;", "()V", "useActivityScope", "", "getUseActivityScope", "()Z", "viewModel", "getViewModel", "()Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "viewModelClass", "Ljava/lang/Class;", "getViewModelClass", "()Ljava/lang/Class;", "makeViewModel", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "setupPermissions", "string", "", "const", "", "Companion", "presentation_fullRelease"})
public abstract class ViewModelFragment<VM extends ua.mycredit.mycredit.ui.bases.BaseViewModel, VDB extends android.databinding.ViewDataBinding> extends ua.mycredit.mycredit.ui.bases.BaseBindingFragment<VDB> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARG_USE_ACTIVITY_SCOPE = "ARG_USE_ACTIVITY_SCOPE";
    public static final ua.mycredit.mycredit.ui.bases.ViewModelFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.Class<VM> getViewModelClass();
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public final VM getViewModel() {
        return null;
    }
    
    private final boolean getUseActivityScope() {
        return false;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final VM makeViewModel() {
        return null;
    }
    
    public final void setupPermissions(@org.jetbrains.annotations.NotNull()
    java.lang.String string, int p1_47422385) {
    }
    
    public ViewModelFragment() {
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lua/mycredit/mycredit/ui/bases/ViewModelFragment$Companion;", "", "()V", "ARG_USE_ACTIVITY_SCOPE", "", "presentation_fullRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}