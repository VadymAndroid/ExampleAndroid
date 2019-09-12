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
import android.widget.Button;
import android.widget.TextView;
import ua.mycredit.mycredit.ui.delegates.FbEmail;

public abstract class FbEmailBinding extends ViewDataBinding {
  @NonNull
  public final InputFieldBinding email;

  @NonNull
  public final TextView facebookDesc;

  @NonNull
  public final Button loginButton;

  @Bindable
  protected FbEmail mViewModel;

  protected FbEmailBinding(DataBindingComponent _bindingComponent, View _root, int _localFieldCount,
      InputFieldBinding email, TextView facebookDesc, Button loginButton) {
    super(_bindingComponent, _root, _localFieldCount);
    this.email = email;
    setContainedBinding(this.email);;
    this.facebookDesc = facebookDesc;
    this.loginButton = loginButton;
  }

  public abstract void setViewModel(@Nullable FbEmail viewModel);

  @Nullable
  public FbEmail getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FbEmailBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FbEmailBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FbEmailBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fb_email, root, attachToRoot, component);
  }

  @NonNull
  public static FbEmailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FbEmailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FbEmailBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fb_email, null, false, component);
  }

  public static FbEmailBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FbEmailBinding bind(@NonNull View view, @Nullable DataBindingComponent component) {
    return (FbEmailBinding)bind(component, view, ua.mycredit.mycredit.R.layout.fb_email);
  }
}
