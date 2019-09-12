package ua.mycredit.mycredit.internal.di.modules;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.authentication.registration.finance.FinanceFragment;

@Module(subcomponents = FragmentsModule_FinanceFragment.FinanceFragmentSubcomponent.class)
public abstract class FragmentsModule_FinanceFragment {
  private FragmentsModule_FinanceFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(FinanceFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      FinanceFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface FinanceFragmentSubcomponent extends AndroidInjector<FinanceFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<FinanceFragment> {}
  }
}
