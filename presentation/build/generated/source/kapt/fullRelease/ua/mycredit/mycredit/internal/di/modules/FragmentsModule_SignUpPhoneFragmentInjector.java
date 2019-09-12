package ua.mycredit.mycredit.internal.di.modules;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.authentication.registration.phone.SignUpPhoneFragment;

@Module(
  subcomponents = FragmentsModule_SignUpPhoneFragmentInjector.SignUpPhoneFragmentSubcomponent.class
)
public abstract class FragmentsModule_SignUpPhoneFragmentInjector {
  private FragmentsModule_SignUpPhoneFragmentInjector() {}

  @Binds
  @IntoMap
  @FragmentKey(SignUpPhoneFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      SignUpPhoneFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface SignUpPhoneFragmentSubcomponent extends AndroidInjector<SignUpPhoneFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SignUpPhoneFragment> {}
  }
}
