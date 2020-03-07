package com.assem.nearbykotlin.data.models.photo


import com.google.gson.annotations.SerializedName

data class Photos(
    @SerializedName("count")
    val count: Int,
    @SerializedName("items")
    val items: List<Item>
)