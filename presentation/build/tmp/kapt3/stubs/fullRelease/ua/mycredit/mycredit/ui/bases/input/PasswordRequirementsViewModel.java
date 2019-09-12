package ua.mycredit.mycredit.ui.bases.input;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lua/mycredit/mycredit/ui/bases/input/PasswordRequirementsViewModel;", "", "()V", "requirements", "Landroid/databinding/ObservableInt;", "getRequirements", "()Landroid/databinding/ObservableInt;", "onPasswordChanged", "", "password", "", "PasswordRequirement", "presentation_fullRelease"})
public final class PasswordRequirementsViewModel {
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableInt requirements = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableInt getRequirements() {
        return null;
    }
    
    public final void onPasswordChanged(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence password) {
    }
    
    public PasswordRequirementsViewModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B \b\u0002\u0012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006\u00a2\u0006\u0002\u0010\u0007R\"\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f\u00a8\u0006\r"}, d2 = {"Lua/mycredit/mycredit/ui/bases/input/PasswordRequirementsViewModel$PasswordRequirement;", "", "check", "Lkotlin/Function1;", "", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;ILkotlin/jvm/functions/Function1;)V", "getCheck", "()Lkotlin/jvm/functions/Function1;", "LENGTH", "LETTER_CASE", "DIGITS", "presentation_fullRelease"})
    public static enum PasswordRequirement {
        /*public static final*/ LENGTH /* = new LENGTH(null) */,
        /*public static final*/ LETTER_CASE /* = new LETTER_CASE(null) */,
        /*public static final*/ DIGITS /* = new DIGITS(null) */;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function1<java.lang.CharSequence, java.lang.Boolean> check = null;
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<java.lang.CharSequence, java.lang.Boolean> getCheck() {
            return null;
        }
        
        PasswordRequirement(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.CharSequence, java.lang.Boolean> check) {
        }
    }
}