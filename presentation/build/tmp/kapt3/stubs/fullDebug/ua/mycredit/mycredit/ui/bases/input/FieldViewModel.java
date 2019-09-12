package ua.mycredit.mycredit.ui.bases.input;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\b\u0018\u0000 ~2\u00020\u0001:\u0006~\u007f\u0080\u0001\u0081\u0001B\u0081\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000f\u0012\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001b\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\u0002\u0010\u001eJ\"\u0010U\u001a\u00020\u00002\u0006\u0010V\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u00032\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\u0000J\b\u0010X\u001a\u00020\u0013H\u0007J\u0006\u0010Y\u001a\u00020\u0013J\t\u0010Z\u001a\u00020\u0003H\u00c6\u0003J\t\u0010[\u001a\u00020\tH\u00c6\u0003J\u000f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u00c6\u0003J\u0011\u0010]\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u00c6\u0003J\u0011\u0010^\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u00c6\u0003J\u0011\u0010_\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u00c6\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0017H\u00c2\u0003J\u000f\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00190\u000fH\u00c2\u0003J\u0015\u0010b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001bH\u00c2\u0003J\u000f\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u00c2\u0003J\u000f\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u00c2\u0003J\t\u0010e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010g\u001a\u00020\u0003H\u00c6\u0003J\t\u0010h\u001a\u00020\u0003H\u00c6\u0003J\t\u0010i\u001a\u00020\tH\u00c6\u0003J\t\u0010j\u001a\u00020\u0003H\u00c6\u0003J\t\u0010k\u001a\u00020\tH\u00c6\u0003J\t\u0010l\u001a\u00020\u0003H\u00c6\u0003J\u0085\u0002\u0010m\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\t2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000f2\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001b2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u00c6\u0001J\u0013\u0010n\u001a\u00020\t2\b\u0010o\u001a\u0004\u0018\u00010pH\u00d6\u0003J\t\u0010q\u001a\u00020\u0003H\u00d6\u0001J\u0006\u0010B\u001a\u00020\u0013J\u0018\u0010r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170t0sJ\u0006\u0010\u0015\u001a\u00020\u0013J\u000e\u0010u\u001a\u00020\t2\u0006\u0010v\u001a\u00020\u0003J\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0011\u001a\u00020\u0013J\u0006\u0010N\u001a\u00020\u0013J\u000e\u0010w\u001a\u00020\u00132\u0006\u0010x\u001a\u00020\u0017J\t\u0010y\u001a\u00020\u0017H\u00d6\u0001J\u000e\u0010z\u001a\u00020\t2\u0006\u0010{\u001a\u00020\u0003J\b\u0010|\u001a\u00020\tH\u0016J\u0006\u0010}\u001a\u00020\u0017R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010!\u001a\u00020\"\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\'\u001a\u00020\"\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010$R\u0011\u0010)\u001a\u00020*\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0019\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00100.\u00a2\u0006\n\n\u0002\u00101\u001a\u0004\b/\u00100R\u0011\u00102\u001a\u00020\"\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010$R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u00106\u001a\u00020\"\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010$R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00105R\u0011\u0010\r\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010&R\u0017\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00170;\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u00105R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u00105R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u00105R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u00105R\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020C0;\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010=R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010F\"\u0004\bJ\u0010HR\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010F\"\u0004\bL\u0010HR\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010&R\u0017\u0010N\u001a\b\u0012\u0004\u0012\u00020O0;\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010=R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u00105R\u0017\u0010R\u001a\b\u0012\u0004\u0012\u00020S0;\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u0010=R\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0082\u0001"}, d2 = {"Lua/mycredit/mycredit/ui/bases/input/FieldViewModel;", "Lua/mycredit/mycredit/ui/bases/input/Validable;", "hint", "", "inputType", "maxLines", "minLines", "maxLength", "optional", "", "requiredError", "counterEnabled", "gravity", "hintStatic", "additionalFilters", "", "Landroid/text/InputFilter;", "onFocused", "Lkotlin/Function0;", "", "onFocusLost", "onClick", "availableChars", "", "conditions", "Lua/mycredit/mycredit/ui/bases/input/FieldViewModel$ConditionChecker;", "verificationErrorsMessages", "", "onImeActionDone", "onImeActionNext", "(IIIIIZIZIZLjava/util/Set;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/util/Set;Ljava/util/Map;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getAdditionalFilters", "()Ljava/util/Set;", "clickable", "Landroid/databinding/ObservableBoolean;", "getClickable", "()Landroid/databinding/ObservableBoolean;", "getCounterEnabled", "()Z", "enabled", "getEnabled", "error", "Landroid/databinding/ObservableInt;", "getError", "()Landroid/databinding/ObservableInt;", "filters", "", "getFilters", "()[Landroid/text/InputFilter;", "[Landroid/text/InputFilter;", "focusable", "getFocusable", "getGravity", "()I", "hasFocus", "getHasFocus", "getHint", "getHintStatic", "input", "Landroid/databinding/ObservableField;", "getInput", "()Landroid/databinding/ObservableField;", "getInputType", "getMaxLength", "getMaxLines", "getMinLines", "moveCursorToEnd", "Lua/mycredit/mycredit/ui/MoveCursorToEnd;", "getMoveCursorToEnd", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "setOnClick", "(Lkotlin/jvm/functions/Function0;)V", "getOnFocusLost", "setOnFocusLost", "getOnFocused", "setOnFocused", "getOptional", "requestFocus", "Lua/mycredit/mycredit/ui/RequestFocus;", "getRequestFocus", "getRequiredError", "state", "Lua/mycredit/mycredit/ui/bases/input/FieldViewModel$State;", "getState", "asFixedLengthField", "length", "next", "clear", "clearIfNotValid", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "observeInputChanges", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "onEditorAction", "actionId", "setValue", "text", "toString", "tryShowVerificationError", "code", "validate", "value", "Companion", "ConditionChecker", "State", "WrongCharsFilter", "presentation_fullDebug"})
public final class FieldViewModel implements ua.mycredit.mycredit.ui.bases.input.Validable {
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableField<java.lang.String> input = null;
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableInt error = null;
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableBoolean hasFocus = null;
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableField<ua.mycredit.mycredit.ui.bases.input.FieldViewModel.State> state = null;
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableField<ua.mycredit.mycredit.ui.RequestFocus> requestFocus = null;
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableField<ua.mycredit.mycredit.ui.MoveCursorToEnd> moveCursorToEnd = null;
    @org.jetbrains.annotations.NotNull()
    private final android.text.InputFilter[] filters = null;
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableBoolean clickable = null;
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableBoolean focusable = null;
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableBoolean enabled = null;
    private final int hint = 0;
    private final int inputType = 0;
    private final int maxLines = 0;
    private final int minLines = 0;
    private final int maxLength = 0;
    private final boolean optional = false;
    private final int requiredError = 0;
    private final boolean counterEnabled = false;
    private final int gravity = 0;
    private final boolean hintStatic = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Set<android.text.InputFilter> additionalFilters = null;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<kotlin.Unit> onFocused;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<kotlin.Unit> onFocusLost;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<kotlin.Unit> onClick;
    private final java.lang.String availableChars = null;
    private final java.util.Set<ua.mycredit.mycredit.ui.bases.input.FieldViewModel.ConditionChecker> conditions = null;
    private final java.util.Map<java.lang.Integer, java.lang.Integer> verificationErrorsMessages = null;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onImeActionDone = null;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onImeActionNext = null;
    public static final ua.mycredit.mycredit.ui.bases.input.FieldViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableField<java.lang.String> getInput() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableInt getError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableBoolean getHasFocus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableField<ua.mycredit.mycredit.ui.bases.input.FieldViewModel.State> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableField<ua.mycredit.mycredit.ui.RequestFocus> getRequestFocus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableField<ua.mycredit.mycredit.ui.MoveCursorToEnd> getMoveCursorToEnd() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.text.InputFilter[] getFilters() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableBoolean getClickable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableBoolean getFocusable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableBoolean getEnabled() {
        return null;
    }
    
