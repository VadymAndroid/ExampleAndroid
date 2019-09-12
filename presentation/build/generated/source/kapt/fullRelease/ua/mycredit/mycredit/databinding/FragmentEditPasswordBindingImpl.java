package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentEditPasswordBindingImpl extends FragmentEditPasswordBinding implements ua.mycredit.mycredit.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(8);
        sIncludes.setIncludes(1, 
            new String[] {"input_field", "input_field"},
            new int[] {3, 4},
            new int[] {R.layout.input_field, R.layout.input_field});
        sIncludes.setIncludes(0, 
            new String[] {"password_requirements", "input_field", "input_field"},
            new int[] {5, 6, 7},
            new int[] {R.layout.password_requirements, R.layout.input_field, R.layout.input_field});
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputFieldBinding mboundView1;
    @NonNull
    private final android.widget.Button mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback67;
    // values
    // listeners
    private AfterTextChangedImpl mViewModelPasswordRequirementsOnPasswordChangedAndroidDatabindingAdaptersTextViewBindingAdapterAfterTextChanged;
    // Inverse Binding Event Handlers

    public FragmentEditPasswordBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentEditPasswordBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (ua.mycredit.mycredit.databinding.InputFieldBinding) bindings[7]
            , (ua.mycredit.mycredit.databinding.InputFieldBinding) bindings[6]
            , (ua.mycredit.mycredit.databinding.InputFieldBinding) bindings[3]
            , (ua.mycredit.mycredit.databinding.PasswordRequirementsBinding) bindings[5]
            , (android.widget.ViewSwitcher) bindings[1]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (ua.mycredit.mycredit.databinding.InputFieldBinding) bindings[4];
        setContainedBinding(this.mboundView1);
        this.mboundView2 = (android.widget.Button) bindings[2];
        this.mboundView2.setTag(null);
        this.viewSwitcher.setTag(null);
        setRootTag(root);
        // listeners
        mCallback67 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        oldPassword.invalidateAll();
        mboundView1.invalidateAll();
        passwordRequirements.invalidateAll();
        newPassword.invalidateAll();
        confirm.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (oldPassword.hasPendingBindings()) {
            return true;
        }
        if (mboundView1.hasPendingBindings()) {
            return true;
        }
        if (passwordRequirements.hasPendingBindings()) {
            return true;
        }
        if (newPassword.hasPendingBindings()) {
            return true;
        }
        if (confirm.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((ua.mycredit.mycredit.ui.profile.profile.contacts.EditPasswordViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ua.mycredit.mycredit.ui.profile.profile.contacts.EditPasswordViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable android.arch.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        oldPassword.setLifecycleOwner(lifecycleOwner);
        mboundView1.setLifecycleOwner(lifecycleOwner);
        passwordRequirements.setLifecycleOwner(lifecycleOwner);
        newPassword.setLifecycleOwner(lifecycleOwner);
        confirm.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeConfirm((ua.mycredit.mycredit.databinding.InputFieldBinding) object, fieldId);
            case 1 :
                return onChangePasswordRequirements((ua.mycredit.mycredit.databinding.PasswordRequirementsBinding) object, fieldId);
            case 2 :
                return onChangeOldPassword((ua.mycredit.mycredit.databinding.InputFieldBinding) object, fieldId);
            case 3 :
                return onChangeNewPassword((ua.mycredit.mycredit.databinding.InputFieldBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeConfirm(ua.mycredit.mycredit.databinding.InputFieldBinding Confirm, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangePasswordRequirements(ua.mycredit.mycredit.databinding.PasswordRequirementsBinding PasswordRequirements, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeOldPassword(ua.mycredit.mycredit.databinding.InputFieldBinding OldPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeNewPassword(ua.mycredit.mycredit.databinding.InputFieldBinding NewPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        int viewModelModeInstanceofModeByOldPasswordInt0Int1 = 0;
        ua.mycredit.mycredit.ui.bases.input.FieldViewModel viewModelSmsCode = null;
        ua.mycredit.mycredit.ui.profile.profile.contacts.EditPasswordViewModel.Mode viewModelMode = null;
        boolean viewModelModeInstanceofModeByOldPassword = false;
        android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged viewModelPasswordRequirementsOnPasswordChangedAndroidDatabindingAdaptersTextViewBindingAdapterAfterTextChanged = null;
        ua.mycredit.mycredit.ui.bases.input.FieldViewModel viewModelCurrentPassword = null;
        ua.mycredit.mycredit.ui.bases.input.PasswordRequirementsViewModel viewModelPasswordRequirements = null;
        ua.mycredit.mycredit.ui.bases.input.FieldViewModel viewModelConfirmNewPassword = null;
        ua.mycredit.mycredit.ui.bases.input.FieldViewModel viewModelNewPassword = null;
        ua.mycredit.mycredit.ui.profile.profile.contacts.EditPasswordViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x30L) != 0) {



                if (viewModel != null) {
                    // read viewModel.smsCode
                    viewModelSmsCode = viewModel.getSmsCode();
                    // read viewModel.mode
                    viewModelMode = viewModel.getMode();
                    // read viewModel.currentPassword
                    viewModelCurrentPassword = viewModel.getCurrentPassword();
                    // read viewModel.passwordRequirements
                    viewModelPasswordRequirements = viewModel.getPasswordRequirements();
                    // read viewModel.confirmNewPassword
                    viewModelConfirmNewPassword = viewModel.getConfirmNewPassword();
                    // read viewModel.newPassword
                    viewModelNewPassword = viewModel.getNewPassword();
                }


                // read viewModel.mode instanceof Mode.ByOldPassword
                viewModelModeInstanceofModeByOldPassword = viewModelMode instanceof ua.mycredit.mycredit.ui.profile.profile.contacts.EditPasswordViewModel.Mode.ByOldPassword;
            if((dirtyFlags & 0x30L) != 0) {
                if(viewModelModeInstanceofModeByOldPassword) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }
                if (viewModelPasswordRequirements != null) {
                    // read viewModel.passwordRequirements::onPasswordChanged
                    viewModelPasswordRequirementsOnPasswordChangedAndroidDatabindingAdaptersTextViewBindingAdapterAfterTextChanged = (((mViewModelPasswordRequirementsOnPasswordChangedAndroidDatabindingAdaptersTextViewBindingAdapterAfterTextChanged == null) ? (mViewModelPasswordRequirementsOnPasswordChangedAndroidDatabindingAdaptersTextViewBindingAdapterAfterTextChanged = new AfterTextChangedImpl()) : mViewModelPasswordRequirementsOnPasswordChangedAndroidDatabindingAdaptersTextViewBindingAdapterAfterTextChanged).setValue(viewModelPasswordRequirements));
                }


                // read viewModel.mode instanceof Mode.ByOldPassword ? 0 : 1
                viewModelModeInstanceofModeByOldPasswordInt0Int1 = ((viewModelModeInstanceofModeByOldPassword) ? (0) : (1));
        }
        // batch finished
        if ((dirtyFlags & 0x30L) != 0) {
            // api target 1

            this.confirm.setViewModel(viewModelConfirmNewPassword);
            this.mboundView1.setViewModel(viewModelSmsCode);
            this.newPassword.setAfterTextChanged(viewModelPasswordRequirementsOnPasswordChangedAndroidDatabindingAdaptersTextViewBindingAdapterAfterTextChanged);
            this.newPassword.setViewModel(viewModelNewPassword);
            this.oldPassword.setViewModel(viewModelCurrentPassword);
            this.passwordRequirements.setViewModel(viewModelPasswordRequirements);
            this.viewSwitcher.setDisplayedChild(viewModelModeInstanceofModeByOldPasswordInt0Int1);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.mboundView2.setOnClickListener(mCallback67);
        }
        executeBindingsOn(oldPassword);
        executeBindingsOn(mboundView1);
        executeBindingsOn(passwordRequirements);
        executeBindingsOn(newPassword);
        executeBindingsOn(confirm);
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
        ua.mycredit.mycredit.ui.profile.profile.contacts.EditPasswordViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.attemptToSend();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): confirm
        flag 1 (0x2L): passwordRequirements
        flag 2 (0x3L): oldPassword
        flag 3 (0x4L): newPassword
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): null
        flag 6 (0x7L): viewModel.mode instanceof Mode.ByOldPassword ? 0 : 1
        flag 7 (0x8L): viewModel.mode instanceof Mode.ByOldPassword ? 0 : 1
    flag mapping end*/
    //end
}