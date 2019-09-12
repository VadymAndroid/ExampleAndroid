package ua.mycredit.mycredit.ui.bases.input;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0001\u000b\u00a8\u0006\f"}, d2 = {"Lua/mycredit/mycredit/ui/bases/input/PickerDialogViewModel;", "Lua/mycredit/mycredit/ui/bases/input/DialogViewModel;", "()V", "pickedIndex", "Landroid/databinding/ObservableInt;", "getPickedIndex", "()Landroid/databinding/ObservableInt;", "titlesRes", "", "getTitlesRes", "()I", "Lua/mycredit/mycredit/ui/bases/input/EnumPickerDialogViewModel;", "presentation_fullRelease"})
public abstract class PickerDialogViewModel extends ua.mycredit.mycredit.ui.bases.input.DialogViewModel {
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableInt pickedIndex = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableInt getPickedIndex() {
        return null;
    }
    
    @android.support.annotation.ArrayRes()
    public abstract int getTitlesRes();
    
    private PickerDialogViewModel() {
        super();
    }
}