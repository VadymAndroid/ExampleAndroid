package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ResendableSmsCodeBindingImpl extends ResendableSmsCodeBinding implements ua.mycredit.mycredit.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(4);
        sIncludes.setIncludes(0, 
            new String[] {"sms_code"},
            new int[] {3},
            new int[] {R.layout.sms_code});
        sViewsWithIds = null;
    }
    // views
    @Nullable
    private final ua.mycredit.mycredit.databinding.SmsCodeBinding mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView01;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback84;
    @Nullable
    private final android.view.View.OnClickListener mCallback85;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ResendableSmsCodeBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ResendableSmsCodeBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.enterOtherNumber.setTag(null);
        this.mboundView0 = (ua.mycredit.mycredit.databinding.SmsCodeBinding) bindings[3];
        setContainedBinding(this.mboundView0);
        this.mboundView01 = (android.widget.LinearLayout) bindings[0];
        this.mboundView01.setTag(null);
        this.resend.setTag(null);
        setRootTag(root);
        // listeners
        mCallback84 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 1);
        mCallback85 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        mboundView0.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView0.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((ua.mycredit.mycredit.ui.bases.input.ResendableSmsCodeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ua.mycredit.mycredit.ui.bases.input.ResendableSmsCodeViewModel ViewModel) {
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
        mboundView0.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelResendAvailableAfter((android.databinding.ObservableLong) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelResendAvailableAfter(android.databinding.ObservableLong ViewModelResendAvailableAfter, int fieldId) {
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
        java.lang.String resendAndroidStringResendAfterViewModelResendAvailableAfter = null;
        boolean viewModelResendAvailableAfterInt0 = false;
        android.databinding.ObservableLong viewModelResendAvailableAfter = null;
        java.lang.String viewModelResendAvailableAfterInt0ResendAndroidStringResendResendAndroidStringResendAfterViewModelResendAvailableAfter = null;
        long viewModelResendAvailableAfterGet = 0L;
        ua.mycredit.mycredit.ui.bases.input.ResendableSmsCodeViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.resendAvailableAfter
                    viewModelResendAvailableAfter = viewModel.getResendAvailableAfter();
                }
                updateRegistration(0, viewModelResendAvailableAfter);


                if (viewModelResendAvailableAfter != null) {
                    // read viewModel.resendAvailableAfter.get()
                    viewModelResendAvailableAfterGet = viewModelResendAvailableAfter.get();
                }


                // read viewModel.resendAvailableAfter.get() == 0
                viewModelResendAvailableAfterInt0 = (viewModelResendAvailableAfterGet) == (0);
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelResendAvailableAfterInt0) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x8L) != 0) {

                // read @android:string/resend_after
                resendAndroidStringResendAfterViewModelResendAvailableAfter = resend.getResources().getString(R.string.resend_after, viewModelResendAvailableAfterGet);
        }

        if ((dirtyFlags & 0x7L) != 0) {

                // read viewModel.resendAvailableAfter.get() == 0 ? @android:string/resend : @android:string/resend_after
                viewModelResendAvailableAfterInt0ResendAndroidStringResendResendAndroidStringResendAfterViewModelResendAvailableAfter = ((viewModelResendAvailableAfterInt0) ? (resend.getResources().getString(R.string.resend)) : (resendAndroidStringResendAfterViewModelResendAvailableAfter));
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.enterOtherNumber.setOnClickListener(mCallback84);
            this.resend.setOnClickListener(mCallback85);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.mboundView0.setViewModel(viewModel);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.resend.setEnabled(viewModelResendAvailableAfterInt0);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.resend, viewModelResendAvailableAfterInt0ResendAndroidStringResendResendAndroidStringResendAfterViewModelResendAvailableAfter);
        }
        executeBindingsOn(mboundView0);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // viewModel
                ua.mycredit.mycredit.ui.bases.input.ResendableSmsCodeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.enterAnotherNumber();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                ua.mycredit.mycredit.ui.bases.input.ResendableSmsCodeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.requestCode();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.resendAvailableAfter
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
        flag 3 (0x4L): viewModel.resendAvailableAfter.get() == 0 ? @android:string/resend : @android:string/resend_after
        flag 4 (0x5L): viewModel.resendAvailableAfter.get() == 0 ? @android:string/resend : @android:string/resend_after
    flag mapping end*/
    //end
}