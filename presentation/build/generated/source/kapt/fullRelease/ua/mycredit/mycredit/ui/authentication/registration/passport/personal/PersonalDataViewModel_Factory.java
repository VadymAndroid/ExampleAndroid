// Generated by Dagger (https://google.github.io/dagger).
package ua.mycredit.mycredit.ui.authentication.registration.passport.personal;

import com.google.firebase.analytics.FirebaseAnalytics;
import dagger.internal.Factory;
import javax.inject.Provider;
import ru.terrakok.cicerone.Router;
import ua.mycredit.core.LocalStorage;
import ua.mycredit.core.Logouter;
import ua.mycredit.core.interactors.CheckTinUseCase;
import ua.mycredit.core.interactors.PhoneOptionsUseCase;
import ua.mycredit.core.internal.Logger;
import ua.mycredit.mycredit.AppEvents;
import ua.mycredit.mycredit.ui.MessagesMapper;
import ua.mycredit.mycredit.ui.bases.BaseViewModel_MembersInjector;
import ua.mycredit.mycredit.ui.bases.input.FormViewModel_MembersInjector;

public final class PersonalDataViewModel_Factory implements Factory<PersonalDataViewModel> {
  private final Provider<CheckTinUseCase> checkTinProvider;

  private final Provider<PhoneOptionsUseCase> phoneOptionsUseCaseProvider;

  private final Provider<Router> routerProvider;

  private final Provider<AppEvents> eventsProvider;

  private final Provider<Logouter> logouterProvider;

  private final Provider<FirebaseAnalytics> analyticsProvider;

  private final Provider<MessagesMapper> messagesMapperProvider;

  private final Provider<LocalStorage> storageProvider;

  private final Provider<Logger> loggerProvider;

  public PersonalDataViewModel_Factory(
      Provider<CheckTinUseCase> checkTinProvider,
      Provider<PhoneOptionsUseCase> phoneOptionsUseCaseProvider,
      Provider<Router> routerProvider,
      Provider<AppEvents> eventsProvider,
      Provider<Logouter> logouterProvider,
      Provider<FirebaseAnalytics> analyticsProvider,
      Provider<MessagesMapper> messagesMapperProvider,
      Provider<LocalStorage> storageProvider,
      Provider<Logger> loggerProvider) {
    this.checkTinProvider = checkTinProvider;
    this.phoneOptionsUseCaseProvider = phoneOptionsUseCaseProvider;
    this.routerProvider = routerProvider;
    this.eventsProvider = eventsProvider;
    this.logouterProvider = logouterProvider;
    this.analyticsProvider = analyticsProvider;
    this.messagesMapperProvider = messagesMapperProvider;
    this.storageProvider = storageProvider;
    this.loggerProvider = loggerProvider;
  }

  @Override
  public PersonalDataViewModel get() {
    return provideInstance(
        checkTinProvider,
        phoneOptionsUseCaseProvider,
        routerProvider,
        eventsProvider,
        logouterProvider,
        analyticsProvider,
        messagesMapperProvider,
        storageProvider,
        loggerProvider);
  }

  public static PersonalDataViewModel provideInstance(
      Provider<CheckTinUseCase> checkTinProvider,
      Provider<PhoneOptionsUseCase> phoneOptionsUseCaseProvider,
      Provider<Router> routerProvider,
      Provider<AppEvents> eventsProvider,
      Provider<Logouter> logouterProvider,
      Provider<FirebaseAnalytics> analyticsProvider,
      Provider<MessagesMapper> messagesMapperProvider,
      Provider<LocalStorage> storageProvider,
      Provider<Logger> loggerProvider) {
    PersonalDataViewModel instance =
        new PersonalDataViewModel(checkTinProvider.get(), phoneOptionsUseCaseProvider.get());
    BaseViewModel_MembersInjector.injectRouter(instance, routerProvider.get());
    BaseViewModel_MembersInjector.injectEvents(instance, eventsProvider.get());
    BaseViewModel_MembersInjector.injectLogouter(instance, logouterProvider.get());
    BaseViewModel_MembersInjector.injectAnalytics(instance, analyticsProvider.get());
    BaseViewModel_MembersInjector.injectMessagesMapper(instance, messagesMapperProvider.get());
    BaseViewModel_MembersInjector.injectStorage(instance, storageProvider.get());
    BaseViewModel_MembersInjector.injectLogger(instance, loggerProvider.get());
    BaseViewModel_MembersInjector.injectBindToAppEvents(instance);
    FormViewModel_MembersInjector.injectInitFields(instance);
    return instance;
  }

  public static PersonalDataViewModel_Factory create(
      Provider<CheckTinUseCase> checkTinProvider,
      Provider<PhoneOptionsUseCase> phoneOptionsUseCaseProvider,
      Provider<Router> routerProvider,
      Provider<AppEvents> eventsProvider,
      Provider<Logouter> logouterProvider,
      Provider<FirebaseAnalytics> analyticsProvider,
      Provider<MessagesMapper> messagesMapperProvider,
      Provider<LocalStorage> storageProvider,
      Provider<Logger> loggerProvider) {
    return new PersonalDataViewModel_Factory(
        checkTinProvider,
        phoneOptionsUseCaseProvider,
        routerProvider,
        eventsProvider,
        logouterProvider,
        analyticsProvider,
        messagesMapperProvider,
        storageProvider,
        loggerProvider);
  }

  public static PersonalDataViewModel newPersonalDataViewModel(
      CheckTinUseCase checkTin, PhoneOptionsUseCase phoneOptionsUseCase) {
    return new PersonalDataViewModel(checkTin, phoneOptionsUseCase);
  }
}
