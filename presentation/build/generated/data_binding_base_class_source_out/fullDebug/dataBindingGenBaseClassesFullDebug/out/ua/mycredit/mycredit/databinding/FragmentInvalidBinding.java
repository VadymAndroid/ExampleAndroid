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
import ua.mycredit.mycredit.ui.authentication.registration.ocupation.InvalidViewModel;

public abstract class FragmentInvalidBinding extends ViewDataBinding {
  @Bindable
  protected InvalidViewModel mViewModel;

  protected FragmentInvalidBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setViewModel(@Nullable InvalidViewModel viewModel);

  @Nullable
  public InvalidViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentInvalidBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentInvalidBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentInvalidBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_invalid, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentInvalidBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentInvalidBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentInvalidBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_invalid, null, false, component);
  }

  public static FragmentInvalidBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentInvalidBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentInvalidBinding)bind(component, view, ua.mycredit.mycredit.R.layout.fragment_invalid);
  }
}
