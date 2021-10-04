package com.example.swapi.model

data class PagebleModel(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<Any>?,
)