package net.notjustanna.notionapi.model.richtext

import net.notjustanna.notionapi.model.user.User

interface UserMention : Mention {
    val value: User
}
