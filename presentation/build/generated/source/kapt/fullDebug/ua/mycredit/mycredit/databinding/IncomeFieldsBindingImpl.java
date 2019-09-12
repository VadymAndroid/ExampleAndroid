package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class IncomeFieldsBindingImpl extends IncomeFieldsBinding implements ua.mycredit.mycredit.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(10);
        sIncludes.setIncludes(1, 
            new String[] {"input_picker_layout"},
            new int[] {3},
            new int[] {R.layout.input_picker_layout});
        sIncludes.setIncludes(2, 
            new String[] {"input_variant_picker", "input_text_picker", "input_variant_picker", "input_variant_picker", "input_text_picker", "input_text_picker"},
            new int[] {4, 5, 6, 7, 8, 9},
            new int[] {R.layout.input_variant_picker, R.layout.input_text_picker, R.layout.input_variant_picker, R.layout.input_variant_picker, R.layout.input_text_picker, R.layout.input_text_picker});
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputPickerLayoutBinding mboundView11;
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputVariantPickerBinding mboundView21;
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputTextPickerBinding mboundView22;
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputVariantPickerBinding mboundView23;
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputVariantPickerBinding mboundView24;
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputTextPickerBinding mboundView25;
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputTextPickerBinding mboundView26;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback42;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public IncomeFieldsBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private IncomeFieldsBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView11 = (ua.mycredit.mycredit.databinding.InputPickerLayoutBinding) bindings[3];
        setContainedBinding(this.mboundView11);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView21 = (ua.mycredit.mycredit.databinding.InputVariantPickerBinding) bindings[4];
        setContainedBinding(this.mboundView21);
        this.mboundView22 = (ua.mycredit.mycredit.databinding.InputTextPickerBinding) bindings[5];
        setContainedBinding(this.mboundView22);
        this.mboundView23 = (ua.mycredit.mycredit.databinding.InputVariantPickerBinding) bindings[6];
        setContainedBinding(this.mboundView23);
        this.mboundView24 = (ua.mycredit.mycredit.databinding.InputVariantPickerBinding) bindings[7];
        setContainedBinding(this.mboundView24);
        this.mboundView25 = (ua.mycredit.mycredit.databinding.InputTextPickerBinding) bindings[8];
        setContainedBinding(this.mboundView25);
        this.mboundView26 = (ua.mycredit.mycredit.databinding.InputTextPickerBinding) bindings[9];
        setContainedBinding(this.mboundView26);
        setRootTag(root);
        // listeners
        mCallback42 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        mboundView11.invalidateAll();
        mboundView21.invalidateAll();
        mboundView22.invalidateAll();
        mboundView23.invalidateAll();
        mboundView24.invalidateAll();
        mboundView25.invalidateAll();
        mboundView26.invalidateAll();
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
        if (mboundView21.hasPendingBindings()) {
            return true;
        }
        if (mboundView22.hasPendingBindings()) {
            return true;
        }
        if (mboundView23.hasPendingBindings()) {
            return true;
        }
        if (mboundView24.hasPendingBindings()) {
            return true;
        }
        if (mboundView25.hasPendingBindings()) {
            return true;
        }
        if (mboundView26.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((ua.mycredit.mycredit.ui.authentication.registration.ocupation.OccupationTypeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ua.mycredit.mycredit.ui.authentication.registration.ocupation.OccupationTypeViewModel ViewModel) {
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
        mboundView11.setLifecycleOwner(lifecycleOwner);
        mboundView21.setLifecycleOwner(lifecycleOwner);
        mboundView22.setLifecycleOwner(lifecycleOwner);
        mboundView23.setLifecycleOwner(lifecycleOwner);
        mboundView24.setLifecycleOwner(lifecycleOwner);
        mboundView25.setLifecycleOwner(lifecycleOwner);
        mboundView26.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelParamsRequirements((android.databinding.ObservableField<ua.mycredit.core.ParamsRequirements>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelParamsRequirements(android.databinding.ObservableField<ua.mycredit.core.ParamsRequirements> ViewModelParamsRequirements, int fieldId) {
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
        ua.mycredit.mycredit.ui.authentication.registration.ocupation.OccupationTypeViewModel.IncomeSourceViewModel viewModelIncomeMainSource = null;
        int viewModelTitlesRes = 0;
        boolean viewModelParamsRequirementsWithActivity = false;
        ua.mycredit.core.ParamsRequirements viewModelParamsRequirementsGet = null;
        ua.mycredit.mycredit.ui.bases.input.FormViewModel.SimplePickerDialogViewModel<ua.mycredit.core.Position> viewModelPosition = null;
        int viewModelParamsRequirementsWithCompanyViewVISIBLEViewGONE = 0;
        ua.mycredit.mycredit.ui.bases.input.FormViewModel.SimplePickerDialogViewModel<ua.mycredit.core.ActivityKind> viewModelActivityKind = null;
        ua.mycredit.mycredit.ui.bases.input.FormViewModel.BaseInputDialogViewModel viewModelMonthlyIncome = null;
        boolean viewModelParamsRequirementsWithMonthlyIncome = false;
        ua.mycredit.mycredit.ui.bases.input.FormViewModel.BaseInputDialogViewModel viewModelWorkPhone = null;
        int viewModelParamsRequirementsWithMonthlyIncomeViewVISIBLEViewGONE = 0;
        int viewModelTitleIndex = 0;
        boolean viewModelParamsRequirementsWithCompany = false;
        ua.mycredit.mycredit.ui.bases.input.FormViewModel.BaseInputDialogViewModel viewModelCompanyName = null;
        int viewModelParamsRequirementsWithActivityViewVISIBLEViewGONE = 0;
        android.databinding.ObservableField<ua.mycredit.core.ParamsRequirements> viewModelParamsRequirements = null;
        ua.mycredit.mycredit.ui.authentication.registration.ocupation.OccupationTypeViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {


            if ((dirtyFlags & 0x6L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.incomeMainSource
                        viewModelIncomeMainSource = viewModel.getIncomeMainSource();
                        // read viewModel.titlesRes
                        viewModelTitlesRes = viewModel.getTitlesRes();
                        // read viewModel.position
                        viewModelPosition = viewModel.getPosition();
                        // read viewModel.activityKind
                        viewModelActivityKind = viewModel.getActivityKind();
                        // read viewModel.monthlyIncome
                        viewModelMonthlyIncome = viewModel.getMonthlyIncome();
                        // read viewModel.workPhone
                        viewModelWorkPhone = viewModel.getWorkPhone();
                        // read viewModel.titleIndex
                        viewModelTitleIndex = viewModel.getTitleIndex();
                        // read viewModel.companyName
                        viewModelCompanyName = viewModel.getCompanyName();
                    }
            }

                if (viewModel != null) {
                    // read viewModel.paramsRequirements
                    viewModelParamsRequirements = viewModel.getParamsRequirements();
                }
                updateRegistration(0, viewModelParamsRequirements);


                if (viewModelParamsRequirements != null) {
                    // read viewModel.paramsRequirements.get()
                    viewModelParamsRequirementsGet = viewModelParamsRequirements.get();
                }


                if (viewModelParamsRequirementsGet != null) {
                    // read viewModel.paramsRequirements.get().withActivity
                    viewModelParamsRequirementsWithActivity = viewModelParamsRequirementsGet.getWithActivity();
                    // read viewModel.paramsRequirements.get().withMonthlyIncome
                    viewModelParamsRequirementsWithMonthlyIncome = viewModelParamsRequirementsGet.getWithMonthlyIncome();
                    // read viewModel.paramsRequirements.get().withCompany
                    viewModelParamsRequirementsWithCompany = viewModelParamsRequirementsGet.getWithCompany();
                }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelParamsRequirementsWithActivity) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelParamsRequirementsWithMonthlyIncome) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelParamsRequirementsWithCompany) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read viewModel.paramsRequirements.get().withActivity ? View.VISIBLE : View.GONE
                viewModelParamsRequirementsWithActivityViewVISIBLEViewGONE = ((viewModelParamsRequirementsWithActivity) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read viewModel.paramsRequirements.get().withMonthlyIncome ? View.VISIBLE : View.GONE
                viewModelParamsRequirementsWithMonthlyIncomeViewVISIBLEViewGONE = ((viewModelParamsRequirementsWithMonthlyIncome) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read viewModel.paramsRequirements.get().withCompany ? View.VISIBLE : View.GONE
                viewModelParamsRequirementsWithCompanyViewVISIBLEViewGONE = ((viewModelParamsRequirementsWithCompany) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView11.setHintRes(ua.mycredit.mycredit.R.string.hint_select);
            this.mboundView11.setOnClick(mCallback42);
            this.mboundView11.setTitle(ua.mycredit.mycredit.R.string.occupation_type);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.mboundView11.setTitleIndex(viewModelTitleIndex);
            this.mboundView11.setTitlesRes(viewModelTitlesRes);
            this.mboundView21.setViewModel(viewModelIncomeMainSource);
            this.mboundView22.setViewModel(viewModelCompanyName);
            this.mboundView23.setViewModel(viewModelActivityKind);
            this.mboundView24.setViewModel(viewModelPosition);
            this.mboundView25.setViewModel(viewModelWorkPhone);
            this.mboundView26.setViewModel(viewModelMonthlyIncome);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.mboundView22.getRoot().setVisibility(viewModelParamsRequirementsWithCompanyViewVISIBLEViewGONE);
            this.mboundView23.getRoot().setVisibility(viewModelParamsRequirementsWithActivityViewVISIBLEViewGONE);
            this.mboundView24.getRoot().setVisibility(viewModelParamsRequirementsWithCompanyViewVISIBLEViewGONE);
            this.mboundView25.getRoot().setVisibility(viewModelParamsRequirementsWithCompanyViewVISIBLEViewGONE);
            this.mboundView26.getRoot().setVisibility(viewModelParamsRequirementsWithMonthlyIncomeViewVISIBLEViewGONE);
        }
        executeBindingsOn(mboundView11);
        executeBindingsOn(mboundView21);
        executeBindingsOn(mboundView22);
        executeBindingsOn(mboundView23);
        executeBindingsOn(mboundView24);
        executeBindingsOn(mboundView25);
        executeBindingsOn(mboundView26);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        ua.mycredit.mycredit.ui.authentication.registration.ocupation.OccupationTypeViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.changeOccupationType();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.paramsRequirements
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
        flag 3 (0x4L): viewModel.paramsRequirements.get().withCompany ? View.VISIBLE : View.GONE
        flag 4 (0x5L): viewModel.paramsRequirements.get().withCompany ? View.VISIBLE : View.GONE
        flag 5 (0x6L): viewModel.paramsRequirements.get().withMonthlyIncome ? View.VISIBLE : View.GONE
        flag 6 (0x7L): viewModel.paramsRequirements.get().withMonthlyIncome ? View.VISIBLE : View.GONE
        flag 7 (0x8L): viewModel.paramsRequirements.get().withActivity ? View.VISIBLE : View.GONE
        flag 8 (0x9L): viewModel.paramsRequirements.get().withActivity ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}