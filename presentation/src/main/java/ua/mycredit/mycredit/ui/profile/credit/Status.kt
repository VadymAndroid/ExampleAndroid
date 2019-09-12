package ua.mycredit.mycredit.ui.profile.credit

import android.Manifest
import android.annotation.SuppressLint
import android.app.Activity
import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.content.Context
import android.content.pm.PackageManager.PERMISSION_GRANTED
import android.database.Cursor
import android.databinding.ObservableBoolean
import android.databinding.ObservableField
import android.provider.ContactsContract
import android.support.v7.util.DiffUtil
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import hotchemi.android.rate.AppRate
import hotchemi.android.rate.StoreType
import org.jetbrains.anko.layoutInflater
import ua.mycredit.core.*
import ua.mycredit.core.CreditStatusAction.*
import ua.mycredit.core.interactors.GetContractAdditionsUseCase
import ua.mycredit.core.interactors.GetStatusUseCase
import ua.mycredit.core.interactors.PhoneContactsUseCase
import ua.mycredit.core.interactors.RestructureCreditUseCase
import ua.mycredit.mycredit.R
import ua.mycredit.mycredit.Screens
import ua.mycredit.mycredit.databinding.FragmentStatusBinding
import ua.mycredit.mycredit.databinding.ItemContractAdditionBinding
import ua.mycredit.mycredit.ui.bases.BaseExpandableItemsAdapter
import ua.mycredit.mycredit.ui.bases.BaseViewModel
import ua.mycredit.mycredit.ui.bases.ViewModelFragment
import ua.mycredit.mycredit.ui.bases.action.Refreshable
import ua.mycredit.mycredit.ui.bases.action.RefreshableDecorator
import ua.mycredit.mycredit.ui.bases.action.WithRefresh
import ua.mycredit.mycredit.ui.bases.action.refresh
import ua.mycredit.mycredit.ui.bindViewModel
import ua.mycredit.mycredit.ui.notNullGet
import ua.mycredit.mycredit.ui.profile.repayloan.RepaymentType
import java.util.*
import javax.inject.Inject
import kotlin.properties.Delegates


class StatusFragment : ViewModelFragment<StatusViewModel, FragmentStatusBinding>() {
    override val layoutId = R.layout.fragment_status
    override val viewModelClass = StatusViewModel::class.java
    override val scrollEnabled get() = true


    override fun onProfileUpdated() {
        invalidateUi()
        viewModel.estimateInGooglePlay(activity)
        setupPermissions(Manifest.permission.READ_CONTACTS, PERMISSION_READ_CONTACTS)
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when (requestCode) {
            PERMISSION_READ_CONTACTS -> {
                if ((grantResults.isNotEmpty() && grantResults[0] == PERMISSION_GRANTED)) {
                    viewModel.sendPhoneContacts(activity!!)
                }
            }
        }
    }
}


