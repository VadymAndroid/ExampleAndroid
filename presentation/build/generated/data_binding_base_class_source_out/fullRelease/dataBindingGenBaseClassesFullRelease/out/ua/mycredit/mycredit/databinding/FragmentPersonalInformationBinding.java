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
import ua.mycredit.mycredit.ui.authentication.registration.passport.personal.PersonalInfoViewModel;

public abstract class FragmentPersonalInformationBinding extends ViewDataBinding {
  @Bindable
  protected PersonalInfoViewModel mViewModel;

  protected FragmentPersonalInformationBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setViewModel(@Nullable PersonalInfoViewModel viewModel);

  @Nullable
  public PersonalInfoViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentPersonalInformationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentPersonalInformationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentPersonalInformationBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_personal_information, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentPersonalInformationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentPersonalInformationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentPersonalInformationBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_personal_information, null, false, component);
  }

  public static FragmentPersonalInformationBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentPersonalInformationBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentPersonalInformationBinding)bind(component, view, ua.mycredit.mycredit.R.layout.fragment_personal_information);
  }
}
