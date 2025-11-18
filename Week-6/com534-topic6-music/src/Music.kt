interface Music {
    val title: String
    val artist: String

    fun play()              // common action for any music item
    fun getInfo(): String   // returns a description of the music

    fun getPlayingTime(): Double

    fun getAllSongs(): List<Song>

}