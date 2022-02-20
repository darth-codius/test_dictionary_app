package com.example.myapplication

import retrofit2.Retrofit

object RetrofitProvider {
    private val baseUrl = "https://api.dictionaryapi.dev/api/v2/entries/en/"
    private val instance = Retrofit.Builder().baseUrl(baseUrl).build()

    val wordApi = instance.create(WordApi::class.java)
}