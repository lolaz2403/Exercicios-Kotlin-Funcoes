fun main() {
    val calcularGorjeta: (Double?) -> Double = {
        if (it == null || it < 0) {
            0.0
        } else {
            it
        }
    }

    println("Gorjeta: ${calcularGorjeta(15.0)}")
    println("Gorjeta: ${calcularGorjeta(null)}")
    println("Gorjeta: ${calcularGorjeta(-5.0)}")
    println("Gorjeta: ${calcularGorjeta(0.0)}")
}