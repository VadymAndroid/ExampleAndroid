// Generated by Dagger (https://google.github.io/dagger).
package ua.mycredit.mycredit.ui.authentication.registration;

import android.arch.lifecycle.ViewModelProvider;
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
import ua.mycredit.mycredit.ui.bases.SelfBindingActivity_MembersInjector;

public final class SignUpActivity_MembersInjector implements MembersInjector<SignUpActivity> {
  private final Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider;

  private final Provider<DispatchingAndroidInjector<android.app.Fragment>>
      frameworkFragmentInjectorProvider;

  private final Provider<NavigatorHolder> navigatorHolderProvider;

  private final Provider<LocalStorage> storageProvider;

  private final Provider<Router> routerProvider;

  private final Provider<AppEvents> eventsProvider;

  private final Provider<Logger> loggerProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  private final Provider<SignUpProgressViewModel> signUpViewModelProvider;

  public SignUpActivity_MembersInjector(
      Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider,
      Provider<DispatchingAndroidInjector<android.app.Fragment>> frameworkFragmentInjectorProvider,
      Provider<NavigatorHolder> navigatorHolderProvider,
      Provider<LocalStorage> storageProvider,
      Provider<Router> routerProvider,
      Provider<AppEvents> eventsProvider,
      Provider<Logger> loggerProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<SignUpProgressViewModel> signUpViewModelProvider) {
    this.supportFragmentInjectorProvider = supportFragmentInjectorProvider;
    this.frameworkFragmentInjectorProvider = frameworkFragmentInjectorProvider;
    this.navigatorHolderProvider = navigatorHolderProvider;
    this.storageProvider = storageProvider;
    this.routerProvider = routerProvider;
    this.eventsProvider = eventsProvider;
    this.loggerProvider = loggerProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.signUpViewModelProvider = signUpViewModelProvider;
  }

  public static MembersInjector<SignUpActivity> create(
      Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider,
      Provider<DispatchingAndroidInjector<android.app.Fragment>> frameworkFragmentInjectorProvider,
      Provider<NavigatorHolder> navigatorHolderProvider,
      Provider<LocalStorage> storageProvider,
      Provider<Router> routerProvider,
      Provider<AppEvents> eventsProvider,
      Provider<Logger> loggerProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<SignUpProgressViewModel> signUpViewModelProvider) {
    return new SignUpActivity_MembersInjector(
        supportFragmentInjectorProvider,
        frameworkFragmentInjectorProvider,
        navigatorHolderProvider,
        storageProvider,
        routerProvider,
        eventsProvider,
        loggerProvider,
        viewModelFactoryProvider,
        signUpViewModelProvider);
  }

  @Override
  public void injectMembers(SignUpActivity instance) {
    DaggerAppCompatActivity_MembersInjector.injectSupportFragmentInjector(
        instance, supportFragmentInjectorProvider.get());
    DaggerAppCompatActivity_MembersInjector.injectFrameworkFragmentInjector(
        instance, frameworkFragmentInjectorProvider.get());
    BaseActivity_MembersInjector.injectNavigatorHolder(instance, navigatorHolderProvider.get());
    BaseActivity_MembersInjector.injectStorage(instance, storageProvider.get());
    BaseActivity_MembersInjector.injectRouter(instance, routerProvider.get());
    BaseActivity_MembersInjector.injectEvents(instance, eventsProvider.get());
    BaseActivity_MembersInjector.injectLogger(instance, loggerProvider.get());
    SelfBindingActivity_MembersInjector.injectViewModelFactory(
        instance, viewModelFactoryProvider.get());
    injectSignUpViewModel(instance, signUpViewModelProvider.get());
  }

  public static void injectSignUpViewModel(
      SignUpActivity instance, SignUpProgressViewModel signUpViewModel) {
    instance.signUpViewModel = signUpViewModel;
  }
}