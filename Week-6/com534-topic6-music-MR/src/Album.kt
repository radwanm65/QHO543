class Album(val songs: List<Song>) : Music {
    override fun play() {
        // Example: play the first song
        if (songs.isNotEmpty()) {
            println("Playing album starting with: ${songs[0].title} by ${songs[0].artist}")
        }
    }
    override fun getInfo(): String {
        return "Album with ${songs.size} songs"
    }
    override fun getPlayingTime(): Double {
        return songs.sumOf { it.playingTime }
    }
    override fun getAllSongs(): List<Song> {
        return songs
    }
fun getSongsByArtist(album: Album, artistName: String): List<Song> {
    return album.songs.filter { it.artist.equals(artistName, ignoreCase = true) }
}
}