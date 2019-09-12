package ua.mycredit.mycredit.ui.profile.cards;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006789:;<B\'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0006\u0010%\u001a\u00020&J\u0012\u0010\'\u001a\f0(R\b\u0012\u0004\u0012\u00020\u00020)H\u0014J\u000e\u0010*\u001a\u00020&2\u0006\u0010+\u001a\u00020\u0002J \u0010,\u001a\f0-R\b\u0012\u0004\u0012\u00020\u00020)2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020/H\u0014J\b\u00100\u001a\u00020&H\u0016J\b\u00101\u001a\u00020&H\u0016J\b\u00102\u001a\u00020&H\u0016J\b\u00103\u001a\u00020&H\u0016J\b\u00104\u001a\u00020&H\u0014J\b\u00105\u001a\u00020&H\u0016J\u0006\u00106\u001a\u00020&R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u0014X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u0018X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u0018X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006="}, d2 = {"Lua/mycredit/mycredit/ui/profile/cards/CardsViewModel;", "Lua/mycredit/mycredit/ui/bases/LazyListViewModel;", "Lua/mycredit/core/Card;", "Lua/mycredit/mycredit/ui/bases/action/WithRefresh;", "loadItems", "Lua/mycredit/core/interactors/LoadCardsUseCase;", "markAsMain", "Lua/mycredit/core/interactors/MarkAsMainUseCase;", "verifyCard", "Lua/mycredit/core/interactors/VerifyCardUseCase;", "deleteCard", "Lua/mycredit/core/interactors/DeleteCardUseCase;", "(Lua/mycredit/core/interactors/LoadCardsUseCase;Lua/mycredit/core/interactors/MarkAsMainUseCase;Lua/mycredit/core/interactors/VerifyCardUseCase;Lua/mycredit/core/interactors/DeleteCardUseCase;)V", "checkedCard", "Landroid/databinding/ObservableField;", "getCheckedCard", "()Landroid/databinding/ObservableField;", "setCheckedCard", "(Landroid/databinding/ObservableField;)V", "emptyListText", "", "getEmptyListText", "()I", "footerEnabled", "", "getFooterEnabled", "()Z", "getLoadItems", "()Lua/mycredit/core/interactors/LoadCardsUseCase;", "mode", "Lua/mycredit/mycredit/ui/profile/cards/CardsViewModel$Mode;", "getMode", "()Lua/mycredit/mycredit/ui/profile/cards/CardsViewModel$Mode;", "setMode", "(Lua/mycredit/mycredit/ui/profile/cards/CardsViewModel$Mode;)V", "nestedScrollingEnabled", "getNestedScrollingEnabled", "addCard", "", "createRecyclerViewAdapter", "Lua/mycredit/mycredit/ui/bases/ListViewModel$BaseAdapter;", "Lua/mycredit/mycredit/ui/bases/ListViewModel;", "delete", "card", "makeDiffCallback", "Lua/mycredit/mycredit/ui/bases/ListViewModel$BaseDiffUtilCallback;", "newList", "", "onBankingCompleted", "onCardAdded", "onCardDeleted", "onCardVerified", "onListUpdateTerminated", "onMainCardChanged", "processSelectionFinished", "AdapterImpl", "DeleteCardObserver", "DiffUtilCallbackImpl", "MarkAsMainObserver", "Mode", "VerificationObserver", "presentation_fullDebug"})
public final class CardsViewModel extends ua.mycredit.mycredit.ui.bases.LazyListViewModel<ua.mycredit.core.Card> implements ua.mycredit.mycredit.ui.bases.action.WithRefresh {
    private final int emptyListText = 2131755425;
    private final boolean nestedScrollingEnabled = false;
    private final boolean footerEnabled = true;
    @org.jetbrains.annotations.NotNull()
    private ua.mycredit.mycredit.ui.profile.cards.CardsViewModel.Mode mode;
    @org.jetbrains.annotations.NotNull()
    private android.databinding.ObservableField<ua.mycredit.core.Card> checkedCard;
    @org.jetbrains.annotations.NotNull()
    private final ua.mycredit.core.interactors.LoadCardsUseCase loadItems = null;
    private final ua.mycredit.core.interactors.MarkAsMainUseCase markAsMain = null;
    private final ua.mycredit.core.interactors.VerifyCardUseCase verifyCard = null;
    private final ua.mycredit.core.interactors.DeleteCardUseCase deleteCard = null;
    
    @java.lang.Override()
    protected int getEmptyListText() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean getNestedScrollingEnabled() {
        return false;
    }
    
