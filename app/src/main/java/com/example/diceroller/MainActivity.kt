package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val countupButton: Button = findViewById(R.id.countup_button)
        countupButton.setOnClickListener { countUp() }



    }
    private fun rollDice() {
//        Toast.makeText(this, "button clicked",
//            Toast.LENGTH_SHORT).show()
        val randomInt = (1..6).random()

        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()


    }

    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)

        //resultText에 아직 숫자가 없으면, 즉 처음 Hello 상태이면 resultText는 1로 설정
        if (resultText.text == "Hello!") {
            resultText.text = "1"
        } else {
            var resultInt = resultText.text.toString().toInt() //문자열로 변환

            if(resultInt < 6) {
                resultInt++
                resultText.text = resultInt.toString()
            }

        }

    }

}