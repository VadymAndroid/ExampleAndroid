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
import ua.mycredit.mycredit.ui.authentication.registration.passport.address.SignUpAddressViewModel;

public abstract class FragmentSignUpAddressBinding extends ViewDataBinding {
  @Bindable
  protected SignUpAddressViewModel mViewModel;

  protected FragmentSignUpAddressBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setViewModel(@Nullable SignUpAddressViewModel viewModel);

  @Nullable
  public SignUpAddressViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentSignUpAddressBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentSignUpAddressBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentSignUpAddressBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_sign_up_address, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSignUpAddressBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentSignUpAddressBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentSignUpAddressBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_sign_up_address, null, false, component);
  }

  public static FragmentSignUpAddressBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentSignUpAddressBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentSignUpAddressBinding)bind(component, view, ua.mycredit.mycredit.R.layout.fragment_sign_up_address);
  }
}
