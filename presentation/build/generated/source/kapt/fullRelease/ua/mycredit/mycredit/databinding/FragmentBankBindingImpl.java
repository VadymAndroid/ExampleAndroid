package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentBankBindingImpl extends FragmentBankBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.topBankText, 3);
        sViewsWithIds.put(R.id.topDivider, 4);
        sViewsWithIds.put(R.id.payoutBlockBackground, 5);
        sViewsWithIds.put(R.id.receiver, 6);
        sViewsWithIds.put(R.id.receiverFullName, 7);
        sViewsWithIds.put(R.id.ergpou, 8);
        sViewsWithIds.put(R.id.ergpouNumber, 9);
        sViewsWithIds.put(R.id.smallDivider, 10);
        sViewsWithIds.put(R.id.bank, 11);
        sViewsWithIds.put(R.id.mfo, 12);
        sViewsWithIds.put(R.id.mfoNumber, 13);
        sViewsWithIds.put(R.id.secondSmallDivider, 14);
        sViewsWithIds.put(R.id.count, 15);
        sViewsWithIds.put(R.id.countNumber, 16);
        sViewsWithIds.put(R.id.payoutPoint, 17);
        sViewsWithIds.put(R.id.sum, 18);
        sViewsWithIds.put(R.id.bottomDivider, 19);
        sViewsWithIds.put(R.id.textWithBank, 20);
        sViewsWithIds.put(R.id.firstColumn, 21);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentBankBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 22, sIncludes, sViewsWithIds));
    }
    private FragmentBankBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.TextView) bindings[11]
            , (android.view.View) bindings[19]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.LinearLayout) bindings[21]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[13]
            , (android.view.View) bindings[5]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.view.View) bindings[14]
            , (android.view.View) bindings[10]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[3]
            , (android.view.View) bindings[4]
            );
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.payoutPointText.setTag(null);
        this.sumText.setTag(null);
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
            setViewModel((ua.mycredit.mycredit.ui.profile.repayloan.BankFragmentViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ua.mycredit.mycredit.ui.profile.repayloan.BankFragmentViewModel ViewModel) {
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
                return onChangeViewModelRepaymentType((android.databinding.ObservableField<ua.mycredit.mycredit.ui.profile.repayloan.RepaymentType>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelRepaymentType(android.databinding.ObservableField<ua.mycredit.mycredit.ui.profile.repayloan.RepaymentType> ViewModelRepaymentType, int fieldId) {
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
        ua.mycredit.mycredit.ui.profile.repayloan.RepaymentType viewModelRepaymentTypeGet = null;
        double viewModelRepaymentTypeAmount = 0.0;
        int viewModelRepaymentTypeTitle = 0;
        android.databinding.ObservableField<ua.mycredit.mycredit.ui.profile.repayloan.RepaymentType> viewModelRepaymentType = null;
        java.lang.String sumTextAndroidStringRepaymentLessThanPatternViewModelRepaymentTypeAmount = null;
        ua.mycredit.mycredit.ui.profile.repayloan.BankFragmentViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.repaymentType
                    viewModelRepaymentType = viewModel.getRepaymentType();
                }
                updateRegistration(0, viewModelRepaymentType);


                if (viewModelRepaymentType != null) {
                    // read viewModel.repaymentType.get()
                    viewModelRepaymentTypeGet = viewModelRepaymentType.get();
                }


                if (viewModelRepaymentTypeGet != null) {
                    // read viewModel.repaymentType.get().amount
                    viewModelRepaymentTypeAmount = viewModelRepaymentTypeGet.getAmount();
                    // read viewModel.repaymentType.get().title
                    viewModelRepaymentTypeTitle = viewModelRepaymentTypeGet.getTitle();
                }


                // read @android:string/repayment_less_than_pattern
                sumTextAndroidStringRepaymentLessThanPatternViewModelRepaymentTypeAmount = sumText.getResources().getString(R.string.repayment_less_than_pattern, viewModelRepaymentTypeAmount);
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.payoutPointText.setText(viewModelRepaymentTypeTitle);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.sumText, sumTextAndroidStringRepaymentLessThanPatternViewModelRepaymentTypeAmount);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.repaymentType
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}