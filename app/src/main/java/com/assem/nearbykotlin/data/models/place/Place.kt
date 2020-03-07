package com.assem.nearbykotlin.data.models.place


import com.google.gson.annotations.SerializedName

data class Place(
    @SerializedName("groups")
    val groups: List<Group>
)