class RecordPlayer(val brand: String, val model: String) {
    private var powerOn: Boolean = false
    private var isPlaying: Boolean = false
    private var currentTrack: String? = null
    private var speed: Int = 33 // default RPM

    // Toggle power
    fun power() {
        powerOn = !powerOn
        val state = if (powerOn) "on" else "off"
        println("$brand $model powered $state.")
    }

    // Set playback speed
    fun setSpeed(rpm: Int) {
        if (rpm in listOf(33, 45, 78)) {
            speed = rpm
            println("Playback speed set to $speed RPM.")
        } else {
            println("Invalid speed. Valid options: 33, 45, 78 RPM.")
        }
    }

    // Play a track
    fun play(track: String) {
        if (!powerOn) {
            println("Turn on the record player first.")
            return
        }
        currentTrack = track
        isPlaying = true
        println("Playing '$currentTrack' at $speed RPM.")
    }

    // Pause playback
    fun pause() {
        if (isPlaying) {
            isPlaying = false
            println("Paused '$currentTrack'.")
        } else {
            println("No track is currently playing.")
        }
    }

    // Stop playback
    fun stop() {
        if (isPlaying || currentTrack != null) {
            println("Stopped '$currentTrack'.")
            isPlaying = false
            currentTrack = null
        } else {
            println("No track is currently playing.")
        }
    }

    // Display status
    override fun toString(): String {
        val status = if (powerOn) "on" else "off"
        val playing = if (isPlaying) "playing '$currentTrack'" else "not playing"
        return "$brand $model | Power: $status | $playing | Speed: $speed RPM"
    }
}
