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

/**
 * The interface for interacting with the Notion API.
 * Also check the [Notion API Reference](https://developers.notion.com/reference).
 *
 * @see NotionApi.Companion.invoke
 */
interface NotionApi {
    /**
     * [Notion API Page about this REST call](https://developers.notion.com/reference/get-database).
     */
    fun retrieveDatabase(
        id: String,
        block: RequestClosure = {}
    ): AsyncResponse<Database>

    /**
     * [Notion API Page about this REST call](https://developers.notion.com/reference/post-database-query).
     */
    fun queryDatabase(
        id: String,
        block: ParameterizedRequest<DatabaseQueryParams>.() -> Unit = {}
    ): AsyncCursorResponse<Page>

    /**
     * [Notion API Page about this REST call](https://developers.notion.com/reference/get-databases).
     */
    fun listDatabases(
        block: ParameterizedRequestClosure<CursorParams> = {}
    ): AsyncCursorResponse<Database>

    /**
     * [Notion API Page about this REST call](https://developers.notion.com/reference/get-page).
     */
    fun retrievePage(
        id: String,
        block: RequestClosure = {}
    ): AsyncResponse<Page>

    /**
     * [Notion API Page about this REST call](https://developers.notion.com/reference/post-page).
     */
    fun createPage(
        block: ParameterizedRequestClosure<CreatePageParams> = {}
    ): AsyncResponse<Page>

    /**
     * [Notion API Page about this REST call](https://developers.notion.com/reference/patch-page).
     */
    fun updatePage(
        id: String,
        block: ParameterizedRequestClosure<PropertiesBuilder> = {}
    ): AsyncResponse<Page>

    /**
     * [Notion API Page about this REST call](https://developers.notion.com/reference/get-block-children).
     */
    fun retrieveBlockChildren(
        id: String,
        block: ParameterizedRequestClosure<CursorParams> = {}
    ): AsyncCursorResponse<Block>

    /**
     * [Notion API Page about this REST call](https://developers.notion.com/reference/patch-block-children).
     */
    fun appendBlockChildren(
        id: String,
        block: ParameterizedRequestClosure<PageBuilder> = {}
    ): AsyncResponse<Block>

    /**
     * [Notion API Page about this REST call](https://developers.notion.com/reference/get-user).
     */
    fun retrieveUser(
        id: String,
        block: RequestClosure = {}
    ): AsyncResponse<User>

    /**
     * [Notion API Page about this REST call](https://developers.notion.com/reference/get-users).
     */
    fun listUsers(
        block: ParameterizedRequestClosure<CursorParams> = {}
    ): AsyncCursorResponse<User>

    /**
     * [Notion API Page about this REST call](https://developers.notion.com/reference/post-search).
     */
    fun search(
        block: ParameterizedRequestClosure<SearchParams> = {}
    ): AsyncCursorResponse<NotionObject>

    companion object {
        /**
         * Configures and creates a Notion API instance.
         */
        operator fun invoke(block: NotionApiBuilder.() -> Unit): NotionApi {
            return NotionApiBuilder().apply(block).build()
        }
    }
}
