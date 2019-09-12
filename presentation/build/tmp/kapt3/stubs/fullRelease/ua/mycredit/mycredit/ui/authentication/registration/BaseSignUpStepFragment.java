package ua.mycredit.mycredit.ui.authentication.registration;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00052\u00020\u0006B\u0005\u00a2\u0006\u0002\u0010\u0007J\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u0014\u0010\b\u001a\u00020\tX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u000e"}, d2 = {"Lua/mycredit/mycredit/ui/authentication/registration/BaseSignUpStepFragment;", "VM", "Lua/mycredit/mycredit/ui/bases/input/FormViewModel;", "VDB", "Landroid/databinding/ViewDataBinding;", "Lua/mycredit/mycredit/ui/bases/ViewModelFragment;", "Lua/mycredit/mycredit/ui/authentication/registration/SignUpActivity$SignUpStep;", "()V", "fabVisibility", "", "getFabVisibility", "()Z", "handleNextButtonClick", "Lua/mycredit/mycredit/ui/authentication/registration/SignUpActivity$SignUpStep$Action;", "presentation_fullRelease"})
public abstract class BaseSignUpStepFragment<VM extends ua.mycredit.mycredit.ui.bases.input.FormViewModel, VDB extends android.databinding.ViewDataBinding> extends ua.mycredit.mycredit.ui.bases.ViewModelFragment<VM, VDB> implements ua.mycredit.mycredit.ui.authentication.registration.SignUpActivity.SignUpStep {
    private final boolean fabVisibility = true;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public boolean getFabVisibility() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public ua.mycredit.mycredit.ui.authentication.registration.SignUpActivity.SignUpStep.Action handleNextButtonClick() {
        return null;
    }
    
    public BaseSignUpStepFragment() {
        super();
    }
    
    public boolean getOverlayTop() {
        return false;
    }
    
    public boolean getSecurityGuaranteeVisible() {
        return false;
    }
}