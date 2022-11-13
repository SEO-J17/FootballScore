package io.github.seoj17.footballscore.data

data class Matches(
    val awayTeam: AwayTeam,
    val competition: Competition,
    val group: Any?,
    val homeTeam: HomeTeam,
    val id: Int,
    val lastUpdated: String,
    val matchday: Int,
    val score: Score,
    val stage: String,
    val status: String,
    val utcDate: String,
) {
    companion object {
        operator fun invoke(matchesData: Matches): Matches {
            return with(matchesData) {
                Matches(
                    awayTeam,
                    competition,
                    group,
                    homeTeam,
                    id,
                    lastUpdated,
                    matchday,
                    score,
                    stage,
                    status,
                    utcDate
                )
            }
        }
    }
}