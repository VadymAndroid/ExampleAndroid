package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class StatusDetailsPastDueBindingImpl extends StatusDetailsPastDueBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.past_due, 9);
        sViewsWithIds.put(R.id.view1, 10);
        sViewsWithIds.put(R.id.if_repay_tomorrow, 11);
        sViewsWithIds.put(R.id.credit_date, 12);
        sViewsWithIds.put(R.id.view2, 13);
        sViewsWithIds.put(R.id.term, 14);
        sViewsWithIds.put(R.id.view3, 15);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public StatusDetailsPastDueBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private StatusDetailsPastDueBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[6]
            , (android.view.View) bindings[10]
            , (android.view.View) bindings[13]
            , (android.view.View) bindings[15]
            );
        this.creditDateVal.setTag(null);
        this.ifRepayAfter.setTag(null);
        this.ifRepayAfter2.setTag(null);
        this.ifRepayAfter2Val.setTag(null);
        this.ifRepayAfterVal.setTag(null);
        this.ifRepayTomorrowVal.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.pastDueVal.setTag(null);
        this.termVal.setTag(null);
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
        if (BR.status == variableId) {
            setStatus((ua.mycredit.core.PastDue) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setStatus(@Nullable ua.mycredit.core.PastDue Status) {
        this.mStatus = Status;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.status);
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
        ua.mycredit.core.PastDue status = mStatus;
        double statusPotentialDebtsTomorrow = 0.0;
        int statusCreditPastDueDays = 0;
        java.lang.String ifRepayAfterValAndroidStringSpecificUahFStatusPotentialDebtsInWeek = null;
        double statusPotentialDebtsInWeek = 0.0;
        java.lang.String termValAndroidPluralsDaysStatusCreditTermOriginalStatusCreditTermOriginal = null;
        java.lang.String pastDueValAndroidPluralsDaysStatusCreditPastDueDaysStatusCreditPastDueDays = null;
        double statusPotentialDebtsInTwoWeek = 0.0;
        java.lang.String ifRepayAfter2ValAndroidStringSpecificUahFStatusPotentialDebtsInTwoWeek = null;
        ua.mycredit.core.Credit statusCredit = null;
        org.joda.time.DateTime statusCreditCreationDate = null;
        ua.mycredit.core.PastDue.PotentialDebts statusPotentialDebts = null;
        java.lang.String ifRepayTomorrowValAndroidStringSpecificUahFStatusPotentialDebtsTomorrow = null;
        int statusCreditTermOriginal = 0;

        if ((dirtyFlags & 0x3L) != 0) {



                if (status != null) {
                    // read status.credit
                    statusCredit = status.getCredit();
                    // read status.potentialDebts
                    statusPotentialDebts = status.getPotentialDebts();
                }


                if (statusCredit != null) {
                    // read status.credit.pastDueDays
                    statusCreditPastDueDays = statusCredit.getPastDueDays();
                    // read status.credit.creationDate
                    statusCreditCreationDate = statusCredit.getCreationDate();
                    // read status.credit.termOriginal
                    statusCreditTermOriginal = statusCredit.getTermOriginal();
                }
                if (statusPotentialDebts != null) {
                    // read status.potentialDebts.tomorrow
                    statusPotentialDebtsTomorrow = statusPotentialDebts.getTomorrow();
                    // read status.potentialDebts.inWeek
                    statusPotentialDebtsInWeek = statusPotentialDebts.getInWeek();
                    // read status.potentialDebts.inTwoWeek
                    statusPotentialDebtsInTwoWeek = statusPotentialDebts.getInTwoWeek();
                }


                // read @android:plurals/days
                pastDueValAndroidPluralsDaysStatusCreditPastDueDaysStatusCreditPastDueDays = pastDueVal.getResources().getQuantityString(R.plurals.days, statusCreditPastDueDays, statusCreditPastDueDays);
                // read @android:plurals/days
                pastDueValAndroidPluralsDaysStatusCreditPastDueDaysStatusCreditPastDueDays = pastDueVal.getResources().getQuantityString(R.plurals.days, statusCreditPastDueDays, statusCreditPastDueDays);
                // read @android:plurals/days
                termValAndroidPluralsDaysStatusCreditTermOriginalStatusCreditTermOriginal = termVal.getResources().getQuantityString(R.plurals.days, statusCreditTermOriginal, statusCreditTermOriginal);
                // read @android:plurals/days
                termValAndroidPluralsDaysStatusCreditTermOriginalStatusCreditTermOriginal = termVal.getResources().getQuantityString(R.plurals.days, statusCreditTermOriginal, statusCreditTermOriginal);
                // read @android:string/specific_uah_f
                ifRepayTomorrowValAndroidStringSpecificUahFStatusPotentialDebtsTomorrow = ifRepayTomorrowVal.getResources().getString(R.string.specific_uah_f, statusPotentialDebtsTomorrow);
                // read @android:string/specific_uah_f
                ifRepayAfterValAndroidStringSpecificUahFStatusPotentialDebtsInWeek = ifRepayAfterVal.getResources().getString(R.string.specific_uah_f, statusPotentialDebtsInWeek);
                // read @android:string/specific_uah_f
                ifRepayAfter2ValAndroidStringSpecificUahFStatusPotentialDebtsInTwoWeek = ifRepayAfter2Val.getResources().getString(R.string.specific_uah_f, statusPotentialDebtsInTwoWeek);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            ua.mycredit.mycredit.ui.BindingAdaptersKt.setDateTime(this.creditDateVal, statusCreditCreationDate, (java.lang.String)null);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.ifRepayAfter2Val, ifRepayAfter2ValAndroidStringSpecificUahFStatusPotentialDebtsInTwoWeek);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.ifRepayAfterVal, ifRepayAfterValAndroidStringSpecificUahFStatusPotentialDebtsInWeek);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.ifRepayTomorrowVal, ifRepayTomorrowValAndroidStringSpecificUahFStatusPotentialDebtsTomorrow);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.pastDueVal, pastDueValAndroidPluralsDaysStatusCreditPastDueDaysStatusCreditPastDueDays);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.termVal, termValAndroidPluralsDaysStatusCreditTermOriginalStatusCreditTermOriginal);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.ifRepayAfter, ifRepayAfter.getResources().getString(R.string.if_repay_after, 7, 7));
            android.databinding.adapters.TextViewBindingAdapter.setText(this.ifRepayAfter2, ifRepayAfter2.getResources().getString(R.string.if_repay_after, 14, 14));
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): status
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}