package io.github.seoj17.footballscore.data

data class Matches(
    val awayTeam: TeamInfo,
    val competition: Competition,
    val group: Any?,
    val homeTeam: TeamInfo,
    val id: Int,
    val lastUpdated: String,
    val matchday: Int,
    val score: Score,
    val stage: String,
    val status: String,
    val utcDate: String,
) {

    fun getState(): String {
        return when (status) {
            "TIMED" -> {
                "진행중"
            }
            "FINISHED" -> {
                "종료"
            }
            "SCHEDULED " -> {
                "예정"
            }
            else -> {
                "취소"
            }
        }
    }

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