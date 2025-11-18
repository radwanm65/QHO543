class Single (val aSide: Song, val bSide: Song) : Music {

    override fun play() {
        // Singles don't have title/artist directly unless your Music interface defines them.
        // If you intended to play the A-side:
        println("Playing song: ${aSide.title} by ${aSide.artist}")
    }

    override fun getInfo(): String {
        return "A-Side Song: ${aSide.title} by ${aSide.artist}"
    }

    override fun getPlayingTime(): Double {
        return aSide.playingTime + bSide.playingTime
    }

    override fun getAllSongs(): List<Song> {
        return listOf(aSide, bSide)
    }
}