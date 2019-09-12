package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class CalculatorBindingImpl extends CalculatorBinding implements ua.mycredit.mycredit.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.seek, 13);
        sViewsWithIds.put(R.id.seekDivider, 14);
        sViewsWithIds.put(R.id.information, 15);
        sViewsWithIds.put(R.id.borrowContainer, 16);
        sViewsWithIds.put(R.id.percentContainer, 17);
        sViewsWithIds.put(R.id.resultContainer, 18);
        sViewsWithIds.put(R.id.informationDivider, 19);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback48;
    // values
    // listeners
    private OnSeekBarChangedListenerImpl mViewModelOnDaysValueChangedUaMycreditMycreditUiCustomCircleSeekBarOnSeekBarChangedListener;
    private OnSeekBarChangedListenerImpl1 mViewModelOnMoneyValueChangedUaMycreditMycreditUiCustomCircleSeekBarOnSeekBarChangedListener;
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener daysSeekBarvalueAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.days.get()
            //         is viewModel.days.set((int) callbackArg_0)
            int callbackArg_0 = ua.mycredit.mycredit.ui.BindingAdaptersKt.getValue(daysSeekBar);
            // localize variables for thread safety
            // viewModel.days
            android.databinding.ObservableInt viewModelDays = null;
            // viewModel
            ua.mycredit.mycredit.ui.calculator.CalculatorViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.days.get()
            int viewModelDaysGet = 0;
            // viewModel.days != null
            boolean viewModelDaysJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelDays = viewModel.getDays();

                viewModelDaysJavaLangObjectNull = (viewModelDays) != (null);
                if (viewModelDaysJavaLangObjectNull) {




                    viewModelDays.set(((int) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener moneySeekBarvalueAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.money.get()
            //         is viewModel.money.set((int) callbackArg_0)
            int callbackArg_0 = ua.mycredit.mycredit.ui.BindingAdaptersKt.getValue(moneySeekBar);
            // localize variables for thread safety
            // viewModel.money != null
            boolean viewModelMoneyJavaLangObjectNull = false;
            // viewModel.money
            android.databinding.ObservableInt viewModelMoney = null;
            // viewModel
            ua.mycredit.mycredit.ui.calculator.CalculatorViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.money.get()
            int viewModelMoneyGet = 0;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelMoney = viewModel.getMoney();

                viewModelMoneyJavaLangObjectNull = (viewModelMoney) != (null);
                if (viewModelMoneyJavaLangObjectNull) {




                    viewModelMoney.set(((int) (callbackArg_0)));
                }
            }
        }
    };

    public CalculatorBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private CalculatorBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 7
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[1]
            , (ua.mycredit.mycredit.ui.custom.CircleSeekBar) bindings[3]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[9]
            , (android.widget.RelativeLayout) bindings[15]
            , (android.view.View) bindings[19]
            , (ua.mycredit.mycredit.ui.custom.CircleSeekBar) bindings[2]
            , (android.widget.LinearLayout) bindings[17]
            , (android.widget.TextView) bindings[8]
            , (android.widget.Button) bindings[12]
            , (android.widget.LinearLayout) bindings[18]
            , (android.widget.FrameLayout) bindings[13]
            , (android.view.View) bindings[14]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[11]
            );
        this.borrowQuantity.setTag(null);
        this.calculatorBorrowQuantity.setTag(null);
        this.calculatorDaysQuantity.setTag(null);
        this.chooseSumAndTerm.setTag(null);
        this.daysSeekBar.setTag(null);
        this.discount.setTag(null);
        this.giveQuantity.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.moneySeekBar.setTag(null);
        this.percentQuantity.setTag(null);
        this.promocodeButton.setTag(null);
        this.strikePercentQuantity.setTag(null);
        this.until.setTag(null);
        setRootTag(root);
        // listeners
        mCallback48 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100L;
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
            setViewModel((ua.mycredit.mycredit.ui.calculator.CalculatorViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ua.mycredit.mycredit.ui.calculator.CalculatorViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelMainView((android.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeViewModelDaysProcess((android.databinding.ObservableField<ua.mycredit.mycredit.ui.calculator.CalculatorViewModel.Progress>) object, fieldId);
            case 2 :
                return onChangeViewModelDays((android.databinding.ObservableInt) object, fieldId);
            case 3 :
                return onChangeViewModelDiscount((android.databinding.ObservableFloat) object, fieldId);
            case 4 :
                return onChangeViewModelUsePromo((android.databinding.ObservableBoolean) object, fieldId);
            case 5 :
                return onChangeViewModelMoney((android.databinding.ObservableInt) object, fieldId);
            case 6 :
                return onChangeViewModelMoneyProcess((android.databinding.ObservableField<ua.mycredit.mycredit.ui.calculator.CalculatorViewModel.Progress>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelMainView(android.databinding.ObservableBoolean ViewModelMainView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDaysProcess(android.databinding.ObservableField<ua.mycredit.mycredit.ui.calculator.CalculatorViewModel.Progress> ViewModelDaysProcess, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDays(android.databinding.ObservableInt ViewModelDays, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDiscount(android.databinding.ObservableFloat ViewModelDiscount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelUsePromo(android.databinding.ObservableBoolean ViewModelUsePromo, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelMoney(android.databinding.ObservableInt ViewModelMoney, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelMoneyProcess(android.databinding.ObservableField<ua.mycredit.mycredit.ui.calculator.CalculatorViewModel.Progress> ViewModelMoneyProcess, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
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
        float viewModelDiscountGet = 0f;
        android.databinding.ObservableBoolean viewModelMainView = null;
        java.lang.String discountAndroidStringDiscountPatternViewModelDiscount = null;
        int viewModelMoneyProcessMaxProcessValue = 0;
        int viewModelDaysProcessMinProcessValue = 0;
        android.databinding.ObservableField<ua.mycredit.mycredit.ui.calculator.CalculatorViewModel.Progress> viewModelDaysProcess = null;
        int viewModelMoneyProcessUltimate = 0;
        android.databinding.ObservableInt viewModelDays = null;
        android.databinding.ObservableFloat viewModelDiscount = null;
        int viewModelDaysProcessUltimate = 0;
        int viewModelMoneyGet = 0;
        int viewModelDaysProcessMaxProcessValue = 0;
        ua.mycredit.mycredit.ui.calculator.CalculatorViewModel.Progress viewModelDaysProcessGet = null;
        int viewModelGetPercentViewModelMoneyViewModelDaysProductUSUALPERCENT = 0;
        java.lang.String calculatorDaysQuantityAndroidPluralsDaysViewModelDaysViewModelDays = null;
        boolean viewModelMainViewGet = false;
        int viewModelGetPercentViewModelMoneyViewModelDays = 0;
        int viewModelMoneyProcessMinProcessValue = 0;
        java.lang.String strikePercentQuantityAndroidStringSpecificUahDViewModelGetPercentViewModelMoneyViewModelDaysProductUSUALPERCENT = null;
        java.util.Calendar viewModelGetUntilViewModelDays = null;
        android.databinding.ObservableBoolean viewModelUsePromo = null;
        int viewModelGetGiveQuantityViewModelMoneyViewModelDays = 0;
        ua.mycredit.mycredit.ui.custom.CircleSeekBar.OnSeekBarChangedListener viewModelOnDaysValueChangedUaMycreditMycreditUiCustomCircleSeekBarOnSeekBarChangedListener = null;
        int viewModelMoneyProcessMaxProcess = 0;
        java.lang.String daysSeekBarAndroidPluralsDaysViewModelDaysProcessUltimateViewModelDaysProcessUltimate = null;
        java.lang.String moneySeekBarAndroidStringSpecificUahDViewModelMoneyProcessUltimate = null;
        android.databinding.ObservableInt viewModelMoney = null;
        ua.mycredit.mycredit.ui.custom.CircleSeekBar.OnSeekBarChangedListener viewModelOnMoneyValueChangedUaMycreditMycreditUiCustomCircleSeekBarOnSeekBarChangedListener = null;
        int viewModelGetMoneyFromViewModelMoney = 0;
        int viewModelDaysGet = 0;
        android.databinding.ObservableField<ua.mycredit.mycredit.ui.calculator.CalculatorViewModel.Progress> viewModelMoneyProcess = null;
        ua.mycredit.mycredit.ui.calculator.CalculatorViewModel.Progress viewModelMoneyProcessGet = null;
        boolean viewModelUsePromoGet = false;
        int viewModelDaysProcessMaxProcess = 0;
        ua.mycredit.mycredit.ui.calculator.CalculatorViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x1ffL) != 0) {


            if ((dirtyFlags & 0x181L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.mainView
                        viewModelMainView = viewModel.getMainView();
                    }
                    updateRegistration(0, viewModelMainView);


                    if (viewModelMainView != null) {
                        // read viewModel.mainView.get()
                        viewModelMainViewGet = viewModelMainView.get();
                    }
            }
            if ((dirtyFlags & 0x182L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.daysProcess
                        viewModelDaysProcess = viewModel.getDaysProcess();
                    }
                    updateRegistration(1, viewModelDaysProcess);


                    if (viewModelDaysProcess != null) {
                        // read viewModel.daysProcess.get()
                        viewModelDaysProcessGet = viewModelDaysProcess.get();
                    }


                    if (viewModelDaysProcessGet != null) {
                        // read viewModel.daysProcess.get().minProcessValue
                        viewModelDaysProcessMinProcessValue = viewModelDaysProcessGet.getMinProcessValue();
                        // read viewModel.daysProcess.get().ultimate
                        viewModelDaysProcessUltimate = viewModelDaysProcessGet.getUltimate();
                        // read viewModel.daysProcess.get().maxProcessValue
                        viewModelDaysProcessMaxProcessValue = viewModelDaysProcessGet.getMaxProcessValue();
                        // read viewModel.daysProcess.get().maxProcess
                        viewModelDaysProcessMaxProcess = viewModelDaysProcessGet.getMaxProcess();
                    }


                    // read @android:plurals/days
                    daysSeekBarAndroidPluralsDaysViewModelDaysProcessUltimateViewModelDaysProcessUltimate = daysSeekBar.getResources().getQuantityString(R.plurals.days, viewModelDaysProcessUltimate, viewModelDaysProcessUltimate);
                    // read @android:plurals/days
                    daysSeekBarAndroidPluralsDaysViewModelDaysProcessUltimateViewModelDaysProcessUltimate = daysSeekBar.getResources().getQuantityString(R.plurals.days, viewModelDaysProcessUltimate, viewModelDaysProcessUltimate);
            }
            if ((dirtyFlags & 0x1a4L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.days
                        viewModelDays = viewModel.getDays();
                        // read viewModel.money
                        viewModelMoney = viewModel.getMoney();
                    }
                    updateRegistration(2, viewModelDays);
                    updateRegistration(5, viewModelMoney);


                    if (viewModelDays != null) {
                        // read viewModel.days.get()
                        viewModelDaysGet = viewModelDays.get();
                    }
                    if (viewModelMoney != null) {
                        // read viewModel.money.get()
                        viewModelMoneyGet = viewModelMoney.get();
                    }

                if ((dirtyFlags & 0x184L) != 0) {

                        // read @android:plurals/days
                        calculatorDaysQuantityAndroidPluralsDaysViewModelDaysViewModelDays = calculatorDaysQuantity.getResources().getQuantityString(R.plurals.days, viewModelDaysGet, viewModelDaysGet);
                        // read @android:plurals/days
                        calculatorDaysQuantityAndroidPluralsDaysViewModelDaysViewModelDays = calculatorDaysQuantity.getResources().getQuantityString(R.plurals.days, viewModelDaysGet, viewModelDaysGet);
                        if (viewModel != null) {
                            // read viewModel.getUntil(viewModel.days.get())
                            viewModelGetUntilViewModelDays = viewModel.getUntil(viewModelDaysGet);
                        }
                }

                    if (viewModel != null) {
                        // read viewModel.getPercent(viewModel.money.get(), viewModel.days.get(), Product.USUAL_PERCENT)
                        viewModelGetPercentViewModelMoneyViewModelDaysProductUSUALPERCENT = viewModel.getPercent(viewModelMoneyGet, viewModelDaysGet, ua.mycredit.core.Product.USUAL_PERCENT);
                        // read viewModel.getPercent(viewModel.money.get(), viewModel.days.get())
                        viewModelGetPercentViewModelMoneyViewModelDays = viewModel.getPercent(viewModelMoneyGet, viewModelDaysGet);
                        // read viewModel.getGiveQuantity(viewModel.money.get(), viewModel.days.get())
                        viewModelGetGiveQuantityViewModelMoneyViewModelDays = viewModel.getGiveQuantity(viewModelMoneyGet, viewModelDaysGet);
                    }


                    // read @android:string/specific_uah_d
                    strikePercentQuantityAndroidStringSpecificUahDViewModelGetPercentViewModelMoneyViewModelDaysProductUSUALPERCENT = strikePercentQuantity.getResources().getString(R.string.specific_uah_d, viewModelGetPercentViewModelMoneyViewModelDaysProductUSUALPERCENT);
                if ((dirtyFlags & 0x1a0L) != 0) {

                        if (viewModel != null) {
                            // read viewModel.getMoneyFrom(viewModel.money.get())
                            viewModelGetMoneyFromViewModelMoney = viewModel.getMoneyFrom(viewModelMoneyGet);
                        }
                }
            }
            if ((dirtyFlags & 0x188L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.discount
                        viewModelDiscount = viewModel.getDiscount();
                    }
                    updateRegistration(3, viewModelDiscount);


                    if (viewModelDiscount != null) {
                        // read viewModel.discount.get()
                        viewModelDiscountGet = viewModelDiscount.get();
                    }


                    // read @android:string/discount_pattern
                    discountAndroidStringDiscountPatternViewModelDiscount = discount.getResources().getString(R.string.discount_pattern, viewModelDiscountGet);
            }
            if ((dirtyFlags & 0x190L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.usePromo
                        viewModelUsePromo = viewModel.getUsePromo();
                    }
                    updateRegistration(4, viewModelUsePromo);


                    if (viewModelUsePromo != null) {
                        // read viewModel.usePromo.get()
                        viewModelUsePromoGet = viewModelUsePromo.get();
                    }
            }
            if ((dirtyFlags & 0x180L) != 0) {

                    if (viewModel != null) {
                        // read viewModel::onDaysValueChanged
                        viewModelOnDaysValueChangedUaMycreditMycreditUiCustomCircleSeekBarOnSeekBarChangedListener = (((mViewModelOnDaysValueChangedUaMycreditMycreditUiCustomCircleSeekBarOnSeekBarChangedListener == null) ? (mViewModelOnDaysValueChangedUaMycreditMycreditUiCustomCircleSeekBarOnSeekBarChangedListener = new OnSeekBarChangedListenerImpl()) : mViewModelOnDaysValueChangedUaMycreditMycreditUiCustomCircleSeekBarOnSeekBarChangedListener).setValue(viewModel));
                        // read viewModel::onMoneyValueChanged
                        viewModelOnMoneyValueChangedUaMycreditMycreditUiCustomCircleSeekBarOnSeekBarChangedListener = (((mViewModelOnMoneyValueChangedUaMycreditMycreditUiCustomCircleSeekBarOnSeekBarChangedListener == null) ? (mViewModelOnMoneyValueChangedUaMycreditMycreditUiCustomCircleSeekBarOnSeekBarChangedListener = new OnSeekBarChangedListenerImpl1()) : mViewModelOnMoneyValueChangedUaMycreditMycreditUiCustomCircleSeekBarOnSeekBarChangedListener).setValue(viewModel));
                    }
            }
            if ((dirtyFlags & 0x1c0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.moneyProcess
                        viewModelMoneyProcess = viewModel.getMoneyProcess();
                    }
                    updateRegistration(6, viewModelMoneyProcess);


                    if (viewModelMoneyProcess != null) {
                        // read viewModel.moneyProcess.get()
                        viewModelMoneyProcessGet = viewModelMoneyProcess.get();
                    }


                    if (viewModelMoneyProcessGet != null) {
                        // read viewModel.moneyProcess.get().maxProcessValue
                        viewModelMoneyProcessMaxProcessValue = viewModelMoneyProcessGet.getMaxProcessValue();
                        // read viewModel.moneyProcess.get().ultimate
                        viewModelMoneyProcessUltimate = viewModelMoneyProcessGet.getUltimate();
                        // read viewModel.moneyProcess.get().minProcessValue
                        viewModelMoneyProcessMinProcessValue = viewModelMoneyProcessGet.getMinProcessValue();
                        // read viewModel.moneyProcess.get().maxProcess
                        viewModelMoneyProcessMaxProcess = viewModelMoneyProcessGet.getMaxProcess();
                    }


                    // read @android:string/specific_uah_d
                    moneySeekBarAndroidStringSpecificUahDViewModelMoneyProcessUltimate = moneySeekBar.getResources().getString(R.string.specific_uah_d, viewModelMoneyProcessUltimate);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1a0L) != 0) {
            // api target 1

            ua.mycredit.mycredit.ui.BindingAdaptersKt.setMoney(this.borrowQuantity, viewModelGetMoneyFromViewModelMoney);
            ua.mycredit.mycredit.ui.BindingAdaptersKt.setMoney(this.calculatorBorrowQuantity, viewModelGetMoneyFromViewModelMoney);
            ua.mycredit.mycredit.ui.BindingAdaptersKt.doSetValue(this.moneySeekBar, viewModelMoneyGet);
        }
        if ((dirtyFlags & 0x184L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.calculatorDaysQuantity, calculatorDaysQuantityAndroidPluralsDaysViewModelDaysViewModelDays);
            ua.mycredit.mycredit.ui.BindingAdaptersKt.doSetValue(this.daysSeekBar, viewModelDaysGet);
            ua.mycredit.mycredit.ui.BindingAdaptersKt.setUntil(this.until, viewModelGetUntilViewModelDays);
        }
        if ((dirtyFlags & 0x181L) != 0) {
            // api target 1

            this.chooseSumAndTerm.setVisibility(ua.mycredit.mycredit.ui.BindingAdaptersKt.booleanToVisibility(viewModelMainViewGet));
        }
        if ((dirtyFlags & 0x182L) != 0) {
            // api target 1

            this.daysSeekBar.setEndText(daysSeekBarAndroidPluralsDaysViewModelDaysProcessUltimateViewModelDaysProcessUltimate);
            this.daysSeekBar.setMaxProcess(viewModelDaysProcessMaxProcess);
            this.daysSeekBar.setMaxProcessValue(viewModelDaysProcessMaxProcessValue);
            this.daysSeekBar.setMinProcessValue(viewModelDaysProcessMinProcessValue);
        }
        if ((dirtyFlags & 0x180L) != 0) {
            // api target 1

            ua.mycredit.mycredit.ui.BindingAdaptersKt.setValueAttrChanged(this.daysSeekBar, daysSeekBarvalueAttrChanged, (ua.mycredit.mycredit.ui.custom.CircleSeekBar.OnSeekBarChangedListener)viewModelOnDaysValueChangedUaMycreditMycreditUiCustomCircleSeekBarOnSeekBarChangedListener, (ua.mycredit.mycredit.ui.custom.CircleSeekBar.OnSeekBarChangingListener)null);
            ua.mycredit.mycredit.ui.BindingAdaptersKt.setValueAttrChanged(this.moneySeekBar, moneySeekBarvalueAttrChanged, (ua.mycredit.mycredit.ui.custom.CircleSeekBar.OnSeekBarChangedListener)viewModelOnMoneyValueChangedUaMycreditMycreditUiCustomCircleSeekBarOnSeekBarChangedListener, (ua.mycredit.mycredit.ui.custom.CircleSeekBar.OnSeekBarChangingListener)null);
        }
        if ((dirtyFlags & 0x188L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.discount, discountAndroidStringDiscountPatternViewModelDiscount);
        }
        if ((dirtyFlags & 0x190L) != 0) {
            // api target 1

            this.discount.setVisibility(ua.mycredit.mycredit.ui.BindingAdaptersKt.booleanToVisibility(viewModelUsePromoGet));
            this.strikePercentQuantity.setVisibility(ua.mycredit.mycredit.ui.BindingAdaptersKt.booleanToVisibility(viewModelUsePromoGet));
        }
        if ((dirtyFlags & 0x1a4L) != 0) {
            // api target 1

            ua.mycredit.mycredit.ui.BindingAdaptersKt.setMoney(this.giveQuantity, viewModelGetGiveQuantityViewModelMoneyViewModelDays);
            ua.mycredit.mycredit.ui.BindingAdaptersKt.setMoney(this.percentQuantity, viewModelGetPercentViewModelMoneyViewModelDays);
            ua.mycredit.mycredit.ui.BindingAdaptersKt.setStrikeText(this.strikePercentQuantity, strikePercentQuantityAndroidStringSpecificUahDViewModelGetPercentViewModelMoneyViewModelDaysProductUSUALPERCENT);
        }
        if ((dirtyFlags & 0x1c0L) != 0) {
            // api target 1

            this.moneySeekBar.setEndText(moneySeekBarAndroidStringSpecificUahDViewModelMoneyProcessUltimate);
            this.moneySeekBar.setMaxProcess(viewModelMoneyProcessMaxProcess);
            this.moneySeekBar.setMaxProcessValue(viewModelMoneyProcessMaxProcessValue);
            this.moneySeekBar.setMinProcessValue(viewModelMoneyProcessMinProcessValue);
        }
        if ((dirtyFlags & 0x100L) != 0) {
            // api target 1

            this.promocodeButton.setOnClickListener(mCallback48);
        }
    }
    // Listener Stub Implementations
    public static class OnSeekBarChangedListenerImpl implements ua.mycredit.mycredit.ui.custom.CircleSeekBar.OnSeekBarChangedListener{
        private ua.mycredit.mycredit.ui.calculator.CalculatorViewModel value;
        public OnSeekBarChangedListenerImpl setValue(ua.mycredit.mycredit.ui.calculator.CalculatorViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onChanged(int arg0) {
            this.value.onDaysValueChanged(arg0); 
        }
    }
    public static class OnSeekBarChangedListenerImpl1 implements ua.mycredit.mycredit.ui.custom.CircleSeekBar.OnSeekBarChangedListener{
        private ua.mycredit.mycredit.ui.calculator.CalculatorViewModel value;
        public OnSeekBarChangedListenerImpl1 setValue(ua.mycredit.mycredit.ui.calculator.CalculatorViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onChanged(int arg0) {
            this.value.onMoneyValueChanged(arg0); 
        }
    }
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        ua.mycredit.mycredit.ui.calculator.CalculatorViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.enterPromoCode();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.mainView
        flag 1 (0x2L): viewModel.daysProcess
        flag 2 (0x3L): viewModel.days
        flag 3 (0x4L): viewModel.discount
        flag 4 (0x5L): viewModel.usePromo
        flag 5 (0x6L): viewModel.money
        flag 6 (0x7L): viewModel.moneyProcess
        flag 7 (0x8L): viewModel
        flag 8 (0x9L): null
    flag mapping end*/
    //end
}