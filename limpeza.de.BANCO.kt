fun limparContas(emails: List<String?>) {
    var contasInvalidas = 0

    for (email in emails) {
        val tamanho = email?.length ?: 0

        if (email == null || tamanho == 0) {
            contasInvalidas++
            println("Conta inválida: será deletada.")
        } else {
            println("Conta válida: $email")
        }
    }

    println("Total de contas que precisam ser apagadas: $contasInvalidas")
}

fun main() {
    val emails = listOf(
        "ana@email.com",
        null,
        "",
        "joao@email.com",
        "maria@email.com",
        null
    )

    limparContas(emails)
}