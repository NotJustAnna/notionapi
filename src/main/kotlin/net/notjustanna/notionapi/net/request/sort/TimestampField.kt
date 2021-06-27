package net.notjustanna.notionapi.net.request.sort

import net.notjustanna.notionapi.utils.JsonEnum
import net.notjustanna.notionapi.utils.lowercaseOfName

enum class TimestampField : JsonEnum {
    CREATED_TIME, LAST_EDITED_TIME;

    override val value by lowercaseOfName()

    companion object : JsonEnum.Companion<TimestampField>(::values)
}
