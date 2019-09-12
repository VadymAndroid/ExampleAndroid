// Generated by Dagger (https://google.github.io/dagger).
package ua.mycredit.core;

import dagger.internal.Factory;
import javax.inject.Provider;

public final class ProfileRepo_Factory implements Factory<ProfileRepo> {
  private final Provider<NetworkFacade> arg0Provider;

  private final Provider<LocalStorage> arg1Provider;

  public ProfileRepo_Factory(
      Provider<NetworkFacade> arg0Provider, Provider<LocalStorage> arg1Provider) {
    this.arg0Provider = arg0Provider;
    this.arg1Provider = arg1Provider;
  }

  @Override
  public ProfileRepo get() {
    return provideInstance(arg0Provider, arg1Provider);
  }

  public static ProfileRepo provideInstance(
      Provider<NetworkFacade> arg0Provider, Provider<LocalStorage> arg1Provider) {
    return new ProfileRepo(arg0Provider.get(), arg1Provider.get());
  }

  public static ProfileRepo_Factory create(
      Provider<NetworkFacade> arg0Provider, Provider<LocalStorage> arg1Provider) {
    return new ProfileRepo_Factory(arg0Provider, arg1Provider);
  }

  public static ProfileRepo newProfileRepo(NetworkFacade arg0, LocalStorage arg1) {
    return new ProfileRepo(arg0, arg1);
  }
}