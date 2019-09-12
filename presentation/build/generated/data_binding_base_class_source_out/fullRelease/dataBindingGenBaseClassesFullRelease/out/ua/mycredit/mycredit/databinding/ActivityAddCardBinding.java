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
import ua.mycredit.mycredit.ui.profile.cards.AddCardActivity;

public abstract class ActivityAddCardBinding extends ViewDataBinding {
  @NonNull
  public final FrameLayout fragmentContainer;

  @Bindable
  protected AddCardActivity mViewModel;

  protected ActivityAddCardBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, FrameLayout fragmentContainer) {
    super(_bindingComponent, _root, _localFieldCount);
    this.fragmentContainer = fragmentContainer;
  }

  public abstract void setViewModel(@Nullable AddCardActivity viewModel);

  @Nullable
  public AddCardActivity getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivityAddCardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityAddCardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityAddCardBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.activity_add_card, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityAddCardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityAddCardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityAddCardBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.activity_add_card, null, false, component);
  }

  public static ActivityAddCardBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityAddCardBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityAddCardBinding)bind(component, view, ua.mycredit.mycredit.R.layout.activity_add_card);
  }
}
