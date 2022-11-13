package io.github.seoj17.footballscore.data


data class Score(
    val duration: String?,
    val fullTime: FullTime,
    val halfTime: HalfTime,
    val winner: String?
)