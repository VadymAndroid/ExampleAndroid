package ua.mycredit.mycredit.internal.di.modules;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.calculator.CalculatorFragment;

@Module(
  subcomponents = FragmentsModule_CalculatorFragmentInjector.CalculatorFragmentSubcomponent.class
)
public abstract class FragmentsModule_CalculatorFragmentInjector {
  private FragmentsModule_CalculatorFragmentInjector() {}

  @Binds
  @IntoMap
  @FragmentKey(CalculatorFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      CalculatorFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface CalculatorFragmentSubcomponent extends AndroidInjector<CalculatorFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<CalculatorFragment> {}
  }
}
