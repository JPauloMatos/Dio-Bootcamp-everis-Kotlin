package me.jpaulo.collection

fun main() {
    val joao = Funcionario("João", 5000.0, "PJ")
    val pedro = Funcionario("Pedro", 2000.0, "CLT")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionarios1 = setOf(maria, pedro)
    val funcionarios2 = setOf(joao)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }

    println("______________")
    val funcionarios3 = setOf(maria, pedro, joao)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }

    println("_______________")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }
}