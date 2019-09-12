// Generated by Dagger (https://google.github.io/dagger).
package ua.mycredit.mycredit.ui.profile.profile.details;

import android.support.v4.app.Fragment;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerAppCompatDialogFragment_MembersInjector;
import javax.inject.Provider;
import ru.terrakok.cicerone.Router;
import ua.mycredit.core.LocalStorage;
import ua.mycredit.mycredit.AppEvents;
import ua.mycredit.mycredit.ui.bases.BaseDialogFragment2_MembersInjector;

public final class UneditablePersonalDataDialog_MembersInjector
    implements MembersInjector<UneditablePersonalDataDialog> {
  private final Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider;

  private final Provider<Router> routerProvider;

  private final Provider<LocalStorage> storageProvider;

  private final Provider<AppEvents> eventsProvider;

  public UneditablePersonalDataDialog_MembersInjector(
      Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider,
      Provider<Router> routerProvider,
      Provider<LocalStorage> storageProvider,
      Provider<AppEvents> eventsProvider) {
    this.childFragmentInjectorProvider = childFragmentInjectorProvider;
    this.routerProvider = routerProvider;
    this.storageProvider = storageProvider;
    this.eventsProvider = eventsProvider;
  }

  public static MembersInjector<UneditablePersonalDataDialog> create(
      Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider,
      Provider<Router> routerProvider,
      Provider<LocalStorage> storageProvider,
      Provider<AppEvents> eventsProvider) {
    return new UneditablePersonalDataDialog_MembersInjector(
        childFragmentInjectorProvider, routerProvider, storageProvider, eventsProvider);
  }

  @Override
  public void injectMembers(UneditablePersonalDataDialog instance) {
    DaggerAppCompatDialogFragment_MembersInjector.injectChildFragmentInjector(
        instance, childFragmentInjectorProvider.get());
    BaseDialogFragment2_MembersInjector.injectRouter(instance, routerProvider.get());
    BaseDialogFragment2_MembersInjector.injectStorage(instance, storageProvider.get());
    BaseDialogFragment2_MembersInjector.injectEvents(instance, eventsProvider.get());
  }
}
