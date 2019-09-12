package ua.mycredit.mycredit.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u00b0\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007\u001a\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0007\u001a\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0007\u001a \u0010\u000e\u001a\u00020\t*\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007\u001a\u0014\u0010\u0014\u001a\u00020\t*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0006H\u0007\u001a\u0014\u0010\u0017\u001a\u00020\t*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0004H\u0007\u001a\u0014\u0010\u001a\u001a\u00020\t*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0004H\u0007\u001a\u0014\u0010\u001d\u001a\u00020\t*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0006H\u0007\u001a\f\u0010 \u001a\u00020\u0004*\u00020!H\u0007\u001a\f\u0010\"\u001a\u00020\u0006*\u00020\u0015H\u0007\u001a\f\u0010#\u001a\u00020\u0004*\u00020\u0018H\u0007\u001a\f\u0010$\u001a\u00020\u0004*\u00020\u001bH\u0007\u001a\f\u0010%\u001a\u00020\u0006*\u00020\u001eH\u0007\u001a\u0016\u0010&\u001a\u00020\t*\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0007\u001a\u001e\u0010*\u001a\u0004\u0018\u00010\u0001*\u00020+2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u0014\u0010-\u001a\u00020\t*\u00020.2\u0006\u0010/\u001a\u00020\u0006H\u0007\u001a\u000e\u00100\u001a\u0004\u0018\u00010\u0011*\u00020\u000fH\u0007\u001a\u000e\u00101\u001a\u0004\u0018\u000102*\u00020+H\u0007\u001a\u000e\u00103\u001a\u0004\u0018\u000104*\u00020+H\u0007\u001a$\u00105\u001a\n 6*\u0004\u0018\u00010\u00010\u0001*\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0002\u001a!\u0010<\u001a\u00020\t*\u00020.2\u000e\u0010=\u001a\n\u0012\u0004\u0012\u00020?\u0018\u00010>H\u0007\u00a2\u0006\u0002\u0010@\u001a\u0016\u0010A\u001a\u00020\t*\u00020B2\b\u0010C\u001a\u0004\u0018\u00010DH\u0007\u001a\u0016\u0010E\u001a\u00020\t*\u00020.2\b\u00108\u001a\u0004\u0018\u000109H\u0007\u001a\u0014\u0010F\u001a\u00020\t*\u00020.2\u0006\u0010G\u001a\u00020HH\u0007\u001a\u0016\u0010I\u001a\u00020\t*\u00020.2\b\u00108\u001a\u0004\u0018\u000109H\u0007\u001a \u0010J\u001a\u00020\t*\u00020.2\b\u00108\u001a\u0004\u0018\u0001092\b\u0010:\u001a\u0004\u0018\u00010;H\u0007\u001a\u001e\u0010K\u001a\u00020\t*\u00020!2\u0006\u0010L\u001a\u00020\u00042\b\u0010M\u001a\u0004\u0018\u00010\u0013H\u0007\u001aL\u0010N\u001a\u00020\t*\u00020.2\u0006\u0010O\u001a\u00020\u00012\u0006\u0010P\u001a\u00020\u00012\u0006\u0010Q\u001a\u00020\u00062\b\u0010R\u001a\u0004\u0018\u00010S2\b\b\u0002\u0010T\u001a\u00020\u00042\b\b\u0002\u0010U\u001a\u00020\u00042\b\b\u0002\u0010V\u001a\u00020\u0004H\u0007\u001a\u0014\u0010W\u001a\u00020\t*\u00020\u001b2\u0006\u0010X\u001a\u00020\u0006H\u0007\u001a\u001c\u0010Y\u001a\u00020\t*\u00020.2\u0006\u0010Z\u001a\u00020\u00012\u0006\u0010[\u001a\u00020\u0006H\u0007\u001a\u0016\u0010\\\u001a\u00020\t*\u00020.2\b\u0010]\u001a\u0004\u0018\u00010^H\u0007\u001a\u0016\u0010_\u001a\u00020\t*\u00020`2\b\u00108\u001a\u0004\u0018\u000109H\u0007\u001a\u0016\u0010a\u001a\u00020\t*\u00020.2\b\u00108\u001a\u0004\u0018\u000109H\u0007\u001a\u0016\u0010b\u001a\u00020\t*\u00020\u00152\b\u0010c\u001a\u0004\u0018\u00010\u0013H\u0007\u001a \u0010d\u001a\u00020\t*\u00020.2\b\u0010e\u001a\u0004\u0018\u00010f2\b\u0010g\u001a\u0004\u0018\u00010\u0001H\u0007\u001a \u0010h\u001a\u00020\t*\u00020.2\b\u00108\u001a\u0004\u0018\u0001092\b\u0010i\u001a\u0004\u0018\u00010jH\u0007\u001a\u0014\u0010k\u001a\u00020\t*\u00020l2\u0006\u0010m\u001a\u00020\u0006H\u0007\u001a\u0016\u0010n\u001a\u00020\t*\u00020\u00182\b\u0010c\u001a\u0004\u0018\u00010\u0013H\u0007\u001a \u0010o\u001a\u00020\t*\u00020+2\b\u0010\u0010\u001a\u0004\u0018\u0001022\b\u0010M\u001a\u0004\u0018\u00010\u0013H\u0007\u001a\u001e\u0010p\u001a\u00020\t*\u00020.2\u0006\u0010q\u001a\u00020\u00012\b\u0010i\u001a\u0004\u0018\u00010jH\u0007\u001a \u0010r\u001a\u00020\t*\u00020+2\b\u0010\u0010\u001a\u0004\u0018\u0001042\b\u0010M\u001a\u0004\u0018\u00010\u0013H\u0007\u001a\u001c\u0010s\u001a\u00020\t*\u00020l2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u001c\u0010s\u001a\u00020\t*\u00020.2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0014\u0010t\u001a\u00020\t*\u00020u2\u0006\u0010v\u001a\u00020\u0006H\u0007\u001a\u001e\u0010w\u001a\u00020\t*\u00020.2\b\u0010x\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0014\u0010y\u001a\u00020\t*\u00020.2\u0006\u0010z\u001a\u00020\u0001H\u0007\u001a\u0016\u0010{\u001a\u00020\t*\u00020|2\b\u00108\u001a\u0004\u0018\u000109H\u0007\u001a\u001c\u0010}\u001a\u00020\t*\u00020l2\u0006\u0010~\u001a\u00020\u00062\u0006\u0010\u007f\u001a\u00020\u0004H\u0007\u001a\u0016\u0010\u0080\u0001\u001a\u00020\t*\u00020.2\u0007\u0010\u0081\u0001\u001a\u00020\u0006H\u0007\u001a%\u0010\u0082\u0001\u001a\u00020\t*\u00020.2\n\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0084\u00012\n\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0086\u0001H\u0007\u001a\u0017\u0010\u0087\u0001\u001a\u00020\t*\u00020\u001b2\b\u0010c\u001a\u0004\u0018\u00010\u0013H\u0007\u001a\u0018\u0010\u0088\u0001\u001a\u00020\t*\u00030\u0089\u00012\b\u00108\u001a\u0004\u0018\u000109H\u0007\u001a\u0016\u0010\u008a\u0001\u001a\u00020\t*\u00020.2\u0007\u0010\u008b\u0001\u001a\u00020\u0001H\u0007\u001a\u0016\u0010\u008c\u0001\u001a\u00020\t*\u00020.2\u0007\u0010\u008d\u0001\u001a\u00020\u0006H\u0007\u001a\u0016\u0010\u008e\u0001\u001a\u00020\t*\u00020.2\u0007\u0010\u008f\u0001\u001a\u00020\u0006H\u0007\u001a\u0018\u0010\u008e\u0001\u001a\u00020\t*\u00020.2\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0001H\u0007\u001a\u0016\u0010\u0090\u0001\u001a\u00020\t*\u00020.2\u0007\u0010\u008f\u0001\u001a\u00020\u0006H\u0007\u001a\u0018\u0010\u0090\u0001\u001a\u00020\t*\u00020.2\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0001H\u0007\u001a \u0010\u0091\u0001\u001a\u00020\t*\u00020.2\u0007\u0010\u008f\u0001\u001a\u00020\u00062\b\u0010i\u001a\u0004\u0018\u00010jH\u0002\u001a\u0016\u0010\u0092\u0001\u001a\u00020\t*\u00020|2\u0007\u0010\u0093\u0001\u001a\u00020\u0006H\u0007\u001a*\u0010\u0094\u0001\u001a\u00020\t*\u00020.2\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u00012\u0007\u0010\u0095\u0001\u001a\u00020\u00062\u0007\u0010\u0096\u0001\u001a\u00020\u0006H\u0007\u001a\u0017\u0010\u0094\u0001\u001a\u00020\t*\u00020.2\b\u00108\u001a\u0004\u0018\u000109H\u0007\u001a\u0016\u0010\u0097\u0001\u001a\u00020\t*\u00020.2\u0007\u0010\u0098\u0001\u001a\u00020\u0001H\u0007\u001a\u0017\u0010\u0099\u0001\u001a\u00020\t*\u00020.2\b\u0010\u009a\u0001\u001a\u00030\u009b\u0001H\u0007\u001a/\u0010\u009c\u0001\u001a\u00020\t*\u00020\u001e2\b\u0010c\u001a\u0004\u0018\u00010\u00132\n\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u009e\u00012\n\u0010\u009f\u0001\u001a\u0005\u0018\u00010\u00a0\u0001H\u0007\u001a\u0019\u0010\u00a1\u0001\u001a\u00020\t*\u00020`2\n\u0010\u00a2\u0001\u001a\u0005\u0018\u00010\u00a3\u0001H\u0007\u001a\u0018\u0010\u00a4\u0001\u001a\u00020\t*\u00020.2\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0001H\u0007\u00a8\u0006\u00a5\u0001"}, d2 = {"addStar", "", "hint", "optional", "", "booleanToVisibility", "", "visible", "openCloseChatAnimation", "", "button", "Landroid/support/design/widget/FloatingActionButton;", "boolean", "showHideButtonChat", "doMoveCursorToNext", "Landroid/widget/EditText;", "command", "Lua/mycredit/mycredit/ui/MoveCursorToEnd;", "onChanged", "Landroid/databinding/InverseBindingListener;", "doSetCurrentItem", "Landroid/support/v4/view/ViewPager;", "currentItem", "doSetExpanded", "Lnet/cachapa/expandablelayout/ExpandableLayout;", "expanded", "doSetRefreshing", "Landroid/support/v4/widget/SwipeRefreshLayout;", "refreshing", "doSetValue", "Lua/mycredit/mycredit/ui/custom/CircleSeekBar;", "value", "getCheckedSafe", "Landroid/widget/CheckBox;", "getCurrentItemAlias", "getExpanded", "getRefreshing", "getValue", "loadByFile", "Lcom/github/barteksc/pdfviewer/PDFView;", "file", "Ljava/io/File;", "makeHint", "Landroid/view/View;", "hintId", "nameByStatusCode", "Landroid/widget/TextView;", "code", "notifyCursorMovedToNext", "notifyFadeOutStarted", "Lua/mycredit/mycredit/ui/FadeOut;", "notifyFocusRequested", "Lua/mycredit/mycredit/ui/RequestFocus;", "profileNameByStatus", "kotlin.jvm.PlatformType", "Landroid/content/Context;", "status", "Lua/mycredit/core/Status;", "profile", "Lua/mycredit/core/Profile;", "safeSetFilters", "filters", "", "Landroid/text/InputFilter;", "(Landroid/widget/TextView;[Landroid/text/InputFilter;)V", "setAdapter", "Lcom/aurelhubert/ahbottomnavigation/AHBottomNavigation;", "adapter", "Lcom/aurelhubert/ahbottomnavigation/AHBottomNavigationAdapter;", "setAdditionalParams", "setAmountWithCurrency", "amount", "", "setArcCreditAmountValue", "setBriefDescription", "setCheckedSafe", "checked", "attrChange", "setClickableFragment", "plainText", "clickableText", "highlightColor", "highlightClick", "Landroid/view/View$OnClickListener;", "underline", "bold", "asHtml", "setColorSchemeColor", "color", "setColoredBulletText", "textBullet", "dotColor", "setCreditAdditionTitle", "addition", "Lua/mycredit/core/ContractAddition;", "setCreditStatusActionState", "Landroid/widget/Button;", "setCreditStatusName", "setCurrentItemAttrChanged", "attrChanged", "setDateTime", "dateTime", "Lorg/joda/time/DateTime;", "style", "setDetailedDescription", "onPhoneClick", "Lua/mycredit/mycredit/ui/OnPhoneClick;", "setError", "Landroid/support/design/widget/TextInputLayout;", "errorId", "setExpandedAttrChanged", "setFadeOut", "setFaq", "question", "setHasFocusAttrChangedListener", "setHint", "setHintColor", "Lbr/com/sapereaude/maskedEditText/MaskedEditText;", "hintColor", "setHintStr", "hintStr", "setHtmlText", "htmlText", "setIcon", "Landroid/widget/ImageView;", "setInputType", "inputType", "passwordToggleEnabled", "setMoney", "money", "setPaymentPurpose", "credit", "Lua/mycredit/core/Credit;", "repaymentType", "Lua/mycredit/mycredit/ui/profile/repayloan/RepaymentType;", "setRefreshingAttrChanged", "setStatus", "Lua/mycredit/mycredit/ui/custom/credit/TitledSeekArc;", "setStrikeText", "strikeText", "setTextColorResource", "colorId", "setTextOrGone", "text", "setTextOrInvisible", "setTextWithPhone", "setTintResource", "tintColorRes", "setTitle", "titleIndex", "titlesRes", "setUnderlineText", "sentence", "setUntil", "calendar", "Ljava/util/Calendar;", "setValueAttrChanged", "onChangedListener", "Lua/mycredit/mycredit/ui/custom/CircleSeekBar$OnSeekBarChangedListener;", "onChangingListener", "Lua/mycredit/mycredit/ui/custom/CircleSeekBar$OnSeekBarChangingListener;", "setupByProlongation", "prolongation", "Lua/mycredit/core/Prolongation;", "textOrInvisible", "presentation_fullDebug"})
public final class BindingAdaptersKt {
    
