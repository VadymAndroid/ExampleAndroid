package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class CreditStatusDescriptionBindingImpl extends CreditStatusDescriptionBinding  {

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
    private final android.support.constraint.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    private OnPhoneClickImpl mViewModelProcessPhoneClickUaMycreditMycreditUiOnPhoneClick;
    // Inverse Binding Event Handlers

    public CreditStatusDescriptionBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private CreditStatusDescriptionBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[1]
            );
        this.briefDescription.setTag(null);
        this.detailedDescription.setTag(null);
        this.divider.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.statusIcon.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
            setViewModel((ua.mycredit.mycredit.ui.profile.credit.StatusViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ua.mycredit.mycredit.ui.profile.credit.StatusViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelStatus((android.databinding.ObservableField<ua.mycredit.core.Status>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelStatus(android.databinding.ObservableField<ua.mycredit.core.Status> ViewModelStatus, int fieldId) {
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
        boolean viewModelStatusJavaLangObjectNull = false;
        ua.mycredit.core.Profile viewModelProfile = null;
        int creditStatusKtGetControlsColorViewModelStatus = 0;
        android.databinding.ObservableField<ua.mycredit.core.Status> viewModelStatus = null;
        int creditStatusKtGetControlsBackgroundViewModelStatus = 0;
        ua.mycredit.core.Status viewModelStatusGet = null;
        ua.mycredit.mycredit.ui.OnPhoneClick viewModelProcessPhoneClickUaMycreditMycreditUiOnPhoneClick = null;
        ua.mycredit.mycredit.ui.profile.credit.StatusViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.profile
                    viewModelProfile = viewModel.getProfile();
                    // read viewModel.status
                    viewModelStatus = viewModel.getStatus();
                    // read viewModel::processPhoneClick
                    viewModelProcessPhoneClickUaMycreditMycreditUiOnPhoneClick = (((mViewModelProcessPhoneClickUaMycreditMycreditUiOnPhoneClick == null) ? (mViewModelProcessPhoneClickUaMycreditMycreditUiOnPhoneClick = new OnPhoneClickImpl()) : mViewModelProcessPhoneClickUaMycreditMycreditUiOnPhoneClick).setValue(viewModel));
                }
                updateRegistration(0, viewModelStatus);


                if (viewModelStatus != null) {
                    // read viewModel.status.get()
                    viewModelStatusGet = viewModelStatus.get();
                }


                // read viewModel.status.get() != null
                viewModelStatusJavaLangObjectNull = (viewModelStatusGet) != (null);
                // read CreditStatusKt.getControlsColor(viewModel.status.get())
                creditStatusKtGetControlsColorViewModelStatus = ua.mycredit.mycredit.mapping.CreditStatusKt.getControlsColor(viewModelStatusGet);
                // read CreditStatusKt.getControlsBackground(viewModel.status.get())
                creditStatusKtGetControlsBackgroundViewModelStatus = ua.mycredit.mycredit.mapping.CreditStatusKt.getControlsBackground(viewModelStatusGet);
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            ua.mycredit.mycredit.ui.BindingAdaptersKt.setBriefDescription(this.briefDescription, viewModelStatusGet, viewModelProfile);
            ua.mycredit.mycredit.ui.BindingAdaptersKt.setDetailedDescription(this.detailedDescription, viewModelStatusGet, (ua.mycredit.mycredit.ui.OnPhoneClick)viewModelProcessPhoneClickUaMycreditMycreditUiOnPhoneClick);
            ua.mycredit.mycredit.ui.BindingAdaptersKt.setTintResource(this.divider, creditStatusKtGetControlsColorViewModelStatus);
            this.mboundView0.setVisibility(ua.mycredit.mycredit.ui.BindingAdaptersKt.booleanToVisibility(viewModelStatusJavaLangObjectNull));
            this.mboundView0.setBackgroundResource(creditStatusKtGetControlsBackgroundViewModelStatus);
            ua.mycredit.mycredit.ui.BindingAdaptersKt.setIcon(this.statusIcon, viewModelStatusGet);
        }
    }
    // Listener Stub Implementations
    public static class OnPhoneClickImpl implements ua.mycredit.mycredit.ui.OnPhoneClick{
        private ua.mycredit.mycredit.ui.profile.credit.StatusViewModel value;
        public OnPhoneClickImpl setValue(ua.mycredit.mycredit.ui.profile.credit.StatusViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(java.lang.String arg0) {
            this.value.processPhoneClick(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.status
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}