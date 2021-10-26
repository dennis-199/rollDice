package com.example.rolldice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var count=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonToast: Button = findViewById(R.id.button_toast)
        buttonToast.setOnClickListener { showToast() }

        val buttonRoll: Button = findViewById(R.id.button_roll)
        buttonRoll.setOnClickListener { rollDice() }

        val buttonCount: Button = findViewById(R.id.button_count)
        buttonCount.setOnClickListener { onTouch() }


    }

    private fun onTouch() {
        val counttext: TextView = findViewById(R.id.text_result)
        val stringVal = counttext.text.toString()

        var countResult: Int = stringVal.toInt()
        countResult++

        counttext.text = countResult.toString()
    }

    private fun showToast(){
        Toast.makeText(this, "Ooh my, you have toasted me", Toast.LENGTH_SHORT).show()
    }
    private fun rollDice(){
        val generatedRandom = (1..6).random()

        val textviewresult: TextView = findViewById(R.id.text_result)
        textviewresult.text = generatedRandom.toString()
    }


}