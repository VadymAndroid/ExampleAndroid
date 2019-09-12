package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentPasswordBindingImpl extends FragmentPasswordBinding implements ua.mycredit.mycredit.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(8);
        sIncludes.setIncludes(3, 
            new String[] {"fb_email", "password_requirements", "input_field", "input_field"},
            new int[] {4, 5, 6, 7},
            new int[] {R.layout.fb_email, R.layout.password_requirements, R.layout.input_field, R.layout.input_field});
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.RelativeLayout mboundView3;
    @Nullable
    private final ua.mycredit.mycredit.databinding.PasswordRequirementsBinding mboundView31;
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputFieldBinding mboundView32;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    private AfterTextChangedImpl mViewModelPasswordRequirementsOnPasswordChangedAndroidDatabindingAdaptersTextViewBindingAdapterAfterTextChanged;
    // Inverse Binding Event Handlers

    public FragmentPasswordBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentPasswordBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.ImageView) bindings[2]
            , (ua.mycredit.mycredit.databinding.FbEmailBinding) bindings[4]
            , (ua.mycredit.mycredit.databinding.InputFieldBinding) bindings[6]
            , (android.widget.TextView) bindings[1]
            );
        this.editPhone.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (android.widget.RelativeLayout) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView31 = (ua.mycredit.mycredit.databinding.PasswordRequirementsBinding) bindings[5];
        setContainedBinding(this.mboundView31);
        this.mboundView32 = (ua.mycredit.mycredit.databinding.InputFieldBinding) bindings[7];
        setContainedBinding(this.mboundView32);
        this.phone.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        fbEmail.invalidateAll();
        mboundView31.invalidateAll();
        password.invalidateAll();
        mboundView32.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (fbEmail.hasPendingBindings()) {
            return true;
        }
        if (mboundView31.hasPendingBindings()) {
            return true;
        }
        if (password.hasPendingBindings()) {
            return true;
        }
        if (mboundView32.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((ua.mycredit.mycredit.ui.authentication.registration.signup.PasswordViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ua.mycredit.mycredit.ui.authentication.registration.signup.PasswordViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable android.arch.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        fbEmail.setLifecycleOwner(lifecycleOwner);
        mboundView31.setLifecycleOwner(lifecycleOwner);
        password.setLifecycleOwner(lifecycleOwner);
        mboundView32.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangePassword((ua.mycredit.mycredit.databinding.InputFieldBinding) object, fieldId);
            case 1 :
                return onChangeViewModelPasswordHasFocus((android.databinding.ObservableBoolean) object, fieldId);
            case 2 :
                return onChangeFbEmail((ua.mycredit.mycredit.databinding.FbEmailBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangePassword(ua.mycredit.mycredit.databinding.InputFieldBinding Password, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPasswordHasFocus(android.databinding.ObservableBoolean ViewModelPasswordHasFocus, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeFbEmail(ua.mycredit.mycredit.databinding.FbEmailBinding FbEmail, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        int viewModelPasswordHasFocusViewVISIBLEViewGONE = 0;
        java.lang.String viewModelPhone = null;
        boolean viewModelPasswordHasFocusGet = false;
        android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged viewModelPasswordRequirementsOnPasswordChangedAndroidDatabindingAdaptersTextViewBindingAdapterAfterTextChanged = null;
        ua.mycredit.mycredit.ui.bases.input.PasswordRequirementsViewModel viewModelPasswordRequirements = null;
        android.databinding.ObservableBoolean viewModelPasswordHasFocus = null;
        ua.mycredit.mycredit.ui.bases.input.FieldViewModel viewModelPassword = null;
        ua.mycredit.mycredit.ui.bases.input.FieldViewModel viewModelConfirm = null;
        ua.mycredit.mycredit.ui.authentication.registration.signup.PasswordViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x1aL) != 0) {


            if ((dirtyFlags & 0x18L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.phone
                        viewModelPhone = viewModel.getPhone();
                        // read viewModel.passwordRequirements
                        viewModelPasswordRequirements = viewModel.getPasswordRequirements();
                        // read viewModel.confirm
                        viewModelConfirm = viewModel.getConfirm();
                    }


                    if (viewModelPasswordRequirements != null) {
                        // read viewModel.passwordRequirements::onPasswordChanged
                        viewModelPasswordRequirementsOnPasswordChangedAndroidDatabindingAdaptersTextViewBindingAdapterAfterTextChanged = (((mViewModelPasswordRequirementsOnPasswordChangedAndroidDatabindingAdaptersTextViewBindingAdapterAfterTextChanged == null) ? (mViewModelPasswordRequirementsOnPasswordChangedAndroidDatabindingAdaptersTextViewBindingAdapterAfterTextChanged = new AfterTextChangedImpl()) : mViewModelPasswordRequirementsOnPasswordChangedAndroidDatabindingAdaptersTextViewBindingAdapterAfterTextChanged).setValue(viewModelPasswordRequirements));
                    }
            }

                if (viewModel != null) {
                    // read viewModel.password
                    viewModelPassword = viewModel.getPassword();
                }


                if (viewModelPassword != null) {
                    // read viewModel.password.hasFocus
                    viewModelPasswordHasFocus = viewModelPassword.getHasFocus();
                }
                updateRegistration(1, viewModelPasswordHasFocus);


                if (viewModelPasswordHasFocus != null) {
                    // read viewModel.password.hasFocus.get()
                    viewModelPasswordHasFocusGet = viewModelPasswordHasFocus.get();
                }
            if((dirtyFlags & 0x1aL) != 0) {
                if(viewModelPasswordHasFocusGet) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }


                // read viewModel.password.hasFocus.get() ? View.VISIBLE : View.GONE
                viewModelPasswordHasFocusViewVISIBLEViewGONE = ((viewModelPasswordHasFocusGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.editPhone.setOnClickListener(mCallback3);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            this.fbEmail.setViewModel(viewModel);
            this.mboundView31.setViewModel(viewModelPasswordRequirements);
            this.mboundView32.setViewModel(viewModelConfirm);
            this.password.setAfterTextChanged(viewModelPasswordRequirementsOnPasswordChangedAndroidDatabindingAdaptersTextViewBindingAdapterAfterTextChanged);
            this.password.setViewModel(viewModelPassword);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.phone, viewModelPhone);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            this.mboundView31.getRoot().setVisibility(viewModelPasswordHasFocusViewVISIBLEViewGONE);
        }
        executeBindingsOn(fbEmail);
        executeBindingsOn(mboundView31);
        executeBindingsOn(password);
        executeBindingsOn(mboundView32);
    }
    // Listener Stub Implementations
    public static class AfterTextChangedImpl implements android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged{
        private ua.mycredit.mycredit.ui.bases.input.PasswordRequirementsViewModel value;
        public AfterTextChangedImpl setValue(ua.mycredit.mycredit.ui.bases.input.PasswordRequirementsViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void afterTextChanged(android.text.Editable arg0) {
            this.value.onPasswordChanged(arg0); 
        }
    }
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        ua.mycredit.mycredit.ui.authentication.registration.signup.PasswordViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.backToPhoneSignUp();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): password
        flag 1 (0x2L): viewModel.password.hasFocus
        flag 2 (0x3L): fbEmail
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
        flag 5 (0x6L): viewModel.password.hasFocus.get() ? View.VISIBLE : View.GONE
        flag 6 (0x7L): viewModel.password.hasFocus.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}