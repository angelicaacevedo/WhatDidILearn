package com.example.whatdidilearn.view

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.whatdidilearn.entities.itemLearned

class LearnedItemsAdapter: RecyclerView.Adapter<LearnedItemsAdapter.LearnedItemsViewHolder>() {
    var data = listOf<itemLearned>()
    inner class LearnedItemsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LearnedItemsViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: LearnedItemsViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}