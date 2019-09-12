package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemDetailSectionBindingImpl extends ItemDetailSectionBinding  {

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
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemDetailSectionBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ItemDetailSectionBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.isValid == variableId) {
            setIsValid((boolean) variable);
        }
        else if (BR.titleRes == variableId) {
            setTitleRes((int) variable);
        }
        else if (BR.onClick == variableId) {
            setOnClick((android.view.View.OnClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setIsValid(boolean IsValid) {
        this.mIsValid = IsValid;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.isValid);
        super.requestRebind();
    }
    public void setTitleRes(int TitleRes) {
        this.mTitleRes = TitleRes;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.titleRes);
        super.requestRebind();
    }
    public void setOnClick(@Nullable android.view.View.OnClickListener OnClick) {
        this.mOnClick = OnClick;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.onClick);
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
        boolean isValid = false;
        boolean IsValid1 = mIsValid;
        int titleRes = mTitleRes;
        android.view.View.OnClickListener onClick = mOnClick;

        if ((dirtyFlags & 0x9L) != 0) {



                // read !isValid
                isValid = !IsValid1;
        }
        if ((dirtyFlags & 0xaL) != 0) {
        }
        if ((dirtyFlags & 0xcL) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(onClick);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            this.mboundView1.setText(titleRes);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            this.mboundView2.setVisibility(ua.mycredit.mycredit.ui.BindingAdaptersKt.booleanToVisibility(isValid));
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): isValid
        flag 1 (0x2L): titleRes
        flag 2 (0x3L): onClick
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}