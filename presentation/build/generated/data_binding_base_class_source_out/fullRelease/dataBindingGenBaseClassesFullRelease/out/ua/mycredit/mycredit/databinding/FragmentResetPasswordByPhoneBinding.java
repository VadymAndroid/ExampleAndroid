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
import ua.mycredit.mycredit.ui.authentication.ResetPasswordByPhoneViewModel;

public abstract class FragmentResetPasswordByPhoneBinding extends ViewDataBinding {
  @Bindable
  protected ResetPasswordByPhoneViewModel mViewModel;

  protected FragmentResetPasswordByPhoneBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setViewModel(@Nullable ResetPasswordByPhoneViewModel viewModel);

  @Nullable
  public ResetPasswordByPhoneViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentResetPasswordByPhoneBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentResetPasswordByPhoneBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentResetPasswordByPhoneBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_reset_password_by_phone, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentResetPasswordByPhoneBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentResetPasswordByPhoneBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentResetPasswordByPhoneBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_reset_password_by_phone, null, false, component);
  }

  public static FragmentResetPasswordByPhoneBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentResetPasswordByPhoneBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentResetPasswordByPhoneBinding)bind(component, view, ua.mycredit.mycredit.R.layout.fragment_reset_password_by_phone);
  }
}
