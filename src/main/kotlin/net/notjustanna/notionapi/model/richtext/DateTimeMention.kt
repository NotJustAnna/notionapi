package net.notjustanna.notionapi.model.richtext

import java.time.OffsetDateTime

interface DateTimeMention : Mention {
    val start: OffsetDateTime
    val end: OffsetDateTime?
}
