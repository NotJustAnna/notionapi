package net.notjustanna.notionapi.model.richtext

import net.notjustanna.notionapi.utils.JsonEnum
import net.notjustanna.notionapi.utils.lowercaseOfName

enum class RichTextType : JsonEnum {
    TEXT,
    MENTION,
    EQUATION;

    override val value by lowercaseOfName()

    companion object : JsonEnum.Companion<RichTextType>(::values)
}

