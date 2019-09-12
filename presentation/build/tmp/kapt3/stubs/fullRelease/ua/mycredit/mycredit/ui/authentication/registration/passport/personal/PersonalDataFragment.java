package ua.mycredit.mycredit.ui.authentication.registration.passport.personal;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001eB\u0005\u00a2\u0006\u0002\u0010\u0005J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u0007X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\u001f"}, d2 = {"Lua/mycredit/mycredit/ui/authentication/registration/passport/personal/PersonalDataFragment;", "Lua/mycredit/mycredit/ui/bases/ViewModelFragment;", "Lua/mycredit/mycredit/ui/authentication/registration/passport/personal/PersonalDataViewModel;", "Lua/mycredit/mycredit/databinding/FragmentPersonalDataBinding;", "Lua/mycredit/mycredit/ui/authentication/registration/SignUpActivity$SignUpStep;", "()V", "fabVisibility", "", "getFabVisibility", "()Z", "layoutId", "", "getLayoutId", "()I", "overlayTop", "getOverlayTop", "signUpProgress", "Lua/mycredit/core/ProgressPercentage;", "getSignUpProgress", "()Lua/mycredit/core/ProgressPercentage;", "viewModelClass", "Ljava/lang/Class;", "getViewModelClass", "()Ljava/lang/Class;", "handleNextButtonClick", "Lua/mycredit/mycredit/ui/authentication/registration/SignUpActivity$SignUpStep$Action;", "notifyBirthDayPicked", "", "birthDay", "Lorg/joda/time/LocalDate;", "Companion", "presentation_fullRelease"})
public final class PersonalDataFragment extends ua.mycredit.mycredit.ui.bases.ViewModelFragment<ua.mycredit.mycredit.ui.authentication.registration.passport.personal.PersonalDataViewModel, ua.mycredit.mycredit.databinding.FragmentPersonalDataBinding> implements ua.mycredit.mycredit.ui.authentication.registration.SignUpActivity.SignUpStep {
    private final int layoutId = 2131492957;
    @org.jetbrains.annotations.NotNull()
    private final ua.mycredit.core.ProgressPercentage signUpProgress = null;
    private final boolean fabVisibility = true;
    private final boolean overlayTop = false;
    public static final int MAX_AGE = 75;
    public static final int MIN_AGE = 18;
    public static final ua.mycredit.mycredit.ui.authentication.registration.passport.personal.PersonalDataFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.mycredit.core.ProgressPercentage getSignUpProgress() {
        return null;
    }
    
    @java.lang.Override()
    public boolean getFabVisibility() {
        return false;
    }
    
    @java.lang.Override()
    public boolean getOverlayTop() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Class<ua.mycredit.mycredit.ui.authentication.registration.passport.personal.PersonalDataViewModel> getViewModelClass() {
        return null;
    }
    
    public final void notifyBirthDayPicked(@org.jetbrains.annotations.NotNull()
    org.joda.time.LocalDate birthDay) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public ua.mycredit.mycredit.ui.authentication.registration.SignUpActivity.SignUpStep.Action handleNextButtonClick() {
        return null;
    }
    
    public PersonalDataFragment() {
        super();
    }
    
    public boolean getSecurityGuaranteeVisible() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lua/mycredit/mycredit/ui/authentication/registration/passport/personal/PersonalDataFragment$Companion;", "", "()V", "MAX_AGE", "", "MIN_AGE", "presentation_fullRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}