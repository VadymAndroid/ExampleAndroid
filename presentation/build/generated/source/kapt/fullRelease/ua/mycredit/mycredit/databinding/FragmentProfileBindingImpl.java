package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentProfileBindingImpl extends FragmentProfileBinding implements ua.mycredit.mycredit.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(9);
        sIncludes.setIncludes(1, 
            new String[] {"item_detail_section", "item_detail_section", "item_detail_section"},
            new int[] {6, 7, 8},
            new int[] {R.layout.item_detail_section, R.layout.item_detail_section, R.layout.item_detail_section});
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.support.v4.widget.NestedScrollView mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @Nullable
    private final ua.mycredit.mycredit.databinding.ItemDetailSectionBinding mboundView11;
    @Nullable
    private final ua.mycredit.mycredit.databinding.ItemDetailSectionBinding mboundView12;
    @Nullable
    private final ua.mycredit.mycredit.databinding.ItemDetailSectionBinding mboundView13;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback70;
    @Nullable
    private final android.view.View.OnClickListener mCallback71;
    @Nullable
    private final android.view.View.OnClickListener mCallback74;
    @Nullable
    private final android.view.View.OnClickListener mCallback76;
    @Nullable
    private final android.view.View.OnClickListener mCallback75;
    @Nullable
    private final android.view.View.OnClickListener mCallback72;
    @Nullable
    private final android.view.View.OnClickListener mCallback73;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentProfileBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private FragmentProfileBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            );
        this.mboundView0 = (android.support.v4.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView11 = (ua.mycredit.mycredit.databinding.ItemDetailSectionBinding) bindings[6];
        setContainedBinding(this.mboundView11);
        this.mboundView12 = (ua.mycredit.mycredit.databinding.ItemDetailSectionBinding) bindings[7];
        setContainedBinding(this.mboundView12);
        this.mboundView13 = (ua.mycredit.mycredit.databinding.ItemDetailSectionBinding) bindings[8];
        setContainedBinding(this.mboundView13);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        setRootTag(root);
        // listeners
        mCallback70 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 1);
        mCallback71 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 2);
        mCallback74 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 5);
        mCallback76 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 7);
        mCallback75 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 6);
        mCallback72 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 3);
        mCallback73 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 4);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        mboundView11.invalidateAll();
        mboundView12.invalidateAll();
        mboundView13.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView11.hasPendingBindings()) {
            return true;
        }
        if (mboundView12.hasPendingBindings()) {
            return true;
        }
        if (mboundView13.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((ua.mycredit.mycredit.ui.profile.profile.ProfileViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ua.mycredit.mycredit.ui.profile.profile.ProfileViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable android.arch.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView11.setLifecycleOwner(lifecycleOwner);
        mboundView12.setLifecycleOwner(lifecycleOwner);
        mboundView13.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelOccupationValid((android.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeViewModelPersonalValid((android.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelOccupationValid(android.databinding.ObservableBoolean ViewModelOccupationValid, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPersonalValid(android.databinding.ObservableBoolean ViewModelPersonalValid, int fieldId) {
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
        boolean viewModelOccupationValidGet = false;
        android.databinding.ObservableBoolean viewModelOccupationValid = null;
        boolean viewModelPersonalValidGet = false;
        android.databinding.ObservableBoolean viewModelPersonalValid = null;
        ua.mycredit.mycredit.ui.profile.profile.ProfileViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.occupationValid
                        viewModelOccupationValid = viewModel.getOccupationValid();
                    }
                    updateRegistration(0, viewModelOccupationValid);


                    if (viewModelOccupationValid != null) {
                        // read viewModel.occupationValid.get()
                        viewModelOccupationValidGet = viewModelOccupationValid.get();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.personalValid
                        viewModelPersonalValid = viewModel.getPersonalValid();
                    }
                    updateRegistration(1, viewModelPersonalValid);


                    if (viewModelPersonalValid != null) {
                        // read viewModel.personalValid.get()
                        viewModelPersonalValidGet = viewModelPersonalValid.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.mboundView11.setIsValid(true);
            this.mboundView11.setOnClick(mCallback70);
            this.mboundView11.setTitleRes(ua.mycredit.mycredit.R.string.contact_data);
            this.mboundView12.setOnClick(mCallback71);
            this.mboundView12.setTitleRes(ua.mycredit.mycredit.R.string.personal_data);
            this.mboundView13.setOnClick(mCallback72);
            this.mboundView13.setTitleRes(ua.mycredit.mycredit.R.string.occupation);
            this.mboundView2.setOnClickListener(mCallback73);
            this.mboundView3.setOnClickListener(mCallback74);
            this.mboundView4.setOnClickListener(mCallback75);
            this.mboundView5.setOnClickListener(mCallback76);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            this.mboundView12.setIsValid(viewModelPersonalValidGet);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.mboundView13.setIsValid(viewModelOccupationValidGet);
        }
        executeBindingsOn(mboundView11);
        executeBindingsOn(mboundView12);
        executeBindingsOn(mboundView13);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // viewModel.router != null
                boolean viewModelRouterJavaLangObjectNull = false;
                // viewModel.router
                ru.terrakok.cicerone.Router viewModelRouter = null;
                // viewModel
                ua.mycredit.mycredit.ui.profile.profile.ProfileViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModelRouter = viewModel.getRouter();

                    viewModelRouterJavaLangObjectNull = (viewModelRouter) != (null);
                    if (viewModelRouterJavaLangObjectNull) {




                        viewModelRouter.navigateTo(ua.mycredit.mycredit.Screens.Profile.Contacts.CONTACTS);
                    }
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                ua.mycredit.mycredit.ui.profile.profile.ProfileViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.onDetails(ua.mycredit.mycredit.Screens.Profile.DETAILS_PERSONAL);
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewModel.router != null
                boolean viewModelRouterJavaLangObjectNull = false;
                // viewModel.router
                ru.terrakok.cicerone.Router viewModelRouter = null;
                // viewModel
                ua.mycredit.mycredit.ui.profile.profile.ProfileViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModelRouter = viewModel.getRouter();

                    viewModelRouterJavaLangObjectNull = (viewModelRouter) != (null);
                    if (viewModelRouterJavaLangObjectNull) {




                        viewModelRouter.navigateTo(ua.mycredit.mycredit.Screens.Profile.FAQ_WEB);
                    }
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // viewModel
                ua.mycredit.mycredit.ui.profile.profile.ProfileViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.logout();
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // viewModel.router != null
                boolean viewModelRouterJavaLangObjectNull = false;
                // viewModel.router
                ru.terrakok.cicerone.Router viewModelRouter = null;
                // viewModel
                ua.mycredit.mycredit.ui.profile.profile.ProfileViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModelRouter = viewModel.getRouter();

                    viewModelRouterJavaLangObjectNull = (viewModelRouter) != (null);
                    if (viewModelRouterJavaLangObjectNull) {




                        viewModelRouter.navigateTo(ua.mycredit.mycredit.Screens.Profile.FAQ_WEB_PP);
                    }
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                ua.mycredit.mycredit.ui.profile.profile.ProfileViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.onDetails(ua.mycredit.mycredit.Screens.Profile.DETAILS_OCCUPATION);
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewModel.router != null
                boolean viewModelRouterJavaLangObjectNull = false;
                // viewModel.router
                ru.terrakok.cicerone.Router viewModelRouter = null;
                // viewModel
                ua.mycredit.mycredit.ui.profile.profile.ProfileViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModelRouter = viewModel.getRouter();

                    viewModelRouterJavaLangObjectNull = (viewModelRouter) != (null);
                    if (viewModelRouterJavaLangObjectNull) {




                        viewModelRouter.navigateTo(ua.mycredit.mycredit.Screens.Profile.FAQ);
                    }
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.occupationValid
        flag 1 (0x2L): viewModel.personalValid
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}