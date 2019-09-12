package ua.mycredit.mycredit.internal.di.modules;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.authentication.registration.ocupation.InvalidFragment;

@Module(subcomponents = FragmentsModule_InvalidFragment.InvalidFragmentSubcomponent.class)
public abstract class FragmentsModule_InvalidFragment {
  private FragmentsModule_InvalidFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(InvalidFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      InvalidFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface InvalidFragmentSubcomponent extends AndroidInjector<InvalidFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<InvalidFragment> {}
  }
}
