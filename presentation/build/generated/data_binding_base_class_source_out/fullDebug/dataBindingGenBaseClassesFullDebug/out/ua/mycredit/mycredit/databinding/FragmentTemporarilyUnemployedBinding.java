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
import ua.mycredit.mycredit.ui.authentication.registration.ocupation.TemporarilyUnemployedViewModel;

public abstract class FragmentTemporarilyUnemployedBinding extends ViewDataBinding {
  @Bindable
  protected TemporarilyUnemployedViewModel mViewModel;

  protected FragmentTemporarilyUnemployedBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setViewModel(@Nullable TemporarilyUnemployedViewModel viewModel);

  @Nullable
  public TemporarilyUnemployedViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentTemporarilyUnemployedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentTemporarilyUnemployedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentTemporarilyUnemployedBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_temporarily_unemployed, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentTemporarilyUnemployedBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentTemporarilyUnemployedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentTemporarilyUnemployedBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_temporarily_unemployed, null, false, component);
  }

  public static FragmentTemporarilyUnemployedBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentTemporarilyUnemployedBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentTemporarilyUnemployedBinding)bind(component, view, ua.mycredit.mycredit.R.layout.fragment_temporarily_unemployed);
  }
}
