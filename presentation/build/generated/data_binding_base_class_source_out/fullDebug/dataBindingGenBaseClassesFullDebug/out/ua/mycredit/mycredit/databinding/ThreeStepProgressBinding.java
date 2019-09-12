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

public abstract class ThreeStepProgressBinding extends ViewDataBinding {
  @Bindable
  protected int mStep;

  protected ThreeStepProgressBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setStep(int step);

  public int getStep() {
    return mStep;
  }

  @NonNull
  public static ThreeStepProgressBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ThreeStepProgressBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ThreeStepProgressBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.three_step_progress, root, attachToRoot, component);
  }

  @NonNull
  public static ThreeStepProgressBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ThreeStepProgressBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ThreeStepProgressBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.three_step_progress, null, false, component);
  }

  public static ThreeStepProgressBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ThreeStepProgressBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ThreeStepProgressBinding)bind(component, view, ua.mycredit.mycredit.R.layout.three_step_progress);
  }
}
