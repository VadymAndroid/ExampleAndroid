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
import android.widget.TextView;
import br.com.sapereaude.maskedEditText.MaskedEditText;
import ua.mycredit.mycredit.ui.bases.input.FieldViewModel;

public abstract class InputPhoneNumberBinding extends ViewDataBinding {
  @NonNull
  public final MaskedEditText maskedPhone;

  @NonNull
  public final TextView topHint;

  @Bindable
  protected FieldViewModel mViewModel;

  protected InputPhoneNumberBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, MaskedEditText maskedPhone, TextView topHint) {
    super(_bindingComponent, _root, _localFieldCount);
    this.maskedPhone = maskedPhone;
    this.topHint = topHint;
  }

  public abstract void setViewModel(@Nullable FieldViewModel viewModel);

  @Nullable
  public FieldViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static InputPhoneNumberBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static InputPhoneNumberBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<InputPhoneNumberBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.input_phone_number, root, attachToRoot, component);
  }

  @NonNull
  public static InputPhoneNumberBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static InputPhoneNumberBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<InputPhoneNumberBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.input_phone_number, null, false, component);
  }

  public static InputPhoneNumberBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static InputPhoneNumberBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (InputPhoneNumberBinding)bind(component, view, ua.mycredit.mycredit.R.layout.input_phone_number);
  }
}
