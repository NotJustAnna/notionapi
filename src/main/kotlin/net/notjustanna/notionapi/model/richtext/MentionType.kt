package net.notjustanna.notionapi.model.richtext

import net.notjustanna.notionapi.utils.JsonEnum
import net.notjustanna.notionapi.utils.lowercaseOfName

enum class MentionType : JsonEnum {
    USER, PAGE, DATABASE, DATE;

    override val value by lowercaseOfName()

    companion object : JsonEnum.Companion<MentionType>(::values)
}
