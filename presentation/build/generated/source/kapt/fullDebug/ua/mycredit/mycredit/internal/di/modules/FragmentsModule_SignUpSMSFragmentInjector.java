package ua.mycredit.mycredit.internal.di.modules;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.authentication.registration.sms.SignUpSMSFragment;

@Module(
  subcomponents = FragmentsModule_SignUpSMSFragmentInjector.SignUpSMSFragmentSubcomponent.class
)
public abstract class FragmentsModule_SignUpSMSFragmentInjector {
  private FragmentsModule_SignUpSMSFragmentInjector() {}

  @Binds
  @IntoMap
  @FragmentKey(SignUpSMSFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      SignUpSMSFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface SignUpSMSFragmentSubcomponent extends AndroidInjector<SignUpSMSFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SignUpSMSFragment> {}
  }
}
