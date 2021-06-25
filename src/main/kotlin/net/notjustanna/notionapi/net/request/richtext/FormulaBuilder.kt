package net.notjustanna.notionapi.net.request.richtext

import net.notjustanna.notionapi.utils.jsonObjectOf

class FormulaBuilder : RichTextBuilder() {
    /**
     * The LaTeX string representing this inline equation.
     */
    var expressionBuilder = StringBuilder()

    operator fun String.unaryPlus() {
        expressionBuilder.append(this)
    }

    override fun toJson() = super.toJson().apply {
        put("equation", jsonObjectOf("expression" to expressionBuilder.toString()))
    }
}
