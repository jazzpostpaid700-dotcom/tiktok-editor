package com.arthenica.ffmpegkit

// Stub used only when no com.arthenica ffmpeg-kit artifact can be resolved
// from Maven Central. See FFmpegKit.kt.
class MediaInformation(val duration: String = "0")

class MediaInformationSession(val returnCode: Int = 1) {
    val mediaInformation: MediaInformation? = null
}

object FFprobeKit {
    fun getMediaInformation(path: String): MediaInformationSession {
        return MediaInformationSession(1)
    }
}
