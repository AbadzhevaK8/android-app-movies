package com.abadzheva.abadzheva.data.network

import com.abadzheva.abadzheva.data.models.Movie
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("/shows")
    suspend fun getTopMovies() : Response<List<Movie>>
}