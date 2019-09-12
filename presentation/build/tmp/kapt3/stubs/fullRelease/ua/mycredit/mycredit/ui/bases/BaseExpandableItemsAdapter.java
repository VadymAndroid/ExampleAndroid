package ua.mycredit.mycredit.ui.bases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0018\b\u0001\u0010\u0002*\u00120\u0003R\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00002\b\u0012\u0004\u0012\u0002H\u00020\u0004:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\f\u001a\u00020\u0007J\u001d\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u0007H\u0017\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0013"}, d2 = {"Lua/mycredit/mycredit/ui/bases/BaseExpandableItemsAdapter;", "T", "VH", "Lua/mycredit/mycredit/ui/bases/BaseExpandableItemsAdapter$ItemViewHolder;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "()V", "expandedItemIndex", "", "items", "", "getItems", "()Ljava/util/List;", "getItemCount", "onBindViewHolder", "", "holder", "position", "(Lua/mycredit/mycredit/ui/bases/BaseExpandableItemsAdapter$ItemViewHolder;I)V", "ItemViewHolder", "presentation_fullRelease"})
public abstract class BaseExpandableItemsAdapter<T extends java.lang.Object, VH extends ua.mycredit.mycredit.ui.bases.BaseExpandableItemsAdapter<T, VH>.ItemViewHolder> extends android.support.v7.widget.RecyclerView.Adapter<VH> {
    private int expandedItemIndex;
    
    @org.jetbrains.annotations.NotNull()
    protected abstract java.util.List<T> getItems();
    
    @java.lang.Override()
    public final int getItemCount() {
        return 0;
    }
    
    @android.support.annotation.CallSuper()
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    VH holder, int position) {
    }
    
    public BaseExpandableItemsAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0096\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0011"}, d2 = {"Lua/mycredit/mycredit/ui/bases/BaseExpandableItemsAdapter$ItemViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "(Lua/mycredit/mycredit/ui/bases/BaseExpandableItemsAdapter;Landroid/view/View;)V", "expanded", "Landroid/databinding/ObservableBoolean;", "getExpanded", "()Landroid/databinding/ObservableBoolean;", "item", "Landroid/databinding/ObservableField;", "getItem", "()Landroid/databinding/ObservableField;", "setItem", "(Landroid/databinding/ObservableField;)V", "expand", "", "presentation_fullRelease"})
    public class ItemViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.databinding.ObservableField<T> item;
        @org.jetbrains.annotations.NotNull()
        private final android.databinding.ObservableBoolean expanded = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.databinding.ObservableField<T> getItem() {
            return null;
        }
        
        public final void setItem(@org.jetbrains.annotations.NotNull()
        android.databinding.ObservableField<T> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.databinding.ObservableBoolean getExpanded() {
            return null;
        }
        
        public final void expand() {
        }
        
        public ItemViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
            super(null);
        }
    }
}