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

public abstract class SimpleButtonBinding extends ViewDataBinding {
  @Bindable
  protected String mText;

  @Bindable
  protected boolean mPrimary;

  @Bindable
  protected View.OnClickListener mOnClick;

  protected SimpleButtonBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setText(@Nullable String text);

  @Nullable
  public String getText() {
    return mText;
  }

  public abstract void setPrimary(boolean primary);

  public boolean getPrimary() {
    return mPrimary;
  }

  public abstract void setOnClick(@Nullable View.OnClickListener onClick);

  @Nullable
  public View.OnClickListener getOnClick() {
    return mOnClick;
  }

  @NonNull
  public static SimpleButtonBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SimpleButtonBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SimpleButtonBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.simple_button, root, attachToRoot, component);
  }

  @NonNull
  public static SimpleButtonBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SimpleButtonBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SimpleButtonBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.simple_button, null, false, component);
  }

  public static SimpleButtonBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static SimpleButtonBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (SimpleButtonBinding)bind(component, view, ua.mycredit.mycredit.R.layout.simple_button);
  }
}
