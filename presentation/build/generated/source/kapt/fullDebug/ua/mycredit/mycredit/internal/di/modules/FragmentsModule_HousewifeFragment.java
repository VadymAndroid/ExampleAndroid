package ua.mycredit.mycredit.internal.di.modules;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.authentication.registration.ocupation.HousewifeFragment;

@Module(subcomponents = FragmentsModule_HousewifeFragment.HousewifeFragmentSubcomponent.class)
public abstract class FragmentsModule_HousewifeFragment {
  private FragmentsModule_HousewifeFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(HousewifeFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      HousewifeFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface HousewifeFragmentSubcomponent extends AndroidInjector<HousewifeFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<HousewifeFragment> {}
  }
}
