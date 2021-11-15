package com.yah.dog_api.api

import com.squareup.moshi.Json

data class ApiData (
    @Json(name = "message")
    val url: String,
    @Json(name = "status")
    val status: String
//    val status: String,
//    val message: String

        )