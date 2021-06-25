package net.notjustanna.notionapi

import net.notjustanna.notionapi.model.NotionApiBuilder
import net.notjustanna.notionapi.model.NotionObject
import net.notjustanna.notionapi.model.block.Block
import net.notjustanna.notionapi.model.database.Database
import net.notjustanna.notionapi.model.page.Page
import net.notjustanna.notionapi.model.user.User
import net.notjustanna.notionapi.net.ParameterizedRequest
import net.notjustanna.notionapi.net.request.CreatePageParams
import net.notjustanna.notionapi.net.request.CursorParams
import net.notjustanna.notionapi.net.request.DatabaseQueryParams
import net.notjustanna.notionapi.net.request.SearchParams
import net.notjustanna.notionapi.net.request.block.PageBuilder
import net.notjustanna.notionapi.net.request.properties.PropertiesBuilder
import net.notjustanna.notionapi.utils.AsyncCursorResponse
import net.notjustanna.notionapi.utils.AsyncResponse
import net.notjustanna.notionapi.utils.ParameterizedRequestClosure
import net.notjustanna.notionapi.utils.RequestClosure

interface NotionApi {
    fun retrieveDatabase(
        id: String,
        block: RequestClosure = {}
    ): AsyncResponse<Database>

    fun queryDatabase(
        id: String,
        block: ParameterizedRequest<DatabaseQueryParams>.() -> Unit = {}
    ): AsyncCursorResponse<Page>

    fun listDatabases(
        block: ParameterizedRequestClosure<CursorParams> = {}
    ): AsyncCursorResponse<Database>

    fun retrievePage(
        id: String,
        block: RequestClosure = {}
    ): AsyncResponse<Page>

    fun createPage(
        block: ParameterizedRequestClosure<CreatePageParams> = {}
    ): AsyncResponse<Page>

    fun updatePage(
        id: String,
        block: ParameterizedRequestClosure<PropertiesBuilder> = {}
    ): AsyncResponse<Page>

    fun retrieveBlockChildren(
        id: String,
        block: ParameterizedRequestClosure<CursorParams> = {}
    ): AsyncCursorResponse<Block>

    fun appendBlockChildren(
        id: String,
        block: ParameterizedRequestClosure<PageBuilder> = {}
    ): AsyncResponse<Block>

    fun retrieveUser(
        id: String,
        block: RequestClosure = {}
    ): AsyncResponse<User>

    fun listUsers(
        block: ParameterizedRequestClosure<CursorParams> = {}
    ): AsyncCursorResponse<User>

    fun search(
        block: ParameterizedRequestClosure<SearchParams> = {}
    ): AsyncCursorResponse<NotionObject>

    companion object {
        operator fun invoke(block: NotionApiBuilder.() -> Unit): NotionApi {
            return NotionApiBuilder().apply(block).build()
        }
    }
}