class StatusViewModel @Inject constructor(
        private val getStatus: GetStatusUseCase,
        private val getContractAdditions: GetContractAdditionsUseCase,
        private val restructureCredit: RestructureCreditUseCase,
        private val phoneContactsUseCase: PhoneContactsUseCase
) : BaseViewModel(), WithRefresh {


    override val asRefreshable: Refreshable = RefreshableDecorator {
        getStatus.execute(CreditStatusObserver())
    }

    val status = ObservableField<Status>()

    val scrollTo: LiveData<ScrollToCommand> get() = _scrollTo

    val notEnoughInformationAlertEnabled = ObservableBoolean()
    val noVerifiedCardAlertEnabled = ObservableBoolean()

    val contractAdditionsLoading = ObservableBoolean()

    val contractAdditionsVisible = ObservableBoolean()
    private val _scrollTo = MutableLiveData<ScrollToCommand>()

    fun sendPhoneContacts(context: Context) {
        phoneContactsUseCase.execute(PhoneContactsUseCase.Params(getContactListNumbers(context)), DeviceContactObserver() )
    }

    private inner class DeviceContactObserver : NoResponseFromServerCompletableObserver()


    @SuppressLint("Recycle")
    fun getContactListNumbers(context: Context): ArrayList<Contacts> {
        val cursor = context.contentResolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI,
                null, null, null, ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME + " ASC")
        val contacts: ArrayList<Contacts> = ArrayList()
        addToListContact(contacts, cursor)

        return  contacts
    }

    private fun addToListContact(contacts: ArrayList<Contacts>, cursor: Cursor){
        while (cursor.moveToNext()) {
            val nameContact = "" + getContactsListValue(cursor,ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME)
            val numberContact = "" + getContactsListValue(cursor,ContactsContract.CommonDataKinds.Phone.NUMBER )
            contacts.add(Contacts(nameContact, numberContact))
        }
    }

    private fun getContactsListValue(cursor: Cursor, indexString: String): String{
        return "" + cursor.getString(cursor.getColumnIndex(indexString))
    }

    private var contractAdditions by Delegates.observable(emptyList<ContractAddition>()) { _, old, new ->
        DiffUtil.calculateDiff(ContractAdditionsDiffUtilCallback(old, new))
                .dispatchUpdatesTo(contractAdditionsAdapter)

        contractAdditionsVisible.set(!new.isEmpty())
    }

    private var contractAdditionsAdapter: RecyclerView.Adapter<*> = ContractAdditionsAdapter()

    @Inject
    fun onInjected() {
        updateStatus()
        invalidateNoVerifiedCardAlert()
        invalidateNotEnoughInformationAlert()
    }

    override fun onCreditApplied() {
        updateStatus()
    }

    override fun onAgreementAccepted() {
        updateStatus()
    }

    override fun onCreditProlongationApplied() {
        contractAdditions = emptyList()
        updateStatus()
    }

    override fun onCardListUpdated() {
        invalidateNoVerifiedCardAlert()
    }

    override fun onProfileUpdated() {
        invalidateNotEnoughInformationAlert()
    }

    fun goToProfile() {
        _scrollTo.value = ScrollToCommand(ScrollToCommand.Argument.PROFILE)
    }

    fun goToCardsList() {
        _scrollTo.value = ScrollToCommand(ScrollToCommand.Argument.MY_CARDS)
    }

    fun processPhoneClick(phone: String) {
        router.navigateTo(Screens.DIAL, phone)
    }

    fun creditAction() {
        with(status.notNullGet()) {
            when (action) {

                PICK_UP_LOAN -> Screens.CHOOSE_CREDIT_PRODUCT to null

                READ_CONTRACT -> Screens.AGREEMENT_PERMISSIONS_REQUEST to
                        AgreementType.PendingCredit(credit!!.id)

                REPAY -> Screens.REPAY_LOAN to RepaymentType.RepayCredit(credit!!)

            }.let { router.navigateTo(it.first, it.second) }
        }
    }

    fun createContractAdditionsAdapter(): RecyclerView.Adapter<*> =
            ContractAdditionsAdapter().also { contractAdditionsAdapter = it }

    fun repayRestructuredStep() {
        router.navigateTo(
                Screens.REPAY_LOAN,
                RepaymentType.RestructuringStep(status.notNullGet().credit!!)
        )
    }

    fun estimateInGooglePlay(context: Context?){
        AppRate.with(context)
                .setStoreType(StoreType.GOOGLEPLAY)
                .setInstallDays(3)
                .setLaunchTimes(3)
                .setRemindInterval(7)
                .monitor()
        AppRate.showRateDialogIfMeetsConditions(context as Activity?)
    }

    private fun invalidateNoVerifiedCardAlert() {
        noVerifiedCardAlertEnabled.set(
                storage.cards.value.orEmpty().none { it.main && it.verified }
        )
    }

    private fun invalidateNotEnoughInformationAlert() {
        notEnoughInformationAlertEnabled.set(!profile.isOccupationInfoValid || !profile.isPersonalInfoValid)
    }

    private fun updateStatus(clearOnStart: Boolean = true) {
        if (clearOnStart) {
            status.set(null)
        }
        refresh()
    }


    private fun updateProlongations() {
        when {

            status.get().canProlong -> getContractAdditions.execute(
                    status.get()!!.credit!!,
                    GetContractAdditionsObserver()
            )

            else -> contractAdditions = emptyList()
        }
    }


    class ScrollToCommand(argument: Argument) {

        var argument: Argument? = argument
            get() = field.also { field = null }

        enum class Argument { PROFILE, MY_CARDS }

        fun execute(consumeArgument: (Argument) -> Unit) {
            argument?.let(consumeArgument)
        }
    }


    private inner class CreditStatusObserver : BaseObserver<Status>() {

        override val progressMode = ProgressMode.EMPTY

        override fun onNext(t: Status) {

            asRefreshable.notifyRefreshTerminated()

            val updated = status.get().let { previous ->
                previous == null || previous.javaClass != t.javaClass
            }

            status.set(t)

            if (updated) {
                events.notifyListeners { it.onStatusUpdated() }
            }

            updateProlongations()
        }
    }


    private inner class GetContractAdditionsObserver : BaseSingleObserver<List<ContractAddition>>() {

        override val progressMode
            get() = when {
                contractAdditions.isEmpty() -> contractAdditionsLoading.asProgressMode()
                else -> ProgressMode.EMPTY
            }

        override fun onSuccess(t: List<ContractAddition>) {
            super.onSuccess(t)
            contractAdditions = t
        }

        override fun onError(e: Throwable) {
            super.onError(e)
            contractAdditions = emptyList()
        }
    }


    private inner class RestructureCreditObserver : BaseCompletableObserver() {

        override val progressMode: ProgressMode = ProgressMode.DIALOG

        override fun onComplete() {
            super.onComplete()
            updateStatus()
        }
    }


    private inner class ContractAdditionsDiffUtilCallback(
            val old: List<ContractAddition>,
            val new: List<ContractAddition>
    ) : DiffUtil.Callback() {

        override fun getOldListSize() = old.size
        override fun getNewListSize() = new.size

        override fun areItemsTheSame(
                oldItemPosition: Int,
                newItemPosition: Int
        ) = old[oldItemPosition].id == new[newItemPosition].id

        override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int) =
                old[oldItemPosition] == new[newItemPosition]
    }


    inner class ContractAdditionsAdapter
        : BaseExpandableItemsAdapter<ContractAddition, ContractAdditionsAdapter.ItemViewHolderImpl>() {

        override val items get() = contractAdditions

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
                ItemContractAdditionBinding.inflate(
                        parent.context.layoutInflater,
                        parent,
                        false
                ).let { binding ->
                    ItemViewHolderImpl(binding.root).also { binding.bindViewModel(it) }
                }

        override fun onBindViewHolder(holder: ItemViewHolderImpl, position: Int) {
            super.onBindViewHolder(holder, position)
            holder.agreed.set(false)
        }


        inner class ItemViewHolderImpl(v: View)
            : BaseExpandableItemsAdapter<ContractAddition, ItemViewHolderImpl>.ItemViewHolder(v) {

            val agreed = ObservableBoolean()

            fun goToRestructuringAgreement() {
                router.navigateTo(
                        Screens.AGREEMENT_PERMISSIONS_REQUEST,
                        AgreementType.RestructuringAgreement(
                                status.notNullGet().credit!!.id,
                                item.get()!!.id
                        )
                )
            }

            fun apply() {
                item.get().let { contractAddition ->
                    when (contractAddition) {

                        is Prolongation -> applyProlongation(contractAddition)

                        is Restructuring -> restructureCredit.execute(
                                RestructureCreditUseCase.Params(
                                        status.get()!!.credit!!,
                                        contractAddition
                                ),
                                RestructureCreditObserver()
                        )
                    }
                }
            }

            private fun applyProlongation(prolongation: Prolongation) {

                when (prolongation.state) {

                    Prolongation.State.INTEREST_PAYMENT_WAITING ->
                        router.navigateTo(
                                Screens.PROLONGATION_PAY_INTERESTS,
                                status.notNullGet().credit!!
                        )

                    Prolongation.State.DATE_SELECTABLE -> router.navigateTo(
                            Screens.PROLONGATION_PREFERENCES,
                            item.get()
                    )

                    else -> Unit
                }
            }
        }
    }
}
