package me.jpaulo.collection

fun main() {
    val joao = Funcionario("João", 5000.0, "PJ")
    val pedro = Funcionario("Pedro", 2000.0, "CLT")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    println("_____ LIST ______")
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    println("_______________")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("_______________")
    funcionarios.remove(maria)
    funcionarios.forEach { println(it) }

    println("______ SET_______")

    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach { println(it) }

    println("_______________")
    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)
    funcionarioSet.forEach { println(it) }

    println("_______________")
    funcionarioSet.remove(pedro)
    funcionarioSet.forEach { println(it) }


}