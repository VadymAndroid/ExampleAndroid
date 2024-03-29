// Generated by Dagger (https://google.github.io/dagger).
package ua.mycredit.mycredit.ui.authentication.registration.passport.address;

import com.google.firebase.analytics.FirebaseAnalytics;
import dagger.internal.Factory;
import javax.inject.Provider;
import ru.terrakok.cicerone.Router;
import ua.mycredit.core.LocalStorage;
import ua.mycredit.core.Logouter;
import ua.mycredit.core.internal.Logger;
import ua.mycredit.mycredit.AppEvents;
import ua.mycredit.mycredit.ui.MessagesMapper;
import ua.mycredit.mycredit.ui.bases.BaseViewModel_MembersInjector;
import ua.mycredit.mycredit.ui.bases.input.FormViewModel_MembersInjector;

public final class SignUpAddressViewModel_Factory implements Factory<SignUpAddressViewModel> {
  private final Provider<LocalStorage> storageAndLocalStorageProvider;

  private final Provider<Router> routerProvider;

  private final Provider<AppEvents> eventsProvider;

  private final Provider<Logouter> logouterProvider;

  private final Provider<FirebaseAnalytics> analyticsProvider;

  private final Provider<MessagesMapper> messagesMapperProvider;

  private final Provider<Logger> loggerProvider;

  public SignUpAddressViewModel_Factory(
      Provider<LocalStorage> storageAndLocalStorageProvider,
      Provider<Router> routerProvider,
      Provider<AppEvents> eventsProvider,
      Provider<Logouter> logouterProvider,
      Provider<FirebaseAnalytics> analyticsProvider,
      Provider<MessagesMapper> messagesMapperProvider,
      Provider<Logger> loggerProvider) {
    this.storageAndLocalStorageProvider = storageAndLocalStorageProvider;
    this.routerProvider = routerProvider;
    this.eventsProvider = eventsProvider;
    this.logouterProvider = logouterProvider;
    this.analyticsProvider = analyticsProvider;
    this.messagesMapperProvider = messagesMapperProvider;
    this.loggerProvider = loggerProvider;
  }

  @Override
  public SignUpAddressViewModel get() {
    return provideInstance(
        storageAndLocalStorageProvider,
        routerProvider,
        eventsProvider,
        logouterProvider,
        analyticsProvider,
        messagesMapperProvider,
        loggerProvider);
  }

  public static SignUpAddressViewModel provideInstance(
      Provider<LocalStorage> storageAndLocalStorageProvider,
      Provider<Router> routerProvider,
      Provider<AppEvents> eventsProvider,
      Provider<Logouter> logouterProvider,
      Provider<FirebaseAnalytics> analyticsProvider,
      Provider<MessagesMapper> messagesMapperProvider,
      Provider<Logger> loggerProvider) {
    SignUpAddressViewModel instance =
        new SignUpAddressViewModel(storageAndLocalStorageProvider.get());
    BaseViewModel_MembersInjector.injectRouter(instance, routerProvider.get());
    BaseViewModel_MembersInjector.injectEvents(instance, eventsProvider.get());
    BaseViewModel_MembersInjector.injectLogouter(instance, logouterProvider.get());
    BaseViewModel_MembersInjector.injectAnalytics(instance, analyticsProvider.get());
    BaseViewModel_MembersInjector.injectMessagesMapper(instance, messagesMapperProvider.get());
    BaseViewModel_MembersInjector.injectStorage(instance, storageAndLocalStorageProvider.get());
    BaseViewModel_MembersInjector.injectLogger(instance, loggerProvider.get());
    BaseViewModel_MembersInjector.injectBindToAppEvents(instance);
    FormViewModel_MembersInjector.injectInitFields(instance);
    return instance;
  }

  public static SignUpAddressViewModel_Factory create(
      Provider<LocalStorage> storageAndLocalStorageProvider,
      Provider<Router> routerProvider,
      Provider<AppEvents> eventsProvider,
      Provider<Logouter> logouterProvider,
      Provider<FirebaseAnalytics> analyticsProvider,
      Provider<MessagesMapper> messagesMapperProvider,
      Provider<Logger> loggerProvider) {
    return new SignUpAddressViewModel_Factory(
        storageAndLocalStorageProvider,
        routerProvider,
        eventsProvider,
        logouterProvider,
        analyticsProvider,
        messagesMapperProvider,
        loggerProvider);
  }

  public static SignUpAddressViewModel newSignUpAddressViewModel(LocalStorage localStorage) {
    return new SignUpAddressViewModel(localStorage);
  }
}
