package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class CardBindingImpl extends CardBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.support.v7.widget.CardView mboundView0;
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView1;
    @NonNull
    private final android.widget.ViewSwitcher mboundView6;
    @NonNull
    private final android.widget.TextView mboundView7;
    @NonNull
    private final android.widget.TextView mboundView8;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public CardBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private CardBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[5]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.RadioButton) bindings[2]
            );
        this.cardNumber.setTag(null);
        this.mboundView0 = (android.support.v7.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.support.constraint.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView6 = (android.widget.ViewSwitcher) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.TextView) bindings[8];
        this.mboundView8.setTag(null);
        this.menu.setTag(null);
        this.paymentSystemLogo.setTag(null);
        this.radiobutton.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.card == variableId) {
            setCard((ua.mycredit.core.Card) variable);
        }
        else if (BR.selectable == variableId) {
            setSelectable((boolean) variable);
        }
        else if (BR.checked == variableId) {
            setChecked((boolean) variable);
        }
        else if (BR.onClick == variableId) {
            setOnClick((android.view.View.OnClickListener) variable);
        }
        else if (BR.forciblyColored == variableId) {
            setForciblyColored((boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCard(@Nullable ua.mycredit.core.Card Card) {
        this.mCard = Card;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.card);
        super.requestRebind();
    }
    public void setSelectable(boolean Selectable) {
        this.mSelectable = Selectable;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.selectable);
        super.requestRebind();
    }
    public void setChecked(boolean Checked) {
        this.mChecked = Checked;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.checked);
        super.requestRebind();
    }
    public void setOnClick(@Nullable android.view.View.OnClickListener OnClick) {
        this.mOnClick = OnClick;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.onClick);
        super.requestRebind();
    }
    public void setForciblyColored(boolean ForciblyColored) {
        this.mForciblyColored = ForciblyColored;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.forciblyColored);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        int cardVerifiedRadiobuttonAndroidColorColorPrimaryRadiobuttonAndroidColorGray = 0;
        int cardMainCardNumberAndroidColorColorPrimaryCardNumberAndroidColorGray828282 = 0;
        ua.mycredit.core.Card card = mCard;
        int cardVerifiedInt0Int1 = 0;
        boolean selectable = mSelectable;
        boolean cardJavaLangObjectNull = false;
        boolean checked = mChecked;
        java.lang.String CardNumber1 = null;
        int cardMainMboundView8AndroidColorRedMboundView8AndroidColorRedDB5C60 = 0;
        int cardKtGetPaymentIconIdCardForciblyColored = 0;
        android.graphics.drawable.Drawable cardMainMboundView1AndroidDrawableBgSelectedCardPrimaryJavaLangObjectNull = null;
        int cardMainMboundView7AndroidColorBlackMboundView7AndroidColorGray828282 = 0;
        boolean onClickJavaLangObjectNull = false;
        android.graphics.Typeface cardMainTypefaceDEFAULTBOLDTypefaceDEFAULT = null;
        java.lang.String cardMm = null;
        boolean Selectable1 = false;
        boolean CardJavaLangObjectNull1 = false;
        int cardJavaLangObjectNullInt0CardKtGetPaymentIconIdCardForciblyColored = 0;
        android.view.View.OnClickListener onClick = mOnClick;
        java.lang.String mboundView7AndroidStringFractionPatternCardMmCardYy = null;
        boolean cardMain = false;
        boolean selectableOnClickJavaLangObjectNullBooleanFalse = false;
        java.lang.String cardYy = null;
        boolean forciblyColored = mForciblyColored;
        boolean cardVerified = false;

        if ((dirtyFlags & 0x31L) != 0) {



                // read card == null
                cardJavaLangObjectNull = (card) == (null);
            if((dirtyFlags & 0x31L) != 0) {
                if(cardJavaLangObjectNull) {
                        dirtyFlags |= 0x200000L;
                }
                else {
                        dirtyFlags |= 0x100000L;
                }
            }
            if ((dirtyFlags & 0x21L) != 0) {

                    if (card != null) {
                        // read card.number
                        CardNumber1 = card.getNumber();
                        // read card.mm
                        cardMm = card.getMm();
                        // read card.main
                        cardMain = card.getMain();
                        // read card.yy
                        cardYy = card.getYy();
                        // read card.verified
                        cardVerified = card.getVerified();
                    }
                if((dirtyFlags & 0x21L) != 0) {
                    if(cardMain) {
                            dirtyFlags |= 0x200L;
                            dirtyFlags |= 0x2000L;
                            dirtyFlags |= 0x8000L;
                            dirtyFlags |= 0x20000L;
                            dirtyFlags |= 0x80000L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                            dirtyFlags |= 0x1000L;
                            dirtyFlags |= 0x4000L;
                            dirtyFlags |= 0x10000L;
                            dirtyFlags |= 0x40000L;
                    }
                }
                if((dirtyFlags & 0x21L) != 0) {
                    if(cardVerified) {
                            dirtyFlags |= 0x80L;
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                            dirtyFlags |= 0x400L;
                    }
                }
                    // read card != null
                    CardJavaLangObjectNull1 = (card) != (null);


                    // read card.main ? @android:color/colorPrimary : @android:color/gray_828282
                    cardMainCardNumberAndroidColorColorPrimaryCardNumberAndroidColorGray828282 = ((cardMain) ? (getColorFromResource(cardNumber, R.color.colorPrimary)) : (getColorFromResource(cardNumber, R.color.gray_828282)));
                    // read card.main ? @android:color/red : @android:color/red_DB5C60
                    cardMainMboundView8AndroidColorRedMboundView8AndroidColorRedDB5C60 = ((cardMain) ? (getColorFromResource(mboundView8, R.color.red)) : (getColorFromResource(mboundView8, R.color.red_DB5C60)));
                    // read card.main ? @android:drawable/bg_selected_card_primary : null
                    cardMainMboundView1AndroidDrawableBgSelectedCardPrimaryJavaLangObjectNull = ((cardMain) ? (getDrawableFromResource(mboundView1, R.drawable.bg_selected_card_primary)) : (null));
                    // read card.main ? @android:color/black : @android:color/gray_828282
                    cardMainMboundView7AndroidColorBlackMboundView7AndroidColorGray828282 = ((cardMain) ? (getColorFromResource(mboundView7, R.color.black)) : (getColorFromResource(mboundView7, R.color.gray_828282)));
                    // read card.main ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT
                    cardMainTypefaceDEFAULTBOLDTypefaceDEFAULT = ((cardMain) ? (android.graphics.Typeface.DEFAULT_BOLD) : (android.graphics.Typeface.DEFAULT));
                    // read @android:string/fraction_pattern
                    mboundView7AndroidStringFractionPatternCardMmCardYy = mboundView7.getResources().getString(R.string.fraction_pattern, cardMm, cardYy);
                    // read card.verified ? @android:color/colorPrimary : @android:color/gray
                    cardVerifiedRadiobuttonAndroidColorColorPrimaryRadiobuttonAndroidColorGray = ((cardVerified) ? (getColorFromResource(radiobutton, R.color.colorPrimary)) : (getColorFromResource(radiobutton, R.color.gray)));
                    // read card.verified ? 0 : 1
                    cardVerifiedInt0Int1 = ((cardVerified) ? (0) : (1));
            }
        }
        if ((dirtyFlags & 0x2aL) != 0) {



                // read !selectable
                Selectable1 = !selectable;
            if((dirtyFlags & 0x2aL) != 0) {
                if(Selectable1) {
                        dirtyFlags |= 0x800000L;
                }
                else {
                        dirtyFlags |= 0x400000L;
                }
            }
        }
        if ((dirtyFlags & 0x24L) != 0) {
        }
        if ((dirtyFlags & 0x28L) != 0) {
        }
        // batch finished

        if ((dirtyFlags & 0x800000L) != 0) {



                // read onClick != null
                onClickJavaLangObjectNull = (onClick) != (null);
        }
        if ((dirtyFlags & 0x100000L) != 0) {



                // read CardKt.getPaymentIconId(card, forciblyColored)
                cardKtGetPaymentIconIdCardForciblyColored = ua.mycredit.mycredit.mapping.CardKt.getPaymentIconId(card, forciblyColored);
        }

        if ((dirtyFlags & 0x31L) != 0) {

                // read card == null ? 0 : CardKt.getPaymentIconId(card, forciblyColored)
                cardJavaLangObjectNullInt0CardKtGetPaymentIconIdCardForciblyColored = ((cardJavaLangObjectNull) ? (0) : (cardKtGetPaymentIconIdCardForciblyColored));
        }
        if ((dirtyFlags & 0x2aL) != 0) {

                // read !selectable ? onClick != null : false
                selectableOnClickJavaLangObjectNullBooleanFalse = ((Selectable1) ? (onClickJavaLangObjectNull) : (false));
        }
        // batch finished
        if ((dirtyFlags & 0x21L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.cardNumber, CardNumber1);
            this.cardNumber.setTextColor(cardMainCardNumberAndroidColorColorPrimaryCardNumberAndroidColorGray828282);
            this.cardNumber.setTypeface(cardMainTypefaceDEFAULTBOLDTypefaceDEFAULT);
            this.mboundView0.setVisibility(ua.mycredit.mycredit.ui.BindingAdaptersKt.booleanToVisibility(CardJavaLangObjectNull1));
            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView1, cardMainMboundView1AndroidDrawableBgSelectedCardPrimaryJavaLangObjectNull);
            this.mboundView6.setDisplayedChild(cardVerifiedInt0Int1);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, mboundView7AndroidStringFractionPatternCardMmCardYy);
            this.mboundView7.setTextColor(cardMainMboundView7AndroidColorBlackMboundView7AndroidColorGray828282);
            this.mboundView7.setTypeface(cardMainTypefaceDEFAULTBOLDTypefaceDEFAULT);
            this.mboundView8.setTextColor(cardMainMboundView8AndroidColorRedMboundView8AndroidColorRedDB5C60);
            // api target 21
            if(getBuildSdkInt() >= 21) {

                this.radiobutton.setButtonTintList(android.databinding.adapters.Converters.convertColorToColorStateList(cardVerifiedRadiobuttonAndroidColorColorPrimaryRadiobuttonAndroidColorGray));
            }
        }
        if ((dirtyFlags & 0x28L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(onClick);
            this.menu.setOnClickListener(onClick);
        }
        if ((dirtyFlags & 0x2aL) != 0) {
            // api target 1

            this.menu.setVisibility(ua.mycredit.mycredit.ui.BindingAdaptersKt.booleanToVisibility(selectableOnClickJavaLangObjectNullBooleanFalse));
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            this.paymentSystemLogo.setImageResource(cardJavaLangObjectNullInt0CardKtGetPaymentIconIdCardForciblyColored);
        }
        if ((dirtyFlags & 0x24L) != 0) {
            // api target 1

            android.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.radiobutton, checked);
        }
        if ((dirtyFlags & 0x22L) != 0) {
            // api target 1

            this.radiobutton.setVisibility(ua.mycredit.mycredit.ui.BindingAdaptersKt.booleanToVisibility(selectable));
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): card
        flag 1 (0x2L): selectable
        flag 2 (0x3L): checked
        flag 3 (0x4L): onClick
        flag 4 (0x5L): forciblyColored
        flag 5 (0x6L): null
        flag 6 (0x7L): card.verified ? @android:color/colorPrimary : @android:color/gray
        flag 7 (0x8L): card.verified ? @android:color/colorPrimary : @android:color/gray
        flag 8 (0x9L): card.main ? @android:color/colorPrimary : @android:color/gray_828282
        flag 9 (0xaL): card.main ? @android:color/colorPrimary : @android:color/gray_828282
        flag 10 (0xbL): card.verified ? 0 : 1
        flag 11 (0xcL): card.verified ? 0 : 1
        flag 12 (0xdL): card.main ? @android:color/red : @android:color/red_DB5C60
        flag 13 (0xeL): card.main ? @android:color/red : @android:color/red_DB5C60
        flag 14 (0xfL): card.main ? @android:drawable/bg_selected_card_primary : null
        flag 15 (0x10L): card.main ? @android:drawable/bg_selected_card_primary : null
        flag 16 (0x11L): card.main ? @android:color/black : @android:color/gray_828282
        flag 17 (0x12L): card.main ? @android:color/black : @android:color/gray_828282
        flag 18 (0x13L): card.main ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT
        flag 19 (0x14L): card.main ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT
        flag 20 (0x15L): card == null ? 0 : CardKt.getPaymentIconId(card, forciblyColored)
        flag 21 (0x16L): card == null ? 0 : CardKt.getPaymentIconId(card, forciblyColored)
        flag 22 (0x17L): !selectable ? onClick != null : false
        flag 23 (0x18L): !selectable ? onClick != null : false
    flag mapping end*/
    //end
}