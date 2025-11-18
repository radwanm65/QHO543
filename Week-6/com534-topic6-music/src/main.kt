fun main() {

    val album = Album(
        songs = listOf(
            Song("Track One", "Coldplay", 210.1),
            Song("Track Two", "Adele", 180.0),
            Song("Track Three", "Coldplay", 240.0)
        )
    )
//Accept an artist name as a String parameter
    print("Enter an artist name: ")
    val inputArtist = readLine().orEmpty()   // safely handle null input

    val result = getSongsByArtist(album, inputArtist)

//Use the filter() method to process the album's song list
    val matchingSongs: List<Song> = album.songs.filter { song ->
        song.artist.equals(inputArtist, ignoreCase = true)
    }
// Handle cases where no songs match (returning an empty list)
    if (matchingSongs.isEmpty()) {
        println("No songs found by \"$inputArtist\"")
        // Return a List<Song> containing only songs by the specified artist
    } else {
        println("Songs by $inputArtist:")
        matchingSongs.forEach { println("- ${it.title}") }
    }

    println(result)   // → list of Song objects by Input Artist Name

    fun printSongTitles(music: Music) {
        music.getAllSongs().forEach {
            println(String.format("Song: %s ", it.title))}
    }

}