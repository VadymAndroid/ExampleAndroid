package ua.mycredit.mycredit.ui.bases.action;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010\t\u001a\u00020\bH$J\u0006\u0010\n\u001a\u00020\bR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lua/mycredit/mycredit/ui/bases/action/Refreshable;", "", "()V", "refreshing", "Landroid/databinding/ObservableBoolean;", "getRefreshing", "()Landroid/databinding/ObservableBoolean;", "notifyRefreshTerminated", "", "onRefresh", "refresh", "OnRefreshedCallback", "presentation_fullDebug"})
public abstract class Refreshable {
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableBoolean refreshing = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableBoolean getRefreshing() {
        return null;
    }
    
    protected abstract void onRefresh();
    
    public final void refresh() {
    }
    
    public final void notifyRefreshTerminated() {
    }
    
    public Refreshable() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lua/mycredit/mycredit/ui/bases/action/Refreshable$OnRefreshedCallback;", "Landroid/databinding/Observable$OnPropertyChangedCallback;", "(Lua/mycredit/mycredit/ui/bases/action/Refreshable;)V", "onPropertyChanged", "", "sender", "Landroid/databinding/Observable;", "propertyId", "", "presentation_fullDebug"})
    final class OnRefreshedCallback extends android.databinding.Observable.OnPropertyChangedCallback {
        
        @java.lang.Override()
        public void onPropertyChanged(@org.jetbrains.annotations.Nullable()
        android.databinding.Observable sender, int propertyId) {
        }
        
        public OnRefreshedCallback() {
            super();
        }
    }
}