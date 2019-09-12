package ua.mycredit.mycredit.internal.di.modules;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.authentication.registration.passport.personal.PersonalInfoFragment;

@Module(
  subcomponents =
      FragmentsModule_PersonalInformationFragmentInjector.PersonalInfoFragmentSubcomponent.class
)
public abstract class FragmentsModule_PersonalInformationFragmentInjector {
  private FragmentsModule_PersonalInformationFragmentInjector() {}

  @Binds
  @IntoMap
  @FragmentKey(PersonalInfoFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      PersonalInfoFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface PersonalInfoFragmentSubcomponent extends AndroidInjector<PersonalInfoFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<PersonalInfoFragment> {}
  }
}
