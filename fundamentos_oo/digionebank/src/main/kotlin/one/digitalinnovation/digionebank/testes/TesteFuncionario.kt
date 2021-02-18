package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {

    val pessoa = Pessoa(nome = "João", "123.456.789-12")
    println(pessoa.nome)
    println(pessoa.cpf)

    val funcionario = Funcionario(nome = "Paulo", cpf = "123.098.765-43", salario = BigDecimal.valueOf(2000.0))
    println(funcionario.nome)
    println(funcionario.cpf)
    println(funcionario.salario)

}
