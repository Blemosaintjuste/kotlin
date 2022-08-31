fun main(){
    var leonardo = Compositor()
    leonardo.nome = "Leonardo"
    leonardo.idade = 55

    val gustavo = Compositor()
    gustavo.nome = "Gustavo Lima"
    gustavo.idade = 35

    val hardRecords = Gravadora()
    hardRecords.nome = "Hard Records LTDA"

    val beforeIForget = Musica()
    beforeIForget.album = "All Hope is Gone"
    beforeIForget.anoDeLancamento = 2002

    beforeIForget.compositor = leonardo
    beforeIForget.gravadora = hardRecords
    beforeIForget.titulo = "Before I Forget"

    println(leonardo)
    println(gustavo)

    println("Nome do compositor da música ${beforeIForget.titulo} é o ${beforeIForget.compositor?.nome?.uppercase()}")
}