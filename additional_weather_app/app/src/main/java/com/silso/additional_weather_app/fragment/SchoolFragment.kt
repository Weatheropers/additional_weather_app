package com.silso.additional_weather_app.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.silso.additional_weather_app.adapter.MainViewAdapter

import com.silso.additional_weather_app.R
import com.silso.additional_weather_app.adapter.SchoolAdapter
import kotlinx.android.synthetic.main.fragment_school.*

class SchoolFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_school, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val lim = LinearLayoutManager(activity)
        lim.orientation = LinearLayoutManager.VERTICAL
        school_fragment_recyclerView.layoutManager = lim
        school_fragment_recyclerView.adapter = SchoolAdapter()
    }
}