package com.example.architecture

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var numberTextView: TextView

    val viewModel: GeneratorViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        numberTextView = findViewById(R.id.textView)
        setupObservers()
    }

    private fun setupObservers() {
        viewModel.showError.observe(this, EventObserver { Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show() })
        viewModel.nextNumber.observe(this) { number ->
            numberTextView.text = number.toString()
        }
    }

    fun generate(view: View) {
        viewModel.generateNewNumber()
    }
}