package com.abadzheva.abadzheva.data.network

import javax.inject.Inject

class ApiRepository @Inject constructor(private val apiService: ApiService) {

    suspend fun getTopMovies() = apiService.getTopMovies()
}