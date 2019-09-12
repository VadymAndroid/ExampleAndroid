package ua.mycredit.mycredit.internal.impls;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tRC\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f8V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00168V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001c\u0010\u000b\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR;\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\f2\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\f8V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\b!\u0010\u0015\u001a\u0004\b\u001f\u0010\u0011\"\u0004\b \u0010\u0013R+\u0010#\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\"8V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\b(\u0010\u000b\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R+\u0010)\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\"8V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\b,\u0010\u000b\u001a\u0004\b*\u0010%\"\u0004\b+\u0010\'RC\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\r0\f2\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\r0\f8V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\b1\u0010\u0015\u001a\u0004\b/\u0010\u0011\"\u0004\b0\u0010\u0013R+\u00102\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\"8V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\b5\u0010\u000b\u001a\u0004\b3\u0010%\"\u0004\b4\u0010\'R+\u00106\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\"8V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\b9\u0010\u000b\u001a\u0004\b7\u0010%\"\u0004\b8\u0010\'R+\u0010:\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\"8V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\b=\u0010\u000b\u001a\u0004\b;\u0010%\"\u0004\b<\u0010\'R+\u0010?\u001a\u00020>2\u0006\u0010\u0003\u001a\u00020>8V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\bD\u0010\u000b\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR+\u0010F\u001a\u00020E2\u0006\u0010\u0003\u001a\u00020E8V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\bK\u0010\u000b\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR/\u0010L\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000e8V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\bQ\u0010\u000b\u001a\u0004\bM\u0010N\"\u0004\bO\u0010P\u00a8\u0006R"}, d2 = {"Lua/mycredit/mycredit/internal/impls/LocalStorageImpl;", "Lua/mycredit/core/LocalStorage;", "()V", "<set-?>", "Lorg/joda/time/DateTime;", "agreementTime", "getAgreementTime", "()Lorg/joda/time/DateTime;", "setAgreementTime", "(Lorg/joda/time/DateTime;)V", "agreementTime$delegate", "Lua/mycredit/mycredit/internal/impls/StorageProperty;", "Lua/mycredit/core/LocalStorage$ExpirableValue;", "", "Lua/mycredit/core/Card;", "cards", "getCards", "()Lua/mycredit/core/LocalStorage$ExpirableValue;", "setCards", "(Lua/mycredit/core/LocalStorage$ExpirableValue;)V", "cards$delegate", "Lua/mycredit/mycredit/internal/impls/ExpirableProperty;", "Lua/mycredit/core/CreditPreferences;", "creditPreferences", "getCreditPreferences", "()Lua/mycredit/core/CreditPreferences;", "setCreditPreferences", "(Lua/mycredit/core/CreditPreferences;)V", "creditPreferences$delegate", "Lua/mycredit/core/Product;", "creditProduct", "getCreditProduct", "setCreditProduct", "creditProduct$delegate", "", "dataProcessAllowed", "getDataProcessAllowed", "()Z", "setDataProcessAllowed", "(Z)V", "dataProcessAllowed$delegate", "daysNoteShown", "getDaysNoteShown", "setDaysNoteShown", "daysNoteShown$delegate", "Lua/mycredit/core/Credit;", "history", "getHistory", "setHistory", "history$delegate", "mailSubscription", "getMailSubscription", "setMailSubscription", "mailSubscription$delegate", "moneyNoteShown", "getMoneyNoteShown", "setMoneyNoteShown", "moneyNoteShown$delegate", "onboardingShown", "getOnboardingShown", "setOnboardingShown", "onboardingShown$delegate", "Lua/mycredit/core/Profile;", "profile", "getProfile", "()Lua/mycredit/core/Profile;", "setProfile", "(Lua/mycredit/core/Profile;)V", "profile$delegate", "", "promoCode", "getPromoCode", "()Ljava/lang/String;", "setPromoCode", "(Ljava/lang/String;)V", "promoCode$delegate", "selectedCard", "getSelectedCard", "()Lua/mycredit/core/Card;", "setSelectedCard", "(Lua/mycredit/core/Card;)V", "selectedCard$delegate", "presentation_fullRelease"})
@javax.inject.Singleton()
public final class LocalStorageImpl implements ua.mycredit.core.LocalStorage {
    @org.jetbrains.annotations.NotNull()
    private final ua.mycredit.mycredit.internal.impls.StorageProperty onboardingShown$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final ua.mycredit.mycredit.internal.impls.StorageProperty moneyNoteShown$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final ua.mycredit.mycredit.internal.impls.StorageProperty daysNoteShown$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final ua.mycredit.mycredit.internal.impls.StorageProperty profile$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final ua.mycredit.mycredit.internal.impls.StorageProperty agreementTime$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final ua.mycredit.mycredit.internal.impls.StorageProperty creditPreferences$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final ua.mycredit.mycredit.internal.impls.StorageProperty promoCode$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final ua.mycredit.mycredit.internal.impls.ExpirableProperty creditProduct$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final ua.mycredit.mycredit.internal.impls.StorageProperty mailSubscription$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final ua.mycredit.mycredit.internal.impls.StorageProperty dataProcessAllowed$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final ua.mycredit.mycredit.internal.impls.ExpirableProperty cards$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private final ua.mycredit.mycredit.internal.impls.StorageProperty selectedCard$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final ua.mycredit.mycredit.internal.impls.ExpirableProperty history$delegate = null;
    
