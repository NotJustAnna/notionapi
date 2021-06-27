package net.notjustanna.notionapi.net.request.sort

import net.notjustanna.notionapi.utils.JsonEnum
import net.notjustanna.notionapi.utils.lowercaseOfName

enum class Direction : JsonEnum {
    ASCENDING, DESCENDING;

    override val value by lowercaseOfName()

    companion object : JsonEnum.Companion<Direction>(::values)
}
