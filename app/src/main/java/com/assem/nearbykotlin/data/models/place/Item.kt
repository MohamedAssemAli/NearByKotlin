package com.assem.nearbykotlin.data.models.place


import com.google.gson.annotations.SerializedName

data class Item(
    @SerializedName("venue")
    val venue: Venue
)