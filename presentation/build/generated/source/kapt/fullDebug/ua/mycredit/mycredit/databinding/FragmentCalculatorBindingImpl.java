package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCalculatorBindingImpl extends FragmentCalculatorBinding implements ua.mycredit.mycredit.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(4);
        sIncludes.setIncludes(1, 
            new String[] {"calculator"},
            new int[] {3},
            new int[] {R.layout.calculator});
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.ViewSwitcher mboundView1;
    @Nullable
    private final ua.mycredit.mycredit.databinding.CalculatorBinding mboundView11;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback47;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCalculatorBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentCalculatorBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[2]
            );
        this.action.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.ViewSwitcher) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView11 = (ua.mycredit.mycredit.databinding.CalculatorBinding) bindings[3];
        setContainedBinding(this.mboundView11);
        setRootTag(root);
        // listeners
        mCallback47 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
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
        if (mboundView11.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((ua.mycredit.mycredit.ui.calculator.CalculatorViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ua.mycredit.mycredit.ui.calculator.CalculatorViewModel ViewModel) {
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
        mboundView11.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelLoading((android.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelLoading(android.databinding.ObservableBoolean ViewModelLoading, int fieldId) {
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
        int viewModelLoadingInt1Int0 = 0;
        boolean viewModelLoadingGet = false;
        boolean viewModelLoading = false;
        android.databinding.ObservableBoolean ViewModelLoading1 = null;
        ua.mycredit.mycredit.ui.calculator.CalculatorViewModel.Mode viewModelMode = null;
        int viewModelModeActionText = 0;
        ua.mycredit.mycredit.ui.calculator.CalculatorViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.loading
                    ViewModelLoading1 = viewModel.getLoading();
                }
                updateRegistration(0, ViewModelLoading1);


                if (ViewModelLoading1 != null) {
                    // read viewModel.loading.get()
                    viewModelLoadingGet = ViewModelLoading1.get();
                }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelLoadingGet) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read viewModel.loading.get() ? 1 : 0
                viewModelLoadingInt1Int0 = ((viewModelLoadingGet) ? (1) : (0));
                // read !viewModel.loading.get()
                viewModelLoading = !viewModelLoadingGet;
            if ((dirtyFlags & 0x6L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.mode
                        viewModelMode = viewModel.getMode();
                    }


                    if (viewModelMode != null) {
                        // read viewModel.mode.actionText
                        viewModelModeActionText = viewModelMode.getActionText();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.action.setEnabled(viewModelLoading);
            this.mboundView1.setDisplayedChild(viewModelLoadingInt1Int0);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.action.setOnClickListener(mCallback47);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.action.setText(viewModelModeActionText);
            this.mboundView11.setViewModel(viewModel);
        }
        executeBindingsOn(mboundView11);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        ua.mycredit.mycredit.ui.calculator.CalculatorViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.processAction();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.loading
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
        flag 3 (0x4L): viewModel.loading.get() ? 1 : 0
        flag 4 (0x5L): viewModel.loading.get() ? 1 : 0
    flag mapping end*/
    //end
}