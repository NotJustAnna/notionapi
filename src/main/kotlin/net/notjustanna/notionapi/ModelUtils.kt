package net.notjustanna.notionapi

import net.notjustanna.notionapi.model.block.Block
import net.notjustanna.notionapi.model.block.ChildPageBlock
import net.notjustanna.notionapi.model.database.Database
import net.notjustanna.notionapi.model.page.Page
import net.notjustanna.notionapi.model.page.PageParent
import net.notjustanna.notionapi.net.request.CursorParams
import net.notjustanna.notionapi.net.request.block.PageBuilder
import net.notjustanna.notionapi.utils.AsyncCursorResponse
import net.notjustanna.notionapi.utils.AsyncResponse
import net.notjustanna.notionapi.utils.ParameterizedRequestClosure
import net.notjustanna.notionapi.utils.RequestClosure

fun Page.retrieveBlockChildren(
    notion: NotionApi,
    block: ParameterizedRequestClosure<CursorParams> = {}
): AsyncCursorResponse<Block> {
    return notion.retrieveBlockChildren(id, block)
}

fun ChildPageBlock.retrieve(
    notion: NotionApi,
    block: RequestClosure = {}
): AsyncResponse<Page> {
    return notion.retrievePage(id, block)
}

fun PageParent.Page.retrieve(
    notion: NotionApi,
    block: RequestClosure = {}
): AsyncResponse<Page> {
    return notion.retrievePage(id, block)
}

fun PageParent.Database.retrieve(
    notion: NotionApi,
    block: RequestClosure = {}
): AsyncResponse<Database> {
    return notion.retrieveDatabase(id, block)
}

fun Page.appendBlockChildren(
    notion: NotionApi,
    block: ParameterizedRequestClosure<PageBuilder> = {}
): AsyncResponse<Block> {
    return notion.appendBlockChildren(id, block)
}

fun Block.retrieveBlockChildren(
    notion: NotionApi,
    block: ParameterizedRequestClosure<CursorParams> = {}
): AsyncCursorResponse<Block> {
    return notion.retrieveBlockChildren(id, block)
}