    @android.databinding.BindingConversion()
    public static final int booleanToVisibility(boolean visible) {
        return 0;
    }
    
    @android.databinding.BindingAdapter(requireAll = false, value = {"requestFocus", "requestFocusAttrChanged"})
    public static final void setHasFocusAttrChangedListener(@org.jetbrains.annotations.NotNull()
    android.view.View $receiver, @org.jetbrains.annotations.Nullable()
    ua.mycredit.mycredit.ui.RequestFocus command, @org.jetbrains.annotations.Nullable()
    android.databinding.InverseBindingListener attrChange) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.Suppress(names = {"unused"})
    @android.databinding.InverseBindingAdapter(attribute = "requestFocus", event = "requestFocusAttrChanged")
    public static final ua.mycredit.mycredit.ui.RequestFocus notifyFocusRequested(@org.jetbrains.annotations.NotNull()
    android.view.View $receiver) {
        return null;
    }
    
    @android.databinding.BindingAdapter(requireAll = false, value = {"fadeOut", "fadeOutAttrChanged"})
    public static final void setFadeOut(@org.jetbrains.annotations.NotNull()
    android.view.View $receiver, @org.jetbrains.annotations.Nullable()
    ua.mycredit.mycredit.ui.FadeOut command, @org.jetbrains.annotations.Nullable()
    android.databinding.InverseBindingListener attrChange) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.Suppress(names = {"unused"})
    @android.databinding.InverseBindingAdapter(attribute = "fadeOut", event = "fadeOutAttrChanged")
    public static final ua.mycredit.mycredit.ui.FadeOut notifyFadeOutStarted(@org.jetbrains.annotations.NotNull()
    android.view.View $receiver) {
        return null;
    }
    
