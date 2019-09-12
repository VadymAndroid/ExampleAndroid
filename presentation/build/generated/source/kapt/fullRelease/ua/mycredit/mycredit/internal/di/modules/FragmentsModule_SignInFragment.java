package ua.mycredit.mycredit.internal.di.modules;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.authentication.SignInFragment;

@Module(subcomponents = FragmentsModule_SignInFragment.SignInFragmentSubcomponent.class)
public abstract class FragmentsModule_SignInFragment {
  private FragmentsModule_SignInFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(SignInFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      SignInFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface SignInFragmentSubcomponent extends AndroidInjector<SignInFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SignInFragment> {}
  }
}
