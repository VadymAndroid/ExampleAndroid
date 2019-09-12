package ua.mycredit.mycredit.internal.di.modules;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.authentication.registration.ocupation.PensionerFragment;

@Module(subcomponents = FragmentsModule_PensionerFragment.PensionerFragmentSubcomponent.class)
public abstract class FragmentsModule_PensionerFragment {
  private FragmentsModule_PensionerFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(PensionerFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      PensionerFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface PensionerFragmentSubcomponent extends AndroidInjector<PensionerFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<PensionerFragment> {}
  }
}