    @android.databinding.BindingAdapter(value = {"tintRes"})
    public static final void setTintResource(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $receiver, int tintColorRes) {
    }
    
    @android.databinding.BindingAdapter(value = {"hintId", "optional"})
    public static final void setHint(@org.jetbrains.annotations.NotNull()
    android.support.design.widget.TextInputLayout $receiver, int hintId, boolean optional) {
    }
    
    @android.databinding.BindingAdapter(value = {"hintId", "optional"})
    public static final void setHint(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver, int hintId, boolean optional) {
    }
    
    @android.databinding.BindingAdapter(value = {"hintStr", "optional"})
    public static final void setHintStr(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver, @org.jetbrains.annotations.Nullable()
    java.lang.String hintStr, boolean optional) {
    }
    
    private static final java.lang.String makeHint(@org.jetbrains.annotations.NotNull()
    android.view.View $receiver, int hintId, boolean optional) {
        return null;
    }
    
    private static final java.lang.String addStar(java.lang.String hint, boolean optional) {
        return null;
    }
    
    @android.databinding.BindingAdapter(value = {"error"})
    public static final void setError(@org.jetbrains.annotations.NotNull()
    android.support.design.widget.TextInputLayout $receiver, int errorId) {
    }
    
    @android.databinding.BindingAdapter(value = {"inputType", "passwordToggleEnabled"})
    public static final void setInputType(@org.jetbrains.annotations.NotNull()
    android.support.design.widget.TextInputLayout $receiver, int inputType, boolean passwordToggleEnabled) {
    }
    
