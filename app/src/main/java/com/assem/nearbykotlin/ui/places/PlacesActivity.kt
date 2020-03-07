package com.assem.nearbykotlin.ui.places

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.assem.nearbykotlin.R

class PlacesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_places)
        val placesViewModel = ViewModelProviders.of(this).get(PlacesViewModel::class.java)
        placesViewModel.getPlaces()
    }
}
