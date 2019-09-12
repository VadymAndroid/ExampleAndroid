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
import android.widget.FrameLayout;
import ua.mycredit.mycredit.ui.bases.BaseViewModel;

public abstract class PreloaderBinding extends ViewDataBinding {
  @NonNull
  public final FrameLayout viewSwitcherContent;

  @Bindable
  protected BaseViewModel mViewModel;

  protected PreloaderBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, FrameLayout viewSwitcherContent) {
    super(_bindingComponent, _root, _localFieldCount);
    this.viewSwitcherContent = viewSwitcherContent;
  }

  public abstract void setViewModel(@Nullable BaseViewModel viewModel);

  @Nullable
  public BaseViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static PreloaderBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static PreloaderBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<PreloaderBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.preloader, root, attachToRoot, component);
  }

  @NonNull
  public static PreloaderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static PreloaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<PreloaderBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.preloader, null, false, component);
  }

  public static PreloaderBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static PreloaderBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (PreloaderBinding)bind(component, view, ua.mycredit.mycredit.R.layout.preloader);
  }
}
