package ua.mycredit.mycredit.ui.authentication.registration.passport.personal;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\t\u0010\u0017\u001a\u00020\u0018H\u0096\u0001J\u0011\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0096\u0001J\b\u0010\u001c\u001a\u00020\u0018H\u0014J\b\u0010\u001d\u001a\u00020\u0018H\u0016R\u0012\u0010\u0006\u001a\u00020\u0007X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u000f\u00a2\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001e"}, d2 = {"Lua/mycredit/mycredit/ui/authentication/registration/passport/personal/ExtraPersonalInfoViewModel;", "Lua/mycredit/mycredit/ui/authentication/registration/passport/personal/PersonalInfoViewModel;", "Lua/mycredit/mycredit/ui/delegates/FbEmail;", "delegate", "Lua/mycredit/mycredit/ui/delegates/FbEmailDelegate;", "(Lua/mycredit/mycredit/ui/delegates/FbEmailDelegate;)V", "email", "Lua/mycredit/mycredit/ui/bases/input/FieldViewModel;", "getEmail", "()Lua/mycredit/mycredit/ui/bases/input/FieldViewModel;", "fbUrl", "", "getFbUrl", "()Ljava/lang/String;", "setFbUrl", "(Ljava/lang/String;)V", "fields", "", "Lua/mycredit/mycredit/ui/bases/input/Validable;", "getFields", "()Ljava/util/List;", "isContentChanged", "", "logInWithFb", "", "onFacebookLoginSuccess", "result", "Lcom/facebook/login/LoginResult;", "onInitFields", "persist", "presentation_fullRelease"})
public final class ExtraPersonalInfoViewModel extends ua.mycredit.mycredit.ui.authentication.registration.passport.personal.PersonalInfoViewModel implements ua.mycredit.mycredit.ui.delegates.FbEmail {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<ua.mycredit.mycredit.ui.bases.input.Validable> getFields() {
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
    
    @javax.inject.Inject()
    public ExtraPersonalInfoViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.ui.delegates.FbEmailDelegate delegate) {
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
}