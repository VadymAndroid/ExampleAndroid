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
import ua.mycredit.core.ProductRepo;
import ua.mycredit.core.internal.AppMetaData;
import ua.mycredit.core.internal.Logger;

public final class ApplyForCreditUseCase_Factory implements Factory<ApplyForCreditUseCase> {
  private final Provider<ProductRepo> arg0Provider;

  private final Provider<NetworkFacade> networkFacadeProvider;

  private final Provider<LocalStorage> localStorageProvider;

  private final Provider<Map<BaseUseCase.SchedulerType, ? extends Scheduler>> schedulersProvider;

  private final Provider<Logger> loggerProvider;

  private final Provider<AppMetaData> appMetaDataProvider;

  public ApplyForCreditUseCase_Factory(
      Provider<ProductRepo> arg0Provider,
      Provider<NetworkFacade> networkFacadeProvider,
      Provider<LocalStorage> localStorageProvider,
      Provider<Map<BaseUseCase.SchedulerType, ? extends Scheduler>> schedulersProvider,
      Provider<Logger> loggerProvider,
      Provider<AppMetaData> appMetaDataProvider) {
    this.arg0Provider = arg0Provider;
    this.networkFacadeProvider = networkFacadeProvider;
    this.localStorageProvider = localStorageProvider;
    this.schedulersProvider = schedulersProvider;
    this.loggerProvider = loggerProvider;
    this.appMetaDataProvider = appMetaDataProvider;
  }

  @Override
  public ApplyForCreditUseCase get() {
    return provideInstance(
        arg0Provider,
        networkFacadeProvider,
        localStorageProvider,
        schedulersProvider,
        loggerProvider,
        appMetaDataProvider);
  }

  public static ApplyForCreditUseCase provideInstance(
      Provider<ProductRepo> arg0Provider,
      Provider<NetworkFacade> networkFacadeProvider,
      Provider<LocalStorage> localStorageProvider,
      Provider<Map<BaseUseCase.SchedulerType, ? extends Scheduler>> schedulersProvider,
      Provider<Logger> loggerProvider,
      Provider<AppMetaData> appMetaDataProvider) {
    ApplyForCreditUseCase instance = new ApplyForCreditUseCase(arg0Provider.get());
    BaseUseCase_MembersInjector.injectNetworkFacade(instance, networkFacadeProvider.get());
    BaseUseCase_MembersInjector.injectLocalStorage(instance, localStorageProvider.get());
    BaseUseCase_MembersInjector.injectSchedulers(instance, schedulersProvider.get());
    BaseUseCase_MembersInjector.injectLogger(instance, loggerProvider.get());
    BaseUseCase_MembersInjector.injectAppMetaData(instance, appMetaDataProvider.get());
    return instance;
  }

  public static ApplyForCreditUseCase_Factory create(
      Provider<ProductRepo> arg0Provider,
      Provider<NetworkFacade> networkFacadeProvider,
      Provider<LocalStorage> localStorageProvider,
      Provider<Map<BaseUseCase.SchedulerType, ? extends Scheduler>> schedulersProvider,
      Provider<Logger> loggerProvider,
      Provider<AppMetaData> appMetaDataProvider) {
    return new ApplyForCreditUseCase_Factory(
        arg0Provider,
        networkFacadeProvider,
        localStorageProvider,
        schedulersProvider,
        loggerProvider,
        appMetaDataProvider);
  }

  public static ApplyForCreditUseCase newApplyForCreditUseCase(ProductRepo arg0) {
    return new ApplyForCreditUseCase(arg0);
  }
}