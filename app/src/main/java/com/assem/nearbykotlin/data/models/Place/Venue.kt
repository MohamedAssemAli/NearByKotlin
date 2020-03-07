package com.assem.nearbykotlin.data.models.Place


import com.google.gson.annotations.SerializedName

data class Venue(

    @SerializedName("id")
    val id: String,
    @SerializedName("location")
    val location: Location,
    @SerializedName("name")
    val name: String
    )