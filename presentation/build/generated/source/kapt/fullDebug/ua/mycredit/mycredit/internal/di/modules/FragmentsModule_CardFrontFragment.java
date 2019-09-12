package ua.mycredit.mycredit.internal.di.modules;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.authentication.registration.card.CardFrontFragment;

@Module(subcomponents = FragmentsModule_CardFrontFragment.CardFrontFragmentSubcomponent.class)
public abstract class FragmentsModule_CardFrontFragment {
  private FragmentsModule_CardFrontFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(CardFrontFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      CardFrontFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface CardFrontFragmentSubcomponent extends AndroidInjector<CardFrontFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<CardFrontFragment> {}
  }
}
