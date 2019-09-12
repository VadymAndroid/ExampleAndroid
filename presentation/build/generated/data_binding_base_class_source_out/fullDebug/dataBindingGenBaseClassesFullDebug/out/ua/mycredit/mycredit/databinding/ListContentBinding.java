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
import ua.mycredit.mycredit.ui.bases.ListViewModel;

public abstract class ListContentBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView recyclerView;

  @Bindable
  protected ListViewModel mViewModel;

  protected ListContentBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, RecyclerView recyclerView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.recyclerView = recyclerView;
  }

  public abstract void setViewModel(@Nullable ListViewModel viewModel);

  @Nullable
  public ListViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ListContentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ListContentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ListContentBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.list_content, root, attachToRoot, component);
  }

  @NonNull
  public static ListContentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ListContentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ListContentBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.list_content, null, false, component);
  }

  public static ListContentBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ListContentBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ListContentBinding)bind(component, view, ua.mycredit.mycredit.R.layout.list_content);
  }
}
