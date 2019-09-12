package ua.mycredit.mycredit.internal.di.modules

import dagger.Module
import dagger.android.ContributesAndroidInjector
import ua.mycredit.mycredit.ui.authentication.ResetPasswordActivity
import ua.mycredit.mycredit.ui.authentication.SignInActivity
import ua.mycredit.mycredit.ui.authentication.registration.SignUpActivity
import ua.mycredit.mycredit.ui.calculator.CalculatorActivity
import ua.mycredit.mycredit.ui.launch.SplashActivity
import ua.mycredit.mycredit.ui.launch.onboarding.OnboardingActivity
import ua.mycredit.mycredit.ui.profile.CardsActivity
import ua.mycredit.mycredit.ui.profile.ProfileActivity
import ua.mycredit.mycredit.ui.profile.WebBankingActivity
import ua.mycredit.mycredit.ui.profile.cards.AddCardActivity
import ua.mycredit.mycredit.ui.profile.credit.AgreementActivity
import ua.mycredit.mycredit.ui.profile.profile.ProlongationPreferencesActivity
import ua.mycredit.mycredit.ui.profile.profile.contacts.ContactsActivity
import ua.mycredit.mycredit.ui.profile.profile.details.DetailsActivity
import ua.mycredit.mycredit.ui.profile.profile.faq.FaqActivity
import ua.mycredit.mycredit.ui.profile.repayloan.RepayLoanActivity

@Module
interface ActivitiesModule {

    @ContributesAndroidInjector
    fun splashActivityInjector(): SplashActivity

    @ContributesAndroidInjector
    fun onboardingActivityInjector(): OnboardingActivity

    @ContributesAndroidInjector
    fun calculatorActivityInjector(): CalculatorActivity

    @ContributesAndroidInjector
    fun signInActivityInjector(): SignInActivity

    @ContributesAndroidInjector
    fun signUpActivityInjector(): SignUpActivity

    @ContributesAndroidInjector
    fun profileActivityInjector(): ProfileActivity

    @ContributesAndroidInjector
    fun faqActivityInjector(): FaqActivity

    @ContributesAndroidInjector
    fun detailsActivityInjector(): DetailsActivity

    @ContributesAndroidInjector
    fun contactsActivity(): ContactsActivity

    @ContributesAndroidInjector
    fun addCardActivity(): AddCardActivity

    @ContributesAndroidInjector
    fun addRepayLoanActivity(): RepayLoanActivity

    @ContributesAndroidInjector
    fun cardWebVerificationActivity(): WebBankingActivity

    @ContributesAndroidInjector
    fun agreementActivity(): AgreementActivity

    @ContributesAndroidInjector
    fun cardsActivity(): CardsActivity

    @ContributesAndroidInjector
    fun resetPasswordActivity(): ResetPasswordActivity

    @ContributesAndroidInjector
    fun prolongationPreferencesDialogActivity(): ProlongationPreferencesActivity
}
