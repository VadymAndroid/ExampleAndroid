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

public abstract class ItemCardBinding extends ViewDataBinding {
  @Bindable
  protected CardsViewModel.AdapterImpl.CardViewHolder mViewModel;

  protected ItemCardBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setViewModel(@Nullable CardsViewModel.AdapterImpl.CardViewHolder viewModel);

  @Nullable
  public CardsViewModel.AdapterImpl.CardViewHolder getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ItemCardBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemCardBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemCardBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.item_card, root, attachToRoot, component);
  }

  @NonNull
  public static ItemCardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemCardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemCardBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.item_card, null, false, component);
  }

  public static ItemCardBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ItemCardBinding bind(@NonNull View view, @Nullable DataBindingComponent component) {
    return (ItemCardBinding)bind(component, view, ua.mycredit.mycredit.R.layout.item_card);
  }
}
