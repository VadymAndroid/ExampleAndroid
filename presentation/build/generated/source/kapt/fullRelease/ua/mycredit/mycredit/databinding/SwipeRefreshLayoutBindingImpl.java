package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SwipeRefreshLayoutBindingImpl extends SwipeRefreshLayoutBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener swipeRefreshLayoutrefreshingAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.asRefreshable.refreshing.get()
            //         is viewModel.asRefreshable.refreshing.set((boolean) callbackArg_0)
            boolean callbackArg_0 = ua.mycredit.mycredit.ui.BindingAdaptersKt.getRefreshing(swipeRefreshLayout);
            // localize variables for thread safety
            // viewModel.asRefreshable
            ua.mycredit.mycredit.ui.bases.action.Refreshable viewModelAsRefreshable = null;
            // viewModel.asRefreshable.refreshing
            android.databinding.ObservableBoolean viewModelAsRefreshableRefreshing = null;
            // viewModel.asRefreshable.refreshing != null
            boolean viewModelAsRefreshableRefreshingJavaLangObjectNull = false;
            // viewModel.asRefreshable != null
            boolean viewModelAsRefreshableJavaLangObjectNull = false;
            // viewModel
            ua.mycredit.mycredit.ui.bases.action.WithRefresh viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.asRefreshable.refreshing.get()
            boolean viewModelAsRefreshableRefreshingGet = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelAsRefreshable = viewModel.getAsRefreshable();

                viewModelAsRefreshableJavaLangObjectNull = (viewModelAsRefreshable) != (null);
                if (viewModelAsRefreshableJavaLangObjectNull) {


                    viewModelAsRefreshableRefreshing = viewModelAsRefreshable.getRefreshing();

                    viewModelAsRefreshableRefreshingJavaLangObjectNull = (viewModelAsRefreshableRefreshing) != (null);
                    if (viewModelAsRefreshableRefreshingJavaLangObjectNull) {




                        viewModelAsRefreshableRefreshing.set(((boolean) (callbackArg_0)));
                    }
                }
            }
        }
    };

    public SwipeRefreshLayoutBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 1, sIncludes, sViewsWithIds));
    }
    private SwipeRefreshLayoutBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.support.v4.widget.SwipeRefreshLayout) bindings[0]
            );
        this.swipeRefreshLayout.setTag(null);
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
            setViewModel((ua.mycredit.mycredit.ui.bases.action.WithRefresh) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ua.mycredit.mycredit.ui.bases.action.WithRefresh ViewModel) {
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
                return onChangeViewModelAsRefreshableRefreshing((android.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelAsRefreshableRefreshing(android.databinding.ObservableBoolean ViewModelAsRefreshableRefreshing, int fieldId) {
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
        boolean viewModelAsRefreshableRefreshingGet = false;
        ua.mycredit.mycredit.ui.bases.action.Refreshable viewModelAsRefreshable = null;
        android.databinding.ObservableBoolean viewModelAsRefreshableRefreshing = null;
        ua.mycredit.mycredit.ui.bases.action.WithRefresh viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.asRefreshable
                    viewModelAsRefreshable = viewModel.getAsRefreshable();
                }


                if (viewModelAsRefreshable != null) {
                    // read viewModel.asRefreshable.refreshing
                    viewModelAsRefreshableRefreshing = viewModelAsRefreshable.getRefreshing();
                }
                updateRegistration(0, viewModelAsRefreshableRefreshing);


                if (viewModelAsRefreshableRefreshing != null) {
                    // read viewModel.asRefreshable.refreshing.get()
                    viewModelAsRefreshableRefreshingGet = viewModelAsRefreshableRefreshing.get();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            ua.mycredit.mycredit.ui.BindingAdaptersKt.setColorSchemeColor(this.swipeRefreshLayout, getColorFromResource(swipeRefreshLayout, R.color.colorPrimary));
            ua.mycredit.mycredit.ui.BindingAdaptersKt.setRefreshingAttrChanged(this.swipeRefreshLayout, swipeRefreshLayoutrefreshingAttrChanged);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            ua.mycredit.mycredit.ui.BindingAdaptersKt.doSetRefreshing(this.swipeRefreshLayout, viewModelAsRefreshableRefreshingGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.asRefreshable.refreshing
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}