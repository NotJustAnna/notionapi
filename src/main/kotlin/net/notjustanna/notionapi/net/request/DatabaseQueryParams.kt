package net.notjustanna.notionapi.net.request

import com.grack.nanojson.JsonArray
import net.notjustanna.notionapi.net.request.filter.Filter
import net.notjustanna.notionapi.net.request.sort.Sort
import net.notjustanna.notionapi.utils.buildJsonObject

class DatabaseQueryParams : CursorParams() {
    var filter: Filter? = null

    var sort: List<Sort>? = null

    internal fun toJson() = buildJsonObject {
        filter?.let { put("filter", it.toJson()) }
        sort?.let { put("sort", JsonArray(it.map(Sort::toJson))) }
        startCursor?.let { put("start_cursor", it) }
        pageSize?.let { put("page_size", it) }
    }
}
