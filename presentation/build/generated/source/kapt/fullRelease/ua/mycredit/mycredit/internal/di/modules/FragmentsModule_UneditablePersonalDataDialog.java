package ua.mycredit.mycredit.internal.di.modules;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.profile.profile.details.UneditablePersonalDataDialog;

@Module(
  subcomponents =
      FragmentsModule_UneditablePersonalDataDialog.UneditablePersonalDataDialogSubcomponent.class
)
public abstract class FragmentsModule_UneditablePersonalDataDialog {
  private FragmentsModule_UneditablePersonalDataDialog() {}

  @Binds
  @IntoMap
  @FragmentKey(UneditablePersonalDataDialog.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      UneditablePersonalDataDialogSubcomponent.Builder builder);

  @Subcomponent
  public interface UneditablePersonalDataDialogSubcomponent
      extends AndroidInjector<UneditablePersonalDataDialog> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<UneditablePersonalDataDialog> {}
  }
}
