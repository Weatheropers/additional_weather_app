package com.silso.additional_weather_app.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.silso.additional_weather_app.R

class SchoolAdapter: RecyclerView.Adapter<SchoolAdapter.ViewHolder>() {
    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.school_list_item, parent, false))
    }
    override fun getItemCount(): Int = 4
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {}
}