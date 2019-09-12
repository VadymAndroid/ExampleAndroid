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
import ua.mycredit.mycredit.ui.bases.input.EnumPickerDialogFragment;

public abstract class DialogFragmentEnumPickerBinding extends ViewDataBinding {
  @Bindable
  protected EnumPickerDialogFragment mViewModel;

  protected DialogFragmentEnumPickerBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setViewModel(@Nullable EnumPickerDialogFragment viewModel);

  @Nullable
  public EnumPickerDialogFragment getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static DialogFragmentEnumPickerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static DialogFragmentEnumPickerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<DialogFragmentEnumPickerBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.dialog_fragment_enum_picker, root, attachToRoot, component);
  }

  @NonNull
  public static DialogFragmentEnumPickerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static DialogFragmentEnumPickerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<DialogFragmentEnumPickerBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.dialog_fragment_enum_picker, null, false, component);
  }

  public static DialogFragmentEnumPickerBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static DialogFragmentEnumPickerBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (DialogFragmentEnumPickerBinding)bind(component, view, ua.mycredit.mycredit.R.layout.dialog_fragment_enum_picker);
  }
}
