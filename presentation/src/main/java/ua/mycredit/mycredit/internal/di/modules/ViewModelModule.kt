package ua.mycredit.mycredit.internal.di.modules

import android.arch.lifecycle.ViewModel
import dagger.Binds
import dagger.MapKey
import dagger.Module
import dagger.multibindings.IntoMap
import ua.mycredit.mycredit.ui.authentication.ResetPasswordByPhoneViewModel
import ua.mycredit.mycredit.ui.authentication.SignInViewModel
import ua.mycredit.mycredit.ui.authentication.registration.SignUpProgressViewModel
import ua.mycredit.mycredit.ui.authentication.registration.card.CardBackViewModel
import ua.mycredit.mycredit.ui.authentication.registration.finance.FinanceViewModel
import ua.mycredit.mycredit.ui.authentication.registration.ocupation.*
import ua.mycredit.mycredit.ui.authentication.registration.passport.address.SignUpAddressViewModel
import ua.mycredit.mycredit.ui.authentication.registration.passport.passport.PassportViewModel
import ua.mycredit.mycredit.ui.authentication.registration.passport.personal.ExtraPersonalInfoViewModel
import ua.mycredit.mycredit.ui.authentication.registration.passport.personal.PersonalDataViewModel
import ua.mycredit.mycredit.ui.authentication.registration.passport.personal.PersonalInfoViewModel
import ua.mycredit.mycredit.ui.authentication.registration.phone.SignUpPhoneViewModel
import ua.mycredit.mycredit.ui.authentication.registration.signup.PasswordViewModel
import ua.mycredit.mycredit.ui.authentication.registration.sms.SignUpSMSViewModel
import ua.mycredit.mycredit.ui.calculator.CalculatorViewModel
import ua.mycredit.mycredit.ui.profile.cards.CardSmsConfirmationViewModel
import ua.mycredit.mycredit.ui.profile.cards.CardsViewModel
import ua.mycredit.mycredit.ui.profile.cards.NewCardBackViewModel
import ua.mycredit.mycredit.ui.profile.credit.AgreementViewModel
import ua.mycredit.mycredit.ui.profile.credit.StatusViewModel
import ua.mycredit.mycredit.ui.profile.history.HistoryViewModel
import ua.mycredit.mycredit.ui.profile.profile.ProfileViewModel
import ua.mycredit.mycredit.ui.profile.profile.ProlongationPreferencesViewModel
import ua.mycredit.mycredit.ui.profile.profile.contacts.EditPasswordViewModel
import ua.mycredit.mycredit.ui.profile.profile.details.DetailsViewModel
import ua.mycredit.mycredit.ui.profile.repayloan.BankFragmentViewModel
import ua.mycredit.mycredit.ui.profile.repayloan.RepayByCardViewModel
import kotlin.reflect.KClass

@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@MapKey
annotation class ViewModelKey(val value: KClass<out ViewModel>)

@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(CalculatorViewModel::class)
    abstract fun calculatorViewModel(viewModel: CalculatorViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(SignUpPhoneViewModel::class)
    abstract fun signUpPhoneViewModel(signUpPhoneViewModel: SignUpPhoneViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(SignUpSMSViewModel::class)
    abstract fun signUpSMSViewModel(signUpSMSViewModel: SignUpSMSViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(PasswordViewModel::class)
    abstract fun passwordViewModel(passwordViewModel: PasswordViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(SignUpProgressViewModel::class)
    abstract fun signUpProgressViewModel(signUpProgressViewModel: SignUpProgressViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(PersonalDataViewModel::class)
    abstract fun personalDataViewModel(personalDataViewModel: PersonalDataViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(PersonalInfoViewModel::class)
    abstract fun personalInformationViewModel(viewModel: PersonalInfoViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ExtraPersonalInfoViewModel::class)
    abstract fun extraPersonalInfoViewModelViewModel(viewModel: ExtraPersonalInfoViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(SignUpAddressViewModel::class)
    abstract fun signUpAddressViewModel(signUpAddressViewModel: SignUpAddressViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(PassportViewModel::class)
    abstract fun passportViewModel(passportViewModel: PassportViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(EmployedViewModel::class)
    abstract fun workViewModel(employedViewModel: EmployedViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(UnemployedViewModel::class)
    abstract fun unemployedViewModel(viewModel: UnemployedViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(BusinessmanViewModel::class)
    abstract fun businessmanViewModel(viewModel: BusinessmanViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(PensionerViewModel::class)
    abstract fun pensionerViewModel(viewModel: PensionerViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(StudentViewModel::class)
    abstract fun studentViewModel(viewModel: StudentViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(FinanceViewModel::class)
    abstract fun financeViewModel(viewModel: FinanceViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(InvalidViewModel::class)
    abstract fun invalidViewModel(viewModel: InvalidViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(DecreeViewModel::class)
    abstract fun decreeViewModel(viewModel: DecreeViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(HousewifeViewModel::class)
    abstract fun housewifeViewModel(viewModel: HousewifeViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(TemporarilyUnemployedViewModel::class)
    abstract fun temporarilyUnemployedViewModel(viewModel: TemporarilyUnemployedViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(CardBackViewModel::class)
    abstract fun cardBackViewModel(viewModel: CardBackViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(SignInViewModel::class)
    abstract fun signInViewModel(viewModel: SignInViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(HistoryViewModel::class)
    abstract fun historyViewModel(viewModel: HistoryViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ProfileViewModel::class)
    abstract fun questionsViewModel(viewModel: ProfileViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(EditPasswordViewModel::class)
    abstract fun editPasswordViewModel(viewModel: EditPasswordViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(DetailsViewModel::class)
    abstract fun detailsViewModel(viewModel: DetailsViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(CardsViewModel::class)
    abstract fun cardsViewModel(viewModel: CardsViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(NewCardBackViewModel::class)
    abstract fun newCardBackViewModel(viewModel: NewCardBackViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(CardSmsConfirmationViewModel::class)
    abstract fun cardSmsConfirmationViewModel(viewModel: CardSmsConfirmationViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(StatusViewModel::class)
    abstract fun creditViewModel(viewModel: StatusViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(BankFragmentViewModel::class)
    abstract fun bankRepayLoanViewModel(viewModel: BankFragmentViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(RepayByCardViewModel::class)
    abstract fun cardRepayLoanViewModel(viewModel: RepayByCardViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(AgreementViewModel::class)
    abstract fun agreementViewModel(viewModel: AgreementViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ResetPasswordByPhoneViewModel::class)
    abstract fun resetPasswordViewModel(viewModel: ResetPasswordByPhoneViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ProlongationPreferencesViewModel::class)
    abstract fun prolongationPreferencesViewModel(viewModel: ProlongationPreferencesViewModel): ViewModel
}
