package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityProfileBindingImpl extends ActivityProfileBinding implements ua.mycredit.mycredit.generated.callback.OnClickListener.Listener, ua.mycredit.mycredit.generated.callback.OnTabSelectedListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearLayout, 8);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback32;
    @Nullable
    private final com.aurelhubert.ahbottomnavigation.AHBottomNavigation.OnTabSelectedListener mCallback37;
    @Nullable
    private final android.view.View.OnClickListener mCallback35;
    @Nullable
    private final android.view.View.OnClickListener mCallback36;
    @Nullable
    private final android.view.View.OnClickListener mCallback33;
    @Nullable
    private final android.view.View.OnClickListener mCallback34;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener fragmentViewPagercurrentItemAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.currentItem.get()
            //         is viewModel.currentItem.set((int) callbackArg_0)
            int callbackArg_0 = ua.mycredit.mycredit.ui.BindingAdaptersKt.getCurrentItemAlias(fragmentViewPager);
            // localize variables for thread safety
            // viewModel.currentItem.get()
            int viewModelCurrentItemGet = 0;
            // viewModel
            ua.mycredit.mycredit.ui.profile.ProfileActivity viewModel = mViewModel;
            // viewModel.currentItem != null
            boolean viewModelCurrentItemJavaLangObjectNull = false;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.currentItem
            android.databinding.ObservableInt viewModelCurrentItem = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelCurrentItem = viewModel.getCurrentItem();

                viewModelCurrentItemJavaLangObjectNull = (viewModelCurrentItem) != (null);
                if (viewModelCurrentItemJavaLangObjectNull) {




                    viewModelCurrentItem.set(((int) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityProfileBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ActivityProfileBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (com.aurelhubert.ahbottomnavigation.AHBottomNavigation) bindings[7]
            , (android.support.design.widget.FloatingActionButton) bindings[4]
            , (com.aurelhubert.ahbottomnavigation.AHBottomNavigationViewPager) bindings[6]
            , (android.widget.LinearLayout) bindings[8]
            , (android.support.design.widget.FloatingActionButton) bindings[1]
            , (android.support.design.widget.FloatingActionButton) bindings[3]
            , (android.widget.Button) bindings[5]
            , (android.support.design.widget.FloatingActionButton) bindings[2]
            );
        this.bottomNavigationView.setTag(null);
        this.chatList.setTag(null);
        this.fragmentViewPager.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.messenger.setTag(null);
        this.telegram.setTag(null);
        this.toolbarButton.setTag(null);
        this.viber.setTag(null);
        setRootTag(root);
        // listeners
        mCallback32 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 1);
        mCallback37 = new ua.mycredit.mycredit.generated.callback.OnTabSelectedListener(this, 6);
        mCallback35 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 4);
        mCallback36 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 5);
        mCallback33 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 2);
        mCallback34 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
            setViewModel((ua.mycredit.mycredit.ui.profile.ProfileActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ua.mycredit.mycredit.ui.profile.ProfileActivity ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelCurrentItem((android.databinding.ObservableInt) object, fieldId);
            case 1 :
                return onChangeViewModelToolbarTitle((android.databinding.ObservableField<java.lang.CharSequence>) object, fieldId);
            case 2 :
                return onChangeViewModelChatHideOrOpen((android.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelCurrentItem(android.databinding.ObservableInt ViewModelCurrentItem, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelToolbarTitle(android.databinding.ObservableField<java.lang.CharSequence> ViewModelToolbarTitle, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelChatHideOrOpen(android.databinding.ObservableBoolean ViewModelChatHideOrOpen, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        android.databinding.ObservableInt viewModelCurrentItem = null;
        boolean viewModelChatHideOrOpenGet = false;
        java.lang.CharSequence viewModelToolbarTitleGet = null;
        android.databinding.ObservableField<java.lang.CharSequence> viewModelToolbarTitle = null;
        com.aurelhubert.ahbottomnavigation.AHBottomNavigationAdapter viewModelNavigationMenuAdapter = null;
        android.support.v4.view.PagerAdapter viewModelPagerAdapter = null;
        android.databinding.ObservableBoolean viewModelChatHideOrOpen = null;
        int viewModelPagerAdapterCount = 0;
        int viewModelCurrentItemGet = 0;
        ua.mycredit.mycredit.ui.profile.ProfileActivity viewModel = mViewModel;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.currentItem
                        viewModelCurrentItem = viewModel.getCurrentItem();
                    }
                    updateRegistration(0, viewModelCurrentItem);


                    if (viewModelCurrentItem != null) {
                        // read viewModel.currentItem.get()
                        viewModelCurrentItemGet = viewModelCurrentItem.get();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.toolbarTitle
                        viewModelToolbarTitle = viewModel.getToolbarTitle();
                    }
                    updateRegistration(1, viewModelToolbarTitle);


                    if (viewModelToolbarTitle != null) {
                        // read viewModel.toolbarTitle.get()
                        viewModelToolbarTitleGet = viewModelToolbarTitle.get();
                    }
            }
            if ((dirtyFlags & 0x18L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.navigationMenuAdapter
                        viewModelNavigationMenuAdapter = viewModel.getNavigationMenuAdapter();
                        // read viewModel.pagerAdapter
                        viewModelPagerAdapter = viewModel.getPagerAdapter();
                    }


                    if (viewModelPagerAdapter != null) {
                        // read viewModel.pagerAdapter.count
                        viewModelPagerAdapterCount = viewModelPagerAdapter.getCount();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.chatHideOrOpen
                        viewModelChatHideOrOpen = viewModel.getChatHideOrOpen();
                    }
                    updateRegistration(2, viewModelChatHideOrOpen);


                    if (viewModelChatHideOrOpen != null) {
                        // read viewModel.chatHideOrOpen.get()
                        viewModelChatHideOrOpenGet = viewModelChatHideOrOpen.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.bottomNavigationView.setAccentColor(getColorFromResource(bottomNavigationView, R.color.colorPrimary));
            this.bottomNavigationView.setOnTabSelectedListener(mCallback37);
            this.bottomNavigationView.setTitleState(com.aurelhubert.ahbottomnavigation.AHBottomNavigation.TitleState.ALWAYS_SHOW);
            this.chatList.setOnClickListener(mCallback35);
            ua.mycredit.mycredit.ui.BindingAdaptersKt.setCurrentItemAttrChanged(this.fragmentViewPager, fragmentViewPagercurrentItemAttrChanged);
            this.messenger.setOnClickListener(mCallback32);
            this.telegram.setOnClickListener(mCallback34);
            this.toolbarButton.setOnClickListener(mCallback36);
            this.viber.setOnClickListener(mCallback33);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            ua.mycredit.mycredit.ui.BindingAdaptersKt.setAdapter(this.bottomNavigationView, viewModelNavigationMenuAdapter);
            this.fragmentViewPager.setAdapter(viewModelPagerAdapter);
            this.fragmentViewPager.setOffscreenPageLimit(viewModelPagerAdapterCount);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            ua.mycredit.mycredit.ui.BindingAdaptersKt.openCloseChatAnimation(this.chatList, viewModelChatHideOrOpenGet);
            ua.mycredit.mycredit.ui.BindingAdaptersKt.showHideButtonChat(this.messenger, viewModelChatHideOrOpenGet);
            ua.mycredit.mycredit.ui.BindingAdaptersKt.showHideButtonChat(this.telegram, viewModelChatHideOrOpenGet);
            ua.mycredit.mycredit.ui.BindingAdaptersKt.showHideButtonChat(this.viber, viewModelChatHideOrOpenGet);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            ua.mycredit.mycredit.ui.BindingAdaptersKt.doSetCurrentItem(this.fragmentViewPager, viewModelCurrentItemGet);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.toolbarButton, viewModelToolbarTitleGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // viewModel
                ua.mycredit.mycredit.ui.profile.ProfileActivity viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.openFacebookChat();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewModel
                ua.mycredit.mycredit.ui.profile.ProfileActivity viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.pickMessageMyCreditTeam();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewModel
                ua.mycredit.mycredit.ui.profile.ProfileActivity viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.pickCreditStatus();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                ua.mycredit.mycredit.ui.profile.ProfileActivity viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.openViberChat();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                ua.mycredit.mycredit.ui.profile.ProfileActivity viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.openTelegramChat();
                }
                break;
            }
        }
    }
    public final boolean _internalCallbackOnTabSelected(int sourceId , int callbackArg_0, boolean callbackArg_1) {
        // localize variables for thread safety
        // viewModel.onTabSelected(position)
        boolean viewModelOnTabSelectedCallbackArg0 = false;
        // viewModel
        ua.mycredit.mycredit.ui.profile.ProfileActivity viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {



            viewModelOnTabSelectedCallbackArg0 = viewModel.onTabSelected(callbackArg_0);
        }
        return viewModelOnTabSelectedCallbackArg0;
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.currentItem
        flag 1 (0x2L): viewModel.toolbarTitle
        flag 2 (0x3L): viewModel.chatHideOrOpen
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}