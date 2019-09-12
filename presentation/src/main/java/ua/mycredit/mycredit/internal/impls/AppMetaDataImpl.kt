package ua.mycredit.mycredit.internal.impls

import ua.mycredit.core.internal.AppMetaData
import ua.mycredit.mycredit.BuildConfig
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppMetaDataImpl @Inject constructor() : AppMetaData {
    override val debug get() = BuildConfig.DEBUG
}
