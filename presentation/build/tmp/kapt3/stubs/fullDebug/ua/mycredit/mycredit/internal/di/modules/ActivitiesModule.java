package ua.mycredit.mycredit.internal.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0007H\'J\b\u0010\b\u001a\u00020\tH\'J\b\u0010\n\u001a\u00020\u000bH\'J\b\u0010\f\u001a\u00020\rH\'J\b\u0010\u000e\u001a\u00020\u000fH\'J\b\u0010\u0010\u001a\u00020\u0011H\'J\b\u0010\u0012\u001a\u00020\u0013H\'J\b\u0010\u0014\u001a\u00020\u0015H\'J\b\u0010\u0016\u001a\u00020\u0017H\'J\b\u0010\u0018\u001a\u00020\u0019H\'J\b\u0010\u001a\u001a\u00020\u001bH\'J\b\u0010\u001c\u001a\u00020\u001dH\'J\b\u0010\u001e\u001a\u00020\u001fH\'J\b\u0010 \u001a\u00020!H\'\u00a8\u0006\""}, d2 = {"Lua/mycredit/mycredit/internal/di/modules/ActivitiesModule;", "", "addCardActivity", "Lua/mycredit/mycredit/ui/profile/cards/AddCardActivity;", "addRepayLoanActivity", "Lua/mycredit/mycredit/ui/profile/repayloan/RepayLoanActivity;", "agreementActivity", "Lua/mycredit/mycredit/ui/profile/credit/AgreementActivity;", "calculatorActivityInjector", "Lua/mycredit/mycredit/ui/calculator/CalculatorActivity;", "cardWebVerificationActivity", "Lua/mycredit/mycredit/ui/profile/WebBankingActivity;", "cardsActivity", "Lua/mycredit/mycredit/ui/profile/CardsActivity;", "contactsActivity", "Lua/mycredit/mycredit/ui/profile/profile/contacts/ContactsActivity;", "detailsActivityInjector", "Lua/mycredit/mycredit/ui/profile/profile/details/DetailsActivity;", "faqActivityInjector", "Lua/mycredit/mycredit/ui/profile/profile/faq/FaqActivity;", "onboardingActivityInjector", "Lua/mycredit/mycredit/ui/launch/onboarding/OnboardingActivity;", "profileActivityInjector", "Lua/mycredit/mycredit/ui/profile/ProfileActivity;", "prolongationPreferencesDialogActivity", "Lua/mycredit/mycredit/ui/profile/profile/ProlongationPreferencesActivity;", "resetPasswordActivity", "Lua/mycredit/mycredit/ui/authentication/ResetPasswordActivity;", "signInActivityInjector", "Lua/mycredit/mycredit/ui/authentication/SignInActivity;", "signUpActivityInjector", "Lua/mycredit/mycredit/ui/authentication/registration/SignUpActivity;", "splashActivityInjector", "Lua/mycredit/mycredit/ui/launch/SplashActivity;", "presentation_fullDebug"})
@dagger.Module()
public abstract interface ActivitiesModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.launch.SplashActivity splashActivityInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.launch.onboarding.OnboardingActivity onboardingActivityInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.calculator.CalculatorActivity calculatorActivityInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.authentication.SignInActivity signInActivityInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.authentication.registration.SignUpActivity signUpActivityInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.profile.ProfileActivity profileActivityInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.profile.profile.faq.FaqActivity faqActivityInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.profile.profile.details.DetailsActivity detailsActivityInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.profile.profile.contacts.ContactsActivity contactsActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.profile.cards.AddCardActivity addCardActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.profile.repayloan.RepayLoanActivity addRepayLoanActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.profile.WebBankingActivity cardWebVerificationActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.profile.credit.AgreementActivity agreementActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.profile.CardsActivity cardsActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.authentication.ResetPasswordActivity resetPasswordActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ua.mycredit.mycredit.ui.profile.profile.ProlongationPreferencesActivity prolongationPreferencesDialogActivity();
}