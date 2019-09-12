package ua.mycredit.mycredit.ui.profile

import android.os.Bundle
import ua.mycredit.mycredit.R
import ua.mycredit.mycredit.ui.bases.BaseActivity
import ua.mycredit.mycredit.ui.bases.action.SetupToolbarAction

class CardsActivity : BaseActivity() {

    override val layoutId = R.layout.activity_cards

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        SetupToolbarAction().perform(this)
    }
}
