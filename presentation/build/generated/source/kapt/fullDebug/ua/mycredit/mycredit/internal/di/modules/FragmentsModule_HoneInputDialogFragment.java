package ua.mycredit.mycredit.internal.di.modules;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.bases.input.PhoneInputDialogFragment;

@Module(
  subcomponents = FragmentsModule_HoneInputDialogFragment.PhoneInputDialogFragmentSubcomponent.class
)
public abstract class FragmentsModule_HoneInputDialogFragment {
  private FragmentsModule_HoneInputDialogFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(PhoneInputDialogFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      PhoneInputDialogFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface PhoneInputDialogFragmentSubcomponent
      extends AndroidInjector<PhoneInputDialogFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<PhoneInputDialogFragment> {}
  }
}
