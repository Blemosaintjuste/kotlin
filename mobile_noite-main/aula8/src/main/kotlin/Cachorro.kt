class Cachorro(
    var raca:String,
    peso: Float,
    altura: Short
) : Mamifero(
    peso,
    altura
){
    override fun comer():String = "Estou Comendo ração de cachorro!!!"
    override fun emitirSom():String = "Estou latindo como um cachorro!!!"
    override fun amamentar(): String = "Vou amamentar como um cachorro!!!"
}