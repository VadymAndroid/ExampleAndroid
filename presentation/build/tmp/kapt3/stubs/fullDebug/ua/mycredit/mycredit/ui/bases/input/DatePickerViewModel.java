package ua.mycredit.mycredit.ui.bases.input;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018J\u0010\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018J\u0010\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\""}, d2 = {"Lua/mycredit/mycredit/ui/bases/input/DatePickerViewModel;", "", "hint", "", "router", "Lru/terrakok/cicerone/Router;", "minDate", "Lorg/joda/time/LocalDate;", "maxDate", "(ILru/terrakok/cicerone/Router;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)V", "field", "Lua/mycredit/mycredit/ui/bases/input/FieldViewModel;", "getField", "()Lua/mycredit/mycredit/ui/bases/input/FieldViewModel;", "getMaxDate", "()Lorg/joda/time/LocalDate;", "getMinDate", "pickedDate", "getPickedDate", "setPickedDate", "(Lorg/joda/time/LocalDate;)V", "getRouter", "()Lru/terrakok/cicerone/Router;", "getPickedDateIsoOr", "", "dateIso", "hasPickedValueNotEqualTo", "", "init", "", "date", "notifyDatePicked", "calendar", "Ljava/util/Calendar;", "presentation_fullDebug"})
public final class DatePickerViewModel {
    @org.jetbrains.annotations.Nullable()
    private org.joda.time.LocalDate pickedDate;
    @org.jetbrains.annotations.NotNull()
    private final ua.mycredit.mycredit.ui.bases.input.FieldViewModel field = null;
    @org.jetbrains.annotations.NotNull()
    private final ru.terrakok.cicerone.Router router = null;
    @org.jetbrains.annotations.NotNull()
    private final org.joda.time.LocalDate minDate = null;
    @org.jetbrains.annotations.NotNull()
    private final org.joda.time.LocalDate maxDate = null;
    
    @org.jetbrains.annotations.Nullable()
    public final org.joda.time.LocalDate getPickedDate() {
        return null;
    }
    
    public final void setPickedDate(@org.jetbrains.annotations.Nullable()
    org.joda.time.LocalDate p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.mycredit.mycredit.ui.bases.input.FieldViewModel getField() {
        return null;
    }
    
    public final void init(@org.jetbrains.annotations.Nullable()
    org.joda.time.LocalDate date) {
    }
    
    public final void notifyDatePicked(@org.jetbrains.annotations.NotNull()
    java.util.Calendar calendar) {
    }
    
    public final boolean hasPickedValueNotEqualTo(@org.jetbrains.annotations.Nullable()
    java.lang.String dateIso) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPickedDateIsoOr(@org.jetbrains.annotations.Nullable()
    java.lang.String dateIso) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.terrakok.cicerone.Router getRouter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.joda.time.LocalDate getMinDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.joda.time.LocalDate getMaxDate() {
        return null;
    }
    
    public DatePickerViewModel(int hint, @org.jetbrains.annotations.NotNull()
    ru.terrakok.cicerone.Router router, @org.jetbrains.annotations.NotNull()
    org.joda.time.LocalDate minDate, @org.jetbrains.annotations.NotNull()
    org.joda.time.LocalDate maxDate) {
        super();
    }
}