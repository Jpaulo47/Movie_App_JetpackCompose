package com.joaorodrigues.movieapp_jetpackcompose.core.response

import com.google.gson.annotations.SerializedName
import com.joaorodrigues.movieapp_jetpackcompose.core.model.MovieResult

data class MovieResponse(
    @SerializedName("page")
    val page: Int,
    @SerializedName("results")
    val results: List<MovieResult>,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("total_results")
    val totalResults: Int
)