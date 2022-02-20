package com.example.myapplication

import com.example.myapplication.models.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface WordApi {
    @GET("{word}")
    suspend fun getWordDef(@Path("word") word: String): Response
}