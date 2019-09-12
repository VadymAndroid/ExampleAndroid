package ua.mycredit.mycredit.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ua.mycredit.mycredit.ui.authentication.registration.phone.SignUpPhoneViewModel;

public abstract class FragmentSignUpPhoneBinding extends ViewDataBinding {
  @NonNull
  public final TextView enterOtherNumber;

  @NonNull
  public final TextView forgotPassword;

  @NonNull
  public final CardView phoneContainer;

  @NonNull
  public final TextView phoneTitle;

  @Bindable
  protected SignUpPhoneViewModel mViewModel;

  protected FragmentSignUpPhoneBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView enterOtherNumber, TextView forgotPassword,
      CardView phoneContainer, TextView phoneTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.enterOtherNumber = enterOtherNumber;
    this.forgotPassword = forgotPassword;
    this.phoneContainer = phoneContainer;
    this.phoneTitle = phoneTitle;
  }

  public abstract void setViewModel(@Nullable SignUpPhoneViewModel viewModel);

  @Nullable
  public SignUpPhoneViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentSignUpPhoneBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentSignUpPhoneBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentSignUpPhoneBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_sign_up_phone, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSignUpPhoneBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentSignUpPhoneBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentSignUpPhoneBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_sign_up_phone, null, false, component);
  }

  public static FragmentSignUpPhoneBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentSignUpPhoneBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentSignUpPhoneBinding)bind(component, view, ua.mycredit.mycredit.R.layout.fragment_sign_up_phone);
  }
}
