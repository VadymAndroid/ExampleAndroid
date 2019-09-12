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
import ua.mycredit.mycredit.ui.authentication.registration.passport.personal.ExtraPersonalInfoViewModel;

public abstract class FragmentExtraPersonalInfoBinding extends ViewDataBinding {
  @NonNull
  public final FbEmailBinding fbEmail;

  @Bindable
  protected ExtraPersonalInfoViewModel mViewModel;

  protected FragmentExtraPersonalInfoBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, FbEmailBinding fbEmail) {
    super(_bindingComponent, _root, _localFieldCount);
    this.fbEmail = fbEmail;
    setContainedBinding(this.fbEmail);;
  }

  public abstract void setViewModel(@Nullable ExtraPersonalInfoViewModel viewModel);

  @Nullable
  public ExtraPersonalInfoViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentExtraPersonalInfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentExtraPersonalInfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentExtraPersonalInfoBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_extra_personal_info, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentExtraPersonalInfoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentExtraPersonalInfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentExtraPersonalInfoBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_extra_personal_info, null, false, component);
  }

  public static FragmentExtraPersonalInfoBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentExtraPersonalInfoBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentExtraPersonalInfoBinding)bind(component, view, ua.mycredit.mycredit.R.layout.fragment_extra_personal_info);
  }
}
