package com.example.a10450853_imad5112_practicum

import android.content.Intent
import android.health.connect.datatypes.units.Temperature
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailedViewScreen : AppCompatActivity() {

    private lateinit var infoTextView: TextView
    private lateinit var avgTempTextView: TextView
    private lateinit var homeButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailed_view_screen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        infoTextView = findViewById(R.id.infoTextView)
        avgTempTextView = findViewById(R.id.avgTempTextView)
        homeButton = findViewById(R.id.homeButton)

        homeButton.setOnClickListener {
            val intent = Intent(this, MainScreen::class.java)
            startActivity(intent)
            finish()
        }

        val days = intent.getStringArrayListExtra("weekDays") ?: arrayListOf()
        val minTemperature = intent.getIntegerArrayListExtra("minTemperatureList") ?: arrayListOf()
        val maxTemperature = intent.getIntegerArrayListExtra("maxTemperatureList") ?: arrayListOf()
        val weatherCondition = intent.getStringArrayListExtra("weatherConditionList") ?: arrayListOf()

        val information = StringBuilder()
        var totalTemperature = 0

        for (i in days.indices ){
            information.append("${days[i]}: Minimum Temperature - ${minTemperature[i]} degrees," +
                    "Maximum Temperature - ${maxTemperature[i]} degrees," +
                    " Weather Condition - ${weatherCondition[i]}\n")
            totalTemperature += maxTemperature[i] + minTemperature[i]
        }

        val averageTemperature = if (days.isNotEmpty()) totalTemperature / days.size else 0

        infoTextView.text = information.toString()
        avgTempTextView.text = "The average temperature for the week has been $averageTemperature degrees"


    }
}