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
import ua.mycredit.core.Credit;

public abstract class StatusDetailsActiveBinding extends ViewDataBinding {
  @NonNull
  public final TextView amountToRepay;

  @NonNull
  public final TextView amountToRepayVal;

  @NonNull
  public final TextView creationDate;

  @NonNull
  public final TextView creationDateVal;

  @NonNull
  public final TextView loanAmount;

  @NonNull
  public final TextView loanAmountVal;

  @NonNull
  public final TextView untilTermEndLeft;

  @NonNull
  public final TextView untilTermEndLeftVal;

  @NonNull
  public final View view1;

  @NonNull
  public final View view2;

  @Bindable
  protected Credit mCredit;

  protected StatusDetailsActiveBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView amountToRepay, TextView amountToRepayVal,
      TextView creationDate, TextView creationDateVal, TextView loanAmount, TextView loanAmountVal,
      TextView untilTermEndLeft, TextView untilTermEndLeftVal, View view1, View view2) {
    super(_bindingComponent, _root, _localFieldCount);
    this.amountToRepay = amountToRepay;
    this.amountToRepayVal = amountToRepayVal;
    this.creationDate = creationDate;
    this.creationDateVal = creationDateVal;
    this.loanAmount = loanAmount;
    this.loanAmountVal = loanAmountVal;
    this.untilTermEndLeft = untilTermEndLeft;
    this.untilTermEndLeftVal = untilTermEndLeftVal;
    this.view1 = view1;
    this.view2 = view2;
  }

  public abstract void setCredit(@Nullable Credit credit);

  @Nullable
  public Credit getCredit() {
    return mCredit;
  }

  @NonNull
  public static StatusDetailsActiveBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static StatusDetailsActiveBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<StatusDetailsActiveBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.status_details_active, root, attachToRoot, component);
  }

  @NonNull
  public static StatusDetailsActiveBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static StatusDetailsActiveBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<StatusDetailsActiveBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.status_details_active, null, false, component);
  }

  public static StatusDetailsActiveBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static StatusDetailsActiveBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (StatusDetailsActiveBinding)bind(component, view, ua.mycredit.mycredit.R.layout.status_details_active);
  }
}
