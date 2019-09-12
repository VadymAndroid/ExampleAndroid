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
import android.widget.ImageView;
import android.widget.TextView;
import ua.mycredit.mycredit.ui.authentication.registration.signup.PasswordViewModel;

public abstract class FragmentPasswordBinding extends ViewDataBinding {
  @NonNull
  public final ImageView editPhone;

  @NonNull
  public final FbEmailBinding fbEmail;

  @NonNull
  public final InputFieldBinding password;

  @NonNull
  public final TextView phone;

  @Bindable
  protected PasswordViewModel mViewModel;

  protected FragmentPasswordBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ImageView editPhone, FbEmailBinding fbEmail, InputFieldBinding password,
      TextView phone) {
    super(_bindingComponent, _root, _localFieldCount);
    this.editPhone = editPhone;
    this.fbEmail = fbEmail;
    setContainedBinding(this.fbEmail);;
    this.password = password;
    setContainedBinding(this.password);;
    this.phone = phone;
  }

  public abstract void setViewModel(@Nullable PasswordViewModel viewModel);

  @Nullable
  public PasswordViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentPasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentPasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentPasswordBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_password, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentPasswordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentPasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentPasswordBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_password, null, false, component);
  }

  public static FragmentPasswordBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentPasswordBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentPasswordBinding)bind(component, view, ua.mycredit.mycredit.R.layout.fragment_password);
  }
}
