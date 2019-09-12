package ua.mycredit.mycredit.ui.profile.repayloan

import android.graphics.Typeface
import android.os.Bundle
import android.support.v4.view.PagerAdapter
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import kotlinx.android.synthetic.main.fragment_repayments_terminals.*
import org.jetbrains.anko.*
import org.jetbrains.anko.support.v4.ctx
import ua.mycredit.mycredit.R
import ua.mycredit.mycredit.Screens
import ua.mycredit.mycredit.ui.bases.BaseFragment
import ua.mycredit.mycredit.ui.getColorBy
import ua.mycredit.mycredit.ui.setClickableFragment
import ua.mycredit.mycredit.ui.setHtmlText

class TerminalsFragment : BaseFragment() {

    override val layoutId = R.layout.fragment_repayments_terminals

    private val tabIcons = arrayOf(R.drawable.bg_tab_ibox, R.drawable.bg_tab_privat)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewPager()
    }

    private fun setupViewPager() {
        terminalsViewPager.adapter = PagerAdapterImpl()
        terminalsTab.setupWithViewPager(terminalsViewPager)

        tabIcons.forEachIndexed { idx, item ->
            terminalsTab.getTabAt(idx)!!.customView = ImageView(ctx).apply {
                imageResource = item
            }
        }
    }


    private inner class PagerAdapterImpl : PagerAdapter() {

        override fun instantiateItem(container: ViewGroup, position: Int): Any =
                when (Page.values()[position]) {

                    TerminalsFragment.Page.IBOX ->
                        container.textView {

                            verticalPadding = resources.getDimensionPixelOffset(R.dimen.margin)
                            horizontalPadding = resources.getDimensionPixelSize(R.dimen.screen_horizontal_margin)

                            setClickableFragment(
                                    resources.getString(R.string.ibox_payment_description),
                                    resources.getString(R.string.ibox_name),
                                    context.getColorBy(R.color.colorPrimary),
                                    View.OnClickListener { router.navigateTo(Screens.IBOX_WEB) },
                                    asHtml = true
                            )
                        }

                    TerminalsFragment.Page.PRIVAT ->
                        container.verticalLayout {

                            verticalPadding = dimen(R.dimen.margin)
                            horizontalPadding = dimen(R.dimen.screen_horizontal_margin)

                            textView {
                                setHtmlText(getString(R.string.privat_payment_description))
                            }

                            space().lparams(height = dimen(R.dimen.margin))

                            textView(R.string.privat_requisites) {
                                backgroundResource = R.drawable.bg_white_dotted
                                padding = dimen(R.dimen.margin)
                                typeface = Typeface.MONOSPACE
                            }

                            space().lparams(height = dimen(R.dimen.margin))
                        }
                }

        override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
            container.removeView(`object` as View)
        }

        override fun isViewFromObject(view: View, `object`: Any) = view == `object`

        override fun getCount(): Int = Page.values().size
    }


    enum class Page {
        IBOX, PRIVAT;
    }
}
