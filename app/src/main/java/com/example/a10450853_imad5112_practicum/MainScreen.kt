package com.example.a10450853_imad5112_practicum

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
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
    private var days = ArrayList<String>()
    private var minTemperature = ArrayList<Int>()
    private var maxTemperature = ArrayList<Int>()
    private var weatherCondition = ArrayList<String>()


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





    }
}