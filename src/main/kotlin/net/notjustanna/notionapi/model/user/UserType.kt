package net.notjustanna.notionapi.model.user

import net.notjustanna.notionapi.utils.JsonEnum
import net.notjustanna.notionapi.utils.lowercaseOfName

enum class UserType : JsonEnum {
    PERSON,
    BOT;

    override val value by lowercaseOfName()

    companion object : JsonEnum.Companion<UserType>(::values)
}
