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
import ua.mycredit.mycredit.ui.calculator.CalculatorViewModel;

public abstract class FragmentCalculatorBinding extends ViewDataBinding {
  @NonNull
  public final Button action;

  @Bindable
  protected CalculatorViewModel mViewModel;

  protected FragmentCalculatorBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Button action) {
    super(_bindingComponent, _root, _localFieldCount);
    this.action = action;
  }

  public abstract void setViewModel(@Nullable CalculatorViewModel viewModel);

  @Nullable
  public CalculatorViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentCalculatorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentCalculatorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentCalculatorBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_calculator, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentCalculatorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentCalculatorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentCalculatorBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_calculator, null, false, component);
  }

  public static FragmentCalculatorBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentCalculatorBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentCalculatorBinding)bind(component, view, ua.mycredit.mycredit.R.layout.fragment_calculator);
  }
}
