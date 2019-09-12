package ua.mycredit.mycredit.services

import android.app.PendingIntent
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.NotificationCompat
import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.notificationManager
import ua.mycredit.mycredit.R
import ua.mycredit.mycredit.ui.launch.SplashActivity


class FirebaseMessagingServiceImpl: FirebaseMessagingService() {

    override fun onMessageReceived(remoteMessage: RemoteMessage?) {
        super.onMessageReceived(remoteMessage)


        if (remoteMessage?.notification != null) {
            if (getAndSaveBundle(remoteMessage)["link"] != null) {
                sendWebNotification(getAndSaveBundle(remoteMessage), remoteMessage.notification?.body)
            }else {
                sendSimpleNotification(remoteMessage.notification?.body)
            }
        }
    }


    private fun sendSimpleNotification(messageBody: String?) {
        notificationManager.notify(
                System.currentTimeMillis().toInt(),
                showNotificationCompact(messageBody, pendingIntent(intentFor<SplashActivity>())).build()
        )
    }

    //it is necessary to fill in the fields link
    private fun sendWebNotification(bundle: Bundle, messageBody: String?) {
        notificationManager.notify(
                System.currentTimeMillis().toInt(),
                showNotificationCompact(messageBody,
                        pendingIntent(Intent(Intent.ACTION_VIEW,
                                Uri.parse(bundle["link"] as String?)))).build()
        )
    }


    override fun onNewToken(s: String?) {
        super.onNewToken(s)
        Log.e("newToken", s)
    }

    private fun showNotificationCompact(messageBody: String?, pendingIntent: PendingIntent): NotificationCompat.Builder{

        return NotificationCompat.Builder(this, getString(R.string.app_name))
                .setSmallIcon(R.drawable.ic_logo_my_credit)
                .setContentTitle(getString(R.string.app_name))
                .setContentText(messageBody)
                .setAutoCancel(true)
                .setContentIntent(pendingIntent)
    }

    private fun getAndSaveBundle(remoteMessage: RemoteMessage): Bundle{
        val data = Bundle()
        for (entry in remoteMessage.data.entries) {
            data.putString(entry.key, entry.value)
        }
        return data
    }

    private fun pendingIntent(intent: Intent): PendingIntent{
        return PendingIntent.getActivity(
                this,
                0,
                intent,
                PendingIntent.FLAG_UPDATE_CURRENT
        )
    }
}
