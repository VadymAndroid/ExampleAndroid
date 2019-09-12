package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class InputFieldBindingImpl extends InputFieldBinding implements ua.mycredit.mycredit.generated.callback.OnEditorActionListener.Listener, ua.mycredit.mycredit.generated.callback.OnClickListener.Listener, ua.mycredit.mycredit.generated.callback.OnFocusChangeListener.Listener {

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
    private final android.support.design.widget.TextInputLayout mboundView0;
    // variables
    @Nullable
    private final android.widget.TextView.OnEditorActionListener mCallback64;
    @Nullable
    private final android.view.View.OnClickListener mCallback62;
    @Nullable
    private final android.view.View.OnFocusChangeListener mCallback63;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener editTextandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.input.get()
            //         is viewModel.input.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(editText);
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
    private android.databinding.InverseBindingListener editTextmoveCursorToEndAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.moveCursorToEnd.get()
            //         is viewModel.moveCursorToEnd.set((ua.mycredit.mycredit.ui.MoveCursorToEnd) callbackArg_0)
            ua.mycredit.mycredit.ui.MoveCursorToEnd callbackArg_0 = ua.mycredit.mycredit.ui.BindingAdaptersKt.notifyCursorMovedToNext(editText);
            // localize variables for thread safety
            // viewModel.moveCursorToEnd
            android.databinding.ObservableField<ua.mycredit.mycredit.ui.MoveCursorToEnd> viewModelMoveCursorToEnd = null;
            // viewModel.moveCursorToEnd.get()
            ua.mycredit.mycredit.ui.MoveCursorToEnd viewModelMoveCursorToEndGet = null;
            // viewModel
            ua.mycredit.mycredit.ui.bases.input.FieldViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.moveCursorToEnd != null
            boolean viewModelMoveCursorToEndJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelMoveCursorToEnd = viewModel.getMoveCursorToEnd();

                viewModelMoveCursorToEndJavaLangObjectNull = (viewModelMoveCursorToEnd) != (null);
                if (viewModelMoveCursorToEndJavaLangObjectNull) {




                    viewModelMoveCursorToEnd.set(((ua.mycredit.mycredit.ui.MoveCursorToEnd) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener editTextrequestFocusAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.requestFocus.get()
            //         is viewModel.requestFocus.set((ua.mycredit.mycredit.ui.RequestFocus) callbackArg_0)
            ua.mycredit.mycredit.ui.RequestFocus callbackArg_0 = ua.mycredit.mycredit.ui.BindingAdaptersKt.notifyFocusRequested(editText);
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

    public InputFieldBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private InputFieldBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 7
            , (android.support.v7.widget.AppCompatEditText) bindings[1]
            );
        this.editText.setTag(null);
        this.mboundView0 = (android.support.design.widget.TextInputLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback64 = new ua.mycredit.mycredit.generated.callback.OnEditorActionListener(this, 3);
        mCallback62 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 1);
        mCallback63 = new ua.mycredit.mycredit.generated.callback.OnFocusChangeListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x800L;
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
        if (BR.afterTextChanged == variableId) {
            setAfterTextChanged((android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) variable);
        }
        else if (BR.drawableEnd == variableId) {
            setDrawableEnd((android.graphics.drawable.Drawable) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((ua.mycredit.mycredit.ui.bases.input.FieldViewModel) variable);
        }
        else if (BR.drawableStart == variableId) {
            setDrawableStart((android.graphics.drawable.Drawable) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAfterTextChanged(@Nullable android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged AfterTextChanged) {
        this.mAfterTextChanged = AfterTextChanged;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.afterTextChanged);
        super.requestRebind();
    }
    public void setDrawableEnd(@Nullable android.graphics.drawable.Drawable DrawableEnd) {
        this.mDrawableEnd = DrawableEnd;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.drawableEnd);
        super.requestRebind();
    }
    public void setViewModel(@Nullable ua.mycredit.mycredit.ui.bases.input.FieldViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x200L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    public void setDrawableStart(@Nullable android.graphics.drawable.Drawable DrawableStart) {
        this.mDrawableStart = DrawableStart;
        synchronized(this) {
            mDirtyFlags |= 0x400L;
        }
        notifyPropertyChanged(BR.drawableStart);
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
                return onChangeViewModelClickable((android.databinding.ObservableBoolean) object, fieldId);
            case 5 :
                return onChangeViewModelRequestFocus((android.databinding.ObservableField<ua.mycredit.mycredit.ui.RequestFocus>) object, fieldId);
            case 6 :
                return onChangeViewModelMoveCursorToEnd((android.databinding.ObservableField<ua.mycredit.mycredit.ui.MoveCursorToEnd>) object, fieldId);
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
    private boolean onChangeViewModelClickable(android.databinding.ObservableBoolean ViewModelClickable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelRequestFocus(android.databinding.ObservableField<ua.mycredit.mycredit.ui.RequestFocus> ViewModelRequestFocus, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelMoveCursorToEnd(android.databinding.ObservableField<ua.mycredit.mycredit.ui.MoveCursorToEnd> ViewModelMoveCursorToEnd, int fieldId) {
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
        boolean viewModelClickableGet = false;
        boolean viewModelHintStatic = false;
        android.text.InputFilter[] viewModelFilters = null;
        android.databinding.ObservableInt viewModelError = null;
        boolean viewModelOptional = false;
        int viewModelGravity = 0;
        android.databinding.ObservableBoolean viewModelFocusable = null;
        ua.mycredit.mycredit.ui.MoveCursorToEnd viewModelMoveCursorToEndGet = null;
        java.lang.String viewModelInputGet = null;
        int viewModelMaxLength = 0;
        boolean ViewModelHintStatic1 = false;
        ua.mycredit.mycredit.ui.RequestFocus viewModelRequestFocusGet = null;
        android.databinding.ObservableBoolean viewModelEnabled = null;
        android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged afterTextChanged = mAfterTextChanged;
        android.databinding.ObservableField<java.lang.String> viewModelInput = null;
        int viewModelInputType = 0;
        int viewModelMaxLines = 0;
        int viewModelMinLines = 0;
        android.graphics.drawable.Drawable drawableEnd = mDrawableEnd;
        android.databinding.ObservableBoolean viewModelClickable = null;
        int viewModelErrorGet = 0;
        boolean viewModelFocusableGet = false;
        android.databinding.ObservableField<ua.mycredit.mycredit.ui.RequestFocus> viewModelRequestFocus = null;
        android.databinding.ObservableField<ua.mycredit.mycredit.ui.MoveCursorToEnd> viewModelMoveCursorToEnd = null;
        boolean viewModelEnabledGet = false;
        boolean viewModelCounterEnabled = false;
        int viewModelHintStaticViewModelHintInt0 = 0;
        ua.mycredit.mycredit.ui.bases.input.FieldViewModel viewModel = mViewModel;
        android.graphics.drawable.Drawable drawableStart = mDrawableStart;

        if ((dirtyFlags & 0x880L) != 0) {
        }
        if ((dirtyFlags & 0x900L) != 0) {
        }
        if ((dirtyFlags & 0xa7fL) != 0) {


            if ((dirtyFlags & 0xa00L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.hint
                        viewModelHint = viewModel.getHint();
                        // read viewModel.filters
                        viewModelFilters = viewModel.getFilters();
                        // read viewModel.optional
                        viewModelOptional = viewModel.getOptional();
                        // read viewModel.gravity
                        viewModelGravity = viewModel.getGravity();
                        // read viewModel.maxLength
                        viewModelMaxLength = viewModel.getMaxLength();
                        // read viewModel.hintStatic
                        ViewModelHintStatic1 = viewModel.getHintStatic();
                        // read viewModel.inputType
                        viewModelInputType = viewModel.getInputType();
                        // read viewModel.maxLines
                        viewModelMaxLines = viewModel.getMaxLines();
                        // read viewModel.minLines
                        viewModelMinLines = viewModel.getMinLines();
                        // read viewModel.counterEnabled
                        viewModelCounterEnabled = viewModel.getCounterEnabled();
                    }
                if((dirtyFlags & 0xa00L) != 0) {
                    if(ViewModelHintStatic1) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }


                    // read !viewModel.hintStatic
                    viewModelHintStatic = !ViewModelHintStatic1;
            }
            if ((dirtyFlags & 0xa01L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.error
                        viewModelError = viewModel.getError();
                    }
                    updateRegistration(0, viewModelError);


                    if (viewModelError != null) {
                        // read viewModel.error.get()
                        viewModelErrorGet = viewModelError.get();
                    }
            }
            if ((dirtyFlags & 0xa02L) != 0) {

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
            if ((dirtyFlags & 0xa04L) != 0) {

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
            if ((dirtyFlags & 0xa08L) != 0) {

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
            if ((dirtyFlags & 0xa10L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.clickable
                        viewModelClickable = viewModel.getClickable();
                    }
                    updateRegistration(4, viewModelClickable);


                    if (viewModelClickable != null) {
                        // read viewModel.clickable.get()
                        viewModelClickableGet = viewModelClickable.get();
                    }
            }
            if ((dirtyFlags & 0xa20L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.requestFocus
                        viewModelRequestFocus = viewModel.getRequestFocus();
                    }
                    updateRegistration(5, viewModelRequestFocus);


                    if (viewModelRequestFocus != null) {
                        // read viewModel.requestFocus.get()
                        viewModelRequestFocusGet = viewModelRequestFocus.get();
                    }
            }
            if ((dirtyFlags & 0xa40L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.moveCursorToEnd
                        viewModelMoveCursorToEnd = viewModel.getMoveCursorToEnd();
                    }
                    updateRegistration(6, viewModelMoveCursorToEnd);


                    if (viewModelMoveCursorToEnd != null) {
                        // read viewModel.moveCursorToEnd.get()
                        viewModelMoveCursorToEndGet = viewModelMoveCursorToEnd.get();
                    }
            }
        }
        if ((dirtyFlags & 0xc00L) != 0) {
        }
        // batch finished

        if ((dirtyFlags & 0xa00L) != 0) {

                // read viewModel.hintStatic ? viewModel.hint : 0
                viewModelHintStaticViewModelHintInt0 = ((ViewModelHintStatic1) ? (viewModelHint) : (0));
        }
        // batch finished
        if ((dirtyFlags & 0x900L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setDrawableEnd(this.editText, drawableEnd);
            android.databinding.adapters.TextViewBindingAdapter.setDrawableLeft(this.editText, drawableEnd);
        }
        if ((dirtyFlags & 0xc00L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setDrawableRight(this.editText, drawableStart);
            android.databinding.adapters.TextViewBindingAdapter.setDrawableStart(this.editText, drawableStart);
        }
        if ((dirtyFlags & 0xa04L) != 0) {
            // api target 1

            this.editText.setEnabled(viewModelEnabledGet);
        }
        if ((dirtyFlags & 0xa02L) != 0) {
            // api target 1

            this.editText.setFocusable(viewModelFocusableGet);
        }
        if ((dirtyFlags & 0x800L) != 0) {
            // api target 1

            this.editText.setOnFocusChangeListener(mCallback63);
            this.editText.setOnEditorActionListener(mCallback64);
        }
        if ((dirtyFlags & 0xa08L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.editText, viewModelInputGet);
        }
        if ((dirtyFlags & 0xa00L) != 0) {
            // api target 1

            ua.mycredit.mycredit.ui.BindingAdaptersKt.safeSetFilters(this.editText, viewModelFilters);
            this.editText.setGravity(viewModelGravity);
            this.editText.setMaxLines(viewModelMaxLines);
            this.editText.setMinLines(viewModelMinLines);
            ua.mycredit.mycredit.ui.BindingAdaptersKt.setHint(this.editText, viewModelHintStaticViewModelHintInt0, true);
            this.mboundView0.setCounterEnabled(viewModelCounterEnabled);
            this.mboundView0.setCounterMaxLength(viewModelMaxLength);
            this.mboundView0.setHintEnabled(viewModelHintStatic);
            ua.mycredit.mycredit.ui.BindingAdaptersKt.setHint(this.mboundView0, viewModelHint, viewModelOptional);
            ua.mycredit.mycredit.ui.BindingAdaptersKt.setInputType(this.mboundView0, viewModelInputType, true);
        }
        if ((dirtyFlags & 0x880L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editText, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, afterTextChanged, editTextandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0xa40L) != 0) {
            // api target 1

            ua.mycredit.mycredit.ui.BindingAdaptersKt.doMoveCursorToNext(this.editText, viewModelMoveCursorToEndGet, editTextmoveCursorToEndAttrChanged);
        }
        if ((dirtyFlags & 0xa10L) != 0) {
            // api target 1

            android.databinding.adapters.ViewBindingAdapter.setOnClick(this.editText, mCallback62, viewModelClickableGet);
        }
        if ((dirtyFlags & 0xa20L) != 0) {
            // api target 1

            ua.mycredit.mycredit.ui.BindingAdaptersKt.setHasFocusAttrChangedListener(this.editText, viewModelRequestFocusGet, editTextrequestFocusAttrChanged);
        }
        if ((dirtyFlags & 0xa01L) != 0) {
            // api target 1

            ua.mycredit.mycredit.ui.BindingAdaptersKt.setError(this.mboundView0, viewModelErrorGet);
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
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        ua.mycredit.mycredit.ui.bases.input.FieldViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.onClick();
        }
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
        flag 4 (0x5L): viewModel.clickable
        flag 5 (0x6L): viewModel.requestFocus
        flag 6 (0x7L): viewModel.moveCursorToEnd
        flag 7 (0x8L): afterTextChanged
        flag 8 (0x9L): drawableEnd
        flag 9 (0xaL): viewModel
        flag 10 (0xbL): drawableStart
        flag 11 (0xcL): null
        flag 12 (0xdL): viewModel.hintStatic ? viewModel.hint : 0
        flag 13 (0xeL): viewModel.hintStatic ? viewModel.hint : 0
    flag mapping end*/
    //end
}