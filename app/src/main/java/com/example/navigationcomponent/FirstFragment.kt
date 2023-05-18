package com.example.navigationcomponent

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponent.model.User

class FirstFragment : Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.tv_id).setOnClickListener {

            val action = FirstFragmentDirections.fromFirstFragmentToSecondFragment(
                User(
                "Alan",
                23,
                "Olá"
            ))
            findNavController().navigate(action)
        }

    }

}