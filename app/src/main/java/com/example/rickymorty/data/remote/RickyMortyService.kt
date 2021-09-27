package com.example.rickymorty.data.remote

import com.example.rickymorty.data.model.RickMortyLocations
import retrofit2.http.GET
import retrofit2.http.Query

interface RickyMortyService {
    @GET("/api/character/")
    fun retrieveCharacters(@Query("page") page: Int)


    @GET("/api/location/")
    fun retrieveLocations(): RickMortyLocations

}