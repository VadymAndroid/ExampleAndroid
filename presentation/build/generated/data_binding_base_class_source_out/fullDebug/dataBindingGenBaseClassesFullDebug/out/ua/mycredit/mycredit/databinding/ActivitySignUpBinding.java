package ua.mycredit.mycredit.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ua.mycredit.mycredit.ui.authentication.registration.SignUpActivity;
import ua.mycredit.mycredit.ui.custom.progress.PercentageProgress;

public abstract class ActivitySignUpBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appBar;

  @NonNull
  public final CardView calculatorFAB;

  @NonNull
  public final FrameLayout fragmentContainer;

  @NonNull
  public final Button nextButton;

  @NonNull
  public final LinearLayout nextButtonLinearLayout;

  @NonNull
  public final PercentageProgress percentageProgress;

  @NonNull
  public final NestedScrollView scrollView;

  @NonNull
  public final CoordinatorLayout signUpCoordinator;

  @NonNull
  public final TextView signUpMinutesLeft;

  @NonNull
  public final Toolbar toolbar;

  @Bindable
  protected SignUpActivity mViewModel;

  protected ActivitySignUpBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AppBarLayout appBar, CardView calculatorFAB,
      FrameLayout fragmentContainer, Button nextButton, LinearLayout nextButtonLinearLayout,
      PercentageProgress percentageProgress, NestedScrollView scrollView,
      CoordinatorLayout signUpCoordinator, TextView signUpMinutesLeft, Toolbar toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appBar = appBar;
    this.calculatorFAB = calculatorFAB;
    this.fragmentContainer = fragmentContainer;
    this.nextButton = nextButton;
    this.nextButtonLinearLayout = nextButtonLinearLayout;
    this.percentageProgress = percentageProgress;
    this.scrollView = scrollView;
    this.signUpCoordinator = signUpCoordinator;
    this.signUpMinutesLeft = signUpMinutesLeft;
    this.toolbar = toolbar;
  }

  public abstract void setViewModel(@Nullable SignUpActivity viewModel);

  @Nullable
  public SignUpActivity getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivitySignUpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivitySignUpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivitySignUpBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.activity_sign_up, root, attachToRoot, component);
  }

  @NonNull
  public static ActivitySignUpBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivitySignUpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivitySignUpBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.activity_sign_up, null, false, component);
  }

  public static ActivitySignUpBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivitySignUpBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivitySignUpBinding)bind(component, view, ua.mycredit.mycredit.R.layout.activity_sign_up);
  }
}
