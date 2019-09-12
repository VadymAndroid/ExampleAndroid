package ua.mycredit.mycredit.internal.di.modules;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.profile.cards.CardSmsConfirmationFragment;

@Module(
  subcomponents = FragmentsModule_CardSmsFragment.CardSmsConfirmationFragmentSubcomponent.class
)
public abstract class FragmentsModule_CardSmsFragment {
  private FragmentsModule_CardSmsFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(CardSmsConfirmationFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      CardSmsConfirmationFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface CardSmsConfirmationFragmentSubcomponent
      extends AndroidInjector<CardSmsConfirmationFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<CardSmsConfirmationFragment> {}
  }
}
