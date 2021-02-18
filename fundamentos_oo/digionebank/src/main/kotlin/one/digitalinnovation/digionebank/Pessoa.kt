package one.digitalinnovation.digionebank

class Pessoa {
    var nome:String = "João"

    var cpf:String = "123.456.789-12"
    private set
}

fun main() {
    val pessoa = Pessoa()

    println(pessoa.nome)
    println(pessoa.cpf)
}
