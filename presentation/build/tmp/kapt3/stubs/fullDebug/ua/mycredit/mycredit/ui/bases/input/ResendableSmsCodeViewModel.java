package ua.mycredit.mycredit.ui.bases.input;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b&\u0018\u0000 \u00162\u00020\u0001:\u0003\u0016\u0017\u0018B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H&J\b\u0010\u0014\u001a\u00020\u0012H\u0004J\b\u0010\u0015\u001a\u00020\u0012H\u0007R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0019"}, d2 = {"Lua/mycredit/mycredit/ui/bases/input/ResendableSmsCodeViewModel;", "Lua/mycredit/mycredit/ui/bases/input/BaseSmsCodeViewModel;", "()V", "countDown", "Lua/mycredit/core/interactors/CountDownUseCase;", "getCountDown", "()Lua/mycredit/core/interactors/CountDownUseCase;", "setCountDown", "(Lua/mycredit/core/interactors/CountDownUseCase;)V", "resendAvailableAfter", "Landroid/databinding/ObservableLong;", "getResendAvailableAfter", "()Landroid/databinding/ObservableLong;", "timerAutoStartEnabled", "", "getTimerAutoStartEnabled", "()Z", "enterAnotherNumber", "", "requestCode", "startTimer", "startTimerIfEnabled", "Companion", "CountDownObserver", "RequestSmsObserver", "presentation_fullDebug"})
public abstract class ResendableSmsCodeViewModel extends ua.mycredit.mycredit.ui.bases.input.BaseSmsCodeViewModel {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public ua.mycredit.core.interactors.CountDownUseCase countDown;
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableLong resendAvailableAfter = null;
    private final boolean timerAutoStartEnabled = true;
    public static final long RESEND_DELAY_SECONDS = 30L;
    public static final ua.mycredit.mycredit.ui.bases.input.ResendableSmsCodeViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final ua.mycredit.core.interactors.CountDownUseCase getCountDown() {
        return null;
    }
    
    public final void setCountDown(@org.jetbrains.annotations.NotNull()
    ua.mycredit.core.interactors.CountDownUseCase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableLong getResendAvailableAfter() {
        return null;
    }
    
    protected boolean getTimerAutoStartEnabled() {
        return false;
    }
    
    public abstract void requestCode();
    
    @javax.inject.Inject()
    public final void startTimerIfEnabled() {
    }
    
    protected final void startTimer() {
    }
    
    public void enterAnotherNumber() {
    }
    
    public ResendableSmsCodeViewModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0084\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\n"}, d2 = {"Lua/mycredit/mycredit/ui/bases/input/ResendableSmsCodeViewModel$RequestSmsObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$BaseCompletableObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "(Lua/mycredit/mycredit/ui/bases/input/ResendableSmsCodeViewModel;)V", "progressMode", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$ProgressMode$DIALOG;", "getProgressMode", "()Lua/mycredit/mycredit/ui/bases/BaseViewModel$ProgressMode$DIALOG;", "onComplete", "", "presentation_fullDebug"})
    public final class RequestSmsObserver extends ua.mycredit.mycredit.ui.bases.BaseViewModel.BaseCompletableObserver {
        @org.jetbrains.annotations.NotNull()
        private final ua.mycredit.mycredit.ui.bases.BaseViewModel.ProgressMode.DIALOG progressMode = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public ua.mycredit.mycredit.ui.bases.BaseViewModel.ProgressMode.DIALOG getProgressMode() {
            return null;
        }
        
        @java.lang.Override()
        public void onComplete() {
        }
        
        public RequestSmsObserver() {
            super(0, false);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\f\u0012\u0004\u0012\u00020\u00020\u0001R\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lua/mycredit/mycredit/ui/bases/input/ResendableSmsCodeViewModel$CountDownObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$BaseObserver;", "Lua/mycredit/core/interactors/CountDownUseCase$Result;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "(Lua/mycredit/mycredit/ui/bases/input/ResendableSmsCodeViewModel;)V", "progressMode", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$ProgressMode;", "getProgressMode", "()Lua/mycredit/mycredit/ui/bases/BaseViewModel$ProgressMode;", "onNext", "", "t", "presentation_fullDebug"})
    final class CountDownObserver extends ua.mycredit.mycredit.ui.bases.BaseViewModel.BaseObserver<ua.mycredit.core.interactors.CountDownUseCase.Result> {
        @org.jetbrains.annotations.NotNull()
        private final ua.mycredit.mycredit.ui.bases.BaseViewModel.ProgressMode progressMode = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public ua.mycredit.mycredit.ui.bases.BaseViewModel.ProgressMode getProgressMode() {
            return null;
        }
        
        @java.lang.Override()
        public void onNext(@org.jetbrains.annotations.NotNull()
        ua.mycredit.core.interactors.CountDownUseCase.Result t) {
        }
        
        public CountDownObserver() {
            super(0, false);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lua/mycredit/mycredit/ui/bases/input/ResendableSmsCodeViewModel$Companion;", "", "()V", "RESEND_DELAY_SECONDS", "", "presentation_fullDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}