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
import ua.mycredit.mycredit.ui.authentication.registration.passport.personal.PersonalDataViewModel;

public abstract class FragmentPersonalDataBinding extends ViewDataBinding {
  @Bindable
  protected PersonalDataViewModel mViewModel;

  protected FragmentPersonalDataBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setViewModel(@Nullable PersonalDataViewModel viewModel);

  @Nullable
  public PersonalDataViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentPersonalDataBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentPersonalDataBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentPersonalDataBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_personal_data, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentPersonalDataBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentPersonalDataBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentPersonalDataBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_personal_data, null, false, component);
  }

  public static FragmentPersonalDataBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentPersonalDataBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentPersonalDataBinding)bind(component, view, ua.mycredit.mycredit.R.layout.fragment_personal_data);
  }
}
