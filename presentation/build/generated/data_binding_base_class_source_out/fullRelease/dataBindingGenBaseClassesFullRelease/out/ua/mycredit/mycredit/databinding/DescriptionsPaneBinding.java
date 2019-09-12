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

public abstract class DescriptionsPaneBinding extends ViewDataBinding {
  @NonNull
  public final TextView briefDescription;

  @NonNull
  public final TextView detailedDescription;

  @NonNull
  public final ImageView divider;

  @NonNull
  public final ImageView statusIcon;

  @Bindable
  protected String mBrief;

  @Bindable
  protected String mDetail;

  protected DescriptionsPaneBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView briefDescription, TextView detailedDescription,
      ImageView divider, ImageView statusIcon) {
    super(_bindingComponent, _root, _localFieldCount);
    this.briefDescription = briefDescription;
    this.detailedDescription = detailedDescription;
    this.divider = divider;
    this.statusIcon = statusIcon;
  }

  public abstract void setBrief(@Nullable String brief);

  @Nullable
  public String getBrief() {
    return mBrief;
  }

  public abstract void setDetail(@Nullable String detail);

  @Nullable
  public String getDetail() {
    return mDetail;
  }

  @NonNull
  public static DescriptionsPaneBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static DescriptionsPaneBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<DescriptionsPaneBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.descriptions_pane, root, attachToRoot, component);
  }

  @NonNull
  public static DescriptionsPaneBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static DescriptionsPaneBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<DescriptionsPaneBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.descriptions_pane, null, false, component);
  }

  public static DescriptionsPaneBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static DescriptionsPaneBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (DescriptionsPaneBinding)bind(component, view, ua.mycredit.mycredit.R.layout.descriptions_pane);
  }
}
