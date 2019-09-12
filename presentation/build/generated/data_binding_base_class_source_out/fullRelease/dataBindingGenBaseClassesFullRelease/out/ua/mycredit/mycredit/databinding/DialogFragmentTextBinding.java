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
import ua.mycredit.mycredit.ui.bases.input.TextInputDialogFragment;

public abstract class DialogFragmentTextBinding extends ViewDataBinding {
  @NonNull
  public final InputFieldBinding inputField;

  @Bindable
  protected TextInputDialogFragment mViewModel;

  protected DialogFragmentTextBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, InputFieldBinding inputField) {
    super(_bindingComponent, _root, _localFieldCount);
    this.inputField = inputField;
    setContainedBinding(this.inputField);;
  }

  public abstract void setViewModel(@Nullable TextInputDialogFragment viewModel);

  @Nullable
  public TextInputDialogFragment getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static DialogFragmentTextBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static DialogFragmentTextBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<DialogFragmentTextBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.dialog_fragment_text, root, attachToRoot, component);
  }

  @NonNull
  public static DialogFragmentTextBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static DialogFragmentTextBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<DialogFragmentTextBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.dialog_fragment_text, null, false, component);
  }

  public static DialogFragmentTextBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static DialogFragmentTextBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (DialogFragmentTextBinding)bind(component, view, ua.mycredit.mycredit.R.layout.dialog_fragment_text);
  }
}
