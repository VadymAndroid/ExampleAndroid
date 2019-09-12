package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class PreloaderBindingImpl extends PreloaderBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view_switcher_content, 3);
    }
    // views
    @NonNull
    private final android.widget.ViewSwitcher mboundView0;
    @NonNull
    private final android.support.v7.widget.CardView mboundView1;
    @NonNull
    private final android.widget.ImageView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public PreloaderBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private PreloaderBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.FrameLayout) bindings[3]
            );
        this.mboundView0 = (android.widget.ViewSwitcher) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.support.v7.widget.CardView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.ImageView) bindings[2];
        this.mboundView2.setTag(null);
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
            setViewModel((ua.mycredit.mycredit.ui.bases.BaseViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ua.mycredit.mycredit.ui.bases.BaseViewModel ViewModel) {
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
                return onChangeViewModelLoadings((android.databinding.ObservableInt) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelLoadings(android.databinding.ObservableInt ViewModelLoadings, int fieldId) {
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
        int viewModelLoadingsGet = 0;
        boolean viewModelPreLoaderLogoEnabled = false;
        boolean viewModelLoadingsInt0 = false;
        int viewModelLoadingsInt0Int0Int1 = 0;
        android.databinding.ObservableInt viewModelLoadings = null;
        boolean viewModelPreLoaderCompatPadding = false;
        ua.mycredit.mycredit.ui.bases.BaseViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {


            if ((dirtyFlags & 0x6L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.preLoaderLogoEnabled
                        viewModelPreLoaderLogoEnabled = viewModel.getPreLoaderLogoEnabled();
                        // read viewModel.preLoaderCompatPadding
                        viewModelPreLoaderCompatPadding = viewModel.getPreLoaderCompatPadding();
                    }
            }

                if (viewModel != null) {
                    // read viewModel.loadings
                    viewModelLoadings = viewModel.getLoadings();
                }
                updateRegistration(0, viewModelLoadings);


                if (viewModelLoadings != null) {
                    // read viewModel.loadings.get()
                    viewModelLoadingsGet = viewModelLoadings.get();
                }


                // read viewModel.loadings.get() > 0
                viewModelLoadingsInt0 = (viewModelLoadingsGet) > (0);
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelLoadingsInt0) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read viewModel.loadings.get() > 0 ? 0 : 1
                viewModelLoadingsInt0Int0Int1 = ((viewModelLoadingsInt0) ? (0) : (1));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.mboundView0.setDisplayedChild(viewModelLoadingsInt0Int0Int1);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.mboundView1.setUseCompatPadding(viewModelPreLoaderCompatPadding);
            this.mboundView2.setVisibility(ua.mycredit.mycredit.ui.BindingAdaptersKt.booleanToVisibility(viewModelPreLoaderLogoEnabled));
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.loadings
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
        flag 3 (0x4L): viewModel.loadings.get() > 0 ? 0 : 1
        flag 4 (0x5L): viewModel.loadings.get() > 0 ? 0 : 1
    flag mapping end*/
    //end
}