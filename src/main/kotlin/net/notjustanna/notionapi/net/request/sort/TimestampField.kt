package net.notjustanna.notionapi.net.request.sort

import net.notjustanna.notionapi.utils.JsonEnum

enum class TimestampField : JsonEnum {
    CREATED_TIME, LAST_EDITED_TIME;

    override val value: String get() = name.lowercase()

    companion object : JsonEnum.Companion<TimestampField>(::values)
}
