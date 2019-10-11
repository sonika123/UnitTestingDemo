package com.example.myapplication

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.regex.Pattern

class EmailValidator : AppCompatActivity(){

    var email_pattern : Pattern? = Pattern.compile(
            "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                    "\\@" +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                    "(" +
                    "\\." +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                    ")+"
    )

    var name = ""
    var email = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        isEmailValid(editTextName.text.toString())
        btnGo.setOnClickListener()
        {
            isNameValid(editTextName.text.toString())

        }
    }

    fun  isValidEmail(email : CharSequence) : Boolean {
        if (email_pattern?.matcher(email)?.matches()!!){
            return true
        }
        else
            return false
    }

    fun isNameValid(name : String) : Boolean
    {
        return name.isNotEmpty()

    }

}