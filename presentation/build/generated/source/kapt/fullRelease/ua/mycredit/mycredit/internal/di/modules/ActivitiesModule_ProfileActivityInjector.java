package ua.mycredit.mycredit.internal.di.modules;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.profile.ProfileActivity;

@Module(subcomponents = ActivitiesModule_ProfileActivityInjector.ProfileActivitySubcomponent.class)
public abstract class ActivitiesModule_ProfileActivityInjector {
  private ActivitiesModule_ProfileActivityInjector() {}

  @Binds
  @IntoMap
  @ActivityKey(ProfileActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      ProfileActivitySubcomponent.Builder builder);

  @Subcomponent
  public interface ProfileActivitySubcomponent extends AndroidInjector<ProfileActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ProfileActivity> {}
  }
}
