package ua.mycredit.mycredit.internal.di.modules;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.profile.cards.AddCardActivity;

@Module(subcomponents = ActivitiesModule_AddCardActivity.AddCardActivitySubcomponent.class)
public abstract class ActivitiesModule_AddCardActivity {
  private ActivitiesModule_AddCardActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(AddCardActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      AddCardActivitySubcomponent.Builder builder);

  @Subcomponent
  public interface AddCardActivitySubcomponent extends AndroidInjector<AddCardActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<AddCardActivity> {}
  }
}
