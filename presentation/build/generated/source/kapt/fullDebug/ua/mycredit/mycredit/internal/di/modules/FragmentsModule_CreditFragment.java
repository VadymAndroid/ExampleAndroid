package ua.mycredit.mycredit.internal.di.modules;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.profile.credit.StatusFragment;

@Module(subcomponents = FragmentsModule_CreditFragment.StatusFragmentSubcomponent.class)
public abstract class FragmentsModule_CreditFragment {
  private FragmentsModule_CreditFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(StatusFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      StatusFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface StatusFragmentSubcomponent extends AndroidInjector<StatusFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<StatusFragment> {}
  }
}
