package ua.mycredit.mycredit.ui.bases

import android.app.DatePickerDialog
import android.arch.lifecycle.ViewModelProvider
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.content.pm.ActivityInfo
import android.content.res.Configuration
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.net.Uri
import android.os.Bundle
import android.support.annotation.CallSuper
import android.support.v4.app.DialogFragment
import android.support.v4.app.Fragment
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.google.android.gms.location.places.AutocompleteFilter
import com.google.android.gms.location.places.ui.PlaceAutocomplete
import com.google.firebase.analytics.FirebaseAnalytics
import dagger.android.support.DaggerAppCompatActivity
import org.jetbrains.anko.*
import org.jetbrains.anko.support.v4.withArguments
import org.joda.time.LocalDate
import ru.terrakok.cicerone.Navigator
import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.Router
import ru.terrakok.cicerone.commands.Back
import ru.terrakok.cicerone.commands.Command
import ru.terrakok.cicerone.commands.Replace
import ua.mycredit.core.LocalStorage
import ua.mycredit.core.OccupationType
import ua.mycredit.core.internal.Logger
import ua.mycredit.core.toCalendar
import ua.mycredit.mycredit.AppEvents
import ua.mycredit.mycredit.BuildConfig
import ua.mycredit.mycredit.R
import ua.mycredit.mycredit.Screens
import ua.mycredit.mycredit.internal.analytics.CustomAnalyticEvent
import ua.mycredit.mycredit.internal.impls.SupportAppNavigator
import ua.mycredit.mycredit.mapping.titleRes
import ua.mycredit.mycredit.ui.*
import ua.mycredit.mycredit.ui.authentication.ResetPasswordActivity
import ua.mycredit.mycredit.ui.authentication.registration.passport.address.SignUpAddressFragment
import ua.mycredit.mycredit.ui.authentication.registration.passport.personal.PersonalDataFragment
import ua.mycredit.mycredit.ui.bases.input.BaseInputDialogFragment.Companion.ARG_FIELD_REFERENCE
import ua.mycredit.mycredit.ui.bases.input.DatePickerViewModel
import ua.mycredit.mycredit.ui.bases.input.EnumPickerDialogViewModel
import ua.mycredit.mycredit.ui.bases.input.PhoneInputDialogFragment
import ua.mycredit.mycredit.ui.bases.input.TextInputDialogFragment
import ua.mycredit.mycredit.ui.calculator.CalculatorDialogFragment
import ua.mycredit.mycredit.ui.calculator.CalculatorViewModel
import ua.mycredit.mycredit.ui.calculator.InputPromoCodeDialogFragment
import ua.mycredit.mycredit.ui.delegates.FbEmail
import ua.mycredit.mycredit.ui.delegates.FbEmailDelegate
import ua.mycredit.mycredit.ui.profile.ProfileActivity
import ua.mycredit.mycredit.ui.profile.WebBankingActivity
import ua.mycredit.mycredit.ui.profile.cards.AddCardActivity
import ua.mycredit.mycredit.ui.profile.cards.CardsFragment
import ua.mycredit.mycredit.ui.profile.profile.details.UneditablePersonalDataDialog
import java.util.*
import javax.inject.Inject

abstract class BaseActivity : DaggerAppCompatActivity() {

    @Inject lateinit var navigatorHolder: NavigatorHolder
    @Inject lateinit var storage: LocalStorage

    @Inject lateinit var router: Router
    @Inject lateinit var events: AppEvents

    @Inject lateinit var logger: Logger

    protected open val navigator: Navigator = BaseNavigator()
    protected open val layoutId: Int = 0
    private var alert: DialogInterface? = null

    private var fbLoginManager: LoginManager? = null
    private var callbackManager: CallbackManager? = null

    protected lateinit var firebaseAnalytics: FirebaseAnalytics
        private set

    override fun onCreate(savedInstanceState: Bundle?) {
        adjustFontScale(Configuration(configuration))

        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        super.onCreate(savedInstanceState)

        firebaseAnalytics = FirebaseAnalytics.getInstance(this)
        callbackManager = CallbackManager.Factory.create()

        if (layoutId != 0) {
            setContentView(layoutId)
        }
    }

