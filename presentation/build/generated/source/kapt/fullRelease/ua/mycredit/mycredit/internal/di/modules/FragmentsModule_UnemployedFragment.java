package ua.mycredit.mycredit.internal.di.modules;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.authentication.registration.ocupation.UnemployedFragment;

@Module(subcomponents = FragmentsModule_UnemployedFragment.UnemployedFragmentSubcomponent.class)
public abstract class FragmentsModule_UnemployedFragment {
  private FragmentsModule_UnemployedFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(UnemployedFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      UnemployedFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface UnemployedFragmentSubcomponent extends AndroidInjector<UnemployedFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<UnemployedFragment> {}
  }
}
