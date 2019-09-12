package ua.mycredit.core

import org.joda.time.DateTime
import org.joda.time.LocalDate
import org.joda.time.LocalTime
import org.joda.time.format.DateTimeFormat
import org.joda.time.format.DateTimeFormatter
import java.util.*


fun String.toLocalPhone() = filterNot { "()-X".contains(it) }


val DATE_FORMAT: DateTimeFormatter = DateTimeFormat.forPattern("yyyy-MM-dd")

private fun String.normalizeIsoDate() =
        replaceAfter('.', "").replace(".", "")
                .replaceAfter('+', "").replace("+", "")
                .replaceAfter("T", "").replace("T", "")

fun String.toLocalDate(): LocalDate = normalizeIsoDate().let { LocalDate.parse(it, DATE_FORMAT) }
fun String.toDateTime(): DateTime = normalizeIsoDate().let { DateTime.parse(it, DATE_FORMAT) }


fun LocalDate.toCalendar(): Calendar = toDateTime(LocalTime.MIDNIGHT).toCalendar(Locale.getDefault())
