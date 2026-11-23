package com.arthenica.ffmpegkit

// Stub used only when no com.arthenica ffmpeg-kit artifact can be resolved
// from Maven Central. It keeps the app compiling; FFmpeg export calls
// return a failure session, so the app reports export failure instead of
// crashing. The real library should be restored when it is available again.
class FFmpegSession(val returnCode: Int = 1)

object FFmpegKit {
    fun execute(command: String): FFmpegSession {
        return FFmpegSession(1)
    }

    fun executeAsync(command: String, executeCallback: (FFmpegSession) -> Unit): FFmpegSession {
        val session = FFmpegSession(1)
        executeCallback(session)
        return session
    }

    fun cancel() {}
}
