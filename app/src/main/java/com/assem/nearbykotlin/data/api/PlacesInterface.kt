package com.assem.nearbykotlin.data.api

import com.assem.nearbykotlin.data.models.place.Place
import com.assem.nearbykotlin.data.models.place.PlaceResponse
import com.assem.nearbykotlin.utils.Constants
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface PlacesInterface {

    @GET("venues/explore")
    fun getPlaces(
        @Query(Constants.CLIENT_ID) clientId: String,
        @Query(Constants.CLIENT_SECRET) clientSecret: String,
        @Query(Constants.LL) location: String,
        @Query(Constants.RADIUS) radius: String,
        @Query(Constants.VERSION) version: String
    ): Single<PlaceResponse>

}