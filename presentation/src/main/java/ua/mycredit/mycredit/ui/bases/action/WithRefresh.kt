package ua.mycredit.mycredit.ui.bases.action

import android.databinding.Observable
import android.databinding.ObservableBoolean

fun WithRefresh.refresh() {
    asRefreshable.refresh()
}

interface WithRefresh {

    val asRefreshable: Refreshable
}

abstract class Refreshable {

    val refreshing = ObservableBoolean()

    init {
        refreshing.addOnPropertyChangedCallback(OnRefreshedCallback())
    }

    protected abstract fun onRefresh()

    fun refresh() {
        refreshing.set(true)
    }

    fun notifyRefreshTerminated() {
        refreshing.set(false)
    }


    private inner class OnRefreshedCallback : Observable.OnPropertyChangedCallback() {

        override fun onPropertyChanged(sender: Observable?, propertyId: Int) {
            if (refreshing.get()) {
                onRefresh()
            }
        }
    }
}


class RefreshableDecorator(private val onRefresh: () -> Unit) : Refreshable() {

    override fun onRefresh() {
        onRefresh.invoke()
    }
}
