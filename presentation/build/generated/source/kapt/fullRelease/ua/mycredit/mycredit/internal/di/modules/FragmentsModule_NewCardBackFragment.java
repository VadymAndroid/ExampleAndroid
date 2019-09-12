package ua.mycredit.mycredit.internal.di.modules;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.profile.cards.NewCardBackFragment;

@Module(subcomponents = FragmentsModule_NewCardBackFragment.NewCardBackFragmentSubcomponent.class)
public abstract class FragmentsModule_NewCardBackFragment {
  private FragmentsModule_NewCardBackFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(NewCardBackFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      NewCardBackFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface NewCardBackFragmentSubcomponent extends AndroidInjector<NewCardBackFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<NewCardBackFragment> {}
  }
}
