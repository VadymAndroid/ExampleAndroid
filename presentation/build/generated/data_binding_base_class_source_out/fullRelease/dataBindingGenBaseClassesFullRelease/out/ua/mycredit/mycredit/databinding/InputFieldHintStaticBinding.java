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
import ua.mycredit.mycredit.ui.bases.input.FieldViewModel;

public abstract class InputFieldHintStaticBinding extends ViewDataBinding {
  @Bindable
  protected FieldViewModel mViewModel;

  @Bindable
  protected String mHintStatic;

  protected InputFieldHintStaticBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setViewModel(@Nullable FieldViewModel viewModel);

  @Nullable
  public FieldViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setHintStatic(@Nullable String hintStatic);

  @Nullable
  public String getHintStatic() {
    return mHintStatic;
  }

  @NonNull
  public static InputFieldHintStaticBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static InputFieldHintStaticBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<InputFieldHintStaticBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.input_field_hint_static, root, attachToRoot, component);
  }

  @NonNull
  public static InputFieldHintStaticBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static InputFieldHintStaticBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<InputFieldHintStaticBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.input_field_hint_static, null, false, component);
  }

  public static InputFieldHintStaticBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static InputFieldHintStaticBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (InputFieldHintStaticBinding)bind(component, view, ua.mycredit.mycredit.R.layout.input_field_hint_static);
  }
}
