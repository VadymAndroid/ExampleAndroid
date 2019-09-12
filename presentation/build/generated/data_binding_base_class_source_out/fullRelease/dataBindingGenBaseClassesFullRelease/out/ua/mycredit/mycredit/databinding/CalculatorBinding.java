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
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ua.mycredit.mycredit.ui.calculator.CalculatorViewModel;
import ua.mycredit.mycredit.ui.custom.CircleSeekBar;

public abstract class CalculatorBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout borrowContainer;

  @NonNull
  public final TextView borrowQuantity;

  @NonNull
  public final TextView calculatorBorrowQuantity;

  @NonNull
  public final TextView calculatorDaysQuantity;

  @NonNull
  public final TextView chooseSumAndTerm;

  @NonNull
  public final CircleSeekBar daysSeekBar;

  @NonNull
  public final TextView discount;

  @NonNull
  public final TextView giveQuantity;

  @NonNull
  public final RelativeLayout information;

  @NonNull
  public final View informationDivider;

  @NonNull
  public final CircleSeekBar moneySeekBar;

  @NonNull
  public final LinearLayout percentContainer;

  @NonNull
  public final TextView percentQuantity;

  @NonNull
  public final Button promocodeButton;

  @NonNull
  public final LinearLayout resultContainer;

  @NonNull
  public final FrameLayout seek;

  @NonNull
  public final View seekDivider;

  @NonNull
  public final TextView strikePercentQuantity;

  @NonNull
  public final TextView until;

  @Bindable
  protected CalculatorViewModel mViewModel;

  protected CalculatorBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, LinearLayout borrowContainer, TextView borrowQuantity,
      TextView calculatorBorrowQuantity, TextView calculatorDaysQuantity, TextView chooseSumAndTerm,
      CircleSeekBar daysSeekBar, TextView discount, TextView giveQuantity,
      RelativeLayout information, View informationDivider, CircleSeekBar moneySeekBar,
      LinearLayout percentContainer, TextView percentQuantity, Button promocodeButton,
      LinearLayout resultContainer, FrameLayout seek, View seekDivider,
      TextView strikePercentQuantity, TextView until) {
    super(_bindingComponent, _root, _localFieldCount);
    this.borrowContainer = borrowContainer;
    this.borrowQuantity = borrowQuantity;
    this.calculatorBorrowQuantity = calculatorBorrowQuantity;
    this.calculatorDaysQuantity = calculatorDaysQuantity;
    this.chooseSumAndTerm = chooseSumAndTerm;
    this.daysSeekBar = daysSeekBar;
    this.discount = discount;
    this.giveQuantity = giveQuantity;
    this.information = information;
    this.informationDivider = informationDivider;
    this.moneySeekBar = moneySeekBar;
    this.percentContainer = percentContainer;
    this.percentQuantity = percentQuantity;
    this.promocodeButton = promocodeButton;
    this.resultContainer = resultContainer;
    this.seek = seek;
    this.seekDivider = seekDivider;
    this.strikePercentQuantity = strikePercentQuantity;
    this.until = until;
  }

  public abstract void setViewModel(@Nullable CalculatorViewModel viewModel);

  @Nullable
  public CalculatorViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static CalculatorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static CalculatorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<CalculatorBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.calculator, root, attachToRoot, component);
  }

  @NonNull
  public static CalculatorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static CalculatorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<CalculatorBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.calculator, null, false, component);
  }

  public static CalculatorBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static CalculatorBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (CalculatorBinding)bind(component, view, ua.mycredit.mycredit.R.layout.calculator);
  }
}
