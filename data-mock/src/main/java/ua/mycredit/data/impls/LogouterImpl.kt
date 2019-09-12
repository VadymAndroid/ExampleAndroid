package ua.mycredit.data.impls

import com.orhanobut.hawk.Hawk
import ua.mycredit.core.Logouter
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LogouterImpl @Inject constructor() : Logouter {

    override var loggedIn: Boolean = true

    override fun logout() {
        loggedIn = false
        Hawk.deleteAll()
    }
}
