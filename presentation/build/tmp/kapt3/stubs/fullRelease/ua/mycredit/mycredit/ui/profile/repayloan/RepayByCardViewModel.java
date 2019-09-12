package ua.mycredit.mycredit.ui.profile.repayloan;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\"B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001cJ\b\u0010\u001e\u001a\u00020\u001cH\u0007J\u0006\u0010\u001f\u001a\u00020\u001cJ\b\u0010 \u001a\u00020\u001cH\u0016J\u0010\u0010!\u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\rH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006#"}, d2 = {"Lua/mycredit/mycredit/ui/profile/repayloan/RepayByCardViewModel;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "getPaymentUrl", "Lua/mycredit/core/interactors/GetPaymentUrlUseCase;", "(Lua/mycredit/core/interactors/GetPaymentUrlUseCase;)V", "amount", "Landroid/databinding/ObservableDouble;", "getAmount", "()Landroid/databinding/ObservableDouble;", "amount$delegate", "Lkotlin/Lazy;", "card", "Landroid/databinding/ObservableField;", "Lua/mycredit/core/Card;", "getCard", "()Landroid/databinding/ObservableField;", "credit", "Lua/mycredit/core/Credit;", "getCredit", "()Lua/mycredit/core/Credit;", "credit$delegate", "repaymentType", "Lua/mycredit/mycredit/ui/profile/repayloan/RepaymentType;", "getRepaymentType", "()Lua/mycredit/mycredit/ui/profile/repayloan/RepaymentType;", "setRepaymentType", "(Lua/mycredit/mycredit/ui/profile/repayloan/RepaymentType;)V", "changeAmount", "", "goToCardsList", "initCard", "makePayment", "onBankingCompleted", "onCardSelected", "GetPaymentUrlObserver", "presentation_fullRelease"})
public final class RepayByCardViewModel extends ua.mycredit.mycredit.ui.bases.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    public ua.mycredit.mycredit.ui.profile.repayloan.RepaymentType repaymentType;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy amount$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableField<ua.mycredit.core.Card> card = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy credit$delegate = null;
    private final ua.mycredit.core.interactors.GetPaymentUrlUseCase getPaymentUrl = null;
    
    @org.jetbrains.annotations.NotNull()
    public final ua.mycredit.mycredit.ui.profile.repayloan.RepaymentType getRepaymentType() {
        return null;
    }
    
    public final void setRepaymentType(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.ui.profile.repayloan.RepaymentType p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableDouble getAmount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableField<ua.mycredit.core.Card> getCard() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.mycredit.core.Credit getCredit() {
        return null;
    }
    
    @javax.inject.Inject()
    public final void initCard() {
    }
    
    @java.lang.Override()
    public void onCardSelected(@org.jetbrains.annotations.NotNull()
    ua.mycredit.core.Card card) {
    }
    
    @java.lang.Override()
    public void onBankingCompleted() {
    }
    
    public final void makePayment() {
    }
    
    public final void changeAmount() {
    }
    
    public final void goToCardsList() {
    }
    
    @javax.inject.Inject()
    public RepayByCardViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.core.interactors.GetPaymentUrlUseCase getPaymentUrl) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\f\u0012\u0004\u0012\u00020\u00020\u0001R\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lua/mycredit/mycredit/ui/profile/repayloan/RepayByCardViewModel$GetPaymentUrlObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$BaseSingleObserver;", "", "Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "(Lua/mycredit/mycredit/ui/profile/repayloan/RepayByCardViewModel;)V", "progressMode", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$ProgressMode$DIALOG;", "getProgressMode", "()Lua/mycredit/mycredit/ui/bases/BaseViewModel$ProgressMode$DIALOG;", "onSuccess", "", "t", "presentation_fullRelease"})
    final class GetPaymentUrlObserver extends ua.mycredit.mycredit.ui.bases.BaseViewModel.BaseSingleObserver<java.lang.String> {
        @org.jetbrains.annotations.NotNull()
        private final ua.mycredit.mycredit.ui.bases.BaseViewModel.ProgressMode.DIALOG progressMode = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public ua.mycredit.mycredit.ui.bases.BaseViewModel.ProgressMode.DIALOG getProgressMode() {
            return null;
        }
        
        @java.lang.Override()
        public void onSuccess(@org.jetbrains.annotations.NotNull()
        java.lang.String t) {
        }
        
        public GetPaymentUrlObserver() {
            super(0, false);
        }
    }
}