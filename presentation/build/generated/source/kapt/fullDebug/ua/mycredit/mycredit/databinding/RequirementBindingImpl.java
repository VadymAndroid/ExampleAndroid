package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RequirementBindingImpl extends RequirementBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.TextView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RequirementBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 1, sIncludes, sViewsWithIds));
    }
    private RequirementBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            );
        this.mboundView0 = (android.widget.TextView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.title == variableId) {
            setTitle((java.lang.String) variable);
        }
        else if (BR.satisfied == variableId) {
            setSatisfied((boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTitle(@Nullable java.lang.String Title) {
        this.mTitle = Title;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.title);
        super.requestRebind();
    }
    public void setSatisfied(boolean Satisfied) {
        this.mSatisfied = Satisfied;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.satisfied);
        super.requestRebind();
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
        android.graphics.drawable.Drawable satisfiedMboundView0AndroidDrawableIcCheckGreenMboundView0AndroidDrawableIcNotCheckRed = null;
        java.lang.String title = mTitle;
        boolean satisfied = mSatisfied;
        int satisfiedMboundView0AndroidColorGreenMboundView0AndroidColorRed = 0;

        if ((dirtyFlags & 0x5L) != 0) {
        }
        if ((dirtyFlags & 0x6L) != 0) {

            if((dirtyFlags & 0x6L) != 0) {
                if(satisfied) {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x20L;
                }
            }


                // read satisfied ? @android:drawable/ic_check_green : @android:drawable/ic_not_check_red
                satisfiedMboundView0AndroidDrawableIcCheckGreenMboundView0AndroidDrawableIcNotCheckRed = ((satisfied) ? (getDrawableFromResource(mboundView0, R.drawable.ic_check_green)) : (getDrawableFromResource(mboundView0, R.drawable.ic_not_check_red)));
                // read satisfied ? @android:color/green : @android:color/red
                satisfiedMboundView0AndroidColorGreenMboundView0AndroidColorRed = ((satisfied) ? (getColorFromResource(mboundView0, R.color.green)) : (getColorFromResource(mboundView0, R.color.red)));
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setDrawableLeft(this.mboundView0, satisfiedMboundView0AndroidDrawableIcCheckGreenMboundView0AndroidDrawableIcNotCheckRed);
            android.databinding.adapters.TextViewBindingAdapter.setDrawableStart(this.mboundView0, satisfiedMboundView0AndroidDrawableIcCheckGreenMboundView0AndroidDrawableIcNotCheckRed);
            this.mboundView0.setTextColor(satisfiedMboundView0AndroidColorGreenMboundView0AndroidColorRed);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView0, title);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): title
        flag 1 (0x2L): satisfied
        flag 2 (0x3L): null
        flag 3 (0x4L): satisfied ? @android:drawable/ic_check_green : @android:drawable/ic_not_check_red
        flag 4 (0x5L): satisfied ? @android:drawable/ic_check_green : @android:drawable/ic_not_check_red
        flag 5 (0x6L): satisfied ? @android:color/green : @android:color/red
        flag 6 (0x7L): satisfied ? @android:color/green : @android:color/red
    flag mapping end*/
    //end
}