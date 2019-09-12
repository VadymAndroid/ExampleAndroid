package ua.mycredit.mycredit.ui.bases.input

import android.support.annotation.CallSuper
import ua.mycredit.core.CompletableUseCase

abstract class SimpleFormViewModel<P : Any> : FormViewModel() {

    protected abstract val sendForm: CompletableUseCase.ParametrizedUseCase<P>

    protected abstract fun collectFields(): P

    @CallSuper
    override fun onReadyToSend() {
        sendForm.execute(collectFields(), FormSendingObserver())
    }

    protected abstract fun onFormSent()

    private inner class FormSendingObserver : BaseCompletableObserver() {

        override fun onComplete() {
            super.onComplete()
            onFormSent()
        }
    }
}