    @android.databinding.BindingAdapter(value = {"textOrGone"})
    public static final void setTextOrGone(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver, int text) {
    }
    
    @android.databinding.BindingAdapter(value = {"textOrInvisible"})
    public static final void setTextOrInvisible(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver, int text) {
    }
    
    @android.databinding.BindingAdapter(value = {"textOrInvisible"})
    public static final void textOrInvisible(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver, @org.jetbrains.annotations.Nullable()
    java.lang.String text) {
    }
    
    @android.databinding.BindingAdapter(value = {"openCloseChatAnimation"})
    public static final void openCloseChatAnimation(@org.jetbrains.annotations.NotNull()
    android.support.design.widget.FloatingActionButton button, boolean p1_32355860) {
    }
    
    @android.databinding.BindingAdapter(value = {"showHideButtonChat"})
    public static final void showHideButtonChat(@org.jetbrains.annotations.NotNull()
    android.support.design.widget.FloatingActionButton button, boolean p1_32355860) {
    }
    
    @android.databinding.BindingAdapter(value = {"textOrGone"})
    public static final void setTextOrGone(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver, @org.jetbrains.annotations.Nullable()
    java.lang.String text) {
    }
    
    @android.databinding.BindingAdapter(value = {"textOrInvisible"})
    public static final void setTextOrInvisible(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver, @org.jetbrains.annotations.Nullable()
    java.lang.String text) {
    }
    
