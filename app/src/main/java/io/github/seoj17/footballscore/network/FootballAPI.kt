package io.github.seoj17.footballscore.network

import io.github.seoj17.footballscore.data.FootballInfo
import retrofit2.http.GET
import retrofit2.http.Header

interface FootballAPI {
    @GET("/v4/matches")
    suspend fun getMatches(
        @Header("X-Auth-Token") authToken: String,
    ): FootballInfo
}