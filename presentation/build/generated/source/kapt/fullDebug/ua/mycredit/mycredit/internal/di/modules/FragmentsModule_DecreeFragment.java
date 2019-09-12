package ua.mycredit.mycredit.internal.di.modules;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.authentication.registration.ocupation.DecreeFragment;

@Module(subcomponents = FragmentsModule_DecreeFragment.DecreeFragmentSubcomponent.class)
public abstract class FragmentsModule_DecreeFragment {
  private FragmentsModule_DecreeFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(DecreeFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      DecreeFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface DecreeFragmentSubcomponent extends AndroidInjector<DecreeFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<DecreeFragment> {}
  }
}
