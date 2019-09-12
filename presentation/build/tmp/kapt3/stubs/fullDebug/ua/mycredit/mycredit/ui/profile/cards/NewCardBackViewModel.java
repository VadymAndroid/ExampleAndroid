package ua.mycredit.mycredit.ui.profile.cards;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\tB\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\u0005H\u0014R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\n"}, d2 = {"Lua/mycredit/mycredit/ui/profile/cards/NewCardBackViewModel;", "Lua/mycredit/mycredit/ui/authentication/registration/card/CardBackViewModel;", "()V", "smsVerificationRequired", "Landroid/arch/lifecycle/MutableLiveData;", "", "getSmsVerificationRequired", "()Landroid/arch/lifecycle/MutableLiveData;", "onValidated", "AddCardObserver", "presentation_fullDebug"})
public final class NewCardBackViewModel extends ua.mycredit.mycredit.ui.authentication.registration.card.CardBackViewModel {
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<kotlin.Unit> smsVerificationRequired = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<kotlin.Unit> getSmsVerificationRequired() {
        return null;
    }
    
    @java.lang.Override()
    protected void onValidated() {
    }
    
    @javax.inject.Inject()
    public NewCardBackViewModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\f\u0012\u0004\u0012\u00020\u00020\u0001R\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\b"}, d2 = {"Lua/mycredit/mycredit/ui/profile/cards/NewCardBackViewModel$AddCardObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$BaseSingleObserver;", "Lua/mycredit/core/CardVerificationType;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "(Lua/mycredit/mycredit/ui/profile/cards/NewCardBackViewModel;)V", "onSuccess", "", "t", "presentation_fullDebug"})
    final class AddCardObserver extends ua.mycredit.mycredit.ui.bases.BaseViewModel.BaseSingleObserver<ua.mycredit.core.CardVerificationType> {
        
        @java.lang.Override()
        public void onSuccess(@org.jetbrains.annotations.NotNull()
        ua.mycredit.core.CardVerificationType t) {
        }
        
        public AddCardObserver() {
            super(0, false);
        }
    }
}