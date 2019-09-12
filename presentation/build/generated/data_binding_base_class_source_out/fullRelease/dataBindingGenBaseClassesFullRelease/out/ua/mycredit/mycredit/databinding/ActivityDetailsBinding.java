package ua.mycredit.mycredit.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ua.mycredit.mycredit.ui.profile.profile.details.DetailsActivity;

public abstract class ActivityDetailsBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final ViewPager detailsViewPager;

  @NonNull
  public final TabLayout tabs;

  @NonNull
  public final Toolbar toolbar;

  @Bindable
  protected DetailsActivity mViewModel;

  protected ActivityDetailsBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AppBarLayout appbar, ViewPager detailsViewPager, TabLayout tabs,
      Toolbar toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appbar = appbar;
    this.detailsViewPager = detailsViewPager;
    this.tabs = tabs;
    this.toolbar = toolbar;
  }

  public abstract void setViewModel(@Nullable DetailsActivity viewModel);

  @Nullable
  public DetailsActivity getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivityDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityDetailsBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.activity_details, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityDetailsBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.activity_details, null, false, component);
  }

  public static ActivityDetailsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityDetailsBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityDetailsBinding)bind(component, view, ua.mycredit.mycredit.R.layout.activity_details);
  }
}
