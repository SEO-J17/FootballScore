package io.github.seoj17.footballscore.utils

import io.github.seoj17.footballscore.data.FootballInfo
import io.github.seoj17.footballscore.data.Matches

object QueryUtils {
    private val dataSet = mutableListOf<Matches>()
    fun extractData(matchInfo: FootballInfo?): List<Matches> {
        return (matchInfo?.matches?.map { matches ->
            Matches(matches)
        } ?: listOf()).also {
            dataSet.addAll(it)
        }
    }
}