package ua.mycredit.mycredit.ui.profile.repayloan

import android.os.Bundle
import ua.mycredit.mycredit.ui.profile.cards.CardsFragment
import ua.mycredit.mycredit.ui.profile.cards.CardsViewModel

class CardsPickerFragment : CardsFragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.mode = CardsViewModel.Mode.PICKER
    }
}
