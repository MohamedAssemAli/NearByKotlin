package com.assem.nearbykotlin.data.models.place


import com.google.gson.annotations.SerializedName

data class Group(
    @SerializedName("items")
    val items: List<Item>
)