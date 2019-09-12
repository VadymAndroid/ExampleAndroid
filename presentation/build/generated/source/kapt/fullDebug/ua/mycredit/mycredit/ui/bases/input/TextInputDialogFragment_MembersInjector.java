// Generated by Dagger (https://google.github.io/dagger).
package ua.mycredit.mycredit.ui.bases.input;

import android.arch.lifecycle.ViewModelProvider;
import android.support.v4.app.Fragment;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerAppCompatDialogFragment_MembersInjector;
import javax.inject.Provider;

public final class TextInputDialogFragment_MembersInjector
    implements MembersInjector<TextInputDialogFragment> {
  private final Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public TextInputDialogFragment_MembersInjector(
      Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.childFragmentInjectorProvider = childFragmentInjectorProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<TextInputDialogFragment> create(
      Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new TextInputDialogFragment_MembersInjector(
        childFragmentInjectorProvider, viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(TextInputDialogFragment instance) {
    DaggerAppCompatDialogFragment_MembersInjector.injectChildFragmentInjector(
        instance, childFragmentInjectorProvider.get());
    BaseInputDialogFragment_MembersInjector.injectViewModelFactory(
        instance, viewModelFactoryProvider.get());
  }
}
