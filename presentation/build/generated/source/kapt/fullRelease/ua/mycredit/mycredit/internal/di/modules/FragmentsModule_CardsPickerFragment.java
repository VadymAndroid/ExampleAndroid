package ua.mycredit.mycredit.internal.di.modules;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.profile.repayloan.CardsPickerFragment;

@Module(subcomponents = FragmentsModule_CardsPickerFragment.CardsPickerFragmentSubcomponent.class)
public abstract class FragmentsModule_CardsPickerFragment {
  private FragmentsModule_CardsPickerFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(CardsPickerFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      CardsPickerFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface CardsPickerFragmentSubcomponent extends AndroidInjector<CardsPickerFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<CardsPickerFragment> {}
  }
}
