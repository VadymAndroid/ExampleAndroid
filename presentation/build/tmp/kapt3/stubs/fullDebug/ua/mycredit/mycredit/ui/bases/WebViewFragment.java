package ua.mycredit.mycredit.ui.bases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001.B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020!H\u0016J\b\u0010#\u001a\u00020!H\u0016J\u0010\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020&H\u0016J\u001a\u0010\'\u001a\u00020!2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010&H\u0016J\u0012\u0010+\u001a\u00020!2\b\u0010*\u001a\u0004\u0018\u00010&H\u0016J\u0010\u0010,\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0014J\b\u0010-\u001a\u00020!H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u0017X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015\u00a8\u0006/"}, d2 = {"Lua/mycredit/mycredit/ui/bases/WebViewFragment;", "Lua/mycredit/mycredit/ui/bases/SelfBindingFragment;", "Lua/mycredit/mycredit/databinding/FragmentWebViewBinding;", "()V", "client", "Landroid/webkit/WebViewClient;", "getClient", "()Landroid/webkit/WebViewClient;", "connectionChanges", "Lio/reactivex/disposables/Disposable;", "hasPage", "", "internetAlert", "Landroid/content/DialogInterface;", "layoutId", "", "getLayoutId", "()I", "refreshing", "Landroid/databinding/ObservableBoolean;", "getRefreshing", "()Landroid/databinding/ObservableBoolean;", "url", "", "getUrl", "()Ljava/lang/String;", "webView", "Landroid/webkit/WebView;", "getWebView", "()Landroid/webkit/WebView;", "webViewVisible", "getWebViewVisible", "onDestroyView", "", "onPause", "onResume", "onSaveInstanceState", "outState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "onViewStateRestored", "shouldOverrideUrlLoading", "updateContent", "WebViewClientImpl", "presentation_fullDebug"})
public abstract class WebViewFragment extends ua.mycredit.mycredit.ui.bases.SelfBindingFragment<ua.mycredit.mycredit.databinding.FragmentWebViewBinding> {
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableBoolean refreshing = null;
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableBoolean webViewVisible = null;
    @org.jetbrains.annotations.NotNull()
    private final android.webkit.WebViewClient client = null;
    private android.content.DialogInterface internetAlert;
    private io.reactivex.disposables.Disposable connectionChanges;
    private boolean hasPage;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableBoolean getRefreshing() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableBoolean getWebViewVisible() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.webkit.WebViewClient getClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getUrl();
    
    private final android.webkit.WebView getWebView() {
        return null;
    }
    
    protected boolean shouldOverrideUrlLoading(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return false;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    public void onViewStateRestored(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void updateContent() {
    }
    
    public WebViewFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\"\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J$\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\u0013"}, d2 = {"Lua/mycredit/mycredit/ui/bases/WebViewFragment$WebViewClientImpl;", "Landroid/webkit/WebViewClient;", "(Lua/mycredit/mycredit/ui/bases/WebViewFragment;)V", "onPageFinished", "", "view", "Landroid/webkit/WebView;", "url", "", "onPageStarted", "favicon", "Landroid/graphics/Bitmap;", "onReceivedError", "request", "Landroid/webkit/WebResourceRequest;", "error", "Landroid/webkit/WebResourceError;", "shouldOverrideUrlLoading", "", "presentation_fullDebug"})
    final class WebViewClientImpl extends android.webkit.WebViewClient {
        
        @java.lang.Override()
        public boolean shouldOverrideUrlLoading(@org.jetbrains.annotations.NotNull()
        android.webkit.WebView view, @org.jetbrains.annotations.NotNull()
        java.lang.String url) {
            return false;
        }
        
        @java.lang.Override()
        public void onPageStarted(@org.jetbrains.annotations.NotNull()
        android.webkit.WebView view, @org.jetbrains.annotations.NotNull()
        java.lang.String url, @org.jetbrains.annotations.Nullable()
        android.graphics.Bitmap favicon) {
        }
        
        @java.lang.Override()
        public void onPageFinished(@org.jetbrains.annotations.NotNull()
        android.webkit.WebView view, @org.jetbrains.annotations.NotNull()
        java.lang.String url) {
        }
        
        @java.lang.Override()
        public void onReceivedError(@org.jetbrains.annotations.NotNull()
        android.webkit.WebView view, @org.jetbrains.annotations.Nullable()
        android.webkit.WebResourceRequest request, @org.jetbrains.annotations.Nullable()
        android.webkit.WebResourceError error) {
        }
        
        public WebViewClientImpl() {
            super();
        }
    }
}