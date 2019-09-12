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
import android.widget.TextView;
import ua.mycredit.mycredit.ui.profile.profile.ProlongationPreferencesViewModel;

public abstract class FragmentProlongationPreferencesBinding extends ViewDataBinding {
  @NonNull
  public final TextView titleFinalDateSelection;

  @Bindable
  protected ProlongationPreferencesViewModel mViewModel;

  protected FragmentProlongationPreferencesBinding(DataBindingComponent _bindingComponent,
      View _root, int _localFieldCount, TextView titleFinalDateSelection) {
    super(_bindingComponent, _root, _localFieldCount);
    this.titleFinalDateSelection = titleFinalDateSelection;
  }

  public abstract void setViewModel(@Nullable ProlongationPreferencesViewModel viewModel);

  @Nullable
  public ProlongationPreferencesViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentProlongationPreferencesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentProlongationPreferencesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentProlongationPreferencesBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_prolongation_preferences, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentProlongationPreferencesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentProlongationPreferencesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentProlongationPreferencesBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_prolongation_preferences, null, false, component);
  }

  public static FragmentProlongationPreferencesBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentProlongationPreferencesBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentProlongationPreferencesBinding)bind(component, view, ua.mycredit.mycredit.R.layout.fragment_prolongation_preferences);
  }
}
