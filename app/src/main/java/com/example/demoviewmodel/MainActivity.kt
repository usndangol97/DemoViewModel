package com.example.demoviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.demoviewmodel.databinding.ActivityMainBinding
import com.example.demoviewmodel.viewModel.MainActivityViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        binding.textViewScore.text = viewModel.score.toString()

        binding.buttonAdd3.setOnClickListener{
            viewModel.addNumber3()
            binding.textViewScore.text = viewModel.score.toString()
        }

        binding.buttonAdd1.setOnClickListener{
            viewModel.addNumber1()
            binding.textViewScore.text = viewModel.score.toString()
        }
    }
}