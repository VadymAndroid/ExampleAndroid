package ua.mycredit.mycredit.internal.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\u0005H\u0007R?\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000e"}, d2 = {"Lua/mycredit/mycredit/internal/di/modules/RouterModule;", "", "()V", "cicerone", "Lru/terrakok/cicerone/Cicerone;", "Lru/terrakok/cicerone/Router;", "kotlin.jvm.PlatformType", "getCicerone", "()Lru/terrakok/cicerone/Cicerone;", "cicerone$delegate", "Lkotlin/Lazy;", "provideNavigatorHolder", "Lru/terrakok/cicerone/NavigatorHolder;", "provideRouter", "presentation_fullRelease"})
@dagger.Module()
public final class RouterModule {
    private final kotlin.Lazy cicerone$delegate = null;
    
    private final ru.terrakok.cicerone.Cicerone<ru.terrakok.cicerone.Router> getCicerone() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final ru.terrakok.cicerone.Router provideRouter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final ru.terrakok.cicerone.NavigatorHolder provideNavigatorHolder() {
        return null;
    }
    
    public RouterModule() {
        super();
    }
}