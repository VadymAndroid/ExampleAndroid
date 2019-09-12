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
import android.widget.RelativeLayout;
import br.com.sapereaude.maskedEditText.MaskedEditText;
import ua.mycredit.mycredit.ui.authentication.registration.card.CardBackViewModel;

public abstract class FragmentCardBackBinding extends ViewDataBinding {
  @NonNull
  public final MaskedEditText cvv;

  @NonNull
  public final CardView cvvExplanation;

  @NonNull
  public final RelativeLayout parent;

  @Bindable
  protected CardBackViewModel mViewModel;

  protected FragmentCardBackBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, MaskedEditText cvv, CardView cvvExplanation, RelativeLayout parent) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cvv = cvv;
    this.cvvExplanation = cvvExplanation;
    this.parent = parent;
  }

  public abstract void setViewModel(@Nullable CardBackViewModel viewModel);

  @Nullable
  public CardBackViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentCardBackBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentCardBackBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentCardBackBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_card_back, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentCardBackBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentCardBackBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentCardBackBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_card_back, null, false, component);
  }

  public static FragmentCardBackBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentCardBackBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentCardBackBinding)bind(component, view, ua.mycredit.mycredit.R.layout.fragment_card_back);
  }
}
