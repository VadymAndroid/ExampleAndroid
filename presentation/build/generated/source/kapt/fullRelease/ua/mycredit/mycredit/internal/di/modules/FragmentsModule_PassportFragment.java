package ua.mycredit.mycredit.internal.di.modules;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.authentication.registration.passport.passport.PassportFragment;

@Module(subcomponents = FragmentsModule_PassportFragment.PassportFragmentSubcomponent.class)
public abstract class FragmentsModule_PassportFragment {
  private FragmentsModule_PassportFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(PassportFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      PassportFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface PassportFragmentSubcomponent extends AndroidInjector<PassportFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<PassportFragment> {}
  }
}
