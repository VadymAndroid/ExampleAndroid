package ua.mycredit.mycredit.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ua.mycredit.mycredit.ui.bases.action.WithRefresh;

public abstract class SwipeRefreshLayoutBinding extends ViewDataBinding {
  @NonNull
  public final SwipeRefreshLayout swipeRefreshLayout;

  @Bindable
  protected WithRefresh mViewModel;

  protected SwipeRefreshLayoutBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, SwipeRefreshLayout swipeRefreshLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.swipeRefreshLayout = swipeRefreshLayout;
  }

  public abstract void setViewModel(@Nullable WithRefresh viewModel);

  @Nullable
  public WithRefresh getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static SwipeRefreshLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SwipeRefreshLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SwipeRefreshLayoutBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.swipe_refresh_layout, root, attachToRoot, component);
  }

  @NonNull
  public static SwipeRefreshLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SwipeRefreshLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SwipeRefreshLayoutBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.swipe_refresh_layout, null, false, component);
  }

  public static SwipeRefreshLayoutBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static SwipeRefreshLayoutBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (SwipeRefreshLayoutBinding)bind(component, view, ua.mycredit.mycredit.R.layout.swipe_refresh_layout);
  }
}
