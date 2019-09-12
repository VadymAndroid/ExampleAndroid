package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentTemporarilyUnemployedBindingImpl extends FragmentTemporarilyUnemployedBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(4);
        sIncludes.setIncludes(0, 
            new String[] {"income_fields"},
            new int[] {2},
            new int[] {R.layout.income_fields});
        sIncludes.setIncludes(1, 
            new String[] {"input_variant_picker"},
            new int[] {3},
            new int[] {R.layout.input_variant_picker});
        sViewsWithIds = null;
    }
    // views
    @Nullable
    private final ua.mycredit.mycredit.databinding.IncomeFieldsBinding mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView01;
    @NonNull
    private final android.support.v7.widget.CardView mboundView1;
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputVariantPickerBinding mboundView11;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentTemporarilyUnemployedBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentTemporarilyUnemployedBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            );
        this.mboundView0 = (ua.mycredit.mycredit.databinding.IncomeFieldsBinding) bindings[2];
        setContainedBinding(this.mboundView0);
        this.mboundView01 = (android.widget.LinearLayout) bindings[0];
        this.mboundView01.setTag(null);
        this.mboundView1 = (android.support.v7.widget.CardView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView11 = (ua.mycredit.mycredit.databinding.InputVariantPickerBinding) bindings[3];
        setContainedBinding(this.mboundView11);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        mboundView0.invalidateAll();
        mboundView11.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView0.hasPendingBindings()) {
            return true;
        }
        if (mboundView11.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((ua.mycredit.mycredit.ui.authentication.registration.ocupation.TemporarilyUnemployedViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ua.mycredit.mycredit.ui.authentication.registration.ocupation.TemporarilyUnemployedViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable android.arch.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView0.setLifecycleOwner(lifecycleOwner);
        mboundView11.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        ua.mycredit.mycredit.ui.bases.input.FormViewModel.SimplePickerDialogViewModel<ua.mycredit.core.ReasonDismissal> viewModelDismissalReason = null;
        ua.mycredit.mycredit.ui.authentication.registration.ocupation.TemporarilyUnemployedViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel.dismissalReason
                    viewModelDismissalReason = viewModel.getDismissalReason();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.mboundView0.setViewModel(viewModel);
            this.mboundView11.setViewModel(viewModelDismissalReason);
        }
        executeBindingsOn(mboundView0);
        executeBindingsOn(mboundView11);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}