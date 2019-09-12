package ua.mycredit.mycredit.internal.di.modules;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.authentication.registration.passport.address.SignUpAddressFragment;

@Module(
  subcomponents =
      FragmentsModule_SignUpAddressFragmentInjector.SignUpAddressFragmentSubcomponent.class
)
public abstract class FragmentsModule_SignUpAddressFragmentInjector {
  private FragmentsModule_SignUpAddressFragmentInjector() {}

  @Binds
  @IntoMap
  @FragmentKey(SignUpAddressFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      SignUpAddressFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface SignUpAddressFragmentSubcomponent
      extends AndroidInjector<SignUpAddressFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SignUpAddressFragment> {}
  }
}
