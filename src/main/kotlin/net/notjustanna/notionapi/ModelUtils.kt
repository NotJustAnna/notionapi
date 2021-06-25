package net.notjustanna.notionapi

import net.notjustanna.notionapi.model.block.Block
import net.notjustanna.notionapi.model.page.Page
import net.notjustanna.notionapi.net.request.CursorParams
import net.notjustanna.notionapi.utils.AsyncCursorResponse
import net.notjustanna.notionapi.utils.ParameterizedRequestClosure

fun Page.retrieveBlockChildren(
    notion: NotionApi,
    block: ParameterizedRequestClosure<CursorParams> = {}
): AsyncCursorResponse<Block> {
    return notion.retrieveBlockChildren(id, block)
}

fun Block.retrieveBlockChildren(
    notion: NotionApi,
    block: ParameterizedRequestClosure<CursorParams> = {}
): AsyncCursorResponse<Block> {
    return notion.retrieveBlockChildren(id, block)
}
