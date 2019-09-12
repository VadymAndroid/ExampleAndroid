package ua.mycredit.mycredit.ui.profile.profile

import android.databinding.ObservableField
import android.os.Bundle
import org.joda.time.LocalDate
import org.joda.time.LocalTime
import ru.terrakok.cicerone.Navigator
import ru.terrakok.cicerone.commands.Command
import ua.mycredit.core.Prolongation
import ua.mycredit.core.interactors.ProlongUseCase
import ua.mycredit.mycredit.R
import ua.mycredit.mycredit.Screens
import ua.mycredit.mycredit.databinding.FragmentProlongationPreferencesBinding
import ua.mycredit.mycredit.ui.bases.BaseActivity
import ua.mycredit.mycredit.ui.bases.BaseViewModel
import ua.mycredit.mycredit.ui.bases.ViewModelFragment
import ua.mycredit.mycredit.ui.bases.action.SetupToolbarAction
import ua.mycredit.mycredit.ui.screenKey
import java.util.*
import javax.inject.Inject

class ProlongationPreferencesActivity : BaseActivity() {

    override val layoutId = R.layout.activity_prolongation_preferences
    override val navigator: Navigator = NavigatorImpl()

    private val prolongation by lazy { intent.getSerializableExtra(EXTRA_PROLONGATION) as Prolongation }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        SetupToolbarAction(R.string.prolong_date_selection).perform(this)
        savedInstanceState ?: currentFragment().viewModel.date.set(prolongation.lastDay)
    }

    override fun currentFragment(): ProlongationPreferencesFragment =
            supportFragmentManager.findFragmentById(R.id.fragment_prolongation_preferences)
                    as ProlongationPreferencesFragment


    private inner class NavigatorImpl : BaseNavigator() {

        override fun applyCommand(command: Command) {

            when (command.screenKey()) {
                Screens.PROLONGATION_PREFERENCES_FINISH_DATE -> showDatePicker(
                        Calendar.getInstance().also { it.add(Calendar.DAY_OF_MONTH, 1) },
                        prolongation.lastDay.toDateTime(LocalTime.MIDNIGHT).toCalendar(Locale.getDefault())) { calendar ->
                    currentFragment().viewModel.date.set(LocalDate.fromCalendarFields(calendar))
                }

                else -> super.applyCommand(command)
            }
        }
    }

    companion object {
        val EXTRA_PROLONGATION = "${ProlongationPreferencesActivity::class.java.canonicalName}\$EXTRA_PROLONGATION"
    }
}


class ProlongationPreferencesFragment
    : ViewModelFragment<ProlongationPreferencesViewModel, FragmentProlongationPreferencesBinding>() {

    override val layoutId = R.layout.fragment_prolongation_preferences
    override val viewModelClass = ProlongationPreferencesViewModel::class.java
}


class ProlongationPreferencesViewModel @Inject constructor(
        private val prolong: ProlongUseCase
) : BaseViewModel() {

    val date = ObservableField<LocalDate>()

    fun pickFinishDay() {
        router.navigateTo(Screens.PROLONGATION_PREFERENCES_FINISH_DATE)
    }

    fun prolong() {
        prolong.execute(
                ProlongUseCase.Params(date.get()!!),
                ProlongationObserver()
        )
    }


    private inner class ProlongationObserver : BaseCompletableObserver() {

        override val progressMode = ProgressMode.DIALOG
        override val exitAfterCompletion = true

        override fun onComplete() {
            super.onComplete()
            events.notifyListeners { it.onCreditProlongationApplied() }
        }
    }
}
