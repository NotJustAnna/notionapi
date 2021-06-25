package net.notjustanna.notionapi.net.request

import net.notjustanna.notionapi.model.database.Database
import net.notjustanna.notionapi.model.page.Page
import net.notjustanna.notionapi.model.page.PageParent

fun Database.toParent(): PageParent = PageParent.Database(id)

fun Page.toParent(): PageParent = PageParent.Page(id)
