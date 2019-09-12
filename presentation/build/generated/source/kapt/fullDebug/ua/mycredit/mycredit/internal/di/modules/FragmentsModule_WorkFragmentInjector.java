package ua.mycredit.mycredit.internal.di.modules;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.authentication.registration.ocupation.EmployedFragment;

@Module(subcomponents = FragmentsModule_WorkFragmentInjector.EmployedFragmentSubcomponent.class)
public abstract class FragmentsModule_WorkFragmentInjector {
  private FragmentsModule_WorkFragmentInjector() {}

  @Binds
  @IntoMap
  @FragmentKey(EmployedFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      EmployedFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface EmployedFragmentSubcomponent extends AndroidInjector<EmployedFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<EmployedFragment> {}
  }
}
