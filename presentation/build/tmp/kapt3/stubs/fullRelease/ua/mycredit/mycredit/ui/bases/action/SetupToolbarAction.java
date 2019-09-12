package ua.mycredit.mycredit.ui.bases.action;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014R\u001c\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0015"}, d2 = {"Lua/mycredit/mycredit/ui/bases/action/SetupToolbarAction;", "", "titleRes", "", "menuRes", "menuItemClick", "Lkotlin/Function1;", "", "(IILkotlin/jvm/functions/Function1;)V", "router", "Lru/terrakok/cicerone/Router;", "getTitleRes", "()I", "onMenuItemClick", "item", "Landroid/view/MenuItem;", "onNavigationClick", "", "perform", "activity", "Lua/mycredit/mycredit/ui/bases/BaseActivity;", "presentation_fullRelease"})
public final class SetupToolbarAction {
    private ru.terrakok.cicerone.Router router;
    private final int titleRes = 0;
    private final int menuRes = 0;
    private final kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Boolean> menuItemClick = null;
    
    public final void perform(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.ui.bases.BaseActivity activity) {
    }
    
    public final boolean onMenuItemClick(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    public final void onNavigationClick() {
    }
    
    public final int getTitleRes() {
        return 0;
    }
    
    public SetupToolbarAction(int titleRes, int menuRes, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Boolean> menuItemClick) {
        super();
    }
    
    public SetupToolbarAction() {
        super();
    }
}