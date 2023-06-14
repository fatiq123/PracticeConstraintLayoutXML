package com.example.constraintlayoutpracticexml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var firstName: EditText
    lateinit var lastName: EditText
    lateinit var birthDate: EditText
    lateinit var country: EditText
    lateinit var button: Button
    lateinit var result: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        firstName = findViewById(R.id.etFirstName)
        lastName = findViewById(R.id.etLastName)
        birthDate = findViewById(R.id.etBirthDate)
        country = findViewById(R.id.etCountry)
        button = findViewById(R.id.btnApply)
        result = findViewById(R.id.tvShowResult)        // to display information on screen of type TextView

        button.setOnClickListener{
            val fname = firstName.text.toString()
            val lname = lastName.text.toString()
            val birth = birthDate.text.toString()
            val country = country.text.toString()

            Log.d("MainActivity","$fname,$lname born on $birth in country $country")     // for checking activity on Log Cat

            val information = "Name is $fname $lname, born on $birth in Country $country"
            result.text = information
            result.display

        }

    }
}
