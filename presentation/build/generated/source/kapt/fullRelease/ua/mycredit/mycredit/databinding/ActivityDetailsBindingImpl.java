package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityDetailsBindingImpl extends ActivityDetailsBinding implements ua.mycredit.mycredit.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appbar, 4);
    }
    // views
    @NonNull
    private final android.support.design.widget.CoordinatorLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback16;
    // values
    // listeners
    private OnMenuItemClickListenerImpl mViewModelOnMenuItemClickListenerAndroidSupportV7WidgetToolbarOnMenuItemClickListener;
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener detailsViewPagercurrentItemAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.currentPage.get()
            //         is viewModel.currentPage.set((int) callbackArg_0)
            int callbackArg_0 = ua.mycredit.mycredit.ui.BindingAdaptersKt.getCurrentItemAlias(detailsViewPager);
            // localize variables for thread safety
            // viewModel
            ua.mycredit.mycredit.ui.profile.profile.details.DetailsActivity viewModel = mViewModel;
            // viewModel.currentPage
            android.databinding.ObservableInt viewModelCurrentPage = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.currentPage != null
            boolean viewModelCurrentPageJavaLangObjectNull = false;
            // viewModel.currentPage.get()
            int viewModelCurrentPageGet = 0;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelCurrentPage = viewModel.getCurrentPage();

                viewModelCurrentPageJavaLangObjectNull = (viewModelCurrentPage) != (null);
                if (viewModelCurrentPageJavaLangObjectNull) {




                    viewModelCurrentPage.set(((int) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityDetailsBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ActivityDetailsBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.support.design.widget.AppBarLayout) bindings[4]
            , (android.support.v4.view.ViewPager) bindings[3]
            , (android.support.design.widget.TabLayout) bindings[2]
            , (android.support.v7.widget.Toolbar) bindings[1]
            );
        this.detailsViewPager.setTag(null);
        this.mboundView0 = (android.support.design.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tabs.setTag(null);
        this.toolbar.setTag(null);
        setRootTag(root);
        // listeners
        mCallback16 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 1);
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
            setViewModel((ua.mycredit.mycredit.ui.profile.profile.details.DetailsActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ua.mycredit.mycredit.ui.profile.profile.details.DetailsActivity ViewModel) {
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
                return onChangeViewModelCurrentPage((android.databinding.ObservableInt) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelCurrentPage(android.databinding.ObservableInt ViewModelCurrentPage, int fieldId) {
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
        android.support.v4.view.ViewPager.OnPageChangeListener viewModelOnPageChangeListener = null;
        ua.mycredit.mycredit.ui.profile.profile.details.DetailsActivity.Mode viewModelMode = null;
        int viewModelModePagesCount = 0;
        boolean viewModelModePagesCountInt1 = false;
        android.support.v4.view.PagerAdapter viewModelPagerAdapter = null;
        int viewModelModeTabMode = 0;
        android.databinding.ObservableInt viewModelCurrentPage = null;
        android.support.v7.widget.Toolbar.OnMenuItemClickListener viewModelOnMenuItemClickListenerAndroidSupportV7WidgetToolbarOnMenuItemClickListener = null;
        int viewModelCurrentPageGet = 0;
        ua.mycredit.mycredit.ui.profile.profile.details.DetailsActivity viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {


            if ((dirtyFlags & 0x6L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.onPageChangeListener
                        viewModelOnPageChangeListener = viewModel.getOnPageChangeListener();
                        // read viewModel.mode
                        viewModelMode = viewModel.getMode();
                        // read viewModel.pagerAdapter
                        viewModelPagerAdapter = viewModel.getPagerAdapter();
                        // read viewModel::onMenuItemClickListener
                        viewModelOnMenuItemClickListenerAndroidSupportV7WidgetToolbarOnMenuItemClickListener = (((mViewModelOnMenuItemClickListenerAndroidSupportV7WidgetToolbarOnMenuItemClickListener == null) ? (mViewModelOnMenuItemClickListenerAndroidSupportV7WidgetToolbarOnMenuItemClickListener = new OnMenuItemClickListenerImpl()) : mViewModelOnMenuItemClickListenerAndroidSupportV7WidgetToolbarOnMenuItemClickListener).setValue(viewModel));
                    }


                    if (viewModelMode != null) {
                        // read viewModel.mode.pagesCount
                        viewModelModePagesCount = viewModelMode.getPagesCount();
                        // read viewModel.mode.tabMode
                        viewModelModeTabMode = viewModelMode.getTabMode();
                    }


                    // read viewModel.mode.pagesCount > 1
                    viewModelModePagesCountInt1 = (viewModelModePagesCount) > (1);
            }

                if (viewModel != null) {
                    // read viewModel.currentPage
                    viewModelCurrentPage = viewModel.getCurrentPage();
                }
                updateRegistration(0, viewModelCurrentPage);


                if (viewModelCurrentPage != null) {
                    // read viewModel.currentPage.get()
                    viewModelCurrentPageGet = viewModelCurrentPage.get();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.detailsViewPager.setAdapter(viewModelPagerAdapter);
            this.detailsViewPager.setOffscreenPageLimit(viewModelModePagesCount);
            this.detailsViewPager.setOnPageChangeListener(viewModelOnPageChangeListener);
            this.tabs.setVisibility(ua.mycredit.mycredit.ui.BindingAdaptersKt.booleanToVisibility(viewModelModePagesCountInt1));
            this.tabs.setTabMode(viewModelModeTabMode);
            this.toolbar.setOnMenuItemClickListener(viewModelOnMenuItemClickListenerAndroidSupportV7WidgetToolbarOnMenuItemClickListener);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            ua.mycredit.mycredit.ui.BindingAdaptersKt.doSetCurrentItem(this.detailsViewPager, viewModelCurrentPageGet);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            ua.mycredit.mycredit.ui.BindingAdaptersKt.setCurrentItemAttrChanged(this.detailsViewPager, detailsViewPagercurrentItemAttrChanged);
            this.toolbar.setNavigationOnClickListener(mCallback16);
        }
    }
    // Listener Stub Implementations
    public static class OnMenuItemClickListenerImpl implements android.support.v7.widget.Toolbar.OnMenuItemClickListener{
        private ua.mycredit.mycredit.ui.profile.profile.details.DetailsActivity value;
        public OnMenuItemClickListenerImpl setValue(ua.mycredit.mycredit.ui.profile.profile.details.DetailsActivity value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public boolean onMenuItemClick(android.view.MenuItem arg0) {
            return this.value.onMenuItemClickListener(arg0); 
        }
    }
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        ua.mycredit.mycredit.ui.profile.profile.details.DetailsActivity viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.onBackPressed();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.currentPage
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}