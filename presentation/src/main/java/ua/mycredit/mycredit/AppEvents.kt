package ua.mycredit.mycredit

import ua.mycredit.core.Card
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppEvents @Inject constructor() {

    private val listeners: MutableList<Listener> = mutableListOf()

    fun addListener(listener: Listener) {
        listeners.add(listener)
    }

    fun removeListener(listener: Listener) {
        listeners.remove(listener)
    }

    fun notifyListeners(notification: (Listener) -> Unit) {
        listeners.forEach(notification)
    }

    interface Listener {

        fun onCreditApplied() {}
        fun onAgreementAccepted() {}

        fun onCardVerified() {}
        fun onCardDeleted() {}
        fun onCardAdded() {}
        fun onBankingCompleted() {}
        fun onMainCardChanged() {}

        fun onCardListUpdated() {}

        fun onCardSelected(card: Card) {}

        fun onCreditProlongationApplied() {}

        fun onProfileUpdated() {}
        fun onPromoCodeChanged() {}

        fun onStatusUpdated() {}
    }
}
