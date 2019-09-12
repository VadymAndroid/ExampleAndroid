package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentStatusBindingImpl extends FragmentStatusBinding implements ua.mycredit.mycredit.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(23);
        sIncludes.setIncludes(0, 
            new String[] {"credit_status_description"},
            new int[] {18},
            new int[] {R.layout.credit_status_description});
        sIncludes.setIncludes(17, 
            new String[] {"status_details_past_due", "status_details_restructured", "status_details_active"},
            new int[] {19, 20, 21},
            new int[] {R.layout.status_details_past_due, R.layout.status_details_restructured, R.layout.status_details_active});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.alerts, 22);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView10;
    @NonNull
    private final android.widget.TextView mboundView11;
    @NonNull
    private final android.widget.ProgressBar mboundView15;
    @NonNull
    private final android.support.v7.widget.RecyclerView mboundView16;
    @Nullable
    private final ua.mycredit.mycredit.databinding.StatusDetailsPastDueBinding mboundView17;
    @Nullable
    private final ua.mycredit.mycredit.databinding.StatusDetailsRestructuredBinding mboundView171;
    @Nullable
    private final ua.mycredit.mycredit.databinding.StatusDetailsActiveBinding mboundView172;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final ua.mycredit.mycredit.ui.custom.credit.RestructuredCreditDetailsView mboundView5;
    @NonNull
    private final ua.mycredit.mycredit.ui.custom.credit.TitledSeekArc mboundView6;
    @NonNull
    private final android.widget.TextView mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback49;
    @Nullable
    private final android.view.View.OnClickListener mCallback52;
    @Nullable
    private final android.view.View.OnClickListener mCallback50;
    @Nullable
    private final android.view.View.OnClickListener mCallback51;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentStatusBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 23, sIncludes, sViewsWithIds));
    }
    private FragmentStatusBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (android.widget.LinearLayout) bindings[22]
            , (android.widget.ViewSwitcher) bindings[14]
            , (android.widget.Button) bindings[12]
            , (android.widget.ViewSwitcher) bindings[8]
            , (ua.mycredit.mycredit.databinding.CreditStatusDescriptionBinding) bindings[18]
            , (android.widget.TextView) bindings[7]
            , (android.widget.ViewSwitcher) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.Button) bindings[13]
            , (android.widget.ViewFlipper) bindings[17]
            );
        this.contractAddition.setTag(null);
        this.creditAction.setTag(null);
        this.creditParams.setTag(null);
        this.creditStatusName.setTag(null);
        this.diagram.setTag(null);
        this.greeting.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (android.widget.TextView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.widget.TextView) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView15 = (android.widget.ProgressBar) bindings[15];
        this.mboundView15.setTag(null);
        this.mboundView16 = (android.support.v7.widget.RecyclerView) bindings[16];
        this.mboundView16.setTag(null);
        this.mboundView17 = (ua.mycredit.mycredit.databinding.StatusDetailsPastDueBinding) bindings[19];
        setContainedBinding(this.mboundView17);
        this.mboundView171 = (ua.mycredit.mycredit.databinding.StatusDetailsRestructuredBinding) bindings[20];
        setContainedBinding(this.mboundView171);
        this.mboundView172 = (ua.mycredit.mycredit.databinding.StatusDetailsActiveBinding) bindings[21];
        setContainedBinding(this.mboundView172);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView5 = (ua.mycredit.mycredit.ui.custom.credit.RestructuredCreditDetailsView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (ua.mycredit.mycredit.ui.custom.credit.TitledSeekArc) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView9 = (android.widget.TextView) bindings[9];
        this.mboundView9.setTag(null);
        this.repayPart.setTag(null);
        this.statusDetails.setTag(null);
        setRootTag(root);
        // listeners
        mCallback49 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 1);
        mCallback52 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 4);
        mCallback50 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 2);
        mCallback51 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
        }
        creditStatusDescription.invalidateAll();
        mboundView17.invalidateAll();
        mboundView171.invalidateAll();
        mboundView172.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (creditStatusDescription.hasPendingBindings()) {
            return true;
        }
        if (mboundView17.hasPendingBindings()) {
            return true;
        }
        if (mboundView171.hasPendingBindings()) {
            return true;
        }
        if (mboundView172.hasPendingBindings()) {
            return true;
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
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable android.arch.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        creditStatusDescription.setLifecycleOwner(lifecycleOwner);
        mboundView17.setLifecycleOwner(lifecycleOwner);
        mboundView171.setLifecycleOwner(lifecycleOwner);
        mboundView172.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelStatus((android.databinding.ObservableField<ua.mycredit.core.Status>) object, fieldId);
            case 1 :
                return onChangeCreditStatusDescription((ua.mycredit.mycredit.databinding.CreditStatusDescriptionBinding) object, fieldId);
            case 2 :
                return onChangeViewModelContractAdditionsVisible((android.databinding.ObservableBoolean) object, fieldId);
            case 3 :
                return onChangeViewModelNotEnoughInformationAlertEnabled((android.databinding.ObservableBoolean) object, fieldId);
            case 4 :
                return onChangeViewModelNoVerifiedCardAlertEnabled((android.databinding.ObservableBoolean) object, fieldId);
            case 5 :
                return onChangeViewModelContractAdditionsLoading((android.databinding.ObservableBoolean) object, fieldId);
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
    private boolean onChangeCreditStatusDescription(ua.mycredit.mycredit.databinding.CreditStatusDescriptionBinding CreditStatusDescription, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelContractAdditionsVisible(android.databinding.ObservableBoolean ViewModelContractAdditionsVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelNotEnoughInformationAlertEnabled(android.databinding.ObservableBoolean ViewModelNotEnoughInformationAlertEnabled, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelNoVerifiedCardAlertEnabled(android.databinding.ObservableBoolean ViewModelNoVerifiedCardAlertEnabled, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelContractAdditionsLoading(android.databinding.ObservableBoolean ViewModelContractAdditionsLoading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
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
        boolean viewModelStatusInstanceofPastDue = false;
        int viewModelStatusJavaLangObjectNullInt0Int1 = 0;
        boolean viewModelContractAdditionsLoadingGet = false;
        boolean viewModelNoVerifiedCardAlertEnabledViewModelStatusJavaLangObjectNullBooleanFalse = false;
        boolean viewModelStatusJavaLangObjectNull = false;
        java.lang.String viewModelProfileName = null;
        boolean viewModelNotEnoughInformationAlertEnabledGet = false;
        boolean viewModelStatusInstanceofClosed = false;
        boolean entitiesKtGetCanProlongViewModelStatus = false;
        boolean viewModelStatusInstanceofRestructured = false;
        boolean viewModelNoVerifiedCardAlertEnabledGet = false;
        int viewModelStatusInstanceofRestructuredInt0Int1 = 0;
        ua.mycredit.core.Profile viewModelProfile = null;
        java.lang.String greetingAndroidStringGreetingPatternTextUtilsIsEmptyViewModelProfileNameGreetingAndroidStringNameNotSpecifiedViewModelProfileName = null;
        boolean viewModelContractAdditionsVisibleGet = false;
        boolean viewModelNotEnoughInformationAlertEnabledViewModelStatusJavaLangObjectNullBooleanFalse = false;
        android.databinding.ObservableField<ua.mycredit.core.Status> viewModelStatus = null;
        boolean ViewModelStatusInstanceofRestructured1 = false;
        ua.mycredit.core.PastDue pastDueViewModelStatus = null;
        ua.mycredit.core.Restructured restructuredViewModelStatus = null;
        ua.mycredit.core.PastDue viewModelStatusInstanceofPastDuePastDueViewModelStatusJavaLangObjectNull = null;
        boolean viewModelStatusCreditJavaLangObjectNullViewModelStatusInstanceofClosedBooleanFalse = false;
        boolean ViewModelStatusJavaLangObjectNull1 = false;
        android.databinding.ObservableBoolean viewModelContractAdditionsVisible = null;
        boolean viewModelStatusCreditJavaLangObjectNull = false;
        java.lang.String textUtilsIsEmptyViewModelProfileNameGreetingAndroidStringNameNotSpecifiedViewModelProfileName = null;
        boolean entitiesKtGetCanProlongViewModelStatusViewModelContractAdditionsVisibleBooleanFalse = false;
        boolean ViewModelStatusInstanceofClosed1 = false;
        android.databinding.ObservableBoolean viewModelNotEnoughInformationAlertEnabled = null;
        int viewModelStatusInstanceofRestructuredInt1Int2 = 0;
        int viewModelStatusInstanceofPastDueInt0ViewModelStatusInstanceofRestructuredInt1Int2 = 0;
        ua.mycredit.core.Restructured viewModelStatusInstanceofRestructuredRestructuredViewModelStatusJavaLangObjectNull = null;
        int viewModelContractAdditionsLoadingInt0Int1 = 0;
        ua.mycredit.core.Status viewModelStatusGet = null;
        android.databinding.ObservableBoolean viewModelNoVerifiedCardAlertEnabled = null;
        boolean textUtilsIsEmptyViewModelProfileName = false;
        ua.mycredit.core.Credit viewModelStatusCredit = null;
        android.databinding.ObservableBoolean viewModelContractAdditionsLoading = null;
        int viewModelStatusJavaLangObjectNullViewINVISIBLEViewVISIBLE = 0;
        android.support.v7.widget.RecyclerView.Adapter viewModelCreateContractAdditionsAdapter = null;
        ua.mycredit.mycredit.ui.profile.credit.StatusViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xfdL) != 0) {


            if ((dirtyFlags & 0xc0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.profile
                        viewModelProfile = viewModel.getProfile();
                        // read viewModel.createContractAdditionsAdapter()
                        viewModelCreateContractAdditionsAdapter = viewModel.createContractAdditionsAdapter();
                    }


                    if (viewModelProfile != null) {
                        // read viewModel.profile.name
                        viewModelProfileName = viewModelProfile.getName();
                    }


                    // read TextUtils.isEmpty(viewModel.profile.name)
                    textUtilsIsEmptyViewModelProfileName = android.text.TextUtils.isEmpty(viewModelProfileName);
                if((dirtyFlags & 0xc0L) != 0) {
                    if(textUtilsIsEmptyViewModelProfileName) {
                            dirtyFlags |= 0x200000L;
                    }
                    else {
                            dirtyFlags |= 0x100000L;
                    }
                }
            }
            if ((dirtyFlags & 0xc5L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.status
                        viewModelStatus = viewModel.getStatus();
                    }
                    updateRegistration(0, viewModelStatus);


                    if (viewModelStatus != null) {
                        // read viewModel.status.get()
                        viewModelStatusGet = viewModelStatus.get();
                    }

                if ((dirtyFlags & 0xc1L) != 0) {

                        // read viewModel.status.get() instanceof PastDue
                        viewModelStatusInstanceofPastDue = viewModelStatusGet instanceof ua.mycredit.core.PastDue;
                        // read viewModel.status.get() != null
                        viewModelStatusJavaLangObjectNull = (viewModelStatusGet) != (null);
                        // read viewModel.status.get() instanceof Restructured
                        viewModelStatusInstanceofRestructured = viewModelStatusGet instanceof ua.mycredit.core.Restructured;
                        // read viewModel.status.get() == null
                        ViewModelStatusJavaLangObjectNull1 = (viewModelStatusGet) == (null);
                    if((dirtyFlags & 0xc1L) != 0) {
                        if(viewModelStatusInstanceofPastDue) {
                                dirtyFlags |= 0x20000L;
                                dirtyFlags |= 0x8000000L;
                        }
                        else {
                                dirtyFlags |= 0x10000L;
                                dirtyFlags |= 0x4000000L;
                        }
                    }
                    if((dirtyFlags & 0xc1L) != 0) {
                        if(viewModelStatusInstanceofRestructured) {
                                dirtyFlags |= 0x2000L;
                                dirtyFlags |= 0x20000000L;
                        }
                        else {
                                dirtyFlags |= 0x1000L;
                                dirtyFlags |= 0x10000000L;
                        }
                    }
                    if((dirtyFlags & 0x4000000L) != 0) {
                        if(viewModelStatusInstanceofRestructured) {
                                dirtyFlags |= 0x2000000L;
                        }
                        else {
                                dirtyFlags |= 0x1000000L;
                        }
                    }
                    if((dirtyFlags & 0xc1L) != 0) {
                        if(ViewModelStatusJavaLangObjectNull1) {
                                dirtyFlags |= 0x200L;
                                dirtyFlags |= 0x200000000L;
                        }
                        else {
                                dirtyFlags |= 0x100L;
                                dirtyFlags |= 0x100000000L;
                        }
                    }
                        if (viewModelStatusGet != null) {
                            // read viewModel.status.get().credit
                            viewModelStatusCredit = viewModelStatusGet.getCredit();
                        }


                        // read viewModel.status.get() instanceof Restructured ? 0 : 1
                        viewModelStatusInstanceofRestructuredInt0Int1 = ((viewModelStatusInstanceofRestructured) ? (0) : (1));
                        // read !viewModel.status.get() instanceof Restructured
                        ViewModelStatusInstanceofRestructured1 = !viewModelStatusInstanceofRestructured;
                        // read viewModel.status.get() == null ? 0 : 1
                        viewModelStatusJavaLangObjectNullInt0Int1 = ((ViewModelStatusJavaLangObjectNull1) ? (0) : (1));
                        // read viewModel.status.get() == null ? View.INVISIBLE : View.VISIBLE
                        viewModelStatusJavaLangObjectNullViewINVISIBLEViewVISIBLE = ((ViewModelStatusJavaLangObjectNull1) ? (android.view.View.INVISIBLE) : (android.view.View.VISIBLE));
                        // read viewModel.status.get().credit != null
                        viewModelStatusCreditJavaLangObjectNull = (viewModelStatusCredit) != (null);
                    if((dirtyFlags & 0xc1L) != 0) {
                        if(viewModelStatusCreditJavaLangObjectNull) {
                                dirtyFlags |= 0x80000L;
                        }
                        else {
                                dirtyFlags |= 0x40000L;
                        }
                    }
                }

                    // read EntitiesKt.getCanProlong(viewModel.status.get())
                    entitiesKtGetCanProlongViewModelStatus = ua.mycredit.core.EntitiesKt.getCanProlong(viewModelStatusGet);
                if((dirtyFlags & 0xc5L) != 0) {
                    if(entitiesKtGetCanProlongViewModelStatus) {
                            dirtyFlags |= 0x800000L;
                    }
                    else {
                            dirtyFlags |= 0x400000L;
                    }
                }
            }
            if ((dirtyFlags & 0xc9L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.notEnoughInformationAlertEnabled
                        viewModelNotEnoughInformationAlertEnabled = viewModel.getNotEnoughInformationAlertEnabled();
                    }
                    updateRegistration(3, viewModelNotEnoughInformationAlertEnabled);


                    if (viewModelNotEnoughInformationAlertEnabled != null) {
                        // read viewModel.notEnoughInformationAlertEnabled.get()
                        viewModelNotEnoughInformationAlertEnabledGet = viewModelNotEnoughInformationAlertEnabled.get();
                    }
                if((dirtyFlags & 0xc9L) != 0) {
                    if(viewModelNotEnoughInformationAlertEnabledGet) {
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                    }
                }
            }
            if ((dirtyFlags & 0xd1L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.noVerifiedCardAlertEnabled
                        viewModelNoVerifiedCardAlertEnabled = viewModel.getNoVerifiedCardAlertEnabled();
                    }
                    updateRegistration(4, viewModelNoVerifiedCardAlertEnabled);


                    if (viewModelNoVerifiedCardAlertEnabled != null) {
                        // read viewModel.noVerifiedCardAlertEnabled.get()
                        viewModelNoVerifiedCardAlertEnabledGet = viewModelNoVerifiedCardAlertEnabled.get();
                    }
                if((dirtyFlags & 0xd1L) != 0) {
                    if(viewModelNoVerifiedCardAlertEnabledGet) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }
            }
            if ((dirtyFlags & 0xe0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.contractAdditionsLoading
                        viewModelContractAdditionsLoading = viewModel.getContractAdditionsLoading();
                    }
                    updateRegistration(5, viewModelContractAdditionsLoading);


                    if (viewModelContractAdditionsLoading != null) {
                        // read viewModel.contractAdditionsLoading.get()
                        viewModelContractAdditionsLoadingGet = viewModelContractAdditionsLoading.get();
                    }
                if((dirtyFlags & 0xe0L) != 0) {
                    if(viewModelContractAdditionsLoadingGet) {
                            dirtyFlags |= 0x80000000L;
                    }
                    else {
                            dirtyFlags |= 0x40000000L;
                    }
                }


                    // read viewModel.contractAdditionsLoading.get() ? 0 : 1
                    viewModelContractAdditionsLoadingInt0Int1 = ((viewModelContractAdditionsLoadingGet) ? (0) : (1));
            }
        }
        // batch finished

        if ((dirtyFlags & 0x200a8800L) != 0) {

                if (viewModel != null) {
                    // read viewModel.status
                    viewModelStatus = viewModel.getStatus();
                }
                updateRegistration(0, viewModelStatus);


                if (viewModelStatus != null) {
                    // read viewModel.status.get()
                    viewModelStatusGet = viewModelStatus.get();
                }

            if ((dirtyFlags & 0x8800L) != 0) {

                    // read viewModel.status.get() != null
                    viewModelStatusJavaLangObjectNull = (viewModelStatusGet) != (null);
            }
            if ((dirtyFlags & 0x80000L) != 0) {

                    // read viewModel.status.get() instanceof Closed
                    viewModelStatusInstanceofClosed = viewModelStatusGet instanceof ua.mycredit.core.Closed;


                    // read !viewModel.status.get() instanceof Closed
                    ViewModelStatusInstanceofClosed1 = !viewModelStatusInstanceofClosed;
            }
            if ((dirtyFlags & 0x20000L) != 0) {

                    if (viewModelStatusGet != null) {
                        // read (PastDue) viewModel.status.get()
                        pastDueViewModelStatus = ((ua.mycredit.core.PastDue) (viewModelStatusGet));
                    }
            }
            if ((dirtyFlags & 0x20000000L) != 0) {

                    if (viewModelStatusGet != null) {
                        // read (Restructured) viewModel.status.get()
                        restructuredViewModelStatus = ((ua.mycredit.core.Restructured) (viewModelStatusGet));
                    }
            }
        }
        if ((dirtyFlags & 0x800000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.contractAdditionsVisible
                    viewModelContractAdditionsVisible = viewModel.getContractAdditionsVisible();
                }
                updateRegistration(2, viewModelContractAdditionsVisible);


                if (viewModelContractAdditionsVisible != null) {
                    // read viewModel.contractAdditionsVisible.get()
                    viewModelContractAdditionsVisibleGet = viewModelContractAdditionsVisible.get();
                }
        }
        if ((dirtyFlags & 0xc0L) != 0) {

                // read TextUtils.isEmpty(viewModel.profile.name) ? @android:string/name_not_specified : viewModel.profile.name
                textUtilsIsEmptyViewModelProfileNameGreetingAndroidStringNameNotSpecifiedViewModelProfileName = ((textUtilsIsEmptyViewModelProfileName) ? (greeting.getResources().getString(R.string.name_not_specified)) : (viewModelProfileName));


                // read @android:string/greeting_pattern
                greetingAndroidStringGreetingPatternTextUtilsIsEmptyViewModelProfileNameGreetingAndroidStringNameNotSpecifiedViewModelProfileName = greeting.getResources().getString(R.string.greeting_pattern, textUtilsIsEmptyViewModelProfileNameGreetingAndroidStringNameNotSpecifiedViewModelProfileName);
        }
        if ((dirtyFlags & 0x4000000L) != 0) {

                // read viewModel.status.get() instanceof Restructured ? 1 : 2
                viewModelStatusInstanceofRestructuredInt1Int2 = ((viewModelStatusInstanceofRestructured) ? (1) : (2));
        }

        if ((dirtyFlags & 0xd1L) != 0) {

                // read viewModel.noVerifiedCardAlertEnabled.get() ? viewModel.status.get() != null : false
                viewModelNoVerifiedCardAlertEnabledViewModelStatusJavaLangObjectNullBooleanFalse = ((viewModelNoVerifiedCardAlertEnabledGet) ? (viewModelStatusJavaLangObjectNull) : (false));
        }
        if ((dirtyFlags & 0xc9L) != 0) {

                // read viewModel.notEnoughInformationAlertEnabled.get() ? viewModel.status.get() != null : false
                viewModelNotEnoughInformationAlertEnabledViewModelStatusJavaLangObjectNullBooleanFalse = ((viewModelNotEnoughInformationAlertEnabledGet) ? (viewModelStatusJavaLangObjectNull) : (false));
        }
        if ((dirtyFlags & 0xc1L) != 0) {

                // read viewModel.status.get() instanceof PastDue ? (PastDue) viewModel.status.get() : null
                viewModelStatusInstanceofPastDuePastDueViewModelStatusJavaLangObjectNull = ((viewModelStatusInstanceofPastDue) ? (pastDueViewModelStatus) : (null));
                // read viewModel.status.get().credit != null ? !viewModel.status.get() instanceof Closed : false
                viewModelStatusCreditJavaLangObjectNullViewModelStatusInstanceofClosedBooleanFalse = ((viewModelStatusCreditJavaLangObjectNull) ? (ViewModelStatusInstanceofClosed1) : (false));
                // read viewModel.status.get() instanceof PastDue ? 0 : viewModel.status.get() instanceof Restructured ? 1 : 2
                viewModelStatusInstanceofPastDueInt0ViewModelStatusInstanceofRestructuredInt1Int2 = ((viewModelStatusInstanceofPastDue) ? (0) : (viewModelStatusInstanceofRestructuredInt1Int2));
                // read viewModel.status.get() instanceof Restructured ? (Restructured) viewModel.status.get() : null
                viewModelStatusInstanceofRestructuredRestructuredViewModelStatusJavaLangObjectNull = ((viewModelStatusInstanceofRestructured) ? (restructuredViewModelStatus) : (null));
        }
        if ((dirtyFlags & 0xc5L) != 0) {

                // read EntitiesKt.getCanProlong(viewModel.status.get()) ? viewModel.contractAdditionsVisible.get() : false
                entitiesKtGetCanProlongViewModelStatusViewModelContractAdditionsVisibleBooleanFalse = ((entitiesKtGetCanProlongViewModelStatus) ? (viewModelContractAdditionsVisibleGet) : (false));
        }
        // batch finished
        if ((dirtyFlags & 0xc5L) != 0) {
            // api target 1

            this.contractAddition.setVisibility(ua.mycredit.mycredit.ui.BindingAdaptersKt.booleanToVisibility(entitiesKtGetCanProlongViewModelStatusViewModelContractAdditionsVisibleBooleanFalse));
        }
        if ((dirtyFlags & 0xe0L) != 0) {
            // api target 1

            this.contractAddition.setDisplayedChild(viewModelContractAdditionsLoadingInt0Int1);
        }
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            this.creditAction.setOnClickListener(mCallback51);
            ua.mycredit.mycredit.ui.BindingAdaptersKt.setClickableFragment(this.mboundView1, mboundView1.getResources().getString(R.string.alert_not_enough_information), mboundView1.getResources().getString(R.string.profile), getColorFromResource(mboundView1, R.color.red_DB5C60), mCallback49, true, (boolean)false, (boolean)false);
            ua.mycredit.mycredit.ui.BindingAdaptersKt.setClickableFragment(this.mboundView2, mboundView2.getResources().getString(R.string.alert_no_verified_card), mboundView2.getResources().getString(R.string.my_cards), getColorFromResource(mboundView2, R.color.red_DB5C60), mCallback50, true, (boolean)false, (boolean)false);
            this.repayPart.setOnClickListener(mCallback52);
            // api target 21
            if(getBuildSdkInt() >= 21) {

                this.mboundView15.setIndeterminateTintList(android.databinding.adapters.Converters.convertColorToColorStateList(getColorFromResource(mboundView15, R.color.colorPrimaryDark)));
                this.mboundView16.setNestedScrollingEnabled(false);
            }
        }
        if ((dirtyFlags & 0xc1L) != 0) {
            // api target 1

            ua.mycredit.mycredit.ui.BindingAdaptersKt.setCreditStatusActionState(this.creditAction, viewModelStatusGet);
            this.creditParams.setVisibility(ua.mycredit.mycredit.ui.BindingAdaptersKt.booleanToVisibility(ViewModelStatusInstanceofRestructured1));
            this.creditParams.setDisplayedChild(viewModelStatusJavaLangObjectNullInt0Int1);
            ua.mycredit.mycredit.ui.BindingAdaptersKt.setCreditStatusName(this.creditStatusName, viewModelStatusGet);
            this.diagram.setVisibility(viewModelStatusJavaLangObjectNullViewINVISIBLEViewVISIBLE);
            this.diagram.setDisplayedChild(viewModelStatusInstanceofRestructuredInt0Int1);
            this.greeting.setVisibility(ua.mycredit.mycredit.ui.BindingAdaptersKt.booleanToVisibility(viewModelStatusJavaLangObjectNull));
            ua.mycredit.mycredit.ui.BindingAdaptersKt.setArcCreditAmountValue(this.mboundView10, viewModelStatusGet);
            ua.mycredit.mycredit.ui.BindingAdaptersKt.setAdditionalParams(this.mboundView11, viewModelStatusGet);
            this.mboundView17.setStatus(viewModelStatusInstanceofPastDuePastDueViewModelStatusJavaLangObjectNull);
            this.mboundView171.setStatus(viewModelStatusInstanceofRestructuredRestructuredViewModelStatusJavaLangObjectNull);
            this.mboundView172.setCredit(viewModelStatusCredit);
            this.mboundView5.setRestructured(viewModelStatusInstanceofRestructuredRestructuredViewModelStatusJavaLangObjectNull);
            ua.mycredit.mycredit.ui.BindingAdaptersKt.setStatus(this.mboundView6, viewModelStatusGet);
            ua.mycredit.mycredit.ui.BindingAdaptersKt.setTitle(this.mboundView9, viewModelStatusGet);
            this.repayPart.setVisibility(ua.mycredit.mycredit.ui.BindingAdaptersKt.booleanToVisibility(viewModelStatusInstanceofRestructured));
            this.statusDetails.setVisibility(ua.mycredit.mycredit.ui.BindingAdaptersKt.booleanToVisibility(viewModelStatusCreditJavaLangObjectNullViewModelStatusInstanceofClosedBooleanFalse));
            this.statusDetails.setDisplayedChild(viewModelStatusInstanceofPastDueInt0ViewModelStatusInstanceofRestructuredInt1Int2);
        }
        if ((dirtyFlags & 0xc0L) != 0) {
            // api target 1

            this.creditStatusDescription.setViewModel(viewModel);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.greeting, greetingAndroidStringGreetingPatternTextUtilsIsEmptyViewModelProfileNameGreetingAndroidStringNameNotSpecifiedViewModelProfileName);
            this.mboundView16.setAdapter(viewModelCreateContractAdditionsAdapter);
        }
        if ((dirtyFlags & 0xc9L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(ua.mycredit.mycredit.ui.BindingAdaptersKt.booleanToVisibility(viewModelNotEnoughInformationAlertEnabledViewModelStatusJavaLangObjectNullBooleanFalse));
        }
        if ((dirtyFlags & 0xd1L) != 0) {
            // api target 1

            this.mboundView2.setVisibility(ua.mycredit.mycredit.ui.BindingAdaptersKt.booleanToVisibility(viewModelNoVerifiedCardAlertEnabledViewModelStatusJavaLangObjectNullBooleanFalse));
        }
        executeBindingsOn(creditStatusDescription);
        executeBindingsOn(mboundView17);
        executeBindingsOn(mboundView171);
        executeBindingsOn(mboundView172);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // viewModel
                ua.mycredit.mycredit.ui.profile.credit.StatusViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.goToProfile();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewModel
                ua.mycredit.mycredit.ui.profile.credit.StatusViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.repayRestructuredStep();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                ua.mycredit.mycredit.ui.profile.credit.StatusViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.goToCardsList();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                ua.mycredit.mycredit.ui.profile.credit.StatusViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.creditAction();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.status
        flag 1 (0x2L): creditStatusDescription
        flag 2 (0x3L): viewModel.contractAdditionsVisible
        flag 3 (0x4L): viewModel.notEnoughInformationAlertEnabled
        flag 4 (0x5L): viewModel.noVerifiedCardAlertEnabled
        flag 5 (0x6L): viewModel.contractAdditionsLoading
        flag 6 (0x7L): viewModel
        flag 7 (0x8L): null
        flag 8 (0x9L): viewModel.status.get() == null ? 0 : 1
        flag 9 (0xaL): viewModel.status.get() == null ? 0 : 1
        flag 10 (0xbL): viewModel.noVerifiedCardAlertEnabled.get() ? viewModel.status.get() != null : false
        flag 11 (0xcL): viewModel.noVerifiedCardAlertEnabled.get() ? viewModel.status.get() != null : false
        flag 12 (0xdL): viewModel.status.get() instanceof Restructured ? 0 : 1
        flag 13 (0xeL): viewModel.status.get() instanceof Restructured ? 0 : 1
        flag 14 (0xfL): viewModel.notEnoughInformationAlertEnabled.get() ? viewModel.status.get() != null : false
        flag 15 (0x10L): viewModel.notEnoughInformationAlertEnabled.get() ? viewModel.status.get() != null : false
        flag 16 (0x11L): viewModel.status.get() instanceof PastDue ? (PastDue) viewModel.status.get() : null
        flag 17 (0x12L): viewModel.status.get() instanceof PastDue ? (PastDue) viewModel.status.get() : null
        flag 18 (0x13L): viewModel.status.get().credit != null ? !viewModel.status.get() instanceof Closed : false
        flag 19 (0x14L): viewModel.status.get().credit != null ? !viewModel.status.get() instanceof Closed : false
        flag 20 (0x15L): TextUtils.isEmpty(viewModel.profile.name) ? @android:string/name_not_specified : viewModel.profile.name
        flag 21 (0x16L): TextUtils.isEmpty(viewModel.profile.name) ? @android:string/name_not_specified : viewModel.profile.name
        flag 22 (0x17L): EntitiesKt.getCanProlong(viewModel.status.get()) ? viewModel.contractAdditionsVisible.get() : false
        flag 23 (0x18L): EntitiesKt.getCanProlong(viewModel.status.get()) ? viewModel.contractAdditionsVisible.get() : false
        flag 24 (0x19L): viewModel.status.get() instanceof Restructured ? 1 : 2
        flag 25 (0x1aL): viewModel.status.get() instanceof Restructured ? 1 : 2
        flag 26 (0x1bL): viewModel.status.get() instanceof PastDue ? 0 : viewModel.status.get() instanceof Restructured ? 1 : 2
        flag 27 (0x1cL): viewModel.status.get() instanceof PastDue ? 0 : viewModel.status.get() instanceof Restructured ? 1 : 2
        flag 28 (0x1dL): viewModel.status.get() instanceof Restructured ? (Restructured) viewModel.status.get() : null
        flag 29 (0x1eL): viewModel.status.get() instanceof Restructured ? (Restructured) viewModel.status.get() : null
        flag 30 (0x1fL): viewModel.contractAdditionsLoading.get() ? 0 : 1
        flag 31 (0x20L): viewModel.contractAdditionsLoading.get() ? 0 : 1
        flag 32 (0x21L): viewModel.status.get() == null ? View.INVISIBLE : View.VISIBLE
        flag 33 (0x22L): viewModel.status.get() == null ? View.INVISIBLE : View.VISIBLE
    flag mapping end*/
    //end
}