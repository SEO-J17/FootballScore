package io.github.seoj17.footballscore.data

data class MatchTime(
    val away: Int?,
    val home: Int?
) {

    fun getHomeScore() = home ?: DEFAULT_SCORE

    fun getAwayScore() = away ?: DEFAULT_SCORE

    companion object {
        private const val DEFAULT_SCORE = "-"
    }
}