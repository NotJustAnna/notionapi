package net.notjustanna.notionapi.model.user

interface Person : User {
    /**
     * Email address of person.
     */
    val email: String
}
