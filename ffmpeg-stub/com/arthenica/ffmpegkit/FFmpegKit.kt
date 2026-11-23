package com.arthenica.ffmpegkit

// Stub used only when no com.arthenica ffmpeg-kit artifact can be resolved
// from Maven Central. It keeps the app compiling; FFmpeg export calls
// return a failure session, so the app reports export failure instead of
// crashing. The real library should be restored when it is available again.
// Types match how MainActivity uses the real library: session.returnCode,
// session.failStackTrace, executeAsync(cmd, executeCallback, null,
// statisticsCallback) and statistics.time.
class FFmpegSession(
    val returnCode: Int = 1,
    val failStackTrace: String? = null,
    val output: String? = null
)

class Log(val message: String = "")

class Statistics(
    val time: Long = 0L,
    val size: Long = 0L,
    val bitrate: Double = 0.0,
    val speed: Double = 0.0
)

object FFmpegKit {
    fun execute(command: String): FFmpegSession {
        return FFmpegSession(1)
    }

    fun executeAsync(command: String, executeCallback: (FFmpegSession) -> Unit): FFmpegSession {
        val session = FFmpegSession(1)
        executeCallback(session)
        return session
    }

    fun executeAsync(
        command: String,
        executeCallback: (FFmpegSession) -> Unit,
        logCallback: ((Log) -> Unit)?,
        statisticsCallback: ((Statistics) -> Unit)?
    ): FFmpegSession {
        val session = FFmpegSession(1)
        executeCallback(session)
        return session
    }

    fun cancel() {}
}
