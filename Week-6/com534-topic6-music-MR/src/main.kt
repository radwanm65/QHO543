fun main() {

    val songs = listOf(
            Song("Track One", "Coldplay", 210.1),
            Song("Track Two", "Adele", 180.0),
            Song("Track Three", "Coldplay", 240.0)
        )


    val single2 = Single(songs.first(), songs.last())


    val musicList2: List<Single> = listOf(single2)

    musicList2.forEach { item ->
        println(item.getInfo())
        println("Playing time: ${item.getPlayingTime()}")
        println(item.getAllSongs())
        item.play()
        println("PLAYING ... DONE")
    }

    val song1 = Song("Song A", "Artist A", 3.2)
    val song2 = Song("Song B", "Artist A", 3.8)
    val song3 = Song("Track X", "Band X", 4.1)
    val song4 = Song("Track Y", "Band X", 2.9)

    val single = Single(song1, song2)
    val album = Album(listOf(song3, song4))

    val musicList: List<Music> = listOf(single, album)

    // Iterate and call both interface methods
    musicList.forEach { item ->
        println(item.getInfo())
        item.play()
        println()
    }

    println("The Record Player Class Implementation /Task 1.4\n")
    val player = RecordPlayer("AudioTechnica", "AT-LP60X")
    player.power()
    player.setSpeed(45)
    player.play("Imagine - John Lennon")
    player.pause()
    player.stop()
    println(player)


}