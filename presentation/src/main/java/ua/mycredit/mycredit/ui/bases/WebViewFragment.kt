package ua.mycredit.mycredit.ui.bases

import android.content.DialogInterface
import android.content.IntentFilter
import android.databinding.ObservableBoolean
import android.graphics.Bitmap
import android.net.ConnectivityManager
import android.os.Bundle
import android.view.View
import android.webkit.WebResourceError
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import io.reactivex.disposables.Disposables
import org.jetbrains.anko.okButton
import org.jetbrains.anko.support.v4.alert
import org.jetbrains.anko.support.v4.ctx
import rx2.receiver.android.RxReceiver
import ua.mycredit.mycredit.R
import ua.mycredit.mycredit.databinding.FragmentWebViewBinding
import ua.mycredit.mycredit.ui.internetConnected

abstract class WebViewFragment : SelfBindingFragment<FragmentWebViewBinding>() {

    override val layoutId get() = R.layout.fragment_web_view

    val refreshing = ObservableBoolean()
    val webViewVisible = ObservableBoolean()

    val client: WebViewClient = WebViewClientImpl()

    abstract val url: String

    private val webView get() = binding.webView

    private var internetAlert: DialogInterface? = null
    private var connectionChanges = Disposables.empty()

    private var hasPage = false

    protected open fun shouldOverrideUrlLoading(url: String) = false

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        savedInstanceState ?: updateContent()
    }

    override fun onResume() {
        super.onResume()
        webView.onResume()
        webView.settings.javaScriptEnabled = true

        val filter = IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION)
        connectionChanges = RxReceiver.receives(ctx, filter).subscribe { updateContent() }
    }

    override fun onPause() {
        webView.onPause()
        connectionChanges.dispose()
        super.onPause()
    }


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        webView.saveState(outState)
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        webView.restoreState(savedInstanceState)
    }

    override fun onDestroyView() {
        if (withUi) {
            webView.destroy()
        }

        super.onDestroyView()
    }

    private fun updateContent() {

        internetAlert?.dismiss()
        internetAlert = null

        if (!internetConnected) {

            internetAlert = alert(R.string.error_no_internet) {
                okButton {}
            }.show()

        } else if (!hasPage) {
            webView.loadUrl(url)
        }
    }

    private inner class WebViewClientImpl : WebViewClient() {

        override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
            return shouldOverrideUrlLoading(url)
        }

        override fun onPageStarted(view: WebView, url: String, favicon: Bitmap?) {
            refreshing.set(true)
            webViewVisible.set(true)
        }

        override fun onPageFinished(view: WebView, url: String) {
            refreshing.set(false)
            hasPage = true
        }

        override fun onReceivedError(
                view: WebView,
                request: WebResourceRequest?,
                error: WebResourceError?
        ) {
            super.onReceivedError(view, request, error)
            webViewVisible.set(false)
        }
    }
}
