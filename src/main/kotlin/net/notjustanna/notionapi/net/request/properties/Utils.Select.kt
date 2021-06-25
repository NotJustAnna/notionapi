package net.notjustanna.notionapi.net.request.properties

import net.notjustanna.notionapi.model.database.property.DatabaseProperty
import net.notjustanna.notionapi.model.property.PropertyType
import net.notjustanna.notionapi.model.property.SelectOption

operator fun PropertiesBuilder.set(property: DatabaseProperty, value: SelectOption) {
    set(property.id, property.type, value)
}

operator fun PropertiesBuilder.set(property: String, value: SelectOption) {
    select(property, value)
}

operator fun PropertiesBuilder.set(property: String, type: PropertyType, value: SelectOption) {
    if (type == PropertyType.MULTI_SELECT) {
        multiSelect(property, listOf(value))
        return
    }
    require(type == PropertyType.SELECT) { "Value only allowed for SELECT properties" }
    select(property, value)
}

operator fun PropertiesBuilder.set(property: DatabaseProperty, value: List<SelectOption>) {
    set(property.id, property.type, value)
}

operator fun PropertiesBuilder.set(property: String, value: List<SelectOption>) {
    multiSelect(property, value)
}

operator fun PropertiesBuilder.set(property: String, type: PropertyType, value: List<SelectOption>) {
    if (type == PropertyType.SELECT) {
        require(value.size == 1) { "Multiple values given for single SELECT property" }
        return select(property, value.single())
    }
    require(type == PropertyType.MULTI_SELECT) { "Value only allowed for MULTI-SELECT properties" }
    multiSelect(property, value)
}
