package ua.mycredit.mycredit.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ua.mycredit.mycredit.ui.bases.action.SetupToolbarAction;

public abstract class ToolbarBinding extends ViewDataBinding {
  @NonNull
  public final Toolbar toolbar;

  @Bindable
  protected SetupToolbarAction mViewModel;

  protected ToolbarBinding(DataBindingComponent _bindingComponent, View _root, int _localFieldCount,
      Toolbar toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.toolbar = toolbar;
  }

  public abstract void setViewModel(@Nullable SetupToolbarAction viewModel);

  @Nullable
  public SetupToolbarAction getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ToolbarBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ToolbarBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ToolbarBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.toolbar, root, attachToRoot, component);
  }

  @NonNull
  public static ToolbarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ToolbarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ToolbarBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.toolbar, null, false, component);
  }

  public static ToolbarBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ToolbarBinding bind(@NonNull View view, @Nullable DataBindingComponent component) {
    return (ToolbarBinding)bind(component, view, ua.mycredit.mycredit.R.layout.toolbar);
  }
}
