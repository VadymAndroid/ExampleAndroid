package ua.mycredit.mycredit.ui.bases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003:\u0001\u0011B\u0005\u00a2\u0006\u0002\u0010\u0004R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0012"}, d2 = {"Lua/mycredit/mycredit/ui/bases/LazyListViewModel;", "I", "Lua/mycredit/mycredit/ui/bases/ListViewModel;", "Lua/mycredit/mycredit/ui/bases/action/WithRefresh;", "()V", "asRefreshable", "Lua/mycredit/mycredit/ui/bases/action/Refreshable;", "getAsRefreshable", "()Lua/mycredit/mycredit/ui/bases/action/Refreshable;", "asRefreshable$delegate", "Lkotlin/Lazy;", "loadItems", "Lua/mycredit/core/UseCase$ParametrizedUseCase;", "Lua/mycredit/core/BaseUseCase$ReloadCriteria;", "", "getLoadItems", "()Lua/mycredit/core/UseCase$ParametrizedUseCase;", "BaseRefreshable", "presentation_fullDebug"})
public abstract class LazyListViewModel<I extends java.lang.Object> extends ua.mycredit.mycredit.ui.bases.ListViewModel<I> implements ua.mycredit.mycredit.ui.bases.action.WithRefresh {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy asRefreshable$delegate = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract ua.mycredit.core.UseCase.ParametrizedUseCase<ua.mycredit.core.BaseUseCase.ReloadCriteria, java.util.List<I>> getLoadItems();
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public final ua.mycredit.mycredit.ui.bases.action.Refreshable getAsRefreshable() {
        return null;
    }
    
    public LazyListViewModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0084\u0004\u0018\u00002\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001R\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\nH\u0014J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0014J\u0016\u0010\u000e\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0014\u00a8\u0006\u0010"}, d2 = {"Lua/mycredit/mycredit/ui/bases/LazyListViewModel$BaseRefreshable;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$LazyRefreshable;", "", "Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "(Lua/mycredit/mycredit/ui/bases/LazyListViewModel;)V", "doExecute", "", "criteria", "Lua/mycredit/core/BaseUseCase$ReloadCriteria;", "o", "Lio/reactivex/observers/DisposableObserver;", "onError", "e", "", "onValue", "value", "presentation_fullDebug"})
    public final class BaseRefreshable extends ua.mycredit.mycredit.ui.bases.BaseViewModel.LazyRefreshable<java.util.List<? extends I>> {
        
        @java.lang.Override()
        protected void doExecute(@org.jetbrains.annotations.NotNull()
        ua.mycredit.core.BaseUseCase.ReloadCriteria criteria, @org.jetbrains.annotations.NotNull()
        io.reactivex.observers.DisposableObserver<java.util.List<I>> o) {
        }
        
        @java.lang.Override()
        protected void onValue(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends I> value) {
        }
        
        @java.lang.Override()
        protected void onError(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable e) {
        }
        
        public BaseRefreshable() {
            super();
        }
    }
}