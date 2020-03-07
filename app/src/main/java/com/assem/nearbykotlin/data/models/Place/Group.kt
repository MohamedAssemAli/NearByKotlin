package com.assem.nearbykotlin.data.models.Place


import com.google.gson.annotations.SerializedName

data class Group(
    @SerializedName("items")
    val items: List<Item>
)