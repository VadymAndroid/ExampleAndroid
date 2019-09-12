// Generated by Dagger (https://google.github.io/dagger).
package ua.mycredit.mycredit.ui.profile.cards;

import com.google.firebase.analytics.FirebaseAnalytics;
import dagger.internal.Factory;
import javax.inject.Provider;
import ru.terrakok.cicerone.Router;
import ua.mycredit.core.LocalStorage;
import ua.mycredit.core.Logouter;
import ua.mycredit.core.interactors.DeleteCardUseCase;
import ua.mycredit.core.interactors.LoadCardsUseCase;
import ua.mycredit.core.interactors.MarkAsMainUseCase;
import ua.mycredit.core.interactors.VerifyCardUseCase;
import ua.mycredit.core.internal.Logger;
import ua.mycredit.mycredit.AppEvents;
import ua.mycredit.mycredit.ui.MessagesMapper;
import ua.mycredit.mycredit.ui.bases.BaseViewModel_MembersInjector;

public final class CardsViewModel_Factory implements Factory<CardsViewModel> {
  private final Provider<LoadCardsUseCase> loadItemsProvider;

  private final Provider<MarkAsMainUseCase> markAsMainProvider;

  private final Provider<VerifyCardUseCase> verifyCardProvider;

  private final Provider<DeleteCardUseCase> deleteCardProvider;

  private final Provider<Router> routerProvider;

  private final Provider<AppEvents> eventsProvider;

  private final Provider<Logouter> logouterProvider;

  private final Provider<FirebaseAnalytics> analyticsProvider;

  private final Provider<MessagesMapper> messagesMapperProvider;

  private final Provider<LocalStorage> storageProvider;

  private final Provider<Logger> loggerProvider;

  public CardsViewModel_Factory(
      Provider<LoadCardsUseCase> loadItemsProvider,
      Provider<MarkAsMainUseCase> markAsMainProvider,
      Provider<VerifyCardUseCase> verifyCardProvider,
      Provider<DeleteCardUseCase> deleteCardProvider,
      Provider<Router> routerProvider,
      Provider<AppEvents> eventsProvider,
      Provider<Logouter> logouterProvider,
      Provider<FirebaseAnalytics> analyticsProvider,
      Provider<MessagesMapper> messagesMapperProvider,
      Provider<LocalStorage> storageProvider,
      Provider<Logger> loggerProvider) {
    this.loadItemsProvider = loadItemsProvider;
    this.markAsMainProvider = markAsMainProvider;
    this.verifyCardProvider = verifyCardProvider;
    this.deleteCardProvider = deleteCardProvider;
    this.routerProvider = routerProvider;
    this.eventsProvider = eventsProvider;
    this.logouterProvider = logouterProvider;
    this.analyticsProvider = analyticsProvider;
    this.messagesMapperProvider = messagesMapperProvider;
    this.storageProvider = storageProvider;
    this.loggerProvider = loggerProvider;
  }

  @Override
  public CardsViewModel get() {
    return provideInstance(
        loadItemsProvider,
        markAsMainProvider,
        verifyCardProvider,
        deleteCardProvider,
        routerProvider,
        eventsProvider,
        logouterProvider,
        analyticsProvider,
        messagesMapperProvider,
        storageProvider,
        loggerProvider);
  }

  public static CardsViewModel provideInstance(
      Provider<LoadCardsUseCase> loadItemsProvider,
      Provider<MarkAsMainUseCase> markAsMainProvider,
      Provider<VerifyCardUseCase> verifyCardProvider,
      Provider<DeleteCardUseCase> deleteCardProvider,
      Provider<Router> routerProvider,
      Provider<AppEvents> eventsProvider,
      Provider<Logouter> logouterProvider,
      Provider<FirebaseAnalytics> analyticsProvider,
      Provider<MessagesMapper> messagesMapperProvider,
      Provider<LocalStorage> storageProvider,
      Provider<Logger> loggerProvider) {
    CardsViewModel instance =
        new CardsViewModel(
            loadItemsProvider.get(),
            markAsMainProvider.get(),
            verifyCardProvider.get(),
            deleteCardProvider.get());
    BaseViewModel_MembersInjector.injectRouter(instance, routerProvider.get());
    BaseViewModel_MembersInjector.injectEvents(instance, eventsProvider.get());
    BaseViewModel_MembersInjector.injectLogouter(instance, logouterProvider.get());
    BaseViewModel_MembersInjector.injectAnalytics(instance, analyticsProvider.get());
    BaseViewModel_MembersInjector.injectMessagesMapper(instance, messagesMapperProvider.get());
    BaseViewModel_MembersInjector.injectStorage(instance, storageProvider.get());
    BaseViewModel_MembersInjector.injectLogger(instance, loggerProvider.get());
    BaseViewModel_MembersInjector.injectBindToAppEvents(instance);
    return instance;
  }

  public static CardsViewModel_Factory create(
      Provider<LoadCardsUseCase> loadItemsProvider,
      Provider<MarkAsMainUseCase> markAsMainProvider,
      Provider<VerifyCardUseCase> verifyCardProvider,
      Provider<DeleteCardUseCase> deleteCardProvider,
      Provider<Router> routerProvider,
      Provider<AppEvents> eventsProvider,
      Provider<Logouter> logouterProvider,
      Provider<FirebaseAnalytics> analyticsProvider,
      Provider<MessagesMapper> messagesMapperProvider,
      Provider<LocalStorage> storageProvider,
      Provider<Logger> loggerProvider) {
    return new CardsViewModel_Factory(
        loadItemsProvider,
        markAsMainProvider,
        verifyCardProvider,
        deleteCardProvider,
        routerProvider,
        eventsProvider,
        logouterProvider,
        analyticsProvider,
        messagesMapperProvider,
        storageProvider,
        loggerProvider);
  }

  public static CardsViewModel newCardsViewModel(
      LoadCardsUseCase loadItems,
      MarkAsMainUseCase markAsMain,
      VerifyCardUseCase verifyCard,
      DeleteCardUseCase deleteCard) {
    return new CardsViewModel(loadItems, markAsMain, verifyCard, deleteCard);
  }
}
