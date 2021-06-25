package net.notjustanna.notionapi.model.database.property

import net.notjustanna.notionapi.model.property.SelectOption

/**
 * Used for select and multi-select properties.
 */
interface SelectDatabaseProperty : DatabaseProperty {
    /**
     * Sorted list of options available for this property.
     */
    val options: List<SelectOption>
}
