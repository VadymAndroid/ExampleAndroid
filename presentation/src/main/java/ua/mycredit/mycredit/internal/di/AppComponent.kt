package ua.mycredit.mycredit.internal.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import ua.mycredit.data.di.NetworkModule
import ua.mycredit.mycredit.AndroidApplication
import ua.mycredit.mycredit.internal.di.modules.*
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    ActivitiesModule::class,
    FragmentsModule::class,
    ViewModelModule::class,
    ImplsModule::class,
    RouterModule::class,
    SchedulersModule::class,
    NetworkModule::class,
    FirebaseModule::class
])
interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance fun context(context: Context): Builder

        fun build(): AppComponent
    }

    fun inject(app: AndroidApplication)
}
