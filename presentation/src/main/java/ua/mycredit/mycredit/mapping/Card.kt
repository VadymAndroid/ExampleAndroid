package ua.mycredit.mycredit.mapping

import ua.mycredit.core.Card
import ua.mycredit.mycredit.R

fun Card.getPaymentIconId(forciblyColored: Boolean) =
        when (paymentSystem to (main || forciblyColored)) {
            Card.PaymentSystem.VISA to true -> R.drawable.ic_visa_colored
            Card.PaymentSystem.VISA to false -> R.drawable.ic_visa
            Card.PaymentSystem.MASTERCARD to false -> R.drawable.ic_master_card
            Card.PaymentSystem.MASTERCARD to true -> R.drawable.ic_mastercard_colored
            else -> 0
        }
