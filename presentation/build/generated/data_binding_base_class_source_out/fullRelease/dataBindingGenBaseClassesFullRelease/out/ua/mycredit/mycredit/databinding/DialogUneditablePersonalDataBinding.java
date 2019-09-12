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
import ua.mycredit.mycredit.ui.profile.profile.details.UneditablePersonalDataDialog;

public abstract class DialogUneditablePersonalDataBinding extends ViewDataBinding {
  @Bindable
  protected UneditablePersonalDataDialog mViewModel;

  protected DialogUneditablePersonalDataBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setViewModel(@Nullable UneditablePersonalDataDialog viewModel);

  @Nullable
  public UneditablePersonalDataDialog getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static DialogUneditablePersonalDataBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static DialogUneditablePersonalDataBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<DialogUneditablePersonalDataBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.dialog_uneditable_personal_data, root, attachToRoot, component);
  }

  @NonNull
  public static DialogUneditablePersonalDataBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static DialogUneditablePersonalDataBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<DialogUneditablePersonalDataBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.dialog_uneditable_personal_data, null, false, component);
  }

  public static DialogUneditablePersonalDataBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static DialogUneditablePersonalDataBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (DialogUneditablePersonalDataBinding)bind(component, view, ua.mycredit.mycredit.R.layout.dialog_uneditable_personal_data);
  }
}
