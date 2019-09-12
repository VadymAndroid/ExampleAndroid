package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class StatusDetailsActiveBindingImpl extends StatusDetailsActiveBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.loan_amount, 5);
        sViewsWithIds.put(R.id.view1, 6);
        sViewsWithIds.put(R.id.amount_to_repay, 7);
        sViewsWithIds.put(R.id.creation_date, 8);
        sViewsWithIds.put(R.id.view2, 9);
        sViewsWithIds.put(R.id.until_term_end_left, 10);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public StatusDetailsActiveBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private StatusDetailsActiveBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[4]
            , (android.view.View) bindings[6]
            , (android.view.View) bindings[9]
            );
        this.amountToRepayVal.setTag(null);
        this.creationDateVal.setTag(null);
        this.loanAmountVal.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.untilTermEndLeftVal.setTag(null);
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
        if (BR.credit == variableId) {
            setCredit((ua.mycredit.core.Credit) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCredit(@Nullable ua.mycredit.core.Credit Credit) {
        this.mCredit = Credit;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.credit);
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
        java.lang.String untilTermEndLeftValAndroidPluralsDaysCreditDaysToFinishCreditDaysToFinish = null;
        int creditDaysToFinish = 0;
        double creditOutstandingBalance = 0.0;
        ua.mycredit.core.Credit credit = mCredit;
        java.lang.String loanAmountValAndroidStringSpecificUahFCreditAmount = null;
        double creditAmount = 0.0;
        java.lang.String amountToRepayValAndroidStringSpecificUahFPenniesCreditOutstandingBalance = null;
        org.joda.time.DateTime creditCreationDate = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (credit != null) {
                    // read credit.daysToFinish
                    creditDaysToFinish = credit.getDaysToFinish();
                    // read credit.outstandingBalance
                    creditOutstandingBalance = credit.getOutstandingBalance();
                    // read credit.amount
                    creditAmount = credit.getAmount();
                    // read credit.creationDate
                    creditCreationDate = credit.getCreationDate();
                }


                // read @android:plurals/days
                untilTermEndLeftValAndroidPluralsDaysCreditDaysToFinishCreditDaysToFinish = untilTermEndLeftVal.getResources().getQuantityString(R.plurals.days, creditDaysToFinish, creditDaysToFinish);
                // read @android:plurals/days
                untilTermEndLeftValAndroidPluralsDaysCreditDaysToFinishCreditDaysToFinish = untilTermEndLeftVal.getResources().getQuantityString(R.plurals.days, creditDaysToFinish, creditDaysToFinish);
                // read @android:string/specific_uah_f_pennies
                amountToRepayValAndroidStringSpecificUahFPenniesCreditOutstandingBalance = amountToRepayVal.getResources().getString(R.string.specific_uah_f_pennies, creditOutstandingBalance);
                // read @android:string/specific_uah_f
                loanAmountValAndroidStringSpecificUahFCreditAmount = loanAmountVal.getResources().getString(R.string.specific_uah_f, creditAmount);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.amountToRepayVal, amountToRepayValAndroidStringSpecificUahFPenniesCreditOutstandingBalance);
            ua.mycredit.mycredit.ui.BindingAdaptersKt.setDateTime(this.creationDateVal, creditCreationDate, "M-");
            android.databinding.adapters.TextViewBindingAdapter.setText(this.loanAmountVal, loanAmountValAndroidStringSpecificUahFCreditAmount);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.untilTermEndLeftVal, untilTermEndLeftValAndroidPluralsDaysCreditDaysToFinishCreditDaysToFinish);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): credit
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}