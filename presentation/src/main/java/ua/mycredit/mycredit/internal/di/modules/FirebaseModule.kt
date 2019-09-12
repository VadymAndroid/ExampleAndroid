package ua.mycredit.mycredit.internal.di.modules

import android.content.Context
import com.google.firebase.analytics.FirebaseAnalytics
import dagger.Module
import dagger.Provides

@Module
class FirebaseModule {

    @Provides
    fun getFirebaseAnalytics(context: Context) =
            FirebaseAnalytics.getInstance(context)
}
