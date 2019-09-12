package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class InputVariantPickerBindingImpl extends InputVariantPickerBinding implements ua.mycredit.mycredit.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(2);
        sIncludes.setIncludes(0, 
            new String[] {"input_picker_layout"},
            new int[] {1},
            new int[] {R.layout.input_picker_layout});
        sViewsWithIds = null;
    }
    // views
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputPickerLayoutBinding mboundView0;
    @NonNull
    private final android.widget.FrameLayout mboundView01;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback43;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener mboundView01fadeOutAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.fadeOut.get()
            //         is viewModel.fadeOut.set((ua.mycredit.mycredit.ui.FadeOut) callbackArg_0)
            ua.mycredit.mycredit.ui.FadeOut callbackArg_0 = ua.mycredit.mycredit.ui.BindingAdaptersKt.notifyFadeOutStarted(mboundView01);
            // localize variables for thread safety
            // viewModel.fadeOut
            android.databinding.ObservableField<ua.mycredit.mycredit.ui.FadeOut> viewModelFadeOut = null;
            // viewModel.fadeOut != null
            boolean viewModelFadeOutJavaLangObjectNull = false;
            // viewModel
            ua.mycredit.mycredit.ui.bases.input.PickerDialogViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.fadeOut.get()
            ua.mycredit.mycredit.ui.FadeOut viewModelFadeOutGet = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelFadeOut = viewModel.getFadeOut();

                viewModelFadeOutJavaLangObjectNull = (viewModelFadeOut) != (null);
                if (viewModelFadeOutJavaLangObjectNull) {




                    viewModelFadeOut.set(((ua.mycredit.mycredit.ui.FadeOut) (callbackArg_0)));
                }
            }
        }
    };

    public InputVariantPickerBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private InputVariantPickerBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            );
        this.mboundView0 = (ua.mycredit.mycredit.databinding.InputPickerLayoutBinding) bindings[1];
        setContainedBinding(this.mboundView0);
        this.mboundView01 = (android.widget.FrameLayout) bindings[0];
        this.mboundView01.setTag(null);
        setRootTag(root);
        // listeners
        mCallback43 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
        if (BR.viewModel == variableId) {
            setViewModel((ua.mycredit.mycredit.ui.bases.input.PickerDialogViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ua.mycredit.mycredit.ui.bases.input.PickerDialogViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
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
            case 0 :
                return onChangeViewModelError((android.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeViewModelFadeOut((android.databinding.ObservableField<ua.mycredit.mycredit.ui.FadeOut>) object, fieldId);
            case 2 :
                return onChangeViewModelPickedIndex((android.databinding.ObservableInt) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelError(android.databinding.ObservableBoolean ViewModelError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelFadeOut(android.databinding.ObservableField<ua.mycredit.mycredit.ui.FadeOut> ViewModelFadeOut, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPickedIndex(android.databinding.ObservableInt ViewModelPickedIndex, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        int viewModelHintRes = 0;
        int viewModelTitlesRes = 0;
        android.databinding.ObservableBoolean viewModelError = null;
        ua.mycredit.mycredit.ui.FadeOut viewModelFadeOutGet = null;
        android.databinding.ObservableField<ua.mycredit.mycredit.ui.FadeOut> viewModelFadeOut = null;
        boolean viewModelErrorGet = false;
        int viewModelTitleRes = 0;
        android.databinding.ObservableInt viewModelPickedIndex = null;
        int viewModelPickedIndexGet = 0;
        ua.mycredit.mycredit.ui.bases.input.PickerDialogViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x18L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.hintRes
                        viewModelHintRes = viewModel.getHintRes();
                        // read viewModel.titlesRes
                        viewModelTitlesRes = viewModel.getTitlesRes();
                        // read viewModel.titleRes
                        viewModelTitleRes = viewModel.getTitleRes();
                    }
            }
            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.error
                        viewModelError = viewModel.getError();
                    }
                    updateRegistration(0, viewModelError);


                    if (viewModelError != null) {
                        // read viewModel.error.get()
                        viewModelErrorGet = viewModelError.get();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.fadeOut
                        viewModelFadeOut = viewModel.getFadeOut();
                    }
                    updateRegistration(1, viewModelFadeOut);


                    if (viewModelFadeOut != null) {
                        // read viewModel.fadeOut.get()
                        viewModelFadeOutGet = viewModelFadeOut.get();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.pickedIndex
                        viewModelPickedIndex = viewModel.getPickedIndex();
                    }
                    updateRegistration(2, viewModelPickedIndex);


                    if (viewModelPickedIndex != null) {
                        // read viewModel.pickedIndex.get()
                        viewModelPickedIndexGet = viewModelPickedIndex.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            this.mboundView0.setError(viewModelErrorGet);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            this.mboundView0.setHintRes(viewModelHintRes);
            this.mboundView0.setTitle(viewModelTitleRes);
            this.mboundView0.setTitlesRes(viewModelTitlesRes);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.mboundView0.setOnClick(mCallback43);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            this.mboundView0.setTitleIndex(viewModelPickedIndexGet);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            ua.mycredit.mycredit.ui.BindingAdaptersKt.setFadeOut(this.mboundView01, viewModelFadeOutGet, mboundView01fadeOutAttrChanged);
        }
        executeBindingsOn(mboundView0);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        ua.mycredit.mycredit.ui.bases.input.PickerDialogViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.pick();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.error
        flag 1 (0x2L): viewModel.fadeOut
        flag 2 (0x3L): viewModel.pickedIndex
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}