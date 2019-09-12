package ua.mycredit.mycredit.ui.authentication.registration.card;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00013B\u0005\u00a2\u0006\u0002\u0010\u0004J\n\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\"\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00142\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J&\u0010\'\u001a\u00020\"2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u0014J&\u0010-\u001a\u00020\"2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u0014J\u0006\u0010.\u001a\u00020\"J\u0010\u0010/\u001a\u00020\"2\u0006\u00100\u001a\u000201H\u0014J\u0006\u00102\u001a\u00020\"R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u0010X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\u0019\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0012R\u0014\u0010\u001b\u001a\u00020\u001cX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e\u00a8\u00064"}, d2 = {"Lua/mycredit/mycredit/ui/authentication/registration/card/CardFrontFragment;", "Lua/mycredit/mycredit/ui/bases/SelfBindingFragment;", "Lua/mycredit/mycredit/databinding/FragmentCardFrontBinding;", "Lua/mycredit/mycredit/ui/authentication/registration/SignUpActivity$SignUpStep;", "()V", "cardError", "Landroid/databinding/ObservableBoolean;", "getCardError", "()Landroid/databinding/ObservableBoolean;", "cardHolder", "Lua/mycredit/mycredit/ui/bases/input/FieldViewModel;", "getCardHolder", "()Lua/mycredit/mycredit/ui/bases/input/FieldViewModel;", "expirationDateError", "getExpirationDateError", "fabVisibility", "", "getFabVisibility", "()Z", "layoutId", "", "getLayoutId", "()I", "overlayTop", "getOverlayTop", "scanVisible", "getScanVisible", "signUpProgress", "Lua/mycredit/core/ProgressPercentage;", "getSignUpProgress", "()Lua/mycredit/core/ProgressPercentage;", "handleNextButtonClick", "Lua/mycredit/mycredit/ui/authentication/registration/SignUpActivity$SignUpStep$Action;", "onActivityResult", "", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCardChanged", "s", "", "start", "before", "count", "onExpirationDateChanged", "onScan", "onValidated", "card", "Lua/mycredit/core/Card;", "validate", "Companion", "presentation_fullRelease"})
public class CardFrontFragment extends ua.mycredit.mycredit.ui.bases.SelfBindingFragment<ua.mycredit.mycredit.databinding.FragmentCardFrontBinding> implements ua.mycredit.mycredit.ui.authentication.registration.SignUpActivity.SignUpStep {
    private final int layoutId = 2131492946;
    @org.jetbrains.annotations.NotNull()
    private final ua.mycredit.core.ProgressPercentage signUpProgress = null;
    private final boolean fabVisibility = false;
    private final boolean overlayTop = true;
    @org.jetbrains.annotations.NotNull()
    private final ua.mycredit.mycredit.ui.bases.input.FieldViewModel cardHolder = null;
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableBoolean cardError = null;
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableBoolean expirationDateError = null;
    public static final int CARD_LENGTH = 16;
    public static final int EXPIRATION_DATE_LENGTH = 4;
    public static final int SCAN_REQUEST_CODE = 888;
    public static final ua.mycredit.mycredit.ui.authentication.registration.card.CardFrontFragment.Companion Companion = null;
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
    
    public final boolean getScanVisible() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.mycredit.mycredit.ui.bases.input.FieldViewModel getCardHolder() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableBoolean getCardError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableBoolean getExpirationDateError() {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public ua.mycredit.mycredit.ui.authentication.registration.SignUpActivity.SignUpStep.Action handleNextButtonClick() {
        return null;
    }
    
    public final void validate() {
    }
    
    public final void onCardChanged(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence s, int start, int before, int count) {
    }
    
    public final void onExpirationDateChanged(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence s, int start, int before, int count) {
    }
    
    public final void onScan() {
    }
    
    protected void onValidated(@org.jetbrains.annotations.NotNull()
    ua.mycredit.core.Card card) {
    }
    
    public CardFrontFragment() {
        super();
    }
    
    public boolean getSecurityGuaranteeVisible() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lua/mycredit/mycredit/ui/authentication/registration/card/CardFrontFragment$Companion;", "", "()V", "CARD_LENGTH", "", "EXPIRATION_DATE_LENGTH", "SCAN_REQUEST_CODE", "presentation_fullRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}