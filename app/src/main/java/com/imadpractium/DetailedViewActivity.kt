package com.imadpractium

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.IMADPractium1.R

class DetailedViewActivity : AppCompatActivity() {

    private lateinit var tvDetails: TextView
    private lateinit var tvMinTemp: TextView
    private lateinit var tvMaxTemp: TextView
    private lateinit var tvWeatherCondition: TextView
    private lateinit var tvAverageTemperature: TextView
    private lateinit var btnBack: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_view)

        // Initialize views
        btnBack = findViewById(R.id.btn_back)
        tvDetails = findViewById(R.id.tv_Details)
        tvMinTemp = findViewById(R.id.tv_MinTemp)
        tvMaxTemp = findViewById(R.id.tv_MaxTemp)
        tvWeatherCondition = findViewById(R.id.tv_WeatherCondition)
        tvAverageTemperature = findViewById(R.id.tv_AverageTemperature)

        // Retrieve intent extras
        val dayArray = intent.getStringArrayExtra("DayArray")?.toList() ?: emptyList()
        val minTempArray = intent.getFloatArrayExtra("MinTempArray")?.toList() ?: emptyList()
        val maxTempArray = intent.getFloatArrayExtra("MaxTempArray")?.toList() ?: emptyList()
        val weatherConditionArray = intent.getStringArrayExtra("WeatherConditionArray")?.toList() ?: emptyList()

        // Build and display strings for each category
        val dayDetails = StringBuilder()
        for ((index, day) in dayArray.withIndex()) {
            dayDetails.append("Day ${index + 1}: $day\n")
        }

        val minTempDetails = StringBuilder()
        for ((index, temp) in minTempArray.withIndex()) {
            minTempDetails.append("Min Temperature ${index + 1}: $temp°C\n")
        }

        val maxTempDetails = StringBuilder()
        for ((index, temp) in maxTempArray.withIndex()) {
            maxTempDetails.append("Max Temperature ${index + 1}: $temp°C\n")
        }

        val weatherConditionDetails = StringBuilder()
        for ((index, condition) in weatherConditionArray.withIndex()) {
            weatherConditionDetails.append("Condition ${index + 1}: $condition\n")
        }

        // Set text in TextViews
        tvDetails.text = dayDetails.toString()
        tvMinTemp.text = minTempDetails.toString()
        tvMaxTemp.text = maxTempDetails.toString()
        tvWeatherCondition.text = weatherConditionDetails.toString()

        // Calculate the average temperature for the week
        val totalTemps = minTempArray.size + maxTempArray.size
        val totalTempSum = minTempArray.sum() + maxTempArray.sum()
        val averageTemperature = if (totalTemps != 0) totalTempSum / totalTemps else 0f

        // Display average temperature
        tvAverageTemperature.text = "Average Temperature: %.2f°C".format(averageTemperature)

        // Set up back button
        btnBack.setOnClickListener { finish() }
    }
}