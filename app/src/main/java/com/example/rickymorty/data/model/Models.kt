package com.example.rickymorty.data.model

import com.google.gson.annotations.SerializedName

data class RickMortyLocations(
    @SerializedName("info")
    val info: Info,
    @SerializedName("info")
    val locations: List<Locations>
)

data class Info(
    @SerializedName("info")
    val count: Int,
    @SerializedName("info")
    val next: String? = null,
    @SerializedName("info")
    val pages: Int,
    @SerializedName("info")
    val prev: String? = null
)


data class Locations(
    @SerializedName("info")
    val created: String,
    @SerializedName("info")
    val dimension: String,
    @SerializedName("info")
    val id: Int,
    @SerializedName("info")
    val name: String,
    @SerializedName("info")
    val residents: List<String>,
    @SerializedName("info")
    val type: String,
    @SerializedName("info")
    val url: String
)


data class Characters(
    @SerializedName("info")
    val info: Info,
    @SerializedName("info")
    val characters: List<Character>
)


data class Character(
    @SerializedName("info")
    val created: String,
    @SerializedName("info")
    val episode: List<String>,
    @SerializedName("info")
    val gender: String,
    @SerializedName("info")
    val id: Int,
    @SerializedName("info")
    val image: String,
    @SerializedName("info")
    val location: Location,
    @SerializedName("info")
    val name: String,
    @SerializedName("info")
    val origin: Origin,
    @SerializedName("info")
    val species: String,
    @SerializedName("info")
    val status: String,
    @SerializedName("info")
    val type: String,
    @SerializedName("info")
    val url: String
)


data class Location(
    @SerializedName("info")
    val name: String,
    @SerializedName("info")
    val url: String
)


data class Origin(
    @SerializedName("info")
    val name: String,
    @SerializedName("info")
    val url: String
)