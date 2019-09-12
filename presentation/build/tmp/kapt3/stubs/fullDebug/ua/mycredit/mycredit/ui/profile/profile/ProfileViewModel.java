package ua.mycredit.mycredit.ui.profile.profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0019B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0013H\u0016J\b\u0010\u0018\u001a\u00020\u0013H\u0007R\u001b\u0010\u0006\u001a\u00020\u00078VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f\u00a8\u0006\u001a"}, d2 = {"Lua/mycredit/mycredit/ui/profile/profile/ProfileViewModel;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "Lua/mycredit/mycredit/ui/bases/action/WithRefresh;", "loadProfile", "Lua/mycredit/core/interactors/LoadProfileUseCase;", "(Lua/mycredit/core/interactors/LoadProfileUseCase;)V", "asRefreshable", "Lua/mycredit/mycredit/ui/bases/action/Refreshable;", "getAsRefreshable", "()Lua/mycredit/mycredit/ui/bases/action/Refreshable;", "asRefreshable$delegate", "Lkotlin/Lazy;", "occupationValid", "Landroid/databinding/ObservableBoolean;", "getOccupationValid", "()Landroid/databinding/ObservableBoolean;", "personalValid", "getPersonalValid", "logout", "", "onDetails", "screenKey", "", "onProfileUpdated", "updateBadges", "RefreshableImpl", "presentation_fullDebug"})
public final class ProfileViewModel extends ua.mycredit.mycredit.ui.bases.BaseViewModel implements ua.mycredit.mycredit.ui.bases.action.WithRefresh {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy asRefreshable$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableBoolean personalValid = null;
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableBoolean occupationValid = null;
    private final ua.mycredit.core.interactors.LoadProfileUseCase loadProfile = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.mycredit.mycredit.ui.bases.action.Refreshable getAsRefreshable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableBoolean getPersonalValid() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableBoolean getOccupationValid() {
        return null;
    }
    
    @javax.inject.Inject()
    public final void updateBadges() {
    }
    
    @java.lang.Override()
    public void onProfileUpdated() {
    }
    
    public final void onDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String screenKey) {
    }
    
    public final void logout() {
    }
    
    @javax.inject.Inject()
    public ProfileViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.core.interactors.LoadProfileUseCase loadProfile) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014\u00a8\u0006\u0006"}, d2 = {"Lua/mycredit/mycredit/ui/profile/profile/ProfileViewModel$RefreshableImpl;", "Lua/mycredit/mycredit/ui/bases/action/Refreshable;", "(Lua/mycredit/mycredit/ui/profile/profile/ProfileViewModel;)V", "onRefresh", "", "ObserverImpl", "presentation_fullDebug"})
    final class RefreshableImpl extends ua.mycredit.mycredit.ui.bases.action.Refreshable {
        
        @java.lang.Override()
        protected void onRefresh() {
        }
        
        public RefreshableImpl() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\f\u0012\u0004\u0012\u00020\u00020\u0001R\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\b"}, d2 = {"Lua/mycredit/mycredit/ui/profile/profile/ProfileViewModel$RefreshableImpl$ObserverImpl;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$RefreshableSingleObserver;", "Lua/mycredit/core/Profile;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "(Lua/mycredit/mycredit/ui/profile/profile/ProfileViewModel$RefreshableImpl;)V", "onSuccess", "", "t", "presentation_fullDebug"})
        final class ObserverImpl extends ua.mycredit.mycredit.ui.bases.BaseViewModel.RefreshableSingleObserver<ua.mycredit.core.Profile> {
            
            @java.lang.Override()
            public void onSuccess(@org.jetbrains.annotations.NotNull()
            ua.mycredit.core.Profile t) {
            }
            
            public ObserverImpl() {
                super(null);
            }
        }
    }
}