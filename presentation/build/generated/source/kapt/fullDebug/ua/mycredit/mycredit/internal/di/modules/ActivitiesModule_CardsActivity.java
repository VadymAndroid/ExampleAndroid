package ua.mycredit.mycredit.internal.di.modules;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.profile.CardsActivity;

@Module(subcomponents = ActivitiesModule_CardsActivity.CardsActivitySubcomponent.class)
public abstract class ActivitiesModule_CardsActivity {
  private ActivitiesModule_CardsActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(CardsActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      CardsActivitySubcomponent.Builder builder);

  @Subcomponent
  public interface CardsActivitySubcomponent extends AndroidInjector<CardsActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<CardsActivity> {}
  }
}
