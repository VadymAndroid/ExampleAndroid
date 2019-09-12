package ua.mycredit.mycredit.ui.profile.cards;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001a\u001bB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0006\u0010\u0019\u001a\u00020\u0016R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001c"}, d2 = {"Lua/mycredit/mycredit/ui/profile/cards/NewCardBackFragment;", "Lua/mycredit/mycredit/ui/bases/ViewModelFragment;", "Lua/mycredit/mycredit/ui/profile/cards/NewCardBackViewModel;", "Lua/mycredit/mycredit/databinding/FragmentCardFrontBinding;", "()V", "callback", "Lua/mycredit/mycredit/ui/profile/cards/NewCardBackFragment$Callback;", "getCallback", "()Lua/mycredit/mycredit/ui/profile/cards/NewCardBackFragment$Callback;", "card", "Lua/mycredit/core/Card;", "getCard", "()Lua/mycredit/core/Card;", "layoutId", "", "getLayoutId", "()I", "viewModelClass", "Ljava/lang/Class;", "getViewModelClass", "()Ljava/lang/Class;", "onAttach", "", "context", "Landroid/content/Context;", "validate", "Callback", "Companion", "presentation_fullDebug"})
public final class NewCardBackFragment extends ua.mycredit.mycredit.ui.bases.ViewModelFragment<ua.mycredit.mycredit.ui.profile.cards.NewCardBackViewModel, ua.mycredit.mycredit.databinding.FragmentCardFrontBinding> {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARG_CARD = "ARG_CARD";
    public static final ua.mycredit.mycredit.ui.profile.cards.NewCardBackFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Class<ua.mycredit.mycredit.ui.profile.cards.NewCardBackViewModel> getViewModelClass() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.mycredit.core.Card getCard() {
        return null;
    }
    
    private final ua.mycredit.mycredit.ui.profile.cards.NewCardBackFragment.Callback getCallback() {
        return null;
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
    }
    
    public final void validate() {
    }
    
    public NewCardBackFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lua/mycredit/mycredit/ui/profile/cards/NewCardBackFragment$Callback;", "", "onSmsVerificationRequired", "", "presentation_fullDebug"})
    public static abstract interface Callback {
        
        public abstract void onSmsVerificationRequired();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lua/mycredit/mycredit/ui/profile/cards/NewCardBackFragment$Companion;", "", "()V", "ARG_CARD", "", "presentation_fullDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}