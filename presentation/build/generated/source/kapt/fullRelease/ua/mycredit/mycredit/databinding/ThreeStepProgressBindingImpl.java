package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ThreeStepProgressBindingImpl extends ThreeStepProgressBinding  {

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
    private final android.widget.ProgressBar mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ThreeStepProgressBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 1, sIncludes, sViewsWithIds));
    }
    private ThreeStepProgressBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            );
        this.mboundView0 = (android.widget.ProgressBar) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.step == variableId) {
            setStep((int) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setStep(int Step) {
        this.mStep = Step;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.step);
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
        int stepInt1MboundView0AndroidColorRedStepInt2MboundView0AndroidColorOrangeMboundView0AndroidColorGreen = 0;
        int step = mStep;
        boolean stepInt2 = false;
        boolean stepInt1 = false;
        int stepInt2MboundView0AndroidColorOrangeMboundView0AndroidColorGreen = 0;

        if ((dirtyFlags & 0x3L) != 0) {



                // read step == 1
                stepInt1 = (step) == (1);
            if((dirtyFlags & 0x3L) != 0) {
                if(stepInt1) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x4L) != 0) {

                // read step == 2
                stepInt2 = (step) == (2);
            if((dirtyFlags & 0x4L) != 0) {
                if(stepInt2) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                // read step == 2 ? @android:color/orange : @android:color/green
                stepInt2MboundView0AndroidColorOrangeMboundView0AndroidColorGreen = ((stepInt2) ? (getColorFromResource(mboundView0, R.color.orange)) : (getColorFromResource(mboundView0, R.color.green)));
        }

        if ((dirtyFlags & 0x3L) != 0) {

                // read step == 1 ? @android:color/red : step == 2 ? @android:color/orange : @android:color/green
                stepInt1MboundView0AndroidColorRedStepInt2MboundView0AndroidColorOrangeMboundView0AndroidColorGreen = ((stepInt1) ? (getColorFromResource(mboundView0, R.color.red)) : (stepInt2MboundView0AndroidColorOrangeMboundView0AndroidColorGreen));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.mboundView0.setProgress(step);
            // api target 21
            if(getBuildSdkInt() >= 21) {

                this.mboundView0.setProgressTintList(android.databinding.adapters.Converters.convertColorToColorStateList(stepInt1MboundView0AndroidColorRedStepInt2MboundView0AndroidColorOrangeMboundView0AndroidColorGreen));
            }
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): step
        flag 1 (0x2L): null
        flag 2 (0x3L): step == 1 ? @android:color/red : step == 2 ? @android:color/orange : @android:color/green
        flag 3 (0x4L): step == 1 ? @android:color/red : step == 2 ? @android:color/orange : @android:color/green
        flag 4 (0x5L): step == 2 ? @android:color/orange : @android:color/green
        flag 5 (0x6L): step == 2 ? @android:color/orange : @android:color/green
    flag mapping end*/
    //end
}