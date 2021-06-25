package net.notjustanna.notionapi.model.database.property

interface NumberDatabaseProperty : DatabaseProperty {
    /**
     * How the number is displayed in Notion.
     */
    val format: NumberFormat
}
