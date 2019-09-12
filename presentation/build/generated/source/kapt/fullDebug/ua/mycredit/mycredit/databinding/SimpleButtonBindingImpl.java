package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SimpleButtonBindingImpl extends SimpleButtonBinding  {

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

    public SimpleButtonBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 1, sIncludes, sViewsWithIds));
    }
    private SimpleButtonBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
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
        if (BR.primary == variableId) {
            setPrimary((boolean) variable);
        }
        else if (BR.text == variableId) {
            setText((java.lang.String) variable);
        }
        else if (BR.onClick == variableId) {
            setOnClick((android.view.View.OnClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPrimary(boolean Primary) {
        this.mPrimary = Primary;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.primary);
        super.requestRebind();
    }
    public void setText(@Nullable java.lang.String Text) {
        this.mText = Text;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.text);
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
        boolean primary = mPrimary;
        android.graphics.drawable.Drawable primaryMboundView0AndroidDrawableBgButtonGradientPrimaryMboundView0AndroidDrawableBgButtonLight = null;
        java.lang.String text = mText;
        int primaryMboundView0AndroidColorWhiteMboundView0AndroidColorGray = 0;
        android.view.View.OnClickListener onClick = mOnClick;

        if ((dirtyFlags & 0x9L) != 0) {

            if((dirtyFlags & 0x9L) != 0) {
                if(primary) {
                        dirtyFlags |= 0x20L;
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                }
            }


                // read primary ? @android:drawable/bg_button_gradient_primary : @android:drawable/bg_button_light
                primaryMboundView0AndroidDrawableBgButtonGradientPrimaryMboundView0AndroidDrawableBgButtonLight = ((primary) ? (getDrawableFromResource(mboundView0, R.drawable.bg_button_gradient_primary)) : (getDrawableFromResource(mboundView0, R.drawable.bg_button_light)));
                // read primary ? @android:color/white : @android:color/gray
                primaryMboundView0AndroidColorWhiteMboundView0AndroidColorGray = ((primary) ? (getColorFromResource(mboundView0, R.color.white)) : (getColorFromResource(mboundView0, R.color.gray)));
        }
        if ((dirtyFlags & 0xaL) != 0) {
        }
        if ((dirtyFlags & 0xcL) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView0, primaryMboundView0AndroidDrawableBgButtonGradientPrimaryMboundView0AndroidDrawableBgButtonLight);
            this.mboundView0.setTextColor(primaryMboundView0AndroidColorWhiteMboundView0AndroidColorGray);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(onClick);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView0, text);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): primary
        flag 1 (0x2L): text
        flag 2 (0x3L): onClick
        flag 3 (0x4L): null
        flag 4 (0x5L): primary ? @android:drawable/bg_button_gradient_primary : @android:drawable/bg_button_light
        flag 5 (0x6L): primary ? @android:drawable/bg_button_gradient_primary : @android:drawable/bg_button_light
        flag 6 (0x7L): primary ? @android:color/white : @android:color/gray
        flag 7 (0x8L): primary ? @android:color/white : @android:color/gray
    flag mapping end*/
    //end
}