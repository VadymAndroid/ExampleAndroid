package ua.mycredit.mycredit.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationViewPager;
import ua.mycredit.mycredit.ui.profile.ProfileActivity;

public abstract class ActivityProfileBinding extends ViewDataBinding {
  @NonNull
  public final AHBottomNavigation bottomNavigationView;

  @NonNull
  public final FloatingActionButton chatList;

  @NonNull
  public final AHBottomNavigationViewPager fragmentViewPager;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final FloatingActionButton messenger;

  @NonNull
  public final FloatingActionButton telegram;

  @NonNull
  public final Button toolbarButton;

  @NonNull
  public final FloatingActionButton viber;

  @Bindable
  protected ProfileActivity mViewModel;

  protected ActivityProfileBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AHBottomNavigation bottomNavigationView, FloatingActionButton chatList,
      AHBottomNavigationViewPager fragmentViewPager, LinearLayout linearLayout,
      FloatingActionButton messenger, FloatingActionButton telegram, Button toolbarButton,
      FloatingActionButton viber) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bottomNavigationView = bottomNavigationView;
    this.chatList = chatList;
    this.fragmentViewPager = fragmentViewPager;
    this.linearLayout = linearLayout;
    this.messenger = messenger;
    this.telegram = telegram;
    this.toolbarButton = toolbarButton;
    this.viber = viber;
  }

  public abstract void setViewModel(@Nullable ProfileActivity viewModel);

  @Nullable
  public ProfileActivity getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivityProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityProfileBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.activity_profile, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityProfileBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.activity_profile, null, false, component);
  }

  public static ActivityProfileBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityProfileBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityProfileBinding)bind(component, view, ua.mycredit.mycredit.R.layout.activity_profile);
  }
}
