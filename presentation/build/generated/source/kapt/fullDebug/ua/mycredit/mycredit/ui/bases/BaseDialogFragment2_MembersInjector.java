// Generated by Dagger (https://google.github.io/dagger).
package ua.mycredit.mycredit.ui.bases;

import android.support.v4.app.Fragment;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerAppCompatDialogFragment_MembersInjector;
import javax.inject.Provider;
import ru.terrakok.cicerone.Router;
import ua.mycredit.core.LocalStorage;
import ua.mycredit.mycredit.AppEvents;

public final class BaseDialogFragment2_MembersInjector
    implements MembersInjector<BaseDialogFragment2> {
  private final Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider;

  private final Provider<Router> routerProvider;

  private final Provider<LocalStorage> storageProvider;

  private final Provider<AppEvents> eventsProvider;

  public BaseDialogFragment2_MembersInjector(
      Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider,
      Provider<Router> routerProvider,
      Provider<LocalStorage> storageProvider,
      Provider<AppEvents> eventsProvider) {
    this.childFragmentInjectorProvider = childFragmentInjectorProvider;
    this.routerProvider = routerProvider;
    this.storageProvider = storageProvider;
    this.eventsProvider = eventsProvider;
  }

  public static MembersInjector<BaseDialogFragment2> create(
      Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider,
      Provider<Router> routerProvider,
      Provider<LocalStorage> storageProvider,
      Provider<AppEvents> eventsProvider) {
    return new BaseDialogFragment2_MembersInjector(
        childFragmentInjectorProvider, routerProvider, storageProvider, eventsProvider);
  }

  @Override
  public void injectMembers(BaseDialogFragment2 instance) {
    DaggerAppCompatDialogFragment_MembersInjector.injectChildFragmentInjector(
        instance, childFragmentInjectorProvider.get());
    injectRouter(instance, routerProvider.get());
    injectStorage(instance, storageProvider.get());
    injectEvents(instance, eventsProvider.get());
  }

  public static void injectRouter(BaseDialogFragment2 instance, Router router) {
    instance.router = router;
  }

  public static void injectStorage(BaseDialogFragment2 instance, LocalStorage storage) {
    instance.storage = storage;
  }

  public static void injectEvents(BaseDialogFragment2 instance, AppEvents events) {
    instance.events = events;
  }
}