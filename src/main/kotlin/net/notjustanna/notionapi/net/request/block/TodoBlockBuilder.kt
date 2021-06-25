package net.notjustanna.notionapi.net.request.block

import net.notjustanna.notionapi.model.block.BlockType
import net.notjustanna.notionapi.net.request.annotation.NotionDsl

@NotionDsl
class TodoBlockBuilder : TextBlockWithChildrenBuilder(BlockType.TO_DO) {
    /**
     * Whether the to_do is checked or not.
     */
    var checked: Boolean? = null

    override fun blockSpecificData() = super.blockSpecificData().apply {
        checked?.let { put("checked", it) }
    }
}
