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
import ua.mycredit.mycredit.ui.profile.cards.CardsViewModel;

public abstract class FooterFragmentCardsBinding extends ViewDataBinding {
  @Bindable
  protected CardsViewModel mViewModel;

  protected FooterFragmentCardsBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setViewModel(@Nullable CardsViewModel viewModel);

  @Nullable
  public CardsViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FooterFragmentCardsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FooterFragmentCardsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FooterFragmentCardsBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.footer_fragment_cards, root, attachToRoot, component);
  }

  @NonNull
  public static FooterFragmentCardsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FooterFragmentCardsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FooterFragmentCardsBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.footer_fragment_cards, null, false, component);
  }

  public static FooterFragmentCardsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FooterFragmentCardsBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FooterFragmentCardsBinding)bind(component, view, ua.mycredit.mycredit.R.layout.footer_fragment_cards);
  }
}
