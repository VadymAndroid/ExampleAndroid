// Generated by Dagger (https://google.github.io/dagger).
package ua.mycredit.mycredit.ui.profile.profile.details;

import com.google.firebase.analytics.FirebaseAnalytics;
import dagger.MembersInjector;
import javax.inject.Provider;
import ru.terrakok.cicerone.Router;
import ua.mycredit.core.LocalStorage;
import ua.mycredit.core.Logouter;
import ua.mycredit.core.internal.Logger;
import ua.mycredit.mycredit.AppEvents;
import ua.mycredit.mycredit.ui.MessagesMapper;
import ua.mycredit.mycredit.ui.bases.BaseViewModel_MembersInjector;

public final class DetailsViewModel_MembersInjector implements MembersInjector<DetailsViewModel> {
  private final Provider<Router> routerProvider;

  private final Provider<AppEvents> eventsProvider;

  private final Provider<Logouter> logouterProvider;

  private final Provider<FirebaseAnalytics> analyticsProvider;

  private final Provider<MessagesMapper> messagesMapperProvider;

  private final Provider<LocalStorage> storageProvider;

  private final Provider<Logger> loggerProvider;

  public DetailsViewModel_MembersInjector(
      Provider<Router> routerProvider,
      Provider<AppEvents> eventsProvider,
      Provider<Logouter> logouterProvider,
      Provider<FirebaseAnalytics> analyticsProvider,
      Provider<MessagesMapper> messagesMapperProvider,
      Provider<LocalStorage> storageProvider,
      Provider<Logger> loggerProvider) {
    this.routerProvider = routerProvider;
    this.eventsProvider = eventsProvider;
    this.logouterProvider = logouterProvider;
    this.analyticsProvider = analyticsProvider;
    this.messagesMapperProvider = messagesMapperProvider;
    this.storageProvider = storageProvider;
    this.loggerProvider = loggerProvider;
  }

  public static MembersInjector<DetailsViewModel> create(
      Provider<Router> routerProvider,
      Provider<AppEvents> eventsProvider,
      Provider<Logouter> logouterProvider,
      Provider<FirebaseAnalytics> analyticsProvider,
      Provider<MessagesMapper> messagesMapperProvider,
      Provider<LocalStorage> storageProvider,
      Provider<Logger> loggerProvider) {
    return new DetailsViewModel_MembersInjector(
        routerProvider,
        eventsProvider,
        logouterProvider,
        analyticsProvider,
        messagesMapperProvider,
        storageProvider,
        loggerProvider);
  }

  @Override
  public void injectMembers(DetailsViewModel instance) {
    BaseViewModel_MembersInjector.injectRouter(instance, routerProvider.get());
    BaseViewModel_MembersInjector.injectEvents(instance, eventsProvider.get());
    BaseViewModel_MembersInjector.injectLogouter(instance, logouterProvider.get());
    BaseViewModel_MembersInjector.injectAnalytics(instance, analyticsProvider.get());
    BaseViewModel_MembersInjector.injectMessagesMapper(instance, messagesMapperProvider.get());
    BaseViewModel_MembersInjector.injectStorage(instance, storageProvider.get());
    BaseViewModel_MembersInjector.injectLogger(instance, loggerProvider.get());
    BaseViewModel_MembersInjector.injectBindToAppEvents(instance);
  }
}