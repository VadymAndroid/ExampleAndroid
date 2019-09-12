package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class PasswordRequirementsBindingImpl extends PasswordRequirementsBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(6);
        sIncludes.setIncludes(1, 
            new String[] {"password_requirement", "password_requirement", "password_requirement", "three_step_progress"},
            new int[] {2, 3, 4, 5},
            new int[] {R.layout.password_requirement, R.layout.password_requirement, R.layout.password_requirement, R.layout.three_step_progress});
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.support.v7.widget.CardView mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @Nullable
    private final ua.mycredit.mycredit.databinding.PasswordRequirementBinding mboundView11;
    @Nullable
    private final ua.mycredit.mycredit.databinding.PasswordRequirementBinding mboundView12;
    @Nullable
    private final ua.mycredit.mycredit.databinding.PasswordRequirementBinding mboundView13;
    @Nullable
    private final ua.mycredit.mycredit.databinding.ThreeStepProgressBinding mboundView14;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public PasswordRequirementsBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private PasswordRequirementsBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            );
        this.mboundView0 = (android.support.v7.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView11 = (ua.mycredit.mycredit.databinding.PasswordRequirementBinding) bindings[2];
        setContainedBinding(this.mboundView11);
        this.mboundView12 = (ua.mycredit.mycredit.databinding.PasswordRequirementBinding) bindings[3];
        setContainedBinding(this.mboundView12);
        this.mboundView13 = (ua.mycredit.mycredit.databinding.PasswordRequirementBinding) bindings[4];
        setContainedBinding(this.mboundView13);
        this.mboundView14 = (ua.mycredit.mycredit.databinding.ThreeStepProgressBinding) bindings[5];
        setContainedBinding(this.mboundView14);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
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
            setViewModel((ua.mycredit.mycredit.ui.bases.input.PasswordRequirementsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ua.mycredit.mycredit.ui.bases.input.PasswordRequirementsViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable android.arch.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView11.setLifecycleOwner(lifecycleOwner);
        mboundView12.setLifecycleOwner(lifecycleOwner);
        mboundView13.setLifecycleOwner(lifecycleOwner);
        mboundView14.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelRequirements((android.databinding.ObservableInt) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelRequirements(android.databinding.ObservableInt ViewModelRequirements, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        android.databinding.ObservableInt viewModelRequirements = null;
        int integerBitCountViewModelRequirements = 0;
        int viewModelRequirementsGet = 0;
        ua.mycredit.mycredit.ui.bases.input.PasswordRequirementsViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.requirements
                    viewModelRequirements = viewModel.getRequirements();
                }
                updateRegistration(0, viewModelRequirements);


                if (viewModelRequirements != null) {
                    // read viewModel.requirements.get()
                    viewModelRequirementsGet = viewModelRequirements.get();
                }


                // read Integer.bitCount(viewModel.requirements.get())
                integerBitCountViewModelRequirements = java.lang.Integer.bitCount(viewModelRequirementsGet);
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView11.setRequirement(ua.mycredit.mycredit.ui.bases.input.PasswordRequirementsViewModel.PasswordRequirement.LENGTH);
            this.mboundView12.setRequirement(ua.mycredit.mycredit.ui.bases.input.PasswordRequirementsViewModel.PasswordRequirement.LETTER_CASE);
            this.mboundView13.setRequirement(ua.mycredit.mycredit.ui.bases.input.PasswordRequirementsViewModel.PasswordRequirement.DIGITS);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.mboundView11.setRequirements(viewModelRequirementsGet);
            this.mboundView12.setRequirements(viewModelRequirementsGet);
            this.mboundView13.setRequirements(viewModelRequirementsGet);
            this.mboundView14.setStep(integerBitCountViewModelRequirements);
        }
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
        flag 0 (0x1L): viewModel.requirements
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}