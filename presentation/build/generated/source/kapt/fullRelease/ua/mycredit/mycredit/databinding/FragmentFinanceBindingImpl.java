package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentFinanceBindingImpl extends FragmentFinanceBinding implements ua.mycredit.mycredit.generated.callback.OnCheckedChangeListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(8);
        sIncludes.setIncludes(2, 
            new String[] {"input_variant_picker"},
            new int[] {7},
            new int[] {R.layout.input_variant_picker});
        sIncludes.setIncludes(1, 
            new String[] {"input_variant_picker", "input_variant_picker"},
            new int[] {5, 6},
            new int[] {R.layout.input_variant_picker, R.layout.input_variant_picker});
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputVariantPickerBinding mboundView11;
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputVariantPickerBinding mboundView12;
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputVariantPickerBinding mboundView21;
    // variables
    @Nullable
    private final android.widget.CompoundButton.OnCheckedChangeListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener dataProcessAllowedandroidCheckedAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.dataProcessAllowed.get()
            //         is viewModel.dataProcessAllowed.set((boolean) callbackArg_0)
            boolean callbackArg_0 = dataProcessAllowed.isChecked();
            // localize variables for thread safety
            // viewModel.dataProcessAllowed.get()
            boolean viewModelDataProcessAllowedGet = false;
            // viewModel.dataProcessAllowed != null
            boolean viewModelDataProcessAllowedJavaLangObjectNull = false;
            // viewModel
            ua.mycredit.mycredit.ui.authentication.registration.finance.FinanceViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.dataProcessAllowed
            android.databinding.ObservableBoolean viewModelDataProcessAllowed = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelDataProcessAllowed = viewModel.getDataProcessAllowed();

                viewModelDataProcessAllowedJavaLangObjectNull = (viewModelDataProcessAllowed) != (null);
                if (viewModelDataProcessAllowedJavaLangObjectNull) {




                    viewModelDataProcessAllowed.set(((boolean) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mailSubscriptionandroidCheckedAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.mailSubscription.get()
            //         is viewModel.mailSubscription.set((boolean) callbackArg_0)
            boolean callbackArg_0 = mailSubscription.isChecked();
            // localize variables for thread safety
            // viewModel.mailSubscription
            android.databinding.ObservableBoolean viewModelMailSubscription = null;
            // viewModel.mailSubscription.get()
            boolean viewModelMailSubscriptionGet = false;
            // viewModel
            ua.mycredit.mycredit.ui.authentication.registration.finance.FinanceViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.mailSubscription != null
            boolean viewModelMailSubscriptionJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelMailSubscription = viewModel.getMailSubscription();

                viewModelMailSubscriptionJavaLangObjectNull = (viewModelMailSubscription) != (null);
                if (viewModelMailSubscriptionJavaLangObjectNull) {




                    viewModelMailSubscription.set(((boolean) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentFinanceBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentFinanceBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.support.v7.widget.SwitchCompat) bindings[4]
            , (android.support.v7.widget.SwitchCompat) bindings[3]
            );
        this.dataProcessAllowed.setTag(null);
        this.mailSubscription.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView11 = (ua.mycredit.mycredit.databinding.InputVariantPickerBinding) bindings[5];
        setContainedBinding(this.mboundView11);
        this.mboundView12 = (ua.mycredit.mycredit.databinding.InputVariantPickerBinding) bindings[6];
        setContainedBinding(this.mboundView12);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView21 = (ua.mycredit.mycredit.databinding.InputVariantPickerBinding) bindings[7];
        setContainedBinding(this.mboundView21);
        setRootTag(root);
        // listeners
        mCallback1 = new ua.mycredit.mycredit.generated.callback.OnCheckedChangeListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        mboundView11.invalidateAll();
        mboundView12.invalidateAll();
        mboundView21.invalidateAll();
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
        if (mboundView21.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((ua.mycredit.mycredit.ui.authentication.registration.finance.FinanceViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ua.mycredit.mycredit.ui.authentication.registration.finance.FinanceViewModel ViewModel) {
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
        mboundView11.setLifecycleOwner(lifecycleOwner);
        mboundView12.setLifecycleOwner(lifecycleOwner);
        mboundView21.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelDataProcessTextColorRes((android.databinding.ObservableInt) object, fieldId);
            case 1 :
                return onChangeViewModelMailSubscription((android.databinding.ObservableBoolean) object, fieldId);
            case 2 :
                return onChangeViewModelDataProcessAllowed((android.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelDataProcessTextColorRes(android.databinding.ObservableInt ViewModelDataProcessTextColorRes, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelMailSubscription(android.databinding.ObservableBoolean ViewModelMailSubscription, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDataProcessAllowed(android.databinding.ObservableBoolean ViewModelDataProcessAllowed, int fieldId) {
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
        boolean viewModelProfileSignUpFlowBooleanTrueViewModelDataProcessAllowed = false;
        int viewModelDataProcessTextColorResGet = 0;
        boolean viewModelMailSubscriptionGet = false;
        android.databinding.ObservableInt viewModelDataProcessTextColorRes = null;
        android.databinding.ObservableBoolean viewModelMailSubscription = null;
        ua.mycredit.core.Profile viewModelProfile = null;
        ua.mycredit.mycredit.ui.bases.input.FormViewModel.SimplePickerDialogViewModel<ua.mycredit.core.PaymentsAmountOnLoans> viewModelPaymentsAmountOnLoans = null;
        boolean viewModelDataProcessAllowedGet = false;
        boolean viewModelDataProcessAllowed = false;
        ua.mycredit.mycredit.ui.bases.input.FormViewModel.SimplePickerDialogViewModel<ua.mycredit.core.LoanPurpose> viewModelLoanPurpose = null;
        android.databinding.ObservableBoolean ViewModelDataProcessAllowed1 = null;
        boolean viewModelProfileSignUpFlow = false;
        ua.mycredit.mycredit.ui.bases.input.FormViewModel.SimplePickerDialogViewModel<ua.mycredit.core.FamilyExpense> viewModelFamilyExpenses = null;
        ua.mycredit.mycredit.ui.authentication.registration.finance.FinanceViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.dataProcessTextColorRes
                        viewModelDataProcessTextColorRes = viewModel.getDataProcessTextColorRes();
                    }
                    updateRegistration(0, viewModelDataProcessTextColorRes);


                    if (viewModelDataProcessTextColorRes != null) {
                        // read viewModel.dataProcessTextColorRes.get()
                        viewModelDataProcessTextColorResGet = viewModelDataProcessTextColorRes.get();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.mailSubscription
                        viewModelMailSubscription = viewModel.getMailSubscription();
                    }
                    updateRegistration(1, viewModelMailSubscription);


                    if (viewModelMailSubscription != null) {
                        // read viewModel.mailSubscription.get()
                        viewModelMailSubscriptionGet = viewModelMailSubscription.get();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.profile
                        viewModelProfile = viewModel.getProfile();
                        // read viewModel.dataProcessAllowed
                        ViewModelDataProcessAllowed1 = viewModel.getDataProcessAllowed();
                    }
                    updateRegistration(2, ViewModelDataProcessAllowed1);


                    if (viewModelProfile != null) {
                        // read viewModel.profile.signUpFlow
                        viewModelProfileSignUpFlow = viewModelProfile.getSignUpFlow();
                    }
                if((dirtyFlags & 0x1cL) != 0) {
                    if(viewModelProfileSignUpFlow) {
                            dirtyFlags |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                    }
                }
                    if (ViewModelDataProcessAllowed1 != null) {
                        // read viewModel.dataProcessAllowed.get()
                        viewModelDataProcessAllowedGet = ViewModelDataProcessAllowed1.get();
                    }
            }
            if ((dirtyFlags & 0x18L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.paymentsAmountOnLoans
                        viewModelPaymentsAmountOnLoans = viewModel.getPaymentsAmountOnLoans();
                        // read viewModel.loanPurpose
                        viewModelLoanPurpose = viewModel.getLoanPurpose();
                        // read viewModel.familyExpenses
                        viewModelFamilyExpenses = viewModel.getFamilyExpenses();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x20L) != 0) {

                // read !viewModel.dataProcessAllowed.get()
                viewModelDataProcessAllowed = !viewModelDataProcessAllowedGet;
        }

        if ((dirtyFlags & 0x1cL) != 0) {

                // read viewModel.profile.signUpFlow ? true : !viewModel.dataProcessAllowed.get()
                viewModelProfileSignUpFlowBooleanTrueViewModelDataProcessAllowed = ((viewModelProfileSignUpFlow) ? (true) : (viewModelDataProcessAllowed));
        }
        // batch finished
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            android.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.dataProcessAllowed, viewModelDataProcessAllowedGet);
            this.dataProcessAllowed.setEnabled(viewModelProfileSignUpFlowBooleanTrueViewModelDataProcessAllowed);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            ua.mycredit.mycredit.ui.BindingAdaptersKt.setTextColorResource(this.dataProcessAllowed, viewModelDataProcessTextColorResGet);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            android.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.dataProcessAllowed, mCallback1, dataProcessAllowedandroidCheckedAttrChanged);
            android.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.mailSubscription, (android.widget.CompoundButton.OnCheckedChangeListener)null, mailSubscriptionandroidCheckedAttrChanged);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            android.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mailSubscription, viewModelMailSubscriptionGet);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            this.mboundView11.setViewModel(viewModelFamilyExpenses);
            this.mboundView12.setViewModel(viewModelPaymentsAmountOnLoans);
            this.mboundView21.setViewModel(viewModelLoanPurpose);
        }
        executeBindingsOn(mboundView11);
        executeBindingsOn(mboundView12);
        executeBindingsOn(mboundView21);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnCheckedChanged(int sourceId , android.widget.CompoundButton callbackArg_0, boolean callbackArg_1) {
        // localize variables for thread safety
        // viewModel
        ua.mycredit.mycredit.ui.authentication.registration.finance.FinanceViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.processDataProcessAllowedChanged();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.dataProcessTextColorRes
        flag 1 (0x2L): viewModel.mailSubscription
        flag 2 (0x3L): viewModel.dataProcessAllowed
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
        flag 5 (0x6L): viewModel.profile.signUpFlow ? true : !viewModel.dataProcessAllowed.get()
        flag 6 (0x7L): viewModel.profile.signUpFlow ? true : !viewModel.dataProcessAllowed.get()
    flag mapping end*/
    //end
}