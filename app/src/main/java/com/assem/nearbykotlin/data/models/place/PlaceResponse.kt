package com.assem.nearbykotlin.data.models.place

import com.google.gson.annotations.SerializedName

data class PlaceResponse(
    @SerializedName("response")
    val place: Place
)
