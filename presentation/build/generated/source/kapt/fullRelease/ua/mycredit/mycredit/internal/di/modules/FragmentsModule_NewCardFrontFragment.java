package ua.mycredit.mycredit.internal.di.modules;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.profile.cards.NewCardFrontFragment;

@Module(subcomponents = FragmentsModule_NewCardFrontFragment.NewCardFrontFragmentSubcomponent.class)
public abstract class FragmentsModule_NewCardFrontFragment {
  private FragmentsModule_NewCardFrontFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(NewCardFrontFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      NewCardFrontFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface NewCardFrontFragmentSubcomponent extends AndroidInjector<NewCardFrontFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<NewCardFrontFragment> {}
  }
}
