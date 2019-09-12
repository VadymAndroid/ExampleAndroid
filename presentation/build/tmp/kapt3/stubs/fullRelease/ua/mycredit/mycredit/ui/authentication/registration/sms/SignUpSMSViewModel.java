package ua.mycredit.mycredit.ui.authentication.registration.sms;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0016B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u0011H\u0014J\b\u0010\u0015\u001a\u00020\u0011H\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0017"}, d2 = {"Lua/mycredit/mycredit/ui/authentication/registration/sms/SignUpSMSViewModel;", "Lua/mycredit/mycredit/ui/bases/input/ResendableSmsCodeViewModel;", "verifySmsCode", "Lua/mycredit/core/interactors/VerifySmsCodeUseCase;", "requestSms", "Lua/mycredit/core/interactors/RequestSmsIfPhoneValidUseCase;", "(Lua/mycredit/core/interactors/VerifySmsCodeUseCase;Lua/mycredit/core/interactors/RequestSmsIfPhoneValidUseCase;)V", "preLoaderCompatPadding", "", "getPreLoaderCompatPadding", "()Z", "viewModelClass", "Ljava/lang/Class;", "Lua/mycredit/mycredit/ui/bases/input/BaseSmsCodeViewModel;", "getViewModelClass", "()Ljava/lang/Class;", "handleSmsReceived", "", "sms", "", "onReadyToSend", "requestCode", "CheckPhoneObserver", "presentation_fullRelease"})
public final class SignUpSMSViewModel extends ua.mycredit.mycredit.ui.bases.input.ResendableSmsCodeViewModel {
    private final boolean preLoaderCompatPadding = true;
    private final ua.mycredit.core.interactors.VerifySmsCodeUseCase verifySmsCode = null;
    private final ua.mycredit.core.interactors.RequestSmsIfPhoneValidUseCase requestSms = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Class<ua.mycredit.mycredit.ui.bases.input.BaseSmsCodeViewModel> getViewModelClass() {
        return null;
    }
    
    @java.lang.Override()
    public boolean getPreLoaderCompatPadding() {
        return false;
    }
    
    @java.lang.Override()
    protected void onReadyToSend() {
    }
    
    @java.lang.Override()
    public void requestCode() {
    }
    
    public final void handleSmsReceived(@org.jetbrains.annotations.NotNull()
    java.lang.String sms) {
    }
    
    @javax.inject.Inject()
    public SignUpSMSViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.core.interactors.VerifySmsCodeUseCase verifySmsCode, @org.jetbrains.annotations.NotNull()
    ua.mycredit.core.interactors.RequestSmsIfPhoneValidUseCase requestSms) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\f\u0012\u0004\u0012\u00020\u00020\u0001R\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lua/mycredit/mycredit/ui/authentication/registration/sms/SignUpSMSViewModel$CheckPhoneObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$BaseSingleObserver;", "", "Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "(Lua/mycredit/mycredit/ui/authentication/registration/sms/SignUpSMSViewModel;)V", "progressMode", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$ProgressMode$DIALOG;", "getProgressMode", "()Lua/mycredit/mycredit/ui/bases/BaseViewModel$ProgressMode$DIALOG;", "onSuccess", "", "t", "presentation_fullRelease"})
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
}