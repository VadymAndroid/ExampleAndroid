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
import android.widget.Button;
import android.widget.TextView;
import ua.mycredit.mycredit.ui.bases.SimpleInputTextDialogFragment;

public abstract class DialogFragmentSimpleInputTextBinding extends ViewDataBinding {
  @NonNull
  public final InputFieldBinding include;

  @NonNull
  public final Button ok;

  @NonNull
  public final TextView title;

  @Bindable
  protected SimpleInputTextDialogFragment mViewModel;

  protected DialogFragmentSimpleInputTextBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, InputFieldBinding include, Button ok, TextView title) {
    super(_bindingComponent, _root, _localFieldCount);
    this.include = include;
    setContainedBinding(this.include);;
    this.ok = ok;
    this.title = title;
  }

  public abstract void setViewModel(@Nullable SimpleInputTextDialogFragment viewModel);

  @Nullable
  public SimpleInputTextDialogFragment getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static DialogFragmentSimpleInputTextBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static DialogFragmentSimpleInputTextBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<DialogFragmentSimpleInputTextBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.dialog_fragment_simple_input_text, root, attachToRoot, component);
  }

  @NonNull
  public static DialogFragmentSimpleInputTextBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static DialogFragmentSimpleInputTextBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<DialogFragmentSimpleInputTextBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.dialog_fragment_simple_input_text, null, false, component);
  }

  public static DialogFragmentSimpleInputTextBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static DialogFragmentSimpleInputTextBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (DialogFragmentSimpleInputTextBinding)bind(component, view, ua.mycredit.mycredit.R.layout.dialog_fragment_simple_input_text);
  }
}
