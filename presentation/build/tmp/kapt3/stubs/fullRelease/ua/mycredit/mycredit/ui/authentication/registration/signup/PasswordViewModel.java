package ua.mycredit.mycredit.ui.authentication.registration.signup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001(B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010 \u001a\u00020!J\t\u0010\"\u001a\u00020!H\u0096\u0001J\u0011\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020%H\u0096\u0001J\b\u0010&\u001a\u00020!H\u0014J\b\u0010\'\u001a\u00020!H\u0016R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\tX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u000f\u00a2\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u0015X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000bR\u0011\u0010\u001a\u001a\u00020\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010\u0011R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lua/mycredit/mycredit/ui/authentication/registration/signup/PasswordViewModel;", "Lua/mycredit/mycredit/ui/bases/input/FormViewModel;", "Lua/mycredit/mycredit/ui/delegates/FbEmail;", "delegate", "Lua/mycredit/mycredit/ui/delegates/FbEmailDelegate;", "signIn", "Lua/mycredit/core/interactors/SignInUseCase;", "(Lua/mycredit/mycredit/ui/delegates/FbEmailDelegate;Lua/mycredit/core/interactors/SignInUseCase;)V", "confirm", "Lua/mycredit/mycredit/ui/bases/input/FieldViewModel;", "getConfirm", "()Lua/mycredit/mycredit/ui/bases/input/FieldViewModel;", "email", "getEmail", "fbUrl", "", "getFbUrl", "()Ljava/lang/String;", "setFbUrl", "(Ljava/lang/String;)V", "fields", "", "getFields", "()Ljava/util/List;", "password", "getPassword", "passwordRequirements", "Lua/mycredit/mycredit/ui/bases/input/PasswordRequirementsViewModel;", "getPasswordRequirements", "()Lua/mycredit/mycredit/ui/bases/input/PasswordRequirementsViewModel;", "phone", "getPhone", "backToPhoneSignUp", "", "logInWithFb", "onFacebookLoginSuccess", "result", "Lcom/facebook/login/LoginResult;", "onReadyToSend", "persist", "SignUpObserver", "presentation_fullRelease"})
public final class PasswordViewModel extends ua.mycredit.mycredit.ui.bases.input.FormViewModel implements ua.mycredit.mycredit.ui.delegates.FbEmail {
    @org.jetbrains.annotations.NotNull()
    private final ua.mycredit.mycredit.ui.bases.input.FieldViewModel password = null;
    @org.jetbrains.annotations.NotNull()
    private final ua.mycredit.mycredit.ui.bases.input.FieldViewModel confirm = null;
    @org.jetbrains.annotations.NotNull()
    private final ua.mycredit.mycredit.ui.bases.input.PasswordRequirementsViewModel passwordRequirements = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<ua.mycredit.mycredit.ui.bases.input.FieldViewModel> fields = null;
    private final ua.mycredit.core.interactors.SignInUseCase signIn = null;
    
    @org.jetbrains.annotations.NotNull()
    public final ua.mycredit.mycredit.ui.bases.input.FieldViewModel getPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.mycredit.mycredit.ui.bases.input.FieldViewModel getConfirm() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhone() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.mycredit.mycredit.ui.bases.input.PasswordRequirementsViewModel getPasswordRequirements() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<ua.mycredit.mycredit.ui.bases.input.FieldViewModel> getFields() {
        return null;
    }
    
    @java.lang.Override()
    public void persist() {
    }
    
    @java.lang.Override()
    protected void onReadyToSend() {
    }
    
    public final void backToPhoneSignUp() {
    }
    
    @javax.inject.Inject()
    public PasswordViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.ui.delegates.FbEmailDelegate delegate, @org.jetbrains.annotations.NotNull()
    ua.mycredit.core.interactors.SignInUseCase signIn) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.mycredit.mycredit.ui.bases.input.FieldViewModel getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getFbUrl() {
        return null;
    }
    
    @java.lang.Override()
    public void setFbUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public void logInWithFb() {
    }
    
    @java.lang.Override()
    public void onFacebookLoginSuccess(@org.jetbrains.annotations.NotNull()
    com.facebook.login.LoginResult result) {
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\n"}, d2 = {"Lua/mycredit/mycredit/ui/authentication/registration/signup/PasswordViewModel$SignUpObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$BaseCompletableObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "(Lua/mycredit/mycredit/ui/authentication/registration/signup/PasswordViewModel;)V", "progressMode", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$ProgressMode$DIALOG;", "getProgressMode", "()Lua/mycredit/mycredit/ui/bases/BaseViewModel$ProgressMode$DIALOG;", "onComplete", "", "presentation_fullRelease"})
    final class SignUpObserver extends ua.mycredit.mycredit.ui.bases.BaseViewModel.BaseCompletableObserver {
        @org.jetbrains.annotations.NotNull()
        private final ua.mycredit.mycredit.ui.bases.BaseViewModel.ProgressMode.DIALOG progressMode = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public ua.mycredit.mycredit.ui.bases.BaseViewModel.ProgressMode.DIALOG getProgressMode() {
            return null;
        }
        
        @java.lang.Override()
        public void onComplete() {
        }
        
        public SignUpObserver() {
            super(0, false);
        }
    }
}