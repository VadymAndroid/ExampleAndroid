package ua.mycredit.mycredit.ui.bases.input;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b&\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\nX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0014"}, d2 = {"Lua/mycredit/mycredit/ui/bases/input/EnumPickerDialogViewModel;", "E", "", "Lua/mycredit/mycredit/ui/bases/input/PickerDialogViewModel;", "()V", "picked", "Landroid/databinding/ObservableField;", "getPicked", "()Landroid/databinding/ObservableField;", "variants", "", "getVariants", "()[Ljava/lang/Enum;", "notifyPicked", "", "position", "", "onValidate", "", "OnPickedItemChangedCallback", "presentation_fullRelease"})
public abstract class EnumPickerDialogViewModel<E extends java.lang.Enum<E>> extends ua.mycredit.mycredit.ui.bases.input.PickerDialogViewModel {
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableField<E> picked = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract E[] getVariants();
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableField<E> getPicked() {
        return null;
    }
    
    @java.lang.Override()
    public boolean onValidate() {
        return false;
    }
    
    public final void notifyPicked(int position) {
    }
    
    public EnumPickerDialogViewModel() {
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lua/mycredit/mycredit/ui/bases/input/EnumPickerDialogViewModel$OnPickedItemChangedCallback;", "Landroid/databinding/Observable$OnPropertyChangedCallback;", "(Lua/mycredit/mycredit/ui/bases/input/EnumPickerDialogViewModel;)V", "onPropertyChanged", "", "sender", "Landroid/databinding/Observable;", "propertyId", "", "presentation_fullRelease"})
    final class OnPickedItemChangedCallback extends android.databinding.Observable.OnPropertyChangedCallback {
        
        @java.lang.Override()
        public void onPropertyChanged(@org.jetbrains.annotations.Nullable()
        android.databinding.Observable sender, int propertyId) {
        }
        
        public OnPickedItemChangedCallback() {
            super();
        }
    }
}