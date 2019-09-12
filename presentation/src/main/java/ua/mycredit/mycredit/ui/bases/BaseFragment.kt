package ua.mycredit.mycredit.ui.bases

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.content.Context
import android.content.pm.PackageManager
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.annotation.CallSuper
import android.support.annotation.LayoutRes
import android.support.annotation.StringRes
import android.support.v4.content.ContextCompat
import android.support.v4.widget.NestedScrollView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.android.support.DaggerFragment
import org.jetbrains.anko.cancelButton
import org.jetbrains.anko.okButton
import org.jetbrains.anko.support.v4.act
import org.jetbrains.anko.support.v4.alert
import org.jetbrains.anko.support.v4.ctx
import ru.terrakok.cicerone.Router
import ua.mycredit.core.LocalStorage
import ua.mycredit.mycredit.AppEvents
import ua.mycredit.mycredit.databinding.PreloaderBinding
import ua.mycredit.mycredit.databinding.SwipeRefreshLayoutBinding
import ua.mycredit.mycredit.ui.BackButtonListener
import ua.mycredit.mycredit.ui.baseActivity
import ua.mycredit.mycredit.ui.bases.action.WithRefresh
import ua.mycredit.mycredit.ui.bindViewModel
import javax.inject.Inject

abstract class BaseFragment : DaggerFragment(), BackButtonListener, AppEvents.Listener {

    @get:LayoutRes
    abstract val layoutId: Int

    @StringRes
    open val toolbarTitle: Int = 0

    @Inject lateinit var router: Router
    @Inject lateinit var events: AppEvents

    @Inject lateinit var storage: LocalStorage

    @Inject lateinit var viewModelFactory: ViewModelProvider.Factory

    protected open val scrollEnabled get() = arguments?.getBoolean(ARG_SCROLL_ENABLED) ?: false

    protected open val exitConfirmationMessage = 0

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        events.addListener(this)
    }

    override fun onDetach() {
        events.removeListener(this)
        super.onDetach()
    }

    override fun onResume() {
        super.onResume()

        if (toolbarTitle != 0) {
            act.setTitle(toolbarTitle)
        }
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View =
            onCreateContentView(inflater, container, savedInstanceState)
                    .let {
                        when {
                            scrollEnabled -> NestedScrollView(ctx).apply { addView(it) }
                            else -> it
                        }
                    }

    protected open fun onCreateContentView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View = inflater.inflate(layoutId, container, false)

    override fun onBackPressed(): Boolean {

        exitConfirmationMessage
                .takeIf { it != 0 }
                ?.let { message ->
                    alert(message) {
                        okButton { router.exit() }
                        cancelButton {}
                    }.show()
                } ?: router.exit()

        return true
    }

    companion object {
        const val ARG_SCROLL_ENABLED = "ARG_SCROLL_ENABLED"
    }
}

sealed class BaseBindingFragment<VDB : ViewDataBinding> : BaseFragment() {

    abstract val viewModel: Any

    protected lateinit var binding: VDB

    protected val withUi get() = ::binding.isInitialized

    @CallSuper
    override fun onCreateContentView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ) = DataBindingUtil.inflate<VDB>(inflater, layoutId, container, false)
            .also { binding = it }
            .bindViewModel(viewModel)

    override fun onDestroyView() {
        binding.unbind()
        super.onDestroyView()
    }

    protected fun invalidateUi() {
        if (withUi) {
            binding.invalidateAll()
        }
    }
}

abstract class ViewModelFragment<VM : BaseViewModel, VDB : ViewDataBinding>
    : BaseBindingFragment<VDB>() {

    abstract val viewModelClass: Class<VM>

    final override val viewModel: VM by lazy(::makeViewModel)

    private val useActivityScope get() = arguments?.getBoolean(ARG_USE_ACTIVITY_SCOPE) ?: false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        savedInstanceState ?: (viewModel as? WithRefresh)?.asRefreshable?.refresh()
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ) = super.onCreateView(inflater, container, savedInstanceState)
            .let {
                when (viewModel) {

                    is WithRefresh -> SwipeRefreshLayoutBinding.inflate(inflater)
                            .apply { swipeRefreshLayout.addView(it) }
                            .bindViewModel(viewModel)

                    else -> it
                }
            }.let {
                PreloaderBinding.inflate(inflater, container, false)
                        .apply { viewSwitcherContent.addView(it) }
                        .bindViewModel(viewModel)
            }

    private fun makeViewModel() =
            when {
                useActivityScope -> ViewModelProviders.of(baseActivity, viewModelFactory)
                else -> ViewModelProviders.of(this, viewModelFactory)
            }.get(viewModelClass)

    companion object {
        const val ARG_USE_ACTIVITY_SCOPE = "ARG_USE_ACTIVITY_SCOPE"
    }

    fun setupPermissions(string: String, const: Int) {
        when {
            ContextCompat.checkSelfPermission(activity!!, string) !=
                    PackageManager.PERMISSION_GRANTED -> {
                requestPermissions( arrayOf(string), const)
            }
        }
    }
}

abstract class SelfBindingFragment<VDB : ViewDataBinding> : BaseBindingFragment<VDB>() {
    final override val viewModel get() = this
}
