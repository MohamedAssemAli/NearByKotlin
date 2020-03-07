package com.assem.nearbykotlin.data.models.place


import com.assem.nearbykotlin.data.models.photo.Photo
import com.google.gson.annotations.SerializedName

data class Venue(

    @SerializedName("id")
    val id: String,
    @SerializedName("location")
    val location: Location,
    @SerializedName("name")
    val name: String,
    val photo: Photo
)