package com.example.navigationcomponent

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class SecondFragment : Fragment(R.layout.fragment_second) {

    private val args : SecondFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.tv_id2).text = "${args.user.name} ${args.user.age} ${args.user.description}"

        view.findViewById<TextView>(R.id.tv_id2).setOnClickListener {
            findNavController().navigate(R.id.fromSecondFragment_to_FirstFragment)
        }
    }
}