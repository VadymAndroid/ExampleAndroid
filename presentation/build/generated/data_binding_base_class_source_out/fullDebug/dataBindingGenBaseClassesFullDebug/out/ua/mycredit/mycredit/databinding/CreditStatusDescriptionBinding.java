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
import android.widget.ImageView;
import android.widget.TextView;
import ua.mycredit.mycredit.ui.profile.credit.StatusViewModel;

public abstract class CreditStatusDescriptionBinding extends ViewDataBinding {
  @NonNull
  public final TextView briefDescription;

  @NonNull
  public final TextView detailedDescription;

  @NonNull
  public final ImageView divider;

  @NonNull
  public final ImageView statusIcon;

  @Bindable
  protected StatusViewModel mViewModel;

  protected CreditStatusDescriptionBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView briefDescription, TextView detailedDescription,
      ImageView divider, ImageView statusIcon) {
    super(_bindingComponent, _root, _localFieldCount);
    this.briefDescription = briefDescription;
    this.detailedDescription = detailedDescription;
    this.divider = divider;
    this.statusIcon = statusIcon;
  }

  public abstract void setViewModel(@Nullable StatusViewModel viewModel);

  @Nullable
  public StatusViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static CreditStatusDescriptionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static CreditStatusDescriptionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<CreditStatusDescriptionBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.credit_status_description, root, attachToRoot, component);
  }

  @NonNull
  public static CreditStatusDescriptionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static CreditStatusDescriptionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<CreditStatusDescriptionBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.credit_status_description, null, false, component);
  }

  public static CreditStatusDescriptionBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static CreditStatusDescriptionBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (CreditStatusDescriptionBinding)bind(component, view, ua.mycredit.mycredit.R.layout.credit_status_description);
  }
}
