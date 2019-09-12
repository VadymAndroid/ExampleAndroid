package ua.mycredit.mycredit.internal.di.modules;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.authentication.registration.ocupation.StudentFragment;

@Module(subcomponents = FragmentsModule_StudentFragment.StudentFragmentSubcomponent.class)
public abstract class FragmentsModule_StudentFragment {
  private FragmentsModule_StudentFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(StudentFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      StudentFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface StudentFragmentSubcomponent extends AndroidInjector<StudentFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<StudentFragment> {}
  }
}
