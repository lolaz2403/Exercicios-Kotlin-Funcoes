fun auditarEntregas(enderecos: List<String?>) {
    for (endereco in enderecos) {
        val enderecoFinal = endereco ?: "Endereço Desconhecido"

        if (endereco == null) {
            println("Entrega Pendente: Falta de dados")
        } else {
            println("Rota traçada para: $enderecoFinal")
        }
    }
}

fun main() {
    val enderecos = listOf(
        "Rua das Flores, 10",
        null,
        "Avenida Central, 200",
        null
    )

    auditarEntregas(enderecos)
}