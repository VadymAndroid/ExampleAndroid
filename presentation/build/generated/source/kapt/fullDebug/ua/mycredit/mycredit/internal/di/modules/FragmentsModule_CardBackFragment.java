package ua.mycredit.mycredit.internal.di.modules;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.authentication.registration.card.CardBackFragment;

@Module(subcomponents = FragmentsModule_CardBackFragment.CardBackFragmentSubcomponent.class)
public abstract class FragmentsModule_CardBackFragment {
  private FragmentsModule_CardBackFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(CardBackFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      CardBackFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface CardBackFragmentSubcomponent extends AndroidInjector<CardBackFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<CardBackFragment> {}
  }
}
