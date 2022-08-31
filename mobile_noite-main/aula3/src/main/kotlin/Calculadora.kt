import kotlin.math.pow
import kotlin.math.sqrt

class Calculadora {
    fun somar(num1: Float, num2: Float): Float {
        return num1 + num2
    }

    fun subtrair(num1: Float, num2: Float): Float {
        return num1 - num2
    }

    fun multiplicar(num1: Float, num2: Float): Float {
        return num1 * num2
    }

    fun dividir(dividendo: Float,divisor: Float): Float {
        return dividendo / divisor
    }

    fun potencia(base:Double,expoente:Double):Double{
        return base.pow(expoente)
    }

    fun raizQuadrada(num:Double):Double{
        return sqrt(num)
    }

//    fun raizQuadrada(num:Double):Double = sqrt(num)

    fun restoDaDivisao(dividendo: Float,divisor: Float):Float = dividendo % divisor
}