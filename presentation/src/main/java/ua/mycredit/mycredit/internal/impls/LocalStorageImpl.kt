package ua.mycredit.mycredit.internal.impls

import org.joda.time.DateTime
import ua.mycredit.core.*
import java.util.concurrent.TimeUnit
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LocalStorageImpl @Inject constructor() : LocalStorage {

    override var onboardingShown by storageProperty(false)

    override var moneyNoteShown by storageProperty(false)
    override var daysNoteShown by storageProperty(false)

    override var profile by storageProperty(Profile())

    override var agreementTime by storageProperty(DateTime.now())

    override var creditPreferences by storageProperty(CreditPreferences())
    override var promoCode by storageProperty("")
    override var creditProduct by ExpirableProperty<Product?>(Product(), TimeUnit.HOURS.toMillis(12))
    override var mailSubscription by storageProperty(false)
    override var dataProcessAllowed by storageProperty(false)

    override var cards by ExpirableProperty(emptyList<Card>(), TimeUnit.HOURS.toMillis(24))
    override var selectedCard by storageProperty<Card?>(null)

    override var history by ExpirableProperty(emptyList<Credit>(), TimeUnit.HOURS.toMillis(24))
}
