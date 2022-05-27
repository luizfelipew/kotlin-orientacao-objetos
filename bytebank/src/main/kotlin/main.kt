fun main() {
    println("Bem vindo ao ByteBank")
    val luiz = Funcionario(
            nome = "Luiz",
            cpf = "111.111.111-11",
            salario = 1000.0
    )

    println("nome ${luiz.nome}")
    println("cpf ${luiz.cpf}")
    println("salario ${luiz.salario}")
    println("bonificação ${luiz.bonificacao}")
    println("#################################")


    val fran = Gerente(
            nome = "Fran",
            cpf = "222.222.222-22",
            salario = 2000.0,
            senha = 1234
    )

    println("nome ${fran.nome}")
    println("cpf ${fran.cpf}")
    println("salario ${fran.salario}")
    println("bonificação ${fran.bonificacao}")

    if (fran.autenticao(1234)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autenticação")
    }

    println("#################################")


    val gui = Diretor(
        nome = "Fran",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 4000,
        plr = 200.0
    )

    println("nome ${gui.nome}")
    println("cpf ${gui.cpf}")
    println("salario ${gui.salario}")
    println("bonificação ${gui.bonificacao}")
    println("plr ${gui.plr}")

    if (gui.autenticao(4000)) {
        println("autenticou com sucesso como diretor")
    } else {
        println("falha na autenticação")
    }
}