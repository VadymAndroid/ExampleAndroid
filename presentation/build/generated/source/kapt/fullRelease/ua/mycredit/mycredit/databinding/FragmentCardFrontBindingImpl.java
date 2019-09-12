package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCardFrontBindingImpl extends FragmentCardFrontBinding implements ua.mycredit.mycredit.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(10);
        sIncludes.setIncludes(1, 
            new String[] {"input_field_hint_static"},
            new int[] {6},
            new int[] {R.layout.input_field_hint_static});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.card_front, 7);
        sViewsWithIds.put(R.id.logos, 8);
        sViewsWithIds.put(R.id.expires, 9);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.RelativeLayout mboundView1;
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputFieldHintStaticBinding mboundView11;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView5;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback19;
    // values
    // listeners
    private OnTextChangedImpl mViewModelOnExpirationDateChangedAndroidDatabindingAdaptersTextViewBindingAdapterOnTextChanged;
    private OnTextChangedImpl1 mViewModelOnCardChangedAndroidDatabindingAdaptersTextViewBindingAdapterOnTextChanged;
    // Inverse Binding Event Handlers

    public FragmentCardFrontBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private FragmentCardFrontBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (br.com.sapereaude.maskedEditText.MaskedEditText) bindings[3]
            , (android.support.v7.widget.CardView) bindings[7]
            , (br.com.sapereaude.maskedEditText.MaskedEditText) bindings[4]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.LinearLayout) bindings[8]
            );
        this.card.setTag(null);
        this.expirationDate.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.RelativeLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView11 = (ua.mycredit.mycredit.databinding.InputFieldHintStaticBinding) bindings[6];
        setContainedBinding(this.mboundView11);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        setRootTag(root);
        // listeners
        mCallback19 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        mboundView11.invalidateAll();
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
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((ua.mycredit.mycredit.ui.authentication.registration.card.CardFrontFragment) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ua.mycredit.mycredit.ui.authentication.registration.card.CardFrontFragment ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable android.arch.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView11.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelCardError((android.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeViewModelExpirationDateError((android.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelCardError(android.databinding.ObservableBoolean ViewModelCardError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelExpirationDateError(android.databinding.ObservableBoolean ViewModelExpirationDateError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        int viewModelExpirationDateErrorExpirationDateAndroidColorRedExpirationDateAndroidColorGray757575 = 0;
        boolean viewModelExpirationDateErrorGet = false;
        android.databinding.ObservableBoolean viewModelCardError = null;
        android.databinding.ObservableBoolean viewModelExpirationDateError = null;
        boolean viewModelCardErrorGet = false;
        android.databinding.adapters.TextViewBindingAdapter.OnTextChanged viewModelOnExpirationDateChangedAndroidDatabindingAdaptersTextViewBindingAdapterOnTextChanged = null;
        ua.mycredit.mycredit.ui.bases.input.FieldViewModel viewModelCardHolder = null;
        android.databinding.adapters.TextViewBindingAdapter.OnTextChanged viewModelOnCardChangedAndroidDatabindingAdaptersTextViewBindingAdapterOnTextChanged = null;
        int viewModelExpirationDateErrorExpirationDateAndroidColorRedExpirationDateAndroidColorBlack = 0;
        boolean viewModelScanVisible = false;
        int viewModelCardErrorCardAndroidColorRedCardAndroidColorBlack = 0;
        ua.mycredit.mycredit.ui.authentication.registration.card.CardFrontFragment viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.cardError
                        viewModelCardError = viewModel.getCardError();
                    }
                    updateRegistration(0, viewModelCardError);


                    if (viewModelCardError != null) {
                        // read viewModel.cardError.get()
                        viewModelCardErrorGet = viewModelCardError.get();
                    }
                if((dirtyFlags & 0xdL) != 0) {
                    if(viewModelCardErrorGet) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read viewModel.cardError.get() ? @android:color/red : @android:color/black
                    viewModelCardErrorCardAndroidColorRedCardAndroidColorBlack = ((viewModelCardErrorGet) ? (getColorFromResource(card, R.color.red)) : (getColorFromResource(card, R.color.black)));
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.expirationDateError
                        viewModelExpirationDateError = viewModel.getExpirationDateError();
                    }
                    updateRegistration(1, viewModelExpirationDateError);


                    if (viewModelExpirationDateError != null) {
                        // read viewModel.expirationDateError.get()
                        viewModelExpirationDateErrorGet = viewModelExpirationDateError.get();
                    }
                if((dirtyFlags & 0xeL) != 0) {
                    if(viewModelExpirationDateErrorGet) {
                            dirtyFlags |= 0x20L;
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read viewModel.expirationDateError.get() ? @android:color/red : @android:color/gray_757575
                    viewModelExpirationDateErrorExpirationDateAndroidColorRedExpirationDateAndroidColorGray757575 = ((viewModelExpirationDateErrorGet) ? (getColorFromResource(expirationDate, R.color.red)) : (getColorFromResource(expirationDate, R.color.gray_757575)));
                    // read viewModel.expirationDateError.get() ? @android:color/red : @android:color/black
                    viewModelExpirationDateErrorExpirationDateAndroidColorRedExpirationDateAndroidColorBlack = ((viewModelExpirationDateErrorGet) ? (getColorFromResource(expirationDate, R.color.red)) : (getColorFromResource(expirationDate, R.color.black)));
            }
            if ((dirtyFlags & 0xcL) != 0) {

                    if (viewModel != null) {
                        // read viewModel::onExpirationDateChanged
                        viewModelOnExpirationDateChangedAndroidDatabindingAdaptersTextViewBindingAdapterOnTextChanged = (((mViewModelOnExpirationDateChangedAndroidDatabindingAdaptersTextViewBindingAdapterOnTextChanged == null) ? (mViewModelOnExpirationDateChangedAndroidDatabindingAdaptersTextViewBindingAdapterOnTextChanged = new OnTextChangedImpl()) : mViewModelOnExpirationDateChangedAndroidDatabindingAdaptersTextViewBindingAdapterOnTextChanged).setValue(viewModel));
                        // read viewModel.cardHolder
                        viewModelCardHolder = viewModel.getCardHolder();
                        // read viewModel::onCardChanged
                        viewModelOnCardChangedAndroidDatabindingAdaptersTextViewBindingAdapterOnTextChanged = (((mViewModelOnCardChangedAndroidDatabindingAdaptersTextViewBindingAdapterOnTextChanged == null) ? (mViewModelOnCardChangedAndroidDatabindingAdaptersTextViewBindingAdapterOnTextChanged = new OnTextChangedImpl1()) : mViewModelOnCardChangedAndroidDatabindingAdaptersTextViewBindingAdapterOnTextChanged).setValue(viewModel));
                        // read viewModel.scanVisible
                        viewModelScanVisible = viewModel.getScanVisible();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            ua.mycredit.mycredit.ui.BindingAdaptersKt.setHintColor(this.card, viewModelCardErrorCardAndroidColorRedCardAndroidColorBlack);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.card, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)viewModelOnCardChangedAndroidDatabindingAdaptersTextViewBindingAdapterOnTextChanged, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, (android.databinding.InverseBindingListener)null);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.expirationDate, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)viewModelOnExpirationDateChangedAndroidDatabindingAdaptersTextViewBindingAdapterOnTextChanged, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, (android.databinding.InverseBindingListener)null);
            this.mboundView11.setViewModel(viewModelCardHolder);
            this.mboundView2.setVisibility(ua.mycredit.mycredit.ui.BindingAdaptersKt.booleanToVisibility(viewModelScanVisible));
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            this.expirationDate.setTextColor(viewModelExpirationDateErrorExpirationDateAndroidColorRedExpirationDateAndroidColorBlack);
            ua.mycredit.mycredit.ui.BindingAdaptersKt.setHintColor(this.expirationDate, viewModelExpirationDateErrorExpirationDateAndroidColorRedExpirationDateAndroidColorGray757575);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.mboundView11.setHintStatic(getRoot().getResources().getString(R.string.card_holder));
            this.mboundView2.setOnClickListener(mCallback19);
            ua.mycredit.mycredit.ui.BindingAdaptersKt.setHtmlText(this.mboundView5, mboundView5.getResources().getString(R.string.how_to_verify_card_tutorial));
        }
        executeBindingsOn(mboundView11);
    }
    // Listener Stub Implementations
    public static class OnTextChangedImpl implements android.databinding.adapters.TextViewBindingAdapter.OnTextChanged{
        private ua.mycredit.mycredit.ui.authentication.registration.card.CardFrontFragment value;
        public OnTextChangedImpl setValue(ua.mycredit.mycredit.ui.authentication.registration.card.CardFrontFragment value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onTextChanged(java.lang.CharSequence arg0, int arg1, int arg2, int arg3) {
            this.value.onExpirationDateChanged(arg0, arg1, arg2, arg3); 
        }
    }
    public static class OnTextChangedImpl1 implements android.databinding.adapters.TextViewBindingAdapter.OnTextChanged{
        private ua.mycredit.mycredit.ui.authentication.registration.card.CardFrontFragment value;
        public OnTextChangedImpl1 setValue(ua.mycredit.mycredit.ui.authentication.registration.card.CardFrontFragment value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onTextChanged(java.lang.CharSequence arg0, int arg1, int arg2, int arg3) {
            this.value.onCardChanged(arg0, arg1, arg2, arg3); 
        }
    }
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        ua.mycredit.mycredit.ui.authentication.registration.card.CardFrontFragment viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.onScan();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.cardError
        flag 1 (0x2L): viewModel.expirationDateError
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): viewModel.expirationDateError.get() ? @android:color/red : @android:color/gray_757575
        flag 5 (0x6L): viewModel.expirationDateError.get() ? @android:color/red : @android:color/gray_757575
        flag 6 (0x7L): viewModel.expirationDateError.get() ? @android:color/red : @android:color/black
        flag 7 (0x8L): viewModel.expirationDateError.get() ? @android:color/red : @android:color/black
        flag 8 (0x9L): viewModel.cardError.get() ? @android:color/red : @android:color/black
        flag 9 (0xaL): viewModel.cardError.get() ? @android:color/red : @android:color/black
    flag mapping end*/
    //end
}