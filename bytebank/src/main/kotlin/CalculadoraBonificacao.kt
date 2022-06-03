class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registro(funcionario: Funcionario) {
        println("Nome ${funcionario.nome} que recebeu a bonificação")
        this.total += funcionario.bonificacao
    }
}