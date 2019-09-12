package ua.mycredit.mycredit.internal.di.modules;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.authentication.ResetPasswordByPhoneFragment;

@Module(
  subcomponents =
      FragmentsModule_ResetPasswordFragment.ResetPasswordByPhoneFragmentSubcomponent.class
)
public abstract class FragmentsModule_ResetPasswordFragment {
  private FragmentsModule_ResetPasswordFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(ResetPasswordByPhoneFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ResetPasswordByPhoneFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ResetPasswordByPhoneFragmentSubcomponent
      extends AndroidInjector<ResetPasswordByPhoneFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ResetPasswordByPhoneFragment> {}
  }
}
