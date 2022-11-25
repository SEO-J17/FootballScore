package io.github.seoj17.footballscore.utils

import io.github.seoj17.footballscore.data.FootballInfo
import io.github.seoj17.footballscore.data.Matches
import io.github.seoj17.footballscore.data.Squad
import io.github.seoj17.footballscore.data.TeamDetail

object QueryUtils {
    private val dataSet = mutableListOf<Matches>()
    private val teamDetailData = mutableListOf<Squad>()
    fun extractData(matchInfo: FootballInfo?): List<Matches> {
        return (matchInfo?.matches?.map { matches ->
            Matches(matches)
        } ?: listOf()).also {
            dataSet.addAll(it)
        }
    }

    fun extractDetailTeam(teamDetail: TeamDetail?): List<Squad> {
        return (teamDetail?.squad?.map { player ->
            Squad(player)
        } ?: listOf()).also {
            teamDetailData.addAll(it)
        }
    }
}
