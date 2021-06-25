package net.notjustanna.notionapi.net

import net.notjustanna.notionapi.net.request.annotation.NotionDsl
import net.notjustanna.notionapi.utils.Closure

interface ParameterizedRequest<T> : Request {
    val params: T

    @NotionDsl
    fun params(block: Closure<T>)
}
