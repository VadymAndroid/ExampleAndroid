package ua.mycredit.mycredit.ui.calculator;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 K2\u00020\u0001:\u0006JKLMNOB\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u00106\u001a\u00020+2\u0006\u00107\u001a\u00020+J\u0006\u00108\u001a\u000209J\u0006\u0010:\u001a\u000209J\u0016\u0010;\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013J\u001e\u0010;\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u00132\u0006\u00107\u001a\u00020+J\u000e\u0010<\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u0013J\u0016\u0010=\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013J\u001e\u0010=\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u00132\u0006\u00107\u001a\u00020+J\u000e\u0010>\u001a\u00020?2\u0006\u0010\t\u001a\u00020\u0013J\u0006\u0010@\u001a\u000209J\u000e\u0010A\u001a\u0002092\u0006\u0010B\u001a\u00020\u0013J\b\u0010C\u001a\u000209H\u0007J\u000e\u0010D\u001a\u0002092\u0006\u0010B\u001a\u00020\u0013J\b\u0010E\u001a\u000209H\u0016J\u0006\u0010F\u001a\u000209J\u000e\u0010G\u001a\u0002092\u0006\u0010H\u001a\u00020IR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001c\u001a\u00020\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u001a\u0010\"\u001a\u00020#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u0011\u0010(\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\fR\u001a\u0010*\u001a\u00020+X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0011R\u0010\u00102\u001a\u0004\u0018\u000103X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u00104\u001a\u00020\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001f\u00a8\u0006P"}, d2 = {"Lua/mycredit/mycredit/ui/calculator/CalculatorViewModel;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "getProductByPromoCode", "Lua/mycredit/core/interactors/GetProductByPromoCodeUseCase;", "applyForCredit", "Lua/mycredit/core/interactors/ApplyForCreditUseCase;", "cpaUseCase", "Lua/mycredit/core/interactors/CPAUseCase;", "(Lua/mycredit/core/interactors/GetProductByPromoCodeUseCase;Lua/mycredit/core/interactors/ApplyForCreditUseCase;Lua/mycredit/core/interactors/CPAUseCase;)V", "days", "Landroid/databinding/ObservableInt;", "getDays", "()Landroid/databinding/ObservableInt;", "daysProcess", "Landroid/databinding/ObservableField;", "Lua/mycredit/mycredit/ui/calculator/CalculatorViewModel$Progress;", "getDaysProcess", "()Landroid/databinding/ObservableField;", "defDays", "", "getDefDays", "()I", "defLoan", "getDefLoan", "discount", "Landroid/databinding/ObservableFloat;", "getDiscount", "()Landroid/databinding/ObservableFloat;", "loading", "Landroid/databinding/ObservableBoolean;", "getLoading", "()Landroid/databinding/ObservableBoolean;", "mainView", "getMainView", "mode", "Lua/mycredit/mycredit/ui/calculator/CalculatorViewModel$Mode;", "getMode", "()Lua/mycredit/mycredit/ui/calculator/CalculatorViewModel$Mode;", "setMode", "(Lua/mycredit/mycredit/ui/calculator/CalculatorViewModel$Mode;)V", "money", "getMoney", "moneyDayRate", "", "getMoneyDayRate", "()F", "setMoneyDayRate", "(F)V", "moneyProcess", "getMoneyProcess", "product", "Lua/mycredit/core/Product;", "usePromo", "getUsePromo", "calcDiscount", "percent", "enterPromoCode", "", "getCredit", "getGiveQuantity", "getMoneyFrom", "getPercent", "getUntil", "Ljava/util/Calendar;", "initByDef", "onDaysValueChanged", "progress", "onInjected", "onMoneyValueChanged", "onPromoCodeChanged", "processAction", "sendCPA", "creditId", "", "ApplyForLoanObserver", "Companion", "DeviceContactObserver", "GetProductObserver", "Mode", "Progress", "presentation_fullRelease"})
public final class CalculatorViewModel extends ua.mycredit.mycredit.ui.bases.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableBoolean mainView = null;
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableBoolean loading = null;
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableInt money = null;
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableInt days = null;
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableField<ua.mycredit.mycredit.ui.calculator.CalculatorViewModel.Progress> moneyProcess = null;
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableField<ua.mycredit.mycredit.ui.calculator.CalculatorViewModel.Progress> daysProcess = null;
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableBoolean usePromo = null;
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableFloat discount = null;
    private float moneyDayRate;
    @org.jetbrains.annotations.NotNull()
    private ua.mycredit.mycredit.ui.calculator.CalculatorViewModel.Mode mode;
    private ua.mycredit.core.Product product;
    private final ua.mycredit.core.interactors.GetProductByPromoCodeUseCase getProductByPromoCode = null;
    private final ua.mycredit.core.interactors.ApplyForCreditUseCase applyForCredit = null;
    private final ua.mycredit.core.interactors.CPAUseCase cpaUseCase = null;
    public static final int MIN_VAL = 0;
    public static final int MAX_DAYS = 30;
    public static final int MAX_LOAN = 4000;
    public static final int ULTIMATE_LOAN = 10000;
    public static final int ULTIMATE_DAYS = 30;
    public static final int MONEY_COEF = 50;
    public static final int HUNDRED = 100;
    public static final ua.mycredit.mycredit.ui.calculator.CalculatorViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableBoolean getMainView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableBoolean getLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableInt getMoney() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableInt getDays() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableField<ua.mycredit.mycredit.ui.calculator.CalculatorViewModel.Progress> getMoneyProcess() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableField<ua.mycredit.mycredit.ui.calculator.CalculatorViewModel.Progress> getDaysProcess() {
        return null;
    }
    
    public final int getDefLoan() {
        return 0;
    }
    
    public final int getDefDays() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableBoolean getUsePromo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableFloat getDiscount() {
        return null;
    }
    
    public final float getMoneyDayRate() {
        return 0.0F;
    }
    
    public final void setMoneyDayRate(float p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.mycredit.mycredit.ui.calculator.CalculatorViewModel.Mode getMode() {
        return null;
    }
    
    public final void setMode(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.ui.calculator.CalculatorViewModel.Mode p0) {
    }
    
    @javax.inject.Inject()
    public final void onInjected() {
    }
    
    @java.lang.Override()
    public void onPromoCodeChanged() {
    }
    
    public final void onMoneyValueChanged(int progress) {
    }
    
    public final void onDaysValueChanged(int progress) {
    }
    
    public final void initByDef() {
    }
    
    public final void enterPromoCode() {
    }
    
    public final int getMoneyFrom(int money) {
        return 0;
    }
    
    public final void processAction() {
    }
    
    public final int getPercent(int money, int days) {
        return 0;
    }
    
    public final int getPercent(int money, int days, float percent) {
        return 0;
    }
    
    public final int getGiveQuantity(int money, int days) {
        return 0;
    }
    
    public final int getGiveQuantity(int money, int days, float percent) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Calendar getUntil(int days) {
        return null;
    }
    
    public final float calcDiscount(float percent) {
        return 0.0F;
    }
    
    public final void getCredit() {
    }
    
    public final void sendCPA(@org.jetbrains.annotations.NotNull()
    java.lang.String creditId) {
    }
    
    @javax.inject.Inject()
    public CalculatorViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.core.interactors.GetProductByPromoCodeUseCase getProductByPromoCode, @org.jetbrains.annotations.NotNull()
    ua.mycredit.core.interactors.ApplyForCreditUseCase applyForCredit, @org.jetbrains.annotations.NotNull()
    ua.mycredit.core.interactors.CPAUseCase cpaUseCase) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\r"}, d2 = {"Lua/mycredit/mycredit/ui/calculator/CalculatorViewModel$Progress;", "", "minProcessValue", "", "maxProcessValue", "maxProcess", "ultimate", "(IIII)V", "getMaxProcess", "()I", "getMaxProcessValue", "getMinProcessValue", "getUltimate", "presentation_fullRelease"})
    public static final class Progress {
        private final int minProcessValue = 0;
        private final int maxProcessValue = 0;
        private final int maxProcess = 0;
        private final int ultimate = 0;
        
        public final int getMinProcessValue() {
            return 0;
        }
        
        public final int getMaxProcessValue() {
            return 0;
        }
        
        public final int getMaxProcess() {
            return 0;
        }
        
        public final int getUltimate() {
            return 0;
        }
        
        public Progress(int minProcessValue, int maxProcessValue, int maxProcess, int ultimate) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\f\u0012\u0004\u0012\u00020\u00020\u0001R\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0014"}, d2 = {"Lua/mycredit/mycredit/ui/calculator/CalculatorViewModel$GetProductObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$BaseSingleObserver;", "Lua/mycredit/core/Product;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "ignorePromoError", "", "(Lua/mycredit/mycredit/ui/calculator/CalculatorViewModel;Z)V", "getIgnorePromoError", "()Z", "progressMode", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$ProgressMode$EMPTY;", "getProgressMode", "()Lua/mycredit/mycredit/ui/bases/BaseViewModel$ProgressMode$EMPTY;", "onHandleError", "e", "", "onStart", "", "onSuccess", "t", "presentation_fullRelease"})
    final class GetProductObserver extends ua.mycredit.mycredit.ui.bases.BaseViewModel.BaseSingleObserver<ua.mycredit.core.Product> {
        @org.jetbrains.annotations.NotNull()
        private final ua.mycredit.mycredit.ui.bases.BaseViewModel.ProgressMode.EMPTY progressMode = null;
        private final boolean ignorePromoError = false;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public ua.mycredit.mycredit.ui.bases.BaseViewModel.ProgressMode.EMPTY getProgressMode() {
            return null;
        }
        
        @java.lang.Override()
        public boolean onHandleError(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable e) {
            return false;
        }
        
        @java.lang.Override()
        protected void onStart() {
        }
        
        @java.lang.Override()
        public void onSuccess(@org.jetbrains.annotations.NotNull()
        ua.mycredit.core.Product t) {
        }
        
        public final boolean getIgnorePromoError() {
            return false;
        }
        
        public GetProductObserver(boolean ignorePromoError) {
            super(0, false);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\f\u0012\u0004\u0012\u00020\u00020\u0001R\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0010"}, d2 = {"Lua/mycredit/mycredit/ui/calculator/CalculatorViewModel$ApplyForLoanObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$BaseSingleObserver;", "", "Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "(Lua/mycredit/mycredit/ui/calculator/CalculatorViewModel;)V", "exitAfterCompletion", "", "getExitAfterCompletion", "()Z", "progressMode", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$ProgressMode$DIALOG;", "getProgressMode", "()Lua/mycredit/mycredit/ui/bases/BaseViewModel$ProgressMode$DIALOG;", "onSuccess", "", "t", "presentation_fullRelease"})
    final class ApplyForLoanObserver extends ua.mycredit.mycredit.ui.bases.BaseViewModel.BaseSingleObserver<java.lang.String> {
        @org.jetbrains.annotations.NotNull()
        private final ua.mycredit.mycredit.ui.bases.BaseViewModel.ProgressMode.DIALOG progressMode = null;
        private final boolean exitAfterCompletion = true;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public ua.mycredit.mycredit.ui.bases.BaseViewModel.ProgressMode.DIALOG getProgressMode() {
            return null;
        }
        
        @java.lang.Override()
        public boolean getExitAfterCompletion() {
            return false;
        }
        
        @java.lang.Override()
        public void onSuccess(@org.jetbrains.annotations.NotNull()
        java.lang.String t) {
        }
        
        public ApplyForLoanObserver() {
            super(0, false);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lua/mycredit/mycredit/ui/calculator/CalculatorViewModel$DeviceContactObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$NoResponseFromServerCompletableObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "(Lua/mycredit/mycredit/ui/calculator/CalculatorViewModel;)V", "presentation_fullRelease"})
    final class DeviceContactObserver extends ua.mycredit.mycredit.ui.bases.BaseViewModel.NoResponseFromServerCompletableObserver {
        
        public DeviceContactObserver() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B(\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\b\b\u00a2\u0006\u0002\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\b\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010\u00a8\u0006\u0011"}, d2 = {"Lua/mycredit/mycredit/ui/calculator/CalculatorViewModel$Mode;", "", "actionText", "", "perform", "Lkotlin/Function1;", "Lua/mycredit/mycredit/ui/calculator/CalculatorViewModel;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;IILkotlin/jvm/functions/Function1;)V", "getActionText", "()I", "getPerform", "()Lkotlin/jvm/functions/Function1;", "INITIAL", "CHANGE_CONDITIONS", "CALCULATOR", "presentation_fullRelease"})
    public static enum Mode {
        /*public static final*/ INITIAL /* = new INITIAL(0, null) */,
        /*public static final*/ CHANGE_CONDITIONS /* = new CHANGE_CONDITIONS(0, null) */,
        /*public static final*/ CALCULATOR /* = new CALCULATOR(0, null) */;
        private final int actionText = 0;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function1<ua.mycredit.mycredit.ui.calculator.CalculatorViewModel, kotlin.Unit> perform = null;
        
        public final int getActionText() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<ua.mycredit.mycredit.ui.calculator.CalculatorViewModel, kotlin.Unit> getPerform() {
            return null;
        }
        
        Mode(int actionText, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super ua.mycredit.mycredit.ui.calculator.CalculatorViewModel, kotlin.Unit> perform) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lua/mycredit/mycredit/ui/calculator/CalculatorViewModel$Companion;", "", "()V", "HUNDRED", "", "MAX_DAYS", "MAX_LOAN", "MIN_VAL", "MONEY_COEF", "ULTIMATE_DAYS", "ULTIMATE_LOAN", "presentation_fullRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}