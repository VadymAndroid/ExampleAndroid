package ua.mycredit.mycredit.ui.bases.input;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0013"}, d2 = {"Lua/mycredit/mycredit/ui/bases/input/BaseInputDialogFragment;", "Lua/mycredit/mycredit/ui/bases/BaseBindingDialogFragment;", "()V", "fieldReference", "Lua/mycredit/mycredit/ui/bases/input/FormViewModel$FieldReference;", "kotlin.jvm.PlatformType", "getFieldReference", "()Lua/mycredit/mycredit/ui/bases/input/FormViewModel$FieldReference;", "fieldViewModel", "Lua/mycredit/mycredit/ui/bases/input/DialogViewModel;", "getFieldViewModel", "()Lua/mycredit/mycredit/ui/bases/input/DialogViewModel;", "viewModelFactory", "Landroid/arch/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroid/arch/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroid/arch/lifecycle/ViewModelProvider$Factory;)V", "Companion", "presentation_fullDebug"})
public abstract class BaseInputDialogFragment extends ua.mycredit.mycredit.ui.bases.BaseBindingDialogFragment {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public android.arch.lifecycle.ViewModelProvider.Factory viewModelFactory;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARG_FIELD_REFERENCE = "ARG_FIELD_REFERENCE";
    public static final ua.mycredit.mycredit.ui.bases.input.BaseInputDialogFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.mycredit.mycredit.ui.bases.input.DialogViewModel getFieldViewModel() {
        return null;
    }
    
    private final ua.mycredit.mycredit.ui.bases.input.FormViewModel.FieldReference getFieldReference() {
        return null;
    }
    
    public BaseInputDialogFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lua/mycredit/mycredit/ui/bases/input/BaseInputDialogFragment$Companion;", "", "()V", "ARG_FIELD_REFERENCE", "", "presentation_fullDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}