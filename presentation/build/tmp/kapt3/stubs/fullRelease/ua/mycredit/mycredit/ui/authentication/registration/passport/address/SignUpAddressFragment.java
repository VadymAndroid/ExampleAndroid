package ua.mycredit.mycredit.ui.authentication.registration.passport.address;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u0007X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\u001e"}, d2 = {"Lua/mycredit/mycredit/ui/authentication/registration/passport/address/SignUpAddressFragment;", "Lua/mycredit/mycredit/ui/bases/ViewModelFragment;", "Lua/mycredit/mycredit/ui/authentication/registration/passport/address/SignUpAddressViewModel;", "Lua/mycredit/mycredit/databinding/FragmentSignUpAddressBinding;", "Lua/mycredit/mycredit/ui/authentication/registration/SignUpActivity$SignUpStep;", "()V", "fabVisibility", "", "getFabVisibility", "()Z", "layoutId", "", "getLayoutId", "()I", "overlayTop", "getOverlayTop", "signUpProgress", "Lua/mycredit/core/ProgressPercentage;", "getSignUpProgress", "()Lua/mycredit/core/ProgressPercentage;", "viewModelClass", "Ljava/lang/Class;", "getViewModelClass", "()Ljava/lang/Class;", "handleNextButtonClick", "Lua/mycredit/mycredit/ui/authentication/registration/SignUpActivity$SignUpStep$Action;", "resetPlaces", "", "place", "Lcom/google/android/gms/location/places/Place;", "presentation_fullRelease"})
public final class SignUpAddressFragment extends ua.mycredit.mycredit.ui.bases.ViewModelFragment<ua.mycredit.mycredit.ui.authentication.registration.passport.address.SignUpAddressViewModel, ua.mycredit.mycredit.databinding.FragmentSignUpAddressBinding> implements ua.mycredit.mycredit.ui.authentication.registration.SignUpActivity.SignUpStep {
    private final int layoutId = 2131492965;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Class<ua.mycredit.mycredit.ui.authentication.registration.passport.address.SignUpAddressViewModel> viewModelClass = null;
    @org.jetbrains.annotations.NotNull()
    private final ua.mycredit.core.ProgressPercentage signUpProgress = null;
    private final boolean overlayTop = false;
    private final boolean fabVisibility = true;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Class<ua.mycredit.mycredit.ui.authentication.registration.passport.address.SignUpAddressViewModel> getViewModelClass() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.mycredit.core.ProgressPercentage getSignUpProgress() {
        return null;
    }
    
    @java.lang.Override()
    public boolean getOverlayTop() {
        return false;
    }
    
    @java.lang.Override()
    public boolean getFabVisibility() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public ua.mycredit.mycredit.ui.authentication.registration.SignUpActivity.SignUpStep.Action handleNextButtonClick() {
        return null;
    }
    
    public final void resetPlaces(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.location.places.Place place) {
    }
    
    public SignUpAddressFragment() {
        super();
    }
    
    public boolean getSecurityGuaranteeVisible() {
        return false;
    }
}