class Album(val songs: List<Song>) {

}
fun getSongsByArtist(album: Album, artistName: String): List<Song> {
    return album.songs.filter { it.artist.equals(artistName, ignoreCase = true) }
}
