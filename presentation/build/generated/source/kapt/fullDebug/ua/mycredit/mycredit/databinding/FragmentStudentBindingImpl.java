package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentStudentBindingImpl extends FragmentStudentBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(7);
        sIncludes.setIncludes(0, 
            new String[] {"income_fields"},
            new int[] {2},
            new int[] {R.layout.income_fields});
        sIncludes.setIncludes(1, 
            new String[] {"input_text_picker", "input_variant_picker", "input_variant_picker", "input_text_picker"},
            new int[] {3, 4, 5, 6},
            new int[] {R.layout.input_text_picker, R.layout.input_variant_picker, R.layout.input_variant_picker, R.layout.input_text_picker});
        sViewsWithIds = null;
    }
    // views
    @Nullable
    private final ua.mycredit.mycredit.databinding.IncomeFieldsBinding mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView01;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputTextPickerBinding mboundView11;
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputVariantPickerBinding mboundView12;
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputVariantPickerBinding mboundView13;
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputTextPickerBinding mboundView14;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentStudentBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentStudentBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            );
        this.mboundView0 = (ua.mycredit.mycredit.databinding.IncomeFieldsBinding) bindings[2];
        setContainedBinding(this.mboundView0);
        this.mboundView01 = (android.widget.LinearLayout) bindings[0];
        this.mboundView01.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView11 = (ua.mycredit.mycredit.databinding.InputTextPickerBinding) bindings[3];
        setContainedBinding(this.mboundView11);
        this.mboundView12 = (ua.mycredit.mycredit.databinding.InputVariantPickerBinding) bindings[4];
        setContainedBinding(this.mboundView12);
        this.mboundView13 = (ua.mycredit.mycredit.databinding.InputVariantPickerBinding) bindings[5];
        setContainedBinding(this.mboundView13);
        this.mboundView14 = (ua.mycredit.mycredit.databinding.InputTextPickerBinding) bindings[6];
        setContainedBinding(this.mboundView14);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        mboundView0.invalidateAll();
        mboundView11.invalidateAll();
        mboundView12.invalidateAll();
        mboundView13.invalidateAll();
        mboundView14.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView0.hasPendingBindings()) {
            return true;
        }
        if (mboundView11.hasPendingBindings()) {
            return true;
        }
        if (mboundView12.hasPendingBindings()) {
            return true;
        }
        if (mboundView13.hasPendingBindings()) {
            return true;
        }
        if (mboundView14.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((ua.mycredit.mycredit.ui.authentication.registration.ocupation.StudentViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ua.mycredit.mycredit.ui.authentication.registration.ocupation.StudentViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable android.arch.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView0.setLifecycleOwner(lifecycleOwner);
        mboundView11.setLifecycleOwner(lifecycleOwner);
        mboundView12.setLifecycleOwner(lifecycleOwner);
        mboundView13.setLifecycleOwner(lifecycleOwner);
        mboundView14.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        ua.mycredit.mycredit.ui.bases.input.FormViewModel.SimplePickerDialogViewModel<ua.mycredit.core.SpecializationFaculty> viewModelFacultySpec = null;
        ua.mycredit.mycredit.ui.bases.input.FormViewModel.BaseInputDialogViewModel viewModelSchoolName = null;
        ua.mycredit.mycredit.ui.bases.input.FormViewModel.SimplePickerDialogViewModel<ua.mycredit.core.QualificationAfterGraduation> viewModelEducationDegree = null;
        ua.mycredit.mycredit.ui.bases.input.FormViewModel.BaseInputDialogViewModel viewModelStudentId = null;
        ua.mycredit.mycredit.ui.authentication.registration.ocupation.StudentViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel.facultySpec
                    viewModelFacultySpec = viewModel.getFacultySpec();
                    // read viewModel.schoolName
                    viewModelSchoolName = viewModel.getSchoolName();
                    // read viewModel.educationDegree
                    viewModelEducationDegree = viewModel.getEducationDegree();
                    // read viewModel.studentId
                    viewModelStudentId = viewModel.getStudentId();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.mboundView0.setViewModel(viewModel);
            this.mboundView11.setViewModel(viewModelSchoolName);
            this.mboundView12.setViewModel(viewModelFacultySpec);
            this.mboundView13.setViewModel(viewModelEducationDegree);
            this.mboundView14.setViewModel(viewModelStudentId);
        }
        executeBindingsOn(mboundView0);
        executeBindingsOn(mboundView11);
        executeBindingsOn(mboundView12);
        executeBindingsOn(mboundView13);
        executeBindingsOn(mboundView14);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}