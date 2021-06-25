package net.notjustanna.notionapi.model.user

import net.notjustanna.notionapi.utils.JsonEnum

enum class UserType(override val value: String?) : JsonEnum {
    PERSON("person"),
    BOT("bot"),
    UNKNOWN(null);

    companion object : JsonEnum.Companion<UserType>(UserType::values, { UNKNOWN })
}