    @android.databinding.BindingAdapter(value = {"filters"})
    public static final void safeSetFilters(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver, @org.jetbrains.annotations.Nullable()
    android.text.InputFilter[] filters) {
    }
    
    @android.databinding.BindingAdapter(requireAll = false, value = {"plainText", "clickableText", "highlightColor", "highlightClick", "underline", "bold", "asHtml"})
    public static final void setClickableFragment(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String plainText, @org.jetbrains.annotations.NotNull()
    java.lang.String clickableText, int highlightColor, @org.jetbrains.annotations.Nullable()
    android.view.View.OnClickListener highlightClick, boolean underline, boolean bold, boolean asHtml) {
    }
    
    @android.databinding.BindingAdapter(value = {"bulletText", "bulletColor"})
    public static final void setColoredBulletText(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String textBullet, int dotColor) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.Suppress(names = {"unused"})
    @android.databinding.InverseBindingAdapter(attribute = "moveCursorToEnd", event = "moveCursorToEndAttrChanged")
    public static final ua.mycredit.mycredit.ui.MoveCursorToEnd notifyCursorMovedToNext(@org.jetbrains.annotations.NotNull()
    android.widget.EditText $receiver) {
        return null;
    }
    
    @android.databinding.BindingAdapter(requireAll = false, value = {"moveCursorToEnd", "moveCursorToEndAttrChanged"})
    public static final void doMoveCursorToNext(@org.jetbrains.annotations.NotNull()
    android.widget.EditText $receiver, @org.jetbrains.annotations.Nullable()
    ua.mycredit.mycredit.ui.MoveCursorToEnd command, @org.jetbrains.annotations.Nullable()
    android.databinding.InverseBindingListener onChanged) {
    }
    
