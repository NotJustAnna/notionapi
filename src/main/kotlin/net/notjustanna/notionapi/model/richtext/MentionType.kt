package net.notjustanna.notionapi.model.richtext

import net.notjustanna.notionapi.utils.JsonEnum

enum class MentionType(override val value: String?) : JsonEnum {
    USER("user"),
    PAGE("page"),
    DATABASE("database"),
    DATE("date"),
    UNKNOWN(null);

    companion object : JsonEnum.Companion<MentionType>(::values, { UNKNOWN })
}
