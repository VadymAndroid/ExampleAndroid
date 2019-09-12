package ua.mycredit.data

inline fun <reified E : Enum<E>> Int.getIncrementalEnumVal(): E? =
        when {
            this == 0 -> null
            else -> enumValues<E>().find { it.ordinal + 1 == this }
        }

inline fun <reified E : Enum<E>> E?.getIncrementalOrdinal() = (this?.ordinal ?: -1) + 1
