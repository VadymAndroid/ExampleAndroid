package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class PasswordRequirementBindingImpl extends PasswordRequirementBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(2);
        sIncludes.setIncludes(0, 
            new String[] {"requirement"},
            new int[] {1},
            new int[] {R.layout.requirement});
        sViewsWithIds = null;
    }
    // views
    @Nullable
    private final ua.mycredit.mycredit.databinding.RequirementBinding mboundView0;
    @NonNull
    private final android.widget.FrameLayout mboundView01;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public PasswordRequirementBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private PasswordRequirementBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            );
        this.mboundView0 = (ua.mycredit.mycredit.databinding.RequirementBinding) bindings[1];
        setContainedBinding(this.mboundView0);
        this.mboundView01 = (android.widget.FrameLayout) bindings[0];
        this.mboundView01.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        mboundView0.invalidateAll();
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
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.requirements == variableId) {
            setRequirements((int) variable);
        }
        else if (BR.requirement == variableId) {
            setRequirement((ua.mycredit.mycredit.ui.bases.input.PasswordRequirementsViewModel.PasswordRequirement) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setRequirements(int Requirements) {
        this.mRequirements = Requirements;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.requirements);
        super.requestRebind();
    }
    public void setRequirement(@Nullable ua.mycredit.mycredit.ui.bases.input.PasswordRequirementsViewModel.PasswordRequirement Requirement) {
        this.mRequirement = Requirement;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.requirement);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable android.arch.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView0.setLifecycleOwner(lifecycleOwner);
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
        int requirements = mRequirements;
        boolean requirementsInt1RequirementOrdinalInt0 = false;
        java.lang.String androidStringArrayPasswordRequirementsRequirementOrdinal = null;
        int requirementOrdinal = 0;
        int requirementsInt1RequirementOrdinal = 0;
        ua.mycredit.mycredit.ui.bases.input.PasswordRequirementsViewModel.PasswordRequirement requirement = mRequirement;
        int int1RequirementOrdinal = 0;

        if ((dirtyFlags & 0x7L) != 0) {



                if (requirement != null) {
                    // read requirement.ordinal
                    requirementOrdinal = requirement.ordinal();
                }

            if ((dirtyFlags & 0x6L) != 0) {

                    // read @android:stringArray/password_requirements[requirement.ordinal]
                    androidStringArrayPasswordRequirementsRequirementOrdinal = getFromArray(getRoot().getResources().getStringArray(R.array.password_requirements), requirementOrdinal);
            }

                // read 1 << requirement.ordinal
                int1RequirementOrdinal = 1<<requirementOrdinal;


                // read (requirements) & (1 << requirement.ordinal)
                requirementsInt1RequirementOrdinal = (requirements) & (int1RequirementOrdinal);


                // read (requirements) & (1 << requirement.ordinal) != 0
                requirementsInt1RequirementOrdinalInt0 = (requirementsInt1RequirementOrdinal) != (0);
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.mboundView0.setSatisfied(requirementsInt1RequirementOrdinalInt0);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.mboundView0.setTitle(androidStringArrayPasswordRequirementsRequirementOrdinal);
        }
        executeBindingsOn(mboundView0);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): requirements
        flag 1 (0x2L): requirement
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}