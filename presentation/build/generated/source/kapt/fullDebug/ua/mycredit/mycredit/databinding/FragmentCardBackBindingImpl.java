package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCardBackBindingImpl extends FragmentCardBackBinding implements ua.mycredit.mycredit.generated.callback.OnEditorActionListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.parent, 2);
        sViewsWithIds.put(R.id.cvv_explanation, 3);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    // variables
    @Nullable
    private final android.widget.TextView.OnEditorActionListener mCallback11;
    // values
    // listeners
    private OnTextChangedImpl mViewModelOnCvvChangedAndroidDatabindingAdaptersTextViewBindingAdapterOnTextChanged;
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener cvvandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.cvv.get()
            //         is viewModel.cvv.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(cvv);
            // localize variables for thread safety
            // viewModel.cvv != null
            boolean viewModelCvvJavaLangObjectNull = false;
            // viewModel.cvv
            android.databinding.ObservableField<java.lang.String> viewModelCvv = null;
            // viewModel
            ua.mycredit.mycredit.ui.authentication.registration.card.CardBackViewModel viewModel = mViewModel;
            // viewModel.cvv.get()
            java.lang.String viewModelCvvGet = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelCvv = viewModel.getCvv();

                viewModelCvvJavaLangObjectNull = (viewModelCvv) != (null);
                if (viewModelCvvJavaLangObjectNull) {




                    viewModelCvv.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentCardBackBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentCardBackBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (br.com.sapereaude.maskedEditText.MaskedEditText) bindings[1]
            , (android.support.v7.widget.CardView) bindings[3]
            , (android.widget.RelativeLayout) bindings[2]
            );
        this.cvv.setTag(null);
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback11 = new ua.mycredit.mycredit.generated.callback.OnEditorActionListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((ua.mycredit.mycredit.ui.authentication.registration.card.CardBackViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ua.mycredit.mycredit.ui.authentication.registration.card.CardBackViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelCvv((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelCvvError((android.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelCvv(android.databinding.ObservableField<java.lang.String> ViewModelCvv, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCvvError(android.databinding.ObservableBoolean ViewModelCvvError, int fieldId) {
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
        android.databinding.ObservableField<java.lang.String> viewModelCvv = null;
        int viewModelCvvErrorCvvAndroidColorRedCvvAndroidColorGray757575 = 0;
        android.databinding.ObservableBoolean viewModelCvvError = null;
        java.lang.String viewModelCvvGet = null;
        android.databinding.adapters.TextViewBindingAdapter.OnTextChanged viewModelOnCvvChangedAndroidDatabindingAdaptersTextViewBindingAdapterOnTextChanged = null;
        boolean viewModelCvvErrorGet = false;
        ua.mycredit.mycredit.ui.authentication.registration.card.CardBackViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.cvv
                        viewModelCvv = viewModel.getCvv();
                    }
                    updateRegistration(0, viewModelCvv);


                    if (viewModelCvv != null) {
                        // read viewModel.cvv.get()
                        viewModelCvvGet = viewModelCvv.get();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.cvvError
                        viewModelCvvError = viewModel.getCvvError();
                    }
                    updateRegistration(1, viewModelCvvError);


                    if (viewModelCvvError != null) {
                        // read viewModel.cvvError.get()
                        viewModelCvvErrorGet = viewModelCvvError.get();
                    }
                if((dirtyFlags & 0xeL) != 0) {
                    if(viewModelCvvErrorGet) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }


                    // read viewModel.cvvError.get() ? @android:color/red : @android:color/gray_757575
                    viewModelCvvErrorCvvAndroidColorRedCvvAndroidColorGray757575 = ((viewModelCvvErrorGet) ? (getColorFromResource(cvv, R.color.red)) : (getColorFromResource(cvv, R.color.gray_757575)));
            }
            if ((dirtyFlags & 0xcL) != 0) {

                    if (viewModel != null) {
                        // read viewModel::onCvvChanged
                        viewModelOnCvvChangedAndroidDatabindingAdaptersTextViewBindingAdapterOnTextChanged = (((mViewModelOnCvvChangedAndroidDatabindingAdaptersTextViewBindingAdapterOnTextChanged == null) ? (mViewModelOnCvvChangedAndroidDatabindingAdaptersTextViewBindingAdapterOnTextChanged = new OnTextChangedImpl()) : mViewModelOnCvvChangedAndroidDatabindingAdaptersTextViewBindingAdapterOnTextChanged).setValue(viewModel));
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.cvv, viewModelCvvGet);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.cvv.setOnEditorActionListener(mCallback11);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            ua.mycredit.mycredit.ui.BindingAdaptersKt.setHintColor(this.cvv, viewModelCvvErrorCvvAndroidColorRedCvvAndroidColorGray757575);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.cvv, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)viewModelOnCvvChangedAndroidDatabindingAdaptersTextViewBindingAdapterOnTextChanged, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, cvvandroidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    public static class OnTextChangedImpl implements android.databinding.adapters.TextViewBindingAdapter.OnTextChanged{
        private ua.mycredit.mycredit.ui.authentication.registration.card.CardBackViewModel value;
        public OnTextChangedImpl setValue(ua.mycredit.mycredit.ui.authentication.registration.card.CardBackViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onTextChanged(java.lang.CharSequence arg0, int arg1, int arg2, int arg3) {
            this.value.onCvvChanged(arg0, arg1, arg2, arg3); 
        }
    }
    // callback impls
    public final boolean _internalCallbackOnEditorAction(int sourceId , android.widget.TextView callbackArg_0, int callbackArg_1, android.view.KeyEvent callbackArg_2) {
        // localize variables for thread safety
        // viewModel.onEditorAction(actionId)
        boolean viewModelOnEditorActionCallbackArg1 = false;
        // viewModel
        ua.mycredit.mycredit.ui.authentication.registration.card.CardBackViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {



            viewModelOnEditorActionCallbackArg1 = viewModel.onEditorAction(callbackArg_1);
        }
        return viewModelOnEditorActionCallbackArg1;
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.cvv
        flag 1 (0x2L): viewModel.cvvError
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): viewModel.cvvError.get() ? @android:color/red : @android:color/gray_757575
        flag 5 (0x6L): viewModel.cvvError.get() ? @android:color/red : @android:color/gray_757575
    flag mapping end*/
    //end
}