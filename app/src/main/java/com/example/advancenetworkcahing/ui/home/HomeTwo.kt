package com.example.advancenetworkcahing.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.advancenetworkcahing.R


class HomeTwo : Fragment(R.layout.fragment_home_two) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        val textview: TextView = view.findViewById(R.id.homeTwo)

        textview.setOnClickListener {
            findNavController().navigate(R.id.action_homeTwo_to_homeThree)
        }



    }

}