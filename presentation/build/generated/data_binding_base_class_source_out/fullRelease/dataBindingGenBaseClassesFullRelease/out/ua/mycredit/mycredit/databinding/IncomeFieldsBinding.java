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
import ua.mycredit.mycredit.ui.authentication.registration.ocupation.OccupationTypeViewModel;

public abstract class IncomeFieldsBinding extends ViewDataBinding {
  @Bindable
  protected OccupationTypeViewModel mViewModel;

  protected IncomeFieldsBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setViewModel(@Nullable OccupationTypeViewModel viewModel);

  @Nullable
  public OccupationTypeViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static IncomeFieldsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static IncomeFieldsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<IncomeFieldsBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.income_fields, root, attachToRoot, component);
  }

  @NonNull
  public static IncomeFieldsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static IncomeFieldsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<IncomeFieldsBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.income_fields, null, false, component);
  }

  public static IncomeFieldsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static IncomeFieldsBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (IncomeFieldsBinding)bind(component, view, ua.mycredit.mycredit.R.layout.income_fields);
  }
}
