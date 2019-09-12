package ua.mycredit.mycredit.ui.authentication.registration.passport.personal;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 )2\u00020\u0001:\u0003()*B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u001aH\u0016J\u000e\u0010 \u001a\u00020\u001e2\u0006\u0010\u0007\u001a\u00020\u0014J\b\u0010!\u001a\u00020\u001eH\u0014J\b\u0010\"\u001a\u00020\u001eH\u0014J\b\u0010#\u001a\u00020\u001eH\u0016J\b\u0010$\u001a\u00020\u001eH\u0002J\u0010\u0010%\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010&\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\'H\u0002R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u0011\u0010\u0011\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\nR\u0011\u0010\u0017\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\n\u00a8\u0006+"}, d2 = {"Lua/mycredit/mycredit/ui/authentication/registration/passport/personal/PersonalDataViewModel;", "Lua/mycredit/mycredit/ui/bases/input/FormViewModel;", "checkTin", "Lua/mycredit/core/interactors/CheckTinUseCase;", "phoneOptionsUseCase", "Lua/mycredit/core/interactors/PhoneOptionsUseCase;", "(Lua/mycredit/core/interactors/CheckTinUseCase;Lua/mycredit/core/interactors/PhoneOptionsUseCase;)V", "birthDay", "Lua/mycredit/mycredit/ui/bases/input/FieldViewModel;", "getBirthDay", "()Lua/mycredit/mycredit/ui/bases/input/FieldViewModel;", "fields", "", "getFields", "()Ljava/util/List;", "name", "getName", "patronymic", "getPatronymic", "pickedBirthDay", "Lorg/joda/time/LocalDate;", "surname", "getSurname", "tin", "getTin", "checkTinSum", "", "value", "", "findPermissionResult", "", "isContentChanged", "notifyBirthDayPicked", "onInitFields", "onReadyToSend", "persist", "pickBirthDay", "tryValidateTinByBirthday", "validateTinBirthday", "", "CheckTinObserver", "Companion", "DeviceOptionsObserver", "presentation_fullRelease"})
public final class PersonalDataViewModel extends ua.mycredit.mycredit.ui.bases.input.FormViewModel {
    @org.jetbrains.annotations.NotNull()
    private final ua.mycredit.mycredit.ui.bases.input.FieldViewModel surname = null;
    @org.jetbrains.annotations.NotNull()
    private final ua.mycredit.mycredit.ui.bases.input.FieldViewModel name = null;
    @org.jetbrains.annotations.NotNull()
    private final ua.mycredit.mycredit.ui.bases.input.FieldViewModel patronymic = null;
    @org.jetbrains.annotations.NotNull()
    private final ua.mycredit.mycredit.ui.bases.input.FieldViewModel birthDay = null;
    @org.jetbrains.annotations.NotNull()
    private final ua.mycredit.mycredit.ui.bases.input.FieldViewModel tin = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<ua.mycredit.mycredit.ui.bases.input.FieldViewModel> fields = null;
    private org.joda.time.LocalDate pickedBirthDay;
    private final ua.mycredit.core.interactors.CheckTinUseCase checkTin = null;
    private final ua.mycredit.core.interactors.PhoneOptionsUseCase phoneOptionsUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.Integer[] tinFactors = null;
    public static final ua.mycredit.mycredit.ui.authentication.registration.passport.personal.PersonalDataViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final ua.mycredit.mycredit.ui.bases.input.FieldViewModel getSurname() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.mycredit.mycredit.ui.bases.input.FieldViewModel getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.mycredit.mycredit.ui.bases.input.FieldViewModel getPatronymic() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.mycredit.mycredit.ui.bases.input.FieldViewModel getBirthDay() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.mycredit.mycredit.ui.bases.input.FieldViewModel getTin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<ua.mycredit.mycredit.ui.bases.input.FieldViewModel> getFields() {
        return null;
    }
    
    @java.lang.Override()
    protected void onInitFields() {
    }
    
    @java.lang.Override()
    public boolean isContentChanged() {
        return false;
    }
    
    @java.lang.Override()
    public void persist() {
    }
    
    @java.lang.Override()
    protected void onReadyToSend() {
    }
    
    public final void notifyBirthDayPicked(@org.jetbrains.annotations.NotNull()
    org.joda.time.LocalDate birthDay) {
    }
    
    private final void pickBirthDay() {
    }
    
    private final boolean tryValidateTinByBirthday(java.lang.CharSequence value) {
        return false;
    }
    
    private final boolean validateTinBirthday(java.lang.String tin) {
        return false;
    }
    
    private final boolean checkTinSum(java.lang.CharSequence value) {
        return false;
    }
    
    private final void findPermissionResult() {
    }
    
    @javax.inject.Inject()
    public PersonalDataViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.core.interactors.CheckTinUseCase checkTin, @org.jetbrains.annotations.NotNull()
    ua.mycredit.core.interactors.PhoneOptionsUseCase phoneOptionsUseCase) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lua/mycredit/mycredit/ui/authentication/registration/passport/personal/PersonalDataViewModel$DeviceOptionsObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$NoResponseFromServerCompletableObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "(Lua/mycredit/mycredit/ui/authentication/registration/passport/personal/PersonalDataViewModel;)V", "presentation_fullRelease"})
    final class DeviceOptionsObserver extends ua.mycredit.mycredit.ui.bases.BaseViewModel.NoResponseFromServerCompletableObserver {
        
        public DeviceOptionsObserver() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\f\u0012\u0004\u0012\u00020\u00020\u0001R\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000f"}, d2 = {"Lua/mycredit/mycredit/ui/authentication/registration/passport/personal/PersonalDataViewModel$CheckTinObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$BaseSingleObserver;", "", "Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "(Lua/mycredit/mycredit/ui/authentication/registration/passport/personal/PersonalDataViewModel;)V", "progressMode", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$ProgressMode$DIALOG;", "getProgressMode", "()Lua/mycredit/mycredit/ui/bases/BaseViewModel$ProgressMode$DIALOG;", "onHandleError", "e", "", "onSuccess", "", "t", "presentation_fullRelease"})
    final class CheckTinObserver extends ua.mycredit.mycredit.ui.bases.BaseViewModel.BaseSingleObserver<java.lang.Boolean> {
        @org.jetbrains.annotations.NotNull()
        private final ua.mycredit.mycredit.ui.bases.BaseViewModel.ProgressMode.DIALOG progressMode = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public ua.mycredit.mycredit.ui.bases.BaseViewModel.ProgressMode.DIALOG getProgressMode() {
            return null;
        }
        
        @java.lang.Override()
        public void onSuccess(boolean t) {
        }
        
        @java.lang.Override()
        public boolean onHandleError(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable e) {
            return false;
        }
        
        public CheckTinObserver() {
            super(0, false);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lua/mycredit/mycredit/ui/authentication/registration/passport/personal/PersonalDataViewModel$Companion;", "", "()V", "tinFactors", "", "", "getTinFactors", "()[Ljava/lang/Integer;", "[Ljava/lang/Integer;", "presentation_fullRelease"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Integer[] getTinFactors() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}