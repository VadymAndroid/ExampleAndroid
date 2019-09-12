package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityRepayLoanBindingImpl extends ActivityRepayLoanBinding implements ua.mycredit.mycredit.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(10);
        sIncludes.setIncludes(2, 
            new String[] {"simple_button", "simple_button", "simple_button"},
            new int[] {5, 6, 7},
            new int[] {R.layout.simple_button, R.layout.simple_button, R.layout.simple_button});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appBar, 8);
        sViewsWithIds.put(R.id.choose_payment_method, 9);
    }
    // views
    @NonNull
    private final android.support.design.widget.CoordinatorLayout mboundView0;
    @Nullable
    private final ua.mycredit.mycredit.databinding.SimpleButtonBinding mboundView2;
    @Nullable
    private final ua.mycredit.mycredit.databinding.SimpleButtonBinding mboundView21;
    @Nullable
    private final ua.mycredit.mycredit.databinding.SimpleButtonBinding mboundView22;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback79;
    @Nullable
    private final android.view.View.OnClickListener mCallback82;
    @Nullable
    private final android.view.View.OnClickListener mCallback80;
    @Nullable
    private final android.view.View.OnClickListener mCallback78;
    @Nullable
    private final android.view.View.OnClickListener mCallback81;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityRepayLoanBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ActivityRepayLoanBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.support.design.widget.AppBarLayout) bindings[8]
            , (android.widget.Button) bindings[4]
            , (android.widget.TextView) bindings[9]
            , (android.widget.LinearLayout) bindings[2]
            , (android.support.v7.widget.Toolbar) bindings[1]
            , (android.support.v4.view.ViewPager) bindings[3]
            );
        this.bottomButton.setTag(null);
        this.mboundView0 = (android.support.design.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (ua.mycredit.mycredit.databinding.SimpleButtonBinding) bindings[5];
        setContainedBinding(this.mboundView2);
        this.mboundView21 = (ua.mycredit.mycredit.databinding.SimpleButtonBinding) bindings[6];
        setContainedBinding(this.mboundView21);
        this.mboundView22 = (ua.mycredit.mycredit.databinding.SimpleButtonBinding) bindings[7];
        setContainedBinding(this.mboundView22);
        this.tabs.setTag(null);
        this.toolbar.setTag(null);
        this.viewPagerRepay.setTag(null);
        setRootTag(root);
        // listeners
        mCallback79 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 2);
        mCallback82 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 5);
        mCallback80 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 3);
        mCallback78 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 1);
        mCallback81 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 4);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        mboundView2.invalidateAll();
        mboundView21.invalidateAll();
        mboundView22.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView2.hasPendingBindings()) {
            return true;
        }
        if (mboundView21.hasPendingBindings()) {
            return true;
        }
        if (mboundView22.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((ua.mycredit.mycredit.ui.profile.repayloan.RepayLoanActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ua.mycredit.mycredit.ui.profile.repayloan.RepayLoanActivity ViewModel) {
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
        mboundView2.setLifecycleOwner(lifecycleOwner);
        mboundView21.setLifecycleOwner(lifecycleOwner);
        mboundView22.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelPage((android.databinding.ObservableField<ua.mycredit.mycredit.ui.profile.repayloan.RepayLoanActivity.Page>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelPage(android.databinding.ObservableField<ua.mycredit.mycredit.ui.profile.repayloan.RepayLoanActivity.Page> ViewModelPage, int fieldId) {
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
        java.lang.String androidStringArrayRepayLoanTabsPageBANKOrdinal = null;
        int viewModelPageGetOrdinal = 0;
        boolean viewModelPagePageCARD = false;
        android.support.v4.view.ViewPager.OnPageChangeListener viewModelOnPageChangeListener = null;
        boolean viewModelPagePageTERMINAL = false;
        boolean viewModelPagePageBANK = false;
        int viewModelRepaymentTypeTitle = 0;
        int pageBANKOrdinal = 0;
        android.support.v4.view.PagerAdapter viewModelPagerAdapter = null;
        ua.mycredit.mycredit.ui.profile.repayloan.RepaymentType viewModelRepaymentType = null;
        int pageTERMINALOrdinal = 0;
        java.lang.String androidStringArrayRepayLoanTabsPageCARDOrdinal = null;
        java.lang.String androidStringArrayRepayLoanTabsPageTERMINALOrdinal = null;
        ua.mycredit.mycredit.ui.profile.repayloan.RepayLoanActivity.Page viewModelPageGet = null;
        int pageCARDOrdinal = 0;
        android.databinding.ObservableField<ua.mycredit.mycredit.ui.profile.repayloan.RepayLoanActivity.Page> viewModelPage = null;
        ua.mycredit.mycredit.ui.profile.repayloan.RepayLoanActivity viewModel = mViewModel;

        if ((dirtyFlags & 0x4L) != 0) {

                // read Page.BANK.ordinal
                pageBANKOrdinal = ua.mycredit.mycredit.ui.profile.repayloan.RepayLoanActivity.Page.BANK.ordinal();
                // read Page.TERMINAL.ordinal
                pageTERMINALOrdinal = ua.mycredit.mycredit.ui.profile.repayloan.RepayLoanActivity.Page.TERMINAL.ordinal();
                // read Page.CARD.ordinal
                pageCARDOrdinal = ua.mycredit.mycredit.ui.profile.repayloan.RepayLoanActivity.Page.CARD.ordinal();


                // read @android:stringArray/repay_loan_tabs[Page.BANK.ordinal]
                androidStringArrayRepayLoanTabsPageBANKOrdinal = getFromArray(getRoot().getResources().getStringArray(R.array.repay_loan_tabs), pageBANKOrdinal);
                // read @android:stringArray/repay_loan_tabs[Page.TERMINAL.ordinal]
                androidStringArrayRepayLoanTabsPageTERMINALOrdinal = getFromArray(getRoot().getResources().getStringArray(R.array.repay_loan_tabs), pageTERMINALOrdinal);
                // read @android:stringArray/repay_loan_tabs[Page.CARD.ordinal]
                androidStringArrayRepayLoanTabsPageCARDOrdinal = getFromArray(getRoot().getResources().getStringArray(R.array.repay_loan_tabs), pageCARDOrdinal);
        }
        if ((dirtyFlags & 0x7L) != 0) {


            if ((dirtyFlags & 0x6L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.onPageChangeListener
                        viewModelOnPageChangeListener = viewModel.getOnPageChangeListener();
                        // read viewModel.pagerAdapter
                        viewModelPagerAdapter = viewModel.getPagerAdapter();
                        // read viewModel.repaymentType
                        viewModelRepaymentType = viewModel.getRepaymentType();
                    }


                    if (viewModelRepaymentType != null) {
                        // read viewModel.repaymentType.title
                        viewModelRepaymentTypeTitle = viewModelRepaymentType.getTitle();
                    }
            }

                if (viewModel != null) {
                    // read viewModel.page
                    viewModelPage = viewModel.getPage();
                }
                updateRegistration(0, viewModelPage);


                if (viewModelPage != null) {
                    // read viewModel.page.get()
                    viewModelPageGet = viewModelPage.get();
                }


                if (viewModelPageGet != null) {
                    // read viewModel.page.get().ordinal
                    viewModelPageGetOrdinal = viewModelPageGet.ordinal();
                }
                // read viewModel.page.get() == Page.CARD
                viewModelPagePageCARD = (viewModelPageGet) == (ua.mycredit.mycredit.ui.profile.repayloan.RepayLoanActivity.Page.CARD);
                // read viewModel.page.get() == Page.TERMINAL
                viewModelPagePageTERMINAL = (viewModelPageGet) == (ua.mycredit.mycredit.ui.profile.repayloan.RepayLoanActivity.Page.TERMINAL);
                // read viewModel.page.get() == Page.BANK
                viewModelPagePageBANK = (viewModelPageGet) == (ua.mycredit.mycredit.ui.profile.repayloan.RepayLoanActivity.Page.BANK);
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.bottomButton.setOnClickListener(mCallback82);
            this.mboundView2.setText(androidStringArrayRepayLoanTabsPageCARDOrdinal);
            this.mboundView2.setOnClick(mCallback79);
            this.mboundView21.setText(androidStringArrayRepayLoanTabsPageBANKOrdinal);
            this.mboundView21.setOnClick(mCallback80);
            this.mboundView22.setText(androidStringArrayRepayLoanTabsPageTERMINALOrdinal);
            this.mboundView22.setOnClick(mCallback81);
            this.toolbar.setNavigationOnClickListener(mCallback78);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.bottomButton.setVisibility(ua.mycredit.mycredit.ui.BindingAdaptersKt.booleanToVisibility(viewModelPagePageCARD));
            this.mboundView2.setPrimary(viewModelPagePageCARD);
            this.mboundView21.setPrimary(viewModelPagePageBANK);
            this.mboundView22.setPrimary(viewModelPagePageTERMINAL);
            ua.mycredit.mycredit.ui.BindingAdaptersKt.doSetCurrentItem(this.viewPagerRepay, viewModelPageGetOrdinal);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.toolbar.setTitle(viewModelRepaymentTypeTitle);
            this.viewPagerRepay.setAdapter(viewModelPagerAdapter);
            this.viewPagerRepay.setOnPageChangeListener(viewModelOnPageChangeListener);
        }
        executeBindingsOn(mboundView2);
        executeBindingsOn(mboundView21);
        executeBindingsOn(mboundView22);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewModel
                ua.mycredit.mycredit.ui.profile.repayloan.RepayLoanActivity viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.onTabClick(ua.mycredit.mycredit.ui.profile.repayloan.RepayLoanActivity.Page.CARD);
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewModel
                ua.mycredit.mycredit.ui.profile.repayloan.RepayLoanActivity viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.openPaymentScreen();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                ua.mycredit.mycredit.ui.profile.repayloan.RepayLoanActivity viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.onTabClick(ua.mycredit.mycredit.ui.profile.repayloan.RepayLoanActivity.Page.BANK);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                ua.mycredit.mycredit.ui.profile.repayloan.RepayLoanActivity viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onBackPressed();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewModel
                ua.mycredit.mycredit.ui.profile.repayloan.RepayLoanActivity viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.onTabClick(ua.mycredit.mycredit.ui.profile.repayloan.RepayLoanActivity.Page.TERMINAL);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.page
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}