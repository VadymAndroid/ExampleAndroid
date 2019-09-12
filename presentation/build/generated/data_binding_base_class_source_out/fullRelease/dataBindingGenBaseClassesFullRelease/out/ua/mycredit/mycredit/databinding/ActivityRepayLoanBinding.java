package ua.mycredit.mycredit.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import ua.mycredit.mycredit.ui.profile.repayloan.RepayLoanActivity;

public abstract class ActivityRepayLoanBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appBar;

  @NonNull
  public final Button bottomButton;

  @NonNull
  public final TextView choosePaymentMethod;

  @NonNull
  public final LinearLayout tabs;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final ViewPager viewPagerRepay;

  @Bindable
  protected RepayLoanActivity mViewModel;

  protected ActivityRepayLoanBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AppBarLayout appBar, Button bottomButton, TextView choosePaymentMethod,
      LinearLayout tabs, Toolbar toolbar, ViewPager viewPagerRepay) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appBar = appBar;
    this.bottomButton = bottomButton;
    this.choosePaymentMethod = choosePaymentMethod;
    this.tabs = tabs;
    this.toolbar = toolbar;
    this.viewPagerRepay = viewPagerRepay;
  }

  public abstract void setViewModel(@Nullable RepayLoanActivity viewModel);

  @Nullable
  public RepayLoanActivity getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivityRepayLoanBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityRepayLoanBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityRepayLoanBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.activity_repay_loan, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityRepayLoanBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityRepayLoanBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityRepayLoanBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.activity_repay_loan, null, false, component);
  }

  public static ActivityRepayLoanBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityRepayLoanBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityRepayLoanBinding)bind(component, view, ua.mycredit.mycredit.R.layout.activity_repay_loan);
  }
}
