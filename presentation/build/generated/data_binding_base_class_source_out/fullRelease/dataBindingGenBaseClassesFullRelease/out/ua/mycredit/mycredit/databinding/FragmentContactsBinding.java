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
import ua.mycredit.mycredit.ui.profile.profile.contacts.ContactsFragment;

public abstract class FragmentContactsBinding extends ViewDataBinding {
  @Bindable
  protected ContactsFragment mViewModel;

  protected FragmentContactsBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setViewModel(@Nullable ContactsFragment viewModel);

  @Nullable
  public ContactsFragment getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentContactsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentContactsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentContactsBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_contacts, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentContactsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentContactsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentContactsBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_contacts, null, false, component);
  }

  public static FragmentContactsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentContactsBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentContactsBinding)bind(component, view, ua.mycredit.mycredit.R.layout.fragment_contacts);
  }
}
