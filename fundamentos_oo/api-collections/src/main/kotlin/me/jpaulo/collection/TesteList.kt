package me.jpaulo.collection

fun main() {

    val joao = Funcionario("João", 5000.0, "PJ")
    val pedro = Funcionario("Pedro", 2000.0, "CLT")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach{ println(it) }
    println("_______________")
    println(funcionarios.find {it.nome == "Maria" })

    println("_______________")
    funcionarios.sortedBy { it.salario }.forEach { println(it) }

    println("_______________")
        funcionarios.groupBy { it.tipoContratacao }.forEach{ println(it)}

    println("_______________")


}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
) {
    override fun toString(): String =
        """
            Nome: $nome
            Salario: $salario
        """.trimIndent()
}