    @android.databinding.BindingAdapter(value = {"text", "titleIndex", "titlesRes"})
    public static final void setTitle(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver, @org.jetbrains.annotations.Nullable()
    java.lang.String text, int titleIndex, int titlesRes) {
    }
    
    @android.databinding.InverseBindingAdapter(attribute = "value", event = "valueAttrChanged")
    public static final int getValue(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.ui.custom.CircleSeekBar $receiver) {
        return 0;
    }
    
    @android.databinding.BindingAdapter(value = {"value"})
    public static final void doSetValue(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.ui.custom.CircleSeekBar $receiver, int value) {
    }
    
    @android.databinding.BindingAdapter(requireAll = false, value = {"valueAttrChanged", "onValueChanged", "onValueChanging"})
    public static final void setValueAttrChanged(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.ui.custom.CircleSeekBar $receiver, @org.jetbrains.annotations.Nullable()
    android.databinding.InverseBindingListener attrChanged, @org.jetbrains.annotations.Nullable()
    ua.mycredit.mycredit.ui.custom.CircleSeekBar.OnSeekBarChangedListener onChangedListener, @org.jetbrains.annotations.Nullable()
    ua.mycredit.mycredit.ui.custom.CircleSeekBar.OnSeekBarChangingListener onChangingListener) {
    }
    
    @android.databinding.BindingAdapter(value = {"money"})
    public static final void setMoney(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver, int money) {
    }
    
    @android.databinding.BindingAdapter(value = {"until"})
    public static final void setUntil(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver, @org.jetbrains.annotations.NotNull()
    java.util.Calendar calendar) {
    }
    
    @android.databinding.BindingAdapter(value = {"strikeText"})
    public static final void setStrikeText(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String strikeText) {
    }
    
    @android.databinding.BindingAdapter(value = {"textColorResource"})
    public static final void setTextColorResource(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver, int colorId) {
    }
    
    @android.databinding.BindingAdapter(value = {"textColorHint"})
    public static final void setHintColor(@org.jetbrains.annotations.NotNull()
    br.com.sapereaude.maskedEditText.MaskedEditText $receiver, int hintColor) {
    }
    
    @android.databinding.InverseBindingAdapter(attribute = "refreshing", event = "refreshingAttrChanged")
    public static final boolean getRefreshing(@org.jetbrains.annotations.NotNull()
    android.support.v4.widget.SwipeRefreshLayout $receiver) {
        return false;
    }
    
    @android.databinding.BindingAdapter(value = {"refreshingAttrChanged"})
    public static final void setRefreshingAttrChanged(@org.jetbrains.annotations.NotNull()
    android.support.v4.widget.SwipeRefreshLayout $receiver, @org.jetbrains.annotations.Nullable()
    android.databinding.InverseBindingListener attrChanged) {
    }
    
    @android.databinding.BindingAdapter(value = {"refreshing"})
    public static final void doSetRefreshing(@org.jetbrains.annotations.NotNull()
    android.support.v4.widget.SwipeRefreshLayout $receiver, boolean refreshing) {
    }
    
    @android.databinding.BindingAdapter(value = {"colorSchemeColor"})
    public static final void setColorSchemeColor(@org.jetbrains.annotations.NotNull()
    android.support.v4.widget.SwipeRefreshLayout $receiver, int color) {
    }
    
