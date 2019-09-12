package ua.mycredit.mycredit.internal.di.modules;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.authentication.registration.ocupation.BusinessmanFragment;

@Module(subcomponents = FragmentsModule_BusinessmanFragment.BusinessmanFragmentSubcomponent.class)
public abstract class FragmentsModule_BusinessmanFragment {
  private FragmentsModule_BusinessmanFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(BusinessmanFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      BusinessmanFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface BusinessmanFragmentSubcomponent extends AndroidInjector<BusinessmanFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<BusinessmanFragment> {}
  }
}
