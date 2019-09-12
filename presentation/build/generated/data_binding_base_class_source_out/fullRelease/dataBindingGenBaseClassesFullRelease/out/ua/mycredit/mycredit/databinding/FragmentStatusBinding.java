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
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;
import android.widget.ViewSwitcher;
import ua.mycredit.mycredit.ui.profile.credit.StatusViewModel;

public abstract class FragmentStatusBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout alerts;

  @NonNull
  public final ViewSwitcher contractAddition;

  @NonNull
  public final Button creditAction;

  @NonNull
  public final ViewSwitcher creditParams;

  @NonNull
  public final CreditStatusDescriptionBinding creditStatusDescription;

  @NonNull
  public final TextView creditStatusName;

  @NonNull
  public final ViewSwitcher diagram;

  @NonNull
  public final TextView greeting;

  @NonNull
  public final Button repayPart;

  @NonNull
  public final ViewFlipper statusDetails;

  @Bindable
  protected StatusViewModel mViewModel;

  protected FragmentStatusBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, LinearLayout alerts, ViewSwitcher contractAddition, Button creditAction,
      ViewSwitcher creditParams, CreditStatusDescriptionBinding creditStatusDescription,
      TextView creditStatusName, ViewSwitcher diagram, TextView greeting, Button repayPart,
      ViewFlipper statusDetails) {
    super(_bindingComponent, _root, _localFieldCount);
    this.alerts = alerts;
    this.contractAddition = contractAddition;
    this.creditAction = creditAction;
    this.creditParams = creditParams;
    this.creditStatusDescription = creditStatusDescription;
    setContainedBinding(this.creditStatusDescription);;
    this.creditStatusName = creditStatusName;
    this.diagram = diagram;
    this.greeting = greeting;
    this.repayPart = repayPart;
    this.statusDetails = statusDetails;
  }

  public abstract void setViewModel(@Nullable StatusViewModel viewModel);

  @Nullable
  public StatusViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentStatusBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentStatusBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentStatusBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_status, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentStatusBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentStatusBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentStatusBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_status, null, false, component);
  }

  public static FragmentStatusBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentStatusBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentStatusBinding)bind(component, view, ua.mycredit.mycredit.R.layout.fragment_status);
  }
}
