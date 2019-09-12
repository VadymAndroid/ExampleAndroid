package ua.mycredit.mycredit.internal.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00e6\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH\'J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\fH\'J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000eH\'J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0010H\'J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0012H\'J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0014H\'J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0016H\'J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0018H\'J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001aH\'J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001cH\'J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001eH\'J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020 H\'J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\"H\'J\u0010\u0010#\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020$H\'J\u0010\u0010%\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020&H\'J\u0010\u0010\'\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020(H\'J\u0010\u0010)\u001a\u00020\u00042\u0006\u0010)\u001a\u00020*H\'J\u0010\u0010+\u001a\u00020\u00042\u0006\u0010+\u001a\u00020,H\'J\u0010\u0010-\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020.H\'J\u0010\u0010/\u001a\u00020\u00042\u0006\u0010/\u001a\u000200H\'J\u0010\u00101\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u000202H\'J\u0010\u00103\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u000204H\'J\u0010\u00105\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u000206H\'J\u0010\u00107\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u000208H\'J\u0010\u00109\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020:H\'J\u0010\u0010;\u001a\u00020\u00042\u0006\u0010;\u001a\u00020<H\'J\u0010\u0010=\u001a\u00020\u00042\u0006\u0010=\u001a\u00020>H\'J\u0010\u0010?\u001a\u00020\u00042\u0006\u0010?\u001a\u00020@H\'J\u0010\u0010A\u001a\u00020\u00042\u0006\u0010A\u001a\u00020BH\'J\u0010\u0010C\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020DH\'J\u0010\u0010E\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020FH\'J\u0010\u0010G\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020HH\'J\u0010\u0010I\u001a\u00020\u00042\u0006\u0010J\u001a\u00020KH\'\u00a8\u0006L"}, d2 = {"Lua/mycredit/mycredit/internal/di/modules/ViewModelModule;", "", "()V", "agreementViewModel", "Landroid/arch/lifecycle/ViewModel;", "viewModel", "Lua/mycredit/mycredit/ui/profile/credit/AgreementViewModel;", "bankRepayLoanViewModel", "Lua/mycredit/mycredit/ui/profile/repayloan/BankFragmentViewModel;", "businessmanViewModel", "Lua/mycredit/mycredit/ui/authentication/registration/ocupation/BusinessmanViewModel;", "calculatorViewModel", "Lua/mycredit/mycredit/ui/calculator/CalculatorViewModel;", "cardBackViewModel", "Lua/mycredit/mycredit/ui/authentication/registration/card/CardBackViewModel;", "cardRepayLoanViewModel", "Lua/mycredit/mycredit/ui/profile/repayloan/RepayByCardViewModel;", "cardSmsConfirmationViewModel", "Lua/mycredit/mycredit/ui/profile/cards/CardSmsConfirmationViewModel;", "cardsViewModel", "Lua/mycredit/mycredit/ui/profile/cards/CardsViewModel;", "creditViewModel", "Lua/mycredit/mycredit/ui/profile/credit/StatusViewModel;", "decreeViewModel", "Lua/mycredit/mycredit/ui/authentication/registration/ocupation/DecreeViewModel;", "detailsViewModel", "Lua/mycredit/mycredit/ui/profile/profile/details/DetailsViewModel;", "editPasswordViewModel", "Lua/mycredit/mycredit/ui/profile/profile/contacts/EditPasswordViewModel;", "extraPersonalInfoViewModelViewModel", "Lua/mycredit/mycredit/ui/authentication/registration/passport/personal/ExtraPersonalInfoViewModel;", "financeViewModel", "Lua/mycredit/mycredit/ui/authentication/registration/finance/FinanceViewModel;", "historyViewModel", "Lua/mycredit/mycredit/ui/profile/history/HistoryViewModel;", "housewifeViewModel", "Lua/mycredit/mycredit/ui/authentication/registration/ocupation/HousewifeViewModel;", "invalidViewModel", "Lua/mycredit/mycredit/ui/authentication/registration/ocupation/InvalidViewModel;", "newCardBackViewModel", "Lua/mycredit/mycredit/ui/profile/cards/NewCardBackViewModel;", "passportViewModel", "Lua/mycredit/mycredit/ui/authentication/registration/passport/passport/PassportViewModel;", "passwordViewModel", "Lua/mycredit/mycredit/ui/authentication/registration/signup/PasswordViewModel;", "pensionerViewModel", "Lua/mycredit/mycredit/ui/authentication/registration/ocupation/PensionerViewModel;", "personalDataViewModel", "Lua/mycredit/mycredit/ui/authentication/registration/passport/personal/PersonalDataViewModel;", "personalInformationViewModel", "Lua/mycredit/mycredit/ui/authentication/registration/passport/personal/PersonalInfoViewModel;", "prolongationPreferencesViewModel", "Lua/mycredit/mycredit/ui/profile/profile/ProlongationPreferencesViewModel;", "questionsViewModel", "Lua/mycredit/mycredit/ui/profile/profile/ProfileViewModel;", "resetPasswordViewModel", "Lua/mycredit/mycredit/ui/authentication/ResetPasswordByPhoneViewModel;", "signInViewModel", "Lua/mycredit/mycredit/ui/authentication/SignInViewModel;", "signUpAddressViewModel", "Lua/mycredit/mycredit/ui/authentication/registration/passport/address/SignUpAddressViewModel;", "signUpPhoneViewModel", "Lua/mycredit/mycredit/ui/authentication/registration/phone/SignUpPhoneViewModel;", "signUpProgressViewModel", "Lua/mycredit/mycredit/ui/authentication/registration/SignUpProgressViewModel;", "signUpSMSViewModel", "Lua/mycredit/mycredit/ui/authentication/registration/sms/SignUpSMSViewModel;", "studentViewModel", "Lua/mycredit/mycredit/ui/authentication/registration/ocupation/StudentViewModel;", "temporarilyUnemployedViewModel", "Lua/mycredit/mycredit/ui/authentication/registration/ocupation/TemporarilyUnemployedViewModel;", "unemployedViewModel", "Lua/mycredit/mycredit/ui/authentication/registration/ocupation/UnemployedViewModel;", "workViewModel", "employedViewModel", "Lua/mycredit/mycredit/ui/authentication/registration/ocupation/EmployedViewModel;", "presentation_fullDebug"})
@dagger.Module()
public abstract class ViewModelModule {
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = ua.mycredit.mycredit.ui.calculator.CalculatorViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel calculatorViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.ui.calculator.CalculatorViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = ua.mycredit.mycredit.ui.authentication.registration.phone.SignUpPhoneViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel signUpPhoneViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.ui.authentication.registration.phone.SignUpPhoneViewModel signUpPhoneViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = ua.mycredit.mycredit.ui.authentication.registration.sms.SignUpSMSViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel signUpSMSViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.ui.authentication.registration.sms.SignUpSMSViewModel signUpSMSViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = ua.mycredit.mycredit.ui.authentication.registration.signup.PasswordViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel passwordViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.ui.authentication.registration.signup.PasswordViewModel passwordViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = ua.mycredit.mycredit.ui.authentication.registration.SignUpProgressViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel signUpProgressViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.ui.authentication.registration.SignUpProgressViewModel signUpProgressViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = ua.mycredit.mycredit.ui.authentication.registration.passport.personal.PersonalDataViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel personalDataViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.ui.authentication.registration.passport.personal.PersonalDataViewModel personalDataViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = ua.mycredit.mycredit.ui.authentication.registration.passport.personal.PersonalInfoViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel personalInformationViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.ui.authentication.registration.passport.personal.PersonalInfoViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = ua.mycredit.mycredit.ui.authentication.registration.passport.personal.ExtraPersonalInfoViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel extraPersonalInfoViewModelViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.ui.authentication.registration.passport.personal.ExtraPersonalInfoViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = ua.mycredit.mycredit.ui.authentication.registration.passport.address.SignUpAddressViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel signUpAddressViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.ui.authentication.registration.passport.address.SignUpAddressViewModel signUpAddressViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = ua.mycredit.mycredit.ui.authentication.registration.passport.passport.PassportViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel passportViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.ui.authentication.registration.passport.passport.PassportViewModel passportViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = ua.mycredit.mycredit.ui.authentication.registration.ocupation.EmployedViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel workViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.ui.authentication.registration.ocupation.EmployedViewModel employedViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = ua.mycredit.mycredit.ui.authentication.registration.ocupation.UnemployedViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel unemployedViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.ui.authentication.registration.ocupation.UnemployedViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = ua.mycredit.mycredit.ui.authentication.registration.ocupation.BusinessmanViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel businessmanViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.ui.authentication.registration.ocupation.BusinessmanViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = ua.mycredit.mycredit.ui.authentication.registration.ocupation.PensionerViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel pensionerViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.ui.authentication.registration.ocupation.PensionerViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = ua.mycredit.mycredit.ui.authentication.registration.ocupation.StudentViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel studentViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.ui.authentication.registration.ocupation.StudentViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = ua.mycredit.mycredit.ui.authentication.registration.finance.FinanceViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel financeViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.ui.authentication.registration.finance.FinanceViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = ua.mycredit.mycredit.ui.authentication.registration.ocupation.InvalidViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel invalidViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.ui.authentication.registration.ocupation.InvalidViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = ua.mycredit.mycredit.ui.authentication.registration.ocupation.DecreeViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel decreeViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.ui.authentication.registration.ocupation.DecreeViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = ua.mycredit.mycredit.ui.authentication.registration.ocupation.HousewifeViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel housewifeViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.ui.authentication.registration.ocupation.HousewifeViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = ua.mycredit.mycredit.ui.authentication.registration.ocupation.TemporarilyUnemployedViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel temporarilyUnemployedViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.ui.authentication.registration.ocupation.TemporarilyUnemployedViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = ua.mycredit.mycredit.ui.authentication.registration.card.CardBackViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel cardBackViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.ui.authentication.registration.card.CardBackViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = ua.mycredit.mycredit.ui.authentication.SignInViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel signInViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.ui.authentication.SignInViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = ua.mycredit.mycredit.ui.profile.history.HistoryViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel historyViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.ui.profile.history.HistoryViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = ua.mycredit.mycredit.ui.profile.profile.ProfileViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel questionsViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.ui.profile.profile.ProfileViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = ua.mycredit.mycredit.ui.profile.profile.contacts.EditPasswordViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel editPasswordViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.ui.profile.profile.contacts.EditPasswordViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = ua.mycredit.mycredit.ui.profile.profile.details.DetailsViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel detailsViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.ui.profile.profile.details.DetailsViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = ua.mycredit.mycredit.ui.profile.cards.CardsViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel cardsViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.ui.profile.cards.CardsViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = ua.mycredit.mycredit.ui.profile.cards.NewCardBackViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel newCardBackViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.ui.profile.cards.NewCardBackViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = ua.mycredit.mycredit.ui.profile.cards.CardSmsConfirmationViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel cardSmsConfirmationViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.ui.profile.cards.CardSmsConfirmationViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = ua.mycredit.mycredit.ui.profile.credit.StatusViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel creditViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.ui.profile.credit.StatusViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = ua.mycredit.mycredit.ui.profile.repayloan.BankFragmentViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel bankRepayLoanViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.ui.profile.repayloan.BankFragmentViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = ua.mycredit.mycredit.ui.profile.repayloan.RepayByCardViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel cardRepayLoanViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.ui.profile.repayloan.RepayByCardViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = ua.mycredit.mycredit.ui.profile.credit.AgreementViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel agreementViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.ui.profile.credit.AgreementViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = ua.mycredit.mycredit.ui.authentication.ResetPasswordByPhoneViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel resetPasswordViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.ui.authentication.ResetPasswordByPhoneViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = ua.mycredit.mycredit.ui.profile.profile.ProlongationPreferencesViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel prolongationPreferencesViewModel(@org.jetbrains.annotations.NotNull()
    ua.mycredit.mycredit.ui.profile.profile.ProlongationPreferencesViewModel viewModel);
    
    public ViewModelModule() {
        super();
    }
}