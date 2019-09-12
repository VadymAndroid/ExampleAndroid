package ua.mycredit.mycredit.ui.authentication.registration.phone;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0003!\"#B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u001b\u001a\u00020\u001cJ\b\u0010\u001d\u001a\u00020\u001cH\u0014J\b\u0010\u001e\u001a\u00020\u001cH\u0016J\u000e\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u0018R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u0013X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006$"}, d2 = {"Lua/mycredit/mycredit/ui/authentication/registration/phone/SignUpPhoneViewModel;", "Lua/mycredit/mycredit/ui/bases/input/FormViewModel;", "requestSmsIfPhoneValid", "Lua/mycredit/core/interactors/RequestSmsIfPhoneValidUseCase;", "signIn", "Lua/mycredit/core/interactors/SignInUseCase;", "(Lua/mycredit/core/interactors/RequestSmsIfPhoneValidUseCase;Lua/mycredit/core/interactors/SignInUseCase;)V", "fields", "", "Lua/mycredit/mycredit/ui/bases/input/Validable;", "getFields", "()Ljava/util/List;", "password", "Lua/mycredit/mycredit/ui/bases/input/FieldViewModel;", "getPassword", "()Lua/mycredit/mycredit/ui/bases/input/FieldViewModel;", "phone", "getPhone", "preLoaderCompatPadding", "", "getPreLoaderCompatPadding", "()Z", "state", "Landroid/databinding/ObservableField;", "Lua/mycredit/mycredit/ui/authentication/registration/phone/SignUpPhoneViewModel$State;", "getState", "()Landroid/databinding/ObservableField;", "forgotPassword", "", "onReadyToSend", "persist", "resetState", "s", "CheckPhoneObserver", "SignInObserver", "State", "presentation_fullRelease"})
public final class SignUpPhoneViewModel extends ua.mycredit.mycredit.ui.bases.input.FormViewModel {
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableField<ua.mycredit.mycredit.ui.authentication.registration.phone.SignUpPhoneViewModel.State> state = null;
    @org.jetbrains.annotations.NotNull()
    private final ua.mycredit.mycredit.ui.bases.input.FieldViewModel phone = null;
    @org.jetbrains.annotations.NotNull()
    private final ua.mycredit.mycredit.ui.bases.input.FieldViewModel password = null;
    private final boolean preLoaderCompatPadding = true;
    private final ua.mycredit.core.interactors.RequestSmsIfPhoneValidUseCase requestSmsIfPhoneValid = null;
    private final ua.mycredit.core.interactors.SignInUseCase signIn = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableField<ua.mycredit.mycredit.ui.authentication.registration.phone.SignUpPhoneViewModel.State> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.mycredit.mycredit.ui.bases.input.FieldViewModel getPhone() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.mycredit.mycredit.ui.bases.input.FieldViewModel getPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<ua.mycredit.mycredit.ui.bases.input.Validable> getFields() {
        return null;
    }
    
    @java.lang.Override()
    public boolean getPreLoaderCompatPadding() {
        return false;
    }
    
    @java.lang.Override()
    public void persist() {
    }
    
    @java.lang.Override()
    protected void onReadyToSend() {
    }
    
    public final void resetState(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.ui.authentication.registration.phone.SignUpPhoneViewModel.State s) {
    }
    
    public final void forgotPassword() {
    }
    
