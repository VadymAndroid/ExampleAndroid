package ua.mycredit.mycredit.internal.di.modules;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.profile.WebBankingActivity;

@Module(
  subcomponents = ActivitiesModule_CardWebVerificationActivity.WebBankingActivitySubcomponent.class
)
public abstract class ActivitiesModule_CardWebVerificationActivity {
  private ActivitiesModule_CardWebVerificationActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(WebBankingActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      WebBankingActivitySubcomponent.Builder builder);

  @Subcomponent
  public interface WebBankingActivitySubcomponent extends AndroidInjector<WebBankingActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<WebBankingActivity> {}
  }
}
