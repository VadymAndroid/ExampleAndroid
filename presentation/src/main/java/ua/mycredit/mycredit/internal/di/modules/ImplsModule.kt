package ua.mycredit.mycredit.internal.di.modules

import android.arch.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import ua.mycredit.core.LocalStorage
import ua.mycredit.core.Logouter
import ua.mycredit.core.NetworkFacade
import ua.mycredit.core.internal.AppMetaData
import ua.mycredit.core.internal.Logger
import ua.mycredit.data.impls.LogouterImpl
import ua.mycredit.data.impls.NetworkFacadeImpl
import ua.mycredit.mycredit.internal.impls.*
import ua.mycredit.mycredit.ui.MessagesMapper

@Module
interface ImplsModule {

    @Binds fun provideLocalStorage(localStorage: LocalStorageImpl): LocalStorage
    @Binds fun provideLogouter(logouter: LogouterImpl): Logouter
    @Binds fun provideNetworkFacade(networkFacade: NetworkFacadeImpl): NetworkFacade
    @Binds fun bindViewModelFactory(factory: ViewModelFactoryImpl): ViewModelProvider.Factory
    @Binds fun messagesMapper(messagesMapper: MessagesMapperImpl): MessagesMapper
    @Binds fun logger(logger: LoggerImpl): Logger
    @Binds fun meta(meta: AppMetaDataImpl): AppMetaData
}
