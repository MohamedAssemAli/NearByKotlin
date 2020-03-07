package com.assem.nearbykotlin.data.api

import com.assem.nearbykotlin.data.models.photo.Photo
import com.assem.nearbykotlin.data.models.photo.PhotoResponse
import com.assem.nearbykotlin.utils.Constants
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PlacePhotoInterface {

    @GET("venues/{venue_id}/photos")
    fun getVenuePhotos(
        @Path(Constants.VENUE_ID) venueId: String,
        @Query(Constants.CLIENT_ID) clientId: String,
        @Query(Constants.CLIENT_SECRET) clientSecret: String,
        @Query(Constants.VERSION) version: String
    ): Single<PhotoResponse>
}