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
import android.widget.ViewSwitcher;
import ua.mycredit.mycredit.ui.profile.repayloan.RepayByCardViewModel;

public abstract class FragmentRepayByCardBinding extends ViewDataBinding {
  @NonNull
  public final TextView card;

  @NonNull
  public final TextView changeCard;

  @NonNull
  public final TextView company;

  @NonNull
  public final View divider;

  @NonNull
  public final TextView editText;

  @NonNull
  public final ViewSwitcher itemCard;

  @NonNull
  public final TextView myCredit;

  @NonNull
  public final TextView numberOfApply;

  @NonNull
  public final View payoutBlockBackground;

  @NonNull
  public final TextView payoutLoanWithDate;

  @NonNull
  public final TextView payoutPoint;

  @NonNull
  public final TextView publicId;

  @NonNull
  public final View smallDivider;

  @NonNull
  public final TextView sumToPay;

  @Bindable
  protected RepayByCardViewModel mViewModel;

  protected FragmentRepayByCardBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView card, TextView changeCard, TextView company, View divider,
      TextView editText, ViewSwitcher itemCard, TextView myCredit, TextView numberOfApply,
      View payoutBlockBackground, TextView payoutLoanWithDate, TextView payoutPoint,
      TextView publicId, View smallDivider, TextView sumToPay) {
    super(_bindingComponent, _root, _localFieldCount);
    this.card = card;
    this.changeCard = changeCard;
    this.company = company;
    this.divider = divider;
    this.editText = editText;
    this.itemCard = itemCard;
    this.myCredit = myCredit;
    this.numberOfApply = numberOfApply;
    this.payoutBlockBackground = payoutBlockBackground;
    this.payoutLoanWithDate = payoutLoanWithDate;
    this.payoutPoint = payoutPoint;
    this.publicId = publicId;
    this.smallDivider = smallDivider;
    this.sumToPay = sumToPay;
  }

  public abstract void setViewModel(@Nullable RepayByCardViewModel viewModel);

  @Nullable
  public RepayByCardViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentRepayByCardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentRepayByCardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentRepayByCardBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_repay_by_card, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentRepayByCardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentRepayByCardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentRepayByCardBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_repay_by_card, null, false, component);
  }

  public static FragmentRepayByCardBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentRepayByCardBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentRepayByCardBinding)bind(component, view, ua.mycredit.mycredit.R.layout.fragment_repay_by_card);
  }
}
