package com.example.assignment3_p2.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.assignment3_p2.R
import com.example.assignment3_p2.viewmodel.SharedViewModel

class InputFragment : Fragment() {

    private lateinit var sharedViewModel: SharedViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_input, container, false)
        sharedViewModel = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)

        val editText = view.findViewById<EditText>(R.id.input_text)
        editText.addTextChangedListener { text ->
            sharedViewModel.updateText(text.toString())
        }
        return view
    }
}
