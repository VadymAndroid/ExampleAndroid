package ua.mycredit.mycredit.internal.di.modules;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import ua.mycredit.mycredit.ui.profile.profile.contacts.ContactsActivity;

@Module(subcomponents = ActivitiesModule_ContactsActivity.ContactsActivitySubcomponent.class)
public abstract class ActivitiesModule_ContactsActivity {
  private ActivitiesModule_ContactsActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(ContactsActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      ContactsActivitySubcomponent.Builder builder);

  @Subcomponent
  public interface ContactsActivitySubcomponent extends AndroidInjector<ContactsActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ContactsActivity> {}
  }
}
