package com.arthenica.ffmpegkit

// Stub used only when no com.arthenica ffmpeg-kit artifact can be resolved
// from Maven Central. See FFmpegKit.kt.
object ReturnCode {
    fun isSuccess(returnCode: Int): Boolean {
        return returnCode == 0
    }

    fun isCancel(returnCode: Int): Boolean {
        return returnCode == 255
    }
}
