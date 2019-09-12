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
import ua.mycredit.mycredit.ui.profile.cards.CardSmsConfirmationViewModel;

public abstract class FragmentCardSmsConfirmationBinding extends ViewDataBinding {
  @Bindable
  protected CardSmsConfirmationViewModel mViewModel;

  protected FragmentCardSmsConfirmationBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setViewModel(@Nullable CardSmsConfirmationViewModel viewModel);

  @Nullable
  public CardSmsConfirmationViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentCardSmsConfirmationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentCardSmsConfirmationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentCardSmsConfirmationBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_card_sms_confirmation, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentCardSmsConfirmationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentCardSmsConfirmationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentCardSmsConfirmationBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_card_sms_confirmation, null, false, component);
  }

  public static FragmentCardSmsConfirmationBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentCardSmsConfirmationBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentCardSmsConfirmationBinding)bind(component, view, ua.mycredit.mycredit.R.layout.fragment_card_sms_confirmation);
  }
}
