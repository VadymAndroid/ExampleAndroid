package ua.mycredit.mycredit.internal.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009e\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0007H\'J\b\u0010\b\u001a\u00020\tH\'J\b\u0010\n\u001a\u00020\u000bH\'J\b\u0010\f\u001a\u00020\rH\'J\b\u0010\u000e\u001a\u00020\u000fH\'J\b\u0010\u0010\u001a\u00020\u0011H\'J\b\u0010\u0012\u001a\u00020\u0013H\'J\b\u0010\u0014\u001a\u00020\u0015H\'J\b\u0010\u0016\u001a\u00020\u0017H\'J\b\u0010\u0018\u001a\u00020\u0019H\'J\b\u0010\u001a\u001a\u00020\u001bH\'J\b\u0010\u001c\u001a\u00020\u001dH\'J\b\u0010\u001e\u001a\u00020\u001fH\'J\b\u0010 \u001a\u00020!H\'J\b\u0010\"\u001a\u00020#H\'J\b\u0010$\u001a\u00020%H\'J\b\u0010&\u001a\u00020\'H\'J\b\u0010(\u001a\u00020)H\'J\b\u0010*\u001a\u00020+H\'J\b\u0010,\u001a\u00020-H\'J\b\u0010.\u001a\u00020/H\'J\b\u00100\u001a\u000201H\'J\b\u00102\u001a\u000203H\'J\b\u00104\u001a\u000205H\'J\b\u00106\u001a\u000207H\'J\b\u00108\u001a\u000209H\'J\b\u0010:\u001a\u00020;H\'J\b\u0010<\u001a\u00020=H\'J\b\u0010>\u001a\u00020?H\'J\b\u0010@\u001a\u00020AH\'J\b\u0010B\u001a\u00020CH\'J\b\u0010D\u001a\u00020EH\'J\b\u0010F\u001a\u00020GH\'J\b\u0010H\u001a\u00020IH\'J\b\u0010J\u001a\u00020KH\'J\b\u0010L\u001a\u00020MH\'J\b\u0010N\u001a\u00020OH\'J\b\u0010P\u001a\u00020QH\'J\b\u0010R\u001a\u00020SH\'J\b\u0010T\u001a\u00020UH\'J\b\u0010V\u001a\u00020WH\'J\b\u0010X\u001a\u00020YH\'J\b\u0010Z\u001a\u00020[H\'J\b\u0010\\\u001a\u00020]H\'\u00a8\u0006^"}, d2 = {"Lua/mycredit/mycredit/internal/di/modules/FragmentsModule;", "", "agreementFragment", "Lua/mycredit/mycredit/ui/profile/credit/AgreementFragment;", "bankFragment", "Lua/mycredit/mycredit/ui/profile/repayloan/BankFragment;", "businessmanFragment", "Lua/mycredit/mycredit/ui/authentication/registration/ocupation/BusinessmanFragment;", "calculatorDialogFragmentInjector", "Lua/mycredit/mycredit/ui/calculator/CalculatorDialogFragment;", "calculatorFragmentInjector", "Lua/mycredit/mycredit/ui/calculator/CalculatorFragment;", "cardBackFragment", "Lua/mycredit/mycredit/ui/authentication/registration/card/CardBackFragment;", "cardFragment", "Lua/mycredit/mycredit/ui/profile/repayloan/RepayByCardFragment;", "cardFrontFragment", "Lua/mycredit/mycredit/ui/authentication/registration/card/CardFrontFragment;", "cardSmsFragment", "Lua/mycredit/mycredit/ui/profile/cards/CardSmsConfirmationFragment;", "cardWebVerificationFragment", "Lua/mycredit/mycredit/ui/profile/MyCreditWebViewFragment;", "cardsFragment", "Lua/mycredit/mycredit/ui/profile/cards/CardsFragment;", "cardsPickerFragment", "Lua/mycredit/mycredit/ui/profile/repayloan/CardsPickerFragment;", "contactsFragment", "Lua/mycredit/mycredit/ui/profile/profile/contacts/ContactsFragment;", "creditFragment", "Lua/mycredit/mycredit/ui/profile/credit/StatusFragment;", "decreeFragment", "Lua/mycredit/mycredit/ui/authentication/registration/ocupation/DecreeFragment;", "editPasswordFragment", "Lua/mycredit/mycredit/ui/profile/profile/contacts/EditPasswordFragment;", "extraPersonalInfoFragmentInjector", "Lua/mycredit/mycredit/ui/authentication/registration/passport/personal/ExtraPersonalInfoFragment;", "financeFragment", "Lua/mycredit/mycredit/ui/authentication/registration/finance/FinanceFragment;", "historyFragment", "Lua/mycredit/mycredit/ui/profile/history/HistoryFragment;", "honeInputDialogFragment", "Lua/mycredit/mycredit/ui/bases/input/PhoneInputDialogFragment;", "housewifeFragment", "Lua/mycredit/mycredit/ui/authentication/registration/ocupation/HousewifeFragment;", "inputPromoCodeDialogFragment", "Lua/mycredit/mycredit/ui/calculator/InputPromoCodeDialogFragment;", "invalidFragment", "Lua/mycredit/mycredit/ui/authentication/registration/ocupation/InvalidFragment;", "newCardBackFragment", "Lua/mycredit/mycredit/ui/profile/cards/NewCardBackFragment;", "newCardFrontFragment", "Lua/mycredit/mycredit/ui/profile/cards/NewCardFrontFragment;", "passportFragment", "Lua/mycredit/mycredit/ui/authentication/registration/passport/passport/PassportFragment;", "passwordFragment", "Lua/mycredit/mycredit/ui/authentication/registration/signup/PasswordFragment;", "pensionerFragment", "Lua/mycredit/mycredit/ui/authentication/registration/ocupation/PensionerFragment;", "personalDataFragmentInjector", "Lua/mycredit/mycredit/ui/authentication/registration/passport/personal/PersonalDataFragment;", "personalInformationFragmentInjector", "Lua/mycredit/mycredit/ui/authentication/registration/passport/personal/PersonalInfoFragment;", "preferRepayAmountInputDialogFragment", "Lua/mycredit/mycredit/ui/profile/repayloan/PreferRepayAmountInputDialogFragment;", "progressDialogFragment", "Lua/mycredit/mycredit/ui/ProgressDialogFragment;", "prolongationPreferencesFragment", "Lua/mycredit/mycredit/ui/profile/profile/ProlongationPreferencesFragment;", "questionsFragment", "Lua/mycredit/mycredit/ui/profile/profile/ProfileFragment;", "resetPasswordFragment", "Lua/mycredit/mycredit/ui/authentication/ResetPasswordByPhoneFragment;", "signInFragment", "Lua/mycredit/mycredit/ui/authentication/SignInFragment;", "signUpAddressFragmentInjector", "Lua/mycredit/mycredit/ui/authentication/registration/passport/address/SignUpAddressFragment;", "signUpPhoneFragmentInjector", "Lua/mycredit/mycredit/ui/authentication/registration/phone/SignUpPhoneFragment;", "signUpSMSFragmentInjector", "Lua/mycredit/mycredit/ui/authentication/registration/sms/SignUpSMSFragment;", "studentFragment", "Lua/mycredit/mycredit/ui/authentication/registration/ocupation/StudentFragment;", "temporarilyUnemployedFragment", "Lua/mycredit/mycredit/ui/authentication/registration/ocupation/TemporarilyUnemployedFragment;", "terminalsFragment", "Lua/mycredit/mycredit/ui/profile/repayloan/TerminalsFragment;", "textInputDialogFragment", "Lua/mycredit/mycredit/ui/bases/input/TextInputDialogFragment;", "uneditablePersonalDataDialog", "Lua/mycredit/mycredit/ui/profile/profile/details/UneditablePersonalDataDialog;", "unemployedFragment", "Lua/mycredit/mycredit/ui/authentication/registration/ocupation/UnemployedFragment;", "workFragmentInjector", "Lua/mycredit/mycredit/ui/authentication/registration/ocupation/EmployedFragment;", "presentation_fullRelease"})
@dagger.Module()
public abstract interface FragmentsModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.calculator.CalculatorFragment calculatorFragmentInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.authentication.registration.phone.SignUpPhoneFragment signUpPhoneFragmentInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.authentication.registration.sms.SignUpSMSFragment signUpSMSFragmentInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.authentication.registration.signup.PasswordFragment passwordFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.authentication.registration.passport.personal.PersonalInfoFragment personalInformationFragmentInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.authentication.registration.passport.personal.ExtraPersonalInfoFragment extraPersonalInfoFragmentInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.authentication.registration.passport.personal.PersonalDataFragment personalDataFragmentInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.calculator.CalculatorDialogFragment calculatorDialogFragmentInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.authentication.registration.passport.address.SignUpAddressFragment signUpAddressFragmentInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.authentication.registration.passport.passport.PassportFragment passportFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.authentication.registration.ocupation.EmployedFragment workFragmentInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.authentication.registration.ocupation.UnemployedFragment unemployedFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.authentication.registration.ocupation.BusinessmanFragment businessmanFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.authentication.registration.ocupation.PensionerFragment pensionerFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.authentication.registration.ocupation.StudentFragment studentFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.authentication.registration.finance.FinanceFragment financeFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.authentication.registration.ocupation.InvalidFragment invalidFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.authentication.registration.ocupation.DecreeFragment decreeFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.authentication.registration.ocupation.HousewifeFragment housewifeFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.authentication.registration.ocupation.TemporarilyUnemployedFragment temporarilyUnemployedFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.authentication.registration.card.CardFrontFragment cardFrontFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.authentication.registration.card.CardBackFragment cardBackFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.bases.input.TextInputDialogFragment textInputDialogFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.bases.input.PhoneInputDialogFragment honeInputDialogFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.ProgressDialogFragment progressDialogFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.authentication.SignInFragment signInFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.profile.history.HistoryFragment historyFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.profile.profile.ProfileFragment questionsFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.profile.profile.contacts.EditPasswordFragment editPasswordFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.profile.profile.contacts.ContactsFragment contactsFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.profile.cards.CardsFragment cardsFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.profile.cards.NewCardFrontFragment newCardFrontFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.profile.cards.NewCardBackFragment newCardBackFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.profile.cards.CardSmsConfirmationFragment cardSmsFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.profile.credit.StatusFragment creditFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.calculator.InputPromoCodeDialogFragment inputPromoCodeDialogFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.profile.repayloan.TerminalsFragment terminalsFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.profile.repayloan.RepayByCardFragment cardFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.profile.repayloan.BankFragment bankFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.profile.MyCreditWebViewFragment cardWebVerificationFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.profile.credit.AgreementFragment agreementFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.profile.repayloan.CardsPickerFragment cardsPickerFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.authentication.ResetPasswordByPhoneFragment resetPasswordFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.profile.profile.ProlongationPreferencesFragment prolongationPreferencesFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.profile.profile.details.UneditablePersonalDataDialog uneditablePersonalDataDialog();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.profile.repayloan.PreferRepayAmountInputDialogFragment preferRepayAmountInputDialogFragment();
}