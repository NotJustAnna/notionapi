package net.notjustanna.notionapi.model.block

import net.notjustanna.notionapi.model.richtext.RichText

/**
 * A block object representing text within Notion.
 */
interface TextBlock : Block {
    /**
     * Rich text in the block.
     */
    val text: List<RichText>
}
