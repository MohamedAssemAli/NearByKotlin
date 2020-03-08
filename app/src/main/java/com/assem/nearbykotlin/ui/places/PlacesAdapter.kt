package com.assem.nearbykotlin.ui.places

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.assem.nearbykotlin.R
import com.assem.nearbykotlin.data.models.place.Item
import java.util.*

class PlacesAdapter(private var placesList: List<Item>) :
    RecyclerView.Adapter<PlacesAdapter.PlaceViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_place, parent, false)
        return PlaceViewHolder(view)
    }

    override fun onBindViewHolder(holder: PlaceViewHolder, position: Int) {
        val itemModel: Item = placesList.get(position)
        holder.placeTitle.setText(itemModel.venue.name)
        holder.placeAddress.setText(itemModel.venue.location.formattedAddress.toString())
    }

    override fun getItemCount(): Int {
        return placesList.size
    }

    class PlaceViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val placeTitle: TextView = itemView.findViewById(R.id.item_place_title)
        val placeAddress: TextView = itemView.findViewById(R.id.item_place_address)
        val placeImg: ImageView = itemView.findViewById(R.id.item_place_image)
    }

    fun setList(itemsArrayList: List<Item>) {
        placesList = itemsArrayList
        notifyDataSetChanged()
    }

    fun updatePlace(item: Item) {
//        placesList.set(placesList.indexOf(item), item)
//        notifyItemChanged(placesList.indexOf(item))
    }

    fun clearList(itemsArrayList: ArrayList<Item?>) {
        itemsArrayList.clear()
        notifyDataSetChanged()
    }
}