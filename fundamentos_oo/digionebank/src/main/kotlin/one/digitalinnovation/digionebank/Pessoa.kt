package one.digitalinnovation.digionebank

class Pessoa {
    var nome:String = "João"
    var cpf:String = "123.456.789-12"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main() {
    val pessoa = Pessoa()

    println(pessoa.pessoaInfo())
}
