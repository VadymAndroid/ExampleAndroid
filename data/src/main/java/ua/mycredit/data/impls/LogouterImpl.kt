package ua.mycredit.data.impls

import com.orhanobut.hawk.Hawk
import ua.mycredit.core.Logouter
import ua.mycredit.data.net.HeaderHolder
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LogouterImpl @Inject constructor() : Logouter {

    override val loggedIn: Boolean get() = HeaderHolder.TOKEN.header.isNotEmpty()

    override fun logout() {
        HeaderHolder.TOKEN.header = ""
        Hawk.deleteAll()
    }
}
