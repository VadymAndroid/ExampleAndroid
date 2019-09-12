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
import ua.mycredit.mycredit.ui.bases.input.PasswordRequirementsViewModel;

public abstract class PasswordRequirementsBinding extends ViewDataBinding {
  @Bindable
  protected PasswordRequirementsViewModel mViewModel;

  protected PasswordRequirementsBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setViewModel(@Nullable PasswordRequirementsViewModel viewModel);

  @Nullable
  public PasswordRequirementsViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static PasswordRequirementsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static PasswordRequirementsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<PasswordRequirementsBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.password_requirements, root, attachToRoot, component);
  }

  @NonNull
  public static PasswordRequirementsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static PasswordRequirementsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<PasswordRequirementsBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.password_requirements, null, false, component);
  }

  public static PasswordRequirementsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static PasswordRequirementsBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (PasswordRequirementsBinding)bind(component, view, ua.mycredit.mycredit.R.layout.password_requirements);
  }
}
