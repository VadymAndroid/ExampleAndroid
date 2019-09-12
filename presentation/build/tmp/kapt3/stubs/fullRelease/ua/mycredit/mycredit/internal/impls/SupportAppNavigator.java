package ua.mycredit.mycredit.internal.impls;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J$\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H$J\b\u0010\u0012\u001a\u00020\bH\u0014J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0014J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0017H\u0014J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\nH\u0014J\u0018\u0010\u001a\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lua/mycredit/mycredit/internal/impls/SupportAppNavigator;", "Lru/terrakok/cicerone/android/SupportFragmentNavigator;", "activity", "Landroid/support/v4/app/FragmentActivity;", "containerId", "", "(Landroid/support/v4/app/FragmentActivity;I)V", "checkAndStartActivity", "", "screenKey", "", "activityIntent", "Landroid/content/Intent;", "createActivityIntent", "context", "Landroid/content/Context;", "data", "", "exit", "forward", "command", "Lru/terrakok/cicerone/commands/Forward;", "replace", "Lru/terrakok/cicerone/commands/Replace;", "showSystemMessage", "message", "unexistingActivity", "presentation_fullRelease"})
public abstract class SupportAppNavigator extends ru.terrakok.cicerone.android.SupportFragmentNavigator {
    private final android.support.v4.app.FragmentActivity activity = null;
    
    @java.lang.Override()
    protected void forward(@org.jetbrains.annotations.NotNull()
    ru.terrakok.cicerone.commands.Forward command) {
    }
    
    @java.lang.Override()
    protected void replace(@org.jetbrains.annotations.NotNull()
    ru.terrakok.cicerone.commands.Replace command) {
    }
    
    private final void checkAndStartActivity(java.lang.String screenKey, android.content.Intent activityIntent) {
    }
    
    protected final void unexistingActivity(@org.jetbrains.annotations.NotNull()
    java.lang.String screenKey, @org.jetbrains.annotations.NotNull()
    android.content.Intent activityIntent) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected abstract android.content.Intent createActivityIntent(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String screenKey, @org.jetbrains.annotations.Nullable()
    java.lang.Object data);
    
    @java.lang.Override()
    protected void showSystemMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    protected void exit() {
    }
    
    public SupportAppNavigator(@org.jetbrains.annotations.NotNull()
    android.support.v4.app.FragmentActivity activity, int containerId) {
        super(null, 0);
    }
}