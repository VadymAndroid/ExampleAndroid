package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentProlongationPreferencesBindingImpl extends FragmentProlongationPreferencesBinding implements ua.mycredit.mycredit.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(6);
        sIncludes.setIncludes(2, 
            new String[] {"descriptions_pane"},
            new int[] {4},
            new int[] {R.layout.descriptions_pane});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.title_final_date_selection, 5);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.Button mboundView1;
    @NonNull
    private final android.widget.FrameLayout mboundView2;
    @Nullable
    private final ua.mycredit.mycredit.databinding.DescriptionsPaneBinding mboundView21;
    @NonNull
    private final android.widget.Button mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback39;
    @Nullable
    private final android.view.View.OnClickListener mCallback38;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentProlongationPreferencesBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentProlongationPreferencesBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.TextView) bindings[5]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.Button) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.FrameLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView21 = (ua.mycredit.mycredit.databinding.DescriptionsPaneBinding) bindings[4];
        setContainedBinding(this.mboundView21);
        this.mboundView3 = (android.widget.Button) bindings[3];
        this.mboundView3.setTag(null);
        setRootTag(root);
        // listeners
        mCallback39 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 2);
        mCallback38 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        mboundView21.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView21.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((ua.mycredit.mycredit.ui.profile.profile.ProlongationPreferencesViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ua.mycredit.mycredit.ui.profile.profile.ProlongationPreferencesViewModel ViewModel) {
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
        mboundView21.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelDate((android.databinding.ObservableField<org.joda.time.LocalDate>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelDate(android.databinding.ObservableField<org.joda.time.LocalDate> ViewModelDate, int fieldId) {
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
        java.lang.String androidStringProlongationBriefDescriptionViewModelStorageProfileName = null;
        java.lang.String mboundView1AndroidStringBeforePatternExtensionsKtPrintByStyleViewModelDateJavaLangStringS = null;
        java.lang.String androidStringProlongationDetailDescriptionExtensionsKtPrintByStyleViewModelDateJavaLangStringS = null;
        ua.mycredit.core.LocalStorage viewModelStorage = null;
        java.lang.String viewModelStorageProfileName = null;
        android.databinding.ObservableField<org.joda.time.LocalDate> viewModelDate = null;
        org.joda.time.LocalDate viewModelDateGet = null;
        java.lang.String extensionsKtPrintByStyleViewModelDateJavaLangStringS = null;
        ua.mycredit.core.Profile viewModelStorageProfile = null;
        ua.mycredit.mycredit.ui.profile.profile.ProlongationPreferencesViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {


            if ((dirtyFlags & 0x6L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.storage
                        viewModelStorage = viewModel.getStorage();
                    }


                    if (viewModelStorage != null) {
                        // read viewModel.storage.profile
                        viewModelStorageProfile = viewModelStorage.getProfile();
                    }


                    if (viewModelStorageProfile != null) {
                        // read viewModel.storage.profile.name
                        viewModelStorageProfileName = viewModelStorageProfile.getName();
                    }


                    // read @android:string/prolongation_brief_description
                    androidStringProlongationBriefDescriptionViewModelStorageProfileName = getRoot().getResources().getString(R.string.prolongation_brief_description, viewModelStorageProfileName);
            }

                if (viewModel != null) {
                    // read viewModel.date
                    viewModelDate = viewModel.getDate();
                }
                updateRegistration(0, viewModelDate);


                if (viewModelDate != null) {
                    // read viewModel.date.get()
                    viewModelDateGet = viewModelDate.get();
                }


                // read ExtensionsKt.printByStyle(viewModel.date.get(), "S-")
                extensionsKtPrintByStyleViewModelDateJavaLangStringS = ua.mycredit.mycredit.ui.ExtensionsKt.printByStyle(viewModelDateGet, "S-");


                // read @android:string/before_pattern
                mboundView1AndroidStringBeforePatternExtensionsKtPrintByStyleViewModelDateJavaLangStringS = mboundView1.getResources().getString(R.string.before_pattern, extensionsKtPrintByStyleViewModelDateJavaLangStringS);
                // read @android:string/prolongation_detail_description
                androidStringProlongationDetailDescriptionExtensionsKtPrintByStyleViewModelDateJavaLangStringS = getRoot().getResources().getString(R.string.prolongation_detail_description, extensionsKtPrintByStyleViewModelDateJavaLangStringS);
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback38);
            this.mboundView3.setOnClickListener(mCallback39);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, mboundView1AndroidStringBeforePatternExtensionsKtPrintByStyleViewModelDateJavaLangStringS);
            this.mboundView21.setDetail(androidStringProlongationDetailDescriptionExtensionsKtPrintByStyleViewModelDateJavaLangStringS);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.mboundView21.setBrief(androidStringProlongationBriefDescriptionViewModelStorageProfileName);
        }
        executeBindingsOn(mboundView21);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewModel
                ua.mycredit.mycredit.ui.profile.profile.ProlongationPreferencesViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.prolong();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                ua.mycredit.mycredit.ui.profile.profile.ProlongationPreferencesViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.pickFinishDay();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.date
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}