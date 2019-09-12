package ua.mycredit.mycredit.ui.profile.profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\fB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\u0002\u001a\u00020\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lua/mycredit/mycredit/ui/profile/profile/ProlongationPreferencesViewModel;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "prolong", "Lua/mycredit/core/interactors/ProlongUseCase;", "(Lua/mycredit/core/interactors/ProlongUseCase;)V", "date", "Landroid/databinding/ObservableField;", "Lorg/joda/time/LocalDate;", "getDate", "()Landroid/databinding/ObservableField;", "pickFinishDay", "", "ProlongationObserver", "presentation_fullDebug"})
public final class ProlongationPreferencesViewModel extends ua.mycredit.mycredit.ui.bases.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableField<org.joda.time.LocalDate> date = null;
    private final ua.mycredit.core.interactors.ProlongUseCase prolong = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableField<org.joda.time.LocalDate> getDate() {
        return null;
    }
    
    public final void pickFinishDay() {
    }
    
    public final void prolong() {
    }
    
    @javax.inject.Inject()
    public ProlongationPreferencesViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.core.interactors.ProlongUseCase prolong) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u000e"}, d2 = {"Lua/mycredit/mycredit/ui/profile/profile/ProlongationPreferencesViewModel$ProlongationObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$BaseCompletableObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "(Lua/mycredit/mycredit/ui/profile/profile/ProlongationPreferencesViewModel;)V", "exitAfterCompletion", "", "getExitAfterCompletion", "()Z", "progressMode", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$ProgressMode$DIALOG;", "getProgressMode", "()Lua/mycredit/mycredit/ui/bases/BaseViewModel$ProgressMode$DIALOG;", "onComplete", "", "presentation_fullDebug"})
    final class ProlongationObserver extends ua.mycredit.mycredit.ui.bases.BaseViewModel.BaseCompletableObserver {
        @org.jetbrains.annotations.NotNull()
        private final ua.mycredit.mycredit.ui.bases.BaseViewModel.ProgressMode.DIALOG progressMode = null;
        private final boolean exitAfterCompletion = true;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public ua.mycredit.mycredit.ui.bases.BaseViewModel.ProgressMode.DIALOG getProgressMode() {
            return null;
        }
        
        @java.lang.Override()
        public boolean getExitAfterCompletion() {
            return false;
        }
        
        @java.lang.Override()
        public void onComplete() {
        }
        
        public ProlongationObserver() {
            super(0, false);
        }
    }
}