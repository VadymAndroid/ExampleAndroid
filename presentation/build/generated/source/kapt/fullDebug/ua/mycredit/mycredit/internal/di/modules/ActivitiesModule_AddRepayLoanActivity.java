package ua.mycredit.mycredit.internal.di.modules;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.profile.repayloan.RepayLoanActivity;

@Module(subcomponents = ActivitiesModule_AddRepayLoanActivity.RepayLoanActivitySubcomponent.class)
public abstract class ActivitiesModule_AddRepayLoanActivity {
  private ActivitiesModule_AddRepayLoanActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(RepayLoanActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      RepayLoanActivitySubcomponent.Builder builder);

  @Subcomponent
  public interface RepayLoanActivitySubcomponent extends AndroidInjector<RepayLoanActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<RepayLoanActivity> {}
  }
}
