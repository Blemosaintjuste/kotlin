fun main(args: Array<String>) {
    val calculadora = Calculadora()

    val soma = calculadora.somar(34f,78.9f)
    val potencia = calculadora.potencia(4.0,7.0)

    println("O resultado da soma é $soma")
    println("O resultado da potência é $potencia")
}