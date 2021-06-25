package net.notjustanna.notionapi.model.database.property

interface FormulaDatabaseProperty : DatabaseProperty {
    /**
     * Formula to evaluate for this property.
     */
    val expression: String
}
