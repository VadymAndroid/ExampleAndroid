package ua.mycredit.mycredit.internal.di.modules;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.calculator.CalculatorDialogFragment;

@Module(
  subcomponents =
      FragmentsModule_CalculatorDialogFragmentInjector.CalculatorDialogFragmentSubcomponent.class
)
public abstract class FragmentsModule_CalculatorDialogFragmentInjector {
  private FragmentsModule_CalculatorDialogFragmentInjector() {}

  @Binds
  @IntoMap
  @FragmentKey(CalculatorDialogFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      CalculatorDialogFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface CalculatorDialogFragmentSubcomponent
      extends AndroidInjector<CalculatorDialogFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<CalculatorDialogFragment> {}
  }
}