    @android.databinding.InverseBindingAdapter(attribute = "currentItem", event = "currentItemAttrChanged")
    public static final int getCurrentItemAlias(@org.jetbrains.annotations.NotNull()
    android.support.v4.view.ViewPager $receiver) {
        return 0;
    }
    
    @android.databinding.BindingAdapter(value = {"currentItemAttrChanged"})
    public static final void setCurrentItemAttrChanged(@org.jetbrains.annotations.NotNull()
    android.support.v4.view.ViewPager $receiver, @org.jetbrains.annotations.Nullable()
    android.databinding.InverseBindingListener attrChanged) {
    }
    
    @android.databinding.BindingAdapter(value = {"currentItem"})
    public static final void doSetCurrentItem(@org.jetbrains.annotations.NotNull()
    android.support.v4.view.ViewPager $receiver, int currentItem) {
    }
    
    @android.databinding.BindingAdapter(value = {"adapter"})
    public static final void setAdapter(@org.jetbrains.annotations.NotNull()
    com.aurelhubert.ahbottomnavigation.AHBottomNavigation $receiver, @org.jetbrains.annotations.Nullable()
    com.aurelhubert.ahbottomnavigation.AHBottomNavigationAdapter adapter) {
    }
    
    @kotlin.Suppress(names = {"deprecation"})
    @android.databinding.BindingAdapter(value = {"htmlText"})
    public static final void setHtmlText(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String htmlText) {
    }
    
    @android.databinding.BindingAdapter(requireAll = false, value = {"checkedSafe", "checkedSafeAttrChanged"})
    public static final void setCheckedSafe(@org.jetbrains.annotations.NotNull()
    android.widget.CheckBox $receiver, boolean checked, @org.jetbrains.annotations.Nullable()
    android.databinding.InverseBindingListener attrChange) {
    }
    
    @android.databinding.InverseBindingAdapter(attribute = "checkedSafe", event = "checkedSafeAttrChanged")
    public static final boolean getCheckedSafe(@org.jetbrains.annotations.NotNull()
    android.widget.CheckBox $receiver) {
        return false;
    }
    
    @android.databinding.InverseBindingAdapter(attribute = "expanded", event = "expandedAttrChanged")
    public static final boolean getExpanded(@org.jetbrains.annotations.NotNull()
    net.cachapa.expandablelayout.ExpandableLayout $receiver) {
        return false;
    }
    
    @android.databinding.BindingAdapter(value = {"expandedAttrChanged"})
    public static final void setExpandedAttrChanged(@org.jetbrains.annotations.NotNull()
    net.cachapa.expandablelayout.ExpandableLayout $receiver, @org.jetbrains.annotations.Nullable()
    android.databinding.InverseBindingListener attrChanged) {
    }
    
    @android.databinding.BindingAdapter(value = {"expanded"})
    public static final void doSetExpanded(@org.jetbrains.annotations.NotNull()
    net.cachapa.expandablelayout.ExpandableLayout $receiver, boolean expanded) {
    }
    
    @android.databinding.BindingAdapter(value = {"statusParams"})
    public static final void setStatus(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.ui.custom.credit.TitledSeekArc $receiver, @org.jetbrains.annotations.Nullable()
    ua.mycredit.core.Status status) {
    }
    
    @android.databinding.BindingAdapter(value = {"creditStatusName"})
    public static final void setCreditStatusName(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver, @org.jetbrains.annotations.Nullable()
    ua.mycredit.core.Status status) {
    }
    
    @android.databinding.BindingAdapter(value = {"creditStatusTitle"})
    public static final void setTitle(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver, @org.jetbrains.annotations.Nullable()
    ua.mycredit.core.Status status) {
    }
    
    @android.databinding.BindingAdapter(value = {"creditAmountByStatus"})
    public static final void setArcCreditAmountValue(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver, @org.jetbrains.annotations.Nullable()
    ua.mycredit.core.Status status) {
    }
    
