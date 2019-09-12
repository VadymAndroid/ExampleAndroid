package ua.mycredit.mycredit.internal.di.modules;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.profile.profile.ProlongationPreferencesActivity;

@Module(
  subcomponents =
      ActivitiesModule_ProlongationPreferencesDialogActivity
          .ProlongationPreferencesActivitySubcomponent.class
)
public abstract class ActivitiesModule_ProlongationPreferencesDialogActivity {
  private ActivitiesModule_ProlongationPreferencesDialogActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(ProlongationPreferencesActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      ProlongationPreferencesActivitySubcomponent.Builder builder);

  @Subcomponent
  public interface ProlongationPreferencesActivitySubcomponent
      extends AndroidInjector<ProlongationPreferencesActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ProlongationPreferencesActivity> {}
  }
}
