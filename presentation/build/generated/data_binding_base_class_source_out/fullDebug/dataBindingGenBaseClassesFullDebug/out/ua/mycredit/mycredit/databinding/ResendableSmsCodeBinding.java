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
import android.widget.TextView;
import ua.mycredit.mycredit.ui.bases.input.ResendableSmsCodeViewModel;

public abstract class ResendableSmsCodeBinding extends ViewDataBinding {
  @NonNull
  public final TextView enterOtherNumber;

  @NonNull
  public final TextView resend;

  @Bindable
  protected ResendableSmsCodeViewModel mViewModel;

  protected ResendableSmsCodeBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView enterOtherNumber, TextView resend) {
    super(_bindingComponent, _root, _localFieldCount);
    this.enterOtherNumber = enterOtherNumber;
    this.resend = resend;
  }

  public abstract void setViewModel(@Nullable ResendableSmsCodeViewModel viewModel);

  @Nullable
  public ResendableSmsCodeViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ResendableSmsCodeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ResendableSmsCodeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ResendableSmsCodeBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.resendable_sms_code, root, attachToRoot, component);
  }

  @NonNull
  public static ResendableSmsCodeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ResendableSmsCodeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ResendableSmsCodeBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.resendable_sms_code, null, false, component);
  }

  public static ResendableSmsCodeBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ResendableSmsCodeBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ResendableSmsCodeBinding)bind(component, view, ua.mycredit.mycredit.R.layout.resendable_sms_code);
  }
}
