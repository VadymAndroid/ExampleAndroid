// Generated by Dagger (https://google.github.io/dagger).
package ua.mycredit.mycredit.ui.profile.profile;

import android.support.v4.app.Fragment;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import javax.inject.Provider;
import ru.terrakok.cicerone.NavigatorHolder;
import ru.terrakok.cicerone.Router;
import ua.mycredit.core.LocalStorage;
import ua.mycredit.core.internal.Logger;
import ua.mycredit.mycredit.AppEvents;
import ua.mycredit.mycredit.ui.bases.BaseActivity_MembersInjector;

public final class ProlongationPreferencesActivity_MembersInjector
    implements MembersInjector<ProlongationPreferencesActivity> {
  private final Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider;

  private final Provider<DispatchingAndroidInjector<android.app.Fragment>>
      frameworkFragmentInjectorProvider;

  private final Provider<NavigatorHolder> navigatorHolderProvider;

  private final Provider<LocalStorage> storageProvider;

  private final Provider<Router> routerProvider;

  private final Provider<AppEvents> eventsProvider;

  private final Provider<Logger> loggerProvider;

  public ProlongationPreferencesActivity_MembersInjector(
      Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider,
      Provider<DispatchingAndroidInjector<android.app.Fragment>> frameworkFragmentInjectorProvider,
      Provider<NavigatorHolder> navigatorHolderProvider,
      Provider<LocalStorage> storageProvider,
      Provider<Router> routerProvider,
      Provider<AppEvents> eventsProvider,
      Provider<Logger> loggerProvider) {
    this.supportFragmentInjectorProvider = supportFragmentInjectorProvider;
    this.frameworkFragmentInjectorProvider = frameworkFragmentInjectorProvider;
    this.navigatorHolderProvider = navigatorHolderProvider;
    this.storageProvider = storageProvider;
    this.routerProvider = routerProvider;
    this.eventsProvider = eventsProvider;
    this.loggerProvider = loggerProvider;
  }

  public static MembersInjector<ProlongationPreferencesActivity> create(
      Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider,
      Provider<DispatchingAndroidInjector<android.app.Fragment>> frameworkFragmentInjectorProvider,
      Provider<NavigatorHolder> navigatorHolderProvider,
      Provider<LocalStorage> storageProvider,
      Provider<Router> routerProvider,
      Provider<AppEvents> eventsProvider,
      Provider<Logger> loggerProvider) {
    return new ProlongationPreferencesActivity_MembersInjector(
        supportFragmentInjectorProvider,
        frameworkFragmentInjectorProvider,
        navigatorHolderProvider,
        storageProvider,
        routerProvider,
        eventsProvider,
        loggerProvider);
  }

  @Override
  public void injectMembers(ProlongationPreferencesActivity instance) {
    DaggerAppCompatActivity_MembersInjector.injectSupportFragmentInjector(
        instance, supportFragmentInjectorProvider.get());
    DaggerAppCompatActivity_MembersInjector.injectFrameworkFragmentInjector(
        instance, frameworkFragmentInjectorProvider.get());
    BaseActivity_MembersInjector.injectNavigatorHolder(instance, navigatorHolderProvider.get());
    BaseActivity_MembersInjector.injectStorage(instance, storageProvider.get());
    BaseActivity_MembersInjector.injectRouter(instance, routerProvider.get());
    BaseActivity_MembersInjector.injectEvents(instance, eventsProvider.get());
    BaseActivity_MembersInjector.injectLogger(instance, loggerProvider.get());
  }
}
