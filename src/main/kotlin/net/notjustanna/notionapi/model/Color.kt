package net.notjustanna.notionapi.model

import net.notjustanna.notionapi.utils.JsonEnum
import net.notjustanna.notionapi.utils.lowercaseOfName

enum class Color : JsonEnum {
    DEFAULT, GRAY, BROWN, ORANGE, YELLOW, GREEN, BLUE, PURPLE, PINK, RED;

    override val value by lowercaseOfName()

    companion object : JsonEnum.Companion<Color>(::values, { DEFAULT })
}
