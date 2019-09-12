package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ToolbarBindingImpl extends ToolbarBinding implements ua.mycredit.mycredit.generated.callback.OnClickListener.Listener {

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
    private final android.support.design.widget.AppBarLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback44;
    // values
    // listeners
    private OnMenuItemClickListenerImpl mViewModelOnMenuItemClickAndroidSupportV7WidgetToolbarOnMenuItemClickListener;
    // Inverse Binding Event Handlers

    public ToolbarBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private ToolbarBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.support.v7.widget.Toolbar) bindings[1]
            );
        this.mboundView0 = (android.support.design.widget.AppBarLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.toolbar.setTag(null);
        setRootTag(root);
        // listeners
        mCallback44 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 1);
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
        if (BR.viewModel == variableId) {
            setViewModel((ua.mycredit.mycredit.ui.bases.action.SetupToolbarAction) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ua.mycredit.mycredit.ui.bases.action.SetupToolbarAction ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
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
        android.support.v7.widget.Toolbar.OnMenuItemClickListener viewModelOnMenuItemClickAndroidSupportV7WidgetToolbarOnMenuItemClickListener = null;
        ua.mycredit.mycredit.ui.bases.action.SetupToolbarAction viewModel = mViewModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel::onMenuItemClick
                    viewModelOnMenuItemClickAndroidSupportV7WidgetToolbarOnMenuItemClickListener = (((mViewModelOnMenuItemClickAndroidSupportV7WidgetToolbarOnMenuItemClickListener == null) ? (mViewModelOnMenuItemClickAndroidSupportV7WidgetToolbarOnMenuItemClickListener = new OnMenuItemClickListenerImpl()) : mViewModelOnMenuItemClickAndroidSupportV7WidgetToolbarOnMenuItemClickListener).setValue(viewModel));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.toolbar.setNavigationOnClickListener(mCallback44);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.toolbar.setOnMenuItemClickListener(viewModelOnMenuItemClickAndroidSupportV7WidgetToolbarOnMenuItemClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnMenuItemClickListenerImpl implements android.support.v7.widget.Toolbar.OnMenuItemClickListener{
        private ua.mycredit.mycredit.ui.bases.action.SetupToolbarAction value;
        public OnMenuItemClickListenerImpl setValue(ua.mycredit.mycredit.ui.bases.action.SetupToolbarAction value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public boolean onMenuItemClick(android.view.MenuItem arg0) {
            return this.value.onMenuItemClick(arg0); 
        }
    }
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        ua.mycredit.mycredit.ui.bases.action.SetupToolbarAction viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.onNavigationClick();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}