package ua.mycredit.mycredit.internal.impls

import android.content.Context
import android.content.Intent
import android.support.v4.app.FragmentActivity
import org.jetbrains.anko.toast
import ru.terrakok.cicerone.android.SupportFragmentNavigator
import ru.terrakok.cicerone.commands.Forward
import ru.terrakok.cicerone.commands.Replace

abstract class SupportAppNavigator(
        private val activity: FragmentActivity,
        containerId: Int
) : SupportFragmentNavigator(activity.supportFragmentManager, containerId) {

    override fun forward(command: Forward) {
        createActivityIntent(activity, command.screenKey, command.transitionData).let {
            when {
                it != null -> checkAndStartActivity(command.screenKey, it)
                else -> super.forward(command)
            }
        }
    }

    override fun replace(command: Replace) {
        createActivityIntent(activity, command.screenKey, command.transitionData).let {
            when {
                it != null -> {
                    checkAndStartActivity(command.screenKey, it)
                    activity.finish()
                }
                else -> super.replace(command)
            }
        }
    }

    private fun checkAndStartActivity(screenKey: String, activityIntent: Intent) {
        if (activityIntent.resolveActivity(activity.packageManager) != null) {
            activity.startActivity(activityIntent)
        } else {
            unexistingActivity(screenKey, activityIntent)
        }
    }

    protected fun unexistingActivity(screenKey: String, activityIntent: Intent) {}

    protected abstract fun createActivityIntent(context: Context, screenKey: String, data: Any?): Intent?

    override fun showSystemMessage(message: String) {
        activity.toast(message)
    }

    override fun exit() {
        activity.finish()
    }
}
