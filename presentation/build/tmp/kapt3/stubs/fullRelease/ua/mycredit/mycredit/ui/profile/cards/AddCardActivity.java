package ua.mycredit.mycredit.ui.profile.cards;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0011\u001a\u00020\u0012J\u0012\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0018"}, d2 = {"Lua/mycredit/mycredit/ui/profile/cards/AddCardActivity;", "Lua/mycredit/mycredit/ui/bases/SelfBindingActivity;", "Lua/mycredit/mycredit/databinding/ActivityAddCardBinding;", "Lua/mycredit/mycredit/ui/profile/cards/NewCardBackFragment$Callback;", "()V", "layoutId", "", "getLayoutId", "()I", "navigator", "Lru/terrakok/cicerone/Navigator;", "getNavigator", "()Lru/terrakok/cicerone/Navigator;", "smsInputVisible", "Landroid/databinding/ObservableBoolean;", "getSmsInputVisible", "()Landroid/databinding/ObservableBoolean;", "handleNextClick", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSmsVerificationRequired", "NavigatorImpl", "presentation_fullRelease"})
public final class AddCardActivity extends ua.mycredit.mycredit.ui.bases.SelfBindingActivity<ua.mycredit.mycredit.databinding.ActivityAddCardBinding> implements ua.mycredit.mycredit.ui.profile.cards.NewCardBackFragment.Callback {
    @org.jetbrains.annotations.NotNull()
    private final ru.terrakok.cicerone.Navigator navigator = null;
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableBoolean smsInputVisible = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected ru.terrakok.cicerone.Navigator getNavigator() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableBoolean getSmsInputVisible() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onSmsVerificationRequired() {
    }
    
    public final void handleNextClick() {
    }
    
    public AddCardActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014J\u001c\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J,\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0014\u00a8\u0006\u0013"}, d2 = {"Lua/mycredit/mycredit/ui/profile/cards/AddCardActivity$NavigatorImpl;", "Lua/mycredit/mycredit/ui/bases/BaseActivity$BaseNavigator;", "Lua/mycredit/mycredit/ui/bases/BaseActivity;", "(Lua/mycredit/mycredit/ui/profile/cards/AddCardActivity;)V", "applyCommand", "", "command", "Lru/terrakok/cicerone/commands/Command;", "createFragment", "Landroid/support/v4/app/Fragment;", "screenKey", "", "data", "", "setupFragmentTransactionAnimation", "currentFragment", "nextFragment", "fragmentTransaction", "Landroid/support/v4/app/FragmentTransaction;", "presentation_fullRelease"})
    final class NavigatorImpl extends ua.mycredit.mycredit.ui.bases.BaseActivity.BaseNavigator {
        
        @java.lang.Override()
        protected void applyCommand(@org.jetbrains.annotations.NotNull()
        ru.terrakok.cicerone.commands.Command command) {
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        protected android.support.v4.app.Fragment createFragment(@org.jetbrains.annotations.NotNull()
        java.lang.String screenKey, @org.jetbrains.annotations.Nullable()
        java.lang.Object data) {
            return null;
        }
        
        @java.lang.Override()
        protected void setupFragmentTransactionAnimation(@org.jetbrains.annotations.NotNull()
        ru.terrakok.cicerone.commands.Command command, @org.jetbrains.annotations.Nullable()
        android.support.v4.app.Fragment currentFragment, @org.jetbrains.annotations.Nullable()
        android.support.v4.app.Fragment nextFragment, @org.jetbrains.annotations.NotNull()
        android.support.v4.app.FragmentTransaction fragmentTransaction) {
        }
        
        public NavigatorImpl() {
            super();
        }
    }
}