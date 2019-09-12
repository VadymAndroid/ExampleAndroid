package ua.mycredit.mycredit.internal.di.modules;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.authentication.ResetPasswordActivity;

@Module(
  subcomponents = ActivitiesModule_ResetPasswordActivity.ResetPasswordActivitySubcomponent.class
)
public abstract class ActivitiesModule_ResetPasswordActivity {
  private ActivitiesModule_ResetPasswordActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(ResetPasswordActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      ResetPasswordActivitySubcomponent.Builder builder);

  @Subcomponent
  public interface ResetPasswordActivitySubcomponent
      extends AndroidInjector<ResetPasswordActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ResetPasswordActivity> {}
  }
}
