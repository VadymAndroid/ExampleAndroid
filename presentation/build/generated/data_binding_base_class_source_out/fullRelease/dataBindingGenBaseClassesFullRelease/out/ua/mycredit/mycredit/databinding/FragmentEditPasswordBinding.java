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
import android.widget.ViewSwitcher;
import ua.mycredit.mycredit.ui.profile.profile.contacts.EditPasswordViewModel;

public abstract class FragmentEditPasswordBinding extends ViewDataBinding {
  @NonNull
  public final InputFieldBinding confirm;

  @NonNull
  public final InputFieldBinding newPassword;

  @NonNull
  public final InputFieldBinding oldPassword;

  @NonNull
  public final PasswordRequirementsBinding passwordRequirements;

  @NonNull
  public final ViewSwitcher viewSwitcher;

  @Bindable
  protected EditPasswordViewModel mViewModel;

  protected FragmentEditPasswordBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, InputFieldBinding confirm, InputFieldBinding newPassword,
      InputFieldBinding oldPassword, PasswordRequirementsBinding passwordRequirements,
      ViewSwitcher viewSwitcher) {
    super(_bindingComponent, _root, _localFieldCount);
    this.confirm = confirm;
    setContainedBinding(this.confirm);;
    this.newPassword = newPassword;
    setContainedBinding(this.newPassword);;
    this.oldPassword = oldPassword;
    setContainedBinding(this.oldPassword);;
    this.passwordRequirements = passwordRequirements;
    setContainedBinding(this.passwordRequirements);;
    this.viewSwitcher = viewSwitcher;
  }

  public abstract void setViewModel(@Nullable EditPasswordViewModel viewModel);

  @Nullable
  public EditPasswordViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentEditPasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentEditPasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentEditPasswordBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_edit_password, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentEditPasswordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentEditPasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentEditPasswordBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_edit_password, null, false, component);
  }

  public static FragmentEditPasswordBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentEditPasswordBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentEditPasswordBinding)bind(component, view, ua.mycredit.mycredit.R.layout.fragment_edit_password);
  }
}