    @kotlin.Suppress(names = {"WhenWithOnlyElse", "UNUSED_EXPRESSION", "UNREACHABLE_CODE"})
    @android.databinding.BindingAdapter(value = {"statusFooter"})
    public static final void setAdditionalParams(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver, @org.jetbrains.annotations.Nullable()
    ua.mycredit.core.Status status) {
    }
    
    @android.databinding.BindingAdapter(requireAll = false, value = {"dateTime", "dateTimeStyle"})
    public static final void setDateTime(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver, @org.jetbrains.annotations.Nullable()
    org.joda.time.DateTime dateTime, @org.jetbrains.annotations.Nullable()
    java.lang.String style) {
    }
    
    @android.databinding.BindingAdapter(value = {"loadByFile"})
    public static final void loadByFile(@org.jetbrains.annotations.NotNull()
    com.github.barteksc.pdfviewer.PDFView $receiver, @org.jetbrains.annotations.Nullable()
    java.io.File file) {
    }
    
    @android.databinding.BindingAdapter(value = {"iconByStatus"})
    public static final void setIcon(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $receiver, @org.jetbrains.annotations.Nullable()
    ua.mycredit.core.Status status) {
    }
    
    @android.databinding.BindingAdapter(value = {"underlineText"})
    public static final void setUnderlineText(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String sentence) {
    }
    
    @android.databinding.BindingAdapter(value = {"briefDescriptionOf", "profile"})
    public static final void setBriefDescription(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver, @org.jetbrains.annotations.Nullable()
    ua.mycredit.core.Status status, @org.jetbrains.annotations.Nullable()
    ua.mycredit.core.Profile profile) {
    }
    
    private static final java.lang.String profileNameByStatus(@org.jetbrains.annotations.NotNull()
    android.content.Context $receiver, ua.mycredit.core.Status status, ua.mycredit.core.Profile profile) {
        return null;
    }
    
    @android.databinding.BindingAdapter(value = {"answer", "onPhoneClick"})
    public static final void setFaq(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String question, @org.jetbrains.annotations.Nullable()
    ua.mycredit.mycredit.ui.OnPhoneClick onPhoneClick) {
    }
    
    @android.databinding.BindingAdapter(value = {"detailedDescription", "onPhoneClick"})
    public static final void setDetailedDescription(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver, @org.jetbrains.annotations.Nullable()
    ua.mycredit.core.Status status, @org.jetbrains.annotations.Nullable()
    ua.mycredit.mycredit.ui.OnPhoneClick onPhoneClick) {
    }
    
    private static final void setTextWithPhone(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver, int text, ua.mycredit.mycredit.ui.OnPhoneClick onPhoneClick) {
    }
    
    @android.databinding.BindingAdapter(value = {"statusActionButtonParams"})
    public static final void setCreditStatusActionState(@org.jetbrains.annotations.NotNull()
    android.widget.Button $receiver, @org.jetbrains.annotations.Nullable()
    ua.mycredit.core.Status status) {
    }
    
    @android.databinding.BindingAdapter(value = {"amountWithCurrency"})
    public static final void setAmountWithCurrency(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver, double amount) {
    }
    
    @android.databinding.BindingAdapter(value = {"contractAdditionTitle"})
    public static final void setCreditAdditionTitle(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver, @org.jetbrains.annotations.Nullable()
    ua.mycredit.core.ContractAddition addition) {
    }
    
    @android.databinding.BindingAdapter(value = {"paymentPurpose", "repaymentType"})
    public static final void setPaymentPurpose(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver, @org.jetbrains.annotations.Nullable()
    ua.mycredit.core.Credit credit, @org.jetbrains.annotations.Nullable()
    ua.mycredit.mycredit.ui.profile.repayloan.RepaymentType repaymentType) {
    }
    
    @android.databinding.BindingAdapter(value = {"statusBadge"})
    public static final void nameByStatusCode(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver, int code) {
    }
    
    @android.databinding.BindingAdapter(value = {"prolongationParams"})
    public static final void setupByProlongation(@org.jetbrains.annotations.NotNull()
    android.widget.Button $receiver, @org.jetbrains.annotations.Nullable()
    ua.mycredit.core.Prolongation prolongation) {
    }
}