package ua.mycredit.mycredit.ui.bases.input;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0015H&J\u0006\u0010\u0016\u001a\u00020\u0013R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\rX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f\u00a8\u0006\u0017"}, d2 = {"Lua/mycredit/mycredit/ui/bases/input/DialogViewModel;", "Lua/mycredit/mycredit/ui/bases/input/Validable;", "()V", "error", "Landroid/databinding/ObservableBoolean;", "getError", "()Landroid/databinding/ObservableBoolean;", "fadeOut", "Landroid/databinding/ObservableField;", "Lua/mycredit/mycredit/ui/FadeOut;", "getFadeOut", "()Landroid/databinding/ObservableField;", "hintRes", "", "getHintRes", "()I", "titleRes", "getTitleRes", "onValidate", "", "pick", "", "validate", "presentation_fullDebug"})
public abstract class DialogViewModel implements ua.mycredit.mycredit.ui.bases.input.Validable {
    private final int hintRes = 2131755345;
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableBoolean error = null;
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableField<ua.mycredit.mycredit.ui.FadeOut> fadeOut = null;
    
    public int getHintRes() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableBoolean getError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableField<ua.mycredit.mycredit.ui.FadeOut> getFadeOut() {
        return null;
    }
    
    public abstract int getTitleRes();
    
    public abstract void pick();
    
    public abstract boolean onValidate();
    
    @java.lang.Override()
    public final boolean validate() {
        return false;
    }
    
    public DialogViewModel() {
        super();
    }
}