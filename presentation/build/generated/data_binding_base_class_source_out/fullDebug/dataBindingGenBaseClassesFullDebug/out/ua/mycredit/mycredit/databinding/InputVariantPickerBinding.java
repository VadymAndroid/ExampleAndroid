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
import ua.mycredit.mycredit.ui.bases.input.PickerDialogViewModel;

public abstract class InputVariantPickerBinding extends ViewDataBinding {
  @Bindable
  protected PickerDialogViewModel mViewModel;

  protected InputVariantPickerBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setViewModel(@Nullable PickerDialogViewModel viewModel);

  @Nullable
  public PickerDialogViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static InputVariantPickerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static InputVariantPickerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<InputVariantPickerBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.input_variant_picker, root, attachToRoot, component);
  }

  @NonNull
  public static InputVariantPickerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static InputVariantPickerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<InputVariantPickerBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.input_variant_picker, null, false, component);
  }

  public static InputVariantPickerBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static InputVariantPickerBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (InputVariantPickerBinding)bind(component, view, ua.mycredit.mycredit.R.layout.input_variant_picker);
  }
}
