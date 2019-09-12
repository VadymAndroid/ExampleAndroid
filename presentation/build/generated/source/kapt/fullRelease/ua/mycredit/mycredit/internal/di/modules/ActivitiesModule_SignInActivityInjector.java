package ua.mycredit.mycredit.internal.di.modules;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.authentication.SignInActivity;

@Module(subcomponents = ActivitiesModule_SignInActivityInjector.SignInActivitySubcomponent.class)
public abstract class ActivitiesModule_SignInActivityInjector {
  private ActivitiesModule_SignInActivityInjector() {}

  @Binds
  @IntoMap
  @ActivityKey(SignInActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      SignInActivitySubcomponent.Builder builder);

  @Subcomponent
  public interface SignInActivitySubcomponent extends AndroidInjector<SignInActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SignInActivity> {}
  }
}
