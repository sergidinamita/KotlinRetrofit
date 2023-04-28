package com.example.retrofit

import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiService
{
    @GET("/0.2/languages")
    suspend fun getLanguages():Response<List<Language>>

    @Headers("Authorization: Bearer 85267430f340ddebfa51a36968968a11")
    @FormUrlEncoded
    @POST("/0.2/detect")
    suspend fun getTextLanguage(@Field("q") text:String):Response<DetectionResponse>
}