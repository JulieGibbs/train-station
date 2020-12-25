package com.example.trainstationapp.data.models

import com.squareup.moshi.JsonClass

/**
 * Pagination model from the API.
 */
@JsonClass(generateAdapter = true)
data class Paginated<out T>(
    val data: List<T>,
    val count: Int,
    val total: Int,
    val page: Int,
    val pageCount: Int,
)