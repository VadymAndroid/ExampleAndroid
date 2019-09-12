package ua.mycredit.mycredit.ui.authentication.registration.ocupation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0014H\u0014R\u001b\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004R\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004R\u00020\u00060\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0016"}, d2 = {"Lua/mycredit/mycredit/ui/authentication/registration/ocupation/TemporarilyUnemployedViewModel;", "Lua/mycredit/mycredit/ui/authentication/registration/ocupation/OccupationTypeViewModel;", "()V", "dismissalReason", "Lua/mycredit/mycredit/ui/bases/input/FormViewModel$SimplePickerDialogViewModel;", "Lua/mycredit/core/ReasonDismissal;", "Lua/mycredit/mycredit/ui/bases/input/FormViewModel;", "getDismissalReason", "()Lua/mycredit/mycredit/ui/bases/input/FormViewModel$SimplePickerDialogViewModel;", "occupationFields", "", "getOccupationFields", "()Ljava/util/List;", "occupationType", "Lua/mycredit/core/OccupationType;", "getOccupationType", "()Lua/mycredit/core/OccupationType;", "areOccupationFieldsActual", "", "initOccupationFields", "", "persistOccupationDetails", "presentation_fullDebug"})
public final class TemporarilyUnemployedViewModel extends ua.mycredit.mycredit.ui.authentication.registration.ocupation.OccupationTypeViewModel {
    @org.jetbrains.annotations.NotNull()
    private final ua.mycredit.core.OccupationType occupationType = null;
    @org.jetbrains.annotations.NotNull()
    private final ua.mycredit.mycredit.ui.bases.input.FormViewModel.SimplePickerDialogViewModel<ua.mycredit.core.ReasonDismissal> dismissalReason = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.mycredit.core.OccupationType getOccupationType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<ua.mycredit.mycredit.ui.bases.input.FormViewModel.SimplePickerDialogViewModel<ua.mycredit.core.ReasonDismissal>> getOccupationFields() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.mycredit.mycredit.ui.bases.input.FormViewModel.SimplePickerDialogViewModel<ua.mycredit.core.ReasonDismissal> getDismissalReason() {
        return null;
    }
    
    @java.lang.Override()
    protected void initOccupationFields() {
    }
    
    @java.lang.Override()
    protected boolean areOccupationFieldsActual() {
        return false;
    }
    
    @java.lang.Override()
    protected void persistOccupationDetails() {
    }
    
    @javax.inject.Inject()
    public TemporarilyUnemployedViewModel() {
        super();
    }
}