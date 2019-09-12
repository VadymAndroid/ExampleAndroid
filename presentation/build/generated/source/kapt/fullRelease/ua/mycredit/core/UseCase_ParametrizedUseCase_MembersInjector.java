// Generated by Dagger (https://google.github.io/dagger).
package ua.mycredit.core;

import dagger.MembersInjector;
import io.reactivex.Scheduler;
import java.util.Map;
import javax.inject.Provider;
import ua.mycredit.core.internal.AppMetaData;
import ua.mycredit.core.internal.Logger;

public final class UseCase_ParametrizedUseCase_MembersInjector<P, R>
    implements MembersInjector<UseCase.ParametrizedUseCase<P, R>> {
  private final Provider<NetworkFacade> networkFacadeProvider;

  private final Provider<LocalStorage> localStorageProvider;

  private final Provider<Map<BaseUseCase.SchedulerType, ? extends Scheduler>> schedulersProvider;

  private final Provider<Logger> loggerProvider;

  private final Provider<AppMetaData> appMetaDataProvider;

  public UseCase_ParametrizedUseCase_MembersInjector(
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

  public static <P, R> MembersInjector<UseCase.ParametrizedUseCase<P, R>> create(
      Provider<NetworkFacade> networkFacadeProvider,
      Provider<LocalStorage> localStorageProvider,
      Provider<Map<BaseUseCase.SchedulerType, ? extends Scheduler>> schedulersProvider,
      Provider<Logger> loggerProvider,
      Provider<AppMetaData> appMetaDataProvider) {
    return new UseCase_ParametrizedUseCase_MembersInjector<P, R>(
        networkFacadeProvider,
        localStorageProvider,
        schedulersProvider,
        loggerProvider,
        appMetaDataProvider);
  }

  @Override
  public void injectMembers(UseCase.ParametrizedUseCase<P, R> instance) {
    BaseUseCase_MembersInjector.injectNetworkFacade(instance, networkFacadeProvider.get());
    BaseUseCase_MembersInjector.injectLocalStorage(instance, localStorageProvider.get());
    BaseUseCase_MembersInjector.injectSchedulers(instance, schedulersProvider.get());
    BaseUseCase_MembersInjector.injectLogger(instance, loggerProvider.get());
    BaseUseCase_MembersInjector.injectAppMetaData(instance, appMetaDataProvider.get());
  }
}
