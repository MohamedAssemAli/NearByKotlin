package com.assem.nearbykotlin.data.models.Place


import com.google.gson.annotations.SerializedName

data class PlaceResponse(
    @SerializedName("groups")
    val groups: List<Group>
)