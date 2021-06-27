package net.notjustanna.notionapi.model.database.property

import net.notjustanna.notionapi.utils.JsonEnum
import net.notjustanna.notionapi.utils.lowercaseOfName

enum class NumberFormat : JsonEnum {
    NUMBER, NUMBER_WITH_COMMAS, PERCENT, DOLLAR, EURO, POUND, YEN, RUBLE, RUPEE, WON, YUAN;

    override val value by lowercaseOfName()

    companion object : JsonEnum.Companion<NumberFormat>(::values)
}
