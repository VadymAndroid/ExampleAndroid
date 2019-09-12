package ua.mycredit.mycredit.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import br.com.sapereaude.maskedEditText.MaskedEditText;
import ua.mycredit.mycredit.ui.authentication.registration.card.CardFrontFragment;

public abstract class FragmentCardFrontBinding extends ViewDataBinding {
  @NonNull
  public final MaskedEditText card;

  @NonNull
  public final CardView cardFront;

  @NonNull
  public final MaskedEditText expirationDate;

  @NonNull
  public final LinearLayout expires;

  @NonNull
  public final LinearLayout logos;

  @Bindable
  protected CardFrontFragment mViewModel;

  protected FragmentCardFrontBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, MaskedEditText card, CardView cardFront, MaskedEditText expirationDate,
      LinearLayout expires, LinearLayout logos) {
    super(_bindingComponent, _root, _localFieldCount);
    this.card = card;
    this.cardFront = cardFront;
    this.expirationDate = expirationDate;
    this.expires = expires;
    this.logos = logos;
  }

  public abstract void setViewModel(@Nullable CardFrontFragment viewModel);

  @Nullable
  public CardFrontFragment getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentCardFrontBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentCardFrontBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentCardFrontBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_card_front, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentCardFrontBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentCardFrontBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentCardFrontBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_card_front, null, false, component);
  }

  public static FragmentCardFrontBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentCardFrontBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentCardFrontBinding)bind(component, view, ua.mycredit.mycredit.R.layout.fragment_card_front);
  }
}
