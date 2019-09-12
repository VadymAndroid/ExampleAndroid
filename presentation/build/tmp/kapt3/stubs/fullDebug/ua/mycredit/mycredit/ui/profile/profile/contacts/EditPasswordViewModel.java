package ua.mycredit.mycredit.ui.profile.profile.contacts;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002#$B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010!\u001a\u00020\"H\u0014R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\nR\u0011\u0010\u0019\u001a\u00020\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001d\u001a\u00020\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010\n\u00a8\u0006%"}, d2 = {"Lua/mycredit/mycredit/ui/profile/profile/contacts/EditPasswordViewModel;", "Lua/mycredit/mycredit/ui/bases/input/FormViewModel;", "editPassword", "Lua/mycredit/core/interactors/EditPasswordUseCase;", "resetPassword", "Lua/mycredit/core/interactors/ResetPasswordUseCase;", "(Lua/mycredit/core/interactors/EditPasswordUseCase;Lua/mycredit/core/interactors/ResetPasswordUseCase;)V", "confirmNewPassword", "Lua/mycredit/mycredit/ui/bases/input/FieldViewModel;", "getConfirmNewPassword", "()Lua/mycredit/mycredit/ui/bases/input/FieldViewModel;", "currentPassword", "getCurrentPassword", "fields", "", "getFields", "()Ljava/util/List;", "mode", "Lua/mycredit/mycredit/ui/profile/profile/contacts/EditPasswordViewModel$Mode;", "getMode", "()Lua/mycredit/mycredit/ui/profile/profile/contacts/EditPasswordViewModel$Mode;", "setMode", "(Lua/mycredit/mycredit/ui/profile/profile/contacts/EditPasswordViewModel$Mode;)V", "newPassword", "getNewPassword", "passwordRequirements", "Lua/mycredit/mycredit/ui/bases/input/PasswordRequirementsViewModel;", "getPasswordRequirements", "()Lua/mycredit/mycredit/ui/bases/input/PasswordRequirementsViewModel;", "smsCode", "getSmsCode", "smsCode$delegate", "Lkotlin/Lazy;", "onReadyToSend", "", "Mode", "PasswordEditingObserver", "presentation_fullDebug"})
public final class EditPasswordViewModel extends ua.mycredit.mycredit.ui.bases.input.FormViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy smsCode$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final ua.mycredit.mycredit.ui.bases.input.FieldViewModel currentPassword = null;
    @org.jetbrains.annotations.NotNull()
    private final ua.mycredit.mycredit.ui.bases.input.FieldViewModel newPassword = null;
    @org.jetbrains.annotations.NotNull()
    private final ua.mycredit.mycredit.ui.bases.input.FieldViewModel confirmNewPassword = null;
    @org.jetbrains.annotations.NotNull()
    private final ua.mycredit.mycredit.ui.bases.input.PasswordRequirementsViewModel passwordRequirements = null;
    @org.jetbrains.annotations.NotNull()
    private ua.mycredit.mycredit.ui.profile.profile.contacts.EditPasswordViewModel.Mode mode;
    private final ua.mycredit.core.interactors.EditPasswordUseCase editPassword = null;
    private final ua.mycredit.core.interactors.ResetPasswordUseCase resetPassword = null;
    
    @org.jetbrains.annotations.NotNull()
    public final ua.mycredit.mycredit.ui.bases.input.FieldViewModel getSmsCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.mycredit.mycredit.ui.bases.input.FieldViewModel getCurrentPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.mycredit.mycredit.ui.bases.input.FieldViewModel getNewPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.mycredit.mycredit.ui.bases.input.FieldViewModel getConfirmNewPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.mycredit.mycredit.ui.bases.input.PasswordRequirementsViewModel getPasswordRequirements() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.mycredit.mycredit.ui.profile.profile.contacts.EditPasswordViewModel.Mode getMode() {
        return null;
    }
    
    public final void setMode(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.ui.profile.profile.contacts.EditPasswordViewModel.Mode p0) {
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
    public EditPasswordViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.core.interactors.EditPasswordUseCase editPassword, @org.jetbrains.annotations.NotNull()
    ua.mycredit.core.interactors.ResetPasswordUseCase resetPassword) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\n"}, d2 = {"Lua/mycredit/mycredit/ui/profile/profile/contacts/EditPasswordViewModel$PasswordEditingObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$BaseCompletableObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "(Lua/mycredit/mycredit/ui/profile/profile/contacts/EditPasswordViewModel;)V", "progressMode", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$ProgressMode$DIALOG;", "getProgressMode", "()Lua/mycredit/mycredit/ui/bases/BaseViewModel$ProgressMode$DIALOG;", "onComplete", "", "presentation_fullDebug"})
    final class PasswordEditingObserver extends ua.mycredit.mycredit.ui.bases.BaseViewModel.BaseCompletableObserver {
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
        
        public PasswordEditingObserver() {
            super(0, false);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB?\b\u0002\u0012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006\u0012\u001d\u0010\u0007\u001a\u0019\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0003\u00a2\u0006\u0002\b\u0006\u00a2\u0006\u0002\u0010\nR(\u0010\u0007\u001a\u0019\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0003\u00a2\u0006\u0002\b\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f\u0082\u0001\u0002\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lua/mycredit/mycredit/ui/profile/profile/contacts/EditPasswordViewModel$Mode;", "Ljava/io/Serializable;", "processReadyToSent", "Lkotlin/Function1;", "Lua/mycredit/mycredit/ui/profile/profile/contacts/EditPasswordViewModel;", "", "Lkotlin/ExtensionFunctionType;", "getFields", "", "Lua/mycredit/mycredit/ui/bases/input/FieldViewModel;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getGetFields", "()Lkotlin/jvm/functions/Function1;", "getProcessReadyToSent", "ByOldPassword", "ByPhone", "Lua/mycredit/mycredit/ui/profile/profile/contacts/EditPasswordViewModel$Mode$ByOldPassword;", "Lua/mycredit/mycredit/ui/profile/profile/contacts/EditPasswordViewModel$Mode$ByPhone;", "presentation_fullDebug"})
    public static abstract class Mode implements java.io.Serializable {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function1<ua.mycredit.mycredit.ui.profile.profile.contacts.EditPasswordViewModel, kotlin.Unit> processReadyToSent = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function1<ua.mycredit.mycredit.ui.profile.profile.contacts.EditPasswordViewModel, java.util.List<ua.mycredit.mycredit.ui.bases.input.FieldViewModel>> getFields = null;
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<ua.mycredit.mycredit.ui.profile.profile.contacts.EditPasswordViewModel, kotlin.Unit> getProcessReadyToSent() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<ua.mycredit.mycredit.ui.profile.profile.contacts.EditPasswordViewModel, java.util.List<ua.mycredit.mycredit.ui.bases.input.FieldViewModel>> getGetFields() {
            return null;
        }
        
        private Mode(kotlin.jvm.functions.Function1<? super ua.mycredit.mycredit.ui.profile.profile.contacts.EditPasswordViewModel, kotlin.Unit> processReadyToSent, kotlin.jvm.functions.Function1<? super ua.mycredit.mycredit.ui.profile.profile.contacts.EditPasswordViewModel, ? extends java.util.List<ua.mycredit.mycredit.ui.bases.input.FieldViewModel>> getFields) {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lua/mycredit/mycredit/ui/profile/profile/contacts/EditPasswordViewModel$Mode$ByOldPassword;", "Lua/mycredit/mycredit/ui/profile/profile/contacts/EditPasswordViewModel$Mode;", "()V", "presentation_fullDebug"})
        public static final class ByOldPassword extends ua.mycredit.mycredit.ui.profile.profile.contacts.EditPasswordViewModel.Mode {
            public static final ua.mycredit.mycredit.ui.profile.profile.contacts.EditPasswordViewModel.Mode.ByOldPassword INSTANCE = null;
            
            private ByOldPassword() {
                super(null, null);
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lua/mycredit/mycredit/ui/profile/profile/contacts/EditPasswordViewModel$Mode$ByPhone;", "Lua/mycredit/mycredit/ui/profile/profile/contacts/EditPasswordViewModel$Mode;", "phone", "", "(Ljava/lang/String;)V", "presentation_fullDebug"})
        public static final class ByPhone extends ua.mycredit.mycredit.ui.profile.profile.contacts.EditPasswordViewModel.Mode {
            private final java.lang.String phone = null;
            
            public ByPhone(@org.jetbrains.annotations.NotNull()
            java.lang.String phone) {
                super(null, null);
            }
        }
    }
}