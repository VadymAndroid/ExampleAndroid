package ua.mycredit.mycredit.ui.bases.input;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\rJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rJ\b\u0010\u0016\u001a\u00020\u0011H\u0016R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0017"}, d2 = {"Lua/mycredit/mycredit/ui/bases/input/TextDialogViewModel;", "Lua/mycredit/mycredit/ui/bases/input/DialogViewModel;", "()V", "dialogField", "Lua/mycredit/mycredit/ui/bases/input/FieldViewModel;", "getDialogField", "()Lua/mycredit/mycredit/ui/bases/input/FieldViewModel;", "hintRes", "", "getHintRes", "()I", "validatedInput", "Landroid/databinding/ObservableField;", "", "getValidatedInput", "()Landroid/databinding/ObservableField;", "attemptToApplyDialogField", "", "getInput", "init", "", "text", "onValidate", "presentation_fullRelease"})
public abstract class TextDialogViewModel extends ua.mycredit.mycredit.ui.bases.input.DialogViewModel {
    private final int hintRes = 2131755333;
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableField<java.lang.String> validatedInput = null;
    
    @java.lang.Override()
    public int getHintRes() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableField<java.lang.String> getValidatedInput() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract ua.mycredit.mycredit.ui.bases.input.FieldViewModel getDialogField();
    
    @java.lang.Override()
    public boolean onValidate() {
        return false;
    }
    
    public final void init(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public final boolean attemptToApplyDialogField() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getInput() {
        return null;
    }
    
    public TextDialogViewModel() {
        super();
    }
}