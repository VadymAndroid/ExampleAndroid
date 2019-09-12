package ua.mycredit.mycredit.ui.bases.input;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001:\u0004\u0019\u001a\u001b\u001cB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tJ\b\u0010\n\u001a\u00020\tH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0016J5\u0010\r\u001a\f\u0012\u0004\u0012\u0002H\u000f0\u000eR\u00020\u0000\"\u0010\b\u0000\u0010\u000f\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u000f0\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0086\bJ\b\u0010\u0014\u001a\u00020\tH\u0014J\b\u0010\u0015\u001a\u00020\tH$J\b\u0010\u0016\u001a\u00020\tH\u0016J\u0010\u0010\u0017\u001a\u00020\f2\b\b\u0002\u0010\u0018\u001a\u00020\fR\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u001d"}, d2 = {"Lua/mycredit/mycredit/ui/bases/input/FormViewModel;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "()V", "fields", "", "Lua/mycredit/mycredit/ui/bases/input/Validable;", "getFields", "()Ljava/util/List;", "attemptToSend", "", "initFields", "isContentChanged", "", "makeSimplePickerDialogViewModel", "Lua/mycredit/mycredit/ui/bases/input/FormViewModel$SimplePickerDialogViewModel;", "E", "", "titlesRes", "", "titleRes", "onInitFields", "onReadyToSend", "persist", "validate", "silently", "BaseInputDialogViewModel", "BasePickerDialogViewModel", "FieldReference", "SimplePickerDialogViewModel", "presentation_fullDebug"})
public abstract class FormViewModel extends ua.mycredit.mycredit.ui.bases.BaseViewModel {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<ua.mycredit.mycredit.ui.bases.input.Validable> getFields();
    
    protected abstract void onReadyToSend();
    
    @javax.inject.Inject()
    public final void initFields() {
    }
    
    protected void onInitFields() {
    }
    
    public boolean isContentChanged() {
        return false;
    }
    
    public void persist() {
    }
    
    public final void attemptToSend() {
    }
    
    public final boolean validate(boolean silently) {
        return false;
    }
    
    private final <E extends java.lang.Enum<E>>ua.mycredit.mycredit.ui.bases.input.FormViewModel.SimplePickerDialogViewModel<E> makeSimplePickerDialogViewModel(int titlesRes, int titleRes) {
        return null;
    }
    
    public FormViewModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\b\u0096\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0011"}, d2 = {"Lua/mycredit/mycredit/ui/bases/input/FormViewModel$BaseInputDialogViewModel;", "Lua/mycredit/mycredit/ui/bases/input/TextDialogViewModel;", "titleRes", "", "dialogField", "Lua/mycredit/mycredit/ui/bases/input/FieldViewModel;", "screen", "", "(Lua/mycredit/mycredit/ui/bases/input/FormViewModel;ILua/mycredit/mycredit/ui/bases/input/FieldViewModel;Ljava/lang/String;)V", "getDialogField", "()Lua/mycredit/mycredit/ui/bases/input/FieldViewModel;", "getScreen", "()Ljava/lang/String;", "getTitleRes", "()I", "pick", "", "presentation_fullDebug"})
    public class BaseInputDialogViewModel extends ua.mycredit.mycredit.ui.bases.input.TextDialogViewModel {
        private final int titleRes = 0;
        @org.jetbrains.annotations.NotNull()
        private final ua.mycredit.mycredit.ui.bases.input.FieldViewModel dialogField = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String screen = null;
        
        @java.lang.Override()
        public void pick() {
        }
        
        @java.lang.Override()
        public int getTitleRes() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public ua.mycredit.mycredit.ui.bases.input.FieldViewModel getDialogField() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getScreen() {
            return null;
        }
        
        public BaseInputDialogViewModel(int titleRes, @org.jetbrains.annotations.NotNull()
        ua.mycredit.mycredit.ui.bases.input.FieldViewModel dialogField, @org.jetbrains.annotations.NotNull()
        java.lang.String screen) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b\u00a6\u0004\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t\u00a8\u0006\r"}, d2 = {"Lua/mycredit/mycredit/ui/bases/input/FormViewModel$BasePickerDialogViewModel;", "E", "", "Lua/mycredit/mycredit/ui/bases/input/EnumPickerDialogViewModel;", "titlesRes", "", "titleRes", "(Lua/mycredit/mycredit/ui/bases/input/FormViewModel;II)V", "getTitleRes", "()I", "getTitlesRes", "pick", "", "presentation_fullDebug"})
    public abstract class BasePickerDialogViewModel<E extends java.lang.Enum<E>> extends ua.mycredit.mycredit.ui.bases.input.EnumPickerDialogViewModel<E> {
        private final int titlesRes = 0;
        private final int titleRes = 0;
        
        @java.lang.Override()
        public void pick() {
        }
        
        @java.lang.Override()
        public int getTitlesRes() {
            return 0;
        }
        
        @java.lang.Override()
        public int getTitleRes() {
            return 0;
        }
        
        public BasePickerDialogViewModel(int titlesRes, int titleRes) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0004\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\f\u0012\u0004\u0012\u0002H\u00010\u0003R\u00020\u0004B#\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u00a2\u0006\u0002\u0010\nR\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lua/mycredit/mycredit/ui/bases/input/FormViewModel$SimplePickerDialogViewModel;", "E", "", "Lua/mycredit/mycredit/ui/bases/input/FormViewModel$BasePickerDialogViewModel;", "Lua/mycredit/mycredit/ui/bases/input/FormViewModel;", "titlesRes", "", "titleRes", "enumClass", "Lkotlin/reflect/KClass;", "(Lua/mycredit/mycredit/ui/bases/input/FormViewModel;IILkotlin/reflect/KClass;)V", "getTitleRes", "()I", "getTitlesRes", "variants", "", "getVariants", "()[Ljava/lang/Enum;", "presentation_fullDebug"})
    public final class SimplePickerDialogViewModel<E extends java.lang.Enum<E>> extends ua.mycredit.mycredit.ui.bases.input.FormViewModel.BasePickerDialogViewModel<E> {
        private final int titlesRes = 0;
        private final int titleRes = 0;
        private final kotlin.reflect.KClass<E> enumClass = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public E[] getVariants() {
            return null;
        }
        
        @java.lang.Override()
        public int getTitlesRes() {
            return 0;
        }
        
        @java.lang.Override()
        public int getTitleRes() {
            return 0;
        }
        
        public SimplePickerDialogViewModel(int titlesRes, int titleRes, @org.jetbrains.annotations.NotNull()
        kotlin.reflect.KClass<E> enumClass) {
            super(0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u0006H\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0006H\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lua/mycredit/mycredit/ui/bases/input/FormViewModel$FieldReference;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "index", "", "clazz", "Ljava/lang/Class;", "Lua/mycredit/mycredit/ui/bases/input/FormViewModel;", "(ILjava/lang/Class;)V", "dereference", "Lua/mycredit/mycredit/ui/bases/input/Validable;", "supportFragmentManager", "Landroid/support/v4/app/FragmentManager;", "describeContents", "writeToParcel", "", "flags", "CREATOR", "presentation_fullDebug"})
    public static final class FieldReference implements android.os.Parcelable {
        private final int index = 0;
        private final java.lang.Class<ua.mycredit.mycredit.ui.bases.input.FormViewModel> clazz = null;
        public static final ua.mycredit.mycredit.ui.bases.input.FormViewModel.FieldReference.CREATOR CREATOR = null;
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ua.mycredit.mycredit.ui.bases.input.Validable dereference(@org.jetbrains.annotations.NotNull()
        android.support.v4.app.FragmentManager supportFragmentManager) {
            return null;
        }
        
        public FieldReference(int index, @org.jetbrains.annotations.NotNull()
        java.lang.Class<ua.mycredit.mycredit.ui.bases.input.FormViewModel> clazz) {
            super();
        }
        
        @kotlin.Suppress(names = {"UNCHECKED_CAST"})
        public FieldReference(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel) {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lua/mycredit/mycredit/ui/bases/input/FormViewModel$FieldReference$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lua/mycredit/mycredit/ui/bases/input/FormViewModel$FieldReference;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lua/mycredit/mycredit/ui/bases/input/FormViewModel$FieldReference;", "presentation_fullDebug"})
        public static final class CREATOR implements android.os.Parcelable.Creator<ua.mycredit.mycredit.ui.bases.input.FormViewModel.FieldReference> {
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public ua.mycredit.mycredit.ui.bases.input.FormViewModel.FieldReference createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel parcel) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public ua.mycredit.mycredit.ui.bases.input.FormViewModel.FieldReference[] newArray(int size) {
                return null;
            }
            
            private CREATOR() {
                super();
            }
        }
    }
}