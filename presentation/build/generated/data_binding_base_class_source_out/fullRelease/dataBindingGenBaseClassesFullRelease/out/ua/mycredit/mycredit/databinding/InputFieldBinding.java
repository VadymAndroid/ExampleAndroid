package ua.mycredit.mycredit.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.databinding.adapters.TextViewBindingAdapter;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatEditText;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ua.mycredit.mycredit.ui.bases.input.FieldViewModel;

public abstract class InputFieldBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatEditText editText;

  @Bindable
  protected FieldViewModel mViewModel;

  @Bindable
  protected Drawable mDrawableStart;

  @Bindable
  protected Drawable mDrawableEnd;

  @Bindable
  protected TextViewBindingAdapter.AfterTextChanged mAfterTextChanged;

  protected InputFieldBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AppCompatEditText editText) {
    super(_bindingComponent, _root, _localFieldCount);
    this.editText = editText;
  }

  public abstract void setViewModel(@Nullable FieldViewModel viewModel);

  @Nullable
  public FieldViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setDrawableStart(@Nullable Drawable drawableStart);

  @Nullable
  public Drawable getDrawableStart() {
    return mDrawableStart;
  }

  public abstract void setDrawableEnd(@Nullable Drawable drawableEnd);

  @Nullable
  public Drawable getDrawableEnd() {
    return mDrawableEnd;
  }

  public abstract void setAfterTextChanged(@Nullable TextViewBindingAdapter.AfterTextChanged afterTextChanged);

  @Nullable
  public TextViewBindingAdapter.AfterTextChanged getAfterTextChanged() {
    return mAfterTextChanged;
  }

  @NonNull
  public static InputFieldBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static InputFieldBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<InputFieldBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.input_field, root, attachToRoot, component);
  }

  @NonNull
  public static InputFieldBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static InputFieldBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<InputFieldBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.input_field, null, false, component);
  }

  public static InputFieldBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static InputFieldBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (InputFieldBinding)bind(component, view, ua.mycredit.mycredit.R.layout.input_field);
  }
}
