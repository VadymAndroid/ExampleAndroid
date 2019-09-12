package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSignUpAddressBindingImpl extends FragmentSignUpAddressBinding implements ua.mycredit.mycredit.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(25);
        sIncludes.setIncludes(4, 
            new String[] {"input_field", "input_field", "input_field"},
            new int[] {16, 17, 18},
            new int[] {R.layout.input_field, R.layout.input_field, R.layout.input_field});
        sIncludes.setIncludes(11, 
            new String[] {"input_field", "input_field", "input_field"},
            new int[] {19, 20, 21},
            new int[] {R.layout.input_field, R.layout.input_field, R.layout.input_field});
        sIncludes.setIncludes(12, 
            new String[] {"input_field", "input_field", "input_field"},
            new int[] {22, 23, 24},
            new int[] {R.layout.input_field, R.layout.input_field, R.layout.input_field});
        sIncludes.setIncludes(0, 
            new String[] {"input_field", "input_field", "input_field"},
            new int[] {13, 14, 15},
            new int[] {R.layout.input_field, R.layout.input_field, R.layout.input_field});
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputFieldBinding mboundView01;
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputFieldBinding mboundView02;
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputFieldBinding mboundView03;
    @NonNull
    private final android.widget.ImageView mboundView1;
    @NonNull
    private final android.widget.ImageView mboundView10;
    @NonNull
    private final android.widget.LinearLayout mboundView11;
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputFieldBinding mboundView111;
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputFieldBinding mboundView112;
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputFieldBinding mboundView113;
    @NonNull
    private final android.widget.LinearLayout mboundView12;
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputFieldBinding mboundView121;
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputFieldBinding mboundView122;
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputFieldBinding mboundView123;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.ImageView mboundView3;
    @NonNull
    private final android.widget.LinearLayout mboundView4;
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputFieldBinding mboundView41;
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputFieldBinding mboundView42;
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputFieldBinding mboundView43;
    @NonNull
    private final android.support.v7.widget.AppCompatCheckBox mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.support.v7.widget.CardView mboundView7;
    @NonNull
    private final android.widget.ImageView mboundView8;
    @NonNull
    private final android.widget.TextView mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback27;
    @Nullable
    private final android.view.View.OnClickListener mCallback28;
    @Nullable
    private final android.view.View.OnClickListener mCallback25;
    @Nullable
    private final android.view.View.OnClickListener mCallback26;
    @Nullable
    private final android.view.View.OnClickListener mCallback23;
    @Nullable
    private final android.view.View.OnClickListener mCallback24;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener mboundView5checkedSafeAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.liveInRegister.get()
            //         is viewModel.liveInRegister.set((boolean) callbackArg_0)
            boolean callbackArg_0 = ua.mycredit.mycredit.ui.BindingAdaptersKt.getCheckedSafe(mboundView5);
            // localize variables for thread safety
            // viewModel.liveInRegister
            android.databinding.ObservableBoolean viewModelLiveInRegister = null;
            // viewModel.liveInRegister.get()
            boolean viewModelLiveInRegisterGet = false;
            // viewModel
            ua.mycredit.mycredit.ui.authentication.registration.passport.address.SignUpAddressViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.liveInRegister != null
            boolean viewModelLiveInRegisterJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelLiveInRegister = viewModel.getLiveInRegister();

                viewModelLiveInRegisterJavaLangObjectNull = (viewModelLiveInRegister) != (null);
                if (viewModelLiveInRegisterJavaLangObjectNull) {




                    viewModelLiveInRegister.set(((boolean) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentSignUpAddressBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 25, sIncludes, sViewsWithIds));
    }
    private FragmentSignUpAddressBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView01 = (ua.mycredit.mycredit.databinding.InputFieldBinding) bindings[13];
        setContainedBinding(this.mboundView01);
        this.mboundView02 = (ua.mycredit.mycredit.databinding.InputFieldBinding) bindings[14];
        setContainedBinding(this.mboundView02);
        this.mboundView03 = (ua.mycredit.mycredit.databinding.InputFieldBinding) bindings[15];
        setContainedBinding(this.mboundView03);
        this.mboundView1 = (android.widget.ImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (android.widget.ImageView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.widget.LinearLayout) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView111 = (ua.mycredit.mycredit.databinding.InputFieldBinding) bindings[19];
        setContainedBinding(this.mboundView111);
        this.mboundView112 = (ua.mycredit.mycredit.databinding.InputFieldBinding) bindings[20];
        setContainedBinding(this.mboundView112);
        this.mboundView113 = (ua.mycredit.mycredit.databinding.InputFieldBinding) bindings[21];
        setContainedBinding(this.mboundView113);
        this.mboundView12 = (android.widget.LinearLayout) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView121 = (ua.mycredit.mycredit.databinding.InputFieldBinding) bindings[22];
        setContainedBinding(this.mboundView121);
        this.mboundView122 = (ua.mycredit.mycredit.databinding.InputFieldBinding) bindings[23];
        setContainedBinding(this.mboundView122);
        this.mboundView123 = (ua.mycredit.mycredit.databinding.InputFieldBinding) bindings[24];
        setContainedBinding(this.mboundView123);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.ImageView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.LinearLayout) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView41 = (ua.mycredit.mycredit.databinding.InputFieldBinding) bindings[16];
        setContainedBinding(this.mboundView41);
        this.mboundView42 = (ua.mycredit.mycredit.databinding.InputFieldBinding) bindings[17];
        setContainedBinding(this.mboundView42);
        this.mboundView43 = (ua.mycredit.mycredit.databinding.InputFieldBinding) bindings[18];
        setContainedBinding(this.mboundView43);
        this.mboundView5 = (android.support.v7.widget.AppCompatCheckBox) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.support.v7.widget.CardView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.ImageView) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.TextView) bindings[9];
        this.mboundView9.setTag(null);
        setRootTag(root);
        // listeners
        mCallback27 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 5);
        mCallback28 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 6);
        mCallback25 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 3);
        mCallback26 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 4);
        mCallback23 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 1);
        mCallback24 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        mboundView01.invalidateAll();
        mboundView02.invalidateAll();
        mboundView03.invalidateAll();
        mboundView41.invalidateAll();
        mboundView42.invalidateAll();
        mboundView43.invalidateAll();
        mboundView111.invalidateAll();
        mboundView112.invalidateAll();
        mboundView113.invalidateAll();
        mboundView121.invalidateAll();
        mboundView122.invalidateAll();
        mboundView123.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView01.hasPendingBindings()) {
            return true;
        }
        if (mboundView02.hasPendingBindings()) {
            return true;
        }
        if (mboundView03.hasPendingBindings()) {
            return true;
        }
        if (mboundView41.hasPendingBindings()) {
            return true;
        }
        if (mboundView42.hasPendingBindings()) {
            return true;
        }
        if (mboundView43.hasPendingBindings()) {
            return true;
        }
        if (mboundView111.hasPendingBindings()) {
            return true;
        }
        if (mboundView112.hasPendingBindings()) {
            return true;
        }
        if (mboundView113.hasPendingBindings()) {
            return true;
        }
        if (mboundView121.hasPendingBindings()) {
            return true;
        }
        if (mboundView122.hasPendingBindings()) {
            return true;
        }
        if (mboundView123.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((ua.mycredit.mycredit.ui.authentication.registration.passport.address.SignUpAddressViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ua.mycredit.mycredit.ui.authentication.registration.passport.address.SignUpAddressViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable android.arch.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView01.setLifecycleOwner(lifecycleOwner);
        mboundView02.setLifecycleOwner(lifecycleOwner);
        mboundView03.setLifecycleOwner(lifecycleOwner);
        mboundView41.setLifecycleOwner(lifecycleOwner);
        mboundView42.setLifecycleOwner(lifecycleOwner);
        mboundView43.setLifecycleOwner(lifecycleOwner);
        mboundView111.setLifecycleOwner(lifecycleOwner);
        mboundView112.setLifecycleOwner(lifecycleOwner);
        mboundView113.setLifecycleOwner(lifecycleOwner);
        mboundView121.setLifecycleOwner(lifecycleOwner);
        mboundView122.setLifecycleOwner(lifecycleOwner);
        mboundView123.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelAddress((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelAddressResidenceField((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelLiveInRegister((android.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelAddress(android.databinding.ObservableField<java.lang.String> ViewModelAddress, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAddressResidenceField(android.databinding.ObservableField<java.lang.String> ViewModelAddressResidenceField, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLiveInRegister(android.databinding.ObservableBoolean ViewModelLiveInRegister, int fieldId) {
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
        ua.mycredit.mycredit.ui.bases.input.FieldViewModel viewModelApartmentResidence = null;
        ua.mycredit.mycredit.ui.bases.input.FieldViewModel viewModelHousing = null;
        ua.mycredit.mycredit.ui.bases.input.FieldViewModel viewModelCityResidence = null;
        ua.mycredit.mycredit.ui.bases.input.FieldViewModel viewModelHousingResidence = null;
        android.databinding.ObservableField<java.lang.String> viewModelAddress = null;
        ua.mycredit.core.Address viewModelProfileAddressRegister = null;
        boolean textUtilsIsEmptyViewModelAddressResidenceField = false;
        android.databinding.ObservableField<java.lang.String> viewModelAddressResidenceField = null;
        boolean viewModelLiveInRegisterGet = false;
        ua.mycredit.core.Profile viewModelProfile = null;
        ua.mycredit.mycredit.ui.bases.input.FieldViewModel viewModelStreet = null;
        boolean viewModelProfileAddressRegisterJavaLangObjectNull = false;
        boolean viewModelLiveInRegister = false;
        java.lang.String viewModelAddressGet = null;
        boolean textUtilsIsEmptyViewModelAddress = false;
        ua.mycredit.mycredit.ui.bases.input.FieldViewModel viewModelRegion = null;
        java.lang.String viewModelAddressResidenceFieldGet = null;
        ua.mycredit.mycredit.ui.bases.input.FieldViewModel viewModelApartment = null;
        boolean viewModelProfileSignUpFlowBooleanTrueViewModelProfileAddressRegisterJavaLangObjectNull = false;
        ua.mycredit.mycredit.ui.bases.input.FieldViewModel viewModelRegionResidence = null;
        android.databinding.ObservableBoolean ViewModelLiveInRegister1 = null;
        ua.mycredit.mycredit.ui.bases.input.FieldViewModel viewModelHouse = null;
        boolean viewModelProfileSignUpFlow = false;
        boolean TextUtilsIsEmptyViewModelAddressResidenceField1 = false;
        boolean TextUtilsIsEmptyViewModelAddress1 = false;
        ua.mycredit.mycredit.ui.bases.input.FieldViewModel viewModelCity = null;
        ua.mycredit.mycredit.ui.bases.input.FieldViewModel viewModelStreetResidence = null;
        ua.mycredit.mycredit.ui.bases.input.FieldViewModel viewModelHouseResidence = null;
        ua.mycredit.mycredit.ui.authentication.registration.passport.address.SignUpAddressViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x18L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.apartmentResidence
                        viewModelApartmentResidence = viewModel.getApartmentResidence();
                        // read viewModel.housing
                        viewModelHousing = viewModel.getHousing();
                        // read viewModel.cityResidence
                        viewModelCityResidence = viewModel.getCityResidence();
                        // read viewModel.housingResidence
                        viewModelHousingResidence = viewModel.getHousingResidence();
                        // read viewModel.profile
                        viewModelProfile = viewModel.getProfile();
                        // read viewModel.street
                        viewModelStreet = viewModel.getStreet();
                        // read viewModel.region
                        viewModelRegion = viewModel.getRegion();
                        // read viewModel.apartment
                        viewModelApartment = viewModel.getApartment();
                        // read viewModel.regionResidence
                        viewModelRegionResidence = viewModel.getRegionResidence();
                        // read viewModel.house
                        viewModelHouse = viewModel.getHouse();
                        // read viewModel.city
                        viewModelCity = viewModel.getCity();
                        // read viewModel.streetResidence
                        viewModelStreetResidence = viewModel.getStreetResidence();
                        // read viewModel.houseResidence
                        viewModelHouseResidence = viewModel.getHouseResidence();
                    }


                    if (viewModelProfile != null) {
                        // read viewModel.profile.signUpFlow
                        viewModelProfileSignUpFlow = viewModelProfile.getSignUpFlow();
                    }
                if((dirtyFlags & 0x18L) != 0) {
                    if(viewModelProfileSignUpFlow) {
                            dirtyFlags |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                    }
                }
            }
            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.address
                        viewModelAddress = viewModel.getAddress();
                    }
                    updateRegistration(0, viewModelAddress);


                    if (viewModelAddress != null) {
                        // read viewModel.address.get()
                        viewModelAddressGet = viewModelAddress.get();
                    }


                    // read TextUtils.isEmpty(viewModel.address.get())
                    TextUtilsIsEmptyViewModelAddress1 = android.text.TextUtils.isEmpty(viewModelAddressGet);


                    // read !TextUtils.isEmpty(viewModel.address.get())
                    textUtilsIsEmptyViewModelAddress = !TextUtilsIsEmptyViewModelAddress1;
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.addressResidenceField
                        viewModelAddressResidenceField = viewModel.getAddressResidenceField();
                    }
                    updateRegistration(1, viewModelAddressResidenceField);


                    if (viewModelAddressResidenceField != null) {
                        // read viewModel.addressResidenceField.get()
                        viewModelAddressResidenceFieldGet = viewModelAddressResidenceField.get();
                    }


                    // read TextUtils.isEmpty(viewModel.addressResidenceField.get())
                    textUtilsIsEmptyViewModelAddressResidenceField = android.text.TextUtils.isEmpty(viewModelAddressResidenceFieldGet);


                    // read !TextUtils.isEmpty(viewModel.addressResidenceField.get())
                    TextUtilsIsEmptyViewModelAddressResidenceField1 = !textUtilsIsEmptyViewModelAddressResidenceField;
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.liveInRegister
                        ViewModelLiveInRegister1 = viewModel.getLiveInRegister();
                    }
                    updateRegistration(2, ViewModelLiveInRegister1);


                    if (ViewModelLiveInRegister1 != null) {
                        // read viewModel.liveInRegister.get()
                        viewModelLiveInRegisterGet = ViewModelLiveInRegister1.get();
                    }


                    // read !viewModel.liveInRegister.get()
                    viewModelLiveInRegister = !viewModelLiveInRegisterGet;
            }
        }
        // batch finished

        if ((dirtyFlags & 0x20L) != 0) {

                if (viewModelProfile != null) {
                    // read viewModel.profile.addressRegister
                    viewModelProfileAddressRegister = viewModelProfile.getAddressRegister();
                }


                // read viewModel.profile.addressRegister == null
                viewModelProfileAddressRegisterJavaLangObjectNull = (viewModelProfileAddressRegister) == (null);
        }

        if ((dirtyFlags & 0x18L) != 0) {

                // read viewModel.profile.signUpFlow ? true : viewModel.profile.addressRegister == null
                viewModelProfileSignUpFlowBooleanTrueViewModelProfileAddressRegisterJavaLangObjectNull = ((viewModelProfileSignUpFlow) ? (true) : (viewModelProfileAddressRegisterJavaLangObjectNull));
        }
        // batch finished
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            this.mboundView01.setViewModel(viewModelRegionResidence);
            this.mboundView02.setViewModel(viewModelCityResidence);
            this.mboundView03.setViewModel(viewModelStreetResidence);
            this.mboundView111.setViewModel(viewModelRegion);
            this.mboundView112.setViewModel(viewModelCity);
            this.mboundView113.setViewModel(viewModelStreet);
            this.mboundView121.setViewModel(viewModelHouse);
            this.mboundView122.setViewModel(viewModelHousing);
            this.mboundView123.setViewModel(viewModelApartment);
            this.mboundView41.setViewModel(viewModelHouseResidence);
            this.mboundView42.setViewModel(viewModelHousingResidence);
            this.mboundView43.setViewModel(viewModelApartmentResidence);
            this.mboundView5.setEnabled(viewModelProfileSignUpFlowBooleanTrueViewModelProfileAddressRegisterJavaLangObjectNull);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback23);
            this.mboundView10.setOnClickListener(mCallback28);
            this.mboundView2.setOnClickListener(mCallback24);
            this.mboundView3.setOnClickListener(mCallback25);
            this.mboundView8.setOnClickListener(mCallback26);
            this.mboundView9.setOnClickListener(mCallback27);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            this.mboundView10.setVisibility(ua.mycredit.mycredit.ui.BindingAdaptersKt.booleanToVisibility(textUtilsIsEmptyViewModelAddress));
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, viewModelAddressGet);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            this.mboundView11.setVisibility(ua.mycredit.mycredit.ui.BindingAdaptersKt.booleanToVisibility(viewModelLiveInRegister));
            this.mboundView12.setVisibility(ua.mycredit.mycredit.ui.BindingAdaptersKt.booleanToVisibility(viewModelLiveInRegister));
            ua.mycredit.mycredit.ui.BindingAdaptersKt.setCheckedSafe(this.mboundView5, viewModelLiveInRegisterGet, mboundView5checkedSafeAttrChanged);
            this.mboundView6.setVisibility(ua.mycredit.mycredit.ui.BindingAdaptersKt.booleanToVisibility(viewModelLiveInRegister));
            this.mboundView7.setVisibility(ua.mycredit.mycredit.ui.BindingAdaptersKt.booleanToVisibility(viewModelLiveInRegister));
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelAddressResidenceFieldGet);
            this.mboundView3.setVisibility(ua.mycredit.mycredit.ui.BindingAdaptersKt.booleanToVisibility(TextUtilsIsEmptyViewModelAddressResidenceField1));
        }
        executeBindingsOn(mboundView01);
        executeBindingsOn(mboundView02);
        executeBindingsOn(mboundView03);
        executeBindingsOn(mboundView41);
        executeBindingsOn(mboundView42);
        executeBindingsOn(mboundView43);
        executeBindingsOn(mboundView111);
        executeBindingsOn(mboundView112);
        executeBindingsOn(mboundView113);
        executeBindingsOn(mboundView121);
        executeBindingsOn(mboundView122);
        executeBindingsOn(mboundView123);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 5: {
                // localize variables for thread safety
                // viewModel
                ua.mycredit.mycredit.ui.authentication.registration.passport.address.SignUpAddressViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.showPlaces(ua.mycredit.mycredit.ui.authentication.registration.passport.address.SignUpAddressViewModel.AddressPlaceType.REGISTER);
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // viewModel
                ua.mycredit.mycredit.ui.authentication.registration.passport.address.SignUpAddressViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.resetPlaces();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                ua.mycredit.mycredit.ui.authentication.registration.passport.address.SignUpAddressViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.resetResidencePlaces();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewModel
                ua.mycredit.mycredit.ui.authentication.registration.passport.address.SignUpAddressViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.showPlaces(ua.mycredit.mycredit.ui.authentication.registration.passport.address.SignUpAddressViewModel.AddressPlaceType.REGISTER);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                ua.mycredit.mycredit.ui.authentication.registration.passport.address.SignUpAddressViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.showPlaces(ua.mycredit.mycredit.ui.authentication.registration.passport.address.SignUpAddressViewModel.AddressPlaceType.RESIDENCE);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                ua.mycredit.mycredit.ui.authentication.registration.passport.address.SignUpAddressViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.showPlaces(ua.mycredit.mycredit.ui.authentication.registration.passport.address.SignUpAddressViewModel.AddressPlaceType.RESIDENCE);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.address
        flag 1 (0x2L): viewModel.addressResidenceField
        flag 2 (0x3L): viewModel.liveInRegister
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
        flag 5 (0x6L): viewModel.profile.signUpFlow ? true : viewModel.profile.addressRegister == null
        flag 6 (0x7L): viewModel.profile.signUpFlow ? true : viewModel.profile.addressRegister == null
    flag mapping end*/
    //end
}