package ua.mycredit.mycredit.ui.profile.profile.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\bB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0002\u001a\u00020\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lua/mycredit/mycredit/ui/profile/profile/details/DetailsViewModel;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "updateProfile", "Lua/mycredit/core/interactors/UpdateProfileUseCase;", "(Lua/mycredit/core/interactors/UpdateProfileUseCase;)V", "executed", "", "", "UpdateProfileObserver", "presentation_fullDebug"})
public final class DetailsViewModel extends ua.mycredit.mycredit.ui.bases.BaseViewModel {
    private boolean executed;
    private final ua.mycredit.core.interactors.UpdateProfileUseCase updateProfile = null;
    
    public final void updateProfile() {
    }
    
    @javax.inject.Inject()
    public DetailsViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.core.interactors.UpdateProfileUseCase updateProfile) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0011"}, d2 = {"Lua/mycredit/mycredit/ui/profile/profile/details/DetailsViewModel$UpdateProfileObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$BaseCompletableObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "(Lua/mycredit/mycredit/ui/profile/profile/details/DetailsViewModel;)V", "exitAfterCompletion", "", "getExitAfterCompletion", "()Z", "progressMode", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$ProgressMode$DIALOG;", "getProgressMode", "()Lua/mycredit/mycredit/ui/bases/BaseViewModel$ProgressMode$DIALOG;", "onComplete", "", "onError", "e", "", "presentation_fullDebug"})
    final class UpdateProfileObserver extends ua.mycredit.mycredit.ui.bases.BaseViewModel.BaseCompletableObserver {
        private final boolean exitAfterCompletion = true;
        @org.jetbrains.annotations.NotNull()
        private final ua.mycredit.mycredit.ui.bases.BaseViewModel.ProgressMode.DIALOG progressMode = null;
        
        @java.lang.Override()
        public boolean getExitAfterCompletion() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public ua.mycredit.mycredit.ui.bases.BaseViewModel.ProgressMode.DIALOG getProgressMode() {
            return null;
        }
        
        @java.lang.Override()
        public void onComplete() {
        }
        
        @java.lang.Override()
        public void onError(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable e) {
        }
        
        public UpdateProfileObserver() {
            super(0, false);
        }
    }
}