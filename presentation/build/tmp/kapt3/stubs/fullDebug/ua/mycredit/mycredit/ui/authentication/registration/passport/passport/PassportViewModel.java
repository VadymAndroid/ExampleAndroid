package ua.mycredit.mycredit.ui.authentication.registration.passport.passport;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 \"2\u00020\u0001:\u0004\"#$%B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0015H\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0019H\u0014J\b\u0010\u001e\u001a\u00020\u0019H\u0014J\b\u0010\u001f\u001a\u00020\u0019H\u0016J\u0006\u0010 \u001a\u00020\u0019J\u0006\u0010!\u001a\u00020\u0019R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001f\u0010\b\u001a\u00060\tR\u00020\u00008FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u000e\u001a\u00060\u000fR\u00020\u00008FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006&"}, d2 = {"Lua/mycredit/mycredit/ui/authentication/registration/passport/passport/PassportViewModel;", "Lua/mycredit/mycredit/ui/bases/input/FormViewModel;", "()V", "fields", "", "Lua/mycredit/mycredit/ui/bases/input/FieldViewModel;", "getFields", "()Ljava/util/List;", "idCardState", "Lua/mycredit/mycredit/ui/authentication/registration/passport/passport/PassportViewModel$IdCardState;", "getIdCardState", "()Lua/mycredit/mycredit/ui/authentication/registration/passport/passport/PassportViewModel$IdCardState;", "idCardState$delegate", "Lkotlin/Lazy;", "passportState", "Lua/mycredit/mycredit/ui/authentication/registration/passport/passport/PassportViewModel$PassportState;", "getPassportState", "()Lua/mycredit/mycredit/ui/authentication/registration/passport/passport/PassportViewModel$PassportState;", "passportState$delegate", "state", "Landroid/databinding/ObservableField;", "Lua/mycredit/mycredit/ui/authentication/registration/passport/passport/PassportViewModel$State;", "getState", "()Landroid/databinding/ObservableField;", "doSetStateTo", "", "s", "isContentChanged", "", "onInitFields", "onReadyToSend", "persist", "setStateToIdCard", "setStateToPassport", "Companion", "IdCardState", "PassportState", "State", "presentation_fullDebug"})
public final class PassportViewModel extends ua.mycredit.mycredit.ui.bases.input.FormViewModel {
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableField<ua.mycredit.mycredit.ui.authentication.registration.passport.passport.PassportViewModel.State> state = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy passportState$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy idCardState$delegate = null;
    private static final int CARD_ID_LEFT_PART = 8;
    public static final ua.mycredit.mycredit.ui.authentication.registration.passport.passport.PassportViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<ua.mycredit.mycredit.ui.bases.input.FieldViewModel> getFields() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableField<ua.mycredit.mycredit.ui.authentication.registration.passport.passport.PassportViewModel.State> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.mycredit.mycredit.ui.authentication.registration.passport.passport.PassportViewModel.PassportState getPassportState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.mycredit.mycredit.ui.authentication.registration.passport.passport.PassportViewModel.IdCardState getIdCardState() {
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
    
    public final void setStateToPassport() {
    }
    
    public final void setStateToIdCard() {
    }
    
    private final void doSetStateTo(ua.mycredit.mycredit.ui.authentication.registration.passport.passport.PassportViewModel.State s) {
    }
    
    @javax.inject.Inject()
    public PassportViewModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u000eH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0010"}, d2 = {"Lua/mycredit/mycredit/ui/authentication/registration/passport/passport/PassportViewModel$State;", "", "contentChanged", "", "getContentChanged", "()Z", "fields", "", "Lua/mycredit/mycredit/ui/bases/input/FieldViewModel;", "getFields", "()Ljava/util/List;", "init", "", "passport", "Lua/mycredit/core/Passport;", "makePassport", "presentation_fullDebug"})
    public static abstract interface State {
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.util.List<ua.mycredit.mycredit.ui.bases.input.FieldViewModel> getFields();
        
        public abstract boolean getContentChanged();
        
        public abstract void init(@org.jetbrains.annotations.NotNull()
        ua.mycredit.core.Passport passport);
        
        @org.jetbrains.annotations.NotNull()
        public abstract ua.mycredit.core.Passport makePassport();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\t8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0016\u0010\u0010R\u001b\u0010\u0018\u001a\u00020\t8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u0019\u0010\u0010\u00a8\u0006 "}, d2 = {"Lua/mycredit/mycredit/ui/authentication/registration/passport/passport/PassportViewModel$PassportState;", "Lua/mycredit/mycredit/ui/authentication/registration/passport/passport/PassportViewModel$State;", "(Lua/mycredit/mycredit/ui/authentication/registration/passport/passport/PassportViewModel;)V", "contentChanged", "", "getContentChanged", "()Z", "fields", "", "Lua/mycredit/mycredit/ui/bases/input/FieldViewModel;", "getFields", "()Ljava/util/List;", "fields$delegate", "Lkotlin/Lazy;", "givenBy", "getGivenBy", "()Lua/mycredit/mycredit/ui/bases/input/FieldViewModel;", "issued", "getIssued", "issuedPicker", "Lua/mycredit/mycredit/ui/bases/input/DatePickerViewModel;", "number", "getNumber", "number$delegate", "series", "getSeries", "series$delegate", "init", "", "passport", "Lua/mycredit/core/Passport;", "makePassport", "presentation_fullDebug"})
    public final class PassportState implements ua.mycredit.mycredit.ui.authentication.registration.passport.passport.PassportViewModel.State {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy series$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy number$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final ua.mycredit.mycredit.ui.bases.input.FieldViewModel givenBy = null;
        private final ua.mycredit.mycredit.ui.bases.input.DatePickerViewModel issuedPicker = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy fields$delegate = null;
        
        @org.jetbrains.annotations.NotNull()
        public final ua.mycredit.mycredit.ui.bases.input.FieldViewModel getSeries() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ua.mycredit.mycredit.ui.bases.input.FieldViewModel getNumber() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ua.mycredit.mycredit.ui.bases.input.FieldViewModel getGivenBy() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ua.mycredit.mycredit.ui.bases.input.FieldViewModel getIssued() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.List<ua.mycredit.mycredit.ui.bases.input.FieldViewModel> getFields() {
            return null;
        }
        
        @java.lang.Override()
        public boolean getContentChanged() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public ua.mycredit.core.Passport makePassport() {
            return null;
        }
        
        @java.lang.Override()
        public void init(@org.jetbrains.annotations.NotNull()
        ua.mycredit.core.Passport passport) {
        }
        
        public PassportState() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020 H\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00108VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\nR\u0011\u0010\u0017\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\nR\u000e\u0010\u0019\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001b\u0010\n\u00a8\u0006\""}, d2 = {"Lua/mycredit/mycredit/ui/authentication/registration/passport/passport/PassportViewModel$IdCardState;", "Lua/mycredit/mycredit/ui/authentication/registration/passport/passport/PassportViewModel$State;", "(Lua/mycredit/mycredit/ui/authentication/registration/passport/passport/PassportViewModel;)V", "contentChanged", "", "getContentChanged", "()Z", "docNumber", "Lua/mycredit/mycredit/ui/bases/input/FieldViewModel;", "getDocNumber", "()Lua/mycredit/mycredit/ui/bases/input/FieldViewModel;", "expired", "getExpired", "expiredPicker", "Lua/mycredit/mycredit/ui/bases/input/DatePickerViewModel;", "fields", "", "getFields", "()Ljava/util/List;", "fields$delegate", "Lkotlin/Lazy;", "givenBy", "getGivenBy", "issued", "getIssued", "issuedPicker", "record", "getRecord", "record$delegate", "init", "", "passport", "Lua/mycredit/core/Passport;", "makePassport", "presentation_fullDebug"})
    public final class IdCardState implements ua.mycredit.mycredit.ui.authentication.registration.passport.passport.PassportViewModel.State {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy fields$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy record$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final ua.mycredit.mycredit.ui.bases.input.FieldViewModel docNumber = null;
        @org.jetbrains.annotations.NotNull()
        private final ua.mycredit.mycredit.ui.bases.input.FieldViewModel givenBy = null;
        private final ua.mycredit.mycredit.ui.bases.input.DatePickerViewModel issuedPicker = null;
        private final ua.mycredit.mycredit.ui.bases.input.DatePickerViewModel expiredPicker = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.List<ua.mycredit.mycredit.ui.bases.input.FieldViewModel> getFields() {
            return null;
        }
        
        @java.lang.Override()
        public boolean getContentChanged() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ua.mycredit.mycredit.ui.bases.input.FieldViewModel getRecord() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ua.mycredit.mycredit.ui.bases.input.FieldViewModel getDocNumber() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ua.mycredit.mycredit.ui.bases.input.FieldViewModel getGivenBy() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ua.mycredit.mycredit.ui.bases.input.FieldViewModel getIssued() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ua.mycredit.mycredit.ui.bases.input.FieldViewModel getExpired() {
            return null;
        }
        
        @java.lang.Override()
        public void init(@org.jetbrains.annotations.NotNull()
        ua.mycredit.core.Passport passport) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public ua.mycredit.core.Passport makePassport() {
            return null;
        }
        
        public IdCardState() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lua/mycredit/mycredit/ui/authentication/registration/passport/passport/PassportViewModel$Companion;", "", "()V", "CARD_ID_LEFT_PART", "", "presentation_fullDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}