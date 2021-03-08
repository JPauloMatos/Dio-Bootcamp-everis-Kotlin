package me.jpaulo.collection

fun main() {
    val joao = Funcionario("João", 5000.0, "PJ")
    val pedro = Funcionario("Pedro", 2000.0, "CLT")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(maria.nome))

    println("_________________")
    repositorio.findAll().forEach { println(it) }

    println("_________________")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach { println(it) }


}