    override fun onDestroy() {
        fbLoginManager?.unregisterCallback(callbackManager)
        super.onDestroy()
    }

    override fun onResumeFragments() {
        super.onResumeFragments()
        navigatorHolder.setNavigator(navigator)
    }

    override fun onPause() {
        navigatorHolder.removeNavigator()
        super.onPause()
    }

    override fun onBackPressed() {
        val fragment = currentFragment()

        if (fragment !is BackButtonListener || !fragment.onBackPressed()) {
            super.onBackPressed()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        callbackManager?.onActivityResult(requestCode, resultCode, data)

        when (requestCode) {
            PLACE_REQUEST_CODE -> when (resultCode) {
                RESULT_OK -> {
                    currentFragment().let {
                        if (it is SignUpAddressFragment) {
                            PlaceAutocomplete.getPlace(this, data)
                                    .let(it::resetPlaces)
                        }
                    }
                }
                PlaceAutocomplete.RESULT_ERROR -> {
                    PlaceAutocomplete.getStatus(this, data).let {
                        alert {
                            titleResource = R.string.error_selecting_location
                            it.statusMessage?.let { message = it }
                        }.show()
                    }
                }
            }

            else -> super.onActivityResult(requestCode, resultCode, data)
        }
    }

    protected open fun currentFragment(): Fragment? = supportFragmentManager.findFragmentById(R.id.fragment_container)

    protected inline fun <reified T> currentFragmentParametrized(): T = currentFragment() as T

    protected inline fun <reified T> currentFragment(action: T.() -> Unit) {
        (currentFragment() as? T)?.let(action)
    }

    inline fun <reified F : Fragment> tryToFindFragment(): F? =
            supportFragmentManager.fragments.find { it is F } as? F

    inline fun <reified F : Fragment> findFragment(): F = tryToFindFragment()!!

    protected fun AlertBuilder<*>.replace() {
        alert?.dismiss()
        alert = show()
    }

    protected fun showDatePicker(minDateCalendar: Calendar, maxDateCalendar: Calendar = Calendar.getInstance(), onDatePicked: (Calendar) -> Unit) {

        val dateDialog = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { _, year, month, dayOfMonth ->
            Calendar.getInstance().apply {
                set(Calendar.YEAR, year)
                set(Calendar.MONTH, month)
                set(Calendar.DAY_OF_MONTH, dayOfMonth)
            }.let(onDatePicked)
        }, maxDateCalendar[Calendar.YEAR], maxDateCalendar[Calendar.MONTH], maxDateCalendar[Calendar.DAY_OF_MONTH])

        dateDialog.apply {
            datePicker.minDate = minDateCalendar.timeInMillis
            datePicker.maxDate = maxDateCalendar.timeInMillis
        }.show()
    }

    protected fun hideKeyboard() {
        val fragmentRoot = currentFragment()
                ?.view
                ?.rootView

        (fragmentRoot ?: currentFocus)
                ?.let { inputMethodManager.hideSoftInputFromWindow(it.windowToken, 0) }
    }

    protected fun showKeyboard(editText: EditText) {
        inputMethodManager.showSoftInput(editText, InputMethodManager.SHOW_IMPLICIT)
    }

    @CallSuper
    protected open fun onApplyNavigatorCommand(command: Command) {
        hideKeyboard()
    }

    protected fun DialogFragment.show() {
        show(supportFragmentManager, javaClass.name)
    }

    private fun adjustFontScale(configuration: Configuration) {
        if (configuration.fontScale != 1f) {
            configuration.fontScale = 1f

            val metrics = resources.displayMetrics
            windowManager.defaultDisplay.getMetrics(metrics)

            metrics.scaledDensity = configuration.fontScale * metrics.density
            baseContext.resources.updateConfiguration(configuration, metrics)
        }
    }

    fun Fragment.trackByAnalytics() = apply {
        firebaseAnalytics.setCurrentScreen(
                this@BaseActivity,
                javaClass.simpleName,
                javaClass.simpleName
        )
    }


