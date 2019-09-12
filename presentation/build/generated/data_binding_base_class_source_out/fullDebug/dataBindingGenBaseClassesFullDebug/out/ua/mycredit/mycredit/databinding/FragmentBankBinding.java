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
import android.widget.LinearLayout;
import android.widget.TextView;
import ua.mycredit.mycredit.ui.profile.repayloan.BankFragmentViewModel;

public abstract class FragmentBankBinding extends ViewDataBinding {
  @NonNull
  public final TextView bank;

  @NonNull
  public final View bottomDivider;

  @NonNull
  public final TextView count;

  @NonNull
  public final TextView countNumber;

  @NonNull
  public final TextView ergpou;

  @NonNull
  public final TextView ergpouNumber;

  @NonNull
  public final LinearLayout firstColumn;

  @NonNull
  public final TextView mfo;

  @NonNull
  public final TextView mfoNumber;

  @NonNull
  public final View payoutBlockBackground;

  @NonNull
  public final TextView payoutPoint;

  @NonNull
  public final TextView payoutPointText;

  @NonNull
  public final TextView receiver;

  @NonNull
  public final TextView receiverFullName;

  @NonNull
  public final View secondSmallDivider;

  @NonNull
  public final View smallDivider;

  @NonNull
  public final TextView sum;

  @NonNull
  public final TextView sumText;

  @NonNull
  public final TextView textWithBank;

  @NonNull
  public final TextView topBankText;

  @NonNull
  public final View topDivider;

  @Bindable
  protected BankFragmentViewModel mViewModel;

  protected FragmentBankBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView bank, View bottomDivider, TextView count, TextView countNumber,
      TextView ergpou, TextView ergpouNumber, LinearLayout firstColumn, TextView mfo,
      TextView mfoNumber, View payoutBlockBackground, TextView payoutPoint,
      TextView payoutPointText, TextView receiver, TextView receiverFullName,
      View secondSmallDivider, View smallDivider, TextView sum, TextView sumText,
      TextView textWithBank, TextView topBankText, View topDivider) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bank = bank;
    this.bottomDivider = bottomDivider;
    this.count = count;
    this.countNumber = countNumber;
    this.ergpou = ergpou;
    this.ergpouNumber = ergpouNumber;
    this.firstColumn = firstColumn;
    this.mfo = mfo;
    this.mfoNumber = mfoNumber;
    this.payoutBlockBackground = payoutBlockBackground;
    this.payoutPoint = payoutPoint;
    this.payoutPointText = payoutPointText;
    this.receiver = receiver;
    this.receiverFullName = receiverFullName;
    this.secondSmallDivider = secondSmallDivider;
    this.smallDivider = smallDivider;
    this.sum = sum;
    this.sumText = sumText;
    this.textWithBank = textWithBank;
    this.topBankText = topBankText;
    this.topDivider = topDivider;
  }

  public abstract void setViewModel(@Nullable BankFragmentViewModel viewModel);

  @Nullable
  public BankFragmentViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentBankBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentBankBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentBankBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_bank, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentBankBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentBankBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentBankBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_bank, null, false, component);
  }

  public static FragmentBankBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentBankBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentBankBinding)bind(component, view, ua.mycredit.mycredit.R.layout.fragment_bank);
  }
}
