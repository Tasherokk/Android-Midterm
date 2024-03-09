package com.example.aviatickets.model
import androidx.recyclerview.widget.DiffUtil
import com.example.aviatickets.model.entity.Offer

class OfferItemCallback : DiffUtil.ItemCallback<Offer>() {

    override fun areItemsTheSame(oldItem: Offer, newItem: Offer): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Offer, newItem: Offer): Boolean {
        return oldItem.price == newItem.price && oldItem.flight == newItem.flight
    }
}