package com.example.jetpacknavigationtest.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.jetpacknavigationtest.R
import com.example.jetpacknavigationtest.ui.home.HomeViewModel

class NewFragment : Fragment() {

    private lateinit var newViewModel: NewViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        newViewModel =
            ViewModelProviders.of(this).get(NewViewModel::class.java)
        val root = inflater.inflate(R.layout.new_fragment, container, false)
        val textView: TextView = root.findViewById(R.id.textView)
        newViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}