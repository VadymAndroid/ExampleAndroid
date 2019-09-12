package ua.mycredit.mycredit.internal.di.modules;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.bases.input.TextInputDialogFragment;

@Module(
  subcomponents = FragmentsModule_TextInputDialogFragment.TextInputDialogFragmentSubcomponent.class
)
public abstract class FragmentsModule_TextInputDialogFragment {
  private FragmentsModule_TextInputDialogFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(TextInputDialogFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      TextInputDialogFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface TextInputDialogFragmentSubcomponent
      extends AndroidInjector<TextInputDialogFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TextInputDialogFragment> {}
  }
}
