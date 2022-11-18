package io.github.seoj17.footballscore.network

import io.github.seoj17.footballscore.data.FootballInfo
import io.github.seoj17.footballscore.data.TeamDetail
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

interface FootballAPI {
    @GET("/v4/matches")
    suspend fun getMatches(): FootballInfo

    @GET("/v4/teams/{id}")
    suspend fun getTeamInfo(@Path("id") id: Int): TeamDetail
}