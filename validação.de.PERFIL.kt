fun validarBioInfantil(biografia: String?) {
    val tamanho = biografia?.length ?: 0

    if (tamanho <= 50) {
        println("Bio aceita")
    } else {
        println("Bio muito longa")
    }
}

fun main() {
    validarBioInfantil("Gosto de desenhos e animais")
    validarBioInfantil(null)
    validarBioInfantil("Esta é uma biografia de exemplo que ultrapassa cinquenta caracteres.")
}