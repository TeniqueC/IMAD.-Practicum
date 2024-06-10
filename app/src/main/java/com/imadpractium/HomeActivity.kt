package com.imadpractium

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class HomeActivity : AppCompatActivity() {

    private lateinit var buttonNext: Button
    private val dayArray = mutableListOf<String>()
    private val minTempArray = mutableListOf<Float>()
    private val maxTempArray = mutableListOf<Float>()
    private val weatherConditionArray = mutableListOf<String>()

    private lateinit var etDay: EditText
    private lateinit var etMinTemp: EditText
    private lateinit var etMaxTemp: EditText
    private lateinit var etWeatherCondition: EditText
    private lateinit var tvMessage: TextView

    private lateinit var buttonSave: Button
    private lateinit var buttonClear: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Initialize views
        buttonClear = findViewById(R.id.buttonClear)
        buttonNext = findViewById(R.id.buttonNext)
        etDay = findViewById(R.id.etDay)
        etMinTemp = findViewById(R.id.etMinTemp)
        etMaxTemp = findViewById(R.id.etMaxTemp)
        etWeatherCondition = findViewById(R.id.etWeatherCondition)
        buttonSave = findViewById(R.id.buttonSave)
        tvMessage = findViewById(R.id.tvMessage)

        // Clear button functionality
        buttonClear.setOnClickListener {
            etDay.setText("")
            etMinTemp.setText("")
            etMaxTemp.setText("")
            etWeatherCondition.setText("")
        }

        // Save button functionality
        buttonSave.setOnClickListener {
            val day = etDay.text.toString()
            val minTemp = etMinTemp.text.toString()
            val maxTemp = etMaxTemp.text.toString()
            val weatherCondition = etWeatherCondition.text.toString()

            if (day.isNotEmpty() && minTemp.isNotEmpty() && maxTemp.isNotEmpty()) {
                try {
                    dayArray.add(day)
                    minTempArray.add(minTemp.toFloat())
                    maxTempArray.add(maxTemp.toFloat())
                    weatherConditionArray.add(weatherCondition)

                    etDay.text.clear()
                    etMinTemp.text.clear()
                    etMaxTemp.text.clear()
                    etWeatherCondition.text.clear()
                    tvMessage.text = ""
                } catch (e: NumberFormatException) {
                    tvMessage.text = "Please enter valid numbers for temperatures"
                }
            } else {
                tvMessage.text = "Input cannot be empty"
            }
        }

        // Next button functionality
        buttonNext.setOnClickListener {
            val intent = Intent(this, DetailedViewActivity::class.java).apply {
                putExtra("DayArray", dayArray.toTypedArray())
                putExtra("MinTempArray", minTempArray.toFloatArray())
                putExtra("MaxTempArray", maxTempArray.toFloatArray())
                putExtra("WeatherConditionArray", weatherConditionArray.toTypedArray())
            }
            startActivity(intent)
        }
    }
}