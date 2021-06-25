package net.notjustanna.notionapi.model.richtext

import net.notjustanna.notionapi.utils.JsonEnum

enum class RichTextType(override val value: String?) : JsonEnum {
    TEXT("text"),
    MENTION("mention"),
    EQUATION("equation"),
    UNKNOWN(null);

    companion object : JsonEnum.Companion<RichTextType>(::values, { UNKNOWN })
}

