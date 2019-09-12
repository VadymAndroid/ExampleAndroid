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
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import ua.mycredit.core.Card;

public abstract class CardBinding extends ViewDataBinding {
  @NonNull
  public final TextView cardNumber;

  @NonNull
  public final ImageView menu;

  @NonNull
  public final ImageView paymentSystemLogo;

  @NonNull
  public final RadioButton radiobutton;

  @Bindable
  protected Card mCard;

  @Bindable
  protected View.OnClickListener mOnClick;

  @Bindable
  protected boolean mChecked;

  @Bindable
  protected boolean mSelectable;

  @Bindable
  protected boolean mForciblyColored;

  protected CardBinding(DataBindingComponent _bindingComponent, View _root, int _localFieldCount,
      TextView cardNumber, ImageView menu, ImageView paymentSystemLogo, RadioButton radiobutton) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cardNumber = cardNumber;
    this.menu = menu;
    this.paymentSystemLogo = paymentSystemLogo;
    this.radiobutton = radiobutton;
  }

  public abstract void setCard(@Nullable Card card);

  @Nullable
  public Card getCard() {
    return mCard;
  }

  public abstract void setOnClick(@Nullable View.OnClickListener onClick);

  @Nullable
  public View.OnClickListener getOnClick() {
    return mOnClick;
  }

  public abstract void setChecked(boolean checked);

  public boolean getChecked() {
    return mChecked;
  }

  public abstract void setSelectable(boolean selectable);

  public boolean getSelectable() {
    return mSelectable;
  }

  public abstract void setForciblyColored(boolean forciblyColored);

  public boolean getForciblyColored() {
    return mForciblyColored;
  }

  @NonNull
  public static CardBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static CardBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<CardBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.card, root, attachToRoot, component);
  }

  @NonNull
  public static CardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static CardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<CardBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.card, null, false, component);
  }

  public static CardBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static CardBinding bind(@NonNull View view, @Nullable DataBindingComponent component) {
    return (CardBinding)bind(component, view, ua.mycredit.mycredit.R.layout.card);
  }
}
