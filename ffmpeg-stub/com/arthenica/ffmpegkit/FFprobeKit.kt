package com.arthenica.ffmpegkit

// Stub used only when no com.arthenica ffmpeg-kit artifact can be resolved
// from Maven Central. See FFmpegKit.kt. Types match how MainActivity uses
// FFprobeKit: info.mediaInformation.duration (String) and
// info.mediaInformation.streams.any { it.type == "audio" }.
class StreamInformation(val type: String = "")

class MediaInformation(
    val duration: String = "0",
    val streams: List<StreamInformation> = emptyList()
)

class MediaInformationSession(val returnCode: Int = 1) {
    val mediaInformation: MediaInformation = MediaInformation()
}

object FFprobeKit {
    fun getMediaInformation(path: String): MediaInformationSession {
        return MediaInformationSession(1)
    }
}
