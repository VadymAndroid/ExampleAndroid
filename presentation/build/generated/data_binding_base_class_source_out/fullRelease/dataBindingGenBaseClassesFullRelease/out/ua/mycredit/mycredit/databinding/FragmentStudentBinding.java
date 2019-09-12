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
import ua.mycredit.mycredit.ui.authentication.registration.ocupation.StudentViewModel;

public abstract class FragmentStudentBinding extends ViewDataBinding {
  @Bindable
  protected StudentViewModel mViewModel;

  protected FragmentStudentBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setViewModel(@Nullable StudentViewModel viewModel);

  @Nullable
  public StudentViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentStudentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentStudentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentStudentBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_student, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentStudentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentStudentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentStudentBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_student, null, false, component);
  }

  public static FragmentStudentBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentStudentBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentStudentBinding)bind(component, view, ua.mycredit.mycredit.R.layout.fragment_student);
  }
}
