package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class StatusDetailsRestructuredBindingImpl extends StatusDetailsRestructuredBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.total_debt_amount, 5);
        sViewsWithIds.put(R.id.view1, 6);
        sViewsWithIds.put(R.id.paid, 7);
        sViewsWithIds.put(R.id.next_date_payment, 8);
        sViewsWithIds.put(R.id.view2, 9);
        sViewsWithIds.put(R.id.next_payment_amount, 10);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public StatusDetailsRestructuredBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private StatusDetailsRestructuredBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[1]
            , (android.view.View) bindings[6]
            , (android.view.View) bindings[9]
            );
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.nextDatePaymentVal.setTag(null);
        this.nextPaymentAmountVal.setTag(null);
        this.paidVal.setTag(null);
        this.totalDebtAmountVal.setTag(null);
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
            setStatus((ua.mycredit.core.Restructured) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setStatus(@Nullable ua.mycredit.core.Restructured Status) {
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
        ua.mycredit.core.Restructured status = mStatus;
        java.lang.String extensionsKtPrintByStyleStatusNextPaymentDateJavaLangStringL = null;
        double statusNextPaymentAmount = 0.0;
        java.lang.String nextPaymentAmountValAndroidStringSpecificUahFPenniesStatusNextPaymentAmount = null;
        double statusCreditOutstandingBalance = 0.0;
        double statusTotalRepaidAmount = 0.0;
        java.lang.String totalDebtAmountValAndroidStringSpecificUahFPenniesStatusCreditOutstandingBalance = null;
        org.joda.time.LocalDate statusNextPaymentDate = null;
        java.lang.String paidValAndroidStringSpecificUahFPenniesStatusTotalRepaidAmount = null;
        ua.mycredit.core.Credit statusCredit = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (status != null) {
                    // read status.nextPaymentAmount
                    statusNextPaymentAmount = status.getNextPaymentAmount();
                    // read status.totalRepaidAmount
                    statusTotalRepaidAmount = status.getTotalRepaidAmount();
                    // read status.nextPaymentDate
                    statusNextPaymentDate = status.getNextPaymentDate();
                    // read status.credit
                    statusCredit = status.getCredit();
                }


                // read @android:string/specific_uah_f_pennies
                nextPaymentAmountValAndroidStringSpecificUahFPenniesStatusNextPaymentAmount = nextPaymentAmountVal.getResources().getString(R.string.specific_uah_f_pennies, statusNextPaymentAmount);
                // read @android:string/specific_uah_f_pennies
                paidValAndroidStringSpecificUahFPenniesStatusTotalRepaidAmount = paidVal.getResources().getString(R.string.specific_uah_f_pennies, statusTotalRepaidAmount);
                // read ExtensionsKt.printByStyle(status.nextPaymentDate, "L-")
                extensionsKtPrintByStyleStatusNextPaymentDateJavaLangStringL = ua.mycredit.mycredit.ui.ExtensionsKt.printByStyle(statusNextPaymentDate, "L-");
                if (statusCredit != null) {
                    // read status.credit.outstandingBalance
                    statusCreditOutstandingBalance = statusCredit.getOutstandingBalance();
                }


                // read @android:string/specific_uah_f_pennies
                totalDebtAmountValAndroidStringSpecificUahFPenniesStatusCreditOutstandingBalance = totalDebtAmountVal.getResources().getString(R.string.specific_uah_f_pennies, statusCreditOutstandingBalance);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.nextDatePaymentVal, extensionsKtPrintByStyleStatusNextPaymentDateJavaLangStringL);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.nextPaymentAmountVal, nextPaymentAmountValAndroidStringSpecificUahFPenniesStatusNextPaymentAmount);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.paidVal, paidValAndroidStringSpecificUahFPenniesStatusTotalRepaidAmount);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.totalDebtAmountVal, totalDebtAmountValAndroidStringSpecificUahFPenniesStatusCreditOutstandingBalance);
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