    @java.lang.Override()
    protected boolean getFooterEnabled() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.mycredit.mycredit.ui.profile.cards.CardsViewModel.Mode getMode() {
        return null;
    }
    
    public final void setMode(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.ui.profile.cards.CardsViewModel.Mode p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableField<ua.mycredit.core.Card> getCheckedCard() {
        return null;
    }
    
    public final void setCheckedCard(@org.jetbrains.annotations.NotNull()
    android.databinding.ObservableField<ua.mycredit.core.Card> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected ua.mycredit.mycredit.ui.bases.ListViewModel<ua.mycredit.core.Card>.BaseDiffUtilCallback makeDiffCallback(@org.jetbrains.annotations.NotNull()
    java.util.List<ua.mycredit.core.Card> newList) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected ua.mycredit.mycredit.ui.bases.ListViewModel<ua.mycredit.core.Card>.BaseAdapter createRecyclerViewAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public void onBankingCompleted() {
    }
    
    @java.lang.Override()
    public void onCardAdded() {
    }
    
    @java.lang.Override()
    public void onCardDeleted() {
    }
    
    @java.lang.Override()
    public void onCardVerified() {
    }
    
    @java.lang.Override()
    public void onMainCardChanged() {
    }
    
    @java.lang.Override()
    protected void onListUpdateTerminated() {
    }
    
    public final void addCard() {
    }
    
    public final void delete(@org.jetbrains.annotations.NotNull()
    ua.mycredit.core.Card card) {
    }
    
    public final void processSelectionFinished() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.mycredit.core.interactors.LoadCardsUseCase getLoadItems() {
        return null;
    }
    
    @javax.inject.Inject()
    public CardsViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.core.interactors.LoadCardsUseCase loadItems, @org.jetbrains.annotations.NotNull()
    ua.mycredit.core.interactors.MarkAsMainUseCase markAsMain, @org.jetbrains.annotations.NotNull()
    ua.mycredit.core.interactors.VerifyCardUseCase verifyCard, @org.jetbrains.annotations.NotNull()
    ua.mycredit.core.interactors.DeleteCardUseCase deleteCard) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\f0\u0001R\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\n0\nR\u00060\u0000R\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014R\u0014\u0010\u0005\u001a\u00020\u00068TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lua/mycredit/mycredit/ui/profile/cards/CardsViewModel$AdapterImpl;", "Lua/mycredit/mycredit/ui/bases/ListViewModel$BaseAdapter;", "Lua/mycredit/mycredit/ui/bases/ListViewModel;", "Lua/mycredit/core/Card;", "(Lua/mycredit/mycredit/ui/profile/cards/CardsViewModel;)V", "itemLayoutId", "", "getItemLayoutId", "()I", "onCreateItemViewHolder", "Lua/mycredit/mycredit/ui/profile/cards/CardsViewModel$AdapterImpl$CardViewHolder;", "Lua/mycredit/mycredit/ui/profile/cards/CardsViewModel;", "v", "Landroid/view/View;", "onInflateFooter", "inflater", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/ViewGroup;", "CardViewHolder", "presentation_fullDebug"})
    public final class AdapterImpl extends ua.mycredit.mycredit.ui.bases.ListViewModel<ua.mycredit.core.Card>.BaseAdapter {
        
        @java.lang.Override()
        protected int getItemLayoutId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public ua.mycredit.mycredit.ui.profile.cards.CardsViewModel.AdapterImpl.CardViewHolder onCreateItemViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected android.view.View onInflateFooter(@org.jetbrains.annotations.NotNull()
        android.view.LayoutInflater inflater, @org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent) {
            return null;
        }
        
        public AdapterImpl() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0004J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0004R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0017"}, d2 = {"Lua/mycredit/mycredit/ui/profile/cards/CardsViewModel$AdapterImpl$CardViewHolder;", "Lua/mycredit/mycredit/ui/bases/ListViewModel$ItemViewHolder;", "Lua/mycredit/core/Card;", "v", "Landroid/view/View;", "(Lua/mycredit/mycredit/ui/profile/cards/CardsViewModel$AdapterImpl;Landroid/view/View;)V", "checked", "Landroid/databinding/ObservableBoolean;", "getChecked", "()Landroid/databinding/ObservableBoolean;", "mode", "Lua/mycredit/mycredit/ui/profile/cards/CardsViewModel$Mode;", "getMode", "()Lua/mycredit/mycredit/ui/profile/cards/CardsViewModel$Mode;", "markAsSelected", "", "onBind", "item", "onMenuItemClick", "", "menuItem", "Landroid/view/MenuItem;", "showPopUpMenu", "presentation_fullDebug"})
        public final class CardViewHolder extends ua.mycredit.mycredit.ui.bases.ListViewModel.ItemViewHolder<ua.mycredit.core.Card> {
            @org.jetbrains.annotations.NotNull()
            private final android.databinding.ObservableBoolean checked = null;
            
            @org.jetbrains.annotations.NotNull()
            public final ua.mycredit.mycredit.ui.profile.cards.CardsViewModel.Mode getMode() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.databinding.ObservableBoolean getChecked() {
                return null;
            }
            
            @java.lang.Override()
            public void onBind(@org.jetbrains.annotations.NotNull()
            ua.mycredit.core.Card item) {
            }
            
            public final void showPopUpMenu(@org.jetbrains.annotations.NotNull()
            android.view.View v) {
            }
            
            public final void markAsSelected(@org.jetbrains.annotations.NotNull()
            android.view.View v) {
            }
            
            private final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                return false;
            }
            
            public CardViewHolder(@org.jetbrains.annotations.NotNull()
            android.view.View v) {
                super(null);
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\f0\u0001R\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0016J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0016\u00a8\u0006\u000e"}, d2 = {"Lua/mycredit/mycredit/ui/profile/cards/CardsViewModel$DiffUtilCallbackImpl;", "Lua/mycredit/mycredit/ui/bases/ListViewModel$BaseDiffUtilCallback;", "Lua/mycredit/mycredit/ui/bases/ListViewModel;", "Lua/mycredit/core/Card;", "newList", "", "(Lua/mycredit/mycredit/ui/profile/cards/CardsViewModel;Ljava/util/List;)V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "item1", "item2", "presentation_fullDebug"})
    final class DiffUtilCallbackImpl extends ua.mycredit.mycredit.ui.bases.ListViewModel<ua.mycredit.core.Card>.BaseDiffUtilCallback {
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        ua.mycredit.core.Card item1, @org.jetbrains.annotations.NotNull()
        ua.mycredit.core.Card item2) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        ua.mycredit.core.Card oldItem, @org.jetbrains.annotations.NotNull()
        ua.mycredit.core.Card newItem) {
            return false;
        }
        
        public DiffUtilCallbackImpl(@org.jetbrains.annotations.NotNull()
        java.util.List<ua.mycredit.core.Card> newList) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lua/mycredit/mycredit/ui/profile/cards/CardsViewModel$MarkAsMainObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$BaseCompletableObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "(Lua/mycredit/mycredit/ui/profile/cards/CardsViewModel;)V", "onComplete", "", "onMapError", "", "e", "", "presentation_fullDebug"})
    final class MarkAsMainObserver extends ua.mycredit.mycredit.ui.bases.BaseViewModel.BaseCompletableObserver {
        
        @java.lang.Override()
        public int onMapError(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable e) {
            return 0;
        }
        
        @java.lang.Override()
        public void onComplete() {
        }
        
        public MarkAsMainObserver() {
            super(0, false);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\f\u0012\u0004\u0012\u00020\u00020\u0001R\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\b"}, d2 = {"Lua/mycredit/mycredit/ui/profile/cards/CardsViewModel$VerificationObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$BaseSingleObserver;", "Lua/mycredit/core/CardVerificationType;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "(Lua/mycredit/mycredit/ui/profile/cards/CardsViewModel;)V", "onSuccess", "", "t", "presentation_fullDebug"})
    final class VerificationObserver extends ua.mycredit.mycredit.ui.bases.BaseViewModel.BaseSingleObserver<ua.mycredit.core.CardVerificationType> {
        
        @java.lang.Override()
        public void onSuccess(@org.jetbrains.annotations.NotNull()
        ua.mycredit.core.CardVerificationType t) {
        }
        
        public VerificationObserver() {
            super(0, false);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lua/mycredit/mycredit/ui/profile/cards/CardsViewModel$DeleteCardObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$BaseCompletableObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "(Lua/mycredit/mycredit/ui/profile/cards/CardsViewModel;)V", "onComplete", "", "presentation_fullDebug"})
    final class DeleteCardObserver extends ua.mycredit.mycredit.ui.bases.BaseViewModel.BaseCompletableObserver {
        
        @java.lang.Override()
        public void onComplete() {
        }
        
        public DeleteCardObserver() {
            super(0, false);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lua/mycredit/mycredit/ui/profile/cards/CardsViewModel$Mode;", "", "(Ljava/lang/String;I)V", "MY_CARDS", "PICKER", "presentation_fullDebug"})
    public static enum Mode {
        /*public static final*/ MY_CARDS /* = new MY_CARDS() */,
        /*public static final*/ PICKER /* = new PICKER() */;
        
        Mode() {
        }
    }
}