fun main(args: Array<String>) {
    val caramelo = Cachorro(
        "Vira-lata",
        4f,
        120
    )

    println(caramelo.comer())
    println(caramelo.emitirSom())
    println(caramelo.amamentar())

    //val hugo = Animal(45f,3000) // Não faz sentido
}