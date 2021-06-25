package net.notjustanna.notionapi.model.property

import net.notjustanna.notionapi.utils.JsonEnum

enum class PropertyType : JsonEnum {
    TITLE, RICH_TEXT, NUMBER, SELECT, MULTI_SELECT, DATE, PEOPLE, FILES, CHECKBOX, URL, EMAIL, PHONE_NUMBER, FORMULA,
    RELATION, ROLLUP, CREATED_TIME, CREATED_BY, LAST_EDITED_TIME, LAST_EDITED_BY, UNKNOWN;

    override val value: String by lazy {
        require(this != UNKNOWN) { "Unsupported property" }
        this.name.lowercase()
    }

    companion object : JsonEnum.Companion<PropertyType>(::values, { UNKNOWN })
}
