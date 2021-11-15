package com.yah.dog_api.api

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

//const val BASE_URL = "https://dog.ceo/api/breeds/image/random"
//Do this everytime you reference retrofit, code starter
const val BASE_URL = "https://dog.ceo/api/"
private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()


interface ApiRequest {
    @GET("breeds/image/random")
    suspend fun getRandomDog(): ApiData
}
//Instanciation
object DogApi  {
    val retrofitService: ApiRequest by lazy { retrofit.create(ApiRequest::class.java) }
}