package net.notjustanna.notionapi.model.richtext

import java.time.LocalDate

interface DateMention : Mention {
    val start: LocalDate
    val end: LocalDate?
}
