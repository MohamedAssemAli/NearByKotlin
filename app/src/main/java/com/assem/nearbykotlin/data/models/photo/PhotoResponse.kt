package com.assem.nearbykotlin.data.models.photo

import com.google.gson.annotations.SerializedName

data class PhotoResponse(
    @SerializedName("response")
    val photo: Photo
)