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

public abstract class RequirementBinding extends ViewDataBinding {
  @Bindable
  protected String mTitle;

  @Bindable
  protected boolean mSatisfied;

  protected RequirementBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setTitle(@Nullable String title);

  @Nullable
  public String getTitle() {
    return mTitle;
  }

  public abstract void setSatisfied(boolean satisfied);

  public boolean getSatisfied() {
    return mSatisfied;
  }

  @NonNull
  public static RequirementBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static RequirementBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<RequirementBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.requirement, root, attachToRoot, component);
  }

  @NonNull
  public static RequirementBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static RequirementBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<RequirementBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.requirement, null, false, component);
  }

  public static RequirementBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static RequirementBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (RequirementBinding)bind(component, view, ua.mycredit.mycredit.R.layout.requirement);
  }
}
