package ua.mycredit.mycredit.ui.delegates;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0017"}, d2 = {"Lua/mycredit/mycredit/ui/delegates/FbEmailDelegate;", "Lua/mycredit/mycredit/ui/delegates/FbEmail;", "router", "Lru/terrakok/cicerone/Router;", "(Lru/terrakok/cicerone/Router;)V", "email", "Lua/mycredit/mycredit/ui/bases/input/FieldViewModel;", "getEmail", "()Lua/mycredit/mycredit/ui/bases/input/FieldViewModel;", "fbUrl", "", "getFbUrl", "()Ljava/lang/String;", "setFbUrl", "(Ljava/lang/String;)V", "getRouter", "()Lru/terrakok/cicerone/Router;", "logInWithFb", "", "onFacebookLoginSuccess", "result", "Lcom/facebook/login/LoginResult;", "Companion", "presentation_fullDebug"})
public final class FbEmailDelegate implements ua.mycredit.mycredit.ui.delegates.FbEmail {
    @org.jetbrains.annotations.NotNull()
    private final ua.mycredit.mycredit.ui.bases.input.FieldViewModel email = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String fbUrl;
    @org.jetbrains.annotations.NotNull()
    private final ru.terrakok.cicerone.Router router = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EMAIL = "email";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LINK = "link";
    public static final ua.mycredit.mycredit.ui.delegates.FbEmailDelegate.Companion Companion = null;
    
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
    public void onFacebookLoginSuccess(@org.jetbrains.annotations.NotNull()
    com.facebook.login.LoginResult result) {
    }
    
    @java.lang.Override()
    public void logInWithFb() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.terrakok.cicerone.Router getRouter() {
        return null;
    }
    
    @javax.inject.Inject()
    public FbEmailDelegate(@org.jetbrains.annotations.NotNull()
    ru.terrakok.cicerone.Router router) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lua/mycredit/mycredit/ui/delegates/FbEmailDelegate$Companion;", "", "()V", "EMAIL", "", "LINK", "presentation_fullDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}