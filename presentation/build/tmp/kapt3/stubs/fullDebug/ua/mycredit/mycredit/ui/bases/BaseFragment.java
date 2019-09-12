package ua.mycredit.mycredit.ui.bases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 92\u00020\u00012\u00020\u00022\u00020\u0003:\u00019B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010-\u001a\u00020\u0018H\u0016J$\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u0001032\b\u00104\u001a\u0004\u0018\u000105H\u0014J$\u00106\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u0001032\b\u00104\u001a\u0004\u0018\u000105H\u0016J\b\u00107\u001a\u00020*H\u0016J\b\u00108\u001a\u00020*H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00188TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\f8\u0016X\u0097D\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u000eR\u001e\u0010#\u001a\u00020$8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(\u00a8\u0006:"}, d2 = {"Lua/mycredit/mycredit/ui/bases/BaseFragment;", "Ldagger/android/support/DaggerFragment;", "Lua/mycredit/mycredit/ui/BackButtonListener;", "Lua/mycredit/mycredit/AppEvents$Listener;", "()V", "events", "Lua/mycredit/mycredit/AppEvents;", "getEvents", "()Lua/mycredit/mycredit/AppEvents;", "setEvents", "(Lua/mycredit/mycredit/AppEvents;)V", "exitConfirmationMessage", "", "getExitConfirmationMessage", "()I", "layoutId", "getLayoutId", "router", "Lru/terrakok/cicerone/Router;", "getRouter", "()Lru/terrakok/cicerone/Router;", "setRouter", "(Lru/terrakok/cicerone/Router;)V", "scrollEnabled", "", "getScrollEnabled", "()Z", "storage", "Lua/mycredit/core/LocalStorage;", "getStorage", "()Lua/mycredit/core/LocalStorage;", "setStorage", "(Lua/mycredit/core/LocalStorage;)V", "toolbarTitle", "getToolbarTitle", "viewModelFactory", "Landroid/arch/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroid/arch/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroid/arch/lifecycle/ViewModelProvider$Factory;)V", "onAttach", "", "context", "Landroid/content/Context;", "onBackPressed", "onCreateContentView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "onDetach", "onResume", "Companion", "presentation_fullDebug"})
public abstract class BaseFragment extends dagger.android.support.DaggerFragment implements ua.mycredit.mycredit.ui.BackButtonListener, ua.mycredit.mycredit.AppEvents.Listener {
    @android.support.annotation.StringRes()
    private final int toolbarTitle = 0;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public ru.terrakok.cicerone.Router router;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public ua.mycredit.mycredit.AppEvents events;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public ua.mycredit.core.LocalStorage storage;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public android.arch.lifecycle.ViewModelProvider.Factory viewModelFactory;
    private final int exitConfirmationMessage = 0;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARG_SCROLL_ENABLED = "ARG_SCROLL_ENABLED";
    public static final ua.mycredit.mycredit.ui.bases.BaseFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @android.support.annotation.LayoutRes()
    public abstract int getLayoutId();
    
    public int getToolbarTitle() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.terrakok.cicerone.Router getRouter() {
        return null;
    }
    
    public final void setRouter(@org.jetbrains.annotations.NotNull()
    ru.terrakok.cicerone.Router p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.mycredit.mycredit.AppEvents getEvents() {
        return null;
    }
    
    public final void setEvents(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.AppEvents p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.mycredit.core.LocalStorage getStorage() {
        return null;
    }
    
    public final void setStorage(@org.jetbrains.annotations.NotNull()
    ua.mycredit.core.LocalStorage p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    protected boolean getScrollEnabled() {
        return false;
    }
    
    protected int getExitConfirmationMessage() {
        return 0;
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onDetach() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected android.view.View onCreateContentView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public boolean onBackPressed() {
        return false;
    }
    
    public BaseFragment() {
        super();
    }
    
    public void onCreditApplied() {
    }
    
    public void onAgreementAccepted() {
    }
    
    public void onCardVerified() {
    }
    
    public void onCardDeleted() {
    }
    
    public void onCardAdded() {
    }
    
    public void onBankingCompleted() {
    }
    
    public void onMainCardChanged() {
    }
    
    public void onCardListUpdated() {
    }
    
    public void onCardSelected(@org.jetbrains.annotations.NotNull()
    ua.mycredit.core.Card card) {
    }
    
    public void onCreditProlongationApplied() {
    }
    
    public void onProfileUpdated() {
    }
    
    public void onPromoCodeChanged() {
    }
    
    public void onStatusUpdated() {
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lua/mycredit/mycredit/ui/bases/BaseFragment$Companion;", "", "()V", "ARG_SCROLL_ENABLED", "", "presentation_fullDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}