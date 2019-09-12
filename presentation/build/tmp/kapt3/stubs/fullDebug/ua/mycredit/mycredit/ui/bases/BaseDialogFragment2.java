package ua.mycredit.mycredit.ui.bases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001aH\u0014J\u0010\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"H\u0015R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\nX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006#"}, d2 = {"Lua/mycredit/mycredit/ui/bases/BaseDialogFragment2;", "Ldagger/android/support/DaggerAppCompatDialogFragment;", "()V", "events", "Lua/mycredit/mycredit/AppEvents;", "getEvents", "()Lua/mycredit/mycredit/AppEvents;", "setEvents", "(Lua/mycredit/mycredit/AppEvents;)V", "layoutId", "", "getLayoutId", "()I", "router", "Lru/terrakok/cicerone/Router;", "getRouter", "()Lru/terrakok/cicerone/Router;", "setRouter", "(Lru/terrakok/cicerone/Router;)V", "storage", "Lua/mycredit/core/LocalStorage;", "getStorage", "()Lua/mycredit/core/LocalStorage;", "setStorage", "(Lua/mycredit/core/LocalStorage;)V", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onDialogCreated", "", "dialog", "onDialogViewCreated", "view", "Landroid/view/View;", "presentation_fullDebug"})
public abstract class BaseDialogFragment2 extends dagger.android.support.DaggerAppCompatDialogFragment {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public ru.terrakok.cicerone.Router router;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public ua.mycredit.core.LocalStorage storage;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public ua.mycredit.mycredit.AppEvents events;
    private java.util.HashMap _$_findViewCache;
    
    protected abstract int getLayoutId();
    
    @org.jetbrains.annotations.NotNull()
    public final ru.terrakok.cicerone.Router getRouter() {
        return null;
    }
    
    public final void setRouter(@org.jetbrains.annotations.NotNull()
    ru.terrakok.cicerone.Router p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.mycredit.core.LocalStorage getStorage() {
        return null;
    }
    
    public final void setStorage(@org.jetbrains.annotations.NotNull()
    ua.mycredit.core.LocalStorage p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.mycredit.mycredit.AppEvents getEvents() {
        return null;
    }
    
    public final void setEvents(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.AppEvents p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @android.support.annotation.CallSuper()
    protected void onDialogViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    protected void onDialogCreated(@org.jetbrains.annotations.NotNull()
    android.app.Dialog dialog) {
    }
    
    public BaseDialogFragment2() {
        super();
    }
}