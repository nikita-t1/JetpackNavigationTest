package com.example.jetpacknavigationtest.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NewViewModel : ViewModel() {


    private val _text = MutableLiveData<String>().apply {
        value = "New Fragment"
    }
    val text: LiveData<String> = _text
}

