package ua.mycredit.mycredit.ui

import android.app.Dialog
import android.content.res.ColorStateList
import android.os.Build
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AlertDialog
import android.view.LayoutInflater
import kotlinx.android.synthetic.main.pre_loader.view.*
import org.jetbrains.anko.support.v4.ctx
import ua.mycredit.mycredit.R
import ua.mycredit.mycredit.ui.bases.BaseDialogFragment


class ProgressDialogFragment : BaseDialogFragment() {

    override val cancelable get() = false

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog =
            AlertDialog.Builder(ctx)
                    .setView(createView())
                    .create()

    private fun createView() =
            LayoutInflater.from(ctx).inflate(R.layout.pre_loader, null, false)
                    .also {
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                            it.progressBar.indeterminateTintList =
                                    ContextCompat.getColor(ctx, R.color.colorPrimaryDark)
                                            .let(ColorStateList::valueOf)
                        }
                    }

}
