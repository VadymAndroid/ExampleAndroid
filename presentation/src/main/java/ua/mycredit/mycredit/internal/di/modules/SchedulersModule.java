package ua.mycredit.mycredit.internal.di.modules;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import ua.mycredit.core.BaseUseCase;

@Module
public class SchedulersModule {

    @Provides
    @Singleton
    Map<BaseUseCase.SchedulerType, ? extends Scheduler> appExecutionSchedulers() {
        return new HashMap<BaseUseCase.SchedulerType, Scheduler>() {{
            put(BaseUseCase.SchedulerType.WORK, Schedulers.io());
            put(BaseUseCase.SchedulerType.WORK_RESULT, AndroidSchedulers.mainThread());
        }};
    }
}
