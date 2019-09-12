package ua.mycredit.mycredit.internal.di.modules;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.authentication.registration.ocupation.TemporarilyUnemployedFragment;

@Module(
  subcomponents =
      FragmentsModule_TemporarilyUnemployedFragment.TemporarilyUnemployedFragmentSubcomponent.class
)
public abstract class FragmentsModule_TemporarilyUnemployedFragment {
  private FragmentsModule_TemporarilyUnemployedFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(TemporarilyUnemployedFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      TemporarilyUnemployedFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface TemporarilyUnemployedFragmentSubcomponent
      extends AndroidInjector<TemporarilyUnemployedFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TemporarilyUnemployedFragment> {}
  }
}
