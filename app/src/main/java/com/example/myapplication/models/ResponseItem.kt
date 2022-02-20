package com.example.myapplication.models

data class ResponseItem(
    val meanings: List<MeaningDTO>,
    val word: String,
    val origin: String?
)