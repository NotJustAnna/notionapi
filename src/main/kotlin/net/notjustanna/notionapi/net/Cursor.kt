package net.notjustanna.notionapi.net

import net.notjustanna.notionapi.utils.AsyncCursorResponse

interface Cursor<T> {
    val results: List<T>
    val hasMore: Boolean
    val nextCursor: String?

    fun next(): AsyncCursorResponse<T>
}
