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
import ua.mycredit.mycredit.ui.bases.input.PhoneInputDialogFragment;

public abstract class DialogFragmentPhoneBinding extends ViewDataBinding {
  @NonNull
  public final InputPhoneNumberBinding inputPhoneNumber;

  @Bindable
  protected PhoneInputDialogFragment mViewModel;

  protected DialogFragmentPhoneBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, InputPhoneNumberBinding inputPhoneNumber) {
    super(_bindingComponent, _root, _localFieldCount);
    this.inputPhoneNumber = inputPhoneNumber;
    setContainedBinding(this.inputPhoneNumber);;
  }

  public abstract void setViewModel(@Nullable PhoneInputDialogFragment viewModel);

  @Nullable
  public PhoneInputDialogFragment getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static DialogFragmentPhoneBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static DialogFragmentPhoneBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<DialogFragmentPhoneBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.dialog_fragment_phone, root, attachToRoot, component);
  }

  @NonNull
  public static DialogFragmentPhoneBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static DialogFragmentPhoneBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<DialogFragmentPhoneBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.dialog_fragment_phone, null, false, component);
  }

  public static DialogFragmentPhoneBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static DialogFragmentPhoneBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (DialogFragmentPhoneBinding)bind(component, view, ua.mycredit.mycredit.R.layout.dialog_fragment_phone);
  }
}
