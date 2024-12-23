package com.example.authorlisst.model

import com.google.gson.annotations.SerializedName

data class ApiData(
    @SerializedName("id")
    val id: Int,

    @SerializedName("name")
    val name: String,

    @SerializedName("status")
    val status: String,

    @SerializedName("species")
    val species: String,

    @SerializedName("gender")
    val gender: String

)
