package com.assem.nearbykotlin.data.models.photo


import com.google.gson.annotations.SerializedName

data class Item(
    @SerializedName("prefix")
    val prefix: String,
    @SerializedName("suffix")
    val suffix: String,
    @SerializedName("width")
    val width: Int,
    @SerializedName("height")
    val height: Int
)