package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemContractAdditionBindingImpl extends ItemContractAdditionBinding implements ua.mycredit.mycredit.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintLayout, 9);
        sViewsWithIds.put(R.id.textView4, 10);
        sViewsWithIds.put(R.id.textView5, 11);
        sViewsWithIds.put(R.id.textView6, 12);
    }
    // views
    @NonNull
    private final android.widget.ViewSwitcher mboundView0;
    @NonNull
    private final android.widget.Button mboundView1;
    @NonNull
    private final android.support.v7.widget.CardView mboundView2;
    @NonNull
    private final android.widget.LinearLayout mboundView3;
    @NonNull
    private final net.cachapa.expandablelayout.ExpandableLayout mboundView6;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener termsOfContractandroidCheckedAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.agreed.get()
            //         is viewModel.agreed.set((boolean) callbackArg_0)
            boolean callbackArg_0 = termsOfContract.isChecked();
            // localize variables for thread safety
            // viewModel.agreed.get()
            boolean viewModelAgreedGet = false;
            // viewModel.agreed != null
            boolean viewModelAgreedJavaLangObjectNull = false;
            // viewModel
            ua.mycredit.mycredit.ui.profile.credit.StatusViewModel.ContractAdditionsAdapter.ItemViewHolderImpl viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.agreed
            android.databinding.ObservableBoolean viewModelAgreed = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelAgreed = viewModel.getAgreed();

                viewModelAgreedJavaLangObjectNull = (viewModelAgreed) != (null);
                if (viewModelAgreedJavaLangObjectNull) {




                    viewModelAgreed.set(((boolean) (callbackArg_0)));
                }
            }
        }
    };

    public ItemContractAdditionBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ItemContractAdditionBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.Button) bindings[8]
            , (android.support.constraint.ConstraintLayout) bindings[9]
            , (android.widget.CheckBox) bindings[7]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.view.View) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[12]
            );
        this.button2.setTag(null);
        this.mboundView0 = (android.widget.ViewSwitcher) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.Button) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.support.v7.widget.CardView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.LinearLayout) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView6 = (net.cachapa.expandablelayout.ExpandableLayout) bindings[6];
        this.mboundView6.setTag(null);
        this.termsOfContract.setTag(null);
        this.textView.setTag(null);
        this.textView2.setTag(null);
        setRootTag(root);
        // listeners
        mCallback7 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 4);
        mCallback6 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 3);
        mCallback5 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 2);
        mCallback4 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
            setViewModel((ua.mycredit.mycredit.ui.profile.credit.StatusViewModel.ContractAdditionsAdapter.ItemViewHolderImpl) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ua.mycredit.mycredit.ui.profile.credit.StatusViewModel.ContractAdditionsAdapter.ItemViewHolderImpl ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelExpanded((android.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeViewModelItem((android.databinding.ObservableField<ua.mycredit.core.ContractAddition>) object, fieldId);
            case 2 :
                return onChangeViewModelAgreed((android.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelExpanded(android.databinding.ObservableBoolean ViewModelExpanded, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelItem(android.databinding.ObservableField<ua.mycredit.core.ContractAddition> ViewModelItem, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAgreed(android.databinding.ObservableBoolean ViewModelAgreed, int fieldId) {
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
        boolean viewModelAgreedGet = false;
        int viewModelItemDiscount = 0;
        android.databinding.ObservableBoolean viewModelExpanded = null;
        ua.mycredit.core.Prolongation viewModelItemInstanceofProlongationProlongationViewModelItemJavaLangObjectNull = null;
        int viewModelExpandedTextViewAndroidColorWhiteTextViewAndroidColorBlack = 0;
        android.graphics.drawable.Drawable viewModelExpandedMboundView3AndroidDrawableBgGradientPrimaryMboundView3AndroidDrawableWhite = null;
        int viewModelAgreedButton2AndroidColorWhiteButton2AndroidColorDisabled = 0;
        android.databinding.ObservableField<ua.mycredit.core.ContractAddition> viewModelItem = null;
        int contractAdditionsKtGetActionButtonTitleViewModelItem = 0;
        java.lang.String textView2AndroidStringSpecificUahDViewModelItemDiscount = null;
        boolean viewModelItemDiscountInt0 = false;
        int viewModelItemInstanceofProlongationInt0Int1 = 0;
        boolean viewModelExpandedGet = false;
        boolean viewModelItemInstanceofProlongation = false;
        android.databinding.ObservableBoolean viewModelAgreed = null;
        ua.mycredit.core.ContractAddition viewModelItemGet = null;
        ua.mycredit.core.Prolongation prolongationViewModelItem = null;
        ua.mycredit.mycredit.ui.profile.credit.StatusViewModel.ContractAdditionsAdapter.ItemViewHolderImpl viewModel = mViewModel;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.expanded
                        viewModelExpanded = viewModel.getExpanded();
                    }
                    updateRegistration(0, viewModelExpanded);


                    if (viewModelExpanded != null) {
                        // read viewModel.expanded.get()
                        viewModelExpandedGet = viewModelExpanded.get();
                    }
                if((dirtyFlags & 0x19L) != 0) {
                    if(viewModelExpandedGet) {
                            dirtyFlags |= 0x100L;
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                            dirtyFlags |= 0x200L;
                    }
                }


                    // read viewModel.expanded.get() ? @android:color/white : @android:color/black
                    viewModelExpandedTextViewAndroidColorWhiteTextViewAndroidColorBlack = ((viewModelExpandedGet) ? (getColorFromResource(textView, R.color.white)) : (getColorFromResource(textView, R.color.black)));
                    // read viewModel.expanded.get() ? @android:drawable/bg_gradient_primary : @android:drawable/white
                    viewModelExpandedMboundView3AndroidDrawableBgGradientPrimaryMboundView3AndroidDrawableWhite = ((viewModelExpandedGet) ? (getDrawableFromResource(mboundView3, R.drawable.bg_gradient_primary)) : (getDrawableFromResource(mboundView3, R.drawable.white)));
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.item
                        viewModelItem = viewModel.getItem();
                    }
                    updateRegistration(1, viewModelItem);


                    if (viewModelItem != null) {
                        // read viewModel.item.get()
                        viewModelItemGet = viewModelItem.get();
                    }


                    if (viewModelItemGet != null) {
                        // read viewModel.item.get().discount
                        viewModelItemDiscount = viewModelItemGet.getDiscount();
                    }
                    // read ContractAdditionsKt.getActionButtonTitle(viewModel.item.get())
                    contractAdditionsKtGetActionButtonTitleViewModelItem = ua.mycredit.mycredit.mapping.ContractAdditionsKt.getActionButtonTitle(viewModelItemGet);
                    // read viewModel.item.get() instanceof Prolongation
                    viewModelItemInstanceofProlongation = viewModelItemGet instanceof ua.mycredit.core.Prolongation;
                if((dirtyFlags & 0x1aL) != 0) {
                    if(viewModelItemInstanceofProlongation) {
                            dirtyFlags |= 0x40L;
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                            dirtyFlags |= 0x2000L;
                    }
                }


                    // read @android:string/specific_uah_d
                    textView2AndroidStringSpecificUahDViewModelItemDiscount = textView2.getResources().getString(R.string.specific_uah_d, viewModelItemDiscount);
                    // read viewModel.item.get().discount != 0
                    viewModelItemDiscountInt0 = (viewModelItemDiscount) != (0);
                    // read viewModel.item.get() instanceof Prolongation ? 0 : 1
                    viewModelItemInstanceofProlongationInt0Int1 = ((viewModelItemInstanceofProlongation) ? (0) : (1));
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.agreed
                        viewModelAgreed = viewModel.getAgreed();
                    }
                    updateRegistration(2, viewModelAgreed);


                    if (viewModelAgreed != null) {
                        // read viewModel.agreed.get()
                        viewModelAgreedGet = viewModelAgreed.get();
                    }
                if((dirtyFlags & 0x1cL) != 0) {
                    if(viewModelAgreedGet) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }


                    // read viewModel.agreed.get() ? @android:color/white : @android:color/disabled
                    viewModelAgreedButton2AndroidColorWhiteButton2AndroidColorDisabled = ((viewModelAgreedGet) ? (getColorFromResource(button2, R.color.white)) : (getColorFromResource(button2, R.color.disabled)));
            }
        }
        // batch finished

        if ((dirtyFlags & 0x40L) != 0) {

                if (viewModelItemGet != null) {
                    // read (Prolongation) viewModel.item.get()
                    prolongationViewModelItem = ((ua.mycredit.core.Prolongation) (viewModelItemGet));
                }
        }

        if ((dirtyFlags & 0x1aL) != 0) {

                // read viewModel.item.get() instanceof Prolongation ? (Prolongation) viewModel.item.get() : null
                viewModelItemInstanceofProlongationProlongationViewModelItemJavaLangObjectNull = ((viewModelItemInstanceofProlongation) ? (prolongationViewModelItem) : (null));
        }
        // batch finished
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            this.button2.setEnabled(viewModelAgreedGet);
            this.button2.setTextColor(viewModelAgreedButton2AndroidColorWhiteButton2AndroidColorDisabled);
            android.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.termsOfContract, viewModelAgreedGet);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.button2.setOnClickListener(mCallback7);
            this.mboundView1.setOnClickListener(mCallback4);
            this.mboundView2.setOnClickListener(mCallback5);
            ua.mycredit.mycredit.ui.BindingAdaptersKt.setClickableFragment(this.termsOfContract, termsOfContract.getResources().getString(R.string.agree_with_terms_of_contract_plain), termsOfContract.getResources().getString(R.string.agree_with_terms_of_contract_clickable), getColorFromResource(termsOfContract, R.color.white), mCallback6, true, (boolean)false, (boolean)false);
            android.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.termsOfContract, (android.widget.CompoundButton.OnCheckedChangeListener)null, termsOfContractandroidCheckedAttrChanged);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            this.button2.setText(contractAdditionsKtGetActionButtonTitleViewModelItem);
            this.mboundView0.setDisplayedChild(viewModelItemInstanceofProlongationInt0Int1);
            ua.mycredit.mycredit.ui.BindingAdaptersKt.setupByProlongation(this.mboundView1, viewModelItemInstanceofProlongationProlongationViewModelItemJavaLangObjectNull);
            ua.mycredit.mycredit.ui.BindingAdaptersKt.setCreditAdditionTitle(this.textView, viewModelItemGet);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.textView2, textView2AndroidStringSpecificUahDViewModelItemDiscount);
            this.textView2.setVisibility(ua.mycredit.mycredit.ui.BindingAdaptersKt.booleanToVisibility(viewModelItemDiscountInt0));
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView3, viewModelExpandedMboundView3AndroidDrawableBgGradientPrimaryMboundView3AndroidDrawableWhite);
            ua.mycredit.mycredit.ui.BindingAdaptersKt.doSetExpanded(this.mboundView6, viewModelExpandedGet);
            this.textView.setTextColor(viewModelExpandedTextViewAndroidColorWhiteTextViewAndroidColorBlack);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // viewModel
                ua.mycredit.mycredit.ui.profile.credit.StatusViewModel.ContractAdditionsAdapter.ItemViewHolderImpl viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.apply();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                ua.mycredit.mycredit.ui.profile.credit.StatusViewModel.ContractAdditionsAdapter.ItemViewHolderImpl viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.goToRestructuringAgreement();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                ua.mycredit.mycredit.ui.profile.credit.StatusViewModel.ContractAdditionsAdapter.ItemViewHolderImpl viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.expand();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                ua.mycredit.mycredit.ui.profile.credit.StatusViewModel.ContractAdditionsAdapter.ItemViewHolderImpl viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.apply();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.expanded
        flag 1 (0x2L): viewModel.item
        flag 2 (0x3L): viewModel.agreed
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
        flag 5 (0x6L): viewModel.item.get() instanceof Prolongation ? (Prolongation) viewModel.item.get() : null
        flag 6 (0x7L): viewModel.item.get() instanceof Prolongation ? (Prolongation) viewModel.item.get() : null
        flag 7 (0x8L): viewModel.expanded.get() ? @android:color/white : @android:color/black
        flag 8 (0x9L): viewModel.expanded.get() ? @android:color/white : @android:color/black
        flag 9 (0xaL): viewModel.expanded.get() ? @android:drawable/bg_gradient_primary : @android:drawable/white
        flag 10 (0xbL): viewModel.expanded.get() ? @android:drawable/bg_gradient_primary : @android:drawable/white
        flag 11 (0xcL): viewModel.agreed.get() ? @android:color/white : @android:color/disabled
        flag 12 (0xdL): viewModel.agreed.get() ? @android:color/white : @android:color/disabled
        flag 13 (0xeL): viewModel.item.get() instanceof Prolongation ? 0 : 1
        flag 14 (0xfL): viewModel.item.get() instanceof Prolongation ? 0 : 1
    flag mapping end*/
    //end
}