package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity

class Calculation : AppCompatActivity() {

    fun add(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    fun subtract(num1: Int, num2: Int): Int {
        return num1 - num2
    }
}