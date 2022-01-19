package com.example.demoviewmodel.viewModel

import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {
    var score = 0
    fun addNumber3(){
        score += 3
    }
    fun addNumber1(){
        score++
    }
}