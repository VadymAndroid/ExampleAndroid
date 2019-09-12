package ua.mycredit.mycredit.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import ua.mycredit.mycredit.ui.bases.WebViewFragment;

public abstract class FragmentWebViewBinding extends ViewDataBinding {
  @NonNull
  public final SwipeRefreshLayout refreshLayout;

  @NonNull
  public final WebView webView;

  @Bindable
  protected WebViewFragment mViewModel;

  protected FragmentWebViewBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, SwipeRefreshLayout refreshLayout, WebView webView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.refreshLayout = refreshLayout;
    this.webView = webView;
  }

  public abstract void setViewModel(@Nullable WebViewFragment viewModel);

  @Nullable
  public WebViewFragment getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentWebViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentWebViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentWebViewBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_web_view, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentWebViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentWebViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentWebViewBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.fragment_web_view, null, false, component);
  }

  public static FragmentWebViewBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentWebViewBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentWebViewBinding)bind(component, view, ua.mycredit.mycredit.R.layout.fragment_web_view);
  }
}
