package ua.mycredit.mycredit.internal.impls

import android.content.Context
import ua.mycredit.mycredit.ui.MessagesMapper
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MessagesMapperImpl @Inject constructor(private val context: Context) : MessagesMapper {

    override fun transform(messageId: Int): String = context.getString(messageId)
}
