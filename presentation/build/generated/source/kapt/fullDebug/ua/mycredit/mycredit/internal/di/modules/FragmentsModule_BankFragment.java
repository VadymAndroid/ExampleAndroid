package ua.mycredit.mycredit.internal.di.modules;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.profile.repayloan.BankFragment;

@Module(subcomponents = FragmentsModule_BankFragment.BankFragmentSubcomponent.class)
public abstract class FragmentsModule_BankFragment {
  private FragmentsModule_BankFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(BankFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      BankFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface BankFragmentSubcomponent extends AndroidInjector<BankFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<BankFragment> {}
  }
}
