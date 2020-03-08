package com.assem.nearbykotlin.ui.places

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.assem.nearbykotlin.R
import kotlinx.android.synthetic.main.activity_places.*

class PlacesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_places)
        val placesViewModel = ViewModelProviders.of(this).get(PlacesViewModel::class.java)
        placesViewModel.getPlaces()
//        placesViewModel.places.observe(this, Observer {
//            places_recycler_view.adapter = PlacesAdapter(it)
//        })

    }
}
