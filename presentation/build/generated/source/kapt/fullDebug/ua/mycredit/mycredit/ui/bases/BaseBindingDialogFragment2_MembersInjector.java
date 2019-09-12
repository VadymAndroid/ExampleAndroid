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

public final class BaseBindingDialogFragment2_MembersInjector
    implements MembersInjector<BaseBindingDialogFragment2> {
  private final Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider;

  private final Provider<Router> routerProvider;

  private final Provider<LocalStorage> storageProvider;

  private final Provider<AppEvents> eventsProvider;

  public BaseBindingDialogFragment2_MembersInjector(
      Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider,
      Provider<Router> routerProvider,
      Provider<LocalStorage> storageProvider,
      Provider<AppEvents> eventsProvider) {
    this.childFragmentInjectorProvider = childFragmentInjectorProvider;
    this.routerProvider = routerProvider;
    this.storageProvider = storageProvider;
    this.eventsProvider = eventsProvider;
  }

  public static MembersInjector<BaseBindingDialogFragment2> create(
      Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider,
      Provider<Router> routerProvider,
      Provider<LocalStorage> storageProvider,
      Provider<AppEvents> eventsProvider) {
    return new BaseBindingDialogFragment2_MembersInjector(
        childFragmentInjectorProvider, routerProvider, storageProvider, eventsProvider);
  }

  @Override
  public void injectMembers(BaseBindingDialogFragment2 instance) {
    DaggerAppCompatDialogFragment_MembersInjector.injectChildFragmentInjector(
        instance, childFragmentInjectorProvider.get());
    BaseDialogFragment2_MembersInjector.injectRouter(instance, routerProvider.get());
    BaseDialogFragment2_MembersInjector.injectStorage(instance, storageProvider.get());
    BaseDialogFragment2_MembersInjector.injectEvents(instance, eventsProvider.get());
  }
}