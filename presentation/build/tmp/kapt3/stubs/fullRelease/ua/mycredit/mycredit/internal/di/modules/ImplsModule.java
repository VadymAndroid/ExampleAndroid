package ua.mycredit.mycredit.internal.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\bH\'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u000bH\'J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000eH\'J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\'J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\'J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\'\u00a8\u0006\u001b"}, d2 = {"Lua/mycredit/mycredit/internal/di/modules/ImplsModule;", "", "bindViewModelFactory", "Landroid/arch/lifecycle/ViewModelProvider$Factory;", "factory", "Lua/mycredit/mycredit/internal/impls/ViewModelFactoryImpl;", "logger", "Lua/mycredit/core/internal/Logger;", "Lua/mycredit/mycredit/internal/impls/LoggerImpl;", "messagesMapper", "Lua/mycredit/mycredit/ui/MessagesMapper;", "Lua/mycredit/mycredit/internal/impls/MessagesMapperImpl;", "meta", "Lua/mycredit/core/internal/AppMetaData;", "Lua/mycredit/mycredit/internal/impls/AppMetaDataImpl;", "provideLocalStorage", "Lua/mycredit/core/LocalStorage;", "localStorage", "Lua/mycredit/mycredit/internal/impls/LocalStorageImpl;", "provideLogouter", "Lua/mycredit/core/Logouter;", "logouter", "Lua/mycredit/data/impls/LogouterImpl;", "provideNetworkFacade", "Lua/mycredit/core/NetworkFacade;", "networkFacade", "Lua/mycredit/data/impls/NetworkFacadeImpl;", "presentation_fullRelease"})
@dagger.Module()
public abstract interface ImplsModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract ua.mycredit.core.LocalStorage provideLocalStorage(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.internal.impls.LocalStorageImpl localStorage);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract ua.mycredit.core.Logouter provideLogouter(@org.jetbrains.annotations.NotNull()
    ua.mycredit.data.impls.LogouterImpl logouter);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract ua.mycredit.core.NetworkFacade provideNetworkFacade(@org.jetbrains.annotations.NotNull()
    ua.mycredit.data.impls.NetworkFacadeImpl networkFacade);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModelProvider.Factory bindViewModelFactory(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.internal.impls.ViewModelFactoryImpl factory);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract ua.mycredit.mycredit.ui.MessagesMapper messagesMapper(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.internal.impls.MessagesMapperImpl messagesMapper);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract ua.mycredit.core.internal.Logger logger(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.internal.impls.LoggerImpl logger);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract ua.mycredit.core.internal.AppMetaData meta(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.internal.impls.AppMetaDataImpl meta);
}