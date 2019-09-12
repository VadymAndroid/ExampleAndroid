package ua.mycredit.mycredit.internal.di.modules;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.profile.profile.ProlongationPreferencesFragment;

@Module(
  subcomponents =
      FragmentsModule_ProlongationPreferencesFragment.ProlongationPreferencesFragmentSubcomponent
          .class
)
public abstract class FragmentsModule_ProlongationPreferencesFragment {
  private FragmentsModule_ProlongationPreferencesFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(ProlongationPreferencesFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ProlongationPreferencesFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ProlongationPreferencesFragmentSubcomponent
      extends AndroidInjector<ProlongationPreferencesFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ProlongationPreferencesFragment> {}
  }
}
