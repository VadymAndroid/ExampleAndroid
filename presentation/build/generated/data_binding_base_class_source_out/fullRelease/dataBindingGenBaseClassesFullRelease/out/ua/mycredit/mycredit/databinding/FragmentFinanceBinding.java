package ua.mycredit.mycredit.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.SwitchCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ua.mycredit.mycredit.ui.authentication.registration.finance.FinanceViewModel;

public abstract class FragmentFinanceBinding extends ViewDataBinding {
  @NonNull
  public final SwitchCompat dataProcessAllowed;

  @NonNull
  public final SwitchCompat mailSubscription;

  @Bindable
  protected FinanceViewModel mViewModel;

  protected FragmentFinanceBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, SwitchCompat dataProcessAllowed, SwitchCompat mailSubscription) {
    super(_bindingComponent, _root, _localFieldCount);
    this.dataProcessAllowed = dataProcessAllowed;
    this.mailSubscription = mailSubscription;
  }

  public abstract void setViewModel(@Nullable FinanceViewModel viewModel);

  @Nullable
  public FinanceViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentFinanceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentFinanceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentFinanceBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_finance, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentFinanceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentFinanceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentFinanceBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_finance, null, false, component);
  }

  public static FragmentFinanceBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentFinanceBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentFinanceBinding)bind(component, view, ua.mycredit.mycredit.R.layout.fragment_finance);
  }
}
