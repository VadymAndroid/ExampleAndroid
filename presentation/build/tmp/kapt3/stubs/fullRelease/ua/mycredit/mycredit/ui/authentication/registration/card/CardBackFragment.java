package ua.mycredit.mycredit.ui.authentication.registration.card;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001$B\u0005\u00a2\u0006\u0002\u0010\u0005J\n\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016R\u0011\u0010\u0006\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000bX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u000bX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\rR\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006%"}, d2 = {"Lua/mycredit/mycredit/ui/authentication/registration/card/CardBackFragment;", "Lua/mycredit/mycredit/ui/bases/ViewModelFragment;", "Lua/mycredit/mycredit/ui/authentication/registration/card/CardBackViewModel;", "Lua/mycredit/mycredit/databinding/FragmentCardBackBinding;", "Lua/mycredit/mycredit/ui/authentication/registration/SignUpActivity$SignUpStep;", "()V", "card", "Lua/mycredit/core/Card;", "getCard", "()Lua/mycredit/core/Card;", "fabVisibility", "", "getFabVisibility", "()Z", "layoutId", "", "getLayoutId", "()I", "overlayTop", "getOverlayTop", "securityGuaranteeVisible", "getSecurityGuaranteeVisible", "signUpProgress", "Lua/mycredit/core/ProgressPercentage;", "getSignUpProgress", "()Lua/mycredit/core/ProgressPercentage;", "viewModelClass", "Ljava/lang/Class;", "getViewModelClass", "()Ljava/lang/Class;", "handleNextButtonClick", "Lua/mycredit/mycredit/ui/authentication/registration/SignUpActivity$SignUpStep$Action;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "presentation_fullRelease"})
public final class CardBackFragment extends ua.mycredit.mycredit.ui.bases.ViewModelFragment<ua.mycredit.mycredit.ui.authentication.registration.card.CardBackViewModel, ua.mycredit.mycredit.databinding.FragmentCardBackBinding> implements ua.mycredit.mycredit.ui.authentication.registration.SignUpActivity.SignUpStep {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Class<ua.mycredit.mycredit.ui.authentication.registration.card.CardBackViewModel> viewModelClass = null;
    private final int layoutId = 2131492945;
    @org.jetbrains.annotations.NotNull()
    private final ua.mycredit.core.ProgressPercentage signUpProgress = null;
    private final boolean fabVisibility = false;
    private final boolean securityGuaranteeVisible = true;
    private final boolean overlayTop = true;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARG_CARD = "ARG_CARD";
    public static final ua.mycredit.mycredit.ui.authentication.registration.card.CardBackFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Class<ua.mycredit.mycredit.ui.authentication.registration.card.CardBackViewModel> getViewModelClass() {
        return null;
    }
    
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
    public boolean getSecurityGuaranteeVisible() {
        return false;
    }
    
    @java.lang.Override()
    public boolean getOverlayTop() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.mycredit.core.Card getCard() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public ua.mycredit.mycredit.ui.authentication.registration.SignUpActivity.SignUpStep.Action handleNextButtonClick() {
        return null;
    }
    
    public CardBackFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lua/mycredit/mycredit/ui/authentication/registration/card/CardBackFragment$Companion;", "", "()V", "ARG_CARD", "", "presentation_fullRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}