// Generated by Dagger (https://google.github.io/dagger).
package ua.mycredit.mycredit.ui.authentication.registration.passport.personal;

import android.arch.lifecycle.ViewModelProvider;
import android.support.v4.app.Fragment;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import javax.inject.Provider;
import ru.terrakok.cicerone.Router;
import ua.mycredit.core.LocalStorage;
import ua.mycredit.mycredit.AppEvents;
import ua.mycredit.mycredit.ui.bases.BaseFragment_MembersInjector;

public final class PersonalInfoFragment_MembersInjector
    implements MembersInjector<PersonalInfoFragment> {
  private final Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider;

  private final Provider<Router> routerProvider;

  private final Provider<AppEvents> eventsProvider;

  private final Provider<LocalStorage> storageProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public PersonalInfoFragment_MembersInjector(
      Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider,
      Provider<Router> routerProvider,
      Provider<AppEvents> eventsProvider,
      Provider<LocalStorage> storageProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.childFragmentInjectorProvider = childFragmentInjectorProvider;
    this.routerProvider = routerProvider;
    this.eventsProvider = eventsProvider;
    this.storageProvider = storageProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<PersonalInfoFragment> create(
      Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider,
      Provider<Router> routerProvider,
      Provider<AppEvents> eventsProvider,
      Provider<LocalStorage> storageProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new PersonalInfoFragment_MembersInjector(
        childFragmentInjectorProvider,
        routerProvider,
        eventsProvider,
        storageProvider,
        viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(PersonalInfoFragment instance) {
    DaggerFragment_MembersInjector.injectChildFragmentInjector(
        instance, childFragmentInjectorProvider.get());
    BaseFragment_MembersInjector.injectRouter(instance, routerProvider.get());
    BaseFragment_MembersInjector.injectEvents(instance, eventsProvider.get());
    BaseFragment_MembersInjector.injectStorage(instance, storageProvider.get());
    BaseFragment_MembersInjector.injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }
}
