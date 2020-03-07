package com.assem.nearbykotlin.data.api

import android.annotation.SuppressLint
import android.location.Location
import com.assem.nearbykotlin.utils.Constants
import com.google.gson.JsonObject
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.TimeUnit

object ApiClient {

    lateinit private var venuesInterface: VenuesInterface
    private var INSTANCE: com.assem.cognitev.nearby.Data.VenuesClient? = null

    private val okHttpClient = OkHttpClient.Builder()
        .connectTimeout(15, TimeUnit.SECONDS)
        .readTimeout(15, TimeUnit.SECONDS)
        .writeTimeout(15, TimeUnit.SECONDS)
        .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
        .build()

    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(Constants.BASE_URL)
        .client(okHttpClient)
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun <T> buildService(serviceType: Class<T>): T {
        return retrofit.create(serviceType)
    }

    fun getVenues(location: Location): Observable<Response<JsonObject?>?>? {
        return venuesInterface
            .getVenues(
                Constants.ID,
                Constants.SECRET,
                location.latitude.toString() + "," + location.longitude,
                Constants.RADIUS_VALUE,
                "20200215"
            )
    }

    fun getVenuePhotos(venueId: String?): Observable<Response<JsonObject?>?>? {
        return venuesInterface
            .getVenuePhotos(
                venueId,
                Constants.ID,
                Constants.SECRET,
                "20200215"
            )
    }

    fun getVenuesRes(location: Location): Observable<PlacesResponse?>? {
        return venuesInterface
            .getVenuesRes(
                Constants.ID,
                Constants.SECRET,
                location.latitude.toString() + "," + location.longitude,
                Constants.RADIUS_VALUE,
                getVersion()
            )
            .toObservable()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
    }

    fun getVenuePhotosRes(venueId: String?): Observable<PhotoResponse?>? {
        return venuesInterface
            .getVenuePhotosRes(
                venueId,
                Constants.ID,
                Constants.SECRET,
                getVersion()
            )
            .toObservable()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
    }

    private fun getVersion(): String? {
        val todayDate = Calendar.getInstance().time
        @SuppressLint("SimpleDateFormat") val formatter =
            SimpleDateFormat("yyyy-MM-dd")
        return formatter.format(todayDate).replace("-", "")
    }
}