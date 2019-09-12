package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentInvalidBindingImpl extends FragmentInvalidBinding implements ua.mycredit.mycredit.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(6);
        sIncludes.setIncludes(1, 
            new String[] {"simple_button", "simple_button", "simple_button"},
            new int[] {2, 3, 4},
            new int[] {R.layout.simple_button, R.layout.simple_button, R.layout.simple_button});
        sIncludes.setIncludes(0, 
            new String[] {"income_fields"},
            new int[] {5},
            new int[] {R.layout.income_fields});
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @Nullable
    private final ua.mycredit.mycredit.databinding.IncomeFieldsBinding mboundView01;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @Nullable
    private final ua.mycredit.mycredit.databinding.SimpleButtonBinding mboundView11;
    @Nullable
    private final ua.mycredit.mycredit.databinding.SimpleButtonBinding mboundView12;
    @Nullable
    private final ua.mycredit.mycredit.databinding.SimpleButtonBinding mboundView13;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback30;
    @Nullable
    private final android.view.View.OnClickListener mCallback31;
    @Nullable
    private final android.view.View.OnClickListener mCallback29;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentInvalidBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentInvalidBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView01 = (ua.mycredit.mycredit.databinding.IncomeFieldsBinding) bindings[5];
        setContainedBinding(this.mboundView01);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView11 = (ua.mycredit.mycredit.databinding.SimpleButtonBinding) bindings[2];
        setContainedBinding(this.mboundView11);
        this.mboundView12 = (ua.mycredit.mycredit.databinding.SimpleButtonBinding) bindings[3];
        setContainedBinding(this.mboundView12);
        this.mboundView13 = (ua.mycredit.mycredit.databinding.SimpleButtonBinding) bindings[4];
        setContainedBinding(this.mboundView13);
        setRootTag(root);
        // listeners
        mCallback30 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 2);
        mCallback31 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 3);
        mCallback29 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 1);
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
        mboundView01.invalidateAll();
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
        if (mboundView01.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((ua.mycredit.mycredit.ui.authentication.registration.ocupation.InvalidViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ua.mycredit.mycredit.ui.authentication.registration.ocupation.InvalidViewModel ViewModel) {
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
        mboundView01.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelGroupDisability((android.databinding.ObservableField<ua.mycredit.core.GroupDisability>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelGroupDisability(android.databinding.ObservableField<ua.mycredit.core.GroupDisability> ViewModelGroupDisability, int fieldId) {
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
        boolean viewModelGroupDisabilityGroupDisabilityTHIRD = false;
        boolean viewModelGroupDisabilityGroupDisabilitySECOND = false;
        ua.mycredit.core.GroupDisability viewModelGroupDisabilityGet = null;
        android.databinding.ObservableField<ua.mycredit.core.GroupDisability> viewModelGroupDisability = null;
        boolean viewModelGroupDisabilityGroupDisabilityFIRST = false;
        ua.mycredit.mycredit.ui.authentication.registration.ocupation.InvalidViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.groupDisability
                    viewModelGroupDisability = viewModel.getGroupDisability();
                }
                updateRegistration(0, viewModelGroupDisability);


                if (viewModelGroupDisability != null) {
                    // read viewModel.groupDisability.get()
                    viewModelGroupDisabilityGet = viewModelGroupDisability.get();
                }


                // read viewModel.groupDisability.get() == GroupDisability.THIRD
                viewModelGroupDisabilityGroupDisabilityTHIRD = (viewModelGroupDisabilityGet) == (ua.mycredit.core.GroupDisability.THIRD);
                // read viewModel.groupDisability.get() == GroupDisability.SECOND
                viewModelGroupDisabilityGroupDisabilitySECOND = (viewModelGroupDisabilityGet) == (ua.mycredit.core.GroupDisability.SECOND);
                // read viewModel.groupDisability.get() == GroupDisability.FIRST
                viewModelGroupDisabilityGroupDisabilityFIRST = (viewModelGroupDisabilityGet) == (ua.mycredit.core.GroupDisability.FIRST);
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.mboundView01.setViewModel(viewModel);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView11.setOnClick(mCallback29);
            this.mboundView11.setText(getRoot().getResources().getString(R.string._1));
            this.mboundView12.setOnClick(mCallback30);
            this.mboundView12.setText(getRoot().getResources().getString(R.string._2));
            this.mboundView13.setOnClick(mCallback31);
            this.mboundView13.setText(getRoot().getResources().getString(R.string._3));
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.mboundView11.setPrimary(viewModelGroupDisabilityGroupDisabilityFIRST);
            this.mboundView12.setPrimary(viewModelGroupDisabilityGroupDisabilitySECOND);
            this.mboundView13.setPrimary(viewModelGroupDisabilityGroupDisabilityTHIRD);
        }
        executeBindingsOn(mboundView11);
        executeBindingsOn(mboundView12);
        executeBindingsOn(mboundView13);
        executeBindingsOn(mboundView01);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewModel
                ua.mycredit.mycredit.ui.authentication.registration.ocupation.InvalidViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.setGroup(ua.mycredit.core.GroupDisability.SECOND);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                ua.mycredit.mycredit.ui.authentication.registration.ocupation.InvalidViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.setGroup(ua.mycredit.core.GroupDisability.THIRD);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                ua.mycredit.mycredit.ui.authentication.registration.ocupation.InvalidViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.setGroup(ua.mycredit.core.GroupDisability.FIRST);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.groupDisability
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}