package net.notjustanna.notionapi.model.block

import net.notjustanna.notionapi.model.richtext.RichText

interface TextBlock : Block {
    /**
     * Rich text in the block.
     */
    val text: List<RichText>
}
