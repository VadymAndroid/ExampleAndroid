package ua.mycredit.mycredit.ui.profile.credit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0014\u0015\u0016B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u0004\u001a\u00020\u0011J\u000e\u0010\u0002\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000bJ\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0013\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lua/mycredit/mycredit/ui/profile/credit/AgreementViewModel;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "getAgreement", "Lua/mycredit/core/interactors/GetAgreementUseCase;", "acceptAgreement", "Lua/mycredit/core/interactors/AcceptAgreementUseCase;", "cpaUseCase", "Lua/mycredit/core/interactors/CPAUseCase;", "(Lua/mycredit/core/interactors/GetAgreementUseCase;Lua/mycredit/core/interactors/AcceptAgreementUseCase;Lua/mycredit/core/interactors/CPAUseCase;)V", "agreementType", "Landroid/databinding/ObservableField;", "Lua/mycredit/core/AgreementType;", "getAgreementType", "()Landroid/databinding/ObservableField;", "file", "Ljava/io/File;", "getFile", "", "sendCPA", "showAcceptingDialog", "AcceptAgreementObserver", "AgreementObserver", "DeviceContactObserver", "presentation_fullDebug"})
public final class AgreementViewModel extends ua.mycredit.mycredit.ui.bases.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableField<java.io.File> file = null;
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableField<ua.mycredit.core.AgreementType> agreementType = null;
    private final ua.mycredit.core.interactors.GetAgreementUseCase getAgreement = null;
    private final ua.mycredit.core.interactors.AcceptAgreementUseCase acceptAgreement = null;
    private final ua.mycredit.core.interactors.CPAUseCase cpaUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableField<java.io.File> getFile() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableField<ua.mycredit.core.AgreementType> getAgreementType() {
        return null;
    }
    
    public final void getAgreement(@org.jetbrains.annotations.NotNull()
    ua.mycredit.core.AgreementType agreementType) {
    }
    
    public final void showAcceptingDialog() {
    }
    
    public final void acceptAgreement() {
    }
    
    public final void sendCPA() {
    }
    
    @javax.inject.Inject()
    public AgreementViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.core.interactors.GetAgreementUseCase getAgreement, @org.jetbrains.annotations.NotNull()
    ua.mycredit.core.interactors.AcceptAgreementUseCase acceptAgreement, @org.jetbrains.annotations.NotNull()
    ua.mycredit.core.interactors.CPAUseCase cpaUseCase) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\f\u0012\u0004\u0012\u00020\u00020\u0001R\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016\u00a8\u0006\f"}, d2 = {"Lua/mycredit/mycredit/ui/profile/credit/AgreementViewModel$AgreementObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$BaseSingleObserver;", "Ljava/io/File;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "(Lua/mycredit/mycredit/ui/profile/credit/AgreementViewModel;)V", "onHandleError", "", "e", "", "onSuccess", "", "t", "presentation_fullDebug"})
    final class AgreementObserver extends ua.mycredit.mycredit.ui.bases.BaseViewModel.BaseSingleObserver<java.io.File> {
        
        @java.lang.Override()
        public void onSuccess(@org.jetbrains.annotations.NotNull()
        java.io.File t) {
        }
        
        @java.lang.Override()
        public boolean onHandleError(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable e) {
            return false;
        }
        
        public AgreementObserver() {
            super(0, false);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lua/mycredit/mycredit/ui/profile/credit/AgreementViewModel$DeviceContactObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$NoResponseFromServerCompletableObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "(Lua/mycredit/mycredit/ui/profile/credit/AgreementViewModel;)V", "presentation_fullDebug"})
    final class DeviceContactObserver extends ua.mycredit.mycredit.ui.bases.BaseViewModel.NoResponseFromServerCompletableObserver {
        
        public DeviceContactObserver() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lua/mycredit/mycredit/ui/profile/credit/AgreementViewModel$AcceptAgreementObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$BaseCompletableObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "(Lua/mycredit/mycredit/ui/profile/credit/AgreementViewModel;)V", "onComplete", "", "presentation_fullDebug"})
    final class AcceptAgreementObserver extends ua.mycredit.mycredit.ui.bases.BaseViewModel.BaseCompletableObserver {
        
        @java.lang.Override()
        public void onComplete() {
        }
        
        public AcceptAgreementObserver() {
            super(0, false);
        }
    }
}