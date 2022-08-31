fun main(args: Array<String>) {
    val geometria = Geometria()

    val areaDoCirculo = geometria.calcularAreaDoCirculo(15.0)
    val areaDoTriangulo = geometria.calcularAreaDoTriangulo(2f,3f)
    val circunferenciaDoCirculo = geometria.calcularCircunferenciaDoCirculo(15f)

    println("Área do círculo: $areaDoCirculo")
    println("Área do triângulo: $areaDoTriangulo")
    println("Circuncferência do círculo: $circunferenciaDoCirculo")
}