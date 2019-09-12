package ua.mycredit.mycredit.internal.di.modules;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.authentication.registration.signup.PasswordFragment;

@Module(subcomponents = FragmentsModule_PasswordFragment.PasswordFragmentSubcomponent.class)
public abstract class FragmentsModule_PasswordFragment {
  private FragmentsModule_PasswordFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(PasswordFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      PasswordFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface PasswordFragmentSubcomponent extends AndroidInjector<PasswordFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<PasswordFragment> {}
  }
}
