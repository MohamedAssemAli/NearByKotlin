package com.assem.nearbykotlin.data.models.photo


import com.google.gson.annotations.SerializedName

data class Photo(
    @SerializedName("photos")
    val photos: Photos
)