package net.notjustanna.notionapi.net.request.sort

import net.notjustanna.notionapi.utils.JsonEnum

enum class Direction : JsonEnum {
    ASCENDING, DESCENDING;

    override val value: String get() = name.lowercase()

    companion object : JsonEnum.Companion<Direction>(::values)
}
