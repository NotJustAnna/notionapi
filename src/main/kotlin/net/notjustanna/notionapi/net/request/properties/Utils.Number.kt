package net.notjustanna.notionapi.net.request.properties

import net.notjustanna.notionapi.model.database.property.DatabaseProperty
import net.notjustanna.notionapi.model.property.PropertyType

operator fun PropertiesBuilder.set(property: DatabaseProperty, value: Number) {
    set(property.id, property.type, value)
}

operator fun PropertiesBuilder.set(property: String, value: Number) {
    number(property, value)
}

operator fun PropertiesBuilder.set(property: String, type: PropertyType, value: Number) {
    require(type == PropertyType.NUMBER) { "Value only allowed for Number properties" }
    number(property, value)
}
