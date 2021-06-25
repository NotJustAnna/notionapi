package net.notjustanna.notionapi.net.request.sort

import net.notjustanna.notionapi.model.database.property.DatabaseProperty

infix fun DatabaseProperty.sort(direction: Direction): Sort = Sort.Property(id, direction)
infix fun TimestampField.sort(direction: Direction): Sort = Sort.Timestamp(this, direction)


fun DatabaseProperty.sortAscending() = sort(Direction.ASCENDING)
fun TimestampField.sortAscending() = sort(Direction.ASCENDING)


fun DatabaseProperty.sortDescending() = sort(Direction.DESCENDING)
fun TimestampField.sortDescending() = sort(Direction.DESCENDING)
