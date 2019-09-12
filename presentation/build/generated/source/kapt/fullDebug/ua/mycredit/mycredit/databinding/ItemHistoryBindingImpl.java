package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemHistoryBindingImpl extends ItemHistoryBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.dateLayout, 7);
        sViewsWithIds.put(R.id.dateLabelTextView, 8);
        sViewsWithIds.put(R.id.view, 9);
        sViewsWithIds.put(R.id.deptLayout, 10);
        sViewsWithIds.put(R.id.deptLabelTextView, 11);
        sViewsWithIds.put(R.id.guideline2, 12);
        sViewsWithIds.put(R.id.amountLayout, 13);
        sViewsWithIds.put(R.id.amountLabelTextView, 14);
        sViewsWithIds.put(R.id.guideline3, 15);
        sViewsWithIds.put(R.id.separator, 16);
        sViewsWithIds.put(R.id.termLayout, 17);
        sViewsWithIds.put(R.id.termLabelTextView, 18);
    }
    // views
    @NonNull
    private final android.support.v7.widget.CardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemHistoryBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }
    private ItemHistoryBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.TextView) bindings[14]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[8]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[11]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.TextView) bindings[4]
            , (android.support.constraint.Guideline) bindings[12]
            , (android.support.constraint.Guideline) bindings[15]
            , (android.widget.TextView) bindings[1]
            , (android.view.View) bindings[16]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[18]
            , (android.widget.LinearLayout) bindings[17]
            , (android.widget.TextView) bindings[6]
            , (android.view.View) bindings[9]
            );
        this.amountTextView.setTag(null);
        this.dateTextView.setTag(null);
        this.deptTextView.setTag(null);
        this.idTextView.setTag(null);
        this.mboundView0 = (android.support.v7.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.statusTextView.setTag(null);
        this.termTextView.setTag(null);
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
            setViewModel((ua.mycredit.mycredit.ui.profile.history.HistoryViewModel.LoanViewHolder) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ua.mycredit.mycredit.ui.profile.history.HistoryViewModel.LoanViewHolder ViewModel) {
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
                return onChangeViewModelItem((android.databinding.ObservableField<ua.mycredit.core.Credit>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelItem(android.databinding.ObservableField<ua.mycredit.core.Credit> ViewModelItem, int fieldId) {
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
        java.lang.String viewModelItemPublicId = null;
        int viewModelItemTerm = 0;
        android.databinding.ObservableField<ua.mycredit.core.Credit> viewModelItem = null;
        double viewModelItemCurrentDebt = 0.0;
        java.lang.String idTextViewAndroidStringStringNumberPatternViewModelItemPublicId = null;
        java.lang.String termTextViewAndroidPluralsDaysViewModelItemTermViewModelItemTerm = null;
        int viewModelItemStatus = 0;
        org.joda.time.DateTime viewModelItemCreationDate = null;
        double viewModelItemAmount = 0.0;
        ua.mycredit.core.Credit viewModelItemGet = null;
        ua.mycredit.mycredit.ui.profile.history.HistoryViewModel.LoanViewHolder viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.item
                    viewModelItem = viewModel.getItem();
                }
                updateRegistration(0, viewModelItem);


                if (viewModelItem != null) {
                    // read viewModel.item.get()
                    viewModelItemGet = viewModelItem.get();
                }


                if (viewModelItemGet != null) {
                    // read viewModel.item.get().publicId
                    viewModelItemPublicId = viewModelItemGet.getPublicId();
                    // read viewModel.item.get().term
                    viewModelItemTerm = viewModelItemGet.getTerm();
                    // read viewModel.item.get().currentDebt
                    viewModelItemCurrentDebt = viewModelItemGet.getCurrentDebt();
                    // read viewModel.item.get().status
                    viewModelItemStatus = viewModelItemGet.getStatus();
                    // read viewModel.item.get().creationDate
                    viewModelItemCreationDate = viewModelItemGet.getCreationDate();
                    // read viewModel.item.get().amount
                    viewModelItemAmount = viewModelItemGet.getAmount();
                }


                // read @android:string/string_number_pattern
                idTextViewAndroidStringStringNumberPatternViewModelItemPublicId = idTextView.getResources().getString(R.string.string_number_pattern, viewModelItemPublicId);
                // read @android:plurals/days
                termTextViewAndroidPluralsDaysViewModelItemTermViewModelItemTerm = termTextView.getResources().getQuantityString(R.plurals.days, viewModelItemTerm, viewModelItemTerm);
                // read @android:plurals/days
                termTextViewAndroidPluralsDaysViewModelItemTermViewModelItemTerm = termTextView.getResources().getQuantityString(R.plurals.days, viewModelItemTerm, viewModelItemTerm);
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            ua.mycredit.mycredit.ui.BindingAdaptersKt.setAmountWithCurrency(this.amountTextView, viewModelItemAmount);
            ua.mycredit.mycredit.ui.BindingAdaptersKt.setDateTime(this.dateTextView, viewModelItemCreationDate, "M-");
            ua.mycredit.mycredit.ui.BindingAdaptersKt.setAmountWithCurrency(this.deptTextView, viewModelItemCurrentDebt);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.idTextView, idTextViewAndroidStringStringNumberPatternViewModelItemPublicId);
            ua.mycredit.mycredit.ui.BindingAdaptersKt.nameByStatusCode(this.statusTextView, viewModelItemStatus);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.termTextView, termTextViewAndroidPluralsDaysViewModelItemTermViewModelItemTerm);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.item
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}