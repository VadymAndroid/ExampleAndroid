package ua.mycredit.mycredit.internal.di.modules;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.profile.cards.CardsFragment;

@Module(subcomponents = FragmentsModule_CardsFragment.CardsFragmentSubcomponent.class)
public abstract class FragmentsModule_CardsFragment {
  private FragmentsModule_CardsFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(CardsFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      CardsFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface CardsFragmentSubcomponent extends AndroidInjector<CardsFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<CardsFragment> {}
  }
}
