package com.example.advancenetworkcahing.ui.home

import android.os.Bundle

import androidx.fragment.app.Fragment
import android.view.View

import android.widget.TextView

import androidx.navigation.fragment.findNavController
import com.example.advancenetworkcahing.R


class HomeOne : Fragment(R.layout.fragment_home_one) {

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)

            val textview = view.findViewById<TextView>(R.id.homeOneText)

            textview.setOnClickListener {
                findNavController().navigate(R.id.action_homeOne_to_homeTwo)
            }



        }
    }
