fun main() {

    val produtos = Produto()
    produtos.nome = "perfume"

    val vendedor1 = Vendedor()
    vendedor1.nome = "Fulano"
    vendedor1.cpf = "2233445566"
    vendedor1.produtoVendido = produtos.nome


    val cliente1 = Cliente()
    cliente1.nome = "Felizberto"
    cliente1.cpf = "12345678910"
    cliente1.dataNascimento = "21/02/1900"
    cliente1.produtoComprado = produtos.nome

    println("o nome do cliente é ${cliente1.nome}\nseu CPF é ${cliente1.cpf}\ne sua data de nascimento é ${cliente1.dataNascimento}")

    println(vendedor1.produtoVendido)

}

