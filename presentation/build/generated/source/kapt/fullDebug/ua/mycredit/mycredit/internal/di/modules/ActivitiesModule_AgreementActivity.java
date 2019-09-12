package ua.mycredit.mycredit.internal.di.modules;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.profile.credit.AgreementActivity;

@Module(subcomponents = ActivitiesModule_AgreementActivity.AgreementActivitySubcomponent.class)
public abstract class ActivitiesModule_AgreementActivity {
  private ActivitiesModule_AgreementActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(AgreementActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      AgreementActivitySubcomponent.Builder builder);

  @Subcomponent
  public interface AgreementActivitySubcomponent extends AndroidInjector<AgreementActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<AgreementActivity> {}
  }
}
