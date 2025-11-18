interface Music {

    /** Play the music item */
    fun play()

    /** Return a human-readable description */
    fun getInfo(): String

    /** Length in seconds (or minutes—your choice) */
    fun getPlayingTime(): Double

    /** List all songs this music item contains */
    fun getAllSongs(): List<Song>
}