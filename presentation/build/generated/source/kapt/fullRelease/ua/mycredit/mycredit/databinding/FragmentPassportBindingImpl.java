package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentPassportBindingImpl extends FragmentPassportBinding implements ua.mycredit.mycredit.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(17);
        sIncludes.setIncludes(3, 
            new String[] {"input_field", "input_field"},
            new int[] {10, 11},
            new int[] {R.layout.input_field, R.layout.input_field});
        sIncludes.setIncludes(5, 
            new String[] {"input_field", "input_field", "input_field", "input_field", "input_field"},
            new int[] {12, 13, 14, 15, 16},
            new int[] {R.layout.input_field, R.layout.input_field, R.layout.input_field, R.layout.input_field, R.layout.input_field});
        sIncludes.setIncludes(1, 
            new String[] {"simple_button", "simple_button"},
            new int[] {6, 7},
            new int[] {R.layout.simple_button, R.layout.simple_button});
        sIncludes.setIncludes(4, 
            new String[] {"input_field", "input_field"},
            new int[] {8, 9},
            new int[] {R.layout.input_field, R.layout.input_field});
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @Nullable
    private final ua.mycredit.mycredit.databinding.SimpleButtonBinding mboundView11;
    @Nullable
    private final ua.mycredit.mycredit.databinding.SimpleButtonBinding mboundView12;
    @NonNull
    private final android.widget.ViewSwitcher mboundView2;
    @NonNull
    private final android.widget.LinearLayout mboundView3;
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputFieldBinding mboundView31;
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputFieldBinding mboundView32;
    @NonNull
    private final android.widget.LinearLayout mboundView4;
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputFieldBinding mboundView41;
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputFieldBinding mboundView42;
    @NonNull
    private final android.widget.LinearLayout mboundView5;
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputFieldBinding mboundView51;
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputFieldBinding mboundView52;
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputFieldBinding mboundView53;
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputFieldBinding mboundView54;
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputFieldBinding mboundView55;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback60;
    @Nullable
    private final android.view.View.OnClickListener mCallback61;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentPassportBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private FragmentPassportBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView11 = (ua.mycredit.mycredit.databinding.SimpleButtonBinding) bindings[6];
        setContainedBinding(this.mboundView11);
        this.mboundView12 = (ua.mycredit.mycredit.databinding.SimpleButtonBinding) bindings[7];
        setContainedBinding(this.mboundView12);
        this.mboundView2 = (android.widget.ViewSwitcher) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.LinearLayout) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView31 = (ua.mycredit.mycredit.databinding.InputFieldBinding) bindings[10];
        setContainedBinding(this.mboundView31);
        this.mboundView32 = (ua.mycredit.mycredit.databinding.InputFieldBinding) bindings[11];
        setContainedBinding(this.mboundView32);
        this.mboundView4 = (android.widget.LinearLayout) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView41 = (ua.mycredit.mycredit.databinding.InputFieldBinding) bindings[8];
        setContainedBinding(this.mboundView41);
        this.mboundView42 = (ua.mycredit.mycredit.databinding.InputFieldBinding) bindings[9];
        setContainedBinding(this.mboundView42);
        this.mboundView5 = (android.widget.LinearLayout) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView51 = (ua.mycredit.mycredit.databinding.InputFieldBinding) bindings[12];
        setContainedBinding(this.mboundView51);
        this.mboundView52 = (ua.mycredit.mycredit.databinding.InputFieldBinding) bindings[13];
        setContainedBinding(this.mboundView52);
        this.mboundView53 = (ua.mycredit.mycredit.databinding.InputFieldBinding) bindings[14];
        setContainedBinding(this.mboundView53);
        this.mboundView54 = (ua.mycredit.mycredit.databinding.InputFieldBinding) bindings[15];
        setContainedBinding(this.mboundView54);
        this.mboundView55 = (ua.mycredit.mycredit.databinding.InputFieldBinding) bindings[16];
        setContainedBinding(this.mboundView55);
        setRootTag(root);
        // listeners
        mCallback60 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 1);
        mCallback61 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        mboundView11.invalidateAll();
        mboundView12.invalidateAll();
        mboundView41.invalidateAll();
        mboundView42.invalidateAll();
        mboundView31.invalidateAll();
        mboundView32.invalidateAll();
        mboundView51.invalidateAll();
        mboundView52.invalidateAll();
        mboundView53.invalidateAll();
        mboundView54.invalidateAll();
        mboundView55.invalidateAll();
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
        if (mboundView41.hasPendingBindings()) {
            return true;
        }
        if (mboundView42.hasPendingBindings()) {
            return true;
        }
        if (mboundView31.hasPendingBindings()) {
            return true;
        }
        if (mboundView32.hasPendingBindings()) {
            return true;
        }
        if (mboundView51.hasPendingBindings()) {
            return true;
        }
        if (mboundView52.hasPendingBindings()) {
            return true;
        }
        if (mboundView53.hasPendingBindings()) {
            return true;
        }
        if (mboundView54.hasPendingBindings()) {
            return true;
        }
        if (mboundView55.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((ua.mycredit.mycredit.ui.authentication.registration.passport.passport.PassportViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ua.mycredit.mycredit.ui.authentication.registration.passport.passport.PassportViewModel ViewModel) {
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
        mboundView41.setLifecycleOwner(lifecycleOwner);
        mboundView42.setLifecycleOwner(lifecycleOwner);
        mboundView31.setLifecycleOwner(lifecycleOwner);
        mboundView32.setLifecycleOwner(lifecycleOwner);
        mboundView51.setLifecycleOwner(lifecycleOwner);
        mboundView52.setLifecycleOwner(lifecycleOwner);
        mboundView53.setLifecycleOwner(lifecycleOwner);
        mboundView54.setLifecycleOwner(lifecycleOwner);
        mboundView55.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelState((android.databinding.ObservableField<ua.mycredit.mycredit.ui.authentication.registration.passport.passport.PassportViewModel.State>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelState(android.databinding.ObservableField<ua.mycredit.mycredit.ui.authentication.registration.passport.passport.PassportViewModel.State> ViewModelState, int fieldId) {
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
        android.databinding.ObservableField<ua.mycredit.mycredit.ui.authentication.registration.passport.passport.PassportViewModel.State> viewModelState = null;
        ua.mycredit.mycredit.ui.bases.input.FieldViewModel viewModelIdCardStateExpired = null;
        ua.mycredit.mycredit.ui.bases.input.FieldViewModel viewModelPassportStateGivenBy = null;
        ua.mycredit.mycredit.ui.bases.input.FieldViewModel viewModelIdCardStateRecord = null;
        int viewModelStateInstanceofPassportStateInt0Int1 = 0;
        ua.mycredit.mycredit.ui.authentication.registration.passport.passport.PassportViewModel.State viewModelStateGet = null;
        ua.mycredit.mycredit.ui.bases.input.FieldViewModel viewModelIdCardStateGivenBy = null;
        ua.mycredit.mycredit.ui.authentication.registration.passport.passport.PassportViewModel.IdCardState viewModelIdCardState = null;
        ua.mycredit.mycredit.ui.bases.input.FieldViewModel viewModelIdCardStateIssued = null;
        boolean viewModelStateInstanceofIdCardState = false;
        ua.mycredit.mycredit.ui.authentication.registration.passport.passport.PassportViewModel.PassportState viewModelPassportState = null;
        ua.mycredit.mycredit.ui.bases.input.FieldViewModel viewModelIdCardStateDocNumber = null;
        ua.mycredit.mycredit.ui.bases.input.FieldViewModel viewModelPassportStateSeries = null;
        boolean viewModelStateInstanceofPassportState = false;
        ua.mycredit.mycredit.ui.bases.input.FieldViewModel viewModelPassportStateNumber = null;
        ua.mycredit.mycredit.ui.bases.input.FieldViewModel viewModelPassportStateIssued = null;
        ua.mycredit.mycredit.ui.authentication.registration.passport.passport.PassportViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.state
                    viewModelState = viewModel.getState();
                }
                updateRegistration(0, viewModelState);


                if (viewModelState != null) {
                    // read viewModel.state.get()
                    viewModelStateGet = viewModelState.get();
                }


                // read viewModel.state.get() instanceof IdCardState
                viewModelStateInstanceofIdCardState = viewModelStateGet instanceof ua.mycredit.mycredit.ui.authentication.registration.passport.passport.PassportViewModel.IdCardState;
                // read viewModel.state.get() instanceof PassportState
                viewModelStateInstanceofPassportState = viewModelStateGet instanceof ua.mycredit.mycredit.ui.authentication.registration.passport.passport.PassportViewModel.PassportState;
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelStateInstanceofPassportState) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read viewModel.state.get() instanceof PassportState ? 0 : 1
                viewModelStateInstanceofPassportStateInt0Int1 = ((viewModelStateInstanceofPassportState) ? (0) : (1));
            if ((dirtyFlags & 0x6L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.idCardState
                        viewModelIdCardState = viewModel.getIdCardState();
                        // read viewModel.passportState
                        viewModelPassportState = viewModel.getPassportState();
                    }


                    if (viewModelIdCardState != null) {
                        // read viewModel.idCardState.expired
                        viewModelIdCardStateExpired = viewModelIdCardState.getExpired();
                        // read viewModel.idCardState.record
                        viewModelIdCardStateRecord = viewModelIdCardState.getRecord();
                        // read viewModel.idCardState.givenBy
                        viewModelIdCardStateGivenBy = viewModelIdCardState.getGivenBy();
                        // read viewModel.idCardState.issued
                        viewModelIdCardStateIssued = viewModelIdCardState.getIssued();
                        // read viewModel.idCardState.docNumber
                        viewModelIdCardStateDocNumber = viewModelIdCardState.getDocNumber();
                    }
                    if (viewModelPassportState != null) {
                        // read viewModel.passportState.givenBy
                        viewModelPassportStateGivenBy = viewModelPassportState.getGivenBy();
                        // read viewModel.passportState.series
                        viewModelPassportStateSeries = viewModelPassportState.getSeries();
                        // read viewModel.passportState.number
                        viewModelPassportStateNumber = viewModelPassportState.getNumber();
                        // read viewModel.passportState.issued
                        viewModelPassportStateIssued = viewModelPassportState.getIssued();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView11.setOnClick(mCallback60);
            this.mboundView11.setText(getRoot().getResources().getString(R.string.old_sample));
            this.mboundView12.setOnClick(mCallback61);
            this.mboundView12.setText(getRoot().getResources().getString(R.string.new_sample));
            this.mboundView32.setDrawableEnd(getDrawableFromResource(getRoot(), R.drawable.ic_arrow_drop_down_selector));
            this.mboundView54.setDrawableEnd(getDrawableFromResource(getRoot(), R.drawable.ic_arrow_drop_down_selector));
            this.mboundView55.setDrawableEnd(getDrawableFromResource(getRoot(), R.drawable.ic_arrow_drop_down_selector));
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.mboundView11.setPrimary(viewModelStateInstanceofPassportState);
            this.mboundView12.setPrimary(viewModelStateInstanceofIdCardState);
            this.mboundView2.setDisplayedChild(viewModelStateInstanceofPassportStateInt0Int1);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.mboundView31.setViewModel(viewModelPassportStateGivenBy);
            this.mboundView32.setViewModel(viewModelPassportStateIssued);
            this.mboundView41.setViewModel(viewModelPassportStateSeries);
            this.mboundView42.setViewModel(viewModelPassportStateNumber);
            this.mboundView51.setViewModel(viewModelIdCardStateRecord);
            this.mboundView52.setViewModel(viewModelIdCardStateDocNumber);
            this.mboundView53.setViewModel(viewModelIdCardStateGivenBy);
            this.mboundView54.setViewModel(viewModelIdCardStateIssued);
            this.mboundView55.setViewModel(viewModelIdCardStateExpired);
        }
        executeBindingsOn(mboundView11);
        executeBindingsOn(mboundView12);
        executeBindingsOn(mboundView41);
        executeBindingsOn(mboundView42);
        executeBindingsOn(mboundView31);
        executeBindingsOn(mboundView32);
        executeBindingsOn(mboundView51);
        executeBindingsOn(mboundView52);
        executeBindingsOn(mboundView53);
        executeBindingsOn(mboundView54);
        executeBindingsOn(mboundView55);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // viewModel
                ua.mycredit.mycredit.ui.authentication.registration.passport.passport.PassportViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.setStateToPassport();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                ua.mycredit.mycredit.ui.authentication.registration.passport.passport.PassportViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.setStateToIdCard();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.state
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
        flag 3 (0x4L): viewModel.state.get() instanceof PassportState ? 0 : 1
        flag 4 (0x5L): viewModel.state.get() instanceof PassportState ? 0 : 1
    flag mapping end*/
    //end
}