package net.notjustanna.notionapi.net

import java.net.http.HttpHeaders

interface Response<T> {
    val body: T
    val headers: HttpHeaders
    val statusCode: Int
    val rawBody: String
    val rawJsonBody: Any?
}
