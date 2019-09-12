package ua.mycredit.mycredit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u001a\u0010\t\u001a\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u000bJ\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lua/mycredit/mycredit/AppEvents;", "", "()V", "listeners", "", "Lua/mycredit/mycredit/AppEvents$Listener;", "addListener", "", "listener", "notifyListeners", "notification", "Lkotlin/Function1;", "removeListener", "Listener", "presentation_fullRelease"})
@javax.inject.Singleton()
public final class AppEvents {
    private final java.util.List<ua.mycredit.mycredit.AppEvents.Listener> listeners = null;
    
    public final void addListener(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.AppEvents.Listener listener) {
    }
    
    public final void removeListener(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.AppEvents.Listener listener) {
    }
    
    public final void notifyListeners(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ua.mycredit.mycredit.AppEvents.Listener, kotlin.Unit> notification) {
    }
    
    @javax.inject.Inject()
    public AppEvents() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0016\u00a8\u0006\u0012"}, d2 = {"Lua/mycredit/mycredit/AppEvents$Listener;", "", "onAgreementAccepted", "", "onBankingCompleted", "onCardAdded", "onCardDeleted", "onCardListUpdated", "onCardSelected", "card", "Lua/mycredit/core/Card;", "onCardVerified", "onCreditApplied", "onCreditProlongationApplied", "onMainCardChanged", "onProfileUpdated", "onPromoCodeChanged", "onStatusUpdated", "presentation_fullRelease"})
    public static abstract interface Listener {
        
        public abstract void onCreditApplied();
        
        public abstract void onAgreementAccepted();
        
        public abstract void onCardVerified();
        
        public abstract void onCardDeleted();
        
        public abstract void onCardAdded();
        
        public abstract void onBankingCompleted();
        
        public abstract void onMainCardChanged();
        
        public abstract void onCardListUpdated();
        
        public abstract void onCardSelected(@org.jetbrains.annotations.NotNull()
        ua.mycredit.core.Card card);
        
        public abstract void onCreditProlongationApplied();
        
        public abstract void onProfileUpdated();
        
        public abstract void onPromoCodeChanged();
        
        public abstract void onStatusUpdated();
        
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 3)
        public static final class DefaultImpls {
            
            public static void onCreditApplied(ua.mycredit.mycredit.AppEvents.Listener $this) {
            }
            
            public static void onAgreementAccepted(ua.mycredit.mycredit.AppEvents.Listener $this) {
            }
            
            public static void onCardVerified(ua.mycredit.mycredit.AppEvents.Listener $this) {
            }
            
            public static void onCardDeleted(ua.mycredit.mycredit.AppEvents.Listener $this) {
            }
            
            public static void onCardAdded(ua.mycredit.mycredit.AppEvents.Listener $this) {
            }
            
            public static void onBankingCompleted(ua.mycredit.mycredit.AppEvents.Listener $this) {
            }
            
            public static void onMainCardChanged(ua.mycredit.mycredit.AppEvents.Listener $this) {
            }
            
            public static void onCardListUpdated(ua.mycredit.mycredit.AppEvents.Listener $this) {
            }
            
            public static void onCardSelected(ua.mycredit.mycredit.AppEvents.Listener $this, @org.jetbrains.annotations.NotNull()
            ua.mycredit.core.Card card) {
            }
            
            public static void onCreditProlongationApplied(ua.mycredit.mycredit.AppEvents.Listener $this) {
            }
            
            public static void onProfileUpdated(ua.mycredit.mycredit.AppEvents.Listener $this) {
            }
            
            public static void onPromoCodeChanged(ua.mycredit.mycredit.AppEvents.Listener $this) {
            }
            
            public static void onStatusUpdated(ua.mycredit.mycredit.AppEvents.Listener $this) {
            }
        }
    }
}