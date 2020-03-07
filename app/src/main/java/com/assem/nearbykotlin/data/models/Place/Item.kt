package com.assem.nearbykotlin.data.models.Place


import com.google.gson.annotations.SerializedName

data class Item(
    @SerializedName("venue")
    val venue: Venue
)