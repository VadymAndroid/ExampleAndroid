package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemCardBindingImpl extends ItemCardBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(2);
        sIncludes.setIncludes(0, 
            new String[] {"card"},
            new int[] {1},
            new int[] {R.layout.card});
        sViewsWithIds = null;
    }
    // views
    @Nullable
    private final ua.mycredit.mycredit.databinding.CardBinding mboundView0;
    @NonNull
    private final android.widget.FrameLayout mboundView01;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mViewModelShowPopUpMenuAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mViewModelMarkAsSelectedAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ItemCardBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private ItemCardBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            );
        this.mboundView0 = (ua.mycredit.mycredit.databinding.CardBinding) bindings[1];
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
                mDirtyFlags = 0x8L;
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
            setViewModel((ua.mycredit.mycredit.ui.profile.cards.CardsViewModel.AdapterImpl.CardViewHolder) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ua.mycredit.mycredit.ui.profile.cards.CardsViewModel.AdapterImpl.CardViewHolder ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
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
                return onChangeViewModelItem((android.databinding.ObservableField<ua.mycredit.core.Card>) object, fieldId);
            case 1 :
                return onChangeViewModelChecked((android.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelItem(android.databinding.ObservableField<ua.mycredit.core.Card> ViewModelItem, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelChecked(android.databinding.ObservableBoolean ViewModelChecked, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        android.view.View.OnClickListener viewModelModeModePICKERViewModelItemVerifiedBooleanFalseViewModelMarkAsSelectedViewModelShowPopUpMenu = null;
        android.databinding.ObservableField<ua.mycredit.core.Card> viewModelItem = null;
        ua.mycredit.mycredit.ui.profile.cards.CardsViewModel.Mode viewModelMode = null;
        android.databinding.ObservableBoolean viewModelChecked = null;
        android.view.View.OnClickListener viewModelShowPopUpMenuAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener viewModelMarkAsSelectedAndroidViewViewOnClickListener = null;
        boolean viewModelModeModePICKERViewModelItemVerifiedBooleanFalse = false;
        boolean viewModelModeModePICKER = false;
        boolean viewModelItemVerified = false;
        ua.mycredit.core.Card viewModelItemGet = null;
        boolean viewModelCheckedGet = false;
        ua.mycredit.mycredit.ui.profile.cards.CardsViewModel.AdapterImpl.CardViewHolder viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.item
                        viewModelItem = viewModel.getItem();
                        // read viewModel.mode
                        viewModelMode = viewModel.getMode();
                    }
                    updateRegistration(0, viewModelItem);


                    if (viewModelItem != null) {
                        // read viewModel.item.get()
                        viewModelItemGet = viewModelItem.get();
                    }
                    // read viewModel.mode == Mode.PICKER
                    viewModelModeModePICKER = (viewModelMode) == (ua.mycredit.mycredit.ui.profile.cards.CardsViewModel.Mode.PICKER);
                if((dirtyFlags & 0xdL) != 0) {
                    if(viewModelModeModePICKER) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.checked
                        viewModelChecked = viewModel.getChecked();
                    }
                    updateRegistration(1, viewModelChecked);


                    if (viewModelChecked != null) {
                        // read viewModel.checked.get()
                        viewModelCheckedGet = viewModelChecked.get();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x80L) != 0) {

                if (viewModelItemGet != null) {
                    // read viewModel.item.get().verified
                    viewModelItemVerified = viewModelItemGet.getVerified();
                }
        }

        if ((dirtyFlags & 0xdL) != 0) {

                // read viewModel.mode == Mode.PICKER ? viewModel.item.get().verified : false
                viewModelModeModePICKERViewModelItemVerifiedBooleanFalse = ((viewModelModeModePICKER) ? (viewModelItemVerified) : (false));
            if((dirtyFlags & 0xdL) != 0) {
                if(viewModelModeModePICKERViewModelItemVerifiedBooleanFalse) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x10L) != 0) {

                if (viewModel != null) {
                    // read viewModel::showPopUpMenu
                    viewModelShowPopUpMenuAndroidViewViewOnClickListener = (((mViewModelShowPopUpMenuAndroidViewViewOnClickListener == null) ? (mViewModelShowPopUpMenuAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelShowPopUpMenuAndroidViewViewOnClickListener).setValue(viewModel));
                }
        }
        if ((dirtyFlags & 0x20L) != 0) {

                if (viewModel != null) {
                    // read viewModel::markAsSelected
                    viewModelMarkAsSelectedAndroidViewViewOnClickListener = (((mViewModelMarkAsSelectedAndroidViewViewOnClickListener == null) ? (mViewModelMarkAsSelectedAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mViewModelMarkAsSelectedAndroidViewViewOnClickListener).setValue(viewModel));
                }
        }

        if ((dirtyFlags & 0xdL) != 0) {

                // read viewModel.mode == Mode.PICKER ? viewModel.item.get().verified : false ? viewModel::markAsSelected : viewModel::showPopUpMenu
                viewModelModeModePICKERViewModelItemVerifiedBooleanFalseViewModelMarkAsSelectedViewModelShowPopUpMenu = ((viewModelModeModePICKERViewModelItemVerifiedBooleanFalse) ? (viewModelMarkAsSelectedAndroidViewViewOnClickListener) : (viewModelShowPopUpMenuAndroidViewViewOnClickListener));
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.mboundView0.setCard(viewModelItemGet);
            this.mboundView0.setOnClick(viewModelModeModePICKERViewModelItemVerifiedBooleanFalseViewModelMarkAsSelectedViewModelShowPopUpMenu);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            this.mboundView0.setChecked(viewModelCheckedGet);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.mboundView0.setSelectable(viewModelModeModePICKER);
        }
        executeBindingsOn(mboundView0);
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ua.mycredit.mycredit.ui.profile.cards.CardsViewModel.AdapterImpl.CardViewHolder value;
        public OnClickListenerImpl setValue(ua.mycredit.mycredit.ui.profile.cards.CardsViewModel.AdapterImpl.CardViewHolder value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.showPopUpMenu(arg0); 
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private ua.mycredit.mycredit.ui.profile.cards.CardsViewModel.AdapterImpl.CardViewHolder value;
        public OnClickListenerImpl1 setValue(ua.mycredit.mycredit.ui.profile.cards.CardsViewModel.AdapterImpl.CardViewHolder value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.markAsSelected(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.item
        flag 1 (0x2L): viewModel.checked
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): viewModel.mode == Mode.PICKER ? viewModel.item.get().verified : false ? viewModel::markAsSelected : viewModel::showPopUpMenu
        flag 5 (0x6L): viewModel.mode == Mode.PICKER ? viewModel.item.get().verified : false ? viewModel::markAsSelected : viewModel::showPopUpMenu
        flag 6 (0x7L): viewModel.mode == Mode.PICKER ? viewModel.item.get().verified : false
        flag 7 (0x8L): viewModel.mode == Mode.PICKER ? viewModel.item.get().verified : false
    flag mapping end*/
    //end
}