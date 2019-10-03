package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
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



    fun  isValidEmail(email : CharSequence) : Boolean {
        return email != null && email_pattern?.matcher(email)?.matches()!!;
    }
}