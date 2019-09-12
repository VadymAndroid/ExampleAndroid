package ua.mycredit.mycredit.internal.di.modules;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.profile.credit.AgreementFragment;

@Module(subcomponents = FragmentsModule_AgreementFragment.AgreementFragmentSubcomponent.class)
public abstract class FragmentsModule_AgreementFragment {
  private FragmentsModule_AgreementFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(AgreementFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      AgreementFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface AgreementFragmentSubcomponent extends AndroidInjector<AgreementFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<AgreementFragment> {}
  }
}
