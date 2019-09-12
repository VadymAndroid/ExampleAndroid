package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class InputPhoneNumberBindingImpl extends InputPhoneNumberBinding implements ua.mycredit.mycredit.generated.callback.OnEditorActionListener.Listener, ua.mycredit.mycredit.generated.callback.OnFocusChangeListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView3;
    // variables
    @Nullable
    private final android.widget.TextView.OnEditorActionListener mCallback15;
    @Nullable
    private final android.view.View.OnFocusChangeListener mCallback14;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener maskedPhoneandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.input.get()
            //         is viewModel.input.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(maskedPhone);
            // localize variables for thread safety
            // viewModel.input
            android.databinding.ObservableField<java.lang.String> viewModelInput = null;
            // viewModel.input.get()
            java.lang.String viewModelInputGet = null;
            // viewModel
            ua.mycredit.mycredit.ui.bases.input.FieldViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.input != null
            boolean viewModelInputJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelInput = viewModel.getInput();

                viewModelInputJavaLangObjectNull = (viewModelInput) != (null);
                if (viewModelInputJavaLangObjectNull) {




                    viewModelInput.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener maskedPhonerequestFocusAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.requestFocus.get()
            //         is viewModel.requestFocus.set((ua.mycredit.mycredit.ui.RequestFocus) callbackArg_0)
            ua.mycredit.mycredit.ui.RequestFocus callbackArg_0 = ua.mycredit.mycredit.ui.BindingAdaptersKt.notifyFocusRequested(maskedPhone);
            // localize variables for thread safety
            // viewModel.requestFocus.get()
            ua.mycredit.mycredit.ui.RequestFocus viewModelRequestFocusGet = null;
            // viewModel.requestFocus != null
            boolean viewModelRequestFocusJavaLangObjectNull = false;
            // viewModel
            ua.mycredit.mycredit.ui.bases.input.FieldViewModel viewModel = mViewModel;
            // viewModel.requestFocus
            android.databinding.ObservableField<ua.mycredit.mycredit.ui.RequestFocus> viewModelRequestFocus = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelRequestFocus = viewModel.getRequestFocus();

                viewModelRequestFocusJavaLangObjectNull = (viewModelRequestFocus) != (null);
                if (viewModelRequestFocusJavaLangObjectNull) {




                    viewModelRequestFocus.set(((ua.mycredit.mycredit.ui.RequestFocus) (callbackArg_0)));
                }
            }
        }
    };

    public InputPhoneNumberBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private InputPhoneNumberBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 7
            , (br.com.sapereaude.maskedEditText.MaskedEditText) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.maskedPhone.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.topHint.setTag(null);
        setRootTag(root);
        // listeners
        mCallback15 = new ua.mycredit.mycredit.generated.callback.OnEditorActionListener(this, 2);
        mCallback14 = new ua.mycredit.mycredit.generated.callback.OnFocusChangeListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100L;
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
            setViewModel((ua.mycredit.mycredit.ui.bases.input.FieldViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ua.mycredit.mycredit.ui.bases.input.FieldViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelError((android.databinding.ObservableInt) object, fieldId);
            case 1 :
                return onChangeViewModelFocusable((android.databinding.ObservableBoolean) object, fieldId);
            case 2 :
                return onChangeViewModelEnabled((android.databinding.ObservableBoolean) object, fieldId);
            case 3 :
                return onChangeViewModelInput((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelHasFocus((android.databinding.ObservableBoolean) object, fieldId);
            case 5 :
                return onChangeViewModelClickable((android.databinding.ObservableBoolean) object, fieldId);
            case 6 :
                return onChangeViewModelRequestFocus((android.databinding.ObservableField<ua.mycredit.mycredit.ui.RequestFocus>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelError(android.databinding.ObservableInt ViewModelError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelFocusable(android.databinding.ObservableBoolean ViewModelFocusable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelEnabled(android.databinding.ObservableBoolean ViewModelEnabled, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelInput(android.databinding.ObservableField<java.lang.String> ViewModelInput, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelHasFocus(android.databinding.ObservableBoolean ViewModelHasFocus, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelClickable(android.databinding.ObservableBoolean ViewModelClickable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelRequestFocus(android.databinding.ObservableField<ua.mycredit.mycredit.ui.RequestFocus> ViewModelRequestFocus, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
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
        int viewModelHint = 0;
        int viewModelHasFocusMaskedPhoneAndroidColorColorAccentMaskedPhoneAndroidColorGray = 0;
        boolean viewModelClickableGet = false;
        boolean viewModelHasFocusGet = false;
        android.databinding.ObservableInt viewModelError = null;
        boolean viewModelOptional = false;
        android.databinding.ObservableBoolean viewModelFocusable = null;
        java.lang.String viewModelInputGet = null;
        ua.mycredit.mycredit.ui.RequestFocus viewModelRequestFocusGet = null;
        int viewModelHasFocusTopHintAndroidColorColorAccentTopHintAndroidColorGray8F8F8F = 0;
        android.databinding.ObservableBoolean viewModelEnabled = null;
        boolean viewModelErrorInt0 = false;
        android.databinding.ObservableField<java.lang.String> viewModelInput = null;
        int viewModelErrorInt0MaskedPhoneAndroidColorRedViewModelHasFocusMaskedPhoneAndroidColorColorAccentMaskedPhoneAndroidColorGray = 0;
        android.databinding.ObservableBoolean viewModelHasFocus = null;
        android.databinding.ObservableBoolean viewModelClickable = null;
        int viewModelErrorGet = 0;
        boolean viewModelFocusableGet = false;
        android.databinding.ObservableField<ua.mycredit.mycredit.ui.RequestFocus> viewModelRequestFocus = null;
        boolean viewModelEnabledGet = false;
        ua.mycredit.mycredit.ui.bases.input.FieldViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x1ffL) != 0) {


            if ((dirtyFlags & 0x180L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.hint
                        viewModelHint = viewModel.getHint();
                        // read viewModel.optional
                        viewModelOptional = viewModel.getOptional();
                    }
            }
            if ((dirtyFlags & 0x191L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.error
                        viewModelError = viewModel.getError();
                    }
                    updateRegistration(0, viewModelError);


                    if (viewModelError != null) {
                        // read viewModel.error.get()
                        viewModelErrorGet = viewModelError.get();
                    }


                    // read viewModel.error.get() != 0
                    viewModelErrorInt0 = (viewModelErrorGet) != (0);
                if((dirtyFlags & 0x191L) != 0) {
                    if(viewModelErrorInt0) {
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                    }
                }
            }
            if ((dirtyFlags & 0x182L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.focusable
                        viewModelFocusable = viewModel.getFocusable();
                    }
                    updateRegistration(1, viewModelFocusable);


                    if (viewModelFocusable != null) {
                        // read viewModel.focusable.get()
                        viewModelFocusableGet = viewModelFocusable.get();
                    }
            }
            if ((dirtyFlags & 0x184L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.enabled
                        viewModelEnabled = viewModel.getEnabled();
                    }
                    updateRegistration(2, viewModelEnabled);


                    if (viewModelEnabled != null) {
                        // read viewModel.enabled.get()
                        viewModelEnabledGet = viewModelEnabled.get();
                    }
            }
            if ((dirtyFlags & 0x188L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.input
                        viewModelInput = viewModel.getInput();
                    }
                    updateRegistration(3, viewModelInput);


                    if (viewModelInput != null) {
                        // read viewModel.input.get()
                        viewModelInputGet = viewModelInput.get();
                    }
            }
            if ((dirtyFlags & 0x190L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.hasFocus
                        viewModelHasFocus = viewModel.getHasFocus();
                    }
                    updateRegistration(4, viewModelHasFocus);


                    if (viewModelHasFocus != null) {
                        // read viewModel.hasFocus.get()
                        viewModelHasFocusGet = viewModelHasFocus.get();
                    }
                if((dirtyFlags & 0x2000L) != 0) {
                    if(viewModelHasFocusGet) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }
                if((dirtyFlags & 0x190L) != 0) {
                    if(viewModelHasFocusGet) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }


                    // read viewModel.hasFocus.get() ? @android:color/colorAccent : @android:color/gray_8F8F8F
                    viewModelHasFocusTopHintAndroidColorColorAccentTopHintAndroidColorGray8F8F8F = ((viewModelHasFocusGet) ? (getColorFromResource(topHint, R.color.colorAccent)) : (getColorFromResource(topHint, R.color.gray_8F8F8F)));
            }
            if ((dirtyFlags & 0x1a0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.clickable
                        viewModelClickable = viewModel.getClickable();
                    }
                    updateRegistration(5, viewModelClickable);


                    if (viewModelClickable != null) {
                        // read viewModel.clickable.get()
                        viewModelClickableGet = viewModelClickable.get();
                    }
            }
            if ((dirtyFlags & 0x1c0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.requestFocus
                        viewModelRequestFocus = viewModel.getRequestFocus();
                    }
                    updateRegistration(6, viewModelRequestFocus);


                    if (viewModelRequestFocus != null) {
                        // read viewModel.requestFocus.get()
                        viewModelRequestFocusGet = viewModelRequestFocus.get();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x2000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.hasFocus
                    viewModelHasFocus = viewModel.getHasFocus();
                }
                updateRegistration(4, viewModelHasFocus);


                if (viewModelHasFocus != null) {
                    // read viewModel.hasFocus.get()
                    viewModelHasFocusGet = viewModelHasFocus.get();
                }
            if((dirtyFlags & 0x2000L) != 0) {
                if(viewModelHasFocusGet) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }
            if((dirtyFlags & 0x190L) != 0) {
                if(viewModelHasFocusGet) {
                        dirtyFlags |= 0x1000L;
                }
                else {
                        dirtyFlags |= 0x800L;
                }
            }


                // read viewModel.hasFocus.get() ? @android:color/colorAccent : @android:color/gray
                viewModelHasFocusMaskedPhoneAndroidColorColorAccentMaskedPhoneAndroidColorGray = ((viewModelHasFocusGet) ? (getColorFromResource(maskedPhone, R.color.colorAccent)) : (getColorFromResource(maskedPhone, R.color.gray)));
        }

        if ((dirtyFlags & 0x191L) != 0) {

                // read viewModel.error.get() != 0 ? @android:color/red : viewModel.hasFocus.get() ? @android:color/colorAccent : @android:color/gray
                viewModelErrorInt0MaskedPhoneAndroidColorRedViewModelHasFocusMaskedPhoneAndroidColorColorAccentMaskedPhoneAndroidColorGray = ((viewModelErrorInt0) ? (getColorFromResource(maskedPhone, R.color.red)) : (viewModelHasFocusMaskedPhoneAndroidColorColorAccentMaskedPhoneAndroidColorGray));
        }
        // batch finished
        if ((dirtyFlags & 0x191L) != 0) {
            // api target 21
            if(getBuildSdkInt() >= 21) {

                this.maskedPhone.setBackgroundTintList(android.databinding.adapters.Converters.convertColorToColorStateList(viewModelErrorInt0MaskedPhoneAndroidColorRedViewModelHasFocusMaskedPhoneAndroidColorColorAccentMaskedPhoneAndroidColorGray));
            }
        }
        if ((dirtyFlags & 0x1a0L) != 0) {
            // api target 1

            this.maskedPhone.setClickable(viewModelClickableGet);
        }
        if ((dirtyFlags & 0x184L) != 0) {
            // api target 1

            this.maskedPhone.setEnabled(viewModelEnabledGet);
        }
        if ((dirtyFlags & 0x182L) != 0) {
            // api target 1

            this.maskedPhone.setFocusable(viewModelFocusableGet);
        }
        if ((dirtyFlags & 0x100L) != 0) {
            // api target 1

            this.maskedPhone.setOnFocusChangeListener(mCallback14);
            this.maskedPhone.setOnEditorActionListener(mCallback15);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.maskedPhone, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, maskedPhoneandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x188L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.maskedPhone, viewModelInputGet);
        }
        if ((dirtyFlags & 0x1c0L) != 0) {
            // api target 1

            ua.mycredit.mycredit.ui.BindingAdaptersKt.setHasFocusAttrChangedListener(this.maskedPhone, viewModelRequestFocusGet, maskedPhonerequestFocusAttrChanged);
        }
        if ((dirtyFlags & 0x181L) != 0) {
            // api target 1

            ua.mycredit.mycredit.ui.BindingAdaptersKt.setTextOrInvisible(this.mboundView3, viewModelErrorGet);
        }
        if ((dirtyFlags & 0x190L) != 0) {
            // api target 1

            this.topHint.setHintTextColor(viewModelHasFocusTopHintAndroidColorColorAccentTopHintAndroidColorGray8F8F8F);
        }
        if ((dirtyFlags & 0x180L) != 0) {
            // api target 1

            ua.mycredit.mycredit.ui.BindingAdaptersKt.setHint(this.topHint, viewModelHint, viewModelOptional);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final boolean _internalCallbackOnEditorAction(int sourceId , android.widget.TextView callbackArg_0, int callbackArg_1, android.view.KeyEvent callbackArg_2) {
        // localize variables for thread safety
        // viewModel.onEditorAction(actionId)
        boolean viewModelOnEditorActionCallbackArg1 = false;
        // viewModel
        ua.mycredit.mycredit.ui.bases.input.FieldViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {



            viewModelOnEditorActionCallbackArg1 = viewModel.onEditorAction(callbackArg_1);
        }
        return viewModelOnEditorActionCallbackArg1;
    }
    public final void _internalCallbackOnFocusChange(int sourceId , android.view.View callbackArg_0, boolean callbackArg_1) {
        // localize variables for thread safety
        // viewModel
        ua.mycredit.mycredit.ui.bases.input.FieldViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;


        if (callbackArg_1) {



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModel.onFocused();
            }
        }
        else {



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModel.onFocusLost();
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.error
        flag 1 (0x2L): viewModel.focusable
        flag 2 (0x3L): viewModel.enabled
        flag 3 (0x4L): viewModel.input
        flag 4 (0x5L): viewModel.hasFocus
        flag 5 (0x6L): viewModel.clickable
        flag 6 (0x7L): viewModel.requestFocus
        flag 7 (0x8L): viewModel
        flag 8 (0x9L): null
        flag 9 (0xaL): viewModel.hasFocus.get() ? @android:color/colorAccent : @android:color/gray
        flag 10 (0xbL): viewModel.hasFocus.get() ? @android:color/colorAccent : @android:color/gray
        flag 11 (0xcL): viewModel.hasFocus.get() ? @android:color/colorAccent : @android:color/gray_8F8F8F
        flag 12 (0xdL): viewModel.hasFocus.get() ? @android:color/colorAccent : @android:color/gray_8F8F8F
        flag 13 (0xeL): viewModel.error.get() != 0 ? @android:color/red : viewModel.hasFocus.get() ? @android:color/colorAccent : @android:color/gray
        flag 14 (0xfL): viewModel.error.get() != 0 ? @android:color/red : viewModel.hasFocus.get() ? @android:color/colorAccent : @android:color/gray
    flag mapping end*/
    //end
}