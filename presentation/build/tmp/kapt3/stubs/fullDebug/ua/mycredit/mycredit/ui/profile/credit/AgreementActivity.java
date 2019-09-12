package ua.mycredit.mycredit.ui.profile.credit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u000e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\bR\u0014\u0010\u0003\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lua/mycredit/mycredit/ui/profile/credit/AgreementActivity;", "Lua/mycredit/mycredit/ui/bases/BaseActivity;", "()V", "agreementType", "Lua/mycredit/core/AgreementType;", "getAgreementType", "()Lua/mycredit/core/AgreementType;", "layoutId", "", "getLayoutId", "()I", "navigator", "Lru/terrakok/cicerone/Navigator;", "getNavigator", "()Lru/terrakok/cicerone/Navigator;", "jsScriptDo", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "sendAnalyticEvent", "creditHistory", "Companion", "NavigatorImpl", "presentation_fullDebug"})
public final class AgreementActivity extends ua.mycredit.mycredit.ui.bases.BaseActivity {
    private final int layoutId = 2131492893;
    @org.jetbrains.annotations.NotNull()
    private final ru.terrakok.cicerone.Navigator navigator = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String EXTRA_AGREEMENT_TYPE = null;
    public static final ua.mycredit.mycredit.ui.profile.credit.AgreementActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected ru.terrakok.cicerone.Navigator getNavigator() {
        return null;
    }
    
    private final ua.mycredit.core.AgreementType getAgreementType() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void sendAnalyticEvent(int creditHistory) {
    }
    
    @android.annotation.SuppressLint(value = {"SetJavaScriptEnabled"})
    public final void jsScriptDo() {
    }
    
    public AgreementActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014\u00a8\u0006\b"}, d2 = {"Lua/mycredit/mycredit/ui/profile/credit/AgreementActivity$NavigatorImpl;", "Lua/mycredit/mycredit/ui/bases/BaseActivity$BaseNavigator;", "Lua/mycredit/mycredit/ui/bases/BaseActivity;", "(Lua/mycredit/mycredit/ui/profile/credit/AgreementActivity;)V", "applyCommand", "", "command", "Lru/terrakok/cicerone/commands/Command;", "presentation_fullDebug"})
    final class NavigatorImpl extends ua.mycredit.mycredit.ui.bases.BaseActivity.BaseNavigator {
        
        @java.lang.Override()
        protected void applyCommand(@org.jetbrains.annotations.NotNull()
        ru.terrakok.cicerone.commands.Command command) {
        }
        
        public NavigatorImpl() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lua/mycredit/mycredit/ui/profile/credit/AgreementActivity$Companion;", "", "()V", "EXTRA_AGREEMENT_TYPE", "", "getEXTRA_AGREEMENT_TYPE", "()Ljava/lang/String;", "presentation_fullDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEXTRA_AGREEMENT_TYPE() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}