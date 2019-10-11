package com.example.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.calculator_activity.*

class CalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculator_activity)

        var num1 = editTextNum1.editableText
        var num2 = editTextNum2.editableText


        buttonAdd.setOnClickListener() {
            addNumbers(1, 2)
        }


    }

    fun addNumbers(num1: Int, num2: Int): Int {

        var total = num1 + num2
//        Toast.makeText(this, total.toString(), Toast.LENGTH_LONG).show()

        return num1 + num2
    }

}