    @javax.inject.Inject()
    public SignUpPhoneViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.core.interactors.RequestSmsIfPhoneValidUseCase requestSmsIfPhoneValid, @org.jetbrains.annotations.NotNull()
    ua.mycredit.core.interactors.SignInUseCase signIn) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0010"}, d2 = {"Lua/mycredit/mycredit/ui/authentication/registration/phone/SignUpPhoneViewModel$CheckPhoneObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$BaseCompletableObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "(Lua/mycredit/mycredit/ui/authentication/registration/phone/SignUpPhoneViewModel;)V", "progressMode", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$ProgressMode$DIALOG;", "getProgressMode", "()Lua/mycredit/mycredit/ui/bases/BaseViewModel$ProgressMode$DIALOG;", "onComplete", "", "onHandleError", "", "e", "", "onMapError", "", "presentation_fullRelease"})
    final class CheckPhoneObserver extends ua.mycredit.mycredit.ui.bases.BaseViewModel.BaseCompletableObserver {
        @org.jetbrains.annotations.NotNull()
        private final ua.mycredit.mycredit.ui.bases.BaseViewModel.ProgressMode.DIALOG progressMode = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public ua.mycredit.mycredit.ui.bases.BaseViewModel.ProgressMode.DIALOG getProgressMode() {
            return null;
        }
        
        @java.lang.Override()
        public int onMapError(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable e) {
            return 0;
        }
        
        @java.lang.Override()
        public void onComplete() {
        }
        
        @java.lang.Override()
        public boolean onHandleError(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable e) {
            return false;
        }
        
        public CheckPhoneObserver() {
            super(0, false);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000e"}, d2 = {"Lua/mycredit/mycredit/ui/authentication/registration/phone/SignUpPhoneViewModel$SignInObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$BaseCompletableObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "(Lua/mycredit/mycredit/ui/authentication/registration/phone/SignUpPhoneViewModel;)V", "progressMode", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$ProgressMode$DIALOG;", "getProgressMode", "()Lua/mycredit/mycredit/ui/bases/BaseViewModel$ProgressMode$DIALOG;", "onComplete", "", "onMapError", "", "e", "", "presentation_fullRelease"})
    final class SignInObserver extends ua.mycredit.mycredit.ui.bases.BaseViewModel.BaseCompletableObserver {
        @org.jetbrains.annotations.NotNull()
        private final ua.mycredit.mycredit.ui.bases.BaseViewModel.ProgressMode.DIALOG progressMode = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public ua.mycredit.mycredit.ui.bases.BaseViewModel.ProgressMode.DIALOG getProgressMode() {
            return null;
        }
        
        @java.lang.Override()
        public int onMapError(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable e) {
            return 0;
        }
        
        @java.lang.Override()
        public void onComplete() {
        }
        
        public SignInObserver() {
            super(0, false);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\'\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H&R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nj\u0002\b\u0014j\u0002\b\u0015\u00a8\u0006\u0016"}, d2 = {"Lua/mycredit/mycredit/ui/authentication/registration/phone/SignUpPhoneViewModel$State;", "", "title", "", "titleColor", "phoneEnable", "", "actionText", "(Ljava/lang/String;IIIZI)V", "getActionText", "()I", "getPhoneEnable", "()Z", "getTitle", "getTitleColor", "fields", "", "Lua/mycredit/mycredit/ui/bases/input/Validable;", "viewModel", "Lua/mycredit/mycredit/ui/authentication/registration/phone/SignUpPhoneViewModel;", "DEFAULT", "ALREADY_REGISTERED", "presentation_fullRelease"})
    public static enum State {
        /*public static final*/ DEFAULT /* = new @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lua/mycredit/mycredit/ui/authentication/registration/phone/SignUpPhoneViewModel$State$DEFAULT;", "Lua/mycredit/mycredit/ui/authentication/registration/phone/SignUpPhoneViewModel$State;", "fields", "", "Lua/mycredit/mycredit/ui/bases/input/FieldViewModel;", "viewModel", "Lua/mycredit/mycredit/ui/authentication/registration/phone/SignUpPhoneViewModel;", "presentation_fullRelease"}) DEFAULT(0, 0, false, 0){
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.util.List<ua.mycredit.mycredit.ui.bases.input.FieldViewModel> fields(@org.jetbrains.annotations.NotNull()
            ua.mycredit.mycredit.ui.authentication.registration.phone.SignUpPhoneViewModel viewModel) {
                return null;
            }
            
            DEFAULT() {
                super(0, 0, false, 0);
            }
        } */,
        /*public static final*/ ALREADY_REGISTERED /* = new @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lua/mycredit/mycredit/ui/authentication/registration/phone/SignUpPhoneViewModel$State$ALREADY_REGISTERED;", "Lua/mycredit/mycredit/ui/authentication/registration/phone/SignUpPhoneViewModel$State;", "fields", "", "Lua/mycredit/mycredit/ui/bases/input/FieldViewModel;", "viewModel", "Lua/mycredit/mycredit/ui/authentication/registration/phone/SignUpPhoneViewModel;", "presentation_fullRelease"}) ALREADY_REGISTERED(0, 0, false, 0){
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.util.List<ua.mycredit.mycredit.ui.bases.input.FieldViewModel> fields(@org.jetbrains.annotations.NotNull()
            ua.mycredit.mycredit.ui.authentication.registration.phone.SignUpPhoneViewModel viewModel) {
                return null;
            }
            
            ALREADY_REGISTERED() {
                super(0, 0, false, 0);
            }
        } */;
        private final int title = 0;
        private final int titleColor = 0;
        private final boolean phoneEnable = false;
        private final int actionText = 0;
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.util.List<ua.mycredit.mycredit.ui.bases.input.Validable> fields(@org.jetbrains.annotations.NotNull()
        ua.mycredit.mycredit.ui.authentication.registration.phone.SignUpPhoneViewModel viewModel);
        
        public final int getTitle() {
            return 0;
        }
        
        public final int getTitleColor() {
            return 0;
        }
        
        public final boolean getPhoneEnable() {
            return false;
        }
        
        public final int getActionText() {
            return 0;
        }
        
        State(int title, int titleColor, boolean phoneEnable, int actionText) {
        }
    }
}