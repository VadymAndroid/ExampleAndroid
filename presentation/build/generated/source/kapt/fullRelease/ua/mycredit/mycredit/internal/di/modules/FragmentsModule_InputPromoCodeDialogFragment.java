package ua.mycredit.mycredit.internal.di.modules;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.calculator.InputPromoCodeDialogFragment;

@Module(
  subcomponents =
      FragmentsModule_InputPromoCodeDialogFragment.InputPromoCodeDialogFragmentSubcomponent.class
)
public abstract class FragmentsModule_InputPromoCodeDialogFragment {
  private FragmentsModule_InputPromoCodeDialogFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(InputPromoCodeDialogFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      InputPromoCodeDialogFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface InputPromoCodeDialogFragmentSubcomponent
      extends AndroidInjector<InputPromoCodeDialogFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<InputPromoCodeDialogFragment> {}
  }
}
