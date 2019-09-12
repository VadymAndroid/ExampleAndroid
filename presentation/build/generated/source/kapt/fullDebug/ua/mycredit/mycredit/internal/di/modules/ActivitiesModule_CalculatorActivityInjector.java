package ua.mycredit.mycredit.internal.di.modules;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.calculator.CalculatorActivity;

@Module(
  subcomponents = ActivitiesModule_CalculatorActivityInjector.CalculatorActivitySubcomponent.class
)
public abstract class ActivitiesModule_CalculatorActivityInjector {
  private ActivitiesModule_CalculatorActivityInjector() {}

  @Binds
  @IntoMap
  @ActivityKey(CalculatorActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      CalculatorActivitySubcomponent.Builder builder);

  @Subcomponent
  public interface CalculatorActivitySubcomponent extends AndroidInjector<CalculatorActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<CalculatorActivity> {}
  }
}