    @java.lang.Override()
    public boolean validate() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String value() {
        return null;
    }
    
    public final void setValue(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public final void moveCursorToEnd() {
    }
    
    public final void requestFocus() {
    }
    
    public final void onFocused() {
    }
    
    public final void onFocusLost() {
    }
    
    public final void onClick() {
    }
    
    public final boolean tryShowVerificationError(int code) {
        return false;
    }
    
    @android.support.annotation.CallSuper()
    public final void clear() {
    }
    
    public final void clearIfNotValid() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.mycredit.mycredit.ui.bases.input.FieldViewModel asFixedLengthField(int length, int error, @org.jetbrains.annotations.Nullable()
    ua.mycredit.mycredit.ui.bases.input.FieldViewModel next) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<kotlin.Pair<java.lang.String, java.lang.String>> observeInputChanges() {
        return null;
    }
    
    public final boolean onEditorAction(int actionId) {
        return false;
    }
    
    public final int getHint() {
        return 0;
    }
    
    public final int getInputType() {
        return 0;
    }
    
    public final int getMaxLines() {
        return 0;
    }
    
    public final int getMinLines() {
        return 0;
    }
    
    public final int getMaxLength() {
        return 0;
    }
    
    public final boolean getOptional() {
        return false;
    }
    
    public final int getRequiredError() {
        return 0;
    }
    
    public final boolean getCounterEnabled() {
        return false;
    }
    
    public final int getGravity() {
        return 0;
    }
    
    public final boolean getHintStatic() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<android.text.InputFilter> getAdditionalFilters() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnFocused() {
        return null;
    }
    
    public final void setOnFocused(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnFocusLost() {
        return null;
    }
    
    public final void setOnFocusLost(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnClick() {
        return null;
    }
    
    public final void setOnClick(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    public FieldViewModel(int hint, int inputType, int maxLines, int minLines, int maxLength, boolean optional, int requiredError, boolean counterEnabled, int gravity, boolean hintStatic, @org.jetbrains.annotations.NotNull()
    java.util.Set<? extends android.text.InputFilter> additionalFilters, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> onFocused, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> onFocusLost, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick, @org.jetbrains.annotations.Nullable()
    java.lang.String availableChars, @org.jetbrains.annotations.NotNull()
    java.util.Set<ua.mycredit.mycredit.ui.bases.input.FieldViewModel.ConditionChecker> conditions, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Integer, java.lang.Integer> verificationErrorsMessages, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onImeActionDone, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onImeActionNext) {
        super();
    }
    
    public FieldViewModel() {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final boolean component6() {
        return false;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final boolean component8() {
        return false;
    }
    
    public final int component9() {
        return 0;
    }
    
    public final boolean component10() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<android.text.InputFilter> component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> component14() {
        return null;
    }
    
    private final java.lang.String component15() {
        return null;
    }
    
    private final java.util.Set<ua.mycredit.mycredit.ui.bases.input.FieldViewModel.ConditionChecker> component16() {
        return null;
    }
    
    private final java.util.Map<java.lang.Integer, java.lang.Integer> component17() {
        return null;
    }
    
    private final kotlin.jvm.functions.Function0<kotlin.Unit> component18() {
        return null;
    }
    
    private final kotlin.jvm.functions.Function0<kotlin.Unit> component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ua.mycredit.mycredit.ui.bases.input.FieldViewModel copy(int hint, int inputType, int maxLines, int minLines, int maxLength, boolean optional, int requiredError, boolean counterEnabled, int gravity, boolean hintStatic, @org.jetbrains.annotations.NotNull()
    java.util.Set<? extends android.text.InputFilter> additionalFilters, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> onFocused, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> onFocusLost, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick, @org.jetbrains.annotations.Nullable()
    java.lang.String availableChars, @org.jetbrains.annotations.NotNull()
    java.util.Set<ua.mycredit.mycredit.ui.bases.input.FieldViewModel.ConditionChecker> conditions, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Integer, java.lang.Integer> verificationErrorsMessages, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onImeActionDone, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onImeActionNext) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B&\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\b\b\u00a2\u0006\u0002\u0010\tR\"\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\b\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lua/mycredit/mycredit/ui/bases/input/FieldViewModel$ConditionChecker;", "", "error", "", "check", "Lkotlin/Function1;", "", "", "Lkotlin/ExtensionFunctionType;", "(ILkotlin/jvm/functions/Function1;)V", "getCheck", "()Lkotlin/jvm/functions/Function1;", "getError", "()I", "presentation_fullDebug"})
    public static final class ConditionChecker {
        private final int error = 0;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function1<java.lang.String, java.lang.Boolean> check = null;
        
        public final int getError() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<java.lang.String, java.lang.Boolean> getCheck() {
            return null;
        }
        
        public ConditionChecker(int error, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Boolean> check) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J:\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lua/mycredit/mycredit/ui/bases/input/FieldViewModel$WrongCharsFilter;", "Landroid/text/InputFilter;", "chars", "", "(Ljava/lang/String;)V", "getChars", "()Ljava/lang/String;", "filter", "", "source", "start", "", "end", "dest", "Landroid/text/Spanned;", "dstart", "dend", "presentation_fullDebug"})
    static final class WrongCharsFilter implements android.text.InputFilter {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String chars = null;
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.CharSequence filter(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence source, int start, int end, @org.jetbrains.annotations.NotNull()
        android.text.Spanned dest, int dstart, int dend) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getChars() {
            return null;
        }
        
        public WrongCharsFilter(@org.jetbrains.annotations.NotNull()
        java.lang.String chars) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lua/mycredit/mycredit/ui/bases/input/FieldViewModel$State;", "", "(Ljava/lang/String;I)V", "DISABLED", "CLICKABLE", "NORMAL", "presentation_fullDebug"})
    public static enum State {
        /*public static final*/ DISABLED /* = new DISABLED() */,
        /*public static final*/ CLICKABLE /* = new CLICKABLE() */,
        /*public static final*/ NORMAL /* = new NORMAL() */;
        
        State() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006\u00a8\u0006\b"}, d2 = {"Lua/mycredit/mycredit/ui/bases/input/FieldViewModel$Companion;", "", "()V", "fixedLengthChecker", "Lua/mycredit/mycredit/ui/bases/input/FieldViewModel$ConditionChecker;", "error", "", "minLength", "presentation_fullDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final ua.mycredit.mycredit.ui.bases.input.FieldViewModel.ConditionChecker fixedLengthChecker(int error, int minLength) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}