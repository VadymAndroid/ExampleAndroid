// Generated by Dagger (https://google.github.io/dagger).
package ua.mycredit.core.interactors;

import dagger.internal.Factory;
import io.reactivex.Scheduler;
import java.util.Map;
import javax.inject.Provider;
import ua.mycredit.core.BaseUseCase;
import ua.mycredit.core.BaseUseCase_MembersInjector;
import ua.mycredit.core.LocalStorage;
import ua.mycredit.core.NetworkFacade;
import ua.mycredit.core.internal.AppMetaData;
import ua.mycredit.core.internal.Logger;

public final class LoadHistoryUseCase_Factory implements Factory<LoadHistoryUseCase> {
  private final Provider<NetworkFacade> networkFacadeProvider;

  private final Provider<LocalStorage> localStorageProvider;

  private final Provider<Map<BaseUseCase.SchedulerType, ? extends Scheduler>> schedulersProvider;

  private final Provider<Logger> loggerProvider;

  private final Provider<AppMetaData> appMetaDataProvider;

  public LoadHistoryUseCase_Factory(
      Provider<NetworkFacade> networkFacadeProvider,
      Provider<LocalStorage> localStorageProvider,
      Provider<Map<BaseUseCase.SchedulerType, ? extends Scheduler>> schedulersProvider,
      Provider<Logger> loggerProvider,
      Provider<AppMetaData> appMetaDataProvider) {
    this.networkFacadeProvider = networkFacadeProvider;
    this.localStorageProvider = localStorageProvider;
    this.schedulersProvider = schedulersProvider;
    this.loggerProvider = loggerProvider;
    this.appMetaDataProvider = appMetaDataProvider;
  }

  @Override
  public LoadHistoryUseCase get() {
    return provideInstance(
        networkFacadeProvider,
        localStorageProvider,
        schedulersProvider,
        loggerProvider,
        appMetaDataProvider);
  }

  public static LoadHistoryUseCase provideInstance(
      Provider<NetworkFacade> networkFacadeProvider,
      Provider<LocalStorage> localStorageProvider,
      Provider<Map<BaseUseCase.SchedulerType, ? extends Scheduler>> schedulersProvider,
      Provider<Logger> loggerProvider,
      Provider<AppMetaData> appMetaDataProvider) {
    LoadHistoryUseCase instance = new LoadHistoryUseCase();
    BaseUseCase_MembersInjector.injectNetworkFacade(instance, networkFacadeProvider.get());
    BaseUseCase_MembersInjector.injectLocalStorage(instance, localStorageProvider.get());
    BaseUseCase_MembersInjector.injectSchedulers(instance, schedulersProvider.get());
    BaseUseCase_MembersInjector.injectLogger(instance, loggerProvider.get());
    BaseUseCase_MembersInjector.injectAppMetaData(instance, appMetaDataProvider.get());
    return instance;
  }

  public static LoadHistoryUseCase_Factory create(
      Provider<NetworkFacade> networkFacadeProvider,
      Provider<LocalStorage> localStorageProvider,
      Provider<Map<BaseUseCase.SchedulerType, ? extends Scheduler>> schedulersProvider,
      Provider<Logger> loggerProvider,
      Provider<AppMetaData> appMetaDataProvider) {
    return new LoadHistoryUseCase_Factory(
        networkFacadeProvider,
        localStorageProvider,
        schedulersProvider,
        loggerProvider,
        appMetaDataProvider);
  }

  public static LoadHistoryUseCase newLoadHistoryUseCase() {
    return new LoadHistoryUseCase();
  }
}
