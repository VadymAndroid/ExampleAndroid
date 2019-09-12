package ua.mycredit.mycredit.internal.impls;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J#\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\n\u001a\u00020\u00022\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0086\u0002J+\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00022\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0086\u0002J\u0010\u0010\u0010\u001a\u00020\u000e*\u0006\u0012\u0002\b\u00030\fH\u0002J\u0010\u0010\u0011\u001a\u00020\u0012*\u0006\u0012\u0002\b\u00030\fH\u0002J\u0010\u0010\u0013\u001a\u00020\u0014*\u0006\u0012\u0002\b\u00030\fH\u0002R\u0010\u0010\u0003\u001a\u00028\u0000X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lua/mycredit/mycredit/internal/impls/ExpirableProperty;", "T", "", "defaultValue", "expiresAfterMillis", "", "(Ljava/lang/Object;J)V", "Ljava/lang/Object;", "getValue", "Lua/mycredit/core/LocalStorage$ExpirableValue;", "thisRef", "property", "Lkotlin/reflect/KProperty;", "setValue", "", "value", "fixChangeTime", "isTimeExpired", "", "timeStampKey", "", "presentation_fullRelease"})
public final class ExpirableProperty<T extends java.lang.Object> {
    private final T defaultValue = null;
    private final long expiresAfterMillis = 0L;
    
    @org.jetbrains.annotations.NotNull()
    public final ua.mycredit.core.LocalStorage.ExpirableValue<T> getValue(@org.jetbrains.annotations.NotNull()
    java.lang.Object thisRef, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> property) {
        return null;
    }
    
    public final void setValue(@org.jetbrains.annotations.NotNull()
    java.lang.Object thisRef, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> property, @org.jetbrains.annotations.NotNull()
    ua.mycredit.core.LocalStorage.ExpirableValue<T> value) {
    }
    
    private final void fixChangeTime(@org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> $receiver) {
    }
    
    private final boolean isTimeExpired(@org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> $receiver) {
        return false;
    }
    
    private final java.lang.String timeStampKey(@org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> $receiver) {
        return null;
    }
    
    public ExpirableProperty(T defaultValue, long expiresAfterMillis) {
        super();
    }
}