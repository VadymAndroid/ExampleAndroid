package ua.mycredit.mycredit.ui.bases

import android.arch.lifecycle.ViewModel
import android.databinding.ObservableBoolean
import android.databinding.ObservableInt
import android.support.annotation.CallSuper
import com.google.firebase.analytics.FirebaseAnalytics
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.observers.DisposableCompletableObserver
import io.reactivex.observers.DisposableMaybeObserver
import io.reactivex.observers.DisposableObserver
import io.reactivex.observers.DisposableSingleObserver
import ru.terrakok.cicerone.Router
import ua.mycredit.core.BaseUseCase.ReloadCriteria
import ua.mycredit.core.LocalStorage
import ua.mycredit.core.Logouter
import ua.mycredit.core.Profile
import ua.mycredit.core.internal.Logger
import ua.mycredit.mycredit.AppEvents
import ua.mycredit.mycredit.R
import ua.mycredit.mycredit.Screens
import ua.mycredit.mycredit.ui.MessagesMapper
import ua.mycredit.mycredit.ui.bases.action.Refreshable
import ua.mycredit.mycredit.ui.dec
import ua.mycredit.mycredit.ui.inc
import java.io.IOException
import javax.inject.Inject
import kotlin.reflect.KMutableProperty1
import kotlin.reflect.KProperty

abstract class BaseViewModel : ViewModel(), AppEvents.Listener {

    @Inject lateinit var router: Router
    @Inject lateinit var events: AppEvents
    @Inject lateinit var logouter: Logouter

    @Inject lateinit var analytics: FirebaseAnalytics

    @Inject lateinit var messagesMapper: MessagesMapper

    @Inject lateinit var storage: LocalStorage

    @Inject lateinit var logger: Logger

    var profile: Profile by StorageProperty(LocalStorage::profile)

    val loadings = ObservableInt()
    open val preLoaderCompatPadding = false
    open val preLoaderLogoEnabled = false

    protected val disposables = CompositeDisposable()

    @Inject
    fun bindToAppEvents() {
        events.addListener(this)
    }

    @CallSuper
    override fun onCleared() {
        disposables.dispose()
        events.removeListener(this)
    }

    protected fun showSystemMessage(message: Int) {
        router.showSystemMessage(messagesMapper.transform(message))
    }

    fun getClosedLoanFromTheList(): Boolean {
        var creditList = false
        when {
            storage.history.value.isEmpty() -> creditList = true
            !storage.history.value.isEmpty() -> {
                loop@ for (credit in storage.history.value) when {
                    credit.status == 9 || credit.status == 10 -> {
                        creditList = true
                        break@loop
                    }
                }
            }
        }
        return creditList
    }

    fun getCountClosedLoanFromTheList(): Int {
        var creditList = 0
        when {
            storage.history.value.isEmpty() -> creditList = 0
            !storage.history.value.isEmpty() -> {
                for (credit in storage.history.value) when {
                    credit.status == 9 || credit.status == 10 -> {
                        creditList++
                    }
                }
            }
        }
        return creditList
    }

    protected inner class StorageProperty<T>(
            private val property: KMutableProperty1<LocalStorage, T>,
            private val changeCallback: ((T) -> Unit)? = null) {

        operator fun getValue(thisRef: Any, p: KProperty<*>): T =
                property.get(storage)

        operator fun setValue(thisRef: Any, p: KProperty<*>, value: T) {
            property.set(storage, value)
            changeCallback?.invoke(value)
        }
    }


    open class ProgressMode(
            val processStart: BaseViewModel.() -> Unit,
            val processTerminate: BaseViewModel.() -> Unit
    ) {
        object PRE_LOADER : ProgressMode(
                processStart = { loadings.inc() },
                processTerminate = { loadings.dec() }
        )

        object DIALOG : ProgressMode(
                processStart = { router.navigateTo(Screens.PROGRESS) },
                processTerminate = { router.exit() }
        )

        object EMPTY : ProgressMode({}, {})
    }

    fun ObservableBoolean.asProgressMode() = ProgressMode({ set(true) }, { set(false) })


    private interface ObserverBehavior : Disposable {

        val progressMode: ProgressMode get() = ProgressMode.PRE_LOADER

        val messageAfterCompletion get() = 0
        val exitAfterCompletion get() = false

        val owner: BaseViewModel

        fun onMapError(e: Throwable) = 0

        /**
         * if true alert will not be shown
         */
        fun onHandleError(e: Throwable) = false

        /* not overridable */
        fun ObserverBehavior.processStart() {
            owner.disposables.add(this)
            progressMode.processStart.invoke(owner)
        }

        /* not overridable */
        fun ObserverBehavior.processError(e: Throwable) {
            processTerminate()
            showAlertIfNotHandled(e)
        }

