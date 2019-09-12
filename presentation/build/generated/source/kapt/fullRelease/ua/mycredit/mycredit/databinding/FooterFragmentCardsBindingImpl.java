package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FooterFragmentCardsBindingImpl extends FooterFragmentCardsBinding implements ua.mycredit.mycredit.generated.callback.OnClickListener.Listener {

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
    private final android.widget.Button mboundView1;
    @NonNull
    private final android.widget.Button mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FooterFragmentCardsBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FooterFragmentCardsBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.Button) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.Button) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        setRootTag(root);
        // listeners
        mCallback13 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 2);
        mCallback12 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 1);
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
            setViewModel((ua.mycredit.mycredit.ui.profile.cards.CardsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ua.mycredit.mycredit.ui.profile.cards.CardsViewModel ViewModel) {
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
                return onChangeViewModelCheckedCard((android.databinding.ObservableField<ua.mycredit.core.Card>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelCheckedCard(android.databinding.ObservableField<ua.mycredit.core.Card> ViewModelCheckedCard, int fieldId) {
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
        ua.mycredit.mycredit.ui.profile.cards.CardsViewModel.Mode viewModelMode = null;
        android.graphics.drawable.Drawable viewModelCheckedCardJavaLangObjectNullMboundView1AndroidDrawableBgButtonGradientPrimaryMboundView1AndroidDrawableBgGradientDisabled = null;
        boolean viewModelCheckedCardJavaLangObjectNull = false;
        android.databinding.ObservableField<ua.mycredit.core.Card> viewModelCheckedCard = null;
        boolean viewModelModeModePICKER = false;
        ua.mycredit.core.Card viewModelCheckedCardGet = null;
        ua.mycredit.mycredit.ui.profile.cards.CardsViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {


            if ((dirtyFlags & 0x6L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.mode
                        viewModelMode = viewModel.getMode();
                    }


                    // read viewModel.mode == Mode.PICKER
                    viewModelModeModePICKER = (viewModelMode) == (ua.mycredit.mycredit.ui.profile.cards.CardsViewModel.Mode.PICKER);
            }

                if (viewModel != null) {
                    // read viewModel.checkedCard
                    viewModelCheckedCard = viewModel.getCheckedCard();
                }
                updateRegistration(0, viewModelCheckedCard);


                if (viewModelCheckedCard != null) {
                    // read viewModel.checkedCard.get()
                    viewModelCheckedCardGet = viewModelCheckedCard.get();
                }


                // read viewModel.checkedCard.get() != null
                viewModelCheckedCardJavaLangObjectNull = (viewModelCheckedCardGet) != (null);
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelCheckedCardJavaLangObjectNull) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read viewModel.checkedCard.get() != null ? @android:drawable/bg_button_gradient_primary : @android:drawable/bg_gradient_disabled
                viewModelCheckedCardJavaLangObjectNullMboundView1AndroidDrawableBgButtonGradientPrimaryMboundView1AndroidDrawableBgGradientDisabled = ((viewModelCheckedCardJavaLangObjectNull) ? (getDrawableFromResource(mboundView1, R.drawable.bg_button_gradient_primary)) : (getDrawableFromResource(mboundView1, R.drawable.bg_gradient_disabled)));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView1, viewModelCheckedCardJavaLangObjectNullMboundView1AndroidDrawableBgButtonGradientPrimaryMboundView1AndroidDrawableBgGradientDisabled);
            this.mboundView1.setEnabled(viewModelCheckedCardJavaLangObjectNull);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback12);
            this.mboundView2.setOnClickListener(mCallback13);
            ua.mycredit.mycredit.ui.BindingAdaptersKt.setHtmlText(this.mboundView3, mboundView3.getResources().getString(R.string.how_to_verify_card_tutorial));
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(ua.mycredit.mycredit.ui.BindingAdaptersKt.booleanToVisibility(viewModelModeModePICKER));
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewModel
                ua.mycredit.mycredit.ui.profile.cards.CardsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.addCard();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                ua.mycredit.mycredit.ui.profile.cards.CardsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.processSelectionFinished();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.checkedCard
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
        flag 3 (0x4L): viewModel.checkedCard.get() != null ? @android:drawable/bg_button_gradient_primary : @android:drawable/bg_gradient_disabled
        flag 4 (0x5L): viewModel.checkedCard.get() != null ? @android:drawable/bg_button_gradient_primary : @android:drawable/bg_gradient_disabled
    flag mapping end*/
    //end
}