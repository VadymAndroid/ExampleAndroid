package ua.mycredit.mycredit.internal.di.modules;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.ProgressDialogFragment;

@Module(
  subcomponents = FragmentsModule_ProgressDialogFragment.ProgressDialogFragmentSubcomponent.class
)
public abstract class FragmentsModule_ProgressDialogFragment {
  private FragmentsModule_ProgressDialogFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(ProgressDialogFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ProgressDialogFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ProgressDialogFragmentSubcomponent
      extends AndroidInjector<ProgressDialogFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ProgressDialogFragment> {}
  }
}
