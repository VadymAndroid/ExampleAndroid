package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentPersonalInformationBindingImpl extends FragmentPersonalInformationBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(3);
        sIncludes.setIncludes(0, 
            new String[] {"input_variant_picker", "input_variant_picker"},
            new int[] {1, 2},
            new int[] {R.layout.input_variant_picker, R.layout.input_variant_picker});
        sViewsWithIds = null;
    }
    // views
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputVariantPickerBinding mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView01;
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputVariantPickerBinding mboundView02;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentPersonalInformationBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private FragmentPersonalInformationBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            );
        this.mboundView0 = (ua.mycredit.mycredit.databinding.InputVariantPickerBinding) bindings[1];
        setContainedBinding(this.mboundView0);
        this.mboundView01 = (android.widget.LinearLayout) bindings[0];
        this.mboundView01.setTag(null);
        this.mboundView02 = (ua.mycredit.mycredit.databinding.InputVariantPickerBinding) bindings[2];
        setContainedBinding(this.mboundView02);
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
        mboundView02.invalidateAll();
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
        if (mboundView02.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((ua.mycredit.mycredit.ui.authentication.registration.passport.personal.PersonalInfoViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ua.mycredit.mycredit.ui.authentication.registration.passport.personal.PersonalInfoViewModel ViewModel) {
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
        mboundView02.setLifecycleOwner(lifecycleOwner);
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
        ua.mycredit.mycredit.ui.bases.input.FormViewModel.SimplePickerDialogViewModel<ua.mycredit.core.MaritalStatus> viewModelMaritalStatus = null;
        ua.mycredit.mycredit.ui.bases.input.FormViewModel.SimplePickerDialogViewModel<ua.mycredit.core.Education> viewModelEducation = null;
        ua.mycredit.mycredit.ui.authentication.registration.passport.personal.PersonalInfoViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel.maritalStatus
                    viewModelMaritalStatus = viewModel.getMaritalStatus();
                    // read viewModel.education
                    viewModelEducation = viewModel.getEducation();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.mboundView0.setViewModel(viewModelMaritalStatus);
            this.mboundView02.setViewModel(viewModelEducation);
        }
        executeBindingsOn(mboundView0);
        executeBindingsOn(mboundView02);
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