// Generated by Dagger (https://google.github.io/dagger).
package ua.mycredit.mycredit.internal.di.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import io.reactivex.Scheduler;
import java.util.Map;
import ua.mycredit.core.BaseUseCase;

public final class SchedulersModule_AppExecutionSchedulersFactory
    implements Factory<Map<BaseUseCase.SchedulerType, ? extends Scheduler>> {
  private final SchedulersModule module;

  public SchedulersModule_AppExecutionSchedulersFactory(SchedulersModule module) {
    this.module = module;
  }

  @Override
  public Map<BaseUseCase.SchedulerType, ? extends Scheduler> get() {
    return provideInstance(module);
  }

  public static Map<BaseUseCase.SchedulerType, ? extends Scheduler> provideInstance(
      SchedulersModule module) {
    return proxyAppExecutionSchedulers(module);
  }

  public static SchedulersModule_AppExecutionSchedulersFactory create(SchedulersModule module) {
    return new SchedulersModule_AppExecutionSchedulersFactory(module);
  }

  public static Map<BaseUseCase.SchedulerType, ? extends Scheduler> proxyAppExecutionSchedulers(
      SchedulersModule instance) {
    return Preconditions.checkNotNull(
        instance.appExecutionSchedulers(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}