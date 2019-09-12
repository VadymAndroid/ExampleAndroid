package ua.mycredit.data.net

import com.orhanobut.hawk.Hawk

internal enum class HeaderHolder(val key: String, private val hardCodeValue: String? = null) {
    TOKEN("tkLender_CustomerAuthToken"),
    //API_KEY("tkLender_ApiKey", "AE3FCDB7-833C-4691-B65C-BA4A19C25744");
   API_KEY("tkLender_ApiKey", "11F42ECC-F6CE-4A58-A55b-2390239D0A13");


    var header: String
        inline get() = hardCodeValue ?: Hawk.get<String>(name, "")
        inline set(value) {
            if (hardCodeValue != null) {
                throw IllegalArgumentException("Tring to re-set value of const Header.")
            }
            Hawk.put(name, value)
        }
}
