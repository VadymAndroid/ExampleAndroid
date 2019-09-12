package ua.mycredit.mycredit.internal.di.modules

import dagger.Module
import dagger.android.ContributesAndroidInjector
import ua.mycredit.mycredit.ui.ProgressDialogFragment
import ua.mycredit.mycredit.ui.authentication.ResetPasswordByPhoneFragment
import ua.mycredit.mycredit.ui.authentication.SignInFragment
import ua.mycredit.mycredit.ui.authentication.registration.card.CardBackFragment
import ua.mycredit.mycredit.ui.authentication.registration.card.CardFrontFragment
import ua.mycredit.mycredit.ui.authentication.registration.finance.FinanceFragment
import ua.mycredit.mycredit.ui.authentication.registration.ocupation.*
import ua.mycredit.mycredit.ui.authentication.registration.passport.address.SignUpAddressFragment
import ua.mycredit.mycredit.ui.authentication.registration.passport.passport.PassportFragment
import ua.mycredit.mycredit.ui.authentication.registration.passport.personal.ExtraPersonalInfoFragment
import ua.mycredit.mycredit.ui.authentication.registration.passport.personal.PersonalDataFragment
import ua.mycredit.mycredit.ui.authentication.registration.passport.personal.PersonalInfoFragment
import ua.mycredit.mycredit.ui.authentication.registration.phone.SignUpPhoneFragment
import ua.mycredit.mycredit.ui.authentication.registration.signup.PasswordFragment
import ua.mycredit.mycredit.ui.authentication.registration.sms.SignUpSMSFragment
import ua.mycredit.mycredit.ui.bases.input.PhoneInputDialogFragment
import ua.mycredit.mycredit.ui.bases.input.TextInputDialogFragment
import ua.mycredit.mycredit.ui.calculator.CalculatorDialogFragment
import ua.mycredit.mycredit.ui.calculator.CalculatorFragment
import ua.mycredit.mycredit.ui.calculator.InputPromoCodeDialogFragment
import ua.mycredit.mycredit.ui.profile.MyCreditWebViewFragment
import ua.mycredit.mycredit.ui.profile.cards.CardSmsConfirmationFragment
import ua.mycredit.mycredit.ui.profile.cards.CardsFragment
import ua.mycredit.mycredit.ui.profile.cards.NewCardBackFragment
import ua.mycredit.mycredit.ui.profile.cards.NewCardFrontFragment
import ua.mycredit.mycredit.ui.profile.credit.AgreementFragment
import ua.mycredit.mycredit.ui.profile.credit.StatusFragment
import ua.mycredit.mycredit.ui.profile.history.HistoryFragment
import ua.mycredit.mycredit.ui.profile.profile.ProfileFragment
import ua.mycredit.mycredit.ui.profile.profile.ProlongationPreferencesFragment
import ua.mycredit.mycredit.ui.profile.profile.contacts.ContactsFragment
import ua.mycredit.mycredit.ui.profile.profile.contacts.EditPasswordFragment
import ua.mycredit.mycredit.ui.profile.profile.details.UneditablePersonalDataDialog
import ua.mycredit.mycredit.ui.profile.repayloan.*

@Module
interface FragmentsModule {

    @ContributesAndroidInjector
    fun calculatorFragmentInjector(): CalculatorFragment

    @ContributesAndroidInjector
    fun signUpPhoneFragmentInjector(): SignUpPhoneFragment

    @ContributesAndroidInjector
    fun signUpSMSFragmentInjector(): SignUpSMSFragment

    @ContributesAndroidInjector
    fun passwordFragment(): PasswordFragment

    @ContributesAndroidInjector
    fun personalInformationFragmentInjector(): PersonalInfoFragment

    @ContributesAndroidInjector
    fun extraPersonalInfoFragmentInjector(): ExtraPersonalInfoFragment

    @ContributesAndroidInjector
    fun personalDataFragmentInjector(): PersonalDataFragment

    @ContributesAndroidInjector
    fun calculatorDialogFragmentInjector(): CalculatorDialogFragment

    @ContributesAndroidInjector
    fun signUpAddressFragmentInjector(): SignUpAddressFragment

    @ContributesAndroidInjector
    fun passportFragment(): PassportFragment

    @ContributesAndroidInjector
    fun workFragmentInjector(): EmployedFragment

    @ContributesAndroidInjector
    fun unemployedFragment(): UnemployedFragment

    @ContributesAndroidInjector
    fun businessmanFragment(): BusinessmanFragment

    @ContributesAndroidInjector
    fun pensionerFragment(): PensionerFragment

    @ContributesAndroidInjector
    fun studentFragment(): StudentFragment

    @ContributesAndroidInjector
    fun financeFragment(): FinanceFragment

    @ContributesAndroidInjector
    fun invalidFragment(): InvalidFragment

    @ContributesAndroidInjector
    fun decreeFragment(): DecreeFragment

    @ContributesAndroidInjector
    fun housewifeFragment(): HousewifeFragment

    @ContributesAndroidInjector
    fun temporarilyUnemployedFragment(): TemporarilyUnemployedFragment

    @ContributesAndroidInjector
    fun cardFrontFragment(): CardFrontFragment

    @ContributesAndroidInjector
    fun cardBackFragment(): CardBackFragment

    @ContributesAndroidInjector
    fun textInputDialogFragment(): TextInputDialogFragment

    @ContributesAndroidInjector
    fun honeInputDialogFragment(): PhoneInputDialogFragment

    @ContributesAndroidInjector
    fun progressDialogFragment(): ProgressDialogFragment

    @ContributesAndroidInjector
    fun signInFragment(): SignInFragment

    @ContributesAndroidInjector
    fun historyFragment(): HistoryFragment

    @ContributesAndroidInjector
    fun questionsFragment(): ProfileFragment

    @ContributesAndroidInjector
    fun editPasswordFragment(): EditPasswordFragment

    @ContributesAndroidInjector
    fun contactsFragment(): ContactsFragment

    @ContributesAndroidInjector
    fun cardsFragment(): CardsFragment

    @ContributesAndroidInjector
    fun newCardFrontFragment(): NewCardFrontFragment

    @ContributesAndroidInjector
    fun newCardBackFragment(): NewCardBackFragment

    @ContributesAndroidInjector
    fun cardSmsFragment(): CardSmsConfirmationFragment

    @ContributesAndroidInjector
    fun creditFragment(): StatusFragment

    @ContributesAndroidInjector
    fun inputPromoCodeDialogFragment(): InputPromoCodeDialogFragment

    @ContributesAndroidInjector
    fun terminalsFragment(): TerminalsFragment

    @ContributesAndroidInjector
    fun cardFragment(): RepayByCardFragment

    @ContributesAndroidInjector
    fun bankFragment(): BankFragment

    @ContributesAndroidInjector
    fun cardWebVerificationFragment(): MyCreditWebViewFragment

    @ContributesAndroidInjector
    fun agreementFragment(): AgreementFragment

    @ContributesAndroidInjector
    fun cardsPickerFragment(): CardsPickerFragment

    @ContributesAndroidInjector
    fun resetPasswordFragment(): ResetPasswordByPhoneFragment

    @ContributesAndroidInjector
    fun prolongationPreferencesFragment(): ProlongationPreferencesFragment

    @ContributesAndroidInjector
    fun uneditablePersonalDataDialog(): UneditablePersonalDataDialog

    @ContributesAndroidInjector
    fun preferRepayAmountInputDialogFragment(): PreferRepayAmountInputDialogFragment
}
