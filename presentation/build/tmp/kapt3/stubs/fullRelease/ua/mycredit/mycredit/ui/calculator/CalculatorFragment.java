package ua.mycredit.mycredit.ui.calculator;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0017\u0018\u0019B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u001a\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\fX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lua/mycredit/mycredit/ui/calculator/CalculatorFragment;", "Lua/mycredit/mycredit/ui/bases/ViewModelFragment;", "Lua/mycredit/mycredit/ui/calculator/CalculatorViewModel;", "Lua/mycredit/mycredit/databinding/FragmentCalculatorBinding;", "()V", "calculatorAnimations", "Landroid/animation/AnimatorSet;", "layoutId", "", "getLayoutId", "()I", "viewModelClass", "Ljava/lang/Class;", "getViewModelClass", "()Ljava/lang/Class;", "onPause", "", "onResume", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "DaysEvaluatorListener", "MoneyEvaluatorListener", "presentation_fullRelease"})
public final class CalculatorFragment extends ua.mycredit.mycredit.ui.bases.ViewModelFragment<ua.mycredit.mycredit.ui.calculator.CalculatorViewModel, ua.mycredit.mycredit.databinding.FragmentCalculatorBinding> {
    private final int layoutId = 2131492944;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Class<ua.mycredit.mycredit.ui.calculator.CalculatorViewModel> viewModelClass = null;
    private android.animation.AnimatorSet calculatorAnimations;
    public static final long DURATION_ANIMATION = 750L;
    public static final ua.mycredit.mycredit.ui.calculator.CalculatorFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Class<ua.mycredit.mycredit.ui.calculator.CalculatorViewModel> getViewModelClass() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    public CalculatorFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lua/mycredit/mycredit/ui/calculator/CalculatorFragment$MoneyEvaluatorListener;", "Lua/mycredit/mycredit/ui/custom/EvaluatorListener;", "(Lua/mycredit/mycredit/ui/calculator/CalculatorFragment;)V", "onEvaluate", "", "evaluate", "", "presentation_fullRelease"})
    public final class MoneyEvaluatorListener implements ua.mycredit.mycredit.ui.custom.EvaluatorListener {
        
        @java.lang.Override()
        public void onEvaluate(int evaluate) {
        }
        
        public MoneyEvaluatorListener() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lua/mycredit/mycredit/ui/calculator/CalculatorFragment$DaysEvaluatorListener;", "Lua/mycredit/mycredit/ui/custom/EvaluatorListener;", "(Lua/mycredit/mycredit/ui/calculator/CalculatorFragment;)V", "onEvaluate", "", "evaluate", "", "presentation_fullRelease"})
    public final class DaysEvaluatorListener implements ua.mycredit.mycredit.ui.custom.EvaluatorListener {
        
        @java.lang.Override()
        public void onEvaluate(int evaluate) {
        }
        
        public DaysEvaluatorListener() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lua/mycredit/mycredit/ui/calculator/CalculatorFragment$Companion;", "", "()V", "DURATION_ANIMATION", "", "presentation_fullRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}