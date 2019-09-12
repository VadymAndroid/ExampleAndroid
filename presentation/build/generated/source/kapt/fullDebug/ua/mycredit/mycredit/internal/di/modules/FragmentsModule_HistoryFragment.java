package ua.mycredit.mycredit.internal.di.modules;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.profile.history.HistoryFragment;

@Module(subcomponents = FragmentsModule_HistoryFragment.HistoryFragmentSubcomponent.class)
public abstract class FragmentsModule_HistoryFragment {
  private FragmentsModule_HistoryFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(HistoryFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      HistoryFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface HistoryFragmentSubcomponent extends AndroidInjector<HistoryFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<HistoryFragment> {}
  }
}
