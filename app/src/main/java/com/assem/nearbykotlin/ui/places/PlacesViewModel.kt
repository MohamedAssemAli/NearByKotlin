package com.assem.nearbykotlin.ui.places

import android.annotation.SuppressLint
import android.location.Location
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.assem.nearbykotlin.data.api.ApiClient
import com.assem.nearbykotlin.data.api.PlacePhotoInterface
import com.assem.nearbykotlin.data.api.PlacesInterface
import com.assem.nearbykotlin.data.models.place.Item
import com.assem.nearbykotlin.utils.Constants
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import java.text.SimpleDateFormat
import java.util.*


class PlacesViewModel : ViewModel() {

    var places = MutableLiveData<List<Item>>()

    var location = Location("")

    init {
        location.latitude = 29.978391
        location.longitude = 30.954928
    }

    fun getPlaces() {
        ApiClient.buildService(PlacesInterface::class.java)
            .getPlaces(
                Constants.ID,
                Constants.SECRET,
                location.latitude.toString() + "," + location.getLongitude(),
                Constants.RADIUS_VALUE,
                getVersion()
            )
            .map {
                places.value = it.place.groups[0].items
                Log.d("hahaha", "" + places.value!!.get(0).venue.name + "\n")
            }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
    }

    fun getPhotos(venueId: String) {
        ApiClient.buildService(PlacePhotoInterface::class.java)
            .getVenuePhotos(
                venueId,
                Constants.ID,
                Constants.SECRET,
                getVersion()
            )
            .subscribeOn(Schedulers.io());
    }

//    private fun showPlaces(response: PlacesResponse) {
//        places.postValue(response.getResponse().getGroups().get(0).getItems())
//    }


    private fun getVersion(): String {
        val todayDate = Calendar.getInstance().time
        @SuppressLint("SimpleDateFormat") val formatter =
            SimpleDateFormat("yyyy-MM-dd")
        return formatter.format(todayDate).replace("-", "")
    }
}