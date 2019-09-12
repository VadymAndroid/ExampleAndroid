package ua.mycredit.mycredit.internal.di.modules;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.authentication.registration.passport.personal.PersonalDataFragment;

@Module(
  subcomponents =
      FragmentsModule_PersonalDataFragmentInjector.PersonalDataFragmentSubcomponent.class
)
public abstract class FragmentsModule_PersonalDataFragmentInjector {
  private FragmentsModule_PersonalDataFragmentInjector() {}

  @Binds
  @IntoMap
  @FragmentKey(PersonalDataFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      PersonalDataFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface PersonalDataFragmentSubcomponent extends AndroidInjector<PersonalDataFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<PersonalDataFragment> {}
  }
}
