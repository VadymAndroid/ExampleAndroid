package ua.mycredit.mycredit.internal.di.modules;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.profile.profile.details.DetailsActivity;

@Module(subcomponents = ActivitiesModule_DetailsActivityInjector.DetailsActivitySubcomponent.class)
public abstract class ActivitiesModule_DetailsActivityInjector {
  private ActivitiesModule_DetailsActivityInjector() {}

  @Binds
  @IntoMap
  @ActivityKey(DetailsActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      DetailsActivitySubcomponent.Builder builder);

  @Subcomponent
  public interface DetailsActivitySubcomponent extends AndroidInjector<DetailsActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<DetailsActivity> {}
  }
}
