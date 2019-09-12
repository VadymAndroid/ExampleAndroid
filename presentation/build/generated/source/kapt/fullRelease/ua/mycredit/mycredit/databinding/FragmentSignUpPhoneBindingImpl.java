package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSignUpPhoneBindingImpl extends FragmentSignUpPhoneBinding implements ua.mycredit.mycredit.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(8);
        sIncludes.setIncludes(1, 
            new String[] {"input_phone_number", "input_field"},
            new int[] {5, 6},
            new int[] {R.layout.input_phone_number, R.layout.input_field});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.phoneContainer, 7);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputPhoneNumberBinding mboundView11;
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputFieldBinding mboundView12;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback68;
    @Nullable
    private final android.view.View.OnClickListener mCallback69;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSignUpPhoneBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentSignUpPhoneBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.support.v7.widget.CardView) bindings[7]
            , (android.widget.TextView) bindings[2]
            );
        this.enterOtherNumber.setTag(null);
        this.forgotPassword.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView11 = (ua.mycredit.mycredit.databinding.InputPhoneNumberBinding) bindings[5];
        setContainedBinding(this.mboundView11);
        this.mboundView12 = (ua.mycredit.mycredit.databinding.InputFieldBinding) bindings[6];
        setContainedBinding(this.mboundView12);
        this.phoneTitle.setTag(null);
        setRootTag(root);
        // listeners
        mCallback68 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 1);
        mCallback69 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        mboundView11.invalidateAll();
        mboundView12.invalidateAll();
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
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((ua.mycredit.mycredit.ui.authentication.registration.phone.SignUpPhoneViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ua.mycredit.mycredit.ui.authentication.registration.phone.SignUpPhoneViewModel ViewModel) {
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
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelState((android.databinding.ObservableField<ua.mycredit.mycredit.ui.authentication.registration.phone.SignUpPhoneViewModel.State>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelState(android.databinding.ObservableField<ua.mycredit.mycredit.ui.authentication.registration.phone.SignUpPhoneViewModel.State> ViewModelState, int fieldId) {
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
        android.databinding.ObservableField<ua.mycredit.mycredit.ui.authentication.registration.phone.SignUpPhoneViewModel.State> viewModelState = null;
        int viewModelStateTitle = 0;
        ua.mycredit.mycredit.ui.bases.input.FieldViewModel viewModelPhone = null;
        ua.mycredit.mycredit.ui.authentication.registration.phone.SignUpPhoneViewModel.State viewModelStateGet = null;
        boolean viewModelStateStateDEFAULT = false;
        int viewModelStateTitleColor = 0;
        int viewModelStateStateDEFAULTViewGONEViewVISIBLE = 0;
        ua.mycredit.mycredit.ui.bases.input.FieldViewModel viewModelPassword = null;
        boolean viewModelStateStateALREADYREGISTERED = false;
        ua.mycredit.mycredit.ui.authentication.registration.phone.SignUpPhoneViewModel viewModel = mViewModel;

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


                if (viewModelStateGet != null) {
                    // read viewModel.state.get().title
                    viewModelStateTitle = viewModelStateGet.getTitle();
                    // read viewModel.state.get().titleColor
                    viewModelStateTitleColor = viewModelStateGet.getTitleColor();
                }
                // read viewModel.state.get() == State.DEFAULT
                viewModelStateStateDEFAULT = (viewModelStateGet) == (ua.mycredit.mycredit.ui.authentication.registration.phone.SignUpPhoneViewModel.State.DEFAULT);
                // read viewModel.state.get() == State.ALREADY_REGISTERED
                viewModelStateStateALREADYREGISTERED = (viewModelStateGet) == (ua.mycredit.mycredit.ui.authentication.registration.phone.SignUpPhoneViewModel.State.ALREADY_REGISTERED);
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelStateStateDEFAULT) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read viewModel.state.get() == State.DEFAULT ? View.GONE : View.VISIBLE
                viewModelStateStateDEFAULTViewGONEViewVISIBLE = ((viewModelStateStateDEFAULT) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            if ((dirtyFlags & 0x6L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.phone
                        viewModelPhone = viewModel.getPhone();
                        // read viewModel.password
                        viewModelPassword = viewModel.getPassword();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.enterOtherNumber.setOnClickListener(mCallback68);
            this.forgotPassword.setOnClickListener(mCallback69);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.enterOtherNumber.setVisibility(ua.mycredit.mycredit.ui.BindingAdaptersKt.booleanToVisibility(viewModelStateStateALREADYREGISTERED));
            this.forgotPassword.setVisibility(ua.mycredit.mycredit.ui.BindingAdaptersKt.booleanToVisibility(viewModelStateStateALREADYREGISTERED));
            this.mboundView12.getRoot().setVisibility(viewModelStateStateDEFAULTViewGONEViewVISIBLE);
            this.phoneTitle.setTextColor(viewModelStateTitleColor);
            ua.mycredit.mycredit.ui.BindingAdaptersKt.setTextOrGone(this.phoneTitle, viewModelStateTitle);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.mboundView11.setViewModel(viewModelPhone);
            this.mboundView12.setViewModel(viewModelPassword);
        }
        executeBindingsOn(mboundView11);
        executeBindingsOn(mboundView12);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // viewModel
                ua.mycredit.mycredit.ui.authentication.registration.phone.SignUpPhoneViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.resetState(ua.mycredit.mycredit.ui.authentication.registration.phone.SignUpPhoneViewModel.State.DEFAULT);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                ua.mycredit.mycredit.ui.authentication.registration.phone.SignUpPhoneViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.forgotPassword();
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
        flag 3 (0x4L): viewModel.state.get() == State.DEFAULT ? View.GONE : View.VISIBLE
        flag 4 (0x5L): viewModel.state.get() == State.DEFAULT ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}