package ua.mycredit.mycredit.ui.delegates;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0011"}, d2 = {"Lua/mycredit/mycredit/ui/delegates/FbEmail;", "", "email", "Lua/mycredit/mycredit/ui/bases/input/FieldViewModel;", "getEmail", "()Lua/mycredit/mycredit/ui/bases/input/FieldViewModel;", "fbUrl", "", "getFbUrl", "()Ljava/lang/String;", "setFbUrl", "(Ljava/lang/String;)V", "logInWithFb", "", "onFacebookLoginSuccess", "result", "Lcom/facebook/login/LoginResult;", "presentation_fullDebug"})
public abstract interface FbEmail {
    
    @org.jetbrains.annotations.NotNull()
    public abstract ua.mycredit.mycredit.ui.bases.input.FieldViewModel getEmail();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getFbUrl();
    
    public abstract void setFbUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0);
    
    public abstract void logInWithFb();
    
    public abstract void onFacebookLoginSuccess(@org.jetbrains.annotations.NotNull()
    com.facebook.login.LoginResult result);
}