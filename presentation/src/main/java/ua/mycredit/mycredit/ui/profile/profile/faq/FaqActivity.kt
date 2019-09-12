package ua.mycredit.mycredit.ui.profile.profile.faq

import android.databinding.DataBindingUtil
import android.databinding.ObservableBoolean
import android.databinding.ObservableField
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import net.cachapa.expandablelayout.ExpandableLayout
import ua.mycredit.mycredit.R
import ua.mycredit.mycredit.Screens
import ua.mycredit.mycredit.databinding.ActivityQuestionBinding
import ua.mycredit.mycredit.ui.bases.SelfBindingActivity
import ua.mycredit.mycredit.ui.bases.action.SetupToolbarAction
import ua.mycredit.mycredit.ui.bindViewModel
import ua.mycredit.mycredit.ui.layoutInflater

class FaqActivity : SelfBindingActivity<ActivityQuestionBinding>() {

    override val layoutId = R.layout.activity_question

    lateinit var faqAdapter: FaqAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        SetupToolbarAction(R.string.top_ten_questions).perform(this)

        val questions = resources.getStringArray(R.array.faq_questions).toList()
        val answers = resources.getStringArray(R.array.faq_answers).toList()

        faqAdapter = FaqAdapter(questions, answers, binding.faqRecyclerView)
    }


    companion object {
        const val UNSELECTED = -1
    }


    inner class FaqAdapter(
            private val questions: List<String>,
            private val answers: List<String>,
            private val recyclerView: RecyclerView
    ) : RecyclerView.Adapter<FaqAdapter.FaqViewHolder>() {

        private var selectedItem = UNSELECTED

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FaqViewHolder {
            val faqBinding = DataBindingUtil.inflate<ViewDataBinding>(
                    parent.layoutInflater, R.layout.item_faq, parent, false)

            return faqBinding.root
                    .let(::FaqViewHolder)
                    .also { faqBinding.bindViewModel(it) }
        }

        override fun getItemCount() = questions.size

        override fun onBindViewHolder(holder: FaqViewHolder, pos: Int) {
            holder.bind(questions[pos], answers[pos])
        }

        inner class FaqViewHolder(v: View) : RecyclerView.ViewHolder(v) {

            val question = ObservableField("")
            val answer = ObservableField("")
            val expanded = ObservableBoolean()

            fun bind(question: String, answer: String) {
                this.question.set(question)
                this.answer.set(answer)
            }

            fun onQuestion() {
                val holder = recyclerView.findViewHolderForAdapterPosition(selectedItem) as? FaqViewHolder
                holder?.expanded?.set(false)

                val pos = adapterPosition
                when (pos) {
                    selectedItem -> UNSELECTED
                    else -> {
                        expanded.set(true)
                        pos
                    }
                }.let { selectedItem = it }
            }

            fun onExpansion(state: Int) {
                if (state == ExpandableLayout.State.EXPANDING) {
                    recyclerView.smoothScrollToPosition(adapterPosition)
                }
            }

            fun onPhoneClick(phone: String) {
                router.navigateTo(Screens.DIAL, phone)
            }
        }
    }

}
