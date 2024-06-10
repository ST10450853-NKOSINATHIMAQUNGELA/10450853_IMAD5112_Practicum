package com.example.a10450853_imad5112_practicum

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.util.LocalePreferences.FirstDayOfWeek.Days
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainScreen : AppCompatActivity() {
    private lateinit var dayEditText: EditText
    private lateinit var minTempEditText: EditText
    private lateinit var maxTempEditText: EditText
    private lateinit var conditionEditText: EditText
    private val weekDay = ArrayList<String>()
    private val minTemperatureList = ArrayList<Int>()
    private val maxTemperatureList = ArrayList<Int>()
    private val weatherConditionList = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_screen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        dayEditText = findViewById(R.id.dayEditText)
        minTempEditText = findViewById(R.id.minTempEditText)
        maxTempEditText = findViewById(R.id.maxTempEditText)
        conditionEditText = findViewById(R.id.conditionEditText)

        val detailedViewButton: Button = findViewById(R.id.detailedViewScreen)
        val addButton: Button = findViewById(R.id.addButton)
        val clearButton: Button = findViewById(R.id.clearButton)
        val exitButton: Button = findViewById(R.id.exitButtonSecondScreen)

        exitButton.setOnClickListener {
            finish()
        }

        addButton.setOnClickListener {
            addInfo()
        }

        clearButton.setOnClickListener {
            clearInformation()
        }

        detailedViewButton.setOnClickListener {
            val intent = Intent(this, DetailedViewScreen::class.java)
            startActivity(intent)
            finish()
        }



    }

    private fun addInfo() {
        val days = dayEditText.text.toString()
        val minTemperature = minTempEditText.text.toString().toIntOrNull()
        val maxTemperature = maxTempEditText.text.toString().toIntOrNull()
        val weatherCondition = conditionEditText.text.toString()

        if (days.isNotEmpty() && minTemperature != null && maxTemperature != null){

            weekDay.add(days)
            minTemperatureList.add(minTemperature)
            maxTemperatureList.add(maxTemperature)
            weatherConditionList.add(weatherCondition)

            dayEditText.text.clear()
            minTempEditText.text.clear()
            maxTempEditText.text.clear()
            conditionEditText.text.clear()


            Toast.makeText(this, "Information added", Toast.LENGTH_SHORT).show()

        }
        else
        {
            Toast.makeText(this, "Please enter all information correctly", Toast.LENGTH_SHORT).show()
        }

    }

    private fun clearInformation(){

        weekDay.clear()
        minTemperatureList.clear()
        maxTemperatureList.clear()
        weatherConditionList.clear()

        dayEditText.text.clear()
        minTempEditText.text.clear()
        maxTempEditText.text.clear()
        conditionEditText.text.clear()

        Toast.makeText(this, "Information successfully cleared", Toast.LENGTH_SHORT).show()

    }

}