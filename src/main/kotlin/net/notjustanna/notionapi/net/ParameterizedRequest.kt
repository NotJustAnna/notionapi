package net.notjustanna.notionapi.net

import net.notjustanna.notionapi.utils.Closure

interface ParameterizedRequest<T> : Request {
    val params: T

    fun params(block: Closure<T>)
}
