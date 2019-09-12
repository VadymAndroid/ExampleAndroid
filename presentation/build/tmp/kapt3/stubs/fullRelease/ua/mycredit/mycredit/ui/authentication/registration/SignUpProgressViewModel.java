package ua.mycredit.mycredit.ui.authentication.registration;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0003\u000f\u0010\u0011B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bJ\b\u0010\f\u001a\u00020\rH\u0014J\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lua/mycredit/mycredit/ui/authentication/registration/SignUpProgressViewModel;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "()V", "minutesLeft", "Landroid/arch/lifecycle/MutableLiveData;", "", "progressDisposable", "Lio/reactivex/disposables/Disposable;", "progressSteps", "", "getMinutesLeft", "Landroid/arch/lifecycle/LiveData;", "onCleared", "", "setMinutesLeft", "CheckPhoneObserver", "Companion", "SMSReceiver", "presentation_fullRelease"})
public final class SignUpProgressViewModel extends ua.mycredit.mycredit.ui.bases.BaseViewModel {
    private android.arch.lifecycle.MutableLiveData<java.lang.Integer> minutesLeft;
    private long progressSteps;
    private io.reactivex.disposables.Disposable progressDisposable;
    public static final long NINE_MINUTES = 9L;
    public static final long ONE_MINUTE = 1L;
    public static final ua.mycredit.mycredit.ui.authentication.registration.SignUpProgressViewModel.Companion Companion = null;
    
    public final void setMinutesLeft(int minutesLeft) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<java.lang.Integer> getMinutesLeft() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @javax.inject.Inject()
    public SignUpProgressViewModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\f\u0012\u0004\u0012\u00020\u00020\u0001R\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lua/mycredit/mycredit/ui/authentication/registration/SignUpProgressViewModel$CheckPhoneObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$BaseSingleObserver;", "", "Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "(Lua/mycredit/mycredit/ui/authentication/registration/SignUpProgressViewModel;)V", "progressMode", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$ProgressMode$DIALOG;", "getProgressMode", "()Lua/mycredit/mycredit/ui/bases/BaseViewModel$ProgressMode$DIALOG;", "onSuccess", "", "t", "presentation_fullRelease"})
    final class CheckPhoneObserver extends ua.mycredit.mycredit.ui.bases.BaseViewModel.BaseSingleObserver<java.lang.Boolean> {
        @org.jetbrains.annotations.NotNull()
        private final ua.mycredit.mycredit.ui.bases.BaseViewModel.ProgressMode.DIALOG progressMode = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public ua.mycredit.mycredit.ui.bases.BaseViewModel.ProgressMode.DIALOG getProgressMode() {
            return null;
        }
        
        @java.lang.Override()
        public void onSuccess(boolean t) {
        }
        
        public CheckPhoneObserver() {
            super(0, false);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lua/mycredit/mycredit/ui/authentication/registration/SignUpProgressViewModel$SMSReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "presentation_fullRelease"})
    public static final class SMSReceiver extends android.content.BroadcastReceiver {
        
        @java.lang.Override()
        public void onReceive(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.content.Intent intent) {
        }
        
        public SMSReceiver() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lua/mycredit/mycredit/ui/authentication/registration/SignUpProgressViewModel$Companion;", "", "()V", "NINE_MINUTES", "", "ONE_MINUTE", "presentation_fullRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}