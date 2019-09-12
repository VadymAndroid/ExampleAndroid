package ua.mycredit.mycredit.ui.authentication;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0014J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\t8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0010\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lua/mycredit/mycredit/ui/authentication/SignInViewModel;", "Lua/mycredit/mycredit/ui/bases/input/FormViewModel;", "signIn", "Lua/mycredit/core/interactors/SignInUseCase;", "phoneOptionsUseCase", "Lua/mycredit/core/interactors/PhoneOptionsUseCase;", "(Lua/mycredit/core/interactors/SignInUseCase;Lua/mycredit/core/interactors/PhoneOptionsUseCase;)V", "fields", "", "Lua/mycredit/mycredit/ui/bases/input/FieldViewModel;", "getFields", "()Ljava/util/List;", "password", "getPassword", "()Lua/mycredit/mycredit/ui/bases/input/FieldViewModel;", "phone", "getPhone", "phone$delegate", "Lkotlin/Lazy;", "findPermissionResult", "", "onReadyToSend", "sendPhoneOptions", "phoneOptions", "Lua/mycredit/core/PhoneOptions;", "DeviceOptionsObserver", "SignInObserver", "presentation_fullRelease"})
public final class SignInViewModel extends ua.mycredit.mycredit.ui.bases.input.FormViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy phone$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final ua.mycredit.mycredit.ui.bases.input.FieldViewModel password = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<ua.mycredit.mycredit.ui.bases.input.FieldViewModel> fields = null;
    private final ua.mycredit.core.interactors.SignInUseCase signIn = null;
    private final ua.mycredit.core.interactors.PhoneOptionsUseCase phoneOptionsUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final ua.mycredit.mycredit.ui.bases.input.FieldViewModel getPhone() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.mycredit.mycredit.ui.bases.input.FieldViewModel getPassword() {
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
    
    private final void sendPhoneOptions(ua.mycredit.core.PhoneOptions phoneOptions) {
    }
    
    private final void findPermissionResult() {
    }
    
    @javax.inject.Inject()
    public SignInViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.core.interactors.SignInUseCase signIn, @org.jetbrains.annotations.NotNull()
    ua.mycredit.core.interactors.PhoneOptionsUseCase phoneOptionsUseCase) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000e"}, d2 = {"Lua/mycredit/mycredit/ui/authentication/SignInViewModel$SignInObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$BaseCompletableObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "(Lua/mycredit/mycredit/ui/authentication/SignInViewModel;)V", "progressMode", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$ProgressMode$DIALOG;", "getProgressMode", "()Lua/mycredit/mycredit/ui/bases/BaseViewModel$ProgressMode$DIALOG;", "onComplete", "", "onMapError", "", "e", "", "presentation_fullRelease"})
    final class SignInObserver extends ua.mycredit.mycredit.ui.bases.BaseViewModel.BaseCompletableObserver {
        @org.jetbrains.annotations.NotNull()
        private final ua.mycredit.mycredit.ui.bases.BaseViewModel.ProgressMode.DIALOG progressMode = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public ua.mycredit.mycredit.ui.bases.BaseViewModel.ProgressMode.DIALOG getProgressMode() {
            return null;
        }
        
        @java.lang.Override()
        public int onMapError(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable e) {
            return 0;
        }
        
        @java.lang.Override()
        public void onComplete() {
        }
        
        public SignInObserver() {
            super(0, false);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lua/mycredit/mycredit/ui/authentication/SignInViewModel$DeviceOptionsObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$NoResponseFromServerCompletableObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "(Lua/mycredit/mycredit/ui/authentication/SignInViewModel;)V", "presentation_fullRelease"})
    final class DeviceOptionsObserver extends ua.mycredit.mycredit.ui.bases.BaseViewModel.NoResponseFromServerCompletableObserver {
        
        public DeviceOptionsObserver() {
            super();
        }
    }
}