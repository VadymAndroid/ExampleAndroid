package ua.mycredit.mycredit.internal.di.modules;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.authentication.registration.passport.personal.ExtraPersonalInfoFragment;

@Module(
  subcomponents =
      FragmentsModule_ExtraPersonalInfoFragmentInjector.ExtraPersonalInfoFragmentSubcomponent.class
)
public abstract class FragmentsModule_ExtraPersonalInfoFragmentInjector {
  private FragmentsModule_ExtraPersonalInfoFragmentInjector() {}

  @Binds
  @IntoMap
  @FragmentKey(ExtraPersonalInfoFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ExtraPersonalInfoFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ExtraPersonalInfoFragmentSubcomponent
      extends AndroidInjector<ExtraPersonalInfoFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ExtraPersonalInfoFragment> {}
  }
}
