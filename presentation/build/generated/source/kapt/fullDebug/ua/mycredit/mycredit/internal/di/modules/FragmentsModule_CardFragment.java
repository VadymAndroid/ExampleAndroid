package ua.mycredit.mycredit.internal.di.modules;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.profile.repayloan.RepayByCardFragment;

@Module(subcomponents = FragmentsModule_CardFragment.RepayByCardFragmentSubcomponent.class)
public abstract class FragmentsModule_CardFragment {
  private FragmentsModule_CardFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(RepayByCardFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      RepayByCardFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface RepayByCardFragmentSubcomponent extends AndroidInjector<RepayByCardFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<RepayByCardFragment> {}
  }
}
