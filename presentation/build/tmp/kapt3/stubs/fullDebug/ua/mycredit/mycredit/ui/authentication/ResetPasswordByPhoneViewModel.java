package ua.mycredit.mycredit.ui.authentication;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0014R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lua/mycredit/mycredit/ui/authentication/ResetPasswordByPhoneViewModel;", "Lua/mycredit/mycredit/ui/bases/input/FormViewModel;", "requestResetPasswordSms", "Lua/mycredit/core/interactors/RequestResetPasswordSmsUseCase;", "(Lua/mycredit/core/interactors/RequestResetPasswordSmsUseCase;)V", "fields", "", "Lua/mycredit/mycredit/ui/bases/input/FieldViewModel;", "getFields", "()Ljava/util/List;", "phone", "getPhone", "()Lua/mycredit/mycredit/ui/bases/input/FieldViewModel;", "onReadyToSend", "", "RequestSmsCodeObserver", "presentation_fullDebug"})
public final class ResetPasswordByPhoneViewModel extends ua.mycredit.mycredit.ui.bases.input.FormViewModel {
    @org.jetbrains.annotations.NotNull()
    private final ua.mycredit.mycredit.ui.bases.input.FieldViewModel phone = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<ua.mycredit.mycredit.ui.bases.input.FieldViewModel> fields = null;
    private final ua.mycredit.core.interactors.RequestResetPasswordSmsUseCase requestResetPasswordSms = null;
    
    @org.jetbrains.annotations.NotNull()
    public final ua.mycredit.mycredit.ui.bases.input.FieldViewModel getPhone() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<ua.mycredit.mycredit.ui.bases.input.FieldViewModel> getFields() {
        return null;
    }
    
    @java.lang.Override()
    protected void onReadyToSend() {
    }
    
    @javax.inject.Inject()
    public ResetPasswordByPhoneViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.core.interactors.RequestResetPasswordSmsUseCase requestResetPasswordSms) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\n"}, d2 = {"Lua/mycredit/mycredit/ui/authentication/ResetPasswordByPhoneViewModel$RequestSmsCodeObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$BaseCompletableObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "(Lua/mycredit/mycredit/ui/authentication/ResetPasswordByPhoneViewModel;)V", "progressMode", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$ProgressMode$DIALOG;", "getProgressMode", "()Lua/mycredit/mycredit/ui/bases/BaseViewModel$ProgressMode$DIALOG;", "onComplete", "", "presentation_fullDebug"})
    final class RequestSmsCodeObserver extends ua.mycredit.mycredit.ui.bases.BaseViewModel.BaseCompletableObserver {
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
        
        public RequestSmsCodeObserver() {
            super(0, false);
        }
    }
}