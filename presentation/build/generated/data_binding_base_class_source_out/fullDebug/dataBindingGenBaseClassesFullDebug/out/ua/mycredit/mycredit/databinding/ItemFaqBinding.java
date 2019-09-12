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
import ua.mycredit.mycredit.ui.profile.profile.faq.FaqActivity;

public abstract class ItemFaqBinding extends ViewDataBinding {
  @NonNull
  public final TextView question;

  @Bindable
  protected FaqActivity.FaqAdapter.FaqViewHolder mViewModel;

  protected ItemFaqBinding(DataBindingComponent _bindingComponent, View _root, int _localFieldCount,
      TextView question) {
    super(_bindingComponent, _root, _localFieldCount);
    this.question = question;
  }

  public abstract void setViewModel(@Nullable FaqActivity.FaqAdapter.FaqViewHolder viewModel);

  @Nullable
  public FaqActivity.FaqAdapter.FaqViewHolder getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ItemFaqBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemFaqBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemFaqBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.item_faq, root, attachToRoot, component);
  }

  @NonNull
  public static ItemFaqBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemFaqBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemFaqBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.item_faq, null, false, component);
  }

  public static ItemFaqBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ItemFaqBinding bind(@NonNull View view, @Nullable DataBindingComponent component) {
    return (ItemFaqBinding)bind(component, view, ua.mycredit.mycredit.R.layout.item_faq);
  }
}
