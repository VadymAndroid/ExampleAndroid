package ua.mycredit.mycredit.ui.bases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u00002\u00020\u00012\u00020\u0002:\fPQRSTUVWXYZ[B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010E\u001a\u00020FH\u0007J\u0006\u0010G\u001a\u00020+J\u0006\u0010H\u001a\u00020IJ\b\u0010J\u001a\u00020FH\u0015J\u0010\u0010K\u001a\u00020F2\u0006\u0010L\u001a\u00020IH\u0004J\n\u0010M\u001a\u00020N*\u00020OR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010$\u001a\u00020%8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020+X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020+X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010-R+\u00102\u001a\u0002012\u0006\u00100\u001a\u0002018F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001e\u00109\u001a\u00020:8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001e\u0010?\u001a\u00020@8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D\u00a8\u0006\\"}, d2 = {"Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "Landroid/arch/lifecycle/ViewModel;", "Lua/mycredit/mycredit/AppEvents$Listener;", "()V", "analytics", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "getAnalytics", "()Lcom/google/firebase/analytics/FirebaseAnalytics;", "setAnalytics", "(Lcom/google/firebase/analytics/FirebaseAnalytics;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "getDisposables", "()Lio/reactivex/disposables/CompositeDisposable;", "events", "Lua/mycredit/mycredit/AppEvents;", "getEvents", "()Lua/mycredit/mycredit/AppEvents;", "setEvents", "(Lua/mycredit/mycredit/AppEvents;)V", "loadings", "Landroid/databinding/ObservableInt;", "getLoadings", "()Landroid/databinding/ObservableInt;", "logger", "Lua/mycredit/core/internal/Logger;", "getLogger", "()Lua/mycredit/core/internal/Logger;", "setLogger", "(Lua/mycredit/core/internal/Logger;)V", "logouter", "Lua/mycredit/core/Logouter;", "getLogouter", "()Lua/mycredit/core/Logouter;", "setLogouter", "(Lua/mycredit/core/Logouter;)V", "messagesMapper", "Lua/mycredit/mycredit/ui/MessagesMapper;", "getMessagesMapper", "()Lua/mycredit/mycredit/ui/MessagesMapper;", "setMessagesMapper", "(Lua/mycredit/mycredit/ui/MessagesMapper;)V", "preLoaderCompatPadding", "", "getPreLoaderCompatPadding", "()Z", "preLoaderLogoEnabled", "getPreLoaderLogoEnabled", "<set-?>", "Lua/mycredit/core/Profile;", "profile", "getProfile", "()Lua/mycredit/core/Profile;", "setProfile", "(Lua/mycredit/core/Profile;)V", "profile$delegate", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$StorageProperty;", "router", "Lru/terrakok/cicerone/Router;", "getRouter", "()Lru/terrakok/cicerone/Router;", "setRouter", "(Lru/terrakok/cicerone/Router;)V", "storage", "Lua/mycredit/core/LocalStorage;", "getStorage", "()Lua/mycredit/core/LocalStorage;", "setStorage", "(Lua/mycredit/core/LocalStorage;)V", "bindToAppEvents", "", "getClosedLoanFromTheList", "getCountClosedLoanFromTheList", "", "onCleared", "showSystemMessage", "message", "asProgressMode", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$ProgressMode;", "Landroid/databinding/ObservableBoolean;", "BaseCompletableObserver", "BaseMaybeObserver", "BaseObserver", "BaseSingleObserver", "LazyRefreshable", "NoResponseFromServerCompletableObserver", "ObserverBehavior", "ProgressMode", "RefreshableObserver", "RefreshableProgressMode", "RefreshableSingleObserver", "StorageProperty", "presentation_fullRelease"})
public abstract class BaseViewModel extends android.arch.lifecycle.ViewModel implements ua.mycredit.mycredit.AppEvents.Listener {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public ru.terrakok.cicerone.Router router;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public ua.mycredit.mycredit.AppEvents events;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public ua.mycredit.core.Logouter logouter;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.google.firebase.analytics.FirebaseAnalytics analytics;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public ua.mycredit.mycredit.ui.MessagesMapper messagesMapper;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public ua.mycredit.core.LocalStorage storage;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public ua.mycredit.core.internal.Logger logger;
    @org.jetbrains.annotations.NotNull()
    private final ua.mycredit.mycredit.ui.bases.BaseViewModel.StorageProperty profile$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableInt loadings = null;
    private final boolean preLoaderCompatPadding = false;
    private final boolean preLoaderLogoEnabled = false;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    
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
    public final ua.mycredit.core.Logouter getLogouter() {
        return null;
    }
    
    public final void setLogouter(@org.jetbrains.annotations.NotNull()
    ua.mycredit.core.Logouter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.analytics.FirebaseAnalytics getAnalytics() {
        return null;
    }
    
    public final void setAnalytics(@org.jetbrains.annotations.NotNull()
    com.google.firebase.analytics.FirebaseAnalytics p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.mycredit.mycredit.ui.MessagesMapper getMessagesMapper() {
        return null;
    }
    
    public final void setMessagesMapper(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.ui.MessagesMapper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.mycredit.core.LocalStorage getStorage() {
        return null;
    }
    
    public final void setStorage(@org.jetbrains.annotations.NotNull()
    ua.mycredit.core.LocalStorage p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.mycredit.core.internal.Logger getLogger() {
        return null;
    }
    
    public final void setLogger(@org.jetbrains.annotations.NotNull()
    ua.mycredit.core.internal.Logger p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.mycredit.core.Profile getProfile() {
        return null;
    }
    
    public final void setProfile(@org.jetbrains.annotations.NotNull()
    ua.mycredit.core.Profile p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableInt getLoadings() {
        return null;
    }
    
    public boolean getPreLoaderCompatPadding() {
        return false;
    }
    
    public boolean getPreLoaderLogoEnabled() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final io.reactivex.disposables.CompositeDisposable getDisposables() {
        return null;
    }
    
    @javax.inject.Inject()
    public final void bindToAppEvents() {
    }
    
    @android.support.annotation.CallSuper()
    @java.lang.Override()
    protected void onCleared() {
    }
    
    protected final void showSystemMessage(int message) {
    }
    
    public final boolean getClosedLoanFromTheList() {
        return false;
    }
    
    public final int getCountClosedLoanFromTheList() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.mycredit.mycredit.ui.bases.BaseViewModel.ProgressMode asProgressMode(@org.jetbrains.annotations.NotNull()
    android.databinding.ObservableBoolean $receiver) {
        return null;
    }
    
    public BaseViewModel() {
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
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0084\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B1\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\tJ\"\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00022\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\rH\u0086\u0002\u00a2\u0006\u0002\u0010\u000eJ*\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u0010\u001a\u00028\u0000H\u0086\u0002\u00a2\u0006\u0002\u0010\u0011R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lua/mycredit/mycredit/ui/bases/BaseViewModel$StorageProperty;", "T", "", "property", "Lkotlin/reflect/KMutableProperty1;", "Lua/mycredit/core/LocalStorage;", "changeCallback", "Lkotlin/Function1;", "", "(Lua/mycredit/mycredit/ui/bases/BaseViewModel;Lkotlin/reflect/KMutableProperty1;Lkotlin/jvm/functions/Function1;)V", "getValue", "thisRef", "p", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "setValue", "value", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "presentation_fullRelease"})
    public final class StorageProperty<T extends java.lang.Object> {
        private final kotlin.reflect.KMutableProperty1<ua.mycredit.core.LocalStorage, T> property = null;
        private final kotlin.jvm.functions.Function1<T, kotlin.Unit> changeCallback = null;
        
        public final T getValue(@org.jetbrains.annotations.NotNull()
        java.lang.Object thisRef, @org.jetbrains.annotations.NotNull()
        kotlin.reflect.KProperty<?> p) {
            return null;
        }
        
        public final void setValue(@org.jetbrains.annotations.NotNull()
        java.lang.Object thisRef, @org.jetbrains.annotations.NotNull()
        kotlin.reflect.KProperty<?> p, T value) {
        }
        
        public StorageProperty(@org.jetbrains.annotations.NotNull()
        kotlin.reflect.KMutableProperty1<ua.mycredit.core.LocalStorage, T> property, @org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function1<? super T, kotlin.Unit> changeCallback) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001:\u0003\f\r\u000eB7\u0012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006\u00a2\u0006\u0002\u0010\bR\"\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\"\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lua/mycredit/mycredit/ui/bases/BaseViewModel$ProgressMode;", "", "processStart", "Lkotlin/Function1;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "", "Lkotlin/ExtensionFunctionType;", "processTerminate", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getProcessStart", "()Lkotlin/jvm/functions/Function1;", "getProcessTerminate", "DIALOG", "EMPTY", "PRE_LOADER", "presentation_fullRelease"})
    public static class ProgressMode {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function1<ua.mycredit.mycredit.ui.bases.BaseViewModel, kotlin.Unit> processStart = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function1<ua.mycredit.mycredit.ui.bases.BaseViewModel, kotlin.Unit> processTerminate = null;
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<ua.mycredit.mycredit.ui.bases.BaseViewModel, kotlin.Unit> getProcessStart() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<ua.mycredit.mycredit.ui.bases.BaseViewModel, kotlin.Unit> getProcessTerminate() {
            return null;
        }
        
        public ProgressMode(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super ua.mycredit.mycredit.ui.bases.BaseViewModel, kotlin.Unit> processStart, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super ua.mycredit.mycredit.ui.bases.BaseViewModel, kotlin.Unit> processTerminate) {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lua/mycredit/mycredit/ui/bases/BaseViewModel$ProgressMode$PRE_LOADER;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$ProgressMode;", "()V", "presentation_fullRelease"})
        public static final class PRE_LOADER extends ua.mycredit.mycredit.ui.bases.BaseViewModel.ProgressMode {
            public static final ua.mycredit.mycredit.ui.bases.BaseViewModel.ProgressMode.PRE_LOADER INSTANCE = null;
            
            private PRE_LOADER() {
                super(null, null);
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lua/mycredit/mycredit/ui/bases/BaseViewModel$ProgressMode$DIALOG;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$ProgressMode;", "()V", "presentation_fullRelease"})
        public static final class DIALOG extends ua.mycredit.mycredit.ui.bases.BaseViewModel.ProgressMode {
            public static final ua.mycredit.mycredit.ui.bases.BaseViewModel.ProgressMode.DIALOG INSTANCE = null;
            
            private DIALOG() {
                super(null, null);
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lua/mycredit/mycredit/ui/bases/BaseViewModel$ProgressMode$EMPTY;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$ProgressMode;", "()V", "presentation_fullRelease"})
        public static final class EMPTY extends ua.mycredit.mycredit.ui.bases.BaseViewModel.ProgressMode {
            public static final ua.mycredit.mycredit.ui.bases.BaseViewModel.ProgressMode.EMPTY INSTANCE = null;
            
            private EMPTY() {
                super(null, null);
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bb\u0018\u00002\u00020\u0001J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\f\u0010\u0016\u001a\u00020\u0017*\u00020\u0000H\u0016J\u0014\u0010\u0018\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\f\u0010\u0019\u001a\u00020\u0017*\u00020\u0000H\u0016J\f\u0010\u001a\u001a\u00020\u0017*\u00020\u0000H\u0016J\u0014\u0010\u001b\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001c"}, d2 = {"Lua/mycredit/mycredit/ui/bases/BaseViewModel$ObserverBehavior;", "Lio/reactivex/disposables/Disposable;", "exitAfterCompletion", "", "getExitAfterCompletion", "()Z", "messageAfterCompletion", "", "getMessageAfterCompletion", "()I", "owner", "Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "getOwner", "()Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "progressMode", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$ProgressMode;", "getProgressMode", "()Lua/mycredit/mycredit/ui/bases/BaseViewModel$ProgressMode;", "onHandleError", "e", "", "onMapError", "processCompletion", "", "processError", "processStart", "processTerminate", "showAlertIfNotHandled", "presentation_fullRelease"})
    static abstract interface ObserverBehavior extends io.reactivex.disposables.Disposable {
        
        @org.jetbrains.annotations.NotNull()
        public abstract ua.mycredit.mycredit.ui.bases.BaseViewModel.ProgressMode getProgressMode();
        
        public abstract int getMessageAfterCompletion();
        
        public abstract boolean getExitAfterCompletion();
        
        @org.jetbrains.annotations.NotNull()
        public abstract ua.mycredit.mycredit.ui.bases.BaseViewModel getOwner();
        
        public abstract int onMapError(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable e);
        
        /**
         * * if true alert will not be shown
         */
        public abstract boolean onHandleError(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable e);
        
        public abstract void processStart(@org.jetbrains.annotations.NotNull()
        ua.mycredit.mycredit.ui.bases.BaseViewModel.ObserverBehavior $receiver);
        
        public abstract void processError(@org.jetbrains.annotations.NotNull()
        ua.mycredit.mycredit.ui.bases.BaseViewModel.ObserverBehavior $receiver, @org.jetbrains.annotations.NotNull()
        java.lang.Throwable e);
        
        public abstract void processCompletion(@org.jetbrains.annotations.NotNull()
        ua.mycredit.mycredit.ui.bases.BaseViewModel.ObserverBehavior $receiver);
        
        public abstract void processTerminate(@org.jetbrains.annotations.NotNull()
        ua.mycredit.mycredit.ui.bases.BaseViewModel.ObserverBehavior $receiver);
        
        public abstract void showAlertIfNotHandled(@org.jetbrains.annotations.NotNull()
        ua.mycredit.mycredit.ui.bases.BaseViewModel.ObserverBehavior $receiver, @org.jetbrains.annotations.NotNull()
        java.lang.Throwable e);
        
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 3)
        public static final class DefaultImpls {
            
            @org.jetbrains.annotations.NotNull()
            public static ua.mycredit.mycredit.ui.bases.BaseViewModel.ProgressMode getProgressMode(ua.mycredit.mycredit.ui.bases.BaseViewModel.ObserverBehavior $this) {
                return null;
            }
            
            public static int getMessageAfterCompletion(ua.mycredit.mycredit.ui.bases.BaseViewModel.ObserverBehavior $this) {
                return 0;
            }
            
            public static boolean getExitAfterCompletion(ua.mycredit.mycredit.ui.bases.BaseViewModel.ObserverBehavior $this) {
                return false;
            }
            
            public static int onMapError(ua.mycredit.mycredit.ui.bases.BaseViewModel.ObserverBehavior $this, @org.jetbrains.annotations.NotNull()
            java.lang.Throwable e) {
                return 0;
            }
            
            /**
             * * if true alert will not be shown
             */
            public static boolean onHandleError(ua.mycredit.mycredit.ui.bases.BaseViewModel.ObserverBehavior $this, @org.jetbrains.annotations.NotNull()
            java.lang.Throwable e) {
                return false;
            }
            
            public static void processStart(ua.mycredit.mycredit.ui.bases.BaseViewModel.ObserverBehavior $this, @org.jetbrains.annotations.NotNull()
            ua.mycredit.mycredit.ui.bases.BaseViewModel.ObserverBehavior $receiver) {
            }
            
            public static void processError(ua.mycredit.mycredit.ui.bases.BaseViewModel.ObserverBehavior $this, @org.jetbrains.annotations.NotNull()
            ua.mycredit.mycredit.ui.bases.BaseViewModel.ObserverBehavior $receiver, @org.jetbrains.annotations.NotNull()
            java.lang.Throwable e) {
            }
            
            public static void processCompletion(ua.mycredit.mycredit.ui.bases.BaseViewModel.ObserverBehavior $this, @org.jetbrains.annotations.NotNull()
            ua.mycredit.mycredit.ui.bases.BaseViewModel.ObserverBehavior $receiver) {
            }
            
            public static void processTerminate(ua.mycredit.mycredit.ui.bases.BaseViewModel.ObserverBehavior $this, @org.jetbrains.annotations.NotNull()
            ua.mycredit.mycredit.ui.bases.BaseViewModel.ObserverBehavior $receiver) {
            }
            
            public static void showAlertIfNotHandled(ua.mycredit.mycredit.ui.bases.BaseViewModel.ObserverBehavior $this, @org.jetbrains.annotations.NotNull()
            ua.mycredit.mycredit.ui.bases.BaseViewModel.ObserverBehavior $receiver, @org.jetbrains.annotations.NotNull()
            java.lang.Throwable e) {
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u00a4\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\u0019\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0011\u001a\u00020\u0012H\u0017J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0017J\b\u0010\u0016\u001a\u00020\u0012H\u0015R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0017"}, d2 = {"Lua/mycredit/mycredit/ui/bases/BaseViewModel$BaseObserver;", "T", "Lio/reactivex/observers/DisposableObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$ObserverBehavior;", "messageAfterCompletion", "", "exitAfterCompletion", "", "(Lua/mycredit/mycredit/ui/bases/BaseViewModel;IZ)V", "getExitAfterCompletion", "()Z", "getMessageAfterCompletion", "()I", "owner", "Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "getOwner", "()Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "onComplete", "", "onError", "e", "", "onStart", "presentation_fullRelease"})
    public abstract class BaseObserver<T extends java.lang.Object> extends io.reactivex.observers.DisposableObserver<T> implements ua.mycredit.mycredit.ui.bases.BaseViewModel.ObserverBehavior {
        private final int messageAfterCompletion = 0;
        private final boolean exitAfterCompletion = false;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final ua.mycredit.mycredit.ui.bases.BaseViewModel getOwner() {
            return null;
        }
        
        @android.support.annotation.CallSuper()
        @java.lang.Override()
        protected void onStart() {
        }
        
        @android.support.annotation.CallSuper()
        @java.lang.Override()
        public void onComplete() {
        }
        
        @android.support.annotation.CallSuper()
        @java.lang.Override()
        public void onError(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable e) {
        }
        
        @java.lang.Override()
        public int getMessageAfterCompletion() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean getExitAfterCompletion() {
            return false;
        }
        
        public BaseObserver(int messageAfterCompletion, boolean exitAfterCompletion) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public ua.mycredit.mycredit.ui.bases.BaseViewModel.ProgressMode getProgressMode() {
            return null;
        }
        
        public int onMapError(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable e) {
            return 0;
        }
        
        /**
         * * if true alert will not be shown
         */
        public boolean onHandleError(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable e) {
            return false;
        }
        
        public void processStart(@org.jetbrains.annotations.NotNull()
        ua.mycredit.mycredit.ui.bases.BaseViewModel.ObserverBehavior $receiver) {
        }
        
        public void processError(@org.jetbrains.annotations.NotNull()
        ua.mycredit.mycredit.ui.bases.BaseViewModel.ObserverBehavior $receiver, @org.jetbrains.annotations.NotNull()
        java.lang.Throwable e) {
        }
        
        public void processCompletion(@org.jetbrains.annotations.NotNull()
        ua.mycredit.mycredit.ui.bases.BaseViewModel.ObserverBehavior $receiver) {
        }
        
        public void processTerminate(@org.jetbrains.annotations.NotNull()
        ua.mycredit.mycredit.ui.bases.BaseViewModel.ObserverBehavior $receiver) {
        }
        
        public void showAlertIfNotHandled(@org.jetbrains.annotations.NotNull()
        ua.mycredit.mycredit.ui.bases.BaseViewModel.ObserverBehavior $receiver, @org.jetbrains.annotations.NotNull()
        java.lang.Throwable e) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0094\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\u0019\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0017J\b\u0010\u0015\u001a\u00020\u0012H\u0015J\u0015\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00028\u0000H\u0017\u00a2\u0006\u0002\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0019"}, d2 = {"Lua/mycredit/mycredit/ui/bases/BaseViewModel$BaseSingleObserver;", "T", "Lio/reactivex/observers/DisposableSingleObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$ObserverBehavior;", "messageAfterCompletion", "", "exitAfterCompletion", "", "(Lua/mycredit/mycredit/ui/bases/BaseViewModel;IZ)V", "getExitAfterCompletion", "()Z", "getMessageAfterCompletion", "()I", "owner", "Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "getOwner", "()Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "onError", "", "e", "", "onStart", "onSuccess", "t", "(Ljava/lang/Object;)V", "presentation_fullRelease"})
    public class BaseSingleObserver<T extends java.lang.Object> extends io.reactivex.observers.DisposableSingleObserver<T> implements ua.mycredit.mycredit.ui.bases.BaseViewModel.ObserverBehavior {
        private final int messageAfterCompletion = 0;
        private final boolean exitAfterCompletion = false;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final ua.mycredit.mycredit.ui.bases.BaseViewModel getOwner() {
            return null;
        }
        
        @android.support.annotation.CallSuper()
        @java.lang.Override()
        protected void onStart() {
        }
        
        @android.support.annotation.CallSuper()
        @java.lang.Override()
        public void onSuccess(T t) {
        }
        
        @android.support.annotation.CallSuper()
        @java.lang.Override()
        public void onError(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable e) {
        }
        
        @java.lang.Override()
        public int getMessageAfterCompletion() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean getExitAfterCompletion() {
            return false;
        }
        
        public BaseSingleObserver(int messageAfterCompletion, boolean exitAfterCompletion) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public ua.mycredit.mycredit.ui.bases.BaseViewModel.ProgressMode getProgressMode() {
            return null;
        }
        
        public int onMapError(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable e) {
            return 0;
        }
        
        /**
         * * if true alert will not be shown
         */
        public boolean onHandleError(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable e) {
            return false;
        }
        
        public void processStart(@org.jetbrains.annotations.NotNull()
        ua.mycredit.mycredit.ui.bases.BaseViewModel.ObserverBehavior $receiver) {
        }
        
        public void processError(@org.jetbrains.annotations.NotNull()
        ua.mycredit.mycredit.ui.bases.BaseViewModel.ObserverBehavior $receiver, @org.jetbrains.annotations.NotNull()
        java.lang.Throwable e) {
        }
        
        public void processCompletion(@org.jetbrains.annotations.NotNull()
        ua.mycredit.mycredit.ui.bases.BaseViewModel.ObserverBehavior $receiver) {
        }
        
        public void processTerminate(@org.jetbrains.annotations.NotNull()
        ua.mycredit.mycredit.ui.bases.BaseViewModel.ObserverBehavior $receiver) {
        }
        
        public void showAlertIfNotHandled(@org.jetbrains.annotations.NotNull()
        ua.mycredit.mycredit.ui.bases.BaseViewModel.ObserverBehavior $receiver, @org.jetbrains.annotations.NotNull()
        java.lang.Throwable e) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0094\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\u0019\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0011\u001a\u00020\u0012H\u0017J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0017J\b\u0010\u0016\u001a\u00020\u0012H\u0015J\u0015\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00028\u0000H\u0017\u00a2\u0006\u0002\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001a"}, d2 = {"Lua/mycredit/mycredit/ui/bases/BaseViewModel$BaseMaybeObserver;", "T", "Lio/reactivex/observers/DisposableMaybeObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$ObserverBehavior;", "messageAfterCompletion", "", "exitAfterCompletion", "", "(Lua/mycredit/mycredit/ui/bases/BaseViewModel;IZ)V", "getExitAfterCompletion", "()Z", "getMessageAfterCompletion", "()I", "owner", "Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "getOwner", "()Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "onComplete", "", "onError", "e", "", "onStart", "onSuccess", "t", "(Ljava/lang/Object;)V", "presentation_fullRelease"})
    public class BaseMaybeObserver<T extends java.lang.Object> extends io.reactivex.observers.DisposableMaybeObserver<T> implements ua.mycredit.mycredit.ui.bases.BaseViewModel.ObserverBehavior {
        private final int messageAfterCompletion = 0;
        private final boolean exitAfterCompletion = false;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final ua.mycredit.mycredit.ui.bases.BaseViewModel getOwner() {
            return null;
        }
        
        @android.support.annotation.CallSuper()
        @java.lang.Override()
        protected void onStart() {
        }
        
        @android.support.annotation.CallSuper()
        @java.lang.Override()
        public void onSuccess(T t) {
        }
        
        @android.support.annotation.CallSuper()
        @java.lang.Override()
        public void onComplete() {
        }
        
        @android.support.annotation.CallSuper()
        @java.lang.Override()
        public void onError(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable e) {
        }
        
        @java.lang.Override()
        public int getMessageAfterCompletion() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean getExitAfterCompletion() {
            return false;
        }
        
        public BaseMaybeObserver(int messageAfterCompletion, boolean exitAfterCompletion) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public ua.mycredit.mycredit.ui.bases.BaseViewModel.ProgressMode getProgressMode() {
            return null;
        }
        
        public int onMapError(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable e) {
            return 0;
        }
        
        /**
         * * if true alert will not be shown
         */
        public boolean onHandleError(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable e) {
            return false;
        }
        
        public void processStart(@org.jetbrains.annotations.NotNull()
        ua.mycredit.mycredit.ui.bases.BaseViewModel.ObserverBehavior $receiver) {
        }
        
        public void processError(@org.jetbrains.annotations.NotNull()
        ua.mycredit.mycredit.ui.bases.BaseViewModel.ObserverBehavior $receiver, @org.jetbrains.annotations.NotNull()
        java.lang.Throwable e) {
        }
        
        public void processCompletion(@org.jetbrains.annotations.NotNull()
        ua.mycredit.mycredit.ui.bases.BaseViewModel.ObserverBehavior $receiver) {
        }
        
        public void processTerminate(@org.jetbrains.annotations.NotNull()
        ua.mycredit.mycredit.ui.bases.BaseViewModel.ObserverBehavior $receiver) {
        }
        
        public void showAlertIfNotHandled(@org.jetbrains.annotations.NotNull()
        ua.mycredit.mycredit.ui.bases.BaseViewModel.ObserverBehavior $receiver, @org.jetbrains.annotations.NotNull()
        java.lang.Throwable e) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0094\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0017J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0017J\b\u0010\u0015\u001a\u00020\u0011H\u0015R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0016"}, d2 = {"Lua/mycredit/mycredit/ui/bases/BaseViewModel$BaseCompletableObserver;", "Lio/reactivex/observers/DisposableCompletableObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$ObserverBehavior;", "messageAfterCompletion", "", "exitAfterCompletion", "", "(Lua/mycredit/mycredit/ui/bases/BaseViewModel;IZ)V", "getExitAfterCompletion", "()Z", "getMessageAfterCompletion", "()I", "owner", "Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "getOwner", "()Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "onComplete", "", "onError", "e", "", "onStart", "presentation_fullRelease"})
    public class BaseCompletableObserver extends io.reactivex.observers.DisposableCompletableObserver implements ua.mycredit.mycredit.ui.bases.BaseViewModel.ObserverBehavior {
        private final int messageAfterCompletion = 0;
        private final boolean exitAfterCompletion = false;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final ua.mycredit.mycredit.ui.bases.BaseViewModel getOwner() {
            return null;
        }
        
        @android.support.annotation.CallSuper()
        @java.lang.Override()
        protected void onStart() {
        }
        
        @android.support.annotation.CallSuper()
        @java.lang.Override()
        public void onComplete() {
        }
        
        @android.support.annotation.CallSuper()
        @java.lang.Override()
        public void onError(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable e) {
        }
        
        @java.lang.Override()
        public int getMessageAfterCompletion() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean getExitAfterCompletion() {
            return false;
        }
        
        public BaseCompletableObserver(int messageAfterCompletion, boolean exitAfterCompletion) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public ua.mycredit.mycredit.ui.bases.BaseViewModel.ProgressMode getProgressMode() {
            return null;
        }
        
        public int onMapError(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable e) {
            return 0;
        }
        
        /**
         * * if true alert will not be shown
         */
        public boolean onHandleError(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable e) {
            return false;
        }
        
        public void processStart(@org.jetbrains.annotations.NotNull()
        ua.mycredit.mycredit.ui.bases.BaseViewModel.ObserverBehavior $receiver) {
        }
        
        public void processError(@org.jetbrains.annotations.NotNull()
        ua.mycredit.mycredit.ui.bases.BaseViewModel.ObserverBehavior $receiver, @org.jetbrains.annotations.NotNull()
        java.lang.Throwable e) {
        }
        
        public void processCompletion(@org.jetbrains.annotations.NotNull()
        ua.mycredit.mycredit.ui.bases.BaseViewModel.ObserverBehavior $receiver) {
        }
        
        public void processTerminate(@org.jetbrains.annotations.NotNull()
        ua.mycredit.mycredit.ui.bases.BaseViewModel.ObserverBehavior $receiver) {
        }
        
        public void showAlertIfNotHandled(@org.jetbrains.annotations.NotNull()
        ua.mycredit.mycredit.ui.bases.BaseViewModel.ObserverBehavior $receiver, @org.jetbrains.annotations.NotNull()
        java.lang.Throwable e) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0094\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\b\u0010\b\u001a\u00020\u0004H\u0015\u00a8\u0006\t"}, d2 = {"Lua/mycredit/mycredit/ui/bases/BaseViewModel$NoResponseFromServerCompletableObserver;", "Lio/reactivex/observers/DisposableCompletableObserver;", "(Lua/mycredit/mycredit/ui/bases/BaseViewModel;)V", "onComplete", "", "onError", "e", "", "onStart", "presentation_fullRelease"})
    public class NoResponseFromServerCompletableObserver extends io.reactivex.observers.DisposableCompletableObserver {
        
        @android.support.annotation.CallSuper()
        @java.lang.Override()
        protected void onStart() {
        }
        
        @android.support.annotation.CallSuper()
        @java.lang.Override()
        public void onComplete() {
        }
        
        @android.support.annotation.CallSuper()
        @java.lang.Override()
        public void onError(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable e) {
        }
        
        public NoResponseFromServerCompletableObserver() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u00a4\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0011B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH$J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH$J\b\u0010\r\u001a\u00020\u0007H\u0004J\u0015\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u0000H$\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lua/mycredit/mycredit/ui/bases/BaseViewModel$LazyRefreshable;", "R", "Lua/mycredit/mycredit/ui/bases/action/Refreshable;", "(Lua/mycredit/mycredit/ui/bases/BaseViewModel;)V", "criteria", "Lua/mycredit/core/BaseUseCase$ReloadCriteria;", "doExecute", "", "o", "Lio/reactivex/observers/DisposableObserver;", "onError", "e", "", "onRefresh", "onValue", "value", "(Ljava/lang/Object;)V", "ObserverImpl", "presentation_fullRelease"})
    public abstract class LazyRefreshable<R extends java.lang.Object> extends ua.mycredit.mycredit.ui.bases.action.Refreshable {
        private ua.mycredit.core.BaseUseCase.ReloadCriteria criteria;
        
        protected abstract void doExecute(@org.jetbrains.annotations.NotNull()
        ua.mycredit.core.BaseUseCase.ReloadCriteria criteria, @org.jetbrains.annotations.NotNull()
        io.reactivex.observers.DisposableObserver<R> o);
        
        protected abstract void onValue(R value);
        
        protected abstract void onError(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable e);
        
        @java.lang.Override()
        protected final void onRefresh() {
        }
        
        public LazyRefreshable() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\f\u0012\u0004\u0012\u00028\u00000\u0001R\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0015\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lua/mycredit/mycredit/ui/bases/BaseViewModel$LazyRefreshable$ObserverImpl;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$RefreshableObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "(Lua/mycredit/mycredit/ui/bases/BaseViewModel$LazyRefreshable;)V", "onError", "", "e", "", "onNext", "t", "(Ljava/lang/Object;)V", "presentation_fullRelease"})
        final class ObserverImpl extends ua.mycredit.mycredit.ui.bases.BaseViewModel.RefreshableObserver<R> {
            
            @java.lang.Override()
            public void onNext(R t) {
            }
            
            @java.lang.Override()
            public void onError(@org.jetbrains.annotations.NotNull()
            java.lang.Throwable e) {
            }
            
            public ObserverImpl() {
                super(null);
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lua/mycredit/mycredit/ui/bases/BaseViewModel$RefreshableProgressMode;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$ProgressMode;", "refreshable", "Lua/mycredit/mycredit/ui/bases/action/Refreshable;", "(Lua/mycredit/mycredit/ui/bases/action/Refreshable;)V", "presentation_fullRelease"})
    public static final class RefreshableProgressMode extends ua.mycredit.mycredit.ui.bases.BaseViewModel.ProgressMode {
        
        public RefreshableProgressMode(@org.jetbrains.annotations.NotNull()
        ua.mycredit.mycredit.ui.bases.action.Refreshable refreshable) {
            super(null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00a4\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\f\u0012\u0004\u0012\u0002H\u00010\u0002R\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lua/mycredit/mycredit/ui/bases/BaseViewModel$RefreshableObserver;", "R", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$BaseObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "refreshable", "Lua/mycredit/mycredit/ui/bases/action/Refreshable;", "(Lua/mycredit/mycredit/ui/bases/BaseViewModel;Lua/mycredit/mycredit/ui/bases/action/Refreshable;)V", "progressMode", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$RefreshableProgressMode;", "getProgressMode", "()Lua/mycredit/mycredit/ui/bases/BaseViewModel$RefreshableProgressMode;", "presentation_fullRelease"})
    public abstract class RefreshableObserver<R extends java.lang.Object> extends ua.mycredit.mycredit.ui.bases.BaseViewModel.BaseObserver<R> {
        @org.jetbrains.annotations.NotNull()
        private final ua.mycredit.mycredit.ui.bases.BaseViewModel.RefreshableProgressMode progressMode = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public ua.mycredit.mycredit.ui.bases.BaseViewModel.RefreshableProgressMode getProgressMode() {
            return null;
        }
        
        public RefreshableObserver(@org.jetbrains.annotations.NotNull()
        ua.mycredit.mycredit.ui.bases.action.Refreshable refreshable) {
            super(0, false);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00a4\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\f\u0012\u0004\u0012\u0002H\u00010\u0002R\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lua/mycredit/mycredit/ui/bases/BaseViewModel$RefreshableSingleObserver;", "R", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$BaseSingleObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "refreshable", "Lua/mycredit/mycredit/ui/bases/action/Refreshable;", "(Lua/mycredit/mycredit/ui/bases/BaseViewModel;Lua/mycredit/mycredit/ui/bases/action/Refreshable;)V", "progressMode", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$RefreshableProgressMode;", "getProgressMode", "()Lua/mycredit/mycredit/ui/bases/BaseViewModel$RefreshableProgressMode;", "presentation_fullRelease"})
    public abstract class RefreshableSingleObserver<R extends java.lang.Object> extends ua.mycredit.mycredit.ui.bases.BaseViewModel.BaseSingleObserver<R> {
        @org.jetbrains.annotations.NotNull()
        private final ua.mycredit.mycredit.ui.bases.BaseViewModel.RefreshableProgressMode progressMode = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public ua.mycredit.mycredit.ui.bases.BaseViewModel.RefreshableProgressMode getProgressMode() {
            return null;
        }
        
        public RefreshableSingleObserver(@org.jetbrains.annotations.NotNull()
        ua.mycredit.mycredit.ui.bases.action.Refreshable refreshable) {
            super(0, false);
        }
    }
}