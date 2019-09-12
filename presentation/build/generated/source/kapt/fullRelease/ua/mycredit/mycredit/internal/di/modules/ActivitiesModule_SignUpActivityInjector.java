package ua.mycredit.mycredit.internal.di.modules;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.authentication.registration.SignUpActivity;

@Module(subcomponents = ActivitiesModule_SignUpActivityInjector.SignUpActivitySubcomponent.class)
public abstract class ActivitiesModule_SignUpActivityInjector {
  private ActivitiesModule_SignUpActivityInjector() {}

  @Binds
  @IntoMap
  @ActivityKey(SignUpActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      SignUpActivitySubcomponent.Builder builder);

  @Subcomponent
  public interface SignUpActivitySubcomponent extends AndroidInjector<SignUpActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SignUpActivity> {}
  }
}
