package io.github.seoj17.footballscore.data


data class Score(
    val duration: String?,
    val fullTime: MatchTime,
    val halfTime: MatchTime,
    val winner: String?
)