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
import ua.mycredit.mycredit.ui.bases.input.TextDialogViewModel;

public abstract class InputTextPickerBinding extends ViewDataBinding {
  @Bindable
  protected TextDialogViewModel mViewModel;

  protected InputTextPickerBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setViewModel(@Nullable TextDialogViewModel viewModel);

  @Nullable
  public TextDialogViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static InputTextPickerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static InputTextPickerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<InputTextPickerBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.input_text_picker, root, attachToRoot, component);
  }

  @NonNull
  public static InputTextPickerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static InputTextPickerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<InputTextPickerBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.input_text_picker, null, false, component);
  }

  public static InputTextPickerBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static InputTextPickerBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (InputTextPickerBinding)bind(component, view, ua.mycredit.mycredit.R.layout.input_text_picker);
  }
}
