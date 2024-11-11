package com.example.assignment3_p2.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.assignment3_p2.R
import com.example.assignment3_p2.viewmodel.SharedViewModel

class OutputFragment : Fragment() {

    private lateinit var sharedViewModel: SharedViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_output, container, false)
        sharedViewModel = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)

        val textView = view.findViewById<TextView>(R.id.output_text)
        sharedViewModel.sharedText.observe(viewLifecycleOwner, Observer { text ->
            textView.text = text
        })
        return view
    }
}
