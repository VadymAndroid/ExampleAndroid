package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class InputPickerLayoutBindingImpl extends InputPickerLayoutBinding  {

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

    public InputPickerLayoutBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private InputPickerLayoutBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
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
                mDirtyFlags = 0x80L;
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
        if (BR.titleIndex == variableId) {
            setTitleIndex((int) variable);
        }
        else if (BR.error == variableId) {
            setError((boolean) variable);
        }
        else if (BR.value == variableId) {
            setValue((java.lang.String) variable);
        }
        else if (BR.title == variableId) {
            setTitle((int) variable);
        }
        else if (BR.hintRes == variableId) {
            setHintRes((int) variable);
        }
        else if (BR.onClick == variableId) {
            setOnClick((android.view.View.OnClickListener) variable);
        }
        else if (BR.titlesRes == variableId) {
            setTitlesRes((int) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTitleIndex(int TitleIndex) {
        this.mTitleIndex = TitleIndex;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.titleIndex);
        super.requestRebind();
    }
    public void setError(boolean Error) {
        this.mError = Error;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.error);
        super.requestRebind();
    }
    public void setValue(@Nullable java.lang.String Value) {
        this.mValue = Value;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.value);
        super.requestRebind();
    }
    public void setTitle(int Title) {
        this.mTitle = Title;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.title);
        super.requestRebind();
    }
    public void setHintRes(int HintRes) {
        this.mHintRes = HintRes;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.hintRes);
        super.requestRebind();
    }
    public void setOnClick(@Nullable android.view.View.OnClickListener OnClick) {
        this.mOnClick = OnClick;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.onClick);
        super.requestRebind();
    }
    public void setTitlesRes(int TitlesRes) {
        this.mTitlesRes = TitlesRes;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.titlesRes);
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
        int titleIndex = mTitleIndex;
        boolean error = mError;
        java.lang.String value = mValue;
        int title = mTitle;
        int hintRes = mHintRes;
        android.view.View.OnClickListener onClick = mOnClick;
        int errorMboundView2AndroidColorRedMboundView2AndroidColorGray8F8F8F = 0;
        int titlesRes = mTitlesRes;

        if ((dirtyFlags & 0xc5L) != 0) {
        }
        if ((dirtyFlags & 0x82L) != 0) {

            if((dirtyFlags & 0x82L) != 0) {
                if(error) {
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x100L;
                }
            }


                // read error ? @android:color/red : @android:color/gray_8F8F8F
                errorMboundView2AndroidColorRedMboundView2AndroidColorGray8F8F8F = ((error) ? (getColorFromResource(mboundView2, R.color.red)) : (getColorFromResource(mboundView2, R.color.gray_8F8F8F)));
        }
        if ((dirtyFlags & 0x88L) != 0) {
        }
        if ((dirtyFlags & 0x90L) != 0) {
        }
        if ((dirtyFlags & 0xa0L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0xa0L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(onClick);
        }
        if ((dirtyFlags & 0x88L) != 0) {
            // api target 1

            this.mboundView1.setText(title);
        }
        if ((dirtyFlags & 0x90L) != 0) {
            // api target 1

            this.mboundView2.setHint(hintRes);
        }
        if ((dirtyFlags & 0x82L) != 0) {
            // api target 1

            this.mboundView2.setHintTextColor(errorMboundView2AndroidColorRedMboundView2AndroidColorGray8F8F8F);
        }
        if ((dirtyFlags & 0xc5L) != 0) {
            // api target 1

            ua.mycredit.mycredit.ui.BindingAdaptersKt.setTitle(this.mboundView2, value, titleIndex, titlesRes);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): titleIndex
        flag 1 (0x2L): error
        flag 2 (0x3L): value
        flag 3 (0x4L): title
        flag 4 (0x5L): hintRes
        flag 5 (0x6L): onClick
        flag 6 (0x7L): titlesRes
        flag 7 (0x8L): null
        flag 8 (0x9L): error ? @android:color/red : @android:color/gray_8F8F8F
        flag 9 (0xaL): error ? @android:color/red : @android:color/gray_8F8F8F
    flag mapping end*/
    //end
}