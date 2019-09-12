package ua.mycredit.mycredit.internal.di.modules;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.profile.profile.contacts.EditPasswordFragment;

@Module(subcomponents = FragmentsModule_EditPasswordFragment.EditPasswordFragmentSubcomponent.class)
public abstract class FragmentsModule_EditPasswordFragment {
  private FragmentsModule_EditPasswordFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(EditPasswordFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      EditPasswordFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface EditPasswordFragmentSubcomponent extends AndroidInjector<EditPasswordFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<EditPasswordFragment> {}
  }
}
