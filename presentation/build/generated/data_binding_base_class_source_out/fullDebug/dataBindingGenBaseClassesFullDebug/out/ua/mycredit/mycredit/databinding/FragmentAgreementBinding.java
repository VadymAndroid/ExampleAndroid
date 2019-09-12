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
import android.widget.Button;
import com.github.barteksc.pdfviewer.PDFView;
import ua.mycredit.mycredit.ui.profile.credit.AgreementViewModel;

public abstract class FragmentAgreementBinding extends ViewDataBinding {
  @NonNull
  public final PDFView PDFView;

  @NonNull
  public final Button creditAction;

  @Bindable
  protected AgreementViewModel mViewModel;

  protected FragmentAgreementBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, PDFView PDFView, Button creditAction) {
    super(_bindingComponent, _root, _localFieldCount);
    this.PDFView = PDFView;
    this.creditAction = creditAction;
  }

  public abstract void setViewModel(@Nullable AgreementViewModel viewModel);

  @Nullable
  public AgreementViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentAgreementBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentAgreementBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentAgreementBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_agreement, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentAgreementBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentAgreementBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentAgreementBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_agreement, null, false, component);
  }

  public static FragmentAgreementBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentAgreementBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentAgreementBinding)bind(component, view, ua.mycredit.mycredit.R.layout.fragment_agreement);
  }
}
