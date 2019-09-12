package ua.mycredit.mycredit.ui.bases.action

import android.view.MenuItem
import android.view.ViewGroup
import android.widget.LinearLayout
import ru.terrakok.cicerone.Router
import ua.mycredit.mycredit.R
import ua.mycredit.mycredit.databinding.ToolbarBinding
import ua.mycredit.mycredit.ui.bases.BaseActivity
import ua.mycredit.mycredit.ui.bindViewModel

class SetupToolbarAction(
        val titleRes: Int = R.string.empty,
        private val menuRes: Int = 0,
        private val menuItemClick: ((Int) -> Boolean)? = null) {

    private lateinit var router: Router

    fun perform(activity: BaseActivity) {
        router = activity.router

        val toolbarBinding = ToolbarBinding.inflate(activity.layoutInflater).apply {
            if (menuRes != 0) {
                toolbar.inflateMenu(menuRes)
            }
            bindViewModel(this@SetupToolbarAction)
        }

        LinearLayout(activity).apply {
            orientation = LinearLayout.VERTICAL

            addView(toolbarBinding.root)

            val content = activity.findViewById<ViewGroup>(android.R.id.content)
            val contentView = content.getChildAt(0)
            content.removeViewAt(0)

            addView(contentView)

        }.let(activity::setContentView)

        when (titleRes) {
            R.string.empty -> activity.setSupportActionBar(toolbarBinding.toolbar)
            else -> toolbarBinding.toolbar.setTitle(titleRes)
        }
    }

    fun onMenuItemClick(item: MenuItem) = menuItemClick!!(item.itemId)

    fun onNavigationClick() {
        router.exit()
    }
}
