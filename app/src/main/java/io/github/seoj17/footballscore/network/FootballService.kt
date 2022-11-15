package io.github.seoj17.footballscore.network

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object FootballService {
    private const val REQUEST_URL = "https://api.football-data.org"
    private const val AUTH_TOKEN = "ca3c4e5c4ffd4022baa96466f948d4ae"
    private const val TIME_OUT = 10000L
    private val interceptor = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)

    private val client =
        OkHttpClient.Builder()
            .addInterceptor(interceptor)
            .connectTimeout(TIME_OUT, TimeUnit.MILLISECONDS)
            .build()

    private val requestObject =
        Retrofit.Builder()
            .baseUrl(REQUEST_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()

    private val api = requestObject.create(FootballAPI::class.java)

    suspend fun getMatchesInfo() = api.getMatches(AUTH_TOKEN)

}