package ua.mycredit.mycredit.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import ua.mycredit.mycredit.ui.profile.credit.StatusViewModel;

public abstract class ItemContractAdditionBinding extends ViewDataBinding {
  @NonNull
  public final Button button2;

  @NonNull
  public final ConstraintLayout constraintLayout;

  @NonNull
  public final CheckBox termsOfContract;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final View textView4;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView textView6;

  @Bindable
  protected StatusViewModel.ContractAdditionsAdapter.ItemViewHolderImpl mViewModel;

  protected ItemContractAdditionBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Button button2, ConstraintLayout constraintLayout,
      CheckBox termsOfContract, TextView textView, TextView textView2, View textView4,
      TextView textView5, TextView textView6) {
    super(_bindingComponent, _root, _localFieldCount);
    this.button2 = button2;
    this.constraintLayout = constraintLayout;
    this.termsOfContract = termsOfContract;
    this.textView = textView;
    this.textView2 = textView2;
    this.textView4 = textView4;
    this.textView5 = textView5;
    this.textView6 = textView6;
  }

  public abstract void setViewModel(@Nullable StatusViewModel.ContractAdditionsAdapter.ItemViewHolderImpl viewModel);

  @Nullable
  public StatusViewModel.ContractAdditionsAdapter.ItemViewHolderImpl getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ItemContractAdditionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemContractAdditionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemContractAdditionBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.item_contract_addition, root, attachToRoot, component);
  }

  @NonNull
  public static ItemContractAdditionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemContractAdditionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemContractAdditionBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.item_contract_addition, null, false, component);
  }

  public static ItemContractAdditionBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ItemContractAdditionBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ItemContractAdditionBinding)bind(component, view, ua.mycredit.mycredit.R.layout.item_contract_addition);
  }
}
