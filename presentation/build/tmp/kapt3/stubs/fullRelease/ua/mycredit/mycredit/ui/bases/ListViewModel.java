package ua.mycredit.mycredit.ui.bases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u000534567B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010$\u001a\u00020%H\u0004J\u0012\u0010&\u001a\f0\'R\b\u0012\u0004\u0012\u00028\u00000\u0000H$J\b\u0010(\u001a\u00020\u000fH\u0016J \u0010)\u001a\f0*R\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H$J\u0016\u0010,\u001a\u00020%2\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0004J\b\u0010.\u001a\u00020%H\u0004J\b\u0010/\u001a\u00020%H\u0014J\u0012\u00100\u001a\u00020%2\n\b\u0002\u00101\u001a\u0004\u0018\u000102R\u0014\u0010\u0004\u001a\u00020\u0005X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u0005X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u000f8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R0\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013@DX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0011R\u001f\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001c8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010!\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\u00138BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\"\u0010#\u00a8\u00068"}, d2 = {"Lua/mycredit/mycredit/ui/bases/ListViewModel;", "I", "Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "()V", "emptyListText", "", "getEmptyListText", "()I", "emptyMessage", "Landroid/databinding/ObservableInt;", "getEmptyMessage", "()Landroid/databinding/ObservableInt;", "errorText", "getErrorText", "footerEnabled", "", "getFooterEnabled", "()Z", "value", "", "list", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "nestedScrollingEnabled", "getNestedScrollingEnabled", "recyclerViewAdapter", "Landroid/support/v7/widget/RecyclerView$Adapter;", "getRecyclerViewAdapter", "()Landroid/support/v7/widget/RecyclerView$Adapter;", "recyclerViewAdapter$delegate", "Lkotlin/Lazy;", "sizeWithFooter", "getSizeWithFooter", "(Ljava/util/List;)I", "clear", "", "createRecyclerViewAdapter", "Lua/mycredit/mycredit/ui/bases/ListViewModel$BaseAdapter;", "isListEmpty", "makeDiffCallback", "Lua/mycredit/mycredit/ui/bases/ListViewModel$BaseDiffUtilCallback;", "newList", "notifyListUpdated", "new", "notifyUpdateFailed", "onListUpdateTerminated", "syncEmptyMessage", "e", "", "BaseAdapter", "BaseDiffUtilCallback", "BaseViewHolder", "ItemViewHolder", "ViewType", "presentation_fullRelease"})
public abstract class ListViewModel<I extends java.lang.Object> extends ua.mycredit.mycredit.ui.bases.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy recyclerViewAdapter$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableInt emptyMessage = null;
    private final int errorText = 2131755240;
    private final int emptyListText = 2131755219;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<? extends I> list;
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.v7.widget.RecyclerView.Adapter<?> getRecyclerViewAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableInt getEmptyMessage() {
        return null;
    }
    
    protected int getErrorText() {
        return 0;
    }
    
    protected int getEmptyListText() {
        return 0;
    }
    
    public boolean getNestedScrollingEnabled() {
        return false;
    }
    
    protected boolean getFooterEnabled() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.util.List<I> getList() {
        return null;
    }
    
    protected final void setList(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends I> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract ua.mycredit.mycredit.ui.bases.ListViewModel<I>.BaseDiffUtilCallback makeDiffCallback(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends I> newList);
    
    @org.jetbrains.annotations.NotNull()
    protected abstract ua.mycredit.mycredit.ui.bases.ListViewModel<I>.BaseAdapter createRecyclerViewAdapter();
    
    public boolean isListEmpty() {
        return false;
    }
    
    protected final void clear() {
    }
    
    protected final void notifyListUpdated(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends I> p0_54480) {
    }
    
    protected final void notifyUpdateFailed() {
    }
    
    protected void onListUpdateTerminated() {
    }
    
    public final void syncEmptyMessage(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable e) {
    }
    
    private final int getSizeWithFooter(@org.jetbrains.annotations.NotNull()
    java.util.List<?> $receiver) {
        return 0;
    }
    
    public ListViewModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lua/mycredit/mycredit/ui/bases/ListViewModel$BaseViewHolder;", "I", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "(Landroid/view/View;)V", "router", "Lru/terrakok/cicerone/Router;", "getRouter", "()Lru/terrakok/cicerone/Router;", "setRouter", "(Lru/terrakok/cicerone/Router;)V", "presentation_fullRelease"})
    public static class BaseViewHolder<I extends java.lang.Object> extends android.support.v7.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        public ru.terrakok.cicerone.Router router;
        
        @org.jetbrains.annotations.NotNull()
        public final ru.terrakok.cicerone.Router getRouter() {
            return null;
        }
        
        public final void setRouter(@org.jetbrains.annotations.NotNull()
        ru.terrakok.cicerone.Router p0) {
        }
        
        public BaseViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00028\u0001H\u0016\u00a2\u0006\u0002\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\r"}, d2 = {"Lua/mycredit/mycredit/ui/bases/ListViewModel$ItemViewHolder;", "I", "Lua/mycredit/mycredit/ui/bases/ListViewModel$BaseViewHolder;", "v", "Landroid/view/View;", "(Landroid/view/View;)V", "item", "Landroid/databinding/ObservableField;", "getItem", "()Landroid/databinding/ObservableField;", "onBind", "", "(Ljava/lang/Object;)V", "presentation_fullRelease"})
    public static abstract class ItemViewHolder<I extends java.lang.Object> extends ua.mycredit.mycredit.ui.bases.ListViewModel.BaseViewHolder<I> {
        @org.jetbrains.annotations.NotNull()
        private final android.databinding.ObservableField<I> item = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.databinding.ObservableField<I> getItem() {
            return null;
        }
        
        public void onBind(I item) {
        }
        
        public ItemViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lua/mycredit/mycredit/ui/bases/ListViewModel$ViewType;", "", "(Ljava/lang/String;I)V", "ITEM", "FOOTER", "presentation_fullRelease"})
    static enum ViewType {
        /*public static final*/ ITEM /* = new ITEM() */,
        /*public static final*/ FOOTER /* = new FOOTER() */;
        
        ViewType() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u00a6\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u001e\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000f\u001a\u00020\u0010H&J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005H\u0016J\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0013H\u0014R\u0012\u0010\u0004\u001a\u00020\u0005X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0018"}, d2 = {"Lua/mycredit/mycredit/ui/bases/ListViewModel$BaseAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lua/mycredit/mycredit/ui/bases/ListViewModel$BaseViewHolder;", "(Lua/mycredit/mycredit/ui/bases/ListViewModel;)V", "itemLayoutId", "", "getItemLayoutId", "()I", "getItemCount", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateItemViewHolder", "v", "Landroid/view/View;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onInflateFooter", "inflater", "Landroid/view/LayoutInflater;", "presentation_fullRelease"})
    public abstract class BaseAdapter extends android.support.v7.widget.RecyclerView.Adapter<ua.mycredit.mycredit.ui.bases.ListViewModel.BaseViewHolder<I>> {
        
        protected abstract int getItemLayoutId();
        
        @org.jetbrains.annotations.NotNull()
        public abstract ua.mycredit.mycredit.ui.bases.ListViewModel.BaseViewHolder<I> onCreateItemViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View v);
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override()
        public int getItemViewType(int position) {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public ua.mycredit.mycredit.ui.bases.ListViewModel.BaseViewHolder<I> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        ua.mycredit.mycredit.ui.bases.ListViewModel.BaseViewHolder<I> holder, int position) {
        }
        
        @org.jetbrains.annotations.NotNull()
        protected android.view.View onInflateFooter(@org.jetbrains.annotations.NotNull()
        android.view.LayoutInflater inflater, @org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent) {
            return null;
        }
        
        public BaseAdapter() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u00a4\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\tJ\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u001d\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\tJ\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0006\u0010\u0010\u001a\u00020\u000bJ\u0006\u0010\u0011\u001a\u00020\u000bJ\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lua/mycredit/mycredit/ui/bases/ListViewModel$BaseDiffUtilCallback;", "Landroid/support/v7/util/DiffUtil$Callback;", "newList", "", "(Lua/mycredit/mycredit/ui/bases/ListViewModel;Ljava/util/List;)V", "areContentsTheSame", "", "oldItem", "newItem", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "item1", "item2", "getNewListSize", "getOldListSize", "isContentItemComparison", "isFooterComparison", "presentation_fullRelease"})
    public abstract class BaseDiffUtilCallback extends android.support.v7.util.DiffUtil.Callback {
        private final java.util.List<I> newList = null;
        
        @java.lang.Override()
        public final int getNewListSize() {
            return 0;
        }
        
        @java.lang.Override()
        public final int getOldListSize() {
            return 0;
        }
        
        public abstract boolean areItemsTheSame(I item1, I item2);
        
        public abstract boolean areContentsTheSame(I oldItem, I newItem);
        
        @java.lang.Override()
        public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
            return false;
        }
        
        private final boolean isContentItemComparison(int oldItemPosition, int newItemPosition) {
            return false;
        }
        
        private final boolean isFooterComparison(int oldItemPosition, int newItemPosition) {
            return false;
        }
        
        public BaseDiffUtilCallback(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends I> newList) {
            super();
        }
    }
}