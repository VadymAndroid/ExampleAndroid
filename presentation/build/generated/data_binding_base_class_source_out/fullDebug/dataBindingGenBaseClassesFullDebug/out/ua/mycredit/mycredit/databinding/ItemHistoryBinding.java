package ua.mycredit.mycredit.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.Guideline;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import ua.mycredit.mycredit.ui.profile.history.HistoryViewModel;

public abstract class ItemHistoryBinding extends ViewDataBinding {
  @NonNull
  public final TextView amountLabelTextView;

  @NonNull
  public final LinearLayout amountLayout;

  @NonNull
  public final TextView amountTextView;

  @NonNull
  public final TextView dateLabelTextView;

  @NonNull
  public final LinearLayout dateLayout;

  @NonNull
  public final TextView dateTextView;

  @NonNull
  public final TextView deptLabelTextView;

  @NonNull
  public final LinearLayout deptLayout;

  @NonNull
  public final TextView deptTextView;

  @NonNull
  public final Guideline guideline2;

  @NonNull
  public final Guideline guideline3;

  @NonNull
  public final TextView idTextView;

  @NonNull
  public final View separator;

  @NonNull
  public final TextView statusTextView;

  @NonNull
  public final TextView termLabelTextView;

  @NonNull
  public final LinearLayout termLayout;

  @NonNull
  public final TextView termTextView;

  @NonNull
  public final View view;

  @Bindable
  protected HistoryViewModel.LoanViewHolder mViewModel;

  protected ItemHistoryBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView amountLabelTextView, LinearLayout amountLayout,
      TextView amountTextView, TextView dateLabelTextView, LinearLayout dateLayout,
      TextView dateTextView, TextView deptLabelTextView, LinearLayout deptLayout,
      TextView deptTextView, Guideline guideline2, Guideline guideline3, TextView idTextView,
      View separator, TextView statusTextView, TextView termLabelTextView, LinearLayout termLayout,
      TextView termTextView, View view) {
    super(_bindingComponent, _root, _localFieldCount);
    this.amountLabelTextView = amountLabelTextView;
    this.amountLayout = amountLayout;
    this.amountTextView = amountTextView;
    this.dateLabelTextView = dateLabelTextView;
    this.dateLayout = dateLayout;
    this.dateTextView = dateTextView;
    this.deptLabelTextView = deptLabelTextView;
    this.deptLayout = deptLayout;
    this.deptTextView = deptTextView;
    this.guideline2 = guideline2;
    this.guideline3 = guideline3;
    this.idTextView = idTextView;
    this.separator = separator;
    this.statusTextView = statusTextView;
    this.termLabelTextView = termLabelTextView;
    this.termLayout = termLayout;
    this.termTextView = termTextView;
    this.view = view;
  }

  public abstract void setViewModel(@Nullable HistoryViewModel.LoanViewHolder viewModel);

  @Nullable
  public HistoryViewModel.LoanViewHolder getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ItemHistoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemHistoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemHistoryBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.item_history, root, attachToRoot, component);
  }

  @NonNull
  public static ItemHistoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemHistoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemHistoryBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.item_history, null, false, component);
  }

  public static ItemHistoryBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ItemHistoryBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ItemHistoryBinding)bind(component, view, ua.mycredit.mycredit.R.layout.item_history);
  }
}
