package io.github.seoj17.footballscore.utils

object StatusSet {
    private const val GAME_STATE = "TIMED"
    private const val GAME_PROGRESS = "진행중"
    private const val GAME_FINISH = "종료"
    const val DEFAULT_SCORE = "-"

    fun getStatus(state: String) = status(state)

    private fun status(status: String): String {
        return if (status == GAME_STATE) {
            GAME_PROGRESS
        } else {
            GAME_FINISH
        }
    }
}