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
import ua.mycredit.mycredit.ui.bases.input.BaseSmsCodeViewModel;

public abstract class SmsCodeBinding extends ViewDataBinding {
  @Bindable
  protected BaseSmsCodeViewModel mViewModel;

  protected SmsCodeBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setViewModel(@Nullable BaseSmsCodeViewModel viewModel);

  @Nullable
  public BaseSmsCodeViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static SmsCodeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SmsCodeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SmsCodeBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.sms_code, root, attachToRoot, component);
  }

  @NonNull
  public static SmsCodeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SmsCodeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SmsCodeBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.sms_code, null, false, component);
  }

  public static SmsCodeBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static SmsCodeBinding bind(@NonNull View view, @Nullable DataBindingComponent component) {
    return (SmsCodeBinding)bind(component, view, ua.mycredit.mycredit.R.layout.sms_code);
  }
}
