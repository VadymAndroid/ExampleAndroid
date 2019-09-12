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
import ua.mycredit.mycredit.ui.authentication.registration.passport.passport.PassportViewModel;

public abstract class FragmentPassportBinding extends ViewDataBinding {
  @Bindable
  protected PassportViewModel mViewModel;

  protected FragmentPassportBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setViewModel(@Nullable PassportViewModel viewModel);

  @Nullable
  public PassportViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentPassportBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentPassportBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentPassportBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_passport, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentPassportBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentPassportBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentPassportBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_passport, null, false, component);
  }

  public static FragmentPassportBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentPassportBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentPassportBinding)bind(component, view, ua.mycredit.mycredit.R.layout.fragment_passport);
  }
}