    @java.lang.Override()
    public boolean getOnboardingShown() {
        return false;
    }
    
    @java.lang.Override()
    public void setOnboardingShown(boolean p0) {
    }
    
    @java.lang.Override()
    public boolean getMoneyNoteShown() {
        return false;
    }
    
    @java.lang.Override()
    public void setMoneyNoteShown(boolean p0) {
    }
    
    @java.lang.Override()
    public boolean getDaysNoteShown() {
        return false;
    }
    
    @java.lang.Override()
    public void setDaysNoteShown(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.mycredit.core.Profile getProfile() {
        return null;
    }
    
    @java.lang.Override()
    public void setProfile(@org.jetbrains.annotations.NotNull()
    ua.mycredit.core.Profile p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.joda.time.DateTime getAgreementTime() {
        return null;
    }
    
    @java.lang.Override()
    public void setAgreementTime(@org.jetbrains.annotations.NotNull()
    org.joda.time.DateTime p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.mycredit.core.CreditPreferences getCreditPreferences() {
        return null;
    }
    
    @java.lang.Override()
    public void setCreditPreferences(@org.jetbrains.annotations.NotNull()
    ua.mycredit.core.CreditPreferences p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getPromoCode() {
        return null;
    }
    
    @java.lang.Override()
    public void setPromoCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.mycredit.core.LocalStorage.ExpirableValue<ua.mycredit.core.Product> getCreditProduct() {
        return null;
    }
    
    @java.lang.Override()
    public void setCreditProduct(@org.jetbrains.annotations.NotNull()
    ua.mycredit.core.LocalStorage.ExpirableValue<ua.mycredit.core.Product> p0) {
    }
    
    @java.lang.Override()
    public boolean getMailSubscription() {
        return false;
    }
    
    @java.lang.Override()
    public void setMailSubscription(boolean p0) {
    }
    
    @java.lang.Override()
    public boolean getDataProcessAllowed() {
        return false;
    }
    
    @java.lang.Override()
    public void setDataProcessAllowed(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.mycredit.core.LocalStorage.ExpirableValue<java.util.List<ua.mycredit.core.Card>> getCards() {
        return null;
    }
    
    @java.lang.Override()
    public void setCards(@org.jetbrains.annotations.NotNull()
    ua.mycredit.core.LocalStorage.ExpirableValue<java.util.List<ua.mycredit.core.Card>> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public ua.mycredit.core.Card getSelectedCard() {
        return null;
    }
    
    @java.lang.Override()
    public void setSelectedCard(@org.jetbrains.annotations.Nullable()
    ua.mycredit.core.Card p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.mycredit.core.LocalStorage.ExpirableValue<java.util.List<ua.mycredit.core.Credit>> getHistory() {
        return null;
    }
    
    @java.lang.Override()
    public void setHistory(@org.jetbrains.annotations.NotNull()
    ua.mycredit.core.LocalStorage.ExpirableValue<java.util.List<ua.mycredit.core.Credit>> p0) {
    }
    
    @javax.inject.Inject()
    public LocalStorageImpl() {
        super();
    }
}