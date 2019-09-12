package ua.mycredit.mycredit.internal.di.modules;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.profile.profile.contacts.ContactsFragment;

@Module(subcomponents = FragmentsModule_ContactsFragment.ContactsFragmentSubcomponent.class)
public abstract class FragmentsModule_ContactsFragment {
  private FragmentsModule_ContactsFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(ContactsFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ContactsFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ContactsFragmentSubcomponent extends AndroidInjector<ContactsFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ContactsFragment> {}
  }
}
