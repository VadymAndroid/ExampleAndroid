package ua.mycredit.mycredit.ui.authentication.registration.passport.personal;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0013H\u0014J\b\u0010\u0015\u001a\u00020\u0013H\u0016R\u001b\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004R\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u000e0\u0004R\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007\u00a8\u0006\u0016"}, d2 = {"Lua/mycredit/mycredit/ui/authentication/registration/passport/personal/PersonalInfoViewModel;", "Lua/mycredit/mycredit/ui/bases/input/FormViewModel;", "()V", "education", "Lua/mycredit/mycredit/ui/bases/input/FormViewModel$SimplePickerDialogViewModel;", "Lua/mycredit/core/Education;", "getEducation", "()Lua/mycredit/mycredit/ui/bases/input/FormViewModel$SimplePickerDialogViewModel;", "fields", "", "Lua/mycredit/mycredit/ui/bases/input/Validable;", "getFields", "()Ljava/util/List;", "maritalStatus", "Lua/mycredit/core/MaritalStatus;", "getMaritalStatus", "isContentChanged", "", "onInitFields", "", "onReadyToSend", "persist", "presentation_fullRelease"})
public class PersonalInfoViewModel extends ua.mycredit.mycredit.ui.bases.input.FormViewModel {
    @org.jetbrains.annotations.NotNull()
    private final ua.mycredit.mycredit.ui.bases.input.FormViewModel.SimplePickerDialogViewModel<ua.mycredit.core.MaritalStatus> maritalStatus = null;
    @org.jetbrains.annotations.NotNull()
    private final ua.mycredit.mycredit.ui.bases.input.FormViewModel.SimplePickerDialogViewModel<ua.mycredit.core.Education> education = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<ua.mycredit.mycredit.ui.bases.input.Validable> getFields() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.mycredit.mycredit.ui.bases.input.FormViewModel.SimplePickerDialogViewModel<ua.mycredit.core.MaritalStatus> getMaritalStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.mycredit.mycredit.ui.bases.input.FormViewModel.SimplePickerDialogViewModel<ua.mycredit.core.Education> getEducation() {
        return null;
    }
    
    @java.lang.Override()
    protected void onInitFields() {
    }
    
    @java.lang.Override()
    public boolean isContentChanged() {
        return false;
    }
    
    @java.lang.Override()
    public void persist() {
    }
    
    @java.lang.Override()
    protected void onReadyToSend() {
    }
    
    @javax.inject.Inject()
    public PersonalInfoViewModel() {
        super();
    }
}