    open inner class BaseNavigator : SupportAppNavigator(this, R.id.fragment_container) {

        @CallSuper
        override fun applyCommand(command: Command) {

            onApplyNavigatorCommand(command)

            when (command) {

                is Back -> tryToFindFragment<DialogFragment>()?.dismiss()
                        ?: super.applyCommand(command)

                else -> applyScreenKeyCommand(command)
            }
        }

        @CallSuper
        override fun createActivityIntent(context: Context, screenKey: String, data: Any?): Intent? =
                when (screenKey) {
                    Screens.Profile.PROFILE -> intentFor<ProfileActivity>().clearTask().newTask().noAnimation()
                    Screens.WEB_BANKING -> intentFor<WebBankingActivity>(WebBankingActivity.EXTRA_PARAMS to data)
                    Screens.DIAL -> Intent(Intent.ACTION_DIAL, Uri.parse("tel:$data"))
                    Screens.RESET_PASSWORD ->
                        intentFor<ResetPasswordActivity>(
                                ResetPasswordActivity.EXTRA_PHONE_INITIAL_INPUT to data
                        )
                    Screens.Profile.Cards.ADD_NEW_CARD -> intentFor<AddCardActivity>()
                    else -> null
                }

        override fun createFragment(screenKey: String, data: Any?): Fragment? = null

        override fun unknownScreen(command: Command) {
            if (BuildConfig.DEBUG) {
                alert("Screen ${command.screenKey()} is not implemented yet.") {
                    okButton {}
                }.replace()
            }
        }

        protected open fun onOccupationTypePicked(occupationType: OccupationType) {
            applyCommand(Replace(Screens.OCCUPATION_TYPE, occupationType))
        }

        private fun applyScreenKeyCommand(command: Command) {
            when (command.screenKey()) {

                Screens.ERROR ->
                    command.transitionData<Any?>().let {
                        when (it) {
                            is String -> alert(it) { okButton {} }.replace()
                            is Int -> alert(it) { okButton {} }.replace()
                            else -> throw IllegalStateException("transition argument is missing")
                        }
                    }

                Screens.ALERT -> alert(command.transitionData<Int>()) { okButton {} }.replace()

                Screens.PROGRESS -> ProgressDialogFragment().show()
                Screens.PROMO_CODE -> InputPromoCodeDialogFragment().show()

                Screens.WRONG_PROMO_CODE -> alert(R.string.error_wrong_promo_code) {
                    okButton {
                        router.navigateTo(Screens.PROMO_CODE)
                    }

                    cancelButton { }
                }.replace()

                Screens.FIRST_LOAN_PROMO_CODE -> alert(R.string.first_loan_promo_code) {
                    okButton {
                        it.dismiss()
                    }

                }.replace()

                Screens.Profile.Cards.DELETE_CARD_CONFIRMATION ->
                    alert(R.string.message_delete_card_confirmation) {

                        positiveButton(R.string.delete) {
                            findFragment<CardsFragment>().delete(command.transitionData())
                        }
                        cancelButton { it.dismiss() }

                    }.replace()

                Screens.PLACE_AUTHCOMPLETE -> {
                    AutocompleteFilter.Builder()
                            .setTypeFilter(AutocompleteFilter.TYPE_FILTER_ADDRESS)
                            .setCountry("UA")
                            .build().let {
                                PlaceAutocomplete.IntentBuilder(PlaceAutocomplete.MODE_OVERLAY)
                                        .setFilter(it)
                                        .build(this@BaseActivity)
                                        .also {
                                            try {
                                                startActivityForResult(it, PLACE_REQUEST_CODE)
                                            } catch (e: Exception) {
                                                toast(R.string.error_selecting_location)
                                            }
                                        }
                            }
                }

                Screens.ENUM_PICKER ->
                    with(command.transitionData<EnumPickerDialogViewModel<*>>()) {
                        resources.getStringArray(titlesRes)
                                .let { titles -> variants.map { titles[it.ordinal] } }
                                .let {
                                    selector(getString(titleRes), it) { _, pos ->
                                        notifyPicked(pos)
                                    }
                                }
                    }

                Screens.TEXT_PICKER -> {
                    TextInputDialogFragment()
                            .withArguments(ARG_FIELD_REFERENCE to command.transitionData())
                            .show()
                }

                Screens.PHONE_PICKER -> {
                    PhoneInputDialogFragment()
                            .withArguments(ARG_FIELD_REFERENCE to command.transitionData())
                            .show()
                }

                Screens.OCCUPATION_TYPE_PICKER -> {
                    enumSelector(OccupationType::titleRes,
                            ::onOccupationTypePicked,
                            R.string.occupation_type)
                }

                Screens.SignUp.Passport.BIRTH_DAY -> {
                    val minDate = Calendar.getInstance().apply { add(Calendar.YEAR, -PersonalDataFragment.MAX_AGE) }
                    val maxDate = Calendar.getInstance().apply { add(Calendar.YEAR, -PersonalDataFragment.MIN_AGE) }

                    showDatePicker(minDate, maxDate) { calendar ->
                        currentFragmentParametrized<PersonalDataFragment>()
                                .notifyBirthDayPicked(
                                        LocalDate.fromCalendarFields(calendar)
                                )
                    }
                }

                Screens.FACEBOOK -> {

                    fbLoginManager = LoginManager.getInstance().apply {
                        registerCallback(callbackManager, object : FacebookCallback<LoginResult> {
                            override fun onSuccess(result: LoginResult) {
                                ((currentFragment() as ViewModelFragment<*, *>)
                                        .viewModel as FbEmail)
                                        .onFacebookLoginSuccess(result)
                            }

                            override fun onCancel() {}

                            override fun onError(error: FacebookException?) {}
                        })

                    }.also {
                        it.logInWithReadPermissions(this@BaseActivity,
                                Arrays.asList(FbEmailDelegate.EMAIL))
                    }
                }

                Screens.DEBUG_PROFILE_DETAILS -> alert(storage.profile.toString()) {
                    okButton {}
                }.replace()

                Screens.CHOOSE_CREDIT_PRODUCT -> CalculatorDialogFragment().show()


                Screens.CALCULATOR_MAX_LOAN -> {
                    getString(R.string.money_restriction_note, command.transitionData() as Int).let {
                        showRestrictionAlert(it) {
                            storage.moneyNoteShown = true
                        }
                    }
                }
                Screens.CALCULATOR_MAX_DAYS -> {
                    getString(R.string.days_restriction_note, command.transitionData() as Int).let {
                        showRestrictionAlert(it) {
                            storage.daysNoteShown = true
                        }
                    }
                }

                Screens.ERROR_PERSONAL_DATA_UNEDITABLE -> UneditablePersonalDataDialog().show()

                Screens.DATE_PICKER ->
                    with(command.transitionData() as DatePickerViewModel) {
                        showDatePicker(
                                minDate.toCalendar(),
                                maxDate.toCalendar(),
                                ::notifyDatePicked
                        )
                    }

                Screens.CREDIT_CONFIRMATION -> {
                    logEvent(CustomAnalyticEvent.CLICK_APPLY_FOR_LOAN)

                    with(storage.creditPreferences) {
                        getString(
                                R.string.message_credit_preferences_confirmation,
                                loan,
                                resources.getQuantityString(R.plurals.days, days, days)
                        ).let { message ->
                            alert(message) {

                                okButton {
                                    logEvent(CustomAnalyticEvent.CLICK_OK_APPLY_FOR_LOAN)
                                    command.transitionData<CalculatorViewModel>().getCredit()
                                }

                                cancelButton {
                                    router.exit() // from calculator dialog
                                }
                            }.replace()
                        }
                    }
                }
                else -> super.applyCommand(command)
            }
        }

        private fun showRestrictionAlert(messageStr: String, onClicked: (dialog: DialogInterface) -> Unit) {
            alert {
                titleResource = R.string.note
                message = messageStr
                positiveButton(R.string.good, onClicked)
                isCancelable = false
            }.replace()
        }
    }

    companion object {
        const val PLACE_REQUEST_CODE = 88
    }
}

abstract class SelfBindingActivity<out VDB : ViewDataBinding> : BaseActivity() {

    @Inject lateinit var viewModelFactory: ViewModelProvider.Factory

    protected val binding: VDB by lazy { DataBindingUtil.bind<VDB>(contentView!!)!! }

    protected open val executesPendingBinding get() = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.bindViewModel(this)

        if (executesPendingBinding) {
            binding.executePendingBindings()
        }
    }
}
