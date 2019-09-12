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

public abstract class InputPickerLayoutBinding extends ViewDataBinding {
  @Bindable
  protected int mTitle;

  @Bindable
  protected int mHintRes;

  @Bindable
  protected String mValue;

  @Bindable
  protected int mTitleIndex;

  @Bindable
  protected int mTitlesRes;

  @Bindable
  protected boolean mError;

  @Bindable
  protected View.OnClickListener mOnClick;

  protected InputPickerLayoutBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setTitle(int title);

  public int getTitle() {
    return mTitle;
  }

  public abstract void setHintRes(int hintRes);

  public int getHintRes() {
    return mHintRes;
  }

  public abstract void setValue(@Nullable String value);

  @Nullable
  public String getValue() {
    return mValue;
  }

  public abstract void setTitleIndex(int titleIndex);

  public int getTitleIndex() {
    return mTitleIndex;
  }

  public abstract void setTitlesRes(int titlesRes);

  public int getTitlesRes() {
    return mTitlesRes;
  }

  public abstract void setError(boolean error);

  public boolean getError() {
    return mError;
  }

  public abstract void setOnClick(@Nullable View.OnClickListener onClick);

  @Nullable
  public View.OnClickListener getOnClick() {
    return mOnClick;
  }

  @NonNull
  public static InputPickerLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static InputPickerLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<InputPickerLayoutBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.input_picker_layout, root, attachToRoot, component);
  }

  @NonNull
  public static InputPickerLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static InputPickerLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<InputPickerLayoutBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.input_picker_layout, null, false, component);
  }

  public static InputPickerLayoutBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static InputPickerLayoutBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (InputPickerLayoutBinding)bind(component, view, ua.mycredit.mycredit.R.layout.input_picker_layout);
  }
}
