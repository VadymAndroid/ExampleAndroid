package ua.mycredit.mycredit.internal.di.modules;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.profile.repayloan.TerminalsFragment;

@Module(subcomponents = FragmentsModule_TerminalsFragment.TerminalsFragmentSubcomponent.class)
public abstract class FragmentsModule_TerminalsFragment {
  private FragmentsModule_TerminalsFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(TerminalsFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      TerminalsFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface TerminalsFragmentSubcomponent extends AndroidInjector<TerminalsFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TerminalsFragment> {}
  }
}
