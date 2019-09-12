package ua.mycredit.mycredit.internal.di.modules;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.profile.profile.faq.FaqActivity;

@Module(subcomponents = ActivitiesModule_FaqActivityInjector.FaqActivitySubcomponent.class)
public abstract class ActivitiesModule_FaqActivityInjector {
  private ActivitiesModule_FaqActivityInjector() {}

  @Binds
  @IntoMap
  @ActivityKey(FaqActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      FaqActivitySubcomponent.Builder builder);

  @Subcomponent
  public interface FaqActivitySubcomponent extends AndroidInjector<FaqActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<FaqActivity> {}
  }
}
