package net.notjustanna.notionapi.model.block

interface ChildPageBlock : Block {
    /**
     * Plain text of page title.
     */
    val title: String
}
