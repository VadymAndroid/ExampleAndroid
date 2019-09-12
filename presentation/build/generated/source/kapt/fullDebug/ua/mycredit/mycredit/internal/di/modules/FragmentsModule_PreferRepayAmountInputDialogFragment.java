package ua.mycredit.mycredit.internal.di.modules;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.profile.repayloan.PreferRepayAmountInputDialogFragment;

@Module(
  subcomponents =
      FragmentsModule_PreferRepayAmountInputDialogFragment
          .PreferRepayAmountInputDialogFragmentSubcomponent.class
)
public abstract class FragmentsModule_PreferRepayAmountInputDialogFragment {
  private FragmentsModule_PreferRepayAmountInputDialogFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(PreferRepayAmountInputDialogFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      PreferRepayAmountInputDialogFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface PreferRepayAmountInputDialogFragmentSubcomponent
      extends AndroidInjector<PreferRepayAmountInputDialogFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<PreferRepayAmountInputDialogFragment> {}
  }
}
