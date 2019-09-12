// Generated by Dagger (https://google.github.io/dagger).
package ua.mycredit.mycredit.ui.authentication.registration.card;

import com.google.firebase.analytics.FirebaseAnalytics;
import dagger.MembersInjector;
import javax.inject.Provider;
import ru.terrakok.cicerone.Router;
import ua.mycredit.core.LocalStorage;
import ua.mycredit.core.Logouter;
import ua.mycredit.core.interactors.ApplyForCreditUseCase;
import ua.mycredit.core.interactors.CPAUseCase;
import ua.mycredit.core.interactors.UpdateProfileUseCase;
import ua.mycredit.core.interactors.VerifyCardUseCase;
import ua.mycredit.core.internal.Logger;
import ua.mycredit.mycredit.AppEvents;
import ua.mycredit.mycredit.ui.MessagesMapper;
import ua.mycredit.mycredit.ui.bases.BaseViewModel_MembersInjector;

public final class CardBackViewModel_MembersInjector implements MembersInjector<CardBackViewModel> {
  private final Provider<Router> routerProvider;

  private final Provider<AppEvents> eventsProvider;

  private final Provider<Logouter> logouterProvider;

  private final Provider<FirebaseAnalytics> analyticsProvider;

  private final Provider<MessagesMapper> messagesMapperProvider;

  private final Provider<LocalStorage> storageProvider;

  private final Provider<Logger> loggerProvider;

  private final Provider<UpdateProfileUseCase> updateProfileProvider;

  private final Provider<VerifyCardUseCase> verifyCardProvider;

  private final Provider<ApplyForCreditUseCase> applyForCreditProvider;

  private final Provider<CPAUseCase> cpaUseCaseProvider;

  public CardBackViewModel_MembersInjector(
      Provider<Router> routerProvider,
      Provider<AppEvents> eventsProvider,
      Provider<Logouter> logouterProvider,
      Provider<FirebaseAnalytics> analyticsProvider,
      Provider<MessagesMapper> messagesMapperProvider,
      Provider<LocalStorage> storageProvider,
      Provider<Logger> loggerProvider,
      Provider<UpdateProfileUseCase> updateProfileProvider,
      Provider<VerifyCardUseCase> verifyCardProvider,
      Provider<ApplyForCreditUseCase> applyForCreditProvider,
      Provider<CPAUseCase> cpaUseCaseProvider) {
    this.routerProvider = routerProvider;
    this.eventsProvider = eventsProvider;
    this.logouterProvider = logouterProvider;
    this.analyticsProvider = analyticsProvider;
    this.messagesMapperProvider = messagesMapperProvider;
    this.storageProvider = storageProvider;
    this.loggerProvider = loggerProvider;
    this.updateProfileProvider = updateProfileProvider;
    this.verifyCardProvider = verifyCardProvider;
    this.applyForCreditProvider = applyForCreditProvider;
    this.cpaUseCaseProvider = cpaUseCaseProvider;
  }

  public static MembersInjector<CardBackViewModel> create(
      Provider<Router> routerProvider,
      Provider<AppEvents> eventsProvider,
      Provider<Logouter> logouterProvider,
      Provider<FirebaseAnalytics> analyticsProvider,
      Provider<MessagesMapper> messagesMapperProvider,
      Provider<LocalStorage> storageProvider,
      Provider<Logger> loggerProvider,
      Provider<UpdateProfileUseCase> updateProfileProvider,
      Provider<VerifyCardUseCase> verifyCardProvider,
      Provider<ApplyForCreditUseCase> applyForCreditProvider,
      Provider<CPAUseCase> cpaUseCaseProvider) {
    return new CardBackViewModel_MembersInjector(
        routerProvider,
        eventsProvider,
        logouterProvider,
        analyticsProvider,
        messagesMapperProvider,
        storageProvider,
        loggerProvider,
        updateProfileProvider,
        verifyCardProvider,
        applyForCreditProvider,
        cpaUseCaseProvider);
  }

  @Override
  public void injectMembers(CardBackViewModel instance) {
    BaseViewModel_MembersInjector.injectRouter(instance, routerProvider.get());
    BaseViewModel_MembersInjector.injectEvents(instance, eventsProvider.get());
    BaseViewModel_MembersInjector.injectLogouter(instance, logouterProvider.get());
    BaseViewModel_MembersInjector.injectAnalytics(instance, analyticsProvider.get());
    BaseViewModel_MembersInjector.injectMessagesMapper(instance, messagesMapperProvider.get());
    BaseViewModel_MembersInjector.injectStorage(instance, storageProvider.get());
    BaseViewModel_MembersInjector.injectLogger(instance, loggerProvider.get());
    BaseViewModel_MembersInjector.injectBindToAppEvents(instance);
    injectUpdateProfile(instance, updateProfileProvider.get());
    injectVerifyCard(instance, verifyCardProvider.get());
    injectApplyForCredit(instance, applyForCreditProvider.get());
    injectCpaUseCase(instance, cpaUseCaseProvider.get());
  }

  public static void injectUpdateProfile(
      CardBackViewModel instance, UpdateProfileUseCase updateProfile) {
    instance.updateProfile = updateProfile;
  }

  public static void injectVerifyCard(CardBackViewModel instance, VerifyCardUseCase verifyCard) {
    instance.verifyCard = verifyCard;
  }

  public static void injectApplyForCredit(
      CardBackViewModel instance, ApplyForCreditUseCase applyForCredit) {
    instance.applyForCredit = applyForCredit;
  }

  public static void injectCpaUseCase(CardBackViewModel instance, CPAUseCase cpaUseCase) {
    instance.cpaUseCase = cpaUseCase;
  }
}
