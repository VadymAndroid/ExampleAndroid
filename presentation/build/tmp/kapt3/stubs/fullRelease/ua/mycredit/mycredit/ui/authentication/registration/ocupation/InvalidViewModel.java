package ua.mycredit.mycredit.ui.authentication.registration.ocupation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0014J\b\u0010\u000e\u001a\u00020\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u000fH\u0014J\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0005R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0013"}, d2 = {"Lua/mycredit/mycredit/ui/authentication/registration/ocupation/InvalidViewModel;", "Lua/mycredit/mycredit/ui/authentication/registration/ocupation/OccupationTypeViewModel;", "()V", "groupDisability", "Landroid/databinding/ObservableField;", "Lua/mycredit/core/GroupDisability;", "getGroupDisability", "()Landroid/databinding/ObservableField;", "occupationType", "Lua/mycredit/core/OccupationType;", "getOccupationType", "()Lua/mycredit/core/OccupationType;", "areOccupationFieldsActual", "", "initOccupationFields", "", "persistOccupationDetails", "setGroup", "group", "presentation_fullRelease"})
public final class InvalidViewModel extends ua.mycredit.mycredit.ui.authentication.registration.ocupation.OccupationTypeViewModel {
    @org.jetbrains.annotations.NotNull()
    private final ua.mycredit.core.OccupationType occupationType = null;
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableField<ua.mycredit.core.GroupDisability> groupDisability = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ua.mycredit.core.OccupationType getOccupationType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableField<ua.mycredit.core.GroupDisability> getGroupDisability() {
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
    
    public final void setGroup(@org.jetbrains.annotations.NotNull()
    ua.mycredit.core.GroupDisability group) {
    }
    
    @javax.inject.Inject()
    public InvalidViewModel() {
        super();
    }
}