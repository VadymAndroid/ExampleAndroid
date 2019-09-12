package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRepayByCardBindingImpl extends FragmentRepayByCardBinding implements ua.mycredit.mycredit.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(17);
        sIncludes.setIncludes(5, 
            new String[] {"card"},
            new int[] {7},
            new int[] {R.layout.card});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.company, 8);
        sViewsWithIds.put(R.id.myCredit, 9);
        sViewsWithIds.put(R.id.smallDivider, 10);
        sViewsWithIds.put(R.id.numberOfApply, 11);
        sViewsWithIds.put(R.id.payout_point, 12);
        sViewsWithIds.put(R.id.divider, 13);
        sViewsWithIds.put(R.id.payoutBlockBackground, 14);
        sViewsWithIds.put(R.id.sum_to_pay, 15);
        sViewsWithIds.put(R.id.card, 16);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView4;
    @Nullable
    private final ua.mycredit.mycredit.databinding.CardBinding mboundView5;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback59;
    @Nullable
    private final android.view.View.OnClickListener mCallback58;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentRepayByCardBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private FragmentRepayByCardBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[8]
            , (android.view.View) bindings[13]
            , (android.widget.TextView) bindings[3]
            , (android.widget.ViewSwitcher) bindings[5]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[11]
            , (android.view.View) bindings[14]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[1]
            , (android.view.View) bindings[10]
            , (android.widget.TextView) bindings[15]
            );
        this.changeCard.setTag(null);
        this.editText.setTag(null);
        this.itemCard.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (ua.mycredit.mycredit.databinding.CardBinding) bindings[7];
        setContainedBinding(this.mboundView5);
        this.payoutLoanWithDate.setTag(null);
        this.publicId.setTag(null);
        setRootTag(root);
        // listeners
        mCallback59 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 2);
        mCallback58 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        mboundView5.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView5.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((ua.mycredit.mycredit.ui.profile.repayloan.RepayByCardViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ua.mycredit.mycredit.ui.profile.repayloan.RepayByCardViewModel ViewModel) {
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
        mboundView5.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelCard((android.databinding.ObservableField<ua.mycredit.core.Card>) object, fieldId);
            case 1 :
                return onChangeViewModelAmount((android.databinding.ObservableDouble) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelCard(android.databinding.ObservableField<ua.mycredit.core.Card> ViewModelCard, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAmount(android.databinding.ObservableDouble ViewModelAmount, int fieldId) {
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
        ua.mycredit.core.Card viewModelCardGet = null;
        java.lang.String viewModelCardJavaLangObjectNullChangeCardAndroidStringGoToCardListChangeCardAndroidStringPayWithAnotherCard = null;
        java.lang.String mboundView4AndroidStringSpecificUahFPenniesViewModelCreditCurrentDebt = null;
        double viewModelCreditCurrentDebt = 0.0;
        boolean viewModelCardJavaLangObjectNull = false;
        java.lang.String editTextAndroidStringSpecificUahFPenniesViewModelAmount = null;
        ua.mycredit.core.Credit viewModelCredit = null;
        double viewModelAmountGet = 0.0;
        ua.mycredit.mycredit.ui.profile.repayloan.RepaymentType viewModelRepaymentType = null;
        android.databinding.ObservableField<ua.mycredit.core.Card> viewModelCard = null;
        int viewModelCardJavaLangObjectNullInt0Int1 = 0;
        android.databinding.ObservableDouble viewModelAmount = null;
        java.lang.String viewModelCreditPublicId = null;
        ua.mycredit.mycredit.ui.profile.repayloan.RepayByCardViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xcL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.credit
                        viewModelCredit = viewModel.getCredit();
                        // read viewModel.repaymentType
                        viewModelRepaymentType = viewModel.getRepaymentType();
                    }


                    if (viewModelCredit != null) {
                        // read viewModel.credit.currentDebt
                        viewModelCreditCurrentDebt = viewModelCredit.getCurrentDebt();
                        // read viewModel.credit.publicId
                        viewModelCreditPublicId = viewModelCredit.getPublicId();
                    }


                    // read @android:string/specific_uah_f_pennies
                    mboundView4AndroidStringSpecificUahFPenniesViewModelCreditCurrentDebt = mboundView4.getResources().getString(R.string.specific_uah_f_pennies, viewModelCreditCurrentDebt);
            }
            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.card
                        viewModelCard = viewModel.getCard();
                    }
                    updateRegistration(0, viewModelCard);


                    if (viewModelCard != null) {
                        // read viewModel.card.get()
                        viewModelCardGet = viewModelCard.get();
                    }


                    // read viewModel.card.get() == null
                    viewModelCardJavaLangObjectNull = (viewModelCardGet) == (null);
                if((dirtyFlags & 0xdL) != 0) {
                    if(viewModelCardJavaLangObjectNull) {
                            dirtyFlags |= 0x20L;
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read viewModel.card.get() == null ? @android:string/go_to_card_list : @android:string/pay_with_another_card
                    viewModelCardJavaLangObjectNullChangeCardAndroidStringGoToCardListChangeCardAndroidStringPayWithAnotherCard = ((viewModelCardJavaLangObjectNull) ? (changeCard.getResources().getString(R.string.go_to_card_list)) : (changeCard.getResources().getString(R.string.pay_with_another_card)));
                    // read viewModel.card.get() == null ? 0 : 1
                    viewModelCardJavaLangObjectNullInt0Int1 = ((viewModelCardJavaLangObjectNull) ? (0) : (1));
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.amount
                        viewModelAmount = viewModel.getAmount();
                    }
                    updateRegistration(1, viewModelAmount);


                    if (viewModelAmount != null) {
                        // read viewModel.amount.get()
                        viewModelAmountGet = viewModelAmount.get();
                    }


                    // read @android:string/specific_uah_f_pennies
                    editTextAndroidStringSpecificUahFPenniesViewModelAmount = editText.getResources().getString(R.string.specific_uah_f_pennies, viewModelAmountGet);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.changeCard.setOnClickListener(mCallback59);
            this.editText.setOnClickListener(mCallback58);
            this.mboundView5.setForciblyColored(true);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            ua.mycredit.mycredit.ui.BindingAdaptersKt.setUnderlineText(this.changeCard, viewModelCardJavaLangObjectNullChangeCardAndroidStringGoToCardListChangeCardAndroidStringPayWithAnotherCard);
            this.itemCard.setDisplayedChild(viewModelCardJavaLangObjectNullInt0Int1);
            this.mboundView5.setCard(viewModelCardGet);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.editText, editTextAndroidStringSpecificUahFPenniesViewModelAmount);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            ua.mycredit.mycredit.ui.BindingAdaptersKt.setClickableFragment(this.mboundView4, mboundView4.getResources().getString(R.string.full_repayment_amount), mboundView4AndroidStringSpecificUahFPenniesViewModelCreditCurrentDebt, getColorFromResource(mboundView4, R.color.blue_1480CB), (android.view.View.OnClickListener)null, (boolean)false, (boolean)false, (boolean)false);
            ua.mycredit.mycredit.ui.BindingAdaptersKt.setPaymentPurpose(this.payoutLoanWithDate, viewModelCredit, viewModelRepaymentType);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.publicId, viewModelCreditPublicId);
        }
        executeBindingsOn(mboundView5);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewModel
                ua.mycredit.mycredit.ui.profile.repayloan.RepayByCardViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.goToCardsList();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                ua.mycredit.mycredit.ui.profile.repayloan.RepayByCardViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.changeAmount();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.card
        flag 1 (0x2L): viewModel.amount
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): viewModel.card.get() == null ? @android:string/go_to_card_list : @android:string/pay_with_another_card
        flag 5 (0x6L): viewModel.card.get() == null ? @android:string/go_to_card_list : @android:string/pay_with_another_card
        flag 6 (0x7L): viewModel.card.get() == null ? 0 : 1
        flag 7 (0x8L): viewModel.card.get() == null ? 0 : 1
    flag mapping end*/
    //end
}