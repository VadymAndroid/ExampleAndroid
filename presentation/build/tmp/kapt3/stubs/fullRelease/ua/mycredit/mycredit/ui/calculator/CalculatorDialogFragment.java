package ua.mycredit.mycredit.ui.calculator;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u001b\u001a\u00020\u0016H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001e"}, d2 = {"Lua/mycredit/mycredit/ui/calculator/CalculatorDialogFragment;", "Landroid/support/design/widget/BottomSheetDialogFragment;", "()V", "binding", "Lua/mycredit/mycredit/databinding/FragmentCalculatorBinding;", "calculatorViewModel", "Lua/mycredit/mycredit/ui/calculator/CalculatorViewModel;", "getCalculatorViewModel", "()Lua/mycredit/mycredit/ui/calculator/CalculatorViewModel;", "calculatorViewModel$delegate", "Lkotlin/Lazy;", "changeConditionsMode", "", "getChangeConditionsMode", "()Z", "viewModelFactory", "Landroid/arch/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroid/arch/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroid/arch/lifecycle/ViewModelProvider$Factory;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "onDestroy", "BottomSheetCallbackImpl", "Companion", "presentation_fullRelease"})
public final class CalculatorDialogFragment extends android.support.design.widget.BottomSheetDialogFragment {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public android.arch.lifecycle.ViewModelProvider.Factory viewModelFactory;
    private final kotlin.Lazy calculatorViewModel$delegate = null;
    private ua.mycredit.mycredit.databinding.FragmentCalculatorBinding binding;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARG_CHANGE_CONDITIONS_MODE = "ARG_CHANGE_CONDITIONS_MODE";
    public static final ua.mycredit.mycredit.ui.calculator.CalculatorDialogFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    private final ua.mycredit.mycredit.ui.calculator.CalculatorViewModel getCalculatorViewModel() {
        return null;
    }
    
    private final boolean getChangeConditionsMode() {
        return false;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    public CalculatorDialogFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016\u00a8\u0006\f"}, d2 = {"Lua/mycredit/mycredit/ui/calculator/CalculatorDialogFragment$BottomSheetCallbackImpl;", "Landroid/support/design/widget/BottomSheetBehavior$BottomSheetCallback;", "(Lua/mycredit/mycredit/ui/calculator/CalculatorDialogFragment;)V", "onSlide", "", "bottomSheet", "Landroid/view/View;", "slideOffset", "", "onStateChanged", "newState", "", "presentation_fullRelease"})
    final class BottomSheetCallbackImpl extends android.support.design.widget.BottomSheetBehavior.BottomSheetCallback {
        
        @java.lang.Override()
        public void onStateChanged(@org.jetbrains.annotations.NotNull()
        android.view.View bottomSheet, int newState) {
        }
        
        @java.lang.Override()
        public void onSlide(@org.jetbrains.annotations.NotNull()
        android.view.View bottomSheet, float slideOffset) {
        }
        
        public BottomSheetCallbackImpl() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lua/mycredit/mycredit/ui/calculator/CalculatorDialogFragment$Companion;", "", "()V", "ARG_CHANGE_CONDITIONS_MODE", "", "presentation_fullRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}