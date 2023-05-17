package com.example.navigationcomponent.ui.start

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationcomponent.R
import com.example.navigationcomponent.databinding.FragmentStartBinding

class StartFragment : Fragment() {
    private val binding = FragmentStartBinding.inflate(layoutInflater)
    private lateinit var listener: OnButtonClicked

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?, ): View? {

        return inflater.inflate(R.layout.fragment_start, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonNext.setOnClickListener {
            listener.buttonClickd()
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnButtonClicked) {
            listener = context
        }
    }

    companion object {
        fun newInstance(): StartFragment {
            return StartFragment()
        }
    }

    interface OnButtonClicked {
        fun buttonClickd()
    }
}