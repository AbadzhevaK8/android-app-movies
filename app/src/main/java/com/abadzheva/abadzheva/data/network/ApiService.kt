package com.abadzheva.abadzheva.data.network

import com.abadzheva.abadzheva.data.models.Movies
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("/shows")
    suspend fun getAllMovies() : Response<List<Movies>>
}