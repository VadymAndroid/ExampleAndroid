package ua.mycredit.mycredit.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ua.mycredit.mycredit.ui.profile.profile.faq.FaqActivity;

public abstract class ActivityQuestionBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView faqRecyclerView;

  @Bindable
  protected FaqActivity mViewModel;

  protected ActivityQuestionBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, RecyclerView faqRecyclerView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.faqRecyclerView = faqRecyclerView;
  }

  public abstract void setViewModel(@Nullable FaqActivity viewModel);

  @Nullable
  public FaqActivity getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivityQuestionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityQuestionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityQuestionBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.activity_question, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityQuestionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityQuestionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityQuestionBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.activity_question, null, false, component);
  }

  public static ActivityQuestionBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityQuestionBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityQuestionBinding)bind(component, view, ua.mycredit.mycredit.R.layout.activity_question);
  }
}
