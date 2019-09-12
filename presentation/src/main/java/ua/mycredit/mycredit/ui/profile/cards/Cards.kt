package ua.mycredit.mycredit.ui.profile.cards

import android.databinding.ObservableBoolean
import android.databinding.ObservableField
import android.graphics.Rect
import android.os.Bundle
import android.support.v7.widget.PopupMenu
import android.support.v7.widget.RecyclerView
import android.view.*
import ua.mycredit.core.Automatically
import ua.mycredit.core.ByUrl
import ua.mycredit.core.Card
import ua.mycredit.core.CardVerificationType
import ua.mycredit.core.interactors.DeleteCardUseCase
import ua.mycredit.core.interactors.LoadCardsUseCase
import ua.mycredit.core.interactors.MarkAsMainUseCase
import ua.mycredit.core.interactors.VerifyCardUseCase
import ua.mycredit.mycredit.R
import ua.mycredit.mycredit.Screens
import ua.mycredit.mycredit.databinding.FooterFragmentCardsBinding
import ua.mycredit.mycredit.databinding.ListContentBinding
import ua.mycredit.mycredit.ui.bases.LazyListViewModel
import ua.mycredit.mycredit.ui.bases.ViewModelFragment
import ua.mycredit.mycredit.ui.bases.action.WithRefresh
import ua.mycredit.mycredit.ui.bases.action.refresh
import ua.mycredit.mycredit.ui.bindViewModel
import javax.inject.Inject

open class CardsFragment : ViewModelFragment<CardsViewModel, ListContentBinding>() {

    override val layoutId get() = R.layout.list_content
    override val scrollEnabled get() = true

    override val viewModelClass get() = CardsViewModel::class.java

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.recyclerView.addItemDecoration(ItemDecorationImpl())
    }

    fun delete(card: Card) {
        viewModel.delete(card)
    }

    private inner class ItemDecorationImpl : RecyclerView.ItemDecoration() {

        private val horizontalMargin = resources.getDimensionPixelSize(R.dimen.screen_horizontal_margin)

        override fun getItemOffsets(
                outRect: Rect,
                view: View,
                parent: RecyclerView,
                state: RecyclerView.State
        ) {

            val params = view.layoutParams as RecyclerView.LayoutParams
            val position = params.viewAdapterPosition

            val top = 0.takeIf { position > 0 } ?: horizontalMargin / 2

            outRect.set(horizontalMargin, top, horizontalMargin, 0)
        }
    }
}


class CardsViewModel @Inject constructor(
        override val loadItems: LoadCardsUseCase,
        private val markAsMain: MarkAsMainUseCase,
        private val verifyCard: VerifyCardUseCase,
        private val deleteCard: DeleteCardUseCase
) : LazyListViewModel<Card>(), WithRefresh {

    override val emptyListText = R.string.no_cards
    override val nestedScrollingEnabled = false

    override val footerEnabled = true
    var mode: Mode = Mode.MY_CARDS

    var checkedCard = ObservableField<Card>()

    override fun makeDiffCallback(newList: List<Card>): BaseDiffUtilCallback =
            DiffUtilCallbackImpl(newList)

    override fun createRecyclerViewAdapter(): BaseAdapter = AdapterImpl()

    override fun onBankingCompleted() {
        refresh()
    }

    override fun onCardAdded() {
        refresh()
    }

    override fun onCardDeleted() {
        refresh()
    }

    override fun onCardVerified() {
        refresh()
    }

    override fun onMainCardChanged() {
        refresh()
    }

    override fun onListUpdateTerminated() {
        events.notifyListeners { it.onCardListUpdated() }
    }

    fun addCard() {
        router.navigateTo(Screens.Profile.Cards.ADD_NEW_CARD)
    }

    fun delete(card: Card) {
        deleteCard.execute(card, DeleteCardObserver())
    }

    fun processSelectionFinished() {
        storage.selectedCard = checkedCard.get()!!
        events.notifyListeners { it.onCardSelected(checkedCard.get()!!) }
        router.exit()
    }


    inner class AdapterImpl : BaseAdapter() {

        override val itemLayoutId: Int get() = R.layout.item_card

        override fun onCreateItemViewHolder(v: View) = CardViewHolder(v)

        override fun onInflateFooter(inflater: LayoutInflater, parent: ViewGroup) =
                FooterFragmentCardsBinding.inflate(inflater, parent, false)
                        .bindViewModel(this@CardsViewModel)


        inner class CardViewHolder(v: View) : ItemViewHolder<Card>(v) {

            val mode get() = this@CardsViewModel.mode

            val checked = ObservableBoolean()

            override fun onBind(item: Card) {
                super.onBind(item)
                checked.set(item == checkedCard.get())
            }

            fun showPopUpMenu(v: View) {
                PopupMenu(ContextThemeWrapper(v.context, R.style.ItemCardTheme), v, Gravity.END).apply {
                    inflate(R.menu.menu_item_card)

                    val item = item.get()!!

                    with(menu) {
                        findItem(R.id.action_mark_as_main).isVisible = !item.main && mode == Mode.MY_CARDS
                        findItem(R.id.action_delete).isVisible = mode == Mode.MY_CARDS
                        findItem(R.id.action_delete).isEnabled = !item.main
                        findItem(R.id.action_verify).isVisible = !item.verified

                    }
                    setOnMenuItemClickListener { onMenuItemClick(it) }
                    show()
                }
            }

            fun markAsSelected(v: View) {
                checkedCard.set(item.get())
                notifyDataSetChanged()
            }

            private fun onMenuItemClick(menuItem: MenuItem) =
                    when (menuItem.itemId) {
                        R.id.action_mark_as_main -> {
                            markAsMain.execute(item.get()!!, MarkAsMainObserver())
                            true
                        }

                        R.id.action_verify -> {
                            verifyCard.execute(item.get()!!, VerificationObserver())
                            true
                        }

                        R.id.action_delete -> {
                            router.navigateTo(Screens.Profile.Cards.DELETE_CARD_CONFIRMATION, item.get())
                            true
                        }
                        else -> true
                    }
        }
    }


    private inner class DiffUtilCallbackImpl(newList: List<Card>) : BaseDiffUtilCallback(newList) {

        override fun areItemsTheSame(item1: Card, item2: Card) = item1.number == item2.number

        override fun areContentsTheSame(oldItem: Card, newItem: Card) = oldItem == newItem
    }


    private inner class MarkAsMainObserver : BaseCompletableObserver() {

        override fun onMapError(e: Throwable) = R.string.error_unable_to_mark_as_main

        override fun onComplete() {
            super.onComplete()
            events.notifyListeners { it.onMainCardChanged() }
        }
    }


    private inner class VerificationObserver : BaseSingleObserver<CardVerificationType>() {

        override fun onSuccess(t: CardVerificationType) {
            super.onSuccess(t)
            when (t) {
                is ByUrl -> router.navigateTo(
                        Screens.WEB_BANKING,
                        Screens.WebBankingParams(t.url, R.string.message_card_verification_redirect)
                )
                is Automatically -> events.notifyListeners { it.onCardVerified() }
            }
        }
    }


    private inner class DeleteCardObserver : BaseCompletableObserver() {

        override fun onComplete() {
            super.onComplete()
            events.notifyListeners { it.onCardDeleted() }
        }
    }


    enum class Mode {
        MY_CARDS,
        PICKER
    }
}
