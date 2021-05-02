package sygus.lang

class FunctionDef(val name: String, val signature: Signature, val body: ASTNode) {

    override fun toString(): String {
        return """
            (define-fun $name $signature
                $body
            )
        """.trimIndent()
    }
}

class Signature(val resultType: TypeName, vararg val params: Pair<String, TypeName>) {

    override fun toString(): String {
        val paramsStr = params.joinToString(separator = " ") {
            "(${it.first} ${it.second})"
        }
        return "($paramsStr) $resultType"
    }
}

class ASTNode(val symbol: String, vararg val children: ASTNode) {

    override fun toString(): String {
        return if (children.isEmpty())
            symbol
        else
            "($symbol ${children.joinToString(separator = " ")})"
    }
}



