package ua.mycredit.mycredit.internal.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lua/mycredit/mycredit/internal/di/AppComponent;", "", "inject", "", "app", "Lua/mycredit/mycredit/AndroidApplication;", "Builder", "presentation_fullRelease"})
@dagger.Component(modules = {dagger.android.support.AndroidSupportInjectionModule.class, ua.mycredit.mycredit.internal.di.modules.ActivitiesModule.class, ua.mycredit.mycredit.internal.di.modules.FragmentsModule.class, ua.mycredit.mycredit.internal.di.modules.ViewModelModule.class, ua.mycredit.mycredit.internal.di.modules.ImplsModule.class, ua.mycredit.mycredit.internal.di.modules.RouterModule.class, ua.mycredit.mycredit.internal.di.modules.SchedulersModule.class, ua.mycredit.data.di.NetworkModule.class, ua.mycredit.mycredit.internal.di.modules.FirebaseModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.AndroidApplication app);
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lua/mycredit/mycredit/internal/di/AppComponent$Builder;", "", "build", "Lua/mycredit/mycredit/internal/di/AppComponent;", "context", "Landroid/content/Context;", "presentation_fullRelease"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract ua.mycredit.mycredit.internal.di.AppComponent.Builder context(@org.jetbrains.annotations.NotNull()
        android.content.Context context);
        
        @org.jetbrains.annotations.NotNull()
        public abstract ua.mycredit.mycredit.internal.di.AppComponent build();
    }
}