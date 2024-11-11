package com.example.assignment3_p2.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {
    private val _sharedText = MutableLiveData<String>()
    val sharedText: LiveData<String> get() = _sharedText

    fun updateText(newText: String) {
        _sharedText.value = newText
    }
}