        /* not overridable */
        fun ObserverBehavior.processCompletion() {
            processTerminate()

            if (messageAfterCompletion != 0) {
                owner.showSystemMessage(messageAfterCompletion)
            }

            if (exitAfterCompletion) {
                owner.router.exit()
            }
        }

        /* not overridable */
        fun ObserverBehavior.processTerminate() {
            progressMode.processTerminate(owner)
        }

        /* not overridable */
        fun ObserverBehavior.showAlertIfNotHandled(e: Throwable) {
            if (!onHandleError(e)) {

                val messageId =
                        R.string.error_connect.takeIf { e is IOException }
                                ?: onMapError(e)

                val (screenKey, data) = when (messageId) {
                    0 -> Screens.ERROR to (e.message ?: "Unknown Error")
                    else -> Screens.ALERT to messageId
                }

                owner.router.navigateTo(screenKey, data)
                e.printStackTrace()
            }
        }
    }


    protected abstract inner class BaseObserver<T>(
            override val messageAfterCompletion: Int = 0,
            override val exitAfterCompletion: Boolean = false
    ) : DisposableObserver<T>(),
            ObserverBehavior {

        final override val owner get() = this@BaseViewModel

        @CallSuper
        override fun onStart() {
            processStart()
        }

        @CallSuper
        override fun onComplete() {
            processCompletion()
        }

        @CallSuper
        override fun onError(e: Throwable) {
            showAlertIfNotHandled(e)
        }
    }


    protected open inner class BaseSingleObserver<T>(
            override val messageAfterCompletion: Int = 0,
            override val exitAfterCompletion: Boolean = false
    ) : DisposableSingleObserver<T>(),
            ObserverBehavior {

        final override val owner get() = this@BaseViewModel

        @CallSuper
        override fun onStart() {
            processStart()
        }

        @CallSuper
        override fun onSuccess(t: T) {
            processCompletion()
        }

        @CallSuper
        override fun onError(e: Throwable) {
            processError(e)
        }
    }


    protected open inner class BaseMaybeObserver<T>(
            override val messageAfterCompletion: Int = 0,
            override val exitAfterCompletion: Boolean = false
    ) : DisposableMaybeObserver<T>(),
            ObserverBehavior {

        final override val owner get() = this@BaseViewModel

        @CallSuper
        override fun onStart() {
            processStart()
        }

        @CallSuper
        override fun onSuccess(t: T) {
            processCompletion()
        }

        @CallSuper
        override fun onComplete() {
            processCompletion()
        }

        @CallSuper
        override fun onError(e: Throwable) {
            processError(e)
        }
    }

    protected open inner class BaseCompletableObserver(
            override val messageAfterCompletion: Int = 0,
            override val exitAfterCompletion: Boolean = false
    ) : DisposableCompletableObserver(),
            ObserverBehavior {

        final override val owner get() = this@BaseViewModel

        @CallSuper
        override fun onStart() {
            processStart()
        }

        @CallSuper
        override fun onComplete() {
            processCompletion()
        }

        @CallSuper
        override fun onError(e: Throwable) {
            processError(e)
        }
    }


    protected open inner class NoResponseFromServerCompletableObserver(
    ) : DisposableCompletableObserver(){

        @CallSuper
        override fun onStart() {
        }

        @CallSuper
        override fun onComplete() {
        }

        @CallSuper
        override fun onError(e: Throwable) {
        }
    }


    protected abstract inner class LazyRefreshable<R> : Refreshable() {

        private var criteria: ReloadCriteria = ReloadCriteria.IF_EXPIRED

        protected abstract fun doExecute(criteria: ReloadCriteria, o: DisposableObserver<R>)
        protected abstract fun onValue(value: R)

        protected abstract fun onError(e: Throwable)

        final override fun onRefresh() {
            doExecute(criteria, ObserverImpl())
            criteria = ReloadCriteria.FORCED
        }

        private inner class ObserverImpl : RefreshableObserver<R>(this) {

            override fun onNext(t: R) {
                onValue(t)
            }

            override fun onError(e: Throwable) {
                super.onError(e)
                this@LazyRefreshable.onError(e)
            }
        }
    }


    protected class RefreshableProgressMode(refreshable: Refreshable)
        : ProgressMode(
            {},
            { refreshable.notifyRefreshTerminated() }
    )


    protected abstract inner class RefreshableObserver<R>(refreshable: Refreshable)
        : BaseObserver<R>() {

        override val progressMode = RefreshableProgressMode(refreshable)
    }


    protected abstract inner class RefreshableSingleObserver<R>(
            refreshable: Refreshable
    ) : BaseSingleObserver<R>() {

        override val progressMode = RefreshableProgressMode(refreshable)
    }
}
