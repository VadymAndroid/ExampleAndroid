package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListContentBindingImpl extends ListContentBinding  {

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
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListContentBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ListContentBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.support.v7.widget.RecyclerView) bindings[2]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.recyclerView.setTag(null);
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
        if (BR.viewModel == variableId) {
            setViewModel((ua.mycredit.mycredit.ui.bases.ListViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ua.mycredit.mycredit.ui.bases.ListViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelEmptyMessage((android.databinding.ObservableInt) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelEmptyMessage(android.databinding.ObservableInt ViewModelEmptyMessage, int fieldId) {
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
        boolean viewModelNestedScrollingEnabled = false;
        android.databinding.ObservableInt viewModelEmptyMessage = null;
        android.support.v7.widget.RecyclerView.Adapter viewModelRecyclerViewAdapter = null;
        int viewModelEmptyMessageGet = 0;
        ua.mycredit.mycredit.ui.bases.ListViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {


            if ((dirtyFlags & 0x6L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.nestedScrollingEnabled
                        viewModelNestedScrollingEnabled = viewModel.getNestedScrollingEnabled();
                        // read viewModel.recyclerViewAdapter
                        viewModelRecyclerViewAdapter = viewModel.getRecyclerViewAdapter();
                    }
            }

                if (viewModel != null) {
                    // read viewModel.emptyMessage
                    viewModelEmptyMessage = viewModel.getEmptyMessage();
                }
                updateRegistration(0, viewModelEmptyMessage);


                if (viewModelEmptyMessage != null) {
                    // read viewModel.emptyMessage.get()
                    viewModelEmptyMessageGet = viewModelEmptyMessage.get();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            ua.mycredit.mycredit.ui.BindingAdaptersKt.setTextOrGone(this.mboundView1, viewModelEmptyMessageGet);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.recyclerView.setAdapter(viewModelRecyclerViewAdapter);
            // api target 21
            if(getBuildSdkInt() >= 21) {

                this.recyclerView.setNestedScrollingEnabled(viewModelNestedScrollingEnabled);
            }
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.emptyMessage
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}