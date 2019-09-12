package ua.mycredit.mycredit.internal.di.modules;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.launch.onboarding.OnboardingActivity;

@Module(
  subcomponents = ActivitiesModule_OnboardingActivityInjector.OnboardingActivitySubcomponent.class
)
public abstract class ActivitiesModule_OnboardingActivityInjector {
  private ActivitiesModule_OnboardingActivityInjector() {}

  @Binds
  @IntoMap
  @ActivityKey(OnboardingActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      OnboardingActivitySubcomponent.Builder builder);

  @Subcomponent
  public interface OnboardingActivitySubcomponent extends AndroidInjector<OnboardingActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<OnboardingActivity> {}
  }
}
