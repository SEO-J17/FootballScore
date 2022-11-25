package io.github.seoj17.footballscore.network

import io.github.seoj17.footballscore.BuildConfig
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object FootballService {
    private const val REQUEST_URL = "https://api.football-data.org"
    private const val AUTH_TOKEN = "ca3c4e5c4ffd4022baa96466f948d4ae"
    private const val TIME_OUT = 10000L
    private val httpInterceptor = HttpLoggingInterceptor().apply {
        level = if (BuildConfig.DEBUG) {
            HttpLoggingInterceptor.Level.BODY
        } else {
            HttpLoggingInterceptor.Level.NONE
        }
    }

    private val authInterceptor = Interceptor { chain ->
        chain.proceed(
            chain.request()
                .newBuilder()
                .addHeader("X-Auth-Token", AUTH_TOKEN)
                .build()
        )
    }

    private val client =
        OkHttpClient.Builder()
            .addInterceptor(httpInterceptor)
            .addInterceptor(authInterceptor)
            .connectTimeout(TIME_OUT, TimeUnit.MILLISECONDS)
            .build()

    private val requestObject =
        Retrofit.Builder()
            .baseUrl(REQUEST_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()

    private val api = requestObject.create(FootballAPI::class.java)

    suspend fun getMatchesInfo() = api.getMatches()

}