package model

class Music(
    var title: String,
    var duration: Short,
    var musicGender: MusicGender,
    var yearOfRelease: Short,
    var album: String,
    var composer: String,
    var record: String
){
    override fun toString():String{
        return "A música $title foi escrita pela banda $composer no ano $yearOfRelease e gravada pela gravadora $record"
    }
}
