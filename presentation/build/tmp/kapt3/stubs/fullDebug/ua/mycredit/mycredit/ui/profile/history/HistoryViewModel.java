package ua.mycredit.mycredit.ui.profile.history;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0003\u0016\u0017\u0018B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\r\u001a\f0\u000eR\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0014J \u0010\u0010\u001a\f0\u0011R\b\u0012\u0004\u0012\u00020\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0019"}, d2 = {"Lua/mycredit/mycredit/ui/profile/history/HistoryViewModel;", "Lua/mycredit/mycredit/ui/bases/LazyListViewModel;", "Lua/mycredit/core/Credit;", "Lua/mycredit/mycredit/ui/bases/action/WithRefresh;", "loadItems", "Lua/mycredit/core/interactors/LoadHistoryUseCase;", "(Lua/mycredit/core/interactors/LoadHistoryUseCase;)V", "emptyListText", "", "getEmptyListText", "()I", "getLoadItems", "()Lua/mycredit/core/interactors/LoadHistoryUseCase;", "createRecyclerViewAdapter", "Lua/mycredit/mycredit/ui/bases/ListViewModel$BaseAdapter;", "Lua/mycredit/mycredit/ui/bases/ListViewModel;", "makeDiffCallback", "Lua/mycredit/mycredit/ui/bases/ListViewModel$BaseDiffUtilCallback;", "newList", "", "onStatusUpdated", "", "AdapterImpl", "DiffUtilCallbackImpl", "LoanViewHolder", "presentation_fullDebug"})
public final class HistoryViewModel extends ua.mycredit.mycredit.ui.bases.LazyListViewModel<ua.mycredit.core.Credit> implements ua.mycredit.mycredit.ui.bases.action.WithRefresh {
    private final int emptyListText = 2131755579;
    @org.jetbrains.annotations.NotNull()
    private final ua.mycredit.core.interactors.LoadHistoryUseCase loadItems = null;
    
    @java.lang.Override()
    protected int getEmptyListText() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected ua.mycredit.mycredit.ui.bases.ListViewModel<ua.mycredit.core.Credit>.BaseDiffUtilCallback makeDiffCallback(@org.jetbrains.annotations.NotNull()
    java.util.List<ua.mycredit.core.Credit> newList) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected ua.mycredit.mycredit.ui.bases.ListViewModel<ua.mycredit.core.Credit>.BaseAdapter createRecyclerViewAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public void onStatusUpdated() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.mycredit.core.interactors.LoadHistoryUseCase getLoadItems() {
        return null;
    }
    
    @javax.inject.Inject()
    public HistoryViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.core.interactors.LoadHistoryUseCase loadItems) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lua/mycredit/mycredit/ui/profile/history/HistoryViewModel$LoanViewHolder;", "Lua/mycredit/mycredit/ui/bases/ListViewModel$ItemViewHolder;", "Lua/mycredit/core/Credit;", "v", "Landroid/view/View;", "(Lua/mycredit/mycredit/ui/profile/history/HistoryViewModel;Landroid/view/View;)V", "presentation_fullDebug"})
    public final class LoanViewHolder extends ua.mycredit.mycredit.ui.bases.ListViewModel.ItemViewHolder<ua.mycredit.core.Credit> {
        
        public LoanViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\f0\u0001R\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\t\u001a\u00060\nR\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0005\u001a\u00020\u00068TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000e"}, d2 = {"Lua/mycredit/mycredit/ui/profile/history/HistoryViewModel$AdapterImpl;", "Lua/mycredit/mycredit/ui/bases/ListViewModel$BaseAdapter;", "Lua/mycredit/mycredit/ui/bases/ListViewModel;", "Lua/mycredit/core/Credit;", "(Lua/mycredit/mycredit/ui/profile/history/HistoryViewModel;)V", "itemLayoutId", "", "getItemLayoutId", "()I", "onCreateItemViewHolder", "Lua/mycredit/mycredit/ui/profile/history/HistoryViewModel$LoanViewHolder;", "Lua/mycredit/mycredit/ui/profile/history/HistoryViewModel;", "v", "Landroid/view/View;", "presentation_fullDebug"})
    final class AdapterImpl extends ua.mycredit.mycredit.ui.bases.ListViewModel<ua.mycredit.core.Credit>.BaseAdapter {
        
        @java.lang.Override()
        protected int getItemLayoutId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public ua.mycredit.mycredit.ui.profile.history.HistoryViewModel.LoanViewHolder onCreateItemViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
            return null;
        }
        
        public AdapterImpl() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\f0\u0001R\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0016J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0016\u00a8\u0006\u000e"}, d2 = {"Lua/mycredit/mycredit/ui/profile/history/HistoryViewModel$DiffUtilCallbackImpl;", "Lua/mycredit/mycredit/ui/bases/ListViewModel$BaseDiffUtilCallback;", "Lua/mycredit/mycredit/ui/bases/ListViewModel;", "Lua/mycredit/core/Credit;", "newList", "", "(Lua/mycredit/mycredit/ui/profile/history/HistoryViewModel;Ljava/util/List;)V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "item1", "item2", "presentation_fullDebug"})
    final class DiffUtilCallbackImpl extends ua.mycredit.mycredit.ui.bases.ListViewModel<ua.mycredit.core.Credit>.BaseDiffUtilCallback {
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        ua.mycredit.core.Credit item1, @org.jetbrains.annotations.NotNull()
        ua.mycredit.core.Credit item2) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        ua.mycredit.core.Credit oldItem, @org.jetbrains.annotations.NotNull()
        ua.mycredit.core.Credit newItem) {
            return false;
        }
        
        public DiffUtilCallbackImpl(@org.jetbrains.annotations.NotNull()
        java.util.List<ua.mycredit.core.Credit> newList) {
            super(null);
        }
    }
}