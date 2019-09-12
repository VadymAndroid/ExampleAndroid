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
import ua.mycredit.mycredit.ui.authentication.SignInViewModel;

public abstract class FragmentSignInBinding extends ViewDataBinding {
  @Bindable
  protected SignInViewModel mViewModel;

  protected FragmentSignInBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setViewModel(@Nullable SignInViewModel viewModel);

  @Nullable
  public SignInViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentSignInBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentSignInBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentSignInBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_sign_in, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSignInBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentSignInBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentSignInBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_sign_in, null, false, component);
  }

  public static FragmentSignInBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentSignInBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentSignInBinding)bind(component, view, ua.mycredit.mycredit.R.layout.fragment_sign_in);
  }
}
