package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentWebViewBindingImpl extends FragmentWebViewBinding  {

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
    private final android.widget.FrameLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener refreshLayoutrefreshingAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.refreshing.get()
            //         is viewModel.refreshing.set((boolean) callbackArg_0)
            boolean callbackArg_0 = ua.mycredit.mycredit.ui.BindingAdaptersKt.getRefreshing(refreshLayout);
            // localize variables for thread safety
            // viewModel.refreshing.get()
            boolean viewModelRefreshingGet = false;
            // viewModel.refreshing != null
            boolean viewModelRefreshingJavaLangObjectNull = false;
            // viewModel
            ua.mycredit.mycredit.ui.bases.WebViewFragment viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.refreshing
            android.databinding.ObservableBoolean viewModelRefreshing = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelRefreshing = viewModel.getRefreshing();

                viewModelRefreshingJavaLangObjectNull = (viewModelRefreshing) != (null);
                if (viewModelRefreshingJavaLangObjectNull) {




                    viewModelRefreshing.set(((boolean) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentWebViewBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private FragmentWebViewBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.support.v4.widget.SwipeRefreshLayout) bindings[1]
            , (android.webkit.WebView) bindings[2]
            );
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.refreshLayout.setTag(null);
        this.webView.setTag(null);
        setRootTag(root);
        // listeners
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
            setViewModel((ua.mycredit.mycredit.ui.bases.WebViewFragment) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ua.mycredit.mycredit.ui.bases.WebViewFragment ViewModel) {
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
                return onChangeViewModelWebViewVisible((android.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeViewModelRefreshing((android.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelWebViewVisible(android.databinding.ObservableBoolean ViewModelWebViewVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelRefreshing(android.databinding.ObservableBoolean ViewModelRefreshing, int fieldId) {
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
        boolean viewModelRefreshingGet = false;
        boolean viewModelWebViewVisibleGet = false;
        android.webkit.WebViewClient viewModelClient = null;
        android.databinding.ObservableBoolean viewModelWebViewVisible = null;
        android.databinding.ObservableBoolean viewModelRefreshing = null;
        ua.mycredit.mycredit.ui.bases.WebViewFragment viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xcL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.client
                        viewModelClient = viewModel.getClient();
                    }
            }
            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.webViewVisible
                        viewModelWebViewVisible = viewModel.getWebViewVisible();
                    }
                    updateRegistration(0, viewModelWebViewVisible);


                    if (viewModelWebViewVisible != null) {
                        // read viewModel.webViewVisible.get()
                        viewModelWebViewVisibleGet = viewModelWebViewVisible.get();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.refreshing
                        viewModelRefreshing = viewModel.getRefreshing();
                    }
                    updateRegistration(1, viewModelRefreshing);


                    if (viewModelRefreshing != null) {
                        // read viewModel.refreshing.get()
                        viewModelRefreshingGet = viewModelRefreshing.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            ua.mycredit.mycredit.ui.BindingAdaptersKt.doSetRefreshing(this.refreshLayout, viewModelRefreshingGet);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            ua.mycredit.mycredit.ui.BindingAdaptersKt.setRefreshingAttrChanged(this.refreshLayout, refreshLayoutrefreshingAttrChanged);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.webView.setVisibility(ua.mycredit.mycredit.ui.BindingAdaptersKt.booleanToVisibility(viewModelWebViewVisibleGet));
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.webView.setWebViewClient(viewModelClient);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.webViewVisible
        flag 1 (0x2L): viewModel.refreshing
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}