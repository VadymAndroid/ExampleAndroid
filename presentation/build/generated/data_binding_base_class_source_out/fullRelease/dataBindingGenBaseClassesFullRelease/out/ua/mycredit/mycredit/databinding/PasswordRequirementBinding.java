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

public abstract class PasswordRequirementBinding extends ViewDataBinding {
  @Bindable
  protected PasswordRequirementsViewModel.PasswordRequirement mRequirement;

  @Bindable
  protected int mRequirements;

  protected PasswordRequirementBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setRequirement(@Nullable PasswordRequirementsViewModel.PasswordRequirement requirement);

  @Nullable
  public PasswordRequirementsViewModel.PasswordRequirement getRequirement() {
    return mRequirement;
  }

  public abstract void setRequirements(int requirements);

  public int getRequirements() {
    return mRequirements;
  }

  @NonNull
  public static PasswordRequirementBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static PasswordRequirementBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<PasswordRequirementBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.password_requirement, root, attachToRoot, component);
  }

  @NonNull
  public static PasswordRequirementBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static PasswordRequirementBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<PasswordRequirementBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.password_requirement, null, false, component);
  }

  public static PasswordRequirementBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static PasswordRequirementBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (PasswordRequirementBinding)bind(component, view, ua.mycredit.mycredit.R.layout.password_requirement);
  }
}
