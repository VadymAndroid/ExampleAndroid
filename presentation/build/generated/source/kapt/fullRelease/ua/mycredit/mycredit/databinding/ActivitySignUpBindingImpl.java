package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivitySignUpBindingImpl extends ActivitySignUpBinding implements ua.mycredit.mycredit.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appBar, 6);
        sViewsWithIds.put(R.id.signUpMinutesLeft, 7);
        sViewsWithIds.put(R.id.scroll_view, 8);
        sViewsWithIds.put(R.id.fragment_container, 9);
        sViewsWithIds.put(R.id.nextButtonLinearLayout, 10);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivitySignUpBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private ActivitySignUpBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.support.design.widget.AppBarLayout) bindings[6]
            , (android.support.v7.widget.CardView) bindings[4]
            , (android.widget.FrameLayout) bindings[9]
            , (android.widget.Button) bindings[5]
            , (android.widget.LinearLayout) bindings[10]
            , (ua.mycredit.mycredit.ui.custom.progress.PercentageProgress) bindings[2]
            , (android.support.v4.widget.NestedScrollView) bindings[8]
            , (android.support.design.widget.CoordinatorLayout) bindings[0]
            , (android.widget.TextView) bindings[7]
            , (android.support.v7.widget.Toolbar) bindings[1]
            );
        this.calculatorFAB.setTag(null);
        this.mboundView3 = (android.widget.LinearLayout) bindings[3];
        this.mboundView3.setTag(null);
        this.nextButton.setTag(null);
        this.percentageProgress.setTag(null);
        this.signUpCoordinator.setTag(null);
        this.toolbar.setTag(null);
        setRootTag(root);
        // listeners
        mCallback9 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 2);
        mCallback8 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 1);
        mCallback10 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 3);
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
            setViewModel((ua.mycredit.mycredit.ui.authentication.registration.SignUpActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ua.mycredit.mycredit.ui.authentication.registration.SignUpActivity ViewModel) {
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
                return onChangeViewModelSecurityGuarantee((android.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeViewModelPercentageProgress((android.databinding.ObservableInt) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelSecurityGuarantee(android.databinding.ObservableBoolean ViewModelSecurityGuarantee, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPercentageProgress(android.databinding.ObservableInt ViewModelPercentageProgress, int fieldId) {
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
        boolean viewModelSecurityGuaranteeGet = false;
        android.databinding.ObservableBoolean viewModelSecurityGuarantee = null;
        int viewModelPercentageProgressGet = 0;
        android.databinding.ObservableInt viewModelPercentageProgress = null;
        ua.mycredit.mycredit.ui.authentication.registration.SignUpActivity viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.securityGuarantee
                        viewModelSecurityGuarantee = viewModel.getSecurityGuarantee();
                    }
                    updateRegistration(0, viewModelSecurityGuarantee);


                    if (viewModelSecurityGuarantee != null) {
                        // read viewModel.securityGuarantee.get()
                        viewModelSecurityGuaranteeGet = viewModelSecurityGuarantee.get();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.percentageProgress
                        viewModelPercentageProgress = viewModel.getPercentageProgress();
                    }
                    updateRegistration(1, viewModelPercentageProgress);


                    if (viewModelPercentageProgress != null) {
                        // read viewModel.percentageProgress.get()
                        viewModelPercentageProgressGet = viewModelPercentageProgress.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.calculatorFAB.setOnClickListener(mCallback9);
            this.nextButton.setOnClickListener(mCallback10);
            this.toolbar.setNavigationOnClickListener(mCallback8);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.mboundView3.setVisibility(ua.mycredit.mycredit.ui.BindingAdaptersKt.booleanToVisibility(viewModelSecurityGuaranteeGet));
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            this.percentageProgress.setProgress(viewModelPercentageProgressGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewModel
                ua.mycredit.mycredit.ui.authentication.registration.SignUpActivity viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onFAB();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                ua.mycredit.mycredit.ui.authentication.registration.SignUpActivity viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onNavigationClick();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                ua.mycredit.mycredit.ui.authentication.registration.SignUpActivity viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onNextButton();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.securityGuarantee
        flag 1 (0x2L): viewModel.percentageProgress
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}