package ua.mycredit.mycredit.internal.di.modules;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.profile.profile.ProfileFragment;

@Module(subcomponents = FragmentsModule_QuestionsFragment.ProfileFragmentSubcomponent.class)
public abstract class FragmentsModule_QuestionsFragment {
  private FragmentsModule_QuestionsFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(ProfileFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ProfileFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ProfileFragmentSubcomponent extends AndroidInjector<ProfileFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ProfileFragment> {}
  }
}
