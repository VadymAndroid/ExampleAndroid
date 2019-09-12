package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAgreementBindingImpl extends FragmentAgreementBinding implements ua.mycredit.mycredit.generated.callback.OnClickListener.Listener {

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
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback77;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentAgreementBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private FragmentAgreementBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.webkit.WebView) bindings[1]
            , (android.widget.Button) bindings[2]
            );
        this.PDFView.setTag(null);
        this.creditAction.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback77 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 1);
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
            setViewModel((ua.mycredit.mycredit.ui.profile.credit.AgreementViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ua.mycredit.mycredit.ui.profile.credit.AgreementViewModel ViewModel) {
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
                return onChangeViewModelAgreementType((android.databinding.ObservableField<ua.mycredit.core.AgreementType>) object, fieldId);
            case 1 :
                return onChangeViewModelFile((android.databinding.ObservableField<java.io.File>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelAgreementType(android.databinding.ObservableField<ua.mycredit.core.AgreementType> ViewModelAgreementType, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelFile(android.databinding.ObservableField<java.io.File> ViewModelFile, int fieldId) {
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
        boolean viewModelAgreementTypeInstanceofPendingCredit = false;
        ua.mycredit.core.AgreementType viewModelAgreementTypeGet = null;
        android.databinding.ObservableField<ua.mycredit.core.AgreementType> viewModelAgreementType = null;
        java.io.File viewModelFileGet = null;
        android.databinding.ObservableField<java.io.File> viewModelFile = null;
        ua.mycredit.mycredit.ui.profile.credit.AgreementViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.agreementType
                        viewModelAgreementType = viewModel.getAgreementType();
                    }
                    updateRegistration(0, viewModelAgreementType);


                    if (viewModelAgreementType != null) {
                        // read viewModel.agreementType.get()
                        viewModelAgreementTypeGet = viewModelAgreementType.get();
                    }


                    // read viewModel.agreementType.get() instanceof PendingCredit
                    viewModelAgreementTypeInstanceofPendingCredit = viewModelAgreementTypeGet instanceof ua.mycredit.core.AgreementType.PendingCredit;
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.file
                        viewModelFile = viewModel.getFile();
                    }
                    updateRegistration(1, viewModelFile);


                    if (viewModelFile != null) {
                        // read viewModel.file.get()
                        viewModelFileGet = viewModelFile.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            ua.mycredit.mycredit.ui.BindingAdaptersKt.loadByFile(this.PDFView, viewModelFileGet);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.creditAction.setOnClickListener(mCallback77);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.creditAction.setVisibility(ua.mycredit.mycredit.ui.BindingAdaptersKt.booleanToVisibility(viewModelAgreementTypeInstanceofPendingCredit));
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        ua.mycredit.mycredit.ui.profile.credit.AgreementViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.showAcceptingDialog();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.agreementType
        flag 1 (0x2L): viewModel.file
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}