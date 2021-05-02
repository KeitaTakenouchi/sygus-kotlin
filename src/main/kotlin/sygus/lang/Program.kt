package sygus.lang

class FunctionDef(val name: String, val signature: Signature, val body: ASTNode, val logicName: String? = null) {

    fun apply(vararg args: String): String {
        // check arguments' type
        require(args.size == signature.paramTypes.size) { "arguments ${args.joinToString(" ")} are invalid for $signature" }
        signature.paramTypes.forEachIndexed { i, (_, type) ->
            require(type.isValid(args[i])) { "invalid value ${args[i]} for type $type" }
        }

        // evaluation
        val smtlibStr = "($name " + args.joinToString(separator = " ") + ")"
        return SMT(logicName).evalFuncInvocation(this, smtlibStr)
    }

    override fun toString(): String {
        return """
            (define-fun $name $signature
                $body
            )
        """.trimIndent()
    }
}

class Signature(val resultType: TypeName, vararg val paramTypes: Pair<String, TypeName>) {

    override fun toString(): String {
        val paramsStr = paramTypes.joinToString(separator = " ") {
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
