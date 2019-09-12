package ua.mycredit.mycredit.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ua.mycredit.core.Restructured;

public abstract class StatusDetailsRestructuredBinding extends ViewDataBinding {
  @NonNull
  public final TextView nextDatePayment;

  @NonNull
  public final TextView nextDatePaymentVal;

  @NonNull
  public final TextView nextPaymentAmount;

  @NonNull
  public final TextView nextPaymentAmountVal;

  @NonNull
  public final TextView paid;

  @NonNull
  public final TextView paidVal;

  @NonNull
  public final TextView totalDebtAmount;

  @NonNull
  public final TextView totalDebtAmountVal;

  @NonNull
  public final View view1;

  @NonNull
  public final View view2;

  @Bindable
  protected Restructured mStatus;

  protected StatusDetailsRestructuredBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView nextDatePayment, TextView nextDatePaymentVal,
      TextView nextPaymentAmount, TextView nextPaymentAmountVal, TextView paid, TextView paidVal,
      TextView totalDebtAmount, TextView totalDebtAmountVal, View view1, View view2) {
    super(_bindingComponent, _root, _localFieldCount);
    this.nextDatePayment = nextDatePayment;
    this.nextDatePaymentVal = nextDatePaymentVal;
    this.nextPaymentAmount = nextPaymentAmount;
    this.nextPaymentAmountVal = nextPaymentAmountVal;
    this.paid = paid;
    this.paidVal = paidVal;
    this.totalDebtAmount = totalDebtAmount;
    this.totalDebtAmountVal = totalDebtAmountVal;
    this.view1 = view1;
    this.view2 = view2;
  }

  public abstract void setStatus(@Nullable Restructured status);

  @Nullable
  public Restructured getStatus() {
    return mStatus;
  }

  @NonNull
  public static StatusDetailsRestructuredBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static StatusDetailsRestructuredBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<StatusDetailsRestructuredBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.status_details_restructured, root, attachToRoot, component);
  }

  @NonNull
  public static StatusDetailsRestructuredBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static StatusDetailsRestructuredBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<StatusDetailsRestructuredBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.status_details_restructured, null, false, component);
  }

  public static StatusDetailsRestructuredBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static StatusDetailsRestructuredBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (StatusDetailsRestructuredBinding)bind(component, view, ua.mycredit.mycredit.R.layout.status_details_restructured);
  }
}
