package net.notjustanna.notionapi.net.request.properties

import net.notjustanna.notionapi.model.database.property.DatabaseProperty
import net.notjustanna.notionapi.model.property.PropertyType
import net.notjustanna.notionapi.model.user.User

operator fun PropertiesBuilder.set(property: DatabaseProperty, value: User) {
    set(property.id, property.type, value)
}

operator fun PropertiesBuilder.set(property: String, value: User) {
    people(property, value)
}

operator fun PropertiesBuilder.set(property: String, type: PropertyType, value: User) {
    require(type == PropertyType.PEOPLE) { "Value only allowed for PEOPLE properties" }
    people(property, value)
}

operator fun PropertiesBuilder.set(property: DatabaseProperty, value: List<User>) {
    set(property.id, property.type, value)
}

operator fun PropertiesBuilder.set(property: String, value: List<User>) {
    people(property, value)
}

operator fun PropertiesBuilder.set(property: String, type: PropertyType, value: List<User>) {
    require(type == PropertyType.PEOPLE) { "Value only allowed for PEOPLE properties" }
    people(property, value)
}
