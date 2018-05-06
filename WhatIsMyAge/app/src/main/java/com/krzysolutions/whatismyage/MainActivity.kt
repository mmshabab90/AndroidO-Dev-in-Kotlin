package com.krzysolutions.whatismyage

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findAgeBtn.setOnClickListener{
            //fire following actions when button is clicked
            val yearOfBirth:Int = yearTxt.text.toString().toInt()
            //get system current year
            val currentYear = Calendar.getInstance().get(Calendar.YEAR)
            //calculate year
            if (yearOfBirth<currentYear){
                val myAge = currentYear - yearOfBirth
                //display age
                ageTxtVw.text = "Your are $myAge years old"
            } else {
                ageTxtVw.text = "You are not born yet! OR You are a time traveller!"
            }

        }
    }

}
