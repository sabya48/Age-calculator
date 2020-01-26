package com.example.agecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvAge.setText("")
        btnGetAge.setOnClickListener {
            calculateAge()
        }
    }
    fun calculateAge(){
        val dob:String=etBirth.text.toString()
        val currentyear=Calendar.getInstance().get(Calendar.YEAR)
        val age =currentyear-dob.toInt()
        tvAge.setText("Your Age is $age")
    }

}

