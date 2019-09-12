package ua.mycredit.mycredit.internal.di.modules;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.profile.MyCreditWebViewFragment;

@Module(
  subcomponents =
      FragmentsModule_CardWebVerificationFragment.MyCreditWebViewFragmentSubcomponent.class
)
public abstract class FragmentsModule_CardWebVerificationFragment {
  private FragmentsModule_CardWebVerificationFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(MyCreditWebViewFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      MyCreditWebViewFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface MyCreditWebViewFragmentSubcomponent
      extends AndroidInjector<MyCreditWebViewFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MyCreditWebViewFragment> {}
  }
}
