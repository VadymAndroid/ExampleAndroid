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
import ua.mycredit.core.PastDue;

public abstract class StatusDetailsPastDueBinding extends ViewDataBinding {
  @NonNull
  public final TextView creditDate;

  @NonNull
  public final TextView creditDateVal;

  @NonNull
  public final TextView ifRepayAfter;

  @NonNull
  public final TextView ifRepayAfter2;

  @NonNull
  public final TextView ifRepayAfter2Val;

  @NonNull
  public final TextView ifRepayAfterVal;

  @NonNull
  public final TextView ifRepayTomorrow;

  @NonNull
  public final TextView ifRepayTomorrowVal;

  @NonNull
  public final TextView pastDue;

  @NonNull
  public final TextView pastDueVal;

  @NonNull
  public final TextView term;

  @NonNull
  public final TextView termVal;

  @NonNull
  public final View view1;

  @NonNull
  public final View view2;

  @NonNull
  public final View view3;

  @Bindable
  protected PastDue mStatus;

  protected StatusDetailsPastDueBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView creditDate, TextView creditDateVal, TextView ifRepayAfter,
      TextView ifRepayAfter2, TextView ifRepayAfter2Val, TextView ifRepayAfterVal,
      TextView ifRepayTomorrow, TextView ifRepayTomorrowVal, TextView pastDue, TextView pastDueVal,
      TextView term, TextView termVal, View view1, View view2, View view3) {
    super(_bindingComponent, _root, _localFieldCount);
    this.creditDate = creditDate;
    this.creditDateVal = creditDateVal;
    this.ifRepayAfter = ifRepayAfter;
    this.ifRepayAfter2 = ifRepayAfter2;
    this.ifRepayAfter2Val = ifRepayAfter2Val;
    this.ifRepayAfterVal = ifRepayAfterVal;
    this.ifRepayTomorrow = ifRepayTomorrow;
    this.ifRepayTomorrowVal = ifRepayTomorrowVal;
    this.pastDue = pastDue;
    this.pastDueVal = pastDueVal;
    this.term = term;
    this.termVal = termVal;
    this.view1 = view1;
    this.view2 = view2;
    this.view3 = view3;
  }

  public abstract void setStatus(@Nullable PastDue status);

  @Nullable
  public PastDue getStatus() {
    return mStatus;
  }

  @NonNull
  public static StatusDetailsPastDueBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static StatusDetailsPastDueBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<StatusDetailsPastDueBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.status_details_past_due, root, attachToRoot, component);
  }

  @NonNull
  public static StatusDetailsPastDueBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static StatusDetailsPastDueBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<StatusDetailsPastDueBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.status_details_past_due, null, false, component);
  }

  public static StatusDetailsPastDueBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static StatusDetailsPastDueBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (StatusDetailsPastDueBinding)bind(component, view, ua.mycredit.mycredit.R.layout.status_details_past_due);
  }
}
