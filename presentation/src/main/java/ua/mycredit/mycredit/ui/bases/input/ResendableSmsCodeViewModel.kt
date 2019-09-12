package ua.mycredit.mycredit.ui.bases.input

import android.databinding.ObservableLong
import ua.mycredit.core.interactors.CountDownUseCase
import javax.inject.Inject

abstract class ResendableSmsCodeViewModel : BaseSmsCodeViewModel() {

    @Inject lateinit var countDown: CountDownUseCase

    val resendAvailableAfter = ObservableLong(RESEND_DELAY_SECONDS)

    protected open val timerAutoStartEnabled = true

    abstract fun requestCode()

    @Inject
    fun startTimerIfEnabled() {
        if (timerAutoStartEnabled) {
            startTimer()
        }
    }

    protected fun startTimer() {
        countDown.execute(
                CountDownUseCase.Params(RESEND_DELAY_SECONDS),
                CountDownObserver()
        )
    }

    open fun enterAnotherNumber() {
        router.exit()
    }


    protected inner class RequestSmsObserver : BaseCompletableObserver() {

        override val progressMode = ProgressMode.DIALOG

        override fun onComplete() {
            super.onComplete()
            startTimer()
        }
    }


    private inner class CountDownObserver : BaseObserver<CountDownUseCase.Result>() {

        override val progressMode: ProgressMode = ProgressMode.EMPTY

        override fun onNext(t: CountDownUseCase.Result) {
            resendAvailableAfter.set(t.timeToFinish)
        }
    }


    companion object {
        const val RESEND_DELAY_SECONDS = 30L
    